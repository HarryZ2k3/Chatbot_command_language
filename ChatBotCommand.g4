grammar ChatBotCommand;

// Entry point
command
    : createEvent
    | showTasks
    | updateEvent
    | helpCommand
    | showEvent
    | createTasks
    ;

// Rules for specific commands
createEvent
    : 'create' 'event' STRING 'at' DATETIME
    ;

showTasks
    : 'show' 'tasks'
    ;

updateEvent
    : 'update' 'event' STRING 'change' 'time' 'to' DATETIME
    ;

helpCommand
    : 'help'
    ;

showEvent
    : 'show' 'event'
    ;

createTasks
    : 'create' 'tasks' 'for' STRING ':' STRING (',' STRING)*
    ;

// Tokens
STRING
    : '"' ~["]* '"'
    ;

DATETIME
    : DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT ' ' DIGIT DIGIT ':' DIGIT DIGIT
    ;

COLON
    : ':'
    ;

COMMA
    : ','
    ;

fragment DIGIT
    : [0-9]
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
