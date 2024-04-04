// Generated from C:/Users/Anton/Documents/Code/QAALInterpreter/QAALTranspiler/src\QAAL.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by {@link QAALParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(QAALParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(QAALParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#additional_reg}.
	 * @param ctx the parse tree
	 */
	void enterAdditional_reg(QAALParser.Additional_regContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#additional_reg}.
	 * @param ctx the parse tree
	 */
	void exitAdditional_reg(QAALParser.Additional_regContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#subroutines_dec}.
	 * @param ctx the parse tree
	 */
	void enterSubroutines_dec(QAALParser.Subroutines_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#subroutines_dec}.
	 * @param ctx the parse tree
	 */
	void exitSubroutines_dec(QAALParser.Subroutines_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#reg_dec}.
	 * @param ctx the parse tree
	 */
	void enterReg_dec(QAALParser.Reg_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#reg_dec}.
	 * @param ctx the parse tree
	 */
	void exitReg_dec(QAALParser.Reg_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#bit_dec}.
	 * @param ctx the parse tree
	 */
	void enterBit_dec(QAALParser.Bit_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#bit_dec}.
	 * @param ctx the parse tree
	 */
	void exitBit_dec(QAALParser.Bit_decContext ctx);
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
	 * Enter a parse tree produced by {@link QAALParser#cs_dec}.
	 * @param ctx the parse tree
	 */
	void enterCs_dec(QAALParser.Cs_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#cs_dec}.
	 * @param ctx the parse tree
	 */
	void exitCs_dec(QAALParser.Cs_decContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CsExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCsExp(QAALParser.CsExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CsExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCsExp(QAALParser.CsExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRegExp(QAALParser.RegExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRegExp(QAALParser.RegExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MzExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMzExp(QAALParser.MzExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MzExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMzExp(QAALParser.MzExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvokeExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInvokeExp(QAALParser.InvokeExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvokeExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInvokeExp(QAALParser.InvokeExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LabelExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLabelExp(QAALParser.LabelExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LabelExp}
	 * labeled alternative in {@link QAALParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLabelExp(QAALParser.LabelExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#quantum_op}.
	 * @param ctx the parse tree
	 */
	void enterQuantum_op(QAALParser.Quantum_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#quantum_op}.
	 * @param ctx the parse tree
	 */
	void exitQuantum_op(QAALParser.Quantum_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#angle_rotation}.
	 * @param ctx the parse tree
	 */
	void enterAngle_rotation(QAALParser.Angle_rotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#angle_rotation}.
	 * @param ctx the parse tree
	 */
	void exitAngle_rotation(QAALParser.Angle_rotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#measurement}.
	 * @param ctx the parse tree
	 */
	void enterMeasurement(QAALParser.MeasurementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#measurement}.
	 * @param ctx the parse tree
	 */
	void exitMeasurement(QAALParser.MeasurementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(QAALParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(QAALParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UncondJump}
	 * labeled alternative in {@link QAALParser#jump}.
	 * @param ctx the parse tree
	 */
	void enterUncondJump(QAALParser.UncondJumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UncondJump}
	 * labeled alternative in {@link QAALParser#jump}.
	 * @param ctx the parse tree
	 */
	void exitUncondJump(QAALParser.UncondJumpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfZeroJump}
	 * labeled alternative in {@link QAALParser#jump}.
	 * @param ctx the parse tree
	 */
	void enterIfZeroJump(QAALParser.IfZeroJumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfZeroJump}
	 * labeled alternative in {@link QAALParser#jump}.
	 * @param ctx the parse tree
	 */
	void exitIfZeroJump(QAALParser.IfZeroJumpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfGtrJump}
	 * labeled alternative in {@link QAALParser#jump}.
	 * @param ctx the parse tree
	 */
	void enterIfGtrJump(QAALParser.IfGtrJumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfGtrJump}
	 * labeled alternative in {@link QAALParser#jump}.
	 * @param ctx the parse tree
	 */
	void exitIfGtrJump(QAALParser.IfGtrJumpContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#cs_exp}.
	 * @param ctx the parse tree
	 */
	void enterCs_exp(QAALParser.Cs_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#cs_exp}.
	 * @param ctx the parse tree
	 */
	void exitCs_exp(QAALParser.Cs_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdfrArith}
	 * labeled alternative in {@link QAALParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterIdfrArith(QAALParser.IdfrArithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdfrArith}
	 * labeled alternative in {@link QAALParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitIdfrArith(QAALParser.IdfrArithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntArith}
	 * labeled alternative in {@link QAALParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterIntArith(QAALParser.IntArithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntArith}
	 * labeled alternative in {@link QAALParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitIntArith(QAALParser.IntArithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PiArith}
	 * labeled alternative in {@link QAALParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterPiArith(QAALParser.PiArithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PiArith}
	 * labeled alternative in {@link QAALParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitPiArith(QAALParser.PiArithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CombArith}
	 * labeled alternative in {@link QAALParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterCombArith(QAALParser.CombArithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CombArith}
	 * labeled alternative in {@link QAALParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitCombArith(QAALParser.CombArithContext ctx);
	/**
	 * Enter a parse tree produced by {@link QAALParser#angle_dec}.
	 * @param ctx the parse tree
	 */
	void enterAngle_dec(QAALParser.Angle_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAALParser#angle_dec}.
	 * @param ctx the parse tree
	 */
	void exitAngle_dec(QAALParser.Angle_decContext ctx);
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
}