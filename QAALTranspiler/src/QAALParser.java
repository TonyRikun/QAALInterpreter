// Generated from C:/Users/Anton/Documents/Code/QAALInterpreter/ANTLR\QAAL.g4 by ANTLR 4.10.1
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
		T__17=18, True=19, False=20, CompExp=21, NumExp=22, BooleExp=23, Int=24, 
		Bool=25, Unit=26, Keywords=27, Intlit=28, Idfr=29, WS=30;
	public static final int
		RULE_prog = 0, RULE_dec = 1, RULE_vardec = 2, RULE_body = 3, RULE_block = 4, 
		RULE_ene = 5, RULE_exp = 6, RULE_args = 7, RULE_binop = 8, RULE_type = 9, 
		RULE_boolit = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dec", "vardec", "body", "block", "ene", "exp", "args", "binop", 
			"type", "boolit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'{'", "':='", "';'", "'}'", "'if'", "'then'", 
			"'else'", "'while'", "'do'", "'repeat'", "'until'", "'print'", "'space'", 
			"'newline'", "'skip'", "'true'", "'false'", null, null, null, "'int'", 
			"'bool'", "'unit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "True", "False", "CompExp", 
			"NumExp", "BooleExp", "Int", "Bool", "Unit", "Keywords", "Intlit", "Idfr", 
			"WS"
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
		public TerminalNode EOF() { return getToken(QAALParser.EOF, 0); }
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
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
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				dec();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << Unit))) != 0) );
			setState(27);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			type();
			setState(30);
			match(Idfr);
			setState(31);
			match(T__0);
			setState(32);
			vardec();
			setState(33);
			match(T__1);
			setState(34);
			body();
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
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
		enterRule(_localctx, 4, RULE_vardec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << Unit))) != 0)) {
				{
				setState(36);
				type();
				setState(37);
				match(Idfr);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(38);
					match(T__2);
					setState(39);
					type();
					setState(40);
					match(Idfr);
					}
					}
					setState(46);
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

	public static class BodyContext extends ParserRuleContext {
		public EneContext ene() {
			return getRuleContext(EneContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Idfr() { return getTokens(QAALParser.Idfr); }
		public TerminalNode Idfr(int i) {
			return getToken(QAALParser.Idfr, i);
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
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__3);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << Unit))) != 0)) {
				{
				{
				setState(50);
				type();
				setState(51);
				match(Idfr);
				setState(52);
				match(T__4);
				setState(53);
				exp();
				setState(54);
				match(T__5);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			ene();
			setState(62);
			match(T__6);
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

	public static class BlockContext extends ParserRuleContext {
		public EneContext ene() {
			return getRuleContext(EneContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__3);
			setState(65);
			ene();
			setState(66);
			match(T__6);
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

	public static class EneContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public EneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterEne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitEne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitEne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EneContext ene() throws RecognitionException {
		EneContext _localctx = new EneContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ene);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			exp();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(69);
				match(T__5);
				setState(70);
				exp();
				}
				}
				setState(75);
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
	public static class BoolExpContext extends ExpContext {
		public BoolitContext boolit() {
			return getRuleContext(BoolitContext.class,0);
		}
		public BoolExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterBoolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitBoolExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitBoolExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatExpContext extends ExpContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RepeatExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterRepeatExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitRepeatExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitRepeatExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterPrintExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitPrintExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitPrintExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgExpContext extends ExpContext {
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterArgExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitArgExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitArgExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipExpContext extends ExpContext {
		public SkipExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterSkipExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitSkipExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitSkipExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdfrExpContext extends ExpContext {
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public IdfrExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterIdfrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitIdfrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitIdfrExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockExpContext extends ExpContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterBlockExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitBlockExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitBlockExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterWhileExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitWhileExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitWhileExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExpContext extends ExpContext {
		public TerminalNode Idfr() { return getToken(QAALParser.Idfr, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterAssignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitAssignExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitAssignExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinopExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public BinopExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterBinopExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitBinopExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitBinopExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterIfExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitIfExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitIfExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpaceExpContext extends ExpContext {
		public SpaceExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterSpaceExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitSpaceExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitSpaceExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExpContext extends ExpContext {
		public TerminalNode Intlit() { return getToken(QAALParser.Intlit, 0); }
		public IntExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterIntExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitIntExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitIntExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewlineExpContext extends ExpContext {
		public NewlineExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterNewlineExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitNewlineExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitNewlineExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exp);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IdfrExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(Idfr);
				}
				break;
			case 2:
				_localctx = new IntExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(Intlit);
				}
				break;
			case 3:
				_localctx = new BoolExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				boolit();
				}
				break;
			case 4:
				_localctx = new AssignExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(Idfr);
				setState(80);
				match(T__4);
				setState(81);
				exp();
				}
				break;
			case 5:
				_localctx = new BinopExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				match(T__0);
				setState(83);
				exp();
				setState(84);
				binop();
				setState(85);
				exp();
				setState(86);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new ArgExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				match(Idfr);
				setState(89);
				match(T__0);
				setState(90);
				args();
				setState(91);
				match(T__1);
				}
				break;
			case 7:
				_localctx = new BlockExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				block();
				}
				break;
			case 8:
				_localctx = new IfExpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				match(T__7);
				setState(95);
				exp();
				setState(96);
				match(T__8);
				setState(97);
				block();
				setState(98);
				match(T__9);
				setState(99);
				block();
				}
				break;
			case 9:
				_localctx = new WhileExpContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				match(T__10);
				setState(102);
				exp();
				setState(103);
				match(T__11);
				setState(104);
				block();
				}
				break;
			case 10:
				_localctx = new RepeatExpContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(106);
				match(T__12);
				setState(107);
				block();
				setState(108);
				match(T__13);
				setState(109);
				exp();
				}
				break;
			case 11:
				_localctx = new PrintExpContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(111);
				match(T__14);
				setState(112);
				exp();
				}
				break;
			case 12:
				_localctx = new SpaceExpContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(113);
				match(T__15);
				}
				break;
			case 13:
				_localctx = new NewlineExpContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(114);
				match(T__16);
				}
				break;
			case 14:
				_localctx = new SkipExpContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(115);
				match(T__17);
				}
				break;
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
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
		enterRule(_localctx, 14, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << True) | (1L << False) | (1L << Intlit) | (1L << Idfr))) != 0)) {
				{
				setState(118);
				exp();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(119);
					match(T__2);
					setState(120);
					exp();
					}
					}
					setState(125);
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

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode CompExp() { return getToken(QAALParser.CompExp, 0); }
		public TerminalNode NumExp() { return getToken(QAALParser.NumExp, 0); }
		public TerminalNode BooleExp() { return getToken(QAALParser.BooleExp, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CompExp) | (1L << NumExp) | (1L << BooleExp))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(QAALParser.Int, 0); }
		public TerminalNode Bool() { return getToken(QAALParser.Bool, 0); }
		public TerminalNode Unit() { return getToken(QAALParser.Unit, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << Unit))) != 0)) ) {
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

	public static class BoolitContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(QAALParser.True, 0); }
		public TerminalNode False() { return getToken(QAALParser.False, 0); }
		public BoolitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).enterBoolit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAALListener ) ((QAALListener)listener).exitBoolit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAALVisitor ) return ((QAALVisitor<? extends T>)visitor).visitBoolit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolitContext boolit() throws RecognitionException {
		BoolitContext _localctx = new BoolitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==True || _la==False) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u0087\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000"+
		"\u0018\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002+\b\u0002\n\u0002\f\u0002.\t\u0002\u0003\u00020\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u00039\b\u0003\n\u0003\f\u0003<\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005H\b\u0005\n\u0005\f\u0005"+
		"K\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"u\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007z\b\u0007\n\u0007"+
		"\f\u0007}\t\u0007\u0003\u0007\u007f\b\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0000\u0003\u0001\u0000\u0015\u0017\u0001"+
		"\u0000\u0018\u001a\u0001\u0000\u0013\u0014\u008f\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000"+
		"\u0000\u00061\u0001\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nD\u0001"+
		"\u0000\u0000\u0000\ft\u0001\u0000\u0000\u0000\u000e~\u0001\u0000\u0000"+
		"\u0000\u0010\u0080\u0001\u0000\u0000\u0000\u0012\u0082\u0001\u0000\u0000"+
		"\u0000\u0014\u0084\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001"+
		"\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000"+
		"\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0003\u0012\t\u0000"+
		"\u001e\u001f\u0005\u001d\u0000\u0000\u001f \u0005\u0001\u0000\u0000 !"+
		"\u0003\u0004\u0002\u0000!\"\u0005\u0002\u0000\u0000\"#\u0003\u0006\u0003"+
		"\u0000#\u0003\u0001\u0000\u0000\u0000$%\u0003\u0012\t\u0000%,\u0005\u001d"+
		"\u0000\u0000&\'\u0005\u0003\u0000\u0000\'(\u0003\u0012\t\u0000()\u0005"+
		"\u001d\u0000\u0000)+\u0001\u0000\u0000\u0000*&\u0001\u0000\u0000\u0000"+
		"+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/$\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u00000\u0005\u0001\u0000\u0000\u0000"+
		"1:\u0005\u0004\u0000\u000023\u0003\u0012\t\u000034\u0005\u001d\u0000\u0000"+
		"45\u0005\u0005\u0000\u000056\u0003\f\u0006\u000067\u0005\u0006\u0000\u0000"+
		"79\u0001\u0000\u0000\u000082\u0001\u0000\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0003\n\u0005\u0000>?\u0005\u0007"+
		"\u0000\u0000?\u0007\u0001\u0000\u0000\u0000@A\u0005\u0004\u0000\u0000"+
		"AB\u0003\n\u0005\u0000BC\u0005\u0007\u0000\u0000C\t\u0001\u0000\u0000"+
		"\u0000DI\u0003\f\u0006\u0000EF\u0005\u0006\u0000\u0000FH\u0003\f\u0006"+
		"\u0000GE\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u000b\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000Lu\u0005\u001d\u0000\u0000Mu\u0005\u001c\u0000"+
		"\u0000Nu\u0003\u0014\n\u0000OP\u0005\u001d\u0000\u0000PQ\u0005\u0005\u0000"+
		"\u0000Qu\u0003\f\u0006\u0000RS\u0005\u0001\u0000\u0000ST\u0003\f\u0006"+
		"\u0000TU\u0003\u0010\b\u0000UV\u0003\f\u0006\u0000VW\u0005\u0002\u0000"+
		"\u0000Wu\u0001\u0000\u0000\u0000XY\u0005\u001d\u0000\u0000YZ\u0005\u0001"+
		"\u0000\u0000Z[\u0003\u000e\u0007\u0000[\\\u0005\u0002\u0000\u0000\\u\u0001"+
		"\u0000\u0000\u0000]u\u0003\b\u0004\u0000^_\u0005\b\u0000\u0000_`\u0003"+
		"\f\u0006\u0000`a\u0005\t\u0000\u0000ab\u0003\b\u0004\u0000bc\u0005\n\u0000"+
		"\u0000cd\u0003\b\u0004\u0000du\u0001\u0000\u0000\u0000ef\u0005\u000b\u0000"+
		"\u0000fg\u0003\f\u0006\u0000gh\u0005\f\u0000\u0000hi\u0003\b\u0004\u0000"+
		"iu\u0001\u0000\u0000\u0000jk\u0005\r\u0000\u0000kl\u0003\b\u0004\u0000"+
		"lm\u0005\u000e\u0000\u0000mn\u0003\f\u0006\u0000nu\u0001\u0000\u0000\u0000"+
		"op\u0005\u000f\u0000\u0000pu\u0003\f\u0006\u0000qu\u0005\u0010\u0000\u0000"+
		"ru\u0005\u0011\u0000\u0000su\u0005\u0012\u0000\u0000tL\u0001\u0000\u0000"+
		"\u0000tM\u0001\u0000\u0000\u0000tN\u0001\u0000\u0000\u0000tO\u0001\u0000"+
		"\u0000\u0000tR\u0001\u0000\u0000\u0000tX\u0001\u0000\u0000\u0000t]\u0001"+
		"\u0000\u0000\u0000t^\u0001\u0000\u0000\u0000te\u0001\u0000\u0000\u0000"+
		"tj\u0001\u0000\u0000\u0000to\u0001\u0000\u0000\u0000tq\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000u\r\u0001\u0000"+
		"\u0000\u0000v{\u0003\f\u0006\u0000wx\u0005\u0003\u0000\u0000xz\u0003\f"+
		"\u0006\u0000yw\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000~v\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000\u007f\u000f\u0001\u0000\u0000\u0000\u0080\u0081\u0007"+
		"\u0000\u0000\u0000\u0081\u0011\u0001\u0000\u0000\u0000\u0082\u0083\u0007"+
		"\u0001\u0000\u0000\u0083\u0013\u0001\u0000\u0000\u0000\u0084\u0085\u0007"+
		"\u0002\u0000\u0000\u0085\u0015\u0001\u0000\u0000\u0000\b\u0019,/:It{~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}