import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class QAALChecker extends QAALBaseVisitor<Types>
{
    private final HashMap<String, Pair<Types,QAALParser.DecContext>> functionNames = new HashMap<>();
    private HashMap<String, Types> varsParams = new HashMap<>();
    private final Stack<HashMap<String, Types>> myVariablesStack = new Stack<>();
    @Override public Types visitProg(QAALParser.ProgContext ctx) {

        for (QAALParser.DecContext dec : ctx.dec()) {
            if (functionNames.containsKey(dec.Idfr().getText())) {
                throw new TypeException().duplicatedFuncError();
            }
            functionNames.put(dec.Idfr().getText(), new Pair<>(visit(dec.type()), dec));
        }
        if (!functionNames.containsKey("main")){
            throw new TypeException().noMainFuncError();
        }
        else if (functionNames.get("main").a != Types.INT) {
            throw new TypeException().mainReturnTypeError();
        }
        for (QAALParser.DecContext dec : ctx.dec()){ //Makes sure you don't check visited functions twice
            String funcName = dec.Idfr().getText();
            if (functionNames.get(funcName).a != visit(dec)) {
                throw new TypeException().functionBodyError();
            }
        }
        return functionNames.get("main").a;
    }
    @Override public Types visitDec(QAALParser.DecContext ctx) {
        myVariablesStack.push(new HashMap<>(varsParams));
        varsParams.clear();
        QAALParser.BodyContext body = ctx.body();
        QAALParser.VardecContext vardec = ctx.vardec();
        for (int i = 0; i < vardec.Idfr().size(); i++){
            Types declaredType = visit(vardec.type(i));
            String paramIdfr = vardec.Idfr(i).getText();
            paramVarCheck(paramIdfr, declaredType);
            varsParams.put(paramIdfr, declaredType);
        }
        for (int i = 0; i < body.Idfr().size(); i++){
            Types declaredType = visit(body.type(i));
            String varIdfr = body.Idfr(i).getText();
            paramVarCheck(varIdfr, declaredType);
            if (declaredType != visit(body.exp(i))) throw new TypeException().assignmentError();
            varsParams.put(varIdfr, declaredType);
        }
        Types returnValue = visit(body);
        varsParams.clear();
        varsParams = myVariablesStack.pop();
        return returnValue;
    }

    private void paramVarCheck(String varIdfr, Types declaredType){
        if (functionNames.containsKey(varIdfr)) throw new TypeException().clashedVarError();
        else if (varsParams.containsKey(varIdfr)) throw new TypeException().duplicatedVarError();
        else if (declaredType == Types.UNIT) throw new TypeException().unitVarError();
    }

    @Override
    public Types visitVardec(QAALParser.VardecContext ctx) {
        throw new RuntimeException("Shouldn't be here");
    }
    @Override
    public Types visitBody(QAALParser.BodyContext ctx) {
        return visit(ctx.ene());
    }

    @Override
    public Types visitBlock(QAALParser.BlockContext ctx) {
        return visit(ctx.ene());
    }

    @Override
    public Types visitEne(QAALParser.EneContext ctx) {
        ArrayList<Types> expReturns = new ArrayList<Types>();
        for (int i = 0; i < ctx.exp().size(); i++){
            expReturns.add(visit(ctx.exp(i)));
        }
        return expReturns.get(expReturns.size() - 1);
    }

    @Override
    public Types visitIdfrExp(QAALParser.IdfrExpContext ctx) {
        if (varsParams.containsKey(ctx.Idfr().getText())) {
            return varsParams.get(ctx.Idfr().getText());
        }
        else {
            throw new TypeException().undefinedVarError();
        }
    }


    @Override public Types visitIntExp(QAALParser.IntExpContext ctx) {
        return Types.INT;
    }

    @Override
    public Types visitBoolExp(QAALParser.BoolExpContext ctx) {
        return Types.BOOL;
    }

    @Override
    public Types visitAssignExp(QAALParser.AssignExpContext ctx) {
        Types returnType;
        if (varsParams.containsKey(ctx.Idfr().getText())) {
            returnType = varsParams.get(ctx.Idfr().getText());
            if (returnType != visit(ctx.exp())){
                throw new TypeException().assignmentError();
            }
            return Types.UNIT;
        }
        else{
            throw new TypeException().undefinedVarError();
        }
    }

    @Override
    public Types visitBinopExp(QAALParser.BinopExpContext ctx) {
        Types operand1Type = visit(ctx.exp(0));
        Types operand2Type = visit(ctx.exp(1));
        return switch (((TerminalNode) (ctx.binop().getChild(0))).getSymbol().getType()){
            case QAALParser.CompExp -> {
                if (operand1Type != Types.INT || operand2Type != Types.INT){
                    throw new TypeException().comparisonError();
                }
                yield Types.BOOL;
            }
            case QAALParser.NumExp -> {
                if (operand1Type != Types.INT || operand2Type != Types.INT){
                    throw new TypeException().arithmeticError();
                }
                yield Types.INT;
            }
            case QAALParser.BooleExp -> {
                if (operand1Type != Types.BOOL || operand2Type != Types.BOOL){
                    throw new TypeException().logicalError();
                }
                yield Types.BOOL;
            }
            default -> throw new RuntimeException("Shouldn't be here");
        };
    }

    @Override
    public Types visitArgExp(QAALParser.ArgExpContext ctx) {
        String funcName = ctx.Idfr().getText();
        Pair<Types, QAALParser.DecContext> function;
        if (!functionNames.containsKey(funcName)){
            throw new TypeException().undefinedFuncError();
        }
        function = functionNames.get(funcName);
        QAALParser.VardecContext params = function.b.vardec();
        if (params.type().size() != ctx.args().exp().size()) {
            throw new TypeException().argumentNumberError();
        }
        for (int i = 0; i < params.type().size(); i++) {
            if (visit(ctx.args().exp(i)) != visit(params.type(i))) {
                throw new TypeException().argumentError();
            }
        }
        return function.a;
    }

    @Override
    public Types visitBlockExp(QAALParser.BlockExpContext ctx) {
        return visit(ctx.block());
    }
    @Override
    public Types visitIfExp(QAALParser.IfExpContext ctx) {
        if (visit(ctx.exp()) != Types.BOOL){
            throw new TypeException().conditionError();
        }
        else if (visit(ctx.block(0)) != visit(ctx.block(1))){
            throw new TypeException().branchMismatchError();
        }
        else{
            return visit(ctx.block(0));
        }
    }
    @Override
    public Types visitWhileExp(QAALParser.WhileExpContext ctx) {
        if (visit(ctx.exp()) != Types.BOOL){
            throw new TypeException().conditionError();
        }
        else if (visit(ctx.block()) != Types.UNIT){
            throw new TypeException().loopBodyError();
        }
        else {
            return Types.UNIT;
        }
    }
    @Override
    public Types visitRepeatExp(QAALParser.RepeatExpContext ctx) {
        if (visit(ctx.exp()) != Types.BOOL){
            throw new TypeException().conditionError();
        }
        else if (visit(ctx.block()) != Types.UNIT){
            throw new TypeException().loopBodyError();
        }
        else {
            return Types.UNIT;
        }
    }
    @Override
    public Types visitPrintExp(QAALParser.PrintExpContext ctx) {
        if (visit(ctx.exp()) == Types.INT){
            return Types.UNIT;
        }
        else if (ctx.exp() instanceof QAALParser.NewlineExpContext || ctx.exp() instanceof QAALParser.SpaceExpContext) {
            return Types.UNIT;
        }
        else {
            throw new TypeException().printError();
        }
    }
    @Override
    public Types visitSpaceExp(QAALParser.SpaceExpContext ctx) {
        return Types.UNIT;
    }
    @Override
    public Types visitNewlineExp(QAALParser.NewlineExpContext ctx) {
        return Types.UNIT;
    }
    @Override public Types visitSkipExp(QAALParser.SkipExpContext ctx){
        return Types.UNIT;
    }
    @Override public Types visitArgs(QAALParser.ArgsContext ctx){ //Needs to be finished when done with Idfr and ArgExp are done
        throw new RuntimeException("Shouldn't be here");
    }
    @Override
    public Types visitBinop(QAALParser.BinopContext ctx) {
        throw new RuntimeException("Should not be here!");
    }

    @Override
    public Types visitType(QAALParser.TypeContext ctx) {
        return switch (((TerminalNode) ctx.getChild(0)).getSymbol().getType()) {
            case QAALParser.Int -> Types.INT;
            case QAALParser.Bool -> Types.BOOL;
            default -> Types.UNIT;
        };
    }
    @Override
    public Types visitBoolit(QAALParser.BoolitContext ctx) {
        throw new RuntimeException("Shouldn't be here");
    }
}
