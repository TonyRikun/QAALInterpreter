// Generated from C:/Users/Anton/Documents/Code/QAALInterpreter/ANTLR\QAAL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QAALParser}.
 */
public interface QAALListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QAALParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(QAALParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(QAALParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(QAALParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(QAALParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterVardec(QAALParser.VardecContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitVardec(QAALParser.VardecContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(QAALParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(QAALParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(QAALParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(QAALParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#ene}.
	 * @param ctx the parse tree
	 */
	void enterEne(QAALParser.EneContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#ene}.
	 * @param ctx the parse tree
	 */
	void exitEne(QAALParser.EneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdfrExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIdfrExp(QAALParser.IdfrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdfrExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIdfrExp(QAALParser.IdfrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIntExp(QAALParser.IntExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIntExp(QAALParser.IntExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBoolExp(QAALParser.BoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBoolExp(QAALParser.BoolExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(QAALParser.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(QAALParser.AssignExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinopExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinopExp(QAALParser.BinopExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinopExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinopExp(QAALParser.BinopExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArgExp(QAALParser.ArgExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArgExp(QAALParser.ArgExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBlockExp(QAALParser.BlockExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBlockExp(QAALParser.BlockExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(QAALParser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(QAALParser.IfExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterWhileExp(QAALParser.WhileExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitWhileExp(QAALParser.WhileExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRepeatExp(QAALParser.RepeatExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRepeatExp(QAALParser.RepeatExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPrintExp(QAALParser.PrintExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPrintExp(QAALParser.PrintExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpaceExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSpaceExp(QAALParser.SpaceExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpaceExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSpaceExp(QAALParser.SpaceExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewlineExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNewlineExp(QAALParser.NewlineExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewlineExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNewlineExp(QAALParser.NewlineExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SkipExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSkipExp(QAALParser.SkipExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SkipExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSkipExp(QAALParser.SkipExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(QAALParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(QAALParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(QAALParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(QAALParser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(QAALParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(QAALParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#boolit}.
	 * @param ctx the parse tree
	 */
	void enterBoolit(QAALParser.BoolitContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#boolit}.
	 * @param ctx the parse tree
	 */
	void exitBoolit(QAALParser.BoolitContext ctx);
}