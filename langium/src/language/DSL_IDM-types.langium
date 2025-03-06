
type Direction = Direction_Front | Direction_Back | Direction_Right | Direction_Left;
type Direction_Front = 'Front';
type Direction_Back = 'Back';
type Direction_Right = 'Right';
type Direction_Left = 'Left';

type AngleUnit = AngleUnit_Degre | AngleUnit_Radian;
type AngleUnit_Degre = 'Degre';
type AngleUnit_Radian = 'Radian';

type BooleanOperator = BooleanOperator_AND | BooleanOperator_OR | BooleanOperator_NOT | BooleanOperator_EQUALS | BooleanOperator_LESS | BooleanOperator_GREATER;
type BooleanOperator_AND = 'AND';
type BooleanOperator_OR = 'OR';
type BooleanOperator_NOT = 'NOT';
type BooleanOperator_EQUALS = 'EQUALS';
type BooleanOperator_LESS = 'LESS';
type BooleanOperator_GREATER = 'GREATER';

type Operator = Operator_ADD | Operator_SUB | Operator_MUL | Operator_DIV;
type Operator_ADD = 'ADD';
type Operator_SUB = 'SUB';
type Operator_MUL = 'MUL';
type Operator_DIV = 'DIV';

interface Program {
	instruction: Instruction[]
}

interface Instruction {
}

interface Expression {
	newvariable: VariableDeclaration[]
}

interface VariableDeclaration extends Instruction {
	name?: string
	^type?: string
	expression: Expression[]
}

interface NumberExpr extends Expression {
}

interface Movement extends Instruction {
	direction?: Direction
	Distance?: number
	unit?: string
}

interface Rotation extends Instruction {
	angleUnit?: AngleUnit
}

interface Loop extends Instruction {
	instruction: Instruction[]
	booleanexpr: BooleanExpr
}

interface BooleanExpr extends Expression {
	operator?: BooleanOperator
	right?: Expression
	left?: Expression
}

interface Condition extends Instruction {
	then?: Instruction[]
	else?: Instruction[]
	booleanexpr: BooleanExpr[]
}

interface VariableAssignement extends Instruction {
	variabledeclaration?: @VariableDeclaration
	expression: Expression[]
}

interface FunctionDeclaration extends Instruction {
	name?: string
	instruction: Instruction[]
	returntype?: ReturnType
}

interface ReturnType {
	returnType?: string
}

interface FunctionCall extends Instruction {
	functiondeclaration?: @FunctionDeclaration
	parameter: Parameter[]
}

interface Parameter {
	name?: string
	^type?: string
	value?: number
	unit?: string
}

interface TimeSensors extends SensorsAb {
	unit?: string
}

interface SensorsAb extends NumberExpr {
}

interface ArithmeticExpr extends NumberExpr {
	operator?: Operator
	left?: NumberExpr
	right?: NumberExpr
}

interface IntExpression extends NumberExpr {
	value?: number
}

interface Boolean extends Expression {
	value: boolean
}

interface DistanceSensor extends SensorsAb {
	unit?: string
}
