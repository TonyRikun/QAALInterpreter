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

    private String getIndex(QAALParser.VariableContext var){ //If var is an indexed register, returns the index, else, returns "0"
        return var.index() != null ? var.index().Intlit().getText() : "0";
    }

    @Override
    public String visitProg(QAALParser.ProgContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("#include <QuEST.h>\n" +
                "#include <stdio.h>\n" +
                "#include <cmath>\n" +
                "#include <array>\n" +
                "#include <string>\n" +
                "#include <bitset>\n" +
                "#include <ctime>\n" +
                "#include <utility>\n" +
                "#include <cstdlib>\n" +
                "const double PI = 3.141592653589793;\n" +
                "std::vector<int> ctrls = {0, 1};\n" +
                "std::vector<int> targs = {2};\n" +
                "template <size_t N>\n" +
                "bool isZero(std::array<int, N>& myArr) {\n" +
                "\tfor(int i = 0; i < myArr.size(); i++) {\n" +
                "\t\tif(myArr[i] != 0) {\n" +
                "\t\t\treturn false;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "return true;\n" +
                "}\n\n" +
                "template <size_t N>\n" +
                "bool compareRegs(std::array<int, N>& myArr1, std::array<int, N>& myArr2) {\n" +
                "\t// Concatenate the values into a single string\n" +
                "\tstd::string concatenated1;\n" +
                "\t\tstd::string concatenated2;\n" +
                "\tfor (int i = 0; i < myArr1.size(); i++) {\n" +
                "\t\tconcatenated1 += std::to_string(myArr1[i]);\n" +
                "\t\tconcatenated2 += std::to_string(myArr2[i]);\n" +
                "\t}\n" +
                "\tstd::bitset<N> reg1(concatenated1);\n" +
                "\tstd::bitset<N> reg2(concatenated2);\n" +
                "\treturn reg1.to_ulong() > reg2.to_ulong();\n" +
                "}\n" +
                "void quregSwap(QuESTEnv env, Qureg& reg1, Qureg& reg2) {\n" +
                "\tQureg temp = createCloneQureg(reg1, env);\n" +
                "\tcloneQureg(reg1, reg2);\n" +
                "\tcloneQureg(reg2, temp);\n" +
                "\tdestroyQureg(temp, env);\n" +
                "}\n"
                );
        for (QAALParser.Subroutines_decContext sub : ctx.dec().subroutines_dec()){
            sb.append(visit(sub));
        }
        sb.append("\n" +
                "int main() {\n" +
                "std::srand((unsigned int)std::time(NULL));\n" +
                "QuESTEnv env = createQuESTEnv();\n\n");
        for (QAALParser.Additional_regContext reg : ctx.dec().additional_reg()){
            sb.append(visit(reg));
        }
        sb.append(visit(ctx.body()));
        for (QAALParser.OutputContext out : ctx.output()){
            sb.append(visit(out));
        }
        sb.append("destroyQuESTEnv(env);\n" +
                "return 0;\n" +
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
        StringBuilder sb = new StringBuilder();
        QAALParser.VariableContext var1 = ctx.variable(0);
        String op;
        if (ctx.Classical_op() != null) {
            op = ctx.Classical_op().getText();
            switch (op){
                case "NOT" -> sb.append(var1.getText() + " = !" + var1.getText() + ";\n");
                case "CNOT" -> sb.append(ctx.variable(1).getText() + " = (" + var1.getText() + " ^ " + ctx.variable(1).getText() + ");\n");
                case "CCNOT" -> sb.append(ctx.variable(2).getText() + " = (" + ctx.variable(2).getText() + " ^ (" + var1.getText() + " & " + ctx.variable(1).getText() + "));\n");
                default -> throw new RuntimeException("Shouldn't be here!");
            }
        }
        else if (ctx.quantum_op() != null) {
            if (ctx.quantum_op().angle_rotation() != null){

                String angle = visit(ctx.quantum_op().angle_rotation().args().arithmetic(0));
                op = ctx.quantum_op().angle_rotation().getChild(0).getText();
                if (ctx.variable().size() == 2 && !var1.Idfr().getText().equals(ctx.variable(1).Idfr().getText())){
                    throw new RuntimeException("Controlled operations' operands must be qubits of the same register");
                }
                switch (op){
                    case "Rx" -> sb.append("rotateX(" + var1.Idfr().getText() + ", " + getIndex(var1) + ", " + angle + ");\n");
                    case "Ry" -> sb.append("rotateY(" + var1.Idfr().getText() + ", " + getIndex(var1) + ", " + angle + ");\n");
                    case "Rz" -> sb.append("rotateZ(" + var1.Idfr().getText() + ", " + getIndex(var1) + ", " + angle + ");\n");
                    case "CRx" -> sb.append("controlledRotateX(" + var1.Idfr().getText() + ", " + getIndex(var1) + ", " + getIndex(ctx.variable(1)) + ", " + angle + ");\n");
                    case "CRy" -> sb.append("controlledRotateY(" + var1.Idfr().getText() + ", " + getIndex(var1) + ", " + getIndex(ctx.variable(1)) + ", " + angle + ");\n");
                    case "CRz" -> sb.append("controlledRotateZ(" + var1.Idfr().getText() + ", " + getIndex(var1) + ", " + getIndex(ctx.variable(1)) + ", " + angle + ");\n");
                    default -> throw new RuntimeException("Shouldn't be here!");
                }
            }
            else{
                op = ctx.quantum_op().Transformation().getText();
                if (ctx.variable().size() >= 2){
                    if (!var1.Idfr().getText().equals(ctx.variable(1).Idfr().getText())) {
                        throw new RuntimeException("Controlled operations' operands must be qubits of the same register");
                    }
                    if (ctx.variable().size() == 3 && !var1.Idfr().getText().equals(ctx.variable(2).Idfr().getText())) {
                        throw new RuntimeException("Controlled operations' operands must be qubits of the same register");
                    }
                }
                switch (op){
                    case "X" -> sb.append("pauliX(" + var1.Idfr().getText() + ", " + getIndex(var1) + ");\n");
                    case "Y" -> sb.append("pauliY(" + var1.Idfr().getText() + ", " + getIndex(var1) + ");\n");
                    case "Z" -> sb.append("pauliZ(" + var1.Idfr().getText() + ", " + getIndex(var1) + ");\n");
                    case "H" -> sb.append("hadamard(" + var1.Idfr().getText() + ", " + getIndex(var1) + ");\n");
                    case "CX" -> sb.append("controlledNot(" + var1.Idfr().getText() + ", " + getIndex(var1) + ", " + getIndex(ctx.variable(1)) + ");\n");
                    case "CY" -> sb.append("controlledPauliY(" + var1.Idfr().getText() + ", " + getIndex(var1) + ", " + getIndex(ctx.variable(1)) + ");\n");
                    case "CZ" -> sb.append("controlledPhaseFlip(" + var1.Idfr().getText() + ", " + getIndex(var1) + ", " + getIndex(ctx.variable(1)) + ");\n");
                    case "CCX" -> sb.append("ctrls = {" + getIndex(var1) + ", " + getIndex(ctx.variable(1)) + "};\n" +
                            "targs = {" + getIndex(ctx.variable(2)) + "};\n" +
                            "multiControlledMultiQubitNot(" + var1.Idfr().getText() + ", ctrls.data(), 2, targs.data(), 1);\n");
                    default -> throw new RuntimeException("Shouldn't be here!");
                }
            }
        }
        else {
            Types vType = varType(var1.Idfr().getText());
            switch (vType){
                case BIT -> sb.append("std::swap(" + var1.getText() + ", " + ctx.variable(1).getText() + ");\n");
                case REG -> sb.append("std::swap(" + var1.Idfr().getText() + ", " + ctx.variable(1).Idfr().getText() + ");\n");
                case QREG -> sb.append("quregSwap(env, " + var1.Idfr().getText() + ", " + ctx.variable(1).Idfr().getText() + ");\n");
                case QUBIT -> {
                    if (getIndex(var1).equals("0") && getIndex(ctx.variable(1)).equals("0")){
                        sb.append("quregSwap(env, " + var1.Idfr().getText() + ", " + ctx.variable(1).Idfr().getText() + ");\n");
                    }
                    else if (!getIndex(var1).equals("0") && !getIndex(ctx.variable(1)).equals("0")){
                        sb.append("swapGate(" + var1.Idfr().getText() + ", " + getIndex(var1) + ", " + getIndex(ctx.variable(1)) + ");\n");
                    }
                    else{
                        throw new RuntimeException("SWAP: invalid arguments");
                    }
                }
            }
        }
        return sb.toString();
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
            case REG -> sb.append("if (compareRegs(" + idfr1 + ", + " + idfr2 + ")) goto " + label + ";\n");
            default -> throw new RuntimeException("Wrong type!");
        }
        return "";
    }

    @Override
    public String visitLabel(QAALParser.LabelContext ctx) {
        throw new RuntimeException("Shouldn't be here!");
    }

    @Override
    public String visitCsJump(QAALParser.CsJumpContext ctx) {
        return visit(ctx.jump());
    }

    @Override
    public String visitCsRand(QAALParser.CsRandContext ctx) {
        return ctx.variable().getText() + " = std::rand() % 2\n";
    }

    @Override
    public String visitCsSet(QAALParser.CsSetContext ctx) {
        return ctx.Idfr() + " = " + visit(ctx.arithmetic());
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
        return "PI";
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
