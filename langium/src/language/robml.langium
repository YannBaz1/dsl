grammar MyDsl
import 'Terminals'
import 'DSL_IDM-types'


entry EntryPoint returns Program:
    {Program} 'let' 'void' 'main' '(' ')' '{' 
        (instruction+=Instruction )*
    '}'
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
    {Movement} 'Movement' (direction=Direction)? ('dist' Distance=EInt)? ('in' unit=EString)?
;

Rotation returns Rotation:
    {Rotation} 'Rotation'  EInt ('angleUnit' angleUnit=AngleUnit)?
;

Loop returns Loop:
    {Loop} 'loop' '(' booleanexpr=BooleanExpr ')' '{'
       (instruction+=Instruction)? 
    '}'
;

Condition returns Condition:
    {Condition} 'If' '(' (booleanexpr+=BooleanExpr) ')' '{' ('then' (then+=Instruction)* )? ('else' (else+=Instruction)*)?  '}'
;

VariableAssignement returns VariableAssignement:
    {VariableAssignement} (variabledeclaration=[VariableDeclaration:EString] '=' expression+=Expression  ("," expression+=Expression  )* )?
;

VariableDeclaration returns VariableDeclaration:
    {VariableDeclaration} ('let' name=EString type=EString?  '=' expression+=Expression  ("," expression+=Expression )*)?
;

FunctionDeclaration returns FunctionDeclaration:
    {FunctionDeclaration} ( returntype=ReturnType )?  name=EString '{' (instruction+=Instruction)* '}'
;

FunctionCall returns FunctionCall:
    {FunctionCall} 'call' EString '(' (parameter+=Parameter)? ')'
;

Direction returns Direction:
    Direction_Front | Direction_Back | Direction_Right | Direction_Left
;
Direction_Front returns Direction_Front:
    'Front';
Direction_Back returns Direction_Back:
    'Back';
Direction_Right returns Direction_Right:
    'Right';
Direction_Left returns Direction_Left:
    'Left';

EInt returns number:
    '-'? INT
;

EString returns string:
    STRING | ID
;

AngleUnit returns AngleUnit:
    AngleUnit_Degre | AngleUnit_Radian
;
AngleUnit_Degre returns AngleUnit_Degre:
    'Degre';
AngleUnit_Radian returns AngleUnit_Radian:
    'Radian';

BooleanExpr returns BooleanExpr:
    {BooleanExpr} 'cond' ( left=Expression )? ( operator=BooleanOperator  )?  ( right=Expression  )?
;

BooleanOperator returns BooleanOperator:
    BooleanOperator_AND | BooleanOperator_OR | BooleanOperator_NOT | BooleanOperator_EQUALS | BooleanOperator_LESS | BooleanOperator_GREATER
;
BooleanOperator_AND returns BooleanOperator_AND:
    'AND';
BooleanOperator_OR returns BooleanOperator_OR:
    'OR';
BooleanOperator_NOT returns BooleanOperator_NOT:
    'NOT';
BooleanOperator_EQUALS returns BooleanOperator_EQUALS:
    'EQUALS';
BooleanOperator_LESS returns BooleanOperator_LESS:
    'LESS';
BooleanOperator_GREATER returns BooleanOperator_GREATER:
    'GREATER';

TimeSensors returns TimeSensors:
    {TimeSensors} 'TimeSensors' '{' ('unit' unit=EString  )? '}'
;


ArithmeticExpr returns ArithmeticExpr:
    {ArithmeticExpr} '{' ( left=NumberExpr  )? (operator=Operator  )? ( right=NumberExpr  )? '}'
;


IntExpression returns IntExpression:
    {IntExpression} ( value=EInt )?
;

Boolean returns Boolean:
    {Boolean} (value=EBoolean )?
;

DistanceSensor returns DistanceSensor:
    {DistanceSensor} 'DistanceSensor' '{' ('unit' unit=EString  )?'}'
;

Operator returns Operator:
    Operator_ADD | Operator_SUB | Operator_MUL | Operator_DIV
;
Operator_ADD returns Operator_ADD:
    'ADD';
Operator_SUB returns Operator_SUB:
    'SUB';
Operator_MUL returns Operator_MUL:
    'MUL';
Operator_DIV returns Operator_DIV:
    'DIV';

EBoolean returns boolean:
    'true' | 'false'
;

ReturnType returns ReturnType:
    {ReturnType} 'ReturnType' '{' ('returnType' returnType=EString  )? '}'
;

Parameter returns Parameter:
    {Parameter}  (name=EString)?   ('type' ^type=EString  )? (value=EInt)? ('in'unit=EString)?
;