grammar ChatBotCommand;

// Parser Rules
command
    : createEventCommand
    | showTasksCommand
    | updateEventCommand
    | helpCommand
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
helpCommand
    : 'help'
    ;
    
fragment DIGIT
    : [0-9]
    ;

WS
    : [ \t\n\r]+ -> skip
    ;
