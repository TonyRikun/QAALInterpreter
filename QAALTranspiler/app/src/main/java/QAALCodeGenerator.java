import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;


public class QAALCodeGenerator extends AbstractParseTreeVisitor<String> implements QAALVisitor<String> {
    private HashMap<String, Integer> varsParams = new HashMap<>();
    private HashMap<String, Types> localIdfrs = new HashMap<>();
    private HashMap<String, Types> globalIdfrs = new HashMap<>();

    private Types varType(String name){
        if (globalIdfrs.containsKey(name)) return globalIdfrs.get(name);
        if (localIdfrs.containsKey(name)) return localIdfrs.get(name);
        else throw new TypeException().undefinedVarError();
    }

    @Override
    public String visitProg(QAALParser.ProgContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("#include <QuEST.h>\n" +
                "#include <stdio.h>\n" +
                "#include <cmath>\n" +
                "using namespace std;\n" +
                "template <size_t N>\n" +
                "bool isZero(std::array<int, N> myArr) {\n" +
                "\tfor(int i = 0; i < myArr.size(); i++) {\n" +
                "\t\tif(myArr[i] != 0) {\n" +
                "\t\t\treturn false;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "return true;\n" +
                "}\n");
        for (QAALParser.Subroutines_decContext sub : ctx.dec().subroutines_dec()){
            sb.append(visit(sub));
        }
        sb.append("\n" +
                "int main() {\n" +
                "\n" +
                "QuESTEnv env = createQuESTEnv();\n");
        for (QAALParser.Additional_regContext reg : ctx.dec().additional_reg()){
            sb.append(visit(reg));
        }
        sb.append(visit(ctx.body()));
        for (QAALParser.OutputContext out : ctx.output()){
            sb.append(visit(out));
        }
        sb.append("destroyQuESTEnv(env);\n" +
                "  return 0;\n" +
                "}");
        return sb.toString();
    }

    @Override
    public String visitDec(QAALParser.DecContext ctx) {
        throw new RuntimeException("Shouldn't be here!");
    }

    @Override
    public String visitBody(QAALParser.BodyContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (QAALParser.Cs_decContext cs : ctx.cs_dec()){
            sb.append(visit(cs));
        }
        for (QAALParser.ExpContext exp : ctx.exp()) {
            sb.append(visit(exp));
        }
        return sb.toString();
    }

    @Override
    public String visitOutput(QAALParser.OutputContext ctx) {
        return "";
    }

    @Override
    public String visitAdditional_reg(QAALParser.Additional_regContext ctx) {
        String regName;
        if (ctx.bit_dec() != null) {
            regName = ctx.bit_dec().Idfr().getText();
            if (ctx.Operand() == null) {
                if (!(ctx.getParent() instanceof QAALParser.DecContext)) {
                    localIdfrs.put(regName, ctx.bit_dec().Bit() != null ? Types.BIT : Types.QUBIT);
                }
                else{
                    globalIdfrs.put(regName, ctx.bit_dec().Bit() != null ? Types.BIT : Types.QUBIT); //Need globalIdfrs to destroy quregs
                }
                return visit(ctx.bit_dec());
            }
            else {
                localIdfrs.put(regName, ctx.bit_dec().Bit() != null ? Types.BIT : Types.QUBIT);
                return "";
            }
        } else {
            regName = ctx.reg_dec().Idfr().getText();
            if (ctx.Operand() == null) {
                if (!(ctx.getParent() instanceof QAALParser.DecContext)) {
                    localIdfrs.put(regName, ctx.reg_dec().Bits() != null ? Types.REG : Types.QREG); //Cannot change that to string (instead of types) - when building function signature
                }                                                                                   //parameters of type int[] and Qureg ar built in different ways
                else{
                    globalIdfrs.put(regName, ctx.reg_dec().Bits() != null ? Types.REG : Types.QREG);
                }
                return visit(ctx.reg_dec());
            }
            else {
                localIdfrs.put(regName, ctx.reg_dec().Bits() != null ? Types.REG : Types.QREG);
                return "";
            }
        }
    }

