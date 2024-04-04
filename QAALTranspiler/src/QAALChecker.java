import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class QAALChecker extends QAALBaseVisitor<Types>
{
    private final HashSet<String> functionNames = new HashSet<>();
    private HashMap<String, Types> programRegisters = new HashMap<>();
    private final Stack<HashMap<String, Types>> myVariablesStack = new Stack<>();
    @Override public Types visitProg(QAALParser.ProgContext ctx) {
        for (QAALParser.Subroutines_decContext dec : ctx.dec().subroutines_dec()) {
            if (functionNames.contains(dec.Idfr().getText())) {
                throw new TypeException().duplicatedFuncError();
            }
            functionNames.add(dec.Idfr().getText());
        }
        for (QAALParser.Additional_regContext reg : ctx.dec().additional_reg()){
            visit(reg);
        }
        for (QAALParser.Subroutines_decContext sub : ctx.dec().subroutines_dec()){
            visit(sub);
        }
        visit(ctx.body());
        for (QAALParser.OutputContext out : ctx.output()){
            if (!programRegisters.containsKey(out.Idfr().getText())){
                throw new TypeException().undefinedVarError();
            }
            Types objectType = programRegisters.get(out.Idfr().getText());
            int declaredType = ((TerminalNode) out.getChild(0)).getSymbol().getType();
            if ((declaredType == QAALParser.Bit && objectType != Types.BIT) || (declaredType == QAALParser.Reg && objectType != Types.REG)){
                throw new TypeException().outputTypeError();
            }
        }
//        for (QAALParser.DecContext dec : ctx.dec()) {
//            if (functionNames.containsKey(dec.Idfr().getText())) {
//                throw new TypeException().duplicatedFuncError();
//            }
//            functionNames.put(dec.Idfr().getText(), new Pair<>(visit(dec.type()), dec));
//        }
//        for (QAALParser.DecContext dec : ctx.dec()){ //Makes sure you don't check visited functions twice
//            String funcName = dec.Idfr().getText();
//            if (functionNames.get(funcName).a != visit(dec)) {
//                throw new TypeException().functionBodyError();
//            }
//        }
        return Types.UNIT;
    }

    @Override
    public Types visitDec(QAALParser.DecContext ctx) {
        return super.visitDec(ctx);
    }

//        @Override public Types visitDec(QAALParser.DecContext ctx) {
//        myVariablesStack.push(new HashMap<>(varsParams));
//        varsParams.clear();
//        QAALParser.BodyContext body = ctx.body();
//        QAALParser.VardecContext vardec = ctx.vardec();
//        for (int i = 0; i < vardec.Idfr().size(); i++){
//            Types declaredType = visit(vardec.type(i));
//            String paramIdfr = vardec.Idfr(i).getText();
//            paramVarCheck(paramIdfr, declaredType);
//            varsParams.put(paramIdfr, declaredType);
//        }
//        for (int i = 0; i < body.Idfr().size(); i++){
//            Types declaredType = visit(body.type(i));
//            String varIdfr = body.Idfr(i).getText();
//            paramVarCheck(varIdfr, declaredType);
//            if (declaredType != visit(body.exp(i))) throw new TypeException().assignmentError();
//            varsParams.put(varIdfr, declaredType);
//        }
//        Types returnValue = visit(body);
//        varsParams.clear();
//        varsParams = myVariablesStack.pop();
//        return returnValue;
//    }

    @Override
    public Types visitBody(QAALParser.BodyContext ctx) {

        return Types.UNIT;
    }

    @Override
    public Types visitOutput(QAALParser.OutputContext ctx) {
        throw new RuntimeException("Shouldn't be here");
    }

    @Override
    public Types visitAdditional_reg(QAALParser.Additional_regContext ctx) { //Checking if the registers' names are not clashing and if they are not declared as operands
        if (ctx.Operand() != null){
            throw new TypeException().operandError();
        }
        String registerName;
        boolean registerBool = ctx.reg_dec() != null; //Checks if the object is a single or multiple bit/qubit register
        Types registerType;
        if (registerBool){ //Register
            registerName = ctx.reg_dec().Idfr().getText();
            registerType = ctx.reg_dec().Bits() == null ? Types.QREG : Types.REG;
        }
        else{ //Bit/Qubit
            registerName = ctx.bit_dec().Idfr().getText();
            registerType = ctx.bit_dec().Bit() == null ? Types.QUBIT : Types.BIT;
        }
        if (programRegisters.containsKey(registerName)){
            throw new TypeException().duplicatedVarError();
        }
        if (functionNames.contains(registerName)){
            throw new TypeException().clashedVarError();
        }
        programRegisters.put(registerName, registerType);
        return Types.UNIT;
    }

    @Override
    public Types visitSubroutines_dec(QAALParser.Subroutines_decContext ctx) {
        return super.visitSubroutines_dec(ctx);
    }

    @Override
    public Types visitReg_dec(QAALParser.Reg_decContext ctx) {
        return super.visitReg_dec(ctx);
    }

    @Override
    public Types visitBit_dec(QAALParser.Bit_decContext ctx) {
        return super.visitBit_dec(ctx);
    }

    @Override
    public Types visitVardec(QAALParser.VardecContext ctx) {
        return super.visitVardec(ctx);
    }

    @Override
    public Types visitCs_dec(QAALParser.Cs_decContext ctx) {
        return super.visitCs_dec(ctx);
    }

    @Override
    public Types visitCsExp(QAALParser.CsExpContext ctx) {
        return super.visitCsExp(ctx);
    }

    @Override
    public Types visitRegExp(QAALParser.RegExpContext ctx) {
        return super.visitRegExp(ctx);
    }

    @Override
    public Types visitMzExp(QAALParser.MzExpContext ctx) {
        return super.visitMzExp(ctx);
    }

    @Override
    public Types visitInvokeExp(QAALParser.InvokeExpContext ctx) {
        return super.visitInvokeExp(ctx);
    }

    @Override
    public Types visitLabelExp(QAALParser.LabelExpContext ctx) {
        return super.visitLabelExp(ctx);
    }

    @Override
    public Types visitQuantum_op(QAALParser.Quantum_opContext ctx) {
        return super.visitQuantum_op(ctx);
    }

    @Override
    public Types visitAngle_rotation(QAALParser.Angle_rotationContext ctx) {
        return super.visitAngle_rotation(ctx);
    }

    @Override
    public Types visitMeasurement(QAALParser.MeasurementContext ctx) {
        return super.visitMeasurement(ctx);
    }

    @Override
    public Types visitLabel(QAALParser.LabelContext ctx) {
        return super.visitLabel(ctx);
    }

    @Override
    public Types visitUncondJump(QAALParser.UncondJumpContext ctx) {
        return super.visitUncondJump(ctx);
    }

    @Override
    public Types visitIfZeroJump(QAALParser.IfZeroJumpContext ctx) {
        return super.visitIfZeroJump(ctx);
    }

    @Override
    public Types visitIfGtrJump(QAALParser.IfGtrJumpContext ctx) {
        return super.visitIfGtrJump(ctx);
    }

    @Override
    public Types visitCs_exp(QAALParser.Cs_expContext ctx) {
        return super.visitCs_exp(ctx);
    }

    @Override
    public Types visitIdfrArith(QAALParser.IdfrArithContext ctx) {
        return super.visitIdfrArith(ctx);
    }

    @Override
    public Types visitIntArith(QAALParser.IntArithContext ctx) {
        return super.visitIntArith(ctx);
    }

    @Override
    public Types visitPiArith(QAALParser.PiArithContext ctx) {
        return super.visitPiArith(ctx);
    }

    @Override
    public Types visitCombArith(QAALParser.CombArithContext ctx) {
        return super.visitCombArith(ctx);
    }

    @Override
    public Types visitAngle_dec(QAALParser.Angle_decContext ctx) {
        return super.visitAngle_dec(ctx);
    }

    @Override
    public Types visitArgs(QAALParser.ArgsContext ctx) {
        return super.visitArgs(ctx);
    }
}




