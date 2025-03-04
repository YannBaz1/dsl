
type Operator = Operator_ADD | Operator_SUB | Operator_MUL | Operator_DIV;
type Operator_ADD = 'ADD';
type Operator_SUB = 'SUB';
type Operator_MUL = 'MUL';
type Operator_DIV = 'DIV';

type BooleanOperator = BooleanOperator_AND | BooleanOperator_OR | BooleanOperator_NOT | BooleanOperator_EQUALS | BooleanOperator_LESS | BooleanOperator_GREATER;
type BooleanOperator_AND = 'AND';
type BooleanOperator_OR = 'OR';
type BooleanOperator_NOT = 'NOT';
type BooleanOperator_EQUALS = 'EQUALS';
type BooleanOperator_LESS = 'LESS';
type BooleanOperator_GREATER = 'GREATER';

interface ArithmeticExpr extends NumberExpr {
	operator?: Operator
	left?: NumberExpr
	right?: NumberExpr
}

interface NumberExpr extends Expression {
}

interface Expression {
	newvariable: VariableDeclaration[]
}

interface VariableDeclaration extends Instruction {
	name?: string
	^type?: string
	expression: Expression[]
}

interface Instruction {
}

interface TimeSensors extends SensorsAb {
	unit?: string
}

interface SensorsAb extends NumberExpr {
}

interface BooleanExpr extends Expression {
	operator?: BooleanOperator
	right?: Expression
	left?: Expression
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

