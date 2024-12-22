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
	 * Enter a parse tree produced by {@link ChatBotCommandParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void enterCreateEvent(ChatBotCommandParser.CreateEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void exitCreateEvent(ChatBotCommandParser.CreateEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#showTasks}.
	 * @param ctx the parse tree
	 */
	void enterShowTasks(ChatBotCommandParser.ShowTasksContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#showTasks}.
	 * @param ctx the parse tree
	 */
	void exitShowTasks(ChatBotCommandParser.ShowTasksContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#updateEvent}.
	 * @param ctx the parse tree
	 */
	void enterUpdateEvent(ChatBotCommandParser.UpdateEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#updateEvent}.
	 * @param ctx the parse tree
	 */
	void exitUpdateEvent(ChatBotCommandParser.UpdateEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#helpCommand}.
	 * @param ctx the parse tree
	 */
	void enterHelpCommand(ChatBotCommandParser.HelpCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#helpCommand}.
	 * @param ctx the parse tree
	 */
	void exitHelpCommand(ChatBotCommandParser.HelpCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#showEvent}.
	 * @param ctx the parse tree
	 */
	void enterShowEvent(ChatBotCommandParser.ShowEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#showEvent}.
	 * @param ctx the parse tree
	 */
	void exitShowEvent(ChatBotCommandParser.ShowEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#createTasks}.
	 * @param ctx the parse tree
	 */
	void enterCreateTasks(ChatBotCommandParser.CreateTasksContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#createTasks}.
	 * @param ctx the parse tree
	 */
	void exitCreateTasks(ChatBotCommandParser.CreateTasksContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#timeToEvent}.
	 * @param ctx the parse tree
	 */
	void enterTimeToEvent(ChatBotCommandParser.TimeToEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#timeToEvent}.
	 * @param ctx the parse tree
	 */
	void exitTimeToEvent(ChatBotCommandParser.TimeToEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#partialCreateCommand}.
	 * @param ctx the parse tree
	 */
	void enterPartialCreateCommand(ChatBotCommandParser.PartialCreateCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#partialCreateCommand}.
	 * @param ctx the parse tree
	 */
	void exitPartialCreateCommand(ChatBotCommandParser.PartialCreateCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#partialTimeTo}.
	 * @param ctx the parse tree
	 */
	void enterPartialTimeTo(ChatBotCommandParser.PartialTimeToContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#partialTimeTo}.
	 * @param ctx the parse tree
	 */
	void exitPartialTimeTo(ChatBotCommandParser.PartialTimeToContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#partialUpdate}.
	 * @param ctx the parse tree
	 */
	void enterPartialUpdate(ChatBotCommandParser.PartialUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#partialUpdate}.
	 * @param ctx the parse tree
	 */
	void exitPartialUpdate(ChatBotCommandParser.PartialUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#partialShow}.
	 * @param ctx the parse tree
	 */
	void enterPartialShow(ChatBotCommandParser.PartialShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#partialShow}.
	 * @param ctx the parse tree
	 */
	void exitPartialShow(ChatBotCommandParser.PartialShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#partialCreate}.
	 * @param ctx the parse tree
	 */
	void enterPartialCreate(ChatBotCommandParser.PartialCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#partialCreate}.
	 * @param ctx the parse tree
	 */
	void exitPartialCreate(ChatBotCommandParser.PartialCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#afterCreate}.
	 * @param ctx the parse tree
	 */
	void enterAfterCreate(ChatBotCommandParser.AfterCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#afterCreate}.
	 * @param ctx the parse tree
	 */
	void exitAfterCreate(ChatBotCommandParser.AfterCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#partialEvent}.
	 * @param ctx the parse tree
	 */
	void enterPartialEvent(ChatBotCommandParser.PartialEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#partialEvent}.
	 * @param ctx the parse tree
	 */
	void exitPartialEvent(ChatBotCommandParser.PartialEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatBotCommandParser#partialTask}.
	 * @param ctx the parse tree
	 */
	void enterPartialTask(ChatBotCommandParser.PartialTaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotCommandParser#partialTask}.
	 * @param ctx the parse tree
	 */
	void exitPartialTask(ChatBotCommandParser.PartialTaskContext ctx);
}