//    @Override
//    public Types visitVardec(QAALParser.VardecContext ctx) {
//        throw new RuntimeException("Shouldn't be here");
//    }
//    @Override
//    public Types visitBody(QAALParser.BodyContext ctx) {
//        return visit(ctx.ene());
//    }

//    @Override
//    public Types visitEne(QAALParser.EneContext ctx) {
//        ArrayList<Types> expReturns = new ArrayList<Types>();
//        for (int i = 0; i < ctx.exp().size(); i++){
//            expReturns.add(visit(ctx.exp(i)));
//        }
//        return expReturns.get(expReturns.size() - 1);
//    }

//    @Override
//    public Types visitIdfrExp(QAALParser.IdfrExpContext ctx) {
//        if (varsParams.containsKey(ctx.Idfr().getText())) {
//            return varsParams.get(ctx.Idfr().getText());
//        }
//        else {
//            throw new TypeException().undefinedVarError();
//        }
//    }


//    @Override public Types visitIntExp(QAALParser.IntExpContext ctx) {
//        return Types.INT;
//    }

//    @Override
//    public Types visitBoolExp(QAALParser.BoolExpContext ctx) {
//        return Types.BOOL;
//    }

//    @Override
//    public Types visitAssignExp(QAALParser.AssignExpContext ctx) {
//        Types returnType;
//        if (varsParams.containsKey(ctx.Idfr().getText())) {
//            returnType = varsParams.get(ctx.Idfr().getText());
//            if (returnType != visit(ctx.exp())){
//                throw new TypeException().assignmentError();
//            }
//            return Types.UNIT;
//        }
//        else{
//            throw new TypeException().undefinedVarError();
//        }
//    }

