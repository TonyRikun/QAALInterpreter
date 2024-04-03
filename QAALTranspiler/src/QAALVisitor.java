// Generated from C:/Users/Anton/Documents/Code/QAALInterpreter/ANTLR\QAAL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QAALParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QAALVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QAALParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(QAALParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(QAALParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#vardec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec(QAALParser.VardecContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(QAALParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(QAALParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#ene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEne(QAALParser.EneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdfrExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdfrExp(QAALParser.IdfrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExp(QAALParser.IntExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExp(QAALParser.BoolExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExp(QAALParser.AssignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinopExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinopExp(QAALParser.BinopExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgExp(QAALParser.ArgExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExp(QAALParser.BlockExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExp(QAALParser.IfExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExp(QAALParser.WhileExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatExp(QAALParser.RepeatExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExp(QAALParser.PrintExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpaceExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpaceExp(QAALParser.SpaceExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewlineExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewlineExp(QAALParser.NewlineExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SkipExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipExp(QAALParser.SkipExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(QAALParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(QAALParser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(QAALParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#boolit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolit(QAALParser.BoolitContext ctx);
}