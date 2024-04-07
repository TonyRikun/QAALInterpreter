// Generated from C:/Users/Anton/Documents/Code/QAALInterpreter/QAALTranspiler/src\QAAL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QAALParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, Classical_op=23, Transformation=24, 
		Comment=25, Swap=26, NumExp=27, Index=28, Reg=29, Bit=30, Qubit=31, Int=32, 
		Angle=33, Unit=34, Bool=35, Stop=36, Operand=37, Pi=38, Bits=39, Qubits=40, 
		Intlit=41, Keywords=42, Idfr=43, WS=44;
	public static final int
		RULE_prog = 0, RULE_dec = 1, RULE_body = 2, RULE_output = 3, RULE_additional_reg = 4, 
		RULE_subroutines_dec = 5, RULE_reg_dec = 6, RULE_bit_dec = 7, RULE_vardec = 8, 
		RULE_ro_params = 9, RULE_reg_params = 10, RULE_cs_dec = 11, RULE_cs_type = 12, 
		RULE_exp = 13, RULE_quantum_op = 14, RULE_angle_rotation = 15, RULE_args = 16, 
		RULE_jump = 17, RULE_label = 18, RULE_cs_exp = 19, RULE_arithmetic = 20, 
		RULE_variable = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dec", "body", "output", "additional_reg", "subroutines_dec", 
			"reg_dec", "bit_dec", "vardec", "ro_params", "reg_params", "cs_dec", 
			"cs_type", "exp", "quantum_op", "angle_rotation", "args", "jump", "label", 
			"cs_exp", "arithmetic", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'output'", "'define'", "':'", "'('", "','", "')'", "'!'", "':='", 
			"'Mz'", "'->'", "'Rx'", "'Ry'", "'Rz'", "'CRx'", "'CRy'", "'CRz'", "'jump'", 
			"'if zero'", "'if gtr'", "'@'", "'randomise'", "'set'", null, null, null, 
			"'SWAP'", null, null, "'register'", "'bit'", "'qubit'", "'integer'", 
			"'angle'", "'unit'", "'bool'", "'stop'", "'operand'", "'pi'", "'bits'", 
			"'qubits'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "Classical_op", 
			"Transformation", "Comment", "Swap", "NumExp", "Index", "Reg", "Bit", 
			"Qubit", "Int", "Angle", "Unit", "Bool", "Stop", "Operand", "Pi", "Bits", 
			"Qubits", "Intlit", "Keywords", "Idfr", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "QAAL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QAALParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode Stop() { return getToken(QAALParser.Stop, 0); }
		public TerminalNode EOF() { return getToken(QAALParser.EOF, 0); }
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			dec();
			setState(45);
			body();
			setState(46);
			match(Stop);
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				output();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(52);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecContext extends ParserRuleContext {
		public List<Additional_regContext> additional_reg() {
			return getRuleContexts(Additional_regContext.class);
		}
		public Additional_regContext additional_reg(int i) {
			return getRuleContext(Additional_regContext.class,i);
		}
		public List<Subroutines_decContext> subroutines_dec() {
			return getRuleContexts(Subroutines_decContext.class);
		}
		public Subroutines_decContext subroutines_dec(int i) {
			return getRuleContext(Subroutines_decContext.class,i);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Reg) | (1L << Bit) | (1L << Qubit) | (1L << Operand))) != 0)) {
				{
				{
				setState(54);
				additional_reg();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(60);
				subroutines_dec();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<Cs_decContext> cs_dec() {
			return getRuleContexts(Cs_decContext.class);
		}
		public Cs_decContext cs_dec(int i) {
			return getRuleContext(Cs_decContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					cs_dec();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				exp();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << Classical_op) | (1L << Transformation) | (1L << Swap) | (1L << Idfr))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode Bit() { return getToken(QAALParser.Bit, 0); }
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public TerminalNode Reg() { return getToken(QAALParser.Reg, 0); }
		public TerminalNode Index() { return getToken(QAALParser.Index, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__0);
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bit:
				{
				setState(78);
				match(Bit);
				setState(79);
				match(Idfr);
				}
				break;
			case Reg:
				{
				setState(80);
				match(Reg);
				setState(81);
				match(Idfr);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Index) {
					{
					setState(82);
					match(Index);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additional_regContext extends ParserRuleContext {
		public Reg_decContext reg_dec() {
			return getRuleContext(Reg_decContext.class,0);
		}
		public Bit_decContext bit_dec() {
			return getRuleContext(Bit_decContext.class,0);
		}
		public TerminalNode Operand() { return getToken(QAALParser.Operand, 0); }
		public Additional_regContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additional_reg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterAdditional_reg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitAdditional_reg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitAdditional_reg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additional_regContext additional_reg() throws RecognitionException {
		Additional_regContext _localctx = new Additional_regContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_additional_reg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Operand) {
				{
				setState(87);
				match(Operand);
				}
			}

			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Reg:
				{
				setState(90);
				reg_dec();
				}
				break;
			case Bit:
			case Qubit:
				{
				setState(91);
				bit_dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subroutines_decContext extends ParserRuleContext {
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode Stop() { return getToken(QAALParser.Stop, 0); }
		public List<Additional_regContext> additional_reg() {
			return getRuleContexts(Additional_regContext.class);
		}
		public Additional_regContext additional_reg(int i) {
			return getRuleContext(Additional_regContext.class,i);
		}
		public Subroutines_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutines_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterSubroutines_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitSubroutines_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitSubroutines_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subroutines_decContext subroutines_dec() throws RecognitionException {
		Subroutines_decContext _localctx = new Subroutines_decContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subroutines_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__1);
			setState(95);
			match(Idfr);
			setState(96);
			vardec();
			setState(97);
			match(T__2);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Reg) | (1L << Bit) | (1L << Qubit) | (1L << Operand))) != 0)) {
				{
				{
				setState(98);
				additional_reg();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			body();
			setState(105);
			match(Stop);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reg_decContext extends ParserRuleContext {
		public TerminalNode Reg() { return getToken(QAALParser.Reg, 0); }
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public TerminalNode Intlit() { return getToken(QAALParser.Intlit, 0); }
		public TerminalNode Bits() { return getToken(QAALParser.Bits, 0); }
		public TerminalNode Qubits() { return getToken(QAALParser.Qubits, 0); }
		public Reg_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reg_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterReg_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitReg_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitReg_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reg_decContext reg_dec() throws RecognitionException {
		Reg_decContext _localctx = new Reg_decContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_reg_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(Reg);
			setState(108);
			match(Idfr);
			setState(109);
			match(T__2);
			setState(110);
			match(Intlit);
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==Bits || _la==Qubits) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_decContext extends ParserRuleContext {
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public TerminalNode Bit() { return getToken(QAALParser.Bit, 0); }
		public TerminalNode Qubit() { return getToken(QAALParser.Qubit, 0); }
		public Bit_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterBit_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitBit_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitBit_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_decContext bit_dec() throws RecognitionException {
		Bit_decContext _localctx = new Bit_decContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bit_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==Bit || _la==Qubit) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(114);
			match(Idfr);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardecContext extends ParserRuleContext {
		public Ro_paramsContext ro_params() {
			return getRuleContext(Ro_paramsContext.class,0);
		}
		public Reg_paramsContext reg_params() {
			return getRuleContext(Reg_paramsContext.class,0);
		}
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterVardec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitVardec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitVardec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vardec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(116);
				ro_params();
				}
			}

			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Idfr) {
				{
				setState(119);
				reg_params();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ro_paramsContext extends ParserRuleContext {
		public List<Cs_typeContext> cs_type() {
			return getRuleContexts(Cs_typeContext.class);
		}
		public Cs_typeContext cs_type(int i) {
			return getRuleContext(Cs_typeContext.class,i);
		}
		public List<TerminalNode> Idfr() { return getTokens(QAALParser.Idfr); }
		public TerminalNode Idfr(int i) {
			return getToken(QAALParser.Idfr, i);
		}
		public Ro_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ro_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterRo_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitRo_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitRo_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ro_paramsContext ro_params() throws RecognitionException {
		Ro_paramsContext _localctx = new Ro_paramsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ro_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__3);
			setState(123);
			cs_type();
			setState(124);
			match(Idfr);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(125);
				match(T__4);
				setState(126);
				cs_type();
				setState(127);
				match(Idfr);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reg_paramsContext extends ParserRuleContext {
		public List<TerminalNode> Idfr() { return getTokens(QAALParser.Idfr); }
		public TerminalNode Idfr(int i) {
			return getToken(QAALParser.Idfr, i);
		}
		public Reg_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reg_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterReg_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitReg_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitReg_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reg_paramsContext reg_params() throws RecognitionException {
		Reg_paramsContext _localctx = new Reg_paramsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_reg_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(Idfr);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(137);
				match(T__4);
				setState(138);
				match(Idfr);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cs_decContext extends ParserRuleContext {
		public Cs_typeContext cs_type() {
			return getRuleContext(Cs_typeContext.class,0);
		}
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public Cs_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cs_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterCs_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitCs_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitCs_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cs_decContext cs_dec() throws RecognitionException {
		Cs_decContext _localctx = new Cs_decContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cs_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__6);
			setState(145);
			cs_type();
			setState(146);
			match(Idfr);
			setState(147);
			match(T__7);
			setState(148);
			arithmetic();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cs_typeContext extends ParserRuleContext {
		public TerminalNode Angle() { return getToken(QAALParser.Angle, 0); }
		public TerminalNode Int() { return getToken(QAALParser.Int, 0); }
		public Cs_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cs_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterCs_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitCs_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitCs_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cs_typeContext cs_type() throws RecognitionException {
		Cs_typeContext _localctx = new Cs_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cs_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Angle) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegExpContext extends ExpContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode Classical_op() { return getToken(QAALParser.Classical_op, 0); }
		public Quantum_opContext quantum_op() {
			return getRuleContext(Quantum_opContext.class,0);
		}
		public TerminalNode Swap() { return getToken(QAALParser.Swap, 0); }
		public RegExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterRegExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitRegExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitRegExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MzExpContext extends ExpContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public MzExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterMzExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitMzExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitMzExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvokeExpContext extends ExpContext {
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public InvokeExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterInvokeExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitInvokeExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitInvokeExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CsExpContext extends ExpContext {
		public Cs_expContext cs_exp() {
			return getRuleContext(Cs_expContext.class,0);
		}
		public CsExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterCsExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitCsExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitCsExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabelExpContext extends ExpContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LabelExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterLabelExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitLabelExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitLabelExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exp);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new CsExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(T__6);
				setState(153);
				cs_exp();
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case Classical_op:
			case Transformation:
			case Swap:
				_localctx = new RegExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Classical_op:
					{
					setState(154);
					match(Classical_op);
					}
					break;
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case Transformation:
					{
					setState(155);
					quantum_op();
					}
					break;
				case Swap:
					{
					setState(156);
					match(Swap);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(159);
				variable();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(160);
					match(T__4);
					setState(161);
					variable();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__8:
				_localctx = new MzExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(T__8);
				setState(168);
				variable();
				setState(169);
				match(T__9);
				setState(170);
				variable();
				}
				break;
			case Idfr:
				_localctx = new InvokeExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(Idfr);
				setState(173);
				match(T__3);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << Pi) | (1L << Intlit) | (1L << Idfr))) != 0)) {
					{
					setState(174);
					args();
					}
				}

				setState(177);
				match(T__5);
				{
				setState(178);
				variable();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(179);
					match(T__4);
					setState(180);
					variable();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__19:
				_localctx = new LabelExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				label();
				setState(187);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantum_opContext extends ParserRuleContext {
		public Angle_rotationContext angle_rotation() {
			return getRuleContext(Angle_rotationContext.class,0);
		}
		public TerminalNode Transformation() { return getToken(QAALParser.Transformation, 0); }
		public Quantum_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantum_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterQuantum_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitQuantum_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitQuantum_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantum_opContext quantum_op() throws RecognitionException {
		Quantum_opContext _localctx = new Quantum_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_quantum_op);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				angle_rotation();
				}
				break;
			case Transformation:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(Transformation);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Angle_rotationContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Angle_rotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angle_rotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterAngle_rotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitAngle_rotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitAngle_rotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Angle_rotationContext angle_rotation() throws RecognitionException {
		Angle_rotationContext _localctx = new Angle_rotationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_angle_rotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(196);
			match(T__3);
			setState(197);
			args();
			setState(198);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			arithmetic();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(201);
				match(T__4);
				setState(202);
				arithmetic();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpContext extends ParserRuleContext {
		public JumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump; }
	 
		public JumpContext() { }
		public void copyFrom(JumpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UncondJumpContext extends JumpContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public UncondJumpContext(JumpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterUncondJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitUncondJump(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitUncondJump(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfGtrJumpContext extends JumpContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public IfGtrJumpContext(JumpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterIfGtrJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitIfGtrJump(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitIfGtrJump(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfZeroJumpContext extends JumpContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public IfZeroJumpContext(JumpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterIfZeroJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitIfZeroJump(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitIfZeroJump(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpContext jump() throws RecognitionException {
		JumpContext _localctx = new JumpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jump);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new UncondJumpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__16);
				setState(209);
				label();
				}
				break;
			case T__17:
				_localctx = new IfZeroJumpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(T__17);
				setState(211);
				variable();
				setState(212);
				match(T__4);
				setState(213);
				label();
				}
				break;
			case T__18:
				_localctx = new IfGtrJumpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(T__18);
				setState(216);
				variable();
				setState(217);
				match(T__4);
				setState(218);
				variable();
				setState(219);
				match(T__4);
				setState(220);
				label();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__19);
			setState(225);
			match(Idfr);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cs_expContext extends ParserRuleContext {
		public Cs_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cs_exp; }
	 
		public Cs_expContext() { }
		public void copyFrom(Cs_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CsJumpContext extends Cs_expContext {
		public JumpContext jump() {
			return getRuleContext(JumpContext.class,0);
		}
		public CsJumpContext(Cs_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterCsJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitCsJump(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitCsJump(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CsRandContext extends Cs_expContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CsRandContext(Cs_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterCsRand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitCsRand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitCsRand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CsSetContext extends Cs_expContext {
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public CsSetContext(Cs_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterCsSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitCsSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitCsSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cs_expContext cs_exp() throws RecognitionException {
		Cs_expContext _localctx = new Cs_expContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cs_exp);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case T__18:
				_localctx = new CsJumpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				jump();
				}
				break;
			case T__20:
				_localctx = new CsRandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(T__20);
				setState(229);
				variable();
				}
				break;
			case T__21:
				_localctx = new CsSetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(T__21);
				setState(231);
				match(Idfr);
				setState(232);
				match(T__7);
				setState(233);
				arithmetic();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticContext extends ParserRuleContext {
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	 
		public ArithmeticContext() { }
		public void copyFrom(ArithmeticContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdfrArithContext extends ArithmeticContext {
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public IdfrArithContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterIdfrArith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitIdfrArith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitIdfrArith(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntArithContext extends ArithmeticContext {
		public TerminalNode Intlit() { return getToken(QAALParser.Intlit, 0); }
		public IntArithContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterIntArith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitIntArith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitIntArith(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PiArithContext extends ArithmeticContext {
		public TerminalNode Pi() { return getToken(QAALParser.Pi, 0); }
		public PiArithContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterPiArith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitPiArith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitPiArith(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CombArithContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode NumExp() { return getToken(QAALParser.NumExp, 0); }
		public CombArithContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterCombArith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitCombArith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitCombArith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arithmetic);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Idfr:
				_localctx = new IdfrArithContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(Idfr);
				}
				break;
			case Intlit:
				_localctx = new IntArithContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(Intlit);
				}
				break;
			case Pi:
				_localctx = new PiArithContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(Pi);
				}
				break;
			case T__3:
				_localctx = new CombArithContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(239);
				match(T__3);
				setState(240);
				arithmetic();
				setState(241);
				match(NumExp);
				setState(242);
				arithmetic();
				setState(243);
				match(T__5);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public TerminalNode Index() { return getToken(QAALParser.Index, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(Idfr);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Index) {
				{
				setState(248);
				match(Index);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u00fc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u00001\b\u0000"+
		"\u000b\u0000\f\u00002\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"8\b\u0001\n\u0001\f\u0001;\t\u0001\u0001\u0001\u0005\u0001>\b\u0001\n"+
		"\u0001\f\u0001A\t\u0001\u0001\u0002\u0005\u0002D\b\u0002\n\u0002\f\u0002"+
		"G\t\u0002\u0001\u0002\u0004\u0002J\b\u0002\u000b\u0002\f\u0002K\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003T\b\u0003\u0003\u0003V\b\u0003\u0001\u0004\u0003\u0004Y\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005d\b\u0005\n\u0005\f\u0005"+
		"g\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0003\bv\b\b\u0001\b\u0003\by\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0082\b\t\n\t\f\t\u0085"+
		"\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u008c\b\n\n\n\f\n"+
		"\u008f\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u009e\b\r\u0001\r\u0001\r\u0001\r\u0005\r\u00a3\b\r\n\r\f\r\u00a6\t"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00b0\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00b6\b\r\n\r\f\r"+
		"\u00b9\t\r\u0001\r\u0001\r\u0001\r\u0003\r\u00be\b\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00c2\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00cc"+
		"\b\u0010\n\u0010\f\u0010\u00cf\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00df\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00eb\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00f6\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00fa\b\u0015\u0001\u0015\u0000\u0000"+
		"\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*\u0000\u0004\u0001\u0000\'(\u0001\u0000\u001e"+
		"\u001f\u0001\u0000 !\u0001\u0000\u000b\u0010\u0106\u0000,\u0001\u0000"+
		"\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000\u0000"+
		"\u0006M\u0001\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000\n^\u0001\u0000"+
		"\u0000\u0000\fk\u0001\u0000\u0000\u0000\u000eq\u0001\u0000\u0000\u0000"+
		"\u0010u\u0001\u0000\u0000\u0000\u0012z\u0001\u0000\u0000\u0000\u0014\u0088"+
		"\u0001\u0000\u0000\u0000\u0016\u0090\u0001\u0000\u0000\u0000\u0018\u0096"+
		"\u0001\u0000\u0000\u0000\u001a\u00bd\u0001\u0000\u0000\u0000\u001c\u00c1"+
		"\u0001\u0000\u0000\u0000\u001e\u00c3\u0001\u0000\u0000\u0000 \u00c8\u0001"+
		"\u0000\u0000\u0000\"\u00de\u0001\u0000\u0000\u0000$\u00e0\u0001\u0000"+
		"\u0000\u0000&\u00ea\u0001\u0000\u0000\u0000(\u00f5\u0001\u0000\u0000\u0000"+
		"*\u00f7\u0001\u0000\u0000\u0000,-\u0003\u0002\u0001\u0000-.\u0003\u0004"+
		"\u0002\u0000.0\u0005$\u0000\u0000/1\u0003\u0006\u0003\u00000/\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0005\u0000\u0000\u0001"+
		"5\u0001\u0001\u0000\u0000\u000068\u0003\b\u0004\u000076\u0001\u0000\u0000"+
		"\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:?\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<>\u0003"+
		"\n\u0005\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0003\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000BD\u0003\u0016\u000b\u0000CB\u0001\u0000"+
		"\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"HJ\u0003\u001a\r\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0005\u0001\u0000"+
		"\u0000\u0000MU\u0005\u0001\u0000\u0000NO\u0005\u001e\u0000\u0000OV\u0005"+
		"+\u0000\u0000PQ\u0005\u001d\u0000\u0000QS\u0005+\u0000\u0000RT\u0005\u001c"+
		"\u0000\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001"+
		"\u0000\u0000\u0000UN\u0001\u0000\u0000\u0000UP\u0001\u0000\u0000\u0000"+
		"V\u0007\u0001\u0000\u0000\u0000WY\u0005%\u0000\u0000XW\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000Z]\u0003\f"+
		"\u0006\u0000[]\u0003\u000e\u0007\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001"+
		"\u0000\u0000\u0000]\t\u0001\u0000\u0000\u0000^_\u0005\u0002\u0000\u0000"+
		"_`\u0005+\u0000\u0000`a\u0003\u0010\b\u0000ae\u0005\u0003\u0000\u0000"+
		"bd\u0003\b\u0004\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000hi\u0003\u0004\u0002\u0000ij\u0005$\u0000"+
		"\u0000j\u000b\u0001\u0000\u0000\u0000kl\u0005\u001d\u0000\u0000lm\u0005"+
		"+\u0000\u0000mn\u0005\u0003\u0000\u0000no\u0005)\u0000\u0000op\u0007\u0000"+
		"\u0000\u0000p\r\u0001\u0000\u0000\u0000qr\u0007\u0001\u0000\u0000rs\u0005"+
		"+\u0000\u0000s\u000f\u0001\u0000\u0000\u0000tv\u0003\u0012\t\u0000ut\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000"+
		"wy\u0003\u0014\n\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y\u0011\u0001\u0000\u0000\u0000z{\u0005\u0004\u0000\u0000{|\u0003\u0018"+
		"\f\u0000|\u0083\u0005+\u0000\u0000}~\u0005\u0005\u0000\u0000~\u007f\u0003"+
		"\u0018\f\u0000\u007f\u0080\u0005+\u0000\u0000\u0080\u0082\u0001\u0000"+
		"\u0000\u0000\u0081}\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\u0006\u0000\u0000\u0087\u0013\u0001\u0000\u0000"+
		"\u0000\u0088\u008d\u0005+\u0000\u0000\u0089\u008a\u0005\u0005\u0000\u0000"+
		"\u008a\u008c\u0005+\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c"+
		"\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u0015\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0007\u0000\u0000\u0091"+
		"\u0092\u0003\u0018\f\u0000\u0092\u0093\u0005+\u0000\u0000\u0093\u0094"+
		"\u0005\b\u0000\u0000\u0094\u0095\u0003(\u0014\u0000\u0095\u0017\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0007\u0002\u0000\u0000\u0097\u0019\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005\u0007\u0000\u0000\u0099\u00be\u0003"+
		"&\u0013\u0000\u009a\u009e\u0005\u0017\u0000\u0000\u009b\u009e\u0003\u001c"+
		"\u000e\u0000\u009c\u009e\u0005\u001a\u0000\u0000\u009d\u009a\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a4\u0003*\u0015"+
		"\u0000\u00a0\u00a1\u0005\u0005\u0000\u0000\u00a1\u00a3\u0003*\u0015\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00be\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0005\t\u0000\u0000\u00a8\u00a9\u0003*\u0015\u0000\u00a9"+
		"\u00aa\u0005\n\u0000\u0000\u00aa\u00ab\u0003*\u0015\u0000\u00ab\u00be"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005+\u0000\u0000\u00ad\u00af\u0005"+
		"\u0004\u0000\u0000\u00ae\u00b0\u0003 \u0010\u0000\u00af\u00ae\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0005\u0006\u0000\u0000\u00b2\u00b7\u0003*\u0015"+
		"\u0000\u00b3\u00b4\u0005\u0005\u0000\u0000\u00b4\u00b6\u0003*\u0015\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u00be\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0003$\u0012\u0000\u00bb\u00bc\u0005\u0003\u0000\u0000\u00bc"+
		"\u00be\u0001\u0000\u0000\u0000\u00bd\u0098\u0001\u0000\u0000\u0000\u00bd"+
		"\u009d\u0001\u0000\u0000\u0000\u00bd\u00a7\u0001\u0000\u0000\u0000\u00bd"+
		"\u00ac\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000\u00be"+
		"\u001b\u0001\u0000\u0000\u0000\u00bf\u00c2\u0003\u001e\u000f\u0000\u00c0"+
		"\u00c2\u0005\u0018\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u001d\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0007\u0003\u0000\u0000\u00c4\u00c5\u0005\u0004\u0000\u0000\u00c5"+
		"\u00c6\u0003 \u0010\u0000\u00c6\u00c7\u0005\u0006\u0000\u0000\u00c7\u001f"+
		"\u0001\u0000\u0000\u0000\u00c8\u00cd\u0003(\u0014\u0000\u00c9\u00ca\u0005"+
		"\u0005\u0000\u0000\u00ca\u00cc\u0003(\u0014\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce!\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0011\u0000"+
		"\u0000\u00d1\u00df\u0003$\u0012\u0000\u00d2\u00d3\u0005\u0012\u0000\u0000"+
		"\u00d3\u00d4\u0003*\u0015\u0000\u00d4\u00d5\u0005\u0005\u0000\u0000\u00d5"+
		"\u00d6\u0003$\u0012\u0000\u00d6\u00df\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0005\u0013\u0000\u0000\u00d8\u00d9\u0003*\u0015\u0000\u00d9\u00da\u0005"+
		"\u0005\u0000\u0000\u00da\u00db\u0003*\u0015\u0000\u00db\u00dc\u0005\u0005"+
		"\u0000\u0000\u00dc\u00dd\u0003$\u0012\u0000\u00dd\u00df\u0001\u0000\u0000"+
		"\u0000\u00de\u00d0\u0001\u0000\u0000\u0000\u00de\u00d2\u0001\u0000\u0000"+
		"\u0000\u00de\u00d7\u0001\u0000\u0000\u0000\u00df#\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0005\u0014\u0000\u0000\u00e1\u00e2\u0005+\u0000\u0000\u00e2"+
		"%\u0001\u0000\u0000\u0000\u00e3\u00eb\u0003\"\u0011\u0000\u00e4\u00e5"+
		"\u0005\u0015\u0000\u0000\u00e5\u00eb\u0003*\u0015\u0000\u00e6\u00e7\u0005"+
		"\u0016\u0000\u0000\u00e7\u00e8\u0005+\u0000\u0000\u00e8\u00e9\u0005\b"+
		"\u0000\u0000\u00e9\u00eb\u0003(\u0014\u0000\u00ea\u00e3\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e4\u0001\u0000\u0000\u0000\u00ea\u00e6\u0001\u0000\u0000"+
		"\u0000\u00eb\'\u0001\u0000\u0000\u0000\u00ec\u00f6\u0005+\u0000\u0000"+
		"\u00ed\u00f6\u0005)\u0000\u0000\u00ee\u00f6\u0005&\u0000\u0000\u00ef\u00f0"+
		"\u0005\u0004\u0000\u0000\u00f0\u00f1\u0003(\u0014\u0000\u00f1\u00f2\u0005"+
		"\u001b\u0000\u0000\u00f2\u00f3\u0003(\u0014\u0000\u00f3\u00f4\u0005\u0006"+
		"\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f5\u00ed\u0001\u0000\u0000\u0000\u00f5\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f5\u00ef\u0001\u0000\u0000\u0000\u00f6)\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f9\u0005+\u0000\u0000\u00f8\u00fa\u0005\u001c\u0000\u0000"+
		"\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa+\u0001\u0000\u0000\u0000\u001929?EKSUX\\eux\u0083\u008d\u009d\u00a4"+
		"\u00af\u00b7\u00bd\u00c1\u00cd\u00de\u00ea\u00f5\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}