//    @Override
//    public Types visitBinopExp(QAALParser.BinopExpContext ctx) {
//        Types operand1Type = visit(ctx.exp(0));
//        Types operand2Type = visit(ctx.exp(1));
//        return switch (((TerminalNode) (ctx.binop().getChild(0))).getSymbol().getType()){
//            case QAALParser.CompExp -> {
//                if (operand1Type != Types.INT || operand2Type != Types.INT){
//                    throw new TypeException().comparisonError();
//                }
//                yield Types.BOOL;
//            }
//            case QAALParser.NumExp -> {
//                if (operand1Type != Types.INT || operand2Type != Types.INT){
//                    throw new TypeException().arithmeticError();
//                }
//                yield Types.INT;
//            }
//            case QAALParser.BooleExp -> {
//                if (operand1Type != Types.BOOL || operand2Type != Types.BOOL){
//                    throw new TypeException().logicalError();
//                }
//                yield Types.BOOL;
//            }
//            default -> throw new RuntimeException("Shouldn't be here");
//        };
//    }

//    @Override
//    public Types visitArgExp(QAALParser.ArgExpContext ctx) {
//        String funcName = ctx.Idfr().getText();
//        Pair<Types, QAALParser.DecContext> function;
//        if (!functionNames.containsKey(funcName)){
//            throw new TypeException().undefinedFuncError();
//        }
//        function = functionNames.get(funcName);
//        QAALParser.VardecContext params = function.b.vardec();
//        if (params.type().size() != ctx.args().exp().size()) {
//            throw new TypeException().argumentNumberError();
//        }
//        for (int i = 0; i < params.type().size(); i++) {
//            if (visit(ctx.args().exp(i)) != visit(params.type(i))) {
//                throw new TypeException().argumentError();
//            }
//        }
//        return function.a;
//    }

//    @Override
//    public Types visitBlockExp(QAALParser.BlockExpContext ctx) {
//        return visit(ctx.block());
//    }
//    @Override
//    public Types visitIfExp(QAALParser.IfExpContext ctx) {
//        if (visit(ctx.exp()) != Types.BOOL){
//            throw new TypeException().conditionError();
//        }
//        else if (visit(ctx.block(0)) != visit(ctx.block(1))){
//            throw new TypeException().branchMismatchError();
//        }
//        else{
//            return visit(ctx.block(0));
//        }
//    }
//    @Override
//    public Types visitWhileExp(QAALParser.WhileExpContext ctx) {
//        if (visit(ctx.exp()) != Types.BOOL){
//            throw new TypeException().conditionError();
//        }
//        else if (visit(ctx.block()) != Types.UNIT){
//            throw new TypeException().loopBodyError();
//        }
//        else {
//            return Types.UNIT;
//        }
//    }
//    @Override
//    public Types visitRepeatExp(QAALParser.RepeatExpContext ctx) {
//        if (visit(ctx.exp()) != Types.BOOL){
//            throw new TypeException().conditionError();
//        }
//        else if (visit(ctx.block()) != Types.UNIT){
//            throw new TypeException().loopBodyError();
//        }
//        else {
//            return Types.UNIT;
//        }
//    }
//    @Override
//    public Types visitPrintExp(QAALParser.PrintExpContext ctx) {
//        if (visit(ctx.exp()) == Types.INT){
//            return Types.UNIT;
//        }
//        else if (ctx.exp() instanceof QAALParser.NewlineExpContext || ctx.exp() instanceof QAALParser.SpaceExpContext) {
//            return Types.UNIT;
//        }
//        else {
//            throw new TypeException().printError();
//        }
//    }
//    @Override
//    public Types visitSpaceExp(QAALParser.SpaceExpContext ctx) {
//        return Types.UNIT;
//    }
//    @Override
//    public Types visitNewlineExp(QAALParser.NewlineExpContext ctx) {
//        return Types.UNIT;
//    }
//    @Override public Types visitSkipExp(QAALParser.SkipExpContext ctx){
//        return Types.UNIT;
//    }
//    @Override public Types visitArgs(QAALParser.ArgsContext ctx){ //Needs to be finished when done with Idfr and ArgExp are done
//        throw new RuntimeException("Shouldn't be here");
//    }
//    @Override
//    public Types visitBinop(QAALParser.BinopContext ctx) {
//        throw new RuntimeException("Should not be here!");
//    }
//
//    @Override
//    public Types visitType(QAALParser.TypeContext ctx) {
//        return switch (((TerminalNode) ctx.getChild(0)).getSymbol().getType()) {
//            case QAALParser.Int -> Types.INT;
//            case QAALParser.Bool -> Types.BOOL;
//            default -> Types.UNIT;
//        };
//    }
//    @Override
//    public Types visitBoolit(QAALParser.BoolitContext ctx) {
//        throw new RuntimeException("Shouldn't be here");
//    }