    @Override
    public String visitSubroutines_dec(QAALParser.Subroutines_decContext ctx) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb_regs = new StringBuilder();
        sb.append("void " + ctx.Idfr().getText() + " (QuESTEnv env");
        if (ctx.vardec().ro_params() != null){
            sb.append(visit(ctx.vardec().ro_params()));
        }
        for (QAALParser.Additional_regContext reg : ctx.additional_reg()){ //Getting reg_params types
            sb_regs.append(reg);
        }
        for (TerminalNode idfr : ctx.vardec().reg_params().Idfr()){
            switch (localIdfrs.get(idfr.getText())){
                case BIT -> sb.append(", bool " + idfr.getText());
                case REG -> sb.append(", std::array<int, N> " + idfr.getText());
                case QUBIT, QREG -> sb.append(", Qureg " + idfr.getText());
                default -> {}
            }
        }
        sb.append(") {\n");
        sb.append(sb_regs);
        sb.append(visit(ctx.body()));
        for (TerminalNode idfr : ctx.vardec().reg_params().Idfr()){
            switch (localIdfrs.get(idfr.getText())){
                case QUBIT, QREG -> sb.append("detroyQureg(" + idfr.getText() + ", env);\n");
                default -> {}
            }
        }
        return sb.toString();
    }

    @Override
    public String visitReg_dec(QAALParser.Reg_decContext ctx) {
        StringBuilder sb = new StringBuilder();
        if (ctx.Bits() != null){
            sb.append("std::array<int, " + ctx.Intlit().getText() + "> " + ctx.Idfr().getText() + " = {};\n");
        }
        else {
            sb.append("Qureg " + ctx.Idfr().getText() + " = createQureg(" + ctx.Intlit().getText() + ", env);\n");
            sb.append("initZeroState (" + ctx.Idfr().getText() + ");\n");
        }
        return sb.toString();
    }

    @Override
    public String visitBit_dec(QAALParser.Bit_decContext ctx) {
        StringBuilder sb = new StringBuilder();
        if (ctx.Bit() != null){
            sb.append("bool " + ctx.Idfr().getText() + " = 0;\n");
        }
        else {
            sb.append("Qureg " + ctx.Idfr().getText() + " = createQureg(1, env);\n");
            sb.append("initZeroState (" + ctx.Idfr().getText() + ");\n");
        }
        return sb.toString();
    }

    @Override
    public String visitVardec(QAALParser.VardecContext ctx) {
        throw new RuntimeException("Shouldn't be here!");
    }

    @Override
    public String visitRo_params(QAALParser.Ro_paramsContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.Idfr().size(); i++){
            sb.append(", " + ctx.cs_type(i).getText() + " " + ctx.Idfr(i).getText());
        }
        return sb.toString();
    }

    @Override
    public String visitReg_params(QAALParser.Reg_paramsContext ctx) {
        throw new RuntimeException("Shouldn't be here!");
    }

    @Override
    public String visitCs_dec(QAALParser.Cs_decContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.cs_type().getText().equals("integer") ? "int " : "qreal " + ctx.Idfr().getText() + " = " + visit(ctx.arithmetic()));
        return sb.toString();
    }

    @Override
    public String visitCs_type(QAALParser.Cs_typeContext ctx) {
        return "";
    }

    @Override
    public String visitCsExp(QAALParser.CsExpContext ctx) {
        return visit(ctx.cs_exp());
    }

    @Override
    public String visitRegExp(QAALParser.RegExpContext ctx) {
        return "";
    }

    @Override
    public String visitMzExp(QAALParser.MzExpContext ctx) {
        return "";
    }

    @Override
    public String visitInvokeExp(QAALParser.InvokeExpContext ctx) {
        return "";
    }

    @Override
    public String visitLabelExp(QAALParser.LabelExpContext ctx) {
        return "";
    }

    @Override
    public String visitQuantum_op(QAALParser.Quantum_opContext ctx) {
        return "";
    }

    @Override
    public String visitAngle_rotation(QAALParser.Angle_rotationContext ctx) {
        return "";
    }

    @Override
    public String visitArgs(QAALParser.ArgsContext ctx) {
        return "";
    }

    @Override
    public String visitUncondJump(QAALParser.UncondJumpContext ctx) {
        return "goto " + ctx.label().Idfr().getText();
    }

    @Override
    public String visitIfZeroJump(QAALParser.IfZeroJumpContext ctx) {
        StringBuilder sb = new StringBuilder();
        String idfr = ctx.variable().Idfr().getText();
        Types varType = varType(idfr);
        String label = ctx.label().Idfr().getText();
        switch (varType){
            case BIT, INT, ANGLE -> sb.append("if (" + idfr + " == 0) goto " + label + ";\n");
            case REG -> sb.append("if (isZero(" + idfr + ")) goto " + label + ";\n");
            default -> throw new RuntimeException("Wrong type!");
        }
        return sb.toString();
    }

    @Override
    public String visitIfGtrJump(QAALParser.IfGtrJumpContext ctx) {
        StringBuilder sb = new StringBuilder();
        String label = ctx.label().Idfr().getText();
        String idfr1 = ctx.variable(0).Idfr().getText();
        String idfr2 = ctx.variable(1).Idfr().getText();
        Types varType = varType(idfr1);
        switch (varType){
            case BIT, INT, ANGLE -> sb.append("if (" + idfr1 + " > " + idfr2 + ") goto " + label + ";\n");
            case REG -> sb.append("if (isZero(" + idfr1 + ")) goto " + label + ";\n");
            default -> throw new RuntimeException("Wrong type!");
        }
        return "";
    }

    @Override
    public String visitLabel(QAALParser.LabelContext ctx) {
        return "";
    }

    @Override
    public String visitCsJump(QAALParser.CsJumpContext ctx) {
        return visit(ctx.jump());
    }

    @Override
    public String visitCsRand(QAALParser.CsRandContext ctx) {
        return "";
    }

    @Override
    public String visitCsSet(QAALParser.CsSetContext ctx) {
        return "";
    }

    @Override
    public String visitIdfrArith(QAALParser.IdfrArithContext ctx) {
        return ctx.Idfr().getText();
    }

    @Override
    public String visitIntArith(QAALParser.IntArithContext ctx) {
        return ctx.Intlit().getText();
    }

    @Override
    public String visitPiArith(QAALParser.PiArithContext ctx) {
        return "M_PI";
    }

    @Override
    public String visitCombArith(QAALParser.CombArithContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("( " + visit(ctx.arithmetic(0)) + " " + ctx.NumExp().getText() + " " + visit(ctx.arithmetic(1)) + " )");
        return sb.toString();
    }

    @Override
    public String visitVariable(QAALParser.VariableContext ctx) {
        return "";
    }

    @Override
    public String visitIndex(QAALParser.IndexContext ctx) {
        return "";
    }
}
