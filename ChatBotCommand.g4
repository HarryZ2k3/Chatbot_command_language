grammar ChatBotCommand;

// Entry point
command
    : createEvent
    | showTasks
    | updateEvent
    | helpCommand
    | showEvent
    | createTasks
    | timeToEvent
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

timeToEvent
    : 'time' 'to' 'event' STRING
    ;

// Tokens
STRING
    : '"' ~["]* '"'
    ;

DATETIME
    : DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT ' ' DIGIT DIGIT ':' DIGIT DIGIT
    ;

fragment DIGIT
    : [0-9]
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
