// Generated from C:/Users/Anton/Documents/Code/QAALInterpreter/QAALTranspiler/src\QAAL.g4 by ANTLR 4.10.1
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
	 * Visit a parse tree produced by {@link QAALParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(QAALParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(QAALParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#additional_reg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditional_reg(QAALParser.Additional_regContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#subroutines_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutines_dec(QAALParser.Subroutines_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#reg_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg_dec(QAALParser.Reg_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#bit_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_dec(QAALParser.Bit_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#vardec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec(QAALParser.VardecContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#cs_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCs_dec(QAALParser.Cs_decContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CsExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsExp(QAALParser.CsExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegExp(QAALParser.RegExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MzExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMzExp(QAALParser.MzExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvokeExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeExp(QAALParser.InvokeExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LabelExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelExp(QAALParser.LabelExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#quantum_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantum_op(QAALParser.Quantum_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#angle_rotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngle_rotation(QAALParser.Angle_rotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#measurement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasurement(QAALParser.MeasurementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(QAALParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UncondJump}
	 * labeled alternative in {@link QAALParser#jump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUncondJump(QAALParser.UncondJumpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfZeroJump}
	 * labeled alternative in {@link QAALParser#jump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfZeroJump(QAALParser.IfZeroJumpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfGtrJump}
	 * labeled alternative in {@link QAALParser#jump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfGtrJump(QAALParser.IfGtrJumpContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#cs_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCs_exp(QAALParser.Cs_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdfrArith}
	 * labeled alternative in {@link QAALParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdfrArith(QAALParser.IdfrArithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntArith}
	 * labeled alternative in {@link QAALParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArith(QAALParser.IntArithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PiArith}
	 * labeled alternative in {@link QAALParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiArith(QAALParser.PiArithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CombArith}
	 * labeled alternative in {@link QAALParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombArith(QAALParser.CombArithContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#angle_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngle_dec(QAALParser.Angle_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link QAALParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(QAALParser.ArgsContext ctx);
}