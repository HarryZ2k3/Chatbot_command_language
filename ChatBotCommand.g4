grammar ChatBotCommand;

// Entry point
command:
	createEvent
	| showTasks
	| updateEvent
	| helpCommand
	| showEvent
	| createTasks
	| timeToEvent
	| partialCreateCommand
	| greetingCommand; //For greeting the bot

// Rules for specific commands
createEvent: 'create' 'event' STRING 'at' DATETIME;

showTasks: 'show' 'tasks';

updateEvent:
	'update' 'event' STRING 'change' 'time' 'to' DATETIME;

helpCommand: 'help';

showEvent: 'show' 'event';

createTasks:
	'create' 'tasks' 'for' STRING ':' STRING (',' STRING)*;

timeToEvent: 'time' 'to' 'event' STRING;

greetingCommand: ('hi' | 'hello' | 'hey') (',' STRING)? # Greeting;

// Grammar for partial matching
partialCreateCommand:
	partialCreate afterCreate?
	| (partialShow afterCreate)?
	| (partialUpdate afterCreate)?
	| (partialTimeTo afterCreate)?
	| (partialGreeting afterCreate)?;

partialTimeTo: 't' ('i'? 'm'? 'e'?) 'to'? | 'time' 'to';

partialUpdate: 'u' ('p'? 'd'? 'a'? 't'? 'e'?) | 'update';

// Partial matching for "create"
partialShow: 's' ('h'? 'o'? 'w'?) | 'show';

// Partial matching for "create"
partialCreate: 'c' ('r'? 'e'? 'a'? 't'? 'e'?) | 'create';

// After "create", we expect either an event or a task
afterCreate: partialTask | partialEvent;

partialEvent: 'e' | 'ev' | 'eve' | 'even' | 'event';
partialTask: 't' | 'ta' | 'tas' | 'task' | 'tasks';

// Partial matching for "hi,hello,hey"
partialGreeting:
	'h'
	| 'he'
	| 'hel'
	| 'hell'
	| 'hello'
	| 'hi'
	| 'hey';

// Tokens
STRING: '"' ~["]* '"';

DATETIME:
	DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT ' ' DIGIT DIGIT ':' DIGIT DIGIT;

fragment DIGIT: [0-9];

WS: [ \t\r\n]+ -> skip;