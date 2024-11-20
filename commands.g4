grammar commands;

// Parser Rules
command
    : createEventCommand
    | showTasksCommand
    | updateEventCommand
    ;

createEventCommand
    : 'create' 'event' QUOTEDSTRING 'at' DATETIME
    ;

showTasksCommand
    : 'show' 'tasks'
    ;

updateEventCommand
    : 'update' 'event' QUOTEDSTRING 'change' 'time' 'to' DATETIME
    ;

// Lexer Rules
QUOTEDSTRING
    : '"' ~["]* '"'
    ;

DATETIME
    : DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT ' ' DIGIT DIGIT ':' DIGIT DIGIT
    ;

fragment DIGIT
    : [0-9]
    ;

WS
    : [ \t\n\r]+ -> skip
    ;
