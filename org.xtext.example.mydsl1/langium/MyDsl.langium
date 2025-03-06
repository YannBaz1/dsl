grammar MyDsl
import 'Terminals'
import 'DSL_IDM-types'

entry Program returns Program:
    {Program} 'Program' '{' ('instruction' '{' instruction+=Instruction  ("," instruction+=Instruction  )* '}' )? '}'  
;

Instruction returns Instruction:
    Movement | Rotation | Loop | Condition | VariableAssignement | VariableDeclaration | FunctionDeclaration | FunctionCall 
;

Expression returns Expression:
    TimeSensors | ArithmeticExpr | BooleanExpr | IntExpression | Boolean | DistanceSensor 
;

NumberExpr returns NumberExpr:
    TimeSensors | ArithmeticExpr | IntExpression | DistanceSensor 
;

Movement returns Movement:
    {Movement} 'Movement' '{' ('direction' direction=Direction  )? ('Distance' Distance=EInt  )? ('unit' unit=EString  )? '}'  
;

Rotation returns Rotation:
    {Rotation} 'Rotation' '{' ('angleUnit' angleUnit=AngleUnit  )? '}'  
;

Loop returns Loop:
    {Loop} 'Loop' '{' ('instruction' '{' instruction+=Instruction  ("," instruction+=Instruction  )* '}' )? ('booleanexpr' booleanexpr=BooleanExpr  )? '}'  
;

Condition returns Condition:
    {Condition} 'Condition' '{' ('then' then=[Instruction:EString ] )? ('else' else=[Instruction:EString ] )? ('booleanexpr' '{' booleanexpr+=BooleanExpr  ("," booleanexpr+=BooleanExpr  )* '}' )? '}'  
;

VariableAssignement returns VariableAssignement:
    {VariableAssignement} 'VariableAssignement' '{' ('variabledeclaration' variabledeclaration=[VariableDeclaration:EString ] )? ('expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' )? '}'  
;

VariableDeclaration returns VariableDeclaration:
    {VariableDeclaration} 'VariableDeclaration' name=EString  '{' ('type' ^type=EString  )? ('expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' )? '}'  
;

FunctionDeclaration returns FunctionDeclaration:
    {FunctionDeclaration} 'FunctionDeclaration' name=EString  '{' ('instruction' '{' instruction+=Instruction  ("," instruction+=Instruction  )* '}' )? ('returntype' returntype=ReturnType  )? '}'  
;

FunctionCall returns FunctionCall:
    {FunctionCall} 'FunctionCall' '{' ('functiondeclaration' functiondeclaration=[FunctionDeclaration:EString ] )? ('parameter' '{' parameter+=Parameter  ("," parameter+=Parameter  )* '}' )? '}'  
;

Direction returns Direction:
    Direction_Front | Direction_Back | Direction_Right | Direction_Left
;
Direction_Front returns Direction_Front: 'Front' ;
Direction_Back returns Direction_Back: 'Back' ;
Direction_Right returns Direction_Right: 'Right' ;
Direction_Left returns Direction_Left: 'Left' ;

EInt returns number:
    '-'? INT  
;

EString returns string:
    STRING | ID 
;

AngleUnit returns AngleUnit:
    AngleUnit_Degre | AngleUnit_Radian
;
AngleUnit_Degre returns AngleUnit_Degre: 'Degre' ;
AngleUnit_Radian returns AngleUnit_Radian: 'Radian' ;

BooleanExpr returns BooleanExpr:
    {BooleanExpr} 'BooleanExpr' '{' ('operator' operator=BooleanOperator  )? ('newvariable' '{' newvariable+=VariableDeclaration  ("," newvariable+=VariableDeclaration  )* '}' )? ('right' right=Expression  )? ('left' left=Expression  )? '}'  
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

TimeSensors returns TimeSensors:
    {TimeSensors} 'TimeSensors' '{' ('unit' unit=EString  )? ('newvariable' '{' newvariable+=VariableDeclaration  ("," newvariable+=VariableDeclaration  )* '}' )? '}'  
;

ArithmeticExpr returns ArithmeticExpr:
    {ArithmeticExpr} 'ArithmeticExpr' '{' ('operator' operator=Operator  )? ('newvariable' '{' newvariable+=VariableDeclaration  ("," newvariable+=VariableDeclaration  )* '}' )? ('left' left=NumberExpr  )? ('right' right=NumberExpr  )? '}'  
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

Operator returns Operator:
    Operator_ADD | Operator_SUB | Operator_MUL | Operator_DIV
;
Operator_ADD returns Operator_ADD: 'ADD' ;
Operator_SUB returns Operator_SUB: 'SUB' ;
Operator_MUL returns Operator_MUL: 'MUL' ;
Operator_DIV returns Operator_DIV: 'DIV' ;

EBoolean returns boolean:
    'true' | 'false' 
;

ReturnType returns ReturnType:
    {ReturnType} 'ReturnType' '{' ('returnType' returnType=EString  )? '}'  
;

Parameter returns Parameter:
    {Parameter} 'Parameter' name=EString  '{' ('type' ^type=EString  )? ('value' value=EInt  )? ('unit' unit=EString  )? '}'  
;

