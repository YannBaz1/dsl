grammar MyDsl
import 'Terminals'
import 'DSL_IDM-types'

entry ArithmeticExpr returns ArithmeticExpr:
    {ArithmeticExpr} 'ArithmeticExpr' '{' ('operator' operator=Operator  )? ('newvariable' '{' newvariable+=VariableDeclaration  ("," newvariable+=VariableDeclaration  )* '}' )? ('left' left=NumberExpr  )? ('right' right=NumberExpr  )? '}'  
;

NumberExpr returns NumberExpr:
    TimeSensors | ArithmeticExpr | IntExpression | DistanceSensor 
;

Expression returns Expression:
    TimeSensors | ArithmeticExpr | BooleanExpr | IntExpression | Boolean | DistanceSensor 
;

VariableDeclaration returns VariableDeclaration:
    {VariableDeclaration} 'VariableDeclaration' name=EString  '{' ('type' ^type=EString  )? ('expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' )? '}'  
;

Operator returns Operator:
    Operator_ADD | Operator_SUB | Operator_MUL | Operator_DIV
;
Operator_ADD returns Operator_ADD: 'ADD' ;
Operator_SUB returns Operator_SUB: 'SUB' ;
Operator_MUL returns Operator_MUL: 'MUL' ;
Operator_DIV returns Operator_DIV: 'DIV' ;

EString returns string:
    STRING | ID 
;

TimeSensors returns TimeSensors:
    {TimeSensors} 'TimeSensors' '{' ('unit' unit=EString  )? ('newvariable' '{' newvariable+=VariableDeclaration  ("," newvariable+=VariableDeclaration  )* '}' )? '}'  
;

BooleanExpr returns BooleanExpr:
    {BooleanExpr} 'BooleanExpr' '{' ('operator' operator=BooleanOperator  )? ('newvariable' '{' newvariable+=VariableDeclaration  ("," newvariable+=VariableDeclaration  )* '}' )? ('right' right=Expression  )? ('left' left=Expression  )? '}'  
;

IntExpression returns IntExpression:
    {IntExpression} 'IntExpression' '{' ('value' value=EInt  )? ('newvariable' '{' newvariable+=VariableDeclaration  ("," newvariable+=VariableDeclaration  )* '}' )? '}'  
;

Boolean returns Boolean:
    {Boolean} (value?='value' )? 'Boolean' '{' ('newvariable' '{' newvariable+=VariableDeclaration  ("," newvariable+=VariableDeclaration  )* '}' )? '}'  
;

DistanceSensor returns DistanceSensor:
    {DistanceSensor} 'DistanceSensor' '{' ('unit' unit=EString  )? ('newvariable' '{' newvariable+=VariableDeclaration  ("," newvariable+=VariableDeclaration  )* '}' )? '}'  
;

BooleanOperator returns BooleanOperator:
    BooleanOperator_AND | BooleanOperator_OR | BooleanOperator_NOT | BooleanOperator_EQUALS | BooleanOperator_LESS | BooleanOperator_GREATER
;
BooleanOperator_AND returns BooleanOperator_AND: 'AND' ;
BooleanOperator_OR returns BooleanOperator_OR: 'OR' ;
BooleanOperator_NOT returns BooleanOperator_NOT: 'NOT' ;
BooleanOperator_EQUALS returns BooleanOperator_EQUALS: 'EQUALS' ;
BooleanOperator_LESS returns BooleanOperator_LESS: 'LESS' ;
BooleanOperator_GREATER returns BooleanOperator_GREATER: 'GREATER' ;

EInt returns number:
    '-'? INT  
;

EBoolean returns boolean:
    'true' | 'false' 
;

