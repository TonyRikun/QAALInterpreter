//package org.example;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class QAALChecker extends QAALBaseVisitor<Types>
{
    private final HashMap<String, ArrayList<Types>> functionNames = new HashMap<>();
    private HashSet<String> labels = new HashSet<>();
    private HashMap<String, Types> globalIdfrs = new HashMap<>();
    private HashMap<String, Types> localIdfrs = new HashMap<>();
    private HashSet<String> params = new HashSet<>();
//    private final Stack<HashMap<String, Types>> identifiersStack = new Stack<>();
    private void paramsCheck(String name){
        if (globalIdfrs.containsKey(name)) throw new TypeException().duplicatedVarError();
        if (localIdfrs.containsKey(name)) throw new TypeException().duplicatedVarError();
        if (labels.contains(name)) throw new TypeException().duplicatedVarError();
        if (functionNames.containsKey(name)) throw new TypeException().clashedVarError();
    }

    private Types varType(String name){
        if (globalIdfrs.containsKey(name)) return globalIdfrs.get(name);
        if (localIdfrs.containsKey(name)) return localIdfrs.get(name);
        else throw new TypeException().undefinedVarError();
    }

    @Override public Types visitProg(QAALParser.ProgContext ctx) {
        for (QAALParser.Subroutines_decContext dec : ctx.dec().subroutines_dec()) {
            if (functionNames.containsKey(dec.Idfr().getText())) {
                throw new TypeException().duplicatedFuncError();
            }
            ArrayList<Types> paramsTypes = new ArrayList<>();
            if (dec.vardec().ro_params() != null) {
                for (QAALParser.Cs_typeContext type : dec.vardec().ro_params().cs_type()) {
                    paramsTypes.add(visit(type)); //Adds all declared, read-only parameter types, so that later it would be possible to check during function invocation if the argument type matches
                }
            }
            functionNames.put(dec.Idfr().getText(), paramsTypes);
        }
        for (QAALParser.Additional_regContext reg : ctx.dec().additional_reg()){
            visit(reg);
        }
        for (QAALParser.Subroutines_decContext sub : ctx.dec().subroutines_dec()){
            visit(sub);
        }
        visit(ctx.body());
        for (QAALParser.OutputContext out : ctx.output()){
            Types varType = varType(out.Idfr().getText());
            int declaredType = ((TerminalNode) out.getChild(1)).getSymbol().getType();
            if ((declaredType == QAALParser.Bit && varType != Types.BIT) || (declaredType == QAALParser.Reg && varType != Types.REG)){
                throw new TypeException().outputTypeError();
            }
        }
        return Types.UNIT;
    }

    @Override
    public Types visitDec(QAALParser.DecContext ctx) {
        throw new RuntimeException("Shouldn't be here!");
    }

    @Override
    public Types visitBody(QAALParser.BodyContext ctx) {
        for (QAALParser.Cs_decContext cs : ctx.cs_dec()){
            visit(cs);
        }
        for (QAALParser.ExpContext exp : ctx.exp()) {
            if (exp instanceof QAALParser.LabelExpContext) {
                String labelText = ((QAALParser.LabelExpContext) exp).label().Idfr().getText();
                paramsCheck(labelText);
                localIdfrs.put(labelText, Types.LABEL);
                labels.add(labelText);
            }
        }
        for (QAALParser.ExpContext exp : ctx.exp()) {
            if (!(exp instanceof QAALParser.LabelExpContext)) visit(exp);
        }
        localIdfrs.clear();
        labels.clear();
        return Types.UNIT;
    }

    @Override
    public Types visitOutput(QAALParser.OutputContext ctx) {
        throw new RuntimeException("Shouldn't be here");
    }

    @Override
    public Types visitAdditional_reg(QAALParser.Additional_regContext ctx) { //Checking if the registers' names are not clashing and if they are not declared as operands
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
        if (ctx.getParent() instanceof QAALParser.DecContext){                              //If the declaration of registers is happening in the beginning of the program, operands
            if (ctx.Operand() != null){                                                     //cannot be declared here. Otherwise, if the declaration is happening in a subroutine and
                throw new TypeException().operandError();                                   //the register is an operand, the checks are made to make sure it's name is in the signature
            }                                                                               //of the subroutine. Also, there are checks made to see if all parameters appear as operands
            paramsCheck(registerName);                                                      //in the declaration section of the subroutine, so that all declared parameters are used
            globalIdfrs.put(registerName, registerType);
        }
        else if (ctx.Operand() == null){
            paramsCheck(registerName);
            localIdfrs.put(registerName, registerType);
        }
        else{
            if (!params.contains(registerName)) throw new TypeException().unknownOperandError();
            params.remove(registerName);
            localIdfrs.put(registerName, registerType);
            functionNames.get(((QAALParser.Subroutines_decContext) ctx.getParent()).Idfr().getText()).add(registerType);
        }
        return Types.UNIT;
    }

    @Override
    public Types visitSubroutines_dec(QAALParser.Subroutines_decContext ctx) {
        visit(ctx.vardec());
        for (QAALParser.Additional_regContext reg : ctx.additional_reg()){
            visit(reg);
        }
        if (!params.isEmpty()) throw new TypeException().unusedParameterError();
        visit(ctx.body());
        return Types.UNIT;
    }

    @Override
    public Types visitReg_dec(QAALParser.Reg_decContext ctx) {
        throw new RuntimeException("Shouldn't be here!");
    }

    @Override
    public Types visitBit_dec(QAALParser.Bit_decContext ctx) {
        throw new RuntimeException("Shouldn't be here!");
    }

    @Override
    public Types visitVardec(QAALParser.VardecContext ctx) {
        if (ctx.ro_params() != null) visit(ctx.ro_params());
        visit(ctx.reg_params());
        return Types.UNIT;
    }

    @Override
    public Types visitRo_params(QAALParser.Ro_paramsContext ctx) {
        for (int i = 0; i < ctx.Idfr().size(); i++){
            paramsCheck(ctx.Idfr(i).getText());
            localIdfrs.put(ctx.Idfr(i).getText(), visit(ctx.cs_type(i)));
        }
        return Types.UNIT;
    }

    @Override
    public Types visitReg_params(QAALParser.Reg_paramsContext ctx) { //Only adds register parameters to the "params" set.
        for (TerminalNode idfr : ctx.Idfr()) {
            paramsCheck(idfr.getText());
            params.add(idfr.getText());
        }
        return Types.UNIT;
    }

    @Override
    public Types visitCs_dec(QAALParser.Cs_decContext ctx) {
        paramsCheck(ctx.Idfr().getText());
        Types declaredType = visit(ctx.cs_type());
        if (visit(ctx.arithmetic()) != declaredType) throw new TypeException().assignmentError();
        localIdfrs.put(ctx.Idfr().getText(), declaredType);
        return Types.UNIT;
    }

    @Override
    public Types visitCs_type(QAALParser.Cs_typeContext ctx) {
        if (((TerminalNode) ctx.getChild(0)).getSymbol().getType() == QAALParser.Angle) return Types.ANGLE;
        else return Types.INT;
    }

    @Override
    public Types visitCsExp(QAALParser.CsExpContext ctx) {
        visit(ctx.cs_exp());
        return Types.UNIT;
    }

    @Override
    public Types visitRegExp(QAALParser.RegExpContext ctx) {
        String opType;
        int varSize = ctx.variable().size();
        if (ctx.quantum_op() != null) opType = "qOp";
        else if (ctx.Classical_op() != null) opType = "cOp";
        else opType = "swap";

        if (opType.equals("qOp") && ctx.quantum_op().angle_rotation() != null){
            if (ctx.quantum_op().angle_rotation().args().arithmetic().size() != 1){
                throw new TypeException().argumentNumberError();
            }
            else if (visit(ctx.quantum_op().angle_rotation().args().arithmetic(0)) != Types.ANGLE){
                throw new TypeException().argumentError();
            }
        }

        if (opType.equals("cOp")){ //Classical
            switch (ctx.Classical_op().getText()){
                case "NOT" -> {
                    if (varSize != 1) throw new TypeException().argumentNumberError();
                }
                case "CNOT" -> {
                    if (varSize != 2) throw new TypeException().argumentNumberError();
                }
                case "CCNOT" -> {
                    if (varSize != 3) throw new TypeException().argumentNumberError();
                }
                default -> throw new RuntimeException("Shouldn't be here");
            }
        }
        else if (opType.equals("qOp")){ //Quantum
            String op = ctx.quantum_op().getText();
            if (op.charAt(0) != 'C' && varSize != 1){
                throw new TypeException().argumentNumberError();
            }
            else if (op.charAt(0) == 'C' && varSize != 2){
                throw new TypeException().argumentNumberError();
            }
            else if (op.charAt(0) == 'C' && op.charAt(1) == 'C' && varSize != 3){
                throw new TypeException().argumentNumberError();
            }
        }
        else{ //SWAP
            if (varSize != 2) throw new TypeException().argumentNumberError();
        }

        if (!opType.equals("swap")) { //Checking if variables are of correct type
            for (QAALParser.VariableContext var : ctx.variable()) {
                Types type = visit(var);
                if (opType.equals("qOp") && !(type == Types.QUBIT)) {
                    throw new TypeException().argumentError();
                } else if (opType.equals("cOp") && !(type == Types.BIT)) {
                    throw new TypeException().argumentError();
                }
            }
        }
        else if (visit(ctx.variable(0)) != visit(ctx.variable(1))){ //SWAP
            throw new TypeException().argumentError();
        }

        return Types.UNIT;
    }

    @Override
    public Types visitMzExp(QAALParser.MzExpContext ctx) {
        Types type1 = visit(ctx.variable(0));
        Types type2 = visit(ctx.variable(1));
        if (type1 == Types.QREG && type2 == Types.REG){
            return Types.UNIT;
        }
        else if (type1 == Types.QUBIT && type2 == Types.BIT){
            return Types.UNIT;
        }
        else{
            throw new TypeException().argumentError();
        }
    }

    @Override
    public Types visitInvokeExp(QAALParser.InvokeExpContext ctx) {
        if (!functionNames.containsKey(ctx.Idfr().getText())) throw new TypeException().undefinedFuncError();
        ArrayList<Types> paramTypes = functionNames.get(ctx.Idfr().getText());
        ArrayList<Types> argTypes = new ArrayList<>();
        if (ctx.args() != null){
            for (QAALParser.ArithmeticContext arth : ctx.args().arithmetic()) {
                argTypes.add(visit(arth));
            }
        }
        for (QAALParser.VariableContext var : ctx.variable()){
            argTypes.add(visit(var));
        }
        if (argTypes.size() != paramTypes.size()){
            throw new TypeException().argumentNumberError();
        }
        else if (!argTypes.equals(paramTypes)){
            throw new TypeException().argumentError();
        }
        return Types.UNIT;
    }

    @Override
    public Types visitLabelExp(QAALParser.LabelExpContext ctx) {
        throw new RuntimeException("Shouldn't be here!");
    }

    @Override
    public Types visitQuantum_op(QAALParser.Quantum_opContext ctx) {
        throw new RuntimeException("Shouldn't be here!");
    }

    @Override
    public Types visitAngle_rotation(QAALParser.Angle_rotationContext ctx) {
        throw new RuntimeException("Shouldn't be here!");
    }

    @Override
    public Types visitLabel(QAALParser.LabelContext ctx) {
        if (varType(ctx.Idfr().getText()) != Types.LABEL) throw new TypeException().labelTypeError();
        return Types.UNIT;
    }

    @Override
    public Types visitUncondJump(QAALParser.UncondJumpContext ctx) {
        visit(ctx.label());
        return Types.UNIT;
    }

    @Override
    public Types visitIfZeroJump(QAALParser.IfZeroJumpContext ctx) {
        Types type = visit(ctx.variable());
        if (!(type == Types.INT || type == Types.ANGLE || type == Types.BIT || type == Types.REG)){
            throw new TypeException().invalidJumpVariableError();
        }
        else {
            visit(ctx.label());
        }
        return Types.UNIT;
    }

    @Override
    public Types visitIfGtrJump(QAALParser.IfGtrJumpContext ctx) {
        Types type1 = visit(ctx.variable(0));
        Types type2 = visit(ctx.variable(1));
        if (!(type1 == Types.INT || type1 == Types.ANGLE || type1 == Types.BIT || type1 == Types.REG)){
            throw new TypeException().invalidJumpVariableError();
        }
        else if (type1 != type2){
            throw new TypeException().mismatchedJumpTypesError();
        }
        visit(ctx.label());
        return Types.UNIT;
    }

    @Override
    public Types visitCsJump(QAALParser.CsJumpContext ctx) {
        visit(ctx.jump());
        return Types.UNIT;
    }

    @Override
    public Types visitCsRand(QAALParser.CsRandContext ctx) {
        Types type = visit(ctx.variable());
        if (!(type == Types.BIT)){
            throw new TypeException().randomisedVarError();
        }
        return Types.UNIT;
    }

    @Override
    public Types visitCsSet(QAALParser.CsSetContext ctx) {
        Types type = varType(ctx.Idfr().getText());
        if (type != visit(ctx.arithmetic())) throw new TypeException().assignmentError();
        return Types.UNIT;
    }

    @Override
    public Types visitIdfrArith(QAALParser.IdfrArithContext ctx) {
        return varType(ctx.Idfr().getText()); //Only need to check localIdfrs because cs variables are put only there
    }

    @Override
    public Types visitIntArith(QAALParser.IntArithContext ctx) {
        return Types.INT;
    }

    @Override
    public Types visitPiArith(QAALParser.PiArithContext ctx) {
        return Types.ANGLE;
    }

    @Override
    public Types visitCombArith(QAALParser.CombArithContext ctx) {
        if (visit(ctx.arithmetic(0)) == Types.INT && visit(ctx.arithmetic(1)) == Types.INT){
            return Types.INT;
        }
        else{
            return Types.ANGLE;
        }
    }

    @Override
    public Types visitArgs(QAALParser.ArgsContext ctx) {
        throw new RuntimeException("Shouldn't be here!");
    }

    @Override
    public Types visitVariable(QAALParser.VariableContext ctx) {
        Types type = varType(ctx.Idfr().getText());
        if (!(type == Types.REG || type == Types.QREG) && ctx.index() != null){
            throw new TypeException().indexingError();
        }
        else if (type == Types.REG && ctx.index() != null){
            return Types.BIT;
        }
        else if (type == Types.QREG && ctx.index() != null){
            return Types.QUBIT;
        }
        else {
            return type;
        }
    }

    @Override
    public Types visitIndex(QAALParser.IndexContext ctx) {
        throw new RuntimeException("Shouldn't be here!");
    }
}
