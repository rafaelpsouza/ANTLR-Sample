grammar ServicesDsl;
command: service operator operator operator;
service: 'export' format | 'retrieve' ;
format: 'PDF' | 'DOC' | 'DOCX' | 'ZIP' ;
operator: from | to | with ;
from: 'from' STRING ;
to: 'to' STRING ;
with: 'with' '(' STRING ')' ;
STRING: '"' .*? '"' ;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

//command: service (from to with) | (from with to) | (to with from) | (to from with) | (with to from) | (with from to) ;