// Generated from g:/WORK/CODE/Chatbot_command_language/ChatBotCommand.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChatBotCommandParser}.
 */
public interface ChatBotCommandListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ChatBotCommandParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ChatBotCommandParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#createEventCommand}.
	 * @param ctx the parse tree
	 */
	void enterCreateEventCommand(ChatBotCommandParser.CreateEventCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#createEventCommand}.
	 * @param ctx the parse tree
	 */
	void exitCreateEventCommand(ChatBotCommandParser.CreateEventCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#showTasksCommand}.
	 * @param ctx the parse tree
	 */
	void enterShowTasksCommand(ChatBotCommandParser.ShowTasksCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#showTasksCommand}.
	 * @param ctx the parse tree
	 */
	void exitShowTasksCommand(ChatBotCommandParser.ShowTasksCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#updateEventCommand}.
	 * @param ctx the parse tree
	 */
	void enterUpdateEventCommand(ChatBotCommandParser.UpdateEventCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#updateEventCommand}.
	 * @param ctx the parse tree
	 */
	void exitUpdateEventCommand(ChatBotCommandParser.UpdateEventCommandContext ctx);
}