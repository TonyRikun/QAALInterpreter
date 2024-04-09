import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.HashMap;
import java.util.Stack;

public class QAALCodeGenerator extends AbstractParseTreeVisitor<String> implements QAALVisitor<String> {
    private Stack<HashMap<String, Integer>> myStack = new Stack<>();
    private HashMap<String, Integer> varsParams = new HashMap<>();
    private HashMap<String, QAALParser.DecContext> functions = new HashMap<>();

    @Override
    public String visitProg(QAALParser.ProgContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("#include <QuEST.h>\n" +
                "#include <stdio.h>\n" +
                "\n" +
                "int main() {\n" +
                "\n" +
                "  // load QuEST\n" +
                "  QuESTEnv env = createQuESTEnv();\n" +
                "  \n" +
                "  // create a 2 qubit register in the zero state\n" +
                "  Qureg qubits = createQureg(2, env);\n" +
                "  initZeroState(qubits);\n" +
                "\t\n" +
                "  // apply circuit\n" +
                "  hadamard(qubits, 0);\n" +
                "  controlledNot(qubits, 0, 1);\n" +
                "  measure(qubits, 1);\n" +
                "  int outcome = measure(qubits, 0);\n" +
                "  printf(\"Qubit 0 was measured in state %d\\n\", outcome);\n"+
                "\t\n" +
                "  // unload QuEST\n" +
                "  destroyQureg(qubits, env); \n" +
                "  destroyQuESTEnv(env);\n" +
                "  return 0;\n" +
                "}");
        return sb.toString();
    }

    @Override
    public String visitDec(QAALParser.DecContext ctx) {
        return "";
    }

    @Override
    public String visitBody(QAALParser.BodyContext ctx) {
        return "";
    }

    @Override
    public String visitOutput(QAALParser.OutputContext ctx) {
        return "";
    }

    @Override
    public String visitAdditional_reg(QAALParser.Additional_regContext ctx) {
        return "";
    }

    @Override
    public String visitSubroutines_dec(QAALParser.Subroutines_decContext ctx) {
        return "";
    }

    @Override
    public String visitReg_dec(QAALParser.Reg_decContext ctx) {
        return "";
    }

    @Override
    public String visitBit_dec(QAALParser.Bit_decContext ctx) {
        return "";
    }

    @Override
    public String visitVardec(QAALParser.VardecContext ctx) {
        return "";
    }

    @Override
    public String visitRo_params(QAALParser.Ro_paramsContext ctx) {
        return "";
    }

    @Override
    public String visitReg_params(QAALParser.Reg_paramsContext ctx) {
        return "";
    }

    @Override
    public String visitCs_dec(QAALParser.Cs_decContext ctx) {
        return "";
    }

    @Override
    public String visitCs_type(QAALParser.Cs_typeContext ctx) {
        return "";
    }

    @Override
    public String visitCsExp(QAALParser.CsExpContext ctx) {
        return "";
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
        return "";
    }

    @Override
    public String visitIfZeroJump(QAALParser.IfZeroJumpContext ctx) {
        return "";
    }

    @Override
    public String visitIfGtrJump(QAALParser.IfGtrJumpContext ctx) {
        return "";
    }

    @Override
    public String visitLabel(QAALParser.LabelContext ctx) {
        return "";
    }

    @Override
    public String visitCsJump(QAALParser.CsJumpContext ctx) {
        return "";
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
        return "";
    }

    @Override
    public String visitIntArith(QAALParser.IntArithContext ctx) {
        return "";
    }

    @Override
    public String visitPiArith(QAALParser.PiArithContext ctx) {
        return "";
    }

    @Override
    public String visitCombArith(QAALParser.CombArithContext ctx) {
        return "";
    }

    @Override
    public String visitVariable(QAALParser.VariableContext ctx) {
        return "";
    }
}
