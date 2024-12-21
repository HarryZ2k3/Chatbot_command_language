// Generated from c:/Users/trieu/Downloads/Chatbot_command_language-main/Chatbot_command_language-main/ChatBotCommand.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ChatBotCommandLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, STRING=14, DATETIME=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "STRING", "DATETIME", "DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create'", "'event'", "'at'", "'show'", "'tasks'", "'update'", 
			"'change'", "'time'", "'to'", "'help'", "'for'", "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "STRING", "DATETIME", "WS"
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


	public ChatBotCommandLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ChatBotCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010\u0084\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rd\b\r\n\r\f\rg\t\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0004\u0010\u007f\b\u0010\u000b\u0010\f\u0010"+
		"\u0080\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0000!\u0010"+
		"\u0001\u0000\u0003\u0001\u0000\"\"\u0001\u000009\u0003\u0000\t\n\r\r "+
		" \u0084\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001"+
		"\u0000\u0000\u0000\u0003*\u0001\u0000\u0000\u0000\u00050\u0001\u0000\u0000"+
		"\u0000\u00073\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000\u0000\u000b"+
		">\u0001\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000fL\u0001\u0000"+
		"\u0000\u0000\u0011Q\u0001\u0000\u0000\u0000\u0013T\u0001\u0000\u0000\u0000"+
		"\u0015Y\u0001\u0000\u0000\u0000\u0017]\u0001\u0000\u0000\u0000\u0019_"+
		"\u0001\u0000\u0000\u0000\u001ba\u0001\u0000\u0000\u0000\u001dj\u0001\u0000"+
		"\u0000\u0000\u001f{\u0001\u0000\u0000\u0000!~\u0001\u0000\u0000\u0000"+
		"#$\u0005c\u0000\u0000$%\u0005r\u0000\u0000%&\u0005e\u0000\u0000&\'\u0005"+
		"a\u0000\u0000\'(\u0005t\u0000\u0000()\u0005e\u0000\u0000)\u0002\u0001"+
		"\u0000\u0000\u0000*+\u0005e\u0000\u0000+,\u0005v\u0000\u0000,-\u0005e"+
		"\u0000\u0000-.\u0005n\u0000\u0000./\u0005t\u0000\u0000/\u0004\u0001\u0000"+
		"\u0000\u000001\u0005a\u0000\u000012\u0005t\u0000\u00002\u0006\u0001\u0000"+
		"\u0000\u000034\u0005s\u0000\u000045\u0005h\u0000\u000056\u0005o\u0000"+
		"\u000067\u0005w\u0000\u00007\b\u0001\u0000\u0000\u000089\u0005t\u0000"+
		"\u00009:\u0005a\u0000\u0000:;\u0005s\u0000\u0000;<\u0005k\u0000\u0000"+
		"<=\u0005s\u0000\u0000=\n\u0001\u0000\u0000\u0000>?\u0005u\u0000\u0000"+
		"?@\u0005p\u0000\u0000@A\u0005d\u0000\u0000AB\u0005a\u0000\u0000BC\u0005"+
		"t\u0000\u0000CD\u0005e\u0000\u0000D\f\u0001\u0000\u0000\u0000EF\u0005"+
		"c\u0000\u0000FG\u0005h\u0000\u0000GH\u0005a\u0000\u0000HI\u0005n\u0000"+
		"\u0000IJ\u0005g\u0000\u0000JK\u0005e\u0000\u0000K\u000e\u0001\u0000\u0000"+
		"\u0000LM\u0005t\u0000\u0000MN\u0005i\u0000\u0000NO\u0005m\u0000\u0000"+
		"OP\u0005e\u0000\u0000P\u0010\u0001\u0000\u0000\u0000QR\u0005t\u0000\u0000"+
		"RS\u0005o\u0000\u0000S\u0012\u0001\u0000\u0000\u0000TU\u0005h\u0000\u0000"+
		"UV\u0005e\u0000\u0000VW\u0005l\u0000\u0000WX\u0005p\u0000\u0000X\u0014"+
		"\u0001\u0000\u0000\u0000YZ\u0005f\u0000\u0000Z[\u0005o\u0000\u0000[\\"+
		"\u0005r\u0000\u0000\\\u0016\u0001\u0000\u0000\u0000]^\u0005:\u0000\u0000"+
		"^\u0018\u0001\u0000\u0000\u0000_`\u0005,\u0000\u0000`\u001a\u0001\u0000"+
		"\u0000\u0000ae\u0005\"\u0000\u0000bd\b\u0000\u0000\u0000cb\u0001\u0000"+
		"\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"hi\u0005\"\u0000\u0000i\u001c\u0001\u0000\u0000\u0000jk\u0003\u001f\u000f"+
		"\u0000kl\u0003\u001f\u000f\u0000lm\u0003\u001f\u000f\u0000mn\u0003\u001f"+
		"\u000f\u0000no\u0005-\u0000\u0000op\u0003\u001f\u000f\u0000pq\u0003\u001f"+
		"\u000f\u0000qr\u0005-\u0000\u0000rs\u0003\u001f\u000f\u0000st\u0003\u001f"+
		"\u000f\u0000tu\u0005 \u0000\u0000uv\u0003\u001f\u000f\u0000vw\u0003\u001f"+
		"\u000f\u0000wx\u0005:\u0000\u0000xy\u0003\u001f\u000f\u0000yz\u0003\u001f"+
		"\u000f\u0000z\u001e\u0001\u0000\u0000\u0000{|\u0007\u0001\u0000\u0000"+
		"| \u0001\u0000\u0000\u0000}\u007f\u0007\u0002\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0006\u0010\u0000\u0000\u0083\"\u0001\u0000\u0000\u0000"+
		"\u0003\u0000e\u0080\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}