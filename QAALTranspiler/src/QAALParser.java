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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		Classical_op=25, Transformation=26, Comment=27, NumExp=28, Reg=29, Bit=30, 
		Qubit=31, Int=32, Angle=33, Unit=34, Bool=35, Stop=36, Operand=37, Pi=38, 
		Bits=39, Qubits=40, Intlit=41, Keywords=42, Idfr=43, WS=44;
	public static final int
		RULE_prog = 0, RULE_dec = 1, RULE_body = 2, RULE_output = 3, RULE_additional_reg = 4, 
		RULE_subroutines_dec = 5, RULE_reg_dec = 6, RULE_bit_dec = 7, RULE_vardec = 8, 
		RULE_cs_dec = 9, RULE_exp = 10, RULE_quantum_op = 11, RULE_angle_rotation = 12, 
		RULE_measurement = 13, RULE_label = 14, RULE_jump = 15, RULE_cs_exp = 16, 
		RULE_arithmetic = 17, RULE_angle_dec = 18, RULE_args = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dec", "body", "output", "additional_reg", "subroutines_dec", 
			"reg_dec", "bit_dec", "vardec", "cs_dec", "exp", "quantum_op", "angle_rotation", 
			"measurement", "label", "jump", "cs_exp", "arithmetic", "angle_dec", 
			"args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'output'", "'['", "']'", "'define'", "'('", "')'", "':'", "','", 
			"'!'", "':='", "'Rx'", "'Ry'", "'Rz'", "'CRx'", "'CRy'", "'CRz'", "'Mz'", 
			"'->'", "'@'", "'jump'", "'if zero'", "'if gtr'", "'randomise'", "'set'", 
			null, null, null, null, "'register'", "'bit'", "'qubit'", "'integer'", 
			"'angle'", "'unit'", "'bool'", "'stop'", "'operand'", "'pi'", "'bits'", 
			"'qubits'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "Classical_op", "Transformation", "Comment", "NumExp", "Reg", "Bit", 
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
			setState(40);
			dec();
			setState(41);
			body();
			setState(42);
			match(Stop);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				output();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(48);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					additional_reg();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(56);
				subroutines_dec();
				}
				}
				setState(61);
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
		public List<Additional_regContext> additional_reg() {
			return getRuleContexts(Additional_regContext.class);
		}
		public Additional_regContext additional_reg(int i) {
			return getRuleContext(Additional_regContext.class,i);
		}
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Reg) | (1L << Bit) | (1L << Qubit) | (1L << Operand))) != 0)) {
				{
				{
				setState(62);
				additional_reg();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					cs_dec();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				exp();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << Classical_op) | (1L << Transformation) | (1L << Idfr))) != 0) );
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
		public TerminalNode Intlit() { return getToken(QAALParser.Intlit, 0); }
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
			setState(79);
			match(T__0);
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bit:
				{
				setState(80);
				match(Bit);
				setState(81);
				match(Idfr);
				}
				break;
			case Reg:
				{
				setState(82);
				match(Reg);
				setState(83);
				match(Idfr);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(84);
					match(T__1);
					setState(85);
					match(Intlit);
					setState(86);
					match(T__2);
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
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Operand) {
				{
				setState(91);
				match(Operand);
				}
			}

			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Reg:
				{
				setState(94);
				reg_dec();
				}
				break;
			case Bit:
			case Qubit:
				{
				setState(95);
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
		public List<VardecContext> vardec() {
			return getRuleContexts(VardecContext.class);
		}
		public VardecContext vardec(int i) {
			return getRuleContext(VardecContext.class,i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode Stop() { return getToken(QAALParser.Stop, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__3);
			setState(99);
			match(Idfr);
			setState(100);
			match(T__4);
			setState(101);
			vardec();
			setState(102);
			match(T__5);
			setState(103);
			vardec();
			setState(104);
			match(T__6);
			setState(105);
			body();
			setState(106);
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
			setState(108);
			match(Reg);
			setState(109);
			match(Idfr);
			setState(110);
			match(T__6);
			setState(111);
			match(Intlit);
			setState(112);
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
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==Bit || _la==Qubit) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(115);
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
		public List<TerminalNode> Idfr() { return getTokens(QAALParser.Idfr); }
		public TerminalNode Idfr(int i) {
			return getToken(QAALParser.Idfr, i);
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
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Idfr) {
				{
				setState(117);
				match(Idfr);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(118);
					match(T__7);
					setState(119);
					match(Idfr);
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Cs_decContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(QAALParser.Int, 0); }
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public TerminalNode Intlit() { return getToken(QAALParser.Intlit, 0); }
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
		enterRule(_localctx, 18, RULE_cs_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__8);
			setState(128);
			match(Int);
			setState(129);
			match(Idfr);
			setState(130);
			match(T__9);
			setState(131);
			match(Intlit);
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
		public List<TerminalNode> Idfr() { return getTokens(QAALParser.Idfr); }
		public TerminalNode Idfr(int i) {
			return getToken(QAALParser.Idfr, i);
		}
		public TerminalNode Classical_op() { return getToken(QAALParser.Classical_op, 0); }
		public Quantum_opContext quantum_op() {
			return getRuleContext(Quantum_opContext.class,0);
		}
		public List<TerminalNode> Intlit() { return getTokens(QAALParser.Intlit); }
		public TerminalNode Intlit(int i) {
			return getToken(QAALParser.Intlit, i);
		}
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
		public MeasurementContext measurement() {
			return getRuleContext(MeasurementContext.class,0);
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
		public List<TerminalNode> Idfr() { return getTokens(QAALParser.Idfr); }
		public TerminalNode Idfr(int i) {
			return getToken(QAALParser.Idfr, i);
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
		enterRule(_localctx, 20, RULE_exp);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new CsExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(T__8);
				setState(134);
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
				_localctx = new RegExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Classical_op:
					{
					setState(135);
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
					setState(136);
					quantum_op();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(139);
				match(Idfr);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(140);
					match(T__1);
					setState(141);
					match(Intlit);
					setState(142);
					match(T__2);
					}
				}

				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(145);
					match(T__7);
					setState(146);
					match(Idfr);
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(147);
						match(T__1);
						setState(148);
						match(Intlit);
						setState(149);
						match(T__2);
						}
					}

					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__16:
				_localctx = new MzExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				measurement();
				}
				break;
			case Idfr:
				_localctx = new InvokeExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(Idfr);
				setState(159);
				match(T__4);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Intlit || _la==Idfr) {
					{
					setState(160);
					args();
					}
				}

				setState(163);
				match(T__5);
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(164);
					match(Idfr);
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(165);
						match(T__7);
						setState(166);
						match(Idfr);
						}
						}
						setState(171);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case T__18:
				_localctx = new LabelExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				label();
				setState(175);
				match(T__6);
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
		enterRule(_localctx, 22, RULE_quantum_op);
		try {
			setState(181);
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
				setState(179);
				angle_rotation();
				}
				break;
			case Transformation:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
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
		enterRule(_localctx, 24, RULE_angle_rotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(184);
			match(T__4);
			setState(185);
			args();
			setState(186);
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

	public static class MeasurementContext extends ParserRuleContext {
		public List<TerminalNode> Idfr() { return getTokens(QAALParser.Idfr); }
		public TerminalNode Idfr(int i) {
			return getToken(QAALParser.Idfr, i);
		}
		public MeasurementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measurement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterMeasurement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitMeasurement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitMeasurement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasurementContext measurement() throws RecognitionException {
		MeasurementContext _localctx = new MeasurementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_measurement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__16);
			setState(189);
			match(Idfr);
			setState(190);
			match(T__17);
			setState(191);
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
		enterRule(_localctx, 28, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__18);
			setState(194);
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
		public List<TerminalNode> Idfr() { return getTokens(QAALParser.Idfr); }
		public TerminalNode Idfr(int i) {
			return getToken(QAALParser.Idfr, i);
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
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
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
		enterRule(_localctx, 30, RULE_jump);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				_localctx = new UncondJumpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(T__19);
				setState(197);
				label();
				}
				break;
			case T__20:
				_localctx = new IfZeroJumpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(T__20);
				setState(199);
				match(Idfr);
				setState(200);
				match(T__7);
				setState(201);
				label();
				}
				break;
			case T__21:
				_localctx = new IfGtrJumpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(T__21);
				setState(203);
				match(Idfr);
				setState(204);
				match(T__7);
				setState(205);
				match(Idfr);
				setState(206);
				match(T__7);
				setState(207);
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

	public static class Cs_expContext extends ParserRuleContext {
		public JumpContext jump() {
			return getRuleContext(JumpContext.class,0);
		}
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public Angle_decContext angle_dec() {
			return getRuleContext(Angle_decContext.class,0);
		}
		public Cs_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cs_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterCs_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitCs_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitCs_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cs_expContext cs_exp() throws RecognitionException {
		Cs_expContext _localctx = new Cs_expContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cs_exp);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				jump();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(T__22);
				setState(212);
				match(Idfr);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(T__23);
				setState(214);
				match(Idfr);
				setState(215);
				match(T__9);
				setState(216);
				arithmetic();
				}
				break;
			case Angle:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				angle_dec();
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
		enterRule(_localctx, 34, RULE_arithmetic);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Idfr:
				_localctx = new IdfrArithContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(Idfr);
				}
				break;
			case Intlit:
				_localctx = new IntArithContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(Intlit);
				}
				break;
			case Pi:
				_localctx = new PiArithContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(Pi);
				}
				break;
			case T__4:
				_localctx = new CombArithContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(223);
				match(T__4);
				setState(224);
				arithmetic();
				setState(225);
				match(NumExp);
				setState(226);
				arithmetic();
				setState(227);
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

	public static class Angle_decContext extends ParserRuleContext {
		public TerminalNode Angle() { return getToken(QAALParser.Angle, 0); }
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public Angle_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angle_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterAngle_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitAngle_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitAngle_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Angle_decContext angle_dec() throws RecognitionException {
		Angle_decContext _localctx = new Angle_decContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_angle_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(Angle);
			setState(232);
			match(Idfr);
			setState(233);
			match(T__9);
			setState(234);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> Idfr() { return getTokens(QAALParser.Idfr); }
		public TerminalNode Idfr(int i) {
			return getToken(QAALParser.Idfr, i);
		}
		public List<TerminalNode> Intlit() { return getTokens(QAALParser.Intlit); }
		public TerminalNode Intlit(int i) {
			return getToken(QAALParser.Intlit, i);
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
		enterRule(_localctx, 38, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==Intlit || _la==Idfr) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(237);
				match(T__7);
				setState(238);
				_la = _input.LA(1);
				if ( !(_la==Intlit || _la==Idfr) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(243);
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

	public static final String _serializedATN =
		"\u0004\u0001,\u00f5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0004\u0000-\b\u0000\u000b\u0000\f\u0000.\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001\u0001\u0001\u0005"+
		"\u0001:\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0002\u0005\u0002@\b\u0002"+
		"\n\u0002\f\u0002C\t\u0002\u0001\u0002\u0005\u0002F\b\u0002\n\u0002\f\u0002"+
		"I\t\u0002\u0001\u0002\u0004\u0002L\b\u0002\u000b\u0002\f\u0002M\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003X\b\u0003\u0003\u0003Z\b\u0003\u0001\u0004"+
		"\u0003\u0004]\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004a\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0005\by\b\b\n\b\f\b|\t\b\u0003\b~\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u008a\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0090"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0097\b\n\u0005\n"+
		"\u0099\b\n\n\n\f\n\u009c\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a2"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a8\b\n\n\n\f\n\u00ab\t"+
		"\n\u0003\n\u00ad\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b2\b\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00b6\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00d1\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00db\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00e6\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u00f0\b\u0013\n\u0013\f\u0013\u00f3"+
		"\t\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0004\u0001"+
		"\u0000\'(\u0001\u0000\u001e\u001f\u0001\u0000\u000b\u0010\u0002\u0000"+
		"))++\u0101\u0000(\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000"+
		"\u0004A\u0001\u0000\u0000\u0000\u0006O\u0001\u0000\u0000\u0000\b\\\u0001"+
		"\u0000\u0000\u0000\nb\u0001\u0000\u0000\u0000\fl\u0001\u0000\u0000\u0000"+
		"\u000er\u0001\u0000\u0000\u0000\u0010}\u0001\u0000\u0000\u0000\u0012\u007f"+
		"\u0001\u0000\u0000\u0000\u0014\u00b1\u0001\u0000\u0000\u0000\u0016\u00b5"+
		"\u0001\u0000\u0000\u0000\u0018\u00b7\u0001\u0000\u0000\u0000\u001a\u00bc"+
		"\u0001\u0000\u0000\u0000\u001c\u00c1\u0001\u0000\u0000\u0000\u001e\u00d0"+
		"\u0001\u0000\u0000\u0000 \u00da\u0001\u0000\u0000\u0000\"\u00e5\u0001"+
		"\u0000\u0000\u0000$\u00e7\u0001\u0000\u0000\u0000&\u00ec\u0001\u0000\u0000"+
		"\u0000()\u0003\u0002\u0001\u0000)*\u0003\u0004\u0002\u0000*,\u0005$\u0000"+
		"\u0000+-\u0003\u0006\u0003\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000001\u0005\u0000\u0000\u00011\u0001\u0001\u0000\u0000"+
		"\u000024\u0003\b\u0004\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006;\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u00008:\u0003\n\u0005\u000098\u0001\u0000"+
		"\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<\u0003\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000>@\u0003\b\u0004\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BG\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000DF\u0003\u0012\t\u0000ED\u0001\u0000"+
		"\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"JL\u0003\u0014\n\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0005\u0001\u0000"+
		"\u0000\u0000OY\u0005\u0001\u0000\u0000PQ\u0005\u001e\u0000\u0000QZ\u0005"+
		"+\u0000\u0000RS\u0005\u001d\u0000\u0000SW\u0005+\u0000\u0000TU\u0005\u0002"+
		"\u0000\u0000UV\u0005)\u0000\u0000VX\u0005\u0003\u0000\u0000WT\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YP\u0001"+
		"\u0000\u0000\u0000YR\u0001\u0000\u0000\u0000Z\u0007\u0001\u0000\u0000"+
		"\u0000[]\u0005%\u0000\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]`\u0001\u0000\u0000\u0000^a\u0003\f\u0006\u0000_a\u0003\u000e"+
		"\u0007\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000a\t\u0001"+
		"\u0000\u0000\u0000bc\u0005\u0004\u0000\u0000cd\u0005+\u0000\u0000de\u0005"+
		"\u0005\u0000\u0000ef\u0003\u0010\b\u0000fg\u0005\u0006\u0000\u0000gh\u0003"+
		"\u0010\b\u0000hi\u0005\u0007\u0000\u0000ij\u0003\u0004\u0002\u0000jk\u0005"+
		"$\u0000\u0000k\u000b\u0001\u0000\u0000\u0000lm\u0005\u001d\u0000\u0000"+
		"mn\u0005+\u0000\u0000no\u0005\u0007\u0000\u0000op\u0005)\u0000\u0000p"+
		"q\u0007\u0000\u0000\u0000q\r\u0001\u0000\u0000\u0000rs\u0007\u0001\u0000"+
		"\u0000st\u0005+\u0000\u0000t\u000f\u0001\u0000\u0000\u0000uz\u0005+\u0000"+
		"\u0000vw\u0005\b\u0000\u0000wy\u0005+\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}u\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0011\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\t\u0000\u0000\u0080\u0081\u0005 \u0000\u0000"+
		"\u0081\u0082\u0005+\u0000\u0000\u0082\u0083\u0005\n\u0000\u0000\u0083"+
		"\u0084\u0005)\u0000\u0000\u0084\u0013\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\t\u0000\u0000\u0086\u00b2\u0003 \u0010\u0000\u0087\u008a\u0005"+
		"\u0019\u0000\u0000\u0088\u008a\u0003\u0016\u000b\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u008f\u0005+\u0000\u0000\u008c\u008d\u0005\u0002"+
		"\u0000\u0000\u008d\u008e\u0005)\u0000\u0000\u008e\u0090\u0005\u0003\u0000"+
		"\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u009a\u0001\u0000\u0000\u0000\u0091\u0092\u0005\b\u0000\u0000"+
		"\u0092\u0096\u0005+\u0000\u0000\u0093\u0094\u0005\u0002\u0000\u0000\u0094"+
		"\u0095\u0005)\u0000\u0000\u0095\u0097\u0005\u0003\u0000\u0000\u0096\u0093"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099"+
		"\u0001\u0000\u0000\u0000\u0098\u0091\u0001\u0000\u0000\u0000\u0099\u009c"+
		"\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u00b2\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009d\u00b2\u0003\u001a\r\u0000\u009e\u009f\u0005"+
		"+\u0000\u0000\u009f\u00a1\u0005\u0005\u0000\u0000\u00a0\u00a2\u0003&\u0013"+
		"\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00ac\u0005\u0006\u0000"+
		"\u0000\u00a4\u00a9\u0005+\u0000\u0000\u00a5\u00a6\u0005\b\u0000\u0000"+
		"\u00a6\u00a8\u0005+\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8"+
		"\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ac\u00a4\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b2\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0003\u001c\u000e\u0000\u00af\u00b0\u0005\u0007\u0000\u0000\u00b0"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b1\u0085\u0001\u0000\u0000\u0000\u00b1"+
		"\u0089\u0001\u0000\u0000\u0000\u00b1\u009d\u0001\u0000\u0000\u0000\u00b1"+
		"\u009e\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000\u0000\u0000\u00b2"+
		"\u0015\u0001\u0000\u0000\u0000\u00b3\u00b6\u0003\u0018\f\u0000\u00b4\u00b6"+
		"\u0005\u001a\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u0017\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0007\u0002\u0000\u0000\u00b8\u00b9\u0005\u0005\u0000\u0000\u00b9\u00ba"+
		"\u0003&\u0013\u0000\u00ba\u00bb\u0005\u0006\u0000\u0000\u00bb\u0019\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005\u0011\u0000\u0000\u00bd\u00be\u0005"+
		"+\u0000\u0000\u00be\u00bf\u0005\u0012\u0000\u0000\u00bf\u00c0\u0005+\u0000"+
		"\u0000\u00c0\u001b\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0013\u0000"+
		"\u0000\u00c2\u00c3\u0005+\u0000\u0000\u00c3\u001d\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0005\u0014\u0000\u0000\u00c5\u00d1\u0003\u001c\u000e\u0000"+
		"\u00c6\u00c7\u0005\u0015\u0000\u0000\u00c7\u00c8\u0005+\u0000\u0000\u00c8"+
		"\u00c9\u0005\b\u0000\u0000\u00c9\u00d1\u0003\u001c\u000e\u0000\u00ca\u00cb"+
		"\u0005\u0016\u0000\u0000\u00cb\u00cc\u0005+\u0000\u0000\u00cc\u00cd\u0005"+
		"\b\u0000\u0000\u00cd\u00ce\u0005+\u0000\u0000\u00ce\u00cf\u0005\b\u0000"+
		"\u0000\u00cf\u00d1\u0003\u001c\u000e\u0000\u00d0\u00c4\u0001\u0000\u0000"+
		"\u0000\u00d0\u00c6\u0001\u0000\u0000\u0000\u00d0\u00ca\u0001\u0000\u0000"+
		"\u0000\u00d1\u001f\u0001\u0000\u0000\u0000\u00d2\u00db\u0003\u001e\u000f"+
		"\u0000\u00d3\u00d4\u0005\u0017\u0000\u0000\u00d4\u00db\u0005+\u0000\u0000"+
		"\u00d5\u00d6\u0005\u0018\u0000\u0000\u00d6\u00d7\u0005+\u0000\u0000\u00d7"+
		"\u00d8\u0005\n\u0000\u0000\u00d8\u00db\u0003\"\u0011\u0000\u00d9\u00db"+
		"\u0003$\u0012\u0000\u00da\u00d2\u0001\u0000\u0000\u0000\u00da\u00d3\u0001"+
		"\u0000\u0000\u0000\u00da\u00d5\u0001\u0000\u0000\u0000\u00da\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db!\u0001\u0000\u0000\u0000\u00dc\u00e6\u0005+\u0000"+
		"\u0000\u00dd\u00e6\u0005)\u0000\u0000\u00de\u00e6\u0005&\u0000\u0000\u00df"+
		"\u00e0\u0005\u0005\u0000\u0000\u00e0\u00e1\u0003\"\u0011\u0000\u00e1\u00e2"+
		"\u0005\u001c\u0000\u0000\u00e2\u00e3\u0003\"\u0011\u0000\u00e3\u00e4\u0005"+
		"\u0006\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e5\u00dd\u0001\u0000\u0000\u0000\u00e5\u00de\u0001"+
		"\u0000\u0000\u0000\u00e5\u00df\u0001\u0000\u0000\u0000\u00e6#\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0005!\u0000\u0000\u00e8\u00e9\u0005+\u0000\u0000"+
		"\u00e9\u00ea\u0005\n\u0000\u0000\u00ea\u00eb\u0003\"\u0011\u0000\u00eb"+
		"%\u0001\u0000\u0000\u0000\u00ec\u00f1\u0007\u0003\u0000\u0000\u00ed\u00ee"+
		"\u0005\b\u0000\u0000\u00ee\u00f0\u0007\u0003\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\'\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u0019.5;AGMWY\\`z}\u0089"+
		"\u008f\u0096\u009a\u00a1\u00a9\u00ac\u00b1\u00b5\u00d0\u00da\u00e5\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}