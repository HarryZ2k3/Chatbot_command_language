// Generated from c:/Users/trieu/Downloads/Chatbot_command_language-main/Chatbot_command_language-main/ChatBotCommand.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ChatBotCommandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, STRING=34, DATETIME=35, WS=36;
	public static final int
		RULE_command = 0, RULE_createEvent = 1, RULE_showTasks = 2, RULE_updateEvent = 3, 
		RULE_helpCommand = 4, RULE_showEvent = 5, RULE_createTasks = 6, RULE_timeToEvent = 7, 
		RULE_partialCreateCommand = 8, RULE_partialTimeTo = 9, RULE_partialUpdate = 10, 
		RULE_partialShow = 11, RULE_partialCreate = 12, RULE_afterCreate = 13, 
		RULE_partialEvent = 14, RULE_partialTask = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"command", "createEvent", "showTasks", "updateEvent", "helpCommand", 
			"showEvent", "createTasks", "timeToEvent", "partialCreateCommand", "partialTimeTo", 
			"partialUpdate", "partialShow", "partialCreate", "afterCreate", "partialEvent", 
			"partialTask"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create'", "'event'", "'at'", "'show'", "'tasks'", "'update'", 
			"'change'", "'time'", "'to'", "'help'", "'for'", "':'", "','", "'t'", 
			"'i'", "'m'", "'e'", "'u'", "'p'", "'d'", "'a'", "'s'", "'h'", "'o'", 
			"'w'", "'c'", "'r'", "'ev'", "'eve'", "'even'", "'ta'", "'tas'", "'task'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"DATETIME", "WS"
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
	public String getGrammarFileName() { return "ChatBotCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ChatBotCommandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public CreateEventContext createEvent() {
			return getRuleContext(CreateEventContext.class,0);
		}
		public ShowTasksContext showTasks() {
			return getRuleContext(ShowTasksContext.class,0);
		}
		public UpdateEventContext updateEvent() {
			return getRuleContext(UpdateEventContext.class,0);
		}
		public HelpCommandContext helpCommand() {
			return getRuleContext(HelpCommandContext.class,0);
		}
		public ShowEventContext showEvent() {
			return getRuleContext(ShowEventContext.class,0);
		}
		public CreateTasksContext createTasks() {
			return getRuleContext(CreateTasksContext.class,0);
		}
		public TimeToEventContext timeToEvent() {
			return getRuleContext(TimeToEventContext.class,0);
		}
		public PartialCreateCommandContext partialCreateCommand() {
			return getRuleContext(PartialCreateCommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				createEvent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				showTasks();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				updateEvent();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				helpCommand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				showEvent();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
				createTasks();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(38);
				timeToEvent();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(39);
				partialCreateCommand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateEventContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ChatBotCommandParser.STRING, 0); }
		public TerminalNode DATETIME() { return getToken(ChatBotCommandParser.DATETIME, 0); }
		public CreateEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createEvent; }
	}

	public final CreateEventContext createEvent() throws RecognitionException {
		CreateEventContext _localctx = new CreateEventContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			match(T__1);
			setState(44);
			match(STRING);
			setState(45);
			match(T__2);
			setState(46);
			match(DATETIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShowTasksContext extends ParserRuleContext {
		public ShowTasksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTasks; }
	}

	public final ShowTasksContext showTasks() throws RecognitionException {
		ShowTasksContext _localctx = new ShowTasksContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_showTasks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__3);
			setState(49);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateEventContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ChatBotCommandParser.STRING, 0); }
		public TerminalNode DATETIME() { return getToken(ChatBotCommandParser.DATETIME, 0); }
		public UpdateEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateEvent; }
	}

	public final UpdateEventContext updateEvent() throws RecognitionException {
		UpdateEventContext _localctx = new UpdateEventContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_updateEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__5);
			setState(52);
			match(T__1);
			setState(53);
			match(STRING);
			setState(54);
			match(T__6);
			setState(55);
			match(T__7);
			setState(56);
			match(T__8);
			setState(57);
			match(DATETIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HelpCommandContext extends ParserRuleContext {
		public HelpCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helpCommand; }
	}

	public final HelpCommandContext helpCommand() throws RecognitionException {
		HelpCommandContext _localctx = new HelpCommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_helpCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShowEventContext extends ParserRuleContext {
		public ShowEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showEvent; }
	}

	public final ShowEventContext showEvent() throws RecognitionException {
		ShowEventContext _localctx = new ShowEventContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_showEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__3);
			setState(62);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTasksContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(ChatBotCommandParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ChatBotCommandParser.STRING, i);
		}
		public CreateTasksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTasks; }
	}

	public final CreateTasksContext createTasks() throws RecognitionException {
		CreateTasksContext _localctx = new CreateTasksContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createTasks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__0);
			setState(65);
			match(T__4);
			setState(66);
			match(T__10);
			setState(67);
			match(STRING);
			setState(68);
			match(T__11);
			setState(69);
			match(STRING);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(70);
				match(T__12);
				setState(71);
				match(STRING);
				}
				}
				setState(76);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TimeToEventContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ChatBotCommandParser.STRING, 0); }
		public TimeToEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeToEvent; }
	}

	public final TimeToEventContext timeToEvent() throws RecognitionException {
		TimeToEventContext _localctx = new TimeToEventContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_timeToEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__7);
			setState(78);
			match(T__8);
			setState(79);
			match(T__1);
			setState(80);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartialCreateCommandContext extends ParserRuleContext {
		public PartialCreateContext partialCreate() {
			return getRuleContext(PartialCreateContext.class,0);
		}
		public AfterCreateContext afterCreate() {
			return getRuleContext(AfterCreateContext.class,0);
		}
		public PartialShowContext partialShow() {
			return getRuleContext(PartialShowContext.class,0);
		}
		public PartialUpdateContext partialUpdate() {
			return getRuleContext(PartialUpdateContext.class,0);
		}
		public PartialTimeToContext partialTimeTo() {
			return getRuleContext(PartialTimeToContext.class,0);
		}
		public PartialCreateCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialCreateCommand; }
	}

	public final PartialCreateCommandContext partialCreateCommand() throws RecognitionException {
		PartialCreateCommandContext _localctx = new PartialCreateCommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_partialCreateCommand);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				partialCreate();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911581220L) != 0)) {
					{
					setState(83);
					afterCreate();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==T__21) {
					{
					setState(86);
					partialShow();
					setState(87);
					afterCreate();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5 || _la==T__17) {
					{
					setState(91);
					partialUpdate();
					setState(92);
					afterCreate();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7 || _la==T__13) {
					{
					setState(96);
					partialTimeTo();
					setState(97);
					afterCreate();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class PartialTimeToContext extends ParserRuleContext {
		public PartialTimeToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialTimeTo; }
	}

	public final PartialTimeToContext partialTimeTo() throws RecognitionException {
		PartialTimeToContext _localctx = new PartialTimeToContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_partialTimeTo);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(T__13);
				{
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(104);
					match(T__14);
					}
				}

				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(107);
					match(T__15);
					}
				}

				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(110);
					match(T__16);
					}
					break;
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(113);
					match(T__8);
					}
				}

				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__7);
				setState(117);
				match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartialUpdateContext extends ParserRuleContext {
		public PartialUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialUpdate; }
	}

	public final PartialUpdateContext partialUpdate() throws RecognitionException {
		PartialUpdateContext _localctx = new PartialUpdateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_partialUpdate);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(T__17);
				{
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(121);
					match(T__18);
					}
				}

				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(124);
					match(T__19);
					}
				}

				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(127);
					match(T__20);
					}
				}

				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(130);
					match(T__13);
					}
					break;
				}
				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(133);
					match(T__16);
					}
					break;
				}
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartialShowContext extends ParserRuleContext {
		public PartialShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialShow; }
	}

	public final PartialShowContext partialShow() throws RecognitionException {
		PartialShowContext _localctx = new PartialShowContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_partialShow);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(T__21);
				{
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(140);
					match(T__22);
					}
				}

				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(143);
					match(T__23);
					}
				}

				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(146);
					match(T__24);
					}
				}

				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartialCreateContext extends ParserRuleContext {
		public PartialCreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialCreate; }
	}

	public final PartialCreateContext partialCreate() throws RecognitionException {
		PartialCreateContext _localctx = new PartialCreateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_partialCreate);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(T__25);
				{
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(153);
					match(T__26);
					}
				}

				setState(157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(156);
					match(T__16);
					}
					break;
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(159);
					match(T__20);
					}
				}

				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(162);
					match(T__13);
					}
					break;
				}
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(165);
					match(T__16);
					}
					break;
				}
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AfterCreateContext extends ParserRuleContext {
		public PartialTaskContext partialTask() {
			return getRuleContext(PartialTaskContext.class,0);
		}
		public PartialEventContext partialEvent() {
			return getRuleContext(PartialEventContext.class,0);
		}
		public AfterCreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afterCreate; }
	}

	public final AfterCreateContext afterCreate() throws RecognitionException {
		AfterCreateContext _localctx = new AfterCreateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_afterCreate);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__13:
			case T__30:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				partialTask();
				}
				break;
			case T__1:
			case T__16:
			case T__27:
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				partialEvent();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartialEventContext extends ParserRuleContext {
		public PartialEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialEvent; }
	}

	public final PartialEventContext partialEvent() throws RecognitionException {
		PartialEventContext _localctx = new PartialEventContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_partialEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879179268L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartialTaskContext extends ParserRuleContext {
		public PartialTaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialTask; }
	}

	public final PartialTaskContext partialTask() throws RecognitionException {
		PartialTaskContext _localctx = new PartialTaskContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_partialTask);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032401952L) != 0)) ) {
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
		"\u0004\u0001$\u00b4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000)\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006I\b\u0006"+
		"\n\u0006\f\u0006L\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0003\bU\b\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bZ\b\b\u0001\b\u0001\b\u0001\b\u0003\b_\b\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bd\b\b\u0003\bf\b\b\u0001\t\u0001\t\u0003\tj\b\t\u0001\t\u0003\tm\b\t"+
		"\u0001\t\u0003\tp\b\t\u0001\t\u0003\ts\b\t\u0001\t\u0001\t\u0003\tw\b"+
		"\t\u0001\n\u0001\n\u0003\n{\b\n\u0001\n\u0003\n~\b\n\u0001\n\u0003\n\u0081"+
		"\b\n\u0001\n\u0003\n\u0084\b\n\u0001\n\u0003\n\u0087\b\n\u0001\n\u0003"+
		"\n\u008a\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u008e\b\u000b\u0001\u000b"+
		"\u0003\u000b\u0091\b\u000b\u0001\u000b\u0003\u000b\u0094\b\u000b\u0001"+
		"\u000b\u0003\u000b\u0097\b\u000b\u0001\f\u0001\f\u0003\f\u009b\b\f\u0001"+
		"\f\u0003\f\u009e\b\f\u0001\f\u0003\f\u00a1\b\f\u0001\f\u0003\f\u00a4\b"+
		"\f\u0001\f\u0003\f\u00a7\b\f\u0001\f\u0003\f\u00aa\b\f\u0001\r\u0001\r"+
		"\u0003\r\u00ae\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0002\u0003\u0000\u0002\u0002"+
		"\u0011\u0011\u001c\u001e\u0003\u0000\u0005\u0005\u000e\u000e\u001f!\u00c8"+
		"\u0000(\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u00040"+
		"\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b;\u0001\u0000"+
		"\u0000\u0000\n=\u0001\u0000\u0000\u0000\f@\u0001\u0000\u0000\u0000\u000e"+
		"M\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000\u0012v\u0001"+
		"\u0000\u0000\u0000\u0014\u0089\u0001\u0000\u0000\u0000\u0016\u0096\u0001"+
		"\u0000\u0000\u0000\u0018\u00a9\u0001\u0000\u0000\u0000\u001a\u00ad\u0001"+
		"\u0000\u0000\u0000\u001c\u00af\u0001\u0000\u0000\u0000\u001e\u00b1\u0001"+
		"\u0000\u0000\u0000 )\u0003\u0002\u0001\u0000!)\u0003\u0004\u0002\u0000"+
		"\")\u0003\u0006\u0003\u0000#)\u0003\b\u0004\u0000$)\u0003\n\u0005\u0000"+
		"%)\u0003\f\u0006\u0000&)\u0003\u000e\u0007\u0000\')\u0003\u0010\b\u0000"+
		"( \u0001\u0000\u0000\u0000(!\u0001\u0000\u0000\u0000(\"\u0001\u0000\u0000"+
		"\u0000(#\u0001\u0000\u0000\u0000($\u0001\u0000\u0000\u0000(%\u0001\u0000"+
		"\u0000\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0001"+
		"\u0001\u0000\u0000\u0000*+\u0005\u0001\u0000\u0000+,\u0005\u0002\u0000"+
		"\u0000,-\u0005\"\u0000\u0000-.\u0005\u0003\u0000\u0000./\u0005#\u0000"+
		"\u0000/\u0003\u0001\u0000\u0000\u000001\u0005\u0004\u0000\u000012\u0005"+
		"\u0005\u0000\u00002\u0005\u0001\u0000\u0000\u000034\u0005\u0006\u0000"+
		"\u000045\u0005\u0002\u0000\u000056\u0005\"\u0000\u000067\u0005\u0007\u0000"+
		"\u000078\u0005\b\u0000\u000089\u0005\t\u0000\u00009:\u0005#\u0000\u0000"+
		":\u0007\u0001\u0000\u0000\u0000;<\u0005\n\u0000\u0000<\t\u0001\u0000\u0000"+
		"\u0000=>\u0005\u0004\u0000\u0000>?\u0005\u0002\u0000\u0000?\u000b\u0001"+
		"\u0000\u0000\u0000@A\u0005\u0001\u0000\u0000AB\u0005\u0005\u0000\u0000"+
		"BC\u0005\u000b\u0000\u0000CD\u0005\"\u0000\u0000DE\u0005\f\u0000\u0000"+
		"EJ\u0005\"\u0000\u0000FG\u0005\r\u0000\u0000GI\u0005\"\u0000\u0000HF\u0001"+
		"\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000K\r\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000MN\u0005\b\u0000\u0000NO\u0005\t\u0000\u0000OP\u0005\u0002\u0000"+
		"\u0000PQ\u0005\"\u0000\u0000Q\u000f\u0001\u0000\u0000\u0000RT\u0003\u0018"+
		"\f\u0000SU\u0003\u001a\r\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000Uf\u0001\u0000\u0000\u0000VW\u0003\u0016\u000b\u0000WX\u0003"+
		"\u001a\r\u0000XZ\u0001\u0000\u0000\u0000YV\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Zf\u0001\u0000\u0000\u0000[\\\u0003\u0014\n\u0000\\"+
		"]\u0003\u001a\r\u0000]_\u0001\u0000\u0000\u0000^[\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_f\u0001\u0000\u0000\u0000`a\u0003\u0012\t\u0000"+
		"ab\u0003\u001a\r\u0000bd\u0001\u0000\u0000\u0000c`\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000eR\u0001\u0000\u0000"+
		"\u0000eY\u0001\u0000\u0000\u0000e^\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000f\u0011\u0001\u0000\u0000\u0000gi\u0005\u000e\u0000\u0000"+
		"hj\u0005\u000f\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jl\u0001\u0000\u0000\u0000km\u0005\u0010\u0000\u0000lk\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000np\u0005"+
		"\u0011\u0000\u0000on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pr\u0001\u0000\u0000\u0000qs\u0005\t\u0000\u0000rq\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000sw\u0001\u0000\u0000\u0000tu\u0005\b\u0000\u0000"+
		"uw\u0005\t\u0000\u0000vg\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"w\u0013\u0001\u0000\u0000\u0000xz\u0005\u0012\u0000\u0000y{\u0005\u0013"+
		"\u0000\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001"+
		"\u0000\u0000\u0000|~\u0005\u0014\u0000\u0000}|\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f\u0081"+
		"\u0005\u0015\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0005\u000e\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0087"+
		"\u0005\u0011\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u008a"+
		"\u0005\u0006\u0000\u0000\u0089x\u0001\u0000\u0000\u0000\u0089\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u0015\u0001\u0000\u0000\u0000\u008b\u008d\u0005"+
		"\u0016\u0000\u0000\u008c\u008e\u0005\u0017\u0000\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0005\u0018\u0000\u0000\u0090\u008f\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001"+
		"\u0000\u0000\u0000\u0092\u0094\u0005\u0019\u0000\u0000\u0093\u0092\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0097\u0001"+
		"\u0000\u0000\u0000\u0095\u0097\u0005\u0004\u0000\u0000\u0096\u008b\u0001"+
		"\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0017\u0001"+
		"\u0000\u0000\u0000\u0098\u009a\u0005\u001a\u0000\u0000\u0099\u009b\u0005"+
		"\u001b\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u009e\u0005"+
		"\u0011\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u00a1\u0005"+
		"\u0015\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005"+
		"\u000e\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a7\u0005"+
		"\u0011\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00aa\u0005"+
		"\u0001\u0000\u0000\u00a9\u0098\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001"+
		"\u0000\u0000\u0000\u00aa\u0019\u0001\u0000\u0000\u0000\u00ab\u00ae\u0003"+
		"\u001e\u000f\u0000\u00ac\u00ae\u0003\u001c\u000e\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u001b\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0007\u0000\u0000\u0000\u00b0\u001d\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0007\u0001\u0000\u0000\u00b2\u001f\u0001"+
		"\u0000\u0000\u0000\u001d(JTY^ceilorvz}\u0080\u0083\u0086\u0089\u008d\u0090"+
		"\u0093\u0096\u009a\u009d\u00a0\u00a3\u00a6\u00a9\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}