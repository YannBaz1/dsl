/**
 */
package iDM_DSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iDM_DSL.IDM_DSLFactory
 * @model kind="package"
 * @generated
 */
public interface IDM_DSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iDM_DSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/iDM_DSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iDM_DSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IDM_DSLPackage eINSTANCE = iDM_DSL.impl.IDM_DSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.InstructionImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 11;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.MovementImpl <em>Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.MovementImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getMovement()
	 * @generated
	 */
	int MOVEMENT = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT__DIRECTION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT__SPEED = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.VariableImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.FunctionImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INSTRUCTION = 2;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURNTYPE = 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.RotationImpl <em>Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.RotationImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getRotation()
	 * @generated
	 */
	int ROTATION = 3;

	/**
	 * The feature id for the '<em><b>Angle Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__ANGLE_UNIT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angle Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__ANGLE_VALUE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.SensorsImpl <em>Sensors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.SensorsImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getSensors()
	 * @generated
	 */
	int SENSORS = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORS__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORS__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORS__UNIT = 2;

	/**
	 * The number of structural features of the '<em>Sensors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sensors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.ControlStructImpl <em>Control Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.ControlStructImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getControlStruct()
	 * @generated
	 */
	int CONTROL_STRUCT = 5;

	/**
	 * The number of structural features of the '<em>Control Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Control Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.ExpressionImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 6;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.NumberExprImpl <em>Number Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.NumberExprImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getNumberExpr()
	 * @generated
	 */
	int NUMBER_EXPR = 15;

	/**
	 * The number of structural features of the '<em>Number Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.ArithmeticExprImpl <em>Arithmetic Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.ArithmeticExprImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getArithmeticExpr()
	 * @generated
	 */
	int ARITHMETIC_EXPR = 7;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR__RIGHT = NUMBER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR__OPERATOR = NUMBER_EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR__LEFT = NUMBER_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arithmetic Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR_FEATURE_COUNT = NUMBER_EXPR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arithmetic Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR_OPERATION_COUNT = NUMBER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.BooleanExprImpl <em>Boolean Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.BooleanExprImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getBooleanExpr()
	 * @generated
	 */
	int BOOLEAN_EXPR = 8;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__LEFT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Boolean Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.LoopImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 9;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__CONDITION = CONTROL_STRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__INSTRUCTION = CONTROL_STRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = CONTROL_STRUCT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = CONTROL_STRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.ConditionImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Booleanexpr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__BOOLEANEXPR = CONTROL_STRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__THEN = CONTROL_STRUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ELSE = CONTROL_STRUCT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = CONTROL_STRUCT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = CONTROL_STRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.SpeedImpl <em>Speed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.SpeedImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getSpeed()
	 * @generated
	 */
	int SPEED = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.IntExpressionImpl <em>Int Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.IntExpressionImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getIntExpression()
	 * @generated
	 */
	int INT_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXPRESSION__VALUE = NUMBER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXPRESSION_FEATURE_COUNT = NUMBER_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXPRESSION_OPERATION_COUNT = NUMBER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.BooleanImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.VariableAssignementImpl <em>Variable Assignement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.VariableAssignementImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getVariableAssignement()
	 * @generated
	 */
	int VARIABLE_ASSIGNEMENT = 16;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNEMENT__VARIABLE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNEMENT__EXPRESSION = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Assignement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNEMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable Assignement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNEMENT_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.ReturnTypeImpl <em>Return Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.ReturnTypeImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__RETURN_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.ParameterImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.impl.ProgramImpl
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 19;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__INSTRUCTION = 0;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iDM_DSL.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.Direction
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 20;

	/**
	 * The meta object id for the '{@link iDM_DSL.AngleUnit <em>Angle Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.AngleUnit
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getAngleUnit()
	 * @generated
	 */
	int ANGLE_UNIT = 21;

	/**
	 * The meta object id for the '{@link iDM_DSL.Units <em>Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.Units
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getUnits()
	 * @generated
	 */
	int UNITS = 22;

	/**
	 * The meta object id for the '{@link iDM_DSL.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.Operator
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 23;

	/**
	 * The meta object id for the '{@link iDM_DSL.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.BooleanOperator
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 24;

	/**
	 * The meta object id for the '{@link iDM_DSL.SensorType <em>Sensor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.SensorType
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 25;

	/**
	 * The meta object id for the '{@link iDM_DSL.DistanceUnit <em>Distance Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iDM_DSL.DistanceUnit
	 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getDistanceUnit()
	 * @generated
	 */
	int DISTANCE_UNIT = 26;

	/**
	 * Returns the meta object for class '{@link iDM_DSL.Movement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement</em>'.
	 * @see iDM_DSL.Movement
	 * @generated
	 */
	EClass getMovement();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.Movement#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see iDM_DSL.Movement#getDirection()
	 * @see #getMovement()
	 * @generated
	 */
	EAttribute getMovement_Direction();

	/**
	 * Returns the meta object for the reference '{@link iDM_DSL.Movement#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Speed</em>'.
	 * @see iDM_DSL.Movement#getSpeed()
	 * @see #getMovement()
	 * @generated
	 */
	EReference getMovement_Speed();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see iDM_DSL.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iDM_DSL.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link iDM_DSL.Variable#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see iDM_DSL.Variable#getExpression()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Expression();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see iDM_DSL.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iDM_DSL.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the reference list '{@link iDM_DSL.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see iDM_DSL.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link iDM_DSL.Function#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instruction</em>'.
	 * @see iDM_DSL.Function#getInstruction()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Instruction();

	/**
	 * Returns the meta object for the reference '{@link iDM_DSL.Function#getReturntype <em>Returntype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Returntype</em>'.
	 * @see iDM_DSL.Function#getReturntype()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Returntype();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation</em>'.
	 * @see iDM_DSL.Rotation
	 * @generated
	 */
	EClass getRotation();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.Rotation#getAngleUnit <em>Angle Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle Unit</em>'.
	 * @see iDM_DSL.Rotation#getAngleUnit()
	 * @see #getRotation()
	 * @generated
	 */
	EAttribute getRotation_AngleUnit();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.Rotation#getAngleValue <em>Angle Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle Value</em>'.
	 * @see iDM_DSL.Rotation#getAngleValue()
	 * @see #getRotation()
	 * @generated
	 */
	EAttribute getRotation_AngleValue();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.Sensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensors</em>'.
	 * @see iDM_DSL.Sensors
	 * @generated
	 */
	EClass getSensors();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.Sensors#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iDM_DSL.Sensors#getValue()
	 * @see #getSensors()
	 * @generated
	 */
	EAttribute getSensors_Value();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.Sensors#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iDM_DSL.Sensors#getType()
	 * @see #getSensors()
	 * @generated
	 */
	EAttribute getSensors_Type();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.Sensors#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see iDM_DSL.Sensors#getUnit()
	 * @see #getSensors()
	 * @generated
	 */
	EAttribute getSensors_Unit();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.ControlStruct <em>Control Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Struct</em>'.
	 * @see iDM_DSL.ControlStruct
	 * @generated
	 */
	EClass getControlStruct();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see iDM_DSL.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.ArithmeticExpr <em>Arithmetic Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expr</em>'.
	 * @see iDM_DSL.ArithmeticExpr
	 * @generated
	 */
	EClass getArithmeticExpr();

	/**
	 * Returns the meta object for the reference '{@link iDM_DSL.ArithmeticExpr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see iDM_DSL.ArithmeticExpr#getRight()
	 * @see #getArithmeticExpr()
	 * @generated
	 */
	EReference getArithmeticExpr_Right();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.ArithmeticExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see iDM_DSL.ArithmeticExpr#getOperator()
	 * @see #getArithmeticExpr()
	 * @generated
	 */
	EAttribute getArithmeticExpr_Operator();

	/**
	 * Returns the meta object for the reference '{@link iDM_DSL.ArithmeticExpr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see iDM_DSL.ArithmeticExpr#getLeft()
	 * @see #getArithmeticExpr()
	 * @generated
	 */
	EReference getArithmeticExpr_Left();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.BooleanExpr <em>Boolean Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expr</em>'.
	 * @see iDM_DSL.BooleanExpr
	 * @generated
	 */
	EClass getBooleanExpr();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.BooleanExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see iDM_DSL.BooleanExpr#getOperator()
	 * @see #getBooleanExpr()
	 * @generated
	 */
	EAttribute getBooleanExpr_Operator();

	/**
	 * Returns the meta object for the reference '{@link iDM_DSL.BooleanExpr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see iDM_DSL.BooleanExpr#getRight()
	 * @see #getBooleanExpr()
	 * @generated
	 */
	EReference getBooleanExpr_Right();

	/**
	 * Returns the meta object for the reference '{@link iDM_DSL.BooleanExpr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see iDM_DSL.BooleanExpr#getLeft()
	 * @see #getBooleanExpr()
	 * @generated
	 */
	EReference getBooleanExpr_Left();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see iDM_DSL.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the reference '{@link iDM_DSL.Loop#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see iDM_DSL.Loop#getCondition()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Condition();

	/**
	 * Returns the meta object for the reference list '{@link iDM_DSL.Loop#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instruction</em>'.
	 * @see iDM_DSL.Loop#getInstruction()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Instruction();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see iDM_DSL.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference '{@link iDM_DSL.Condition#getBooleanexpr <em>Booleanexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booleanexpr</em>'.
	 * @see iDM_DSL.Condition#getBooleanexpr()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Booleanexpr();

	/**
	 * Returns the meta object for the reference '{@link iDM_DSL.Condition#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then</em>'.
	 * @see iDM_DSL.Condition#getThen()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Then();

	/**
	 * Returns the meta object for the reference '{@link iDM_DSL.Condition#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else</em>'.
	 * @see iDM_DSL.Condition#getElse()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Else();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see iDM_DSL.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.Speed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed</em>'.
	 * @see iDM_DSL.Speed
	 * @generated
	 */
	EClass getSpeed();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.Speed#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iDM_DSL.Speed#getValue()
	 * @see #getSpeed()
	 * @generated
	 */
	EAttribute getSpeed_Value();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.Speed#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see iDM_DSL.Speed#getUnit()
	 * @see #getSpeed()
	 * @generated
	 */
	EAttribute getSpeed_Unit();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.IntExpression <em>Int Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Expression</em>'.
	 * @see iDM_DSL.IntExpression
	 * @generated
	 */
	EClass getIntExpression();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.IntExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iDM_DSL.IntExpression#getValue()
	 * @see #getIntExpression()
	 * @generated
	 */
	EAttribute getIntExpression_Value();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see iDM_DSL.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.Boolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iDM_DSL.Boolean#isValue()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Value();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.NumberExpr <em>Number Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Expr</em>'.
	 * @see iDM_DSL.NumberExpr
	 * @generated
	 */
	EClass getNumberExpr();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.VariableAssignement <em>Variable Assignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignement</em>'.
	 * @see iDM_DSL.VariableAssignement
	 * @generated
	 */
	EClass getVariableAssignement();

	/**
	 * Returns the meta object for the reference '{@link iDM_DSL.VariableAssignement#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see iDM_DSL.VariableAssignement#getVariable()
	 * @see #getVariableAssignement()
	 * @generated
	 */
	EReference getVariableAssignement_Variable();

	/**
	 * Returns the meta object for the reference '{@link iDM_DSL.VariableAssignement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see iDM_DSL.VariableAssignement#getExpression()
	 * @see #getVariableAssignement()
	 * @generated
	 */
	EReference getVariableAssignement_Expression();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type</em>'.
	 * @see iDM_DSL.ReturnType
	 * @generated
	 */
	EClass getReturnType();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.ReturnType#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see iDM_DSL.ReturnType#getReturnType()
	 * @see #getReturnType()
	 * @generated
	 */
	EAttribute getReturnType_ReturnType();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see iDM_DSL.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iDM_DSL.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link iDM_DSL.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iDM_DSL.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link iDM_DSL.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see iDM_DSL.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the reference '{@link iDM_DSL.Program#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instruction</em>'.
	 * @see iDM_DSL.Program#getInstruction()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Instruction();

	/**
	 * Returns the meta object for enum '{@link iDM_DSL.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see iDM_DSL.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link iDM_DSL.AngleUnit <em>Angle Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Angle Unit</em>'.
	 * @see iDM_DSL.AngleUnit
	 * @generated
	 */
	EEnum getAngleUnit();

	/**
	 * Returns the meta object for enum '{@link iDM_DSL.Units <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units</em>'.
	 * @see iDM_DSL.Units
	 * @generated
	 */
	EEnum getUnits();

	/**
	 * Returns the meta object for enum '{@link iDM_DSL.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see iDM_DSL.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link iDM_DSL.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see iDM_DSL.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the meta object for enum '{@link iDM_DSL.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Type</em>'.
	 * @see iDM_DSL.SensorType
	 * @generated
	 */
	EEnum getSensorType();

	/**
	 * Returns the meta object for enum '{@link iDM_DSL.DistanceUnit <em>Distance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Distance Unit</em>'.
	 * @see iDM_DSL.DistanceUnit
	 * @generated
	 */
	EEnum getDistanceUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IDM_DSLFactory getIDM_DSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.MovementImpl <em>Movement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.MovementImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getMovement()
		 * @generated
		 */
		EClass MOVEMENT = eINSTANCE.getMovement();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVEMENT__DIRECTION = eINSTANCE.getMovement_Direction();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVEMENT__SPEED = eINSTANCE.getMovement_Speed();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.VariableImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__EXPRESSION = eINSTANCE.getVariable_Expression();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.FunctionImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__INSTRUCTION = eINSTANCE.getFunction_Instruction();

		/**
		 * The meta object literal for the '<em><b>Returntype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RETURNTYPE = eINSTANCE.getFunction_Returntype();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.RotationImpl <em>Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.RotationImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getRotation()
		 * @generated
		 */
		EClass ROTATION = eINSTANCE.getRotation();

		/**
		 * The meta object literal for the '<em><b>Angle Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION__ANGLE_UNIT = eINSTANCE.getRotation_AngleUnit();

		/**
		 * The meta object literal for the '<em><b>Angle Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION__ANGLE_VALUE = eINSTANCE.getRotation_AngleValue();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.SensorsImpl <em>Sensors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.SensorsImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getSensors()
		 * @generated
		 */
		EClass SENSORS = eINSTANCE.getSensors();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSORS__VALUE = eINSTANCE.getSensors_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSORS__TYPE = eINSTANCE.getSensors_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSORS__UNIT = eINSTANCE.getSensors_Unit();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.ControlStructImpl <em>Control Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.ControlStructImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getControlStruct()
		 * @generated
		 */
		EClass CONTROL_STRUCT = eINSTANCE.getControlStruct();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.ExpressionImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.ArithmeticExprImpl <em>Arithmetic Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.ArithmeticExprImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getArithmeticExpr()
		 * @generated
		 */
		EClass ARITHMETIC_EXPR = eINSTANCE.getArithmeticExpr();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EXPR__RIGHT = eINSTANCE.getArithmeticExpr_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_EXPR__OPERATOR = eINSTANCE.getArithmeticExpr_Operator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EXPR__LEFT = eINSTANCE.getArithmeticExpr_Left();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.BooleanExprImpl <em>Boolean Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.BooleanExprImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getBooleanExpr()
		 * @generated
		 */
		EClass BOOLEAN_EXPR = eINSTANCE.getBooleanExpr();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPR__OPERATOR = eINSTANCE.getBooleanExpr_Operator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPR__RIGHT = eINSTANCE.getBooleanExpr_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPR__LEFT = eINSTANCE.getBooleanExpr_Left();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.LoopImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__CONDITION = eINSTANCE.getLoop_Condition();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__INSTRUCTION = eINSTANCE.getLoop_Instruction();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.ConditionImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Booleanexpr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__BOOLEANEXPR = eINSTANCE.getCondition_Booleanexpr();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__THEN = eINSTANCE.getCondition_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ELSE = eINSTANCE.getCondition_Else();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.InstructionImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.SpeedImpl <em>Speed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.SpeedImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getSpeed()
		 * @generated
		 */
		EClass SPEED = eINSTANCE.getSpeed();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEED__VALUE = eINSTANCE.getSpeed_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEED__UNIT = eINSTANCE.getSpeed_Unit();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.IntExpressionImpl <em>Int Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.IntExpressionImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getIntExpression()
		 * @generated
		 */
		EClass INT_EXPRESSION = eINSTANCE.getIntExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_EXPRESSION__VALUE = eINSTANCE.getIntExpression_Value();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.BooleanImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__VALUE = eINSTANCE.getBoolean_Value();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.NumberExprImpl <em>Number Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.NumberExprImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getNumberExpr()
		 * @generated
		 */
		EClass NUMBER_EXPR = eINSTANCE.getNumberExpr();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.VariableAssignementImpl <em>Variable Assignement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.VariableAssignementImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getVariableAssignement()
		 * @generated
		 */
		EClass VARIABLE_ASSIGNEMENT = eINSTANCE.getVariableAssignement();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNEMENT__VARIABLE = eINSTANCE.getVariableAssignement_Variable();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNEMENT__EXPRESSION = eINSTANCE.getVariableAssignement_Expression();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.ReturnTypeImpl <em>Return Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.ReturnTypeImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getReturnType()
		 * @generated
		 */
		EClass RETURN_TYPE = eINSTANCE.getReturnType();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_TYPE__RETURN_TYPE = eINSTANCE.getReturnType_ReturnType();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.ParameterImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link iDM_DSL.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.impl.ProgramImpl
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__INSTRUCTION = eINSTANCE.getProgram_Instruction();

		/**
		 * The meta object literal for the '{@link iDM_DSL.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.Direction
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link iDM_DSL.AngleUnit <em>Angle Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.AngleUnit
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getAngleUnit()
		 * @generated
		 */
		EEnum ANGLE_UNIT = eINSTANCE.getAngleUnit();

		/**
		 * The meta object literal for the '{@link iDM_DSL.Units <em>Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.Units
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getUnits()
		 * @generated
		 */
		EEnum UNITS = eINSTANCE.getUnits();

		/**
		 * The meta object literal for the '{@link iDM_DSL.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.Operator
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link iDM_DSL.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.BooleanOperator
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '{@link iDM_DSL.SensorType <em>Sensor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.SensorType
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getSensorType()
		 * @generated
		 */
		EEnum SENSOR_TYPE = eINSTANCE.getSensorType();

		/**
		 * The meta object literal for the '{@link iDM_DSL.DistanceUnit <em>Distance Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iDM_DSL.DistanceUnit
		 * @see iDM_DSL.impl.IDM_DSLPackageImpl#getDistanceUnit()
		 * @generated
		 */
		EEnum DISTANCE_UNIT = eINSTANCE.getDistanceUnit();

	}

} //IDM_DSLPackage
