/**
 */
package iDM_DSL.impl;

import iDM_DSL.AngleUnit;
import iDM_DSL.ArithmeticExpr;
import iDM_DSL.BooleanExpr;
import iDM_DSL.BooleanOperator;
import iDM_DSL.Condition;
import iDM_DSL.ControlStruct;
import iDM_DSL.Direction;
import iDM_DSL.DistanceUnit;
import iDM_DSL.Expression;
import iDM_DSL.Function;
import iDM_DSL.IDM_DSLFactory;
import iDM_DSL.IDM_DSLPackage;
import iDM_DSL.Instruction;
import iDM_DSL.IntExpression;
import iDM_DSL.Loop;
import iDM_DSL.Movement;
import iDM_DSL.NumberExpr;
import iDM_DSL.Operator;
import iDM_DSL.Parameter;
import iDM_DSL.Program;
import iDM_DSL.ReturnType;
import iDM_DSL.Rotation;
import iDM_DSL.SensorType;
import iDM_DSL.Sensors;
import iDM_DSL.Speed;
import iDM_DSL.Units;
import iDM_DSL.Variable;
import iDM_DSL.VariableAssignement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IDM_DSLPackageImpl extends EPackageImpl implements IDM_DSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass movementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlStructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum angleUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum distanceUnitEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see iDM_DSL.IDM_DSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IDM_DSLPackageImpl() {
		super(eNS_URI, IDM_DSLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IDM_DSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IDM_DSLPackage init() {
		if (isInited)
			return (IDM_DSLPackage) EPackage.Registry.INSTANCE.getEPackage(IDM_DSLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIDM_DSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IDM_DSLPackageImpl theIDM_DSLPackage = registeredIDM_DSLPackage instanceof IDM_DSLPackageImpl
				? (IDM_DSLPackageImpl) registeredIDM_DSLPackage
				: new IDM_DSLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theIDM_DSLPackage.createPackageContents();

		// Initialize created meta-data
		theIDM_DSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIDM_DSLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IDM_DSLPackage.eNS_URI, theIDM_DSLPackage);
		return theIDM_DSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMovement() {
		return movementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMovement_Direction() {
		return (EAttribute) movementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMovement_Speed() {
		return (EReference) movementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Name() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_Expression() {
		return (EReference) variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunction_Name() {
		return (EAttribute) functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_Parameters() {
		return (EReference) functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_Instruction() {
		return (EReference) functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_Returntype() {
		return (EReference) functionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRotation() {
		return rotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRotation_AngleUnit() {
		return (EAttribute) rotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRotation_AngleValue() {
		return (EAttribute) rotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensors() {
		return sensorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensors_Value() {
		return (EAttribute) sensorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensors_Type() {
		return (EAttribute) sensorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensors_Unit() {
		return (EAttribute) sensorsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlStruct() {
		return controlStructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArithmeticExpr() {
		return arithmeticExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArithmeticExpr_Right() {
		return (EReference) arithmeticExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArithmeticExpr_Operator() {
		return (EAttribute) arithmeticExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArithmeticExpr_Left() {
		return (EReference) arithmeticExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanExpr() {
		return booleanExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanExpr_Operator() {
		return (EAttribute) booleanExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanExpr_Right() {
		return (EReference) booleanExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanExpr_Left() {
		return (EReference) booleanExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoop_Condition() {
		return (EReference) loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoop_Instruction() {
		return (EReference) loopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondition_Booleanexpr() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondition_Then() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondition_Else() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpeed() {
		return speedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeed_Value() {
		return (EAttribute) speedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeed_Unit() {
		return (EAttribute) speedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntExpression() {
		return intExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntExpression_Value() {
		return (EAttribute) intExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoolean_Value() {
		return (EAttribute) booleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberExpr() {
		return numberExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableAssignement() {
		return variableAssignementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableAssignement_Variable() {
		return (EReference) variableAssignementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableAssignement_Expression() {
		return (EReference) variableAssignementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType() {
		return returnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnType_ReturnType() {
		return (EAttribute) returnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Name() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Type() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_Instruction() {
		return (EReference) programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAngleUnit() {
		return angleUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnits() {
		return unitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBooleanOperator() {
		return booleanOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSensorType() {
		return sensorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDistanceUnit() {
		return distanceUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDM_DSLFactory getIDM_DSLFactory() {
		return (IDM_DSLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		movementEClass = createEClass(MOVEMENT);
		createEAttribute(movementEClass, MOVEMENT__DIRECTION);
		createEReference(movementEClass, MOVEMENT__SPEED);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEReference(variableEClass, VARIABLE__EXPRESSION);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__NAME);
		createEReference(functionEClass, FUNCTION__PARAMETERS);
		createEReference(functionEClass, FUNCTION__INSTRUCTION);
		createEReference(functionEClass, FUNCTION__RETURNTYPE);

		rotationEClass = createEClass(ROTATION);
		createEAttribute(rotationEClass, ROTATION__ANGLE_UNIT);
		createEAttribute(rotationEClass, ROTATION__ANGLE_VALUE);

		sensorsEClass = createEClass(SENSORS);
		createEAttribute(sensorsEClass, SENSORS__VALUE);
		createEAttribute(sensorsEClass, SENSORS__TYPE);
		createEAttribute(sensorsEClass, SENSORS__UNIT);

		controlStructEClass = createEClass(CONTROL_STRUCT);

		expressionEClass = createEClass(EXPRESSION);

		arithmeticExprEClass = createEClass(ARITHMETIC_EXPR);
		createEReference(arithmeticExprEClass, ARITHMETIC_EXPR__RIGHT);
		createEAttribute(arithmeticExprEClass, ARITHMETIC_EXPR__OPERATOR);
		createEReference(arithmeticExprEClass, ARITHMETIC_EXPR__LEFT);

		booleanExprEClass = createEClass(BOOLEAN_EXPR);
		createEAttribute(booleanExprEClass, BOOLEAN_EXPR__OPERATOR);
		createEReference(booleanExprEClass, BOOLEAN_EXPR__RIGHT);
		createEReference(booleanExprEClass, BOOLEAN_EXPR__LEFT);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__CONDITION);
		createEReference(loopEClass, LOOP__INSTRUCTION);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__BOOLEANEXPR);
		createEReference(conditionEClass, CONDITION__THEN);
		createEReference(conditionEClass, CONDITION__ELSE);

		instructionEClass = createEClass(INSTRUCTION);

		speedEClass = createEClass(SPEED);
		createEAttribute(speedEClass, SPEED__VALUE);
		createEAttribute(speedEClass, SPEED__UNIT);

		intExpressionEClass = createEClass(INT_EXPRESSION);
		createEAttribute(intExpressionEClass, INT_EXPRESSION__VALUE);

		booleanEClass = createEClass(BOOLEAN);
		createEAttribute(booleanEClass, BOOLEAN__VALUE);

		numberExprEClass = createEClass(NUMBER_EXPR);

		variableAssignementEClass = createEClass(VARIABLE_ASSIGNEMENT);
		createEReference(variableAssignementEClass, VARIABLE_ASSIGNEMENT__VARIABLE);
		createEReference(variableAssignementEClass, VARIABLE_ASSIGNEMENT__EXPRESSION);

		returnTypeEClass = createEClass(RETURN_TYPE);
		createEAttribute(returnTypeEClass, RETURN_TYPE__RETURN_TYPE);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__TYPE);

		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__INSTRUCTION);

		// Create enums
		directionEEnum = createEEnum(DIRECTION);
		angleUnitEEnum = createEEnum(ANGLE_UNIT);
		unitsEEnum = createEEnum(UNITS);
		operatorEEnum = createEEnum(OPERATOR);
		booleanOperatorEEnum = createEEnum(BOOLEAN_OPERATOR);
		sensorTypeEEnum = createEEnum(SENSOR_TYPE);
		distanceUnitEEnum = createEEnum(DISTANCE_UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		movementEClass.getESuperTypes().add(this.getInstruction());
		rotationEClass.getESuperTypes().add(this.getInstruction());
		arithmeticExprEClass.getESuperTypes().add(this.getNumberExpr());
		booleanExprEClass.getESuperTypes().add(this.getExpression());
		loopEClass.getESuperTypes().add(this.getControlStruct());
		conditionEClass.getESuperTypes().add(this.getControlStruct());
		intExpressionEClass.getESuperTypes().add(this.getNumberExpr());
		booleanEClass.getESuperTypes().add(this.getExpression());
		numberExprEClass.getESuperTypes().add(this.getExpression());
		variableAssignementEClass.getESuperTypes().add(this.getInstruction());

		// Initialize classes, features, and operations; add parameters
		initEClass(movementEClass, Movement.class, "Movement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMovement_Direction(), this.getDirection(), "direction", null, 0, 1, Movement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMovement_Speed(), this.getSpeed(), null, "speed", null, 0, 1, Movement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Expression(), this.getExpression(), null, "expression", null, 0, 1, Variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Function.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Instruction(), this.getInstruction(), null, "instruction", null, 0, -1,
				Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Returntype(), this.getReturnType(), null, "returntype", null, 0, 1, Function.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotationEClass, Rotation.class, "Rotation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotation_AngleUnit(), this.getAngleUnit(), "angleUnit", null, 0, 1, Rotation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotation_AngleValue(), ecorePackage.getEDouble(), "angleValue", null, 0, 1, Rotation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorsEClass, Sensors.class, "Sensors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensors_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, Sensors.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensors_Type(), this.getSensorType(), "type", null, 0, 1, Sensors.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensors_Unit(), this.getDistanceUnit(), "unit", null, 0, 1, Sensors.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlStructEClass, ControlStruct.class, "ControlStruct", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(arithmeticExprEClass, ArithmeticExpr.class, "ArithmeticExpr", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArithmeticExpr_Right(), this.getNumberExpr(), null, "right", null, 0, 1, ArithmeticExpr.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArithmeticExpr_Operator(), this.getOperator(), "operator", null, 0, 1, ArithmeticExpr.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmeticExpr_Left(), this.getNumberExpr(), null, "left", null, 0, 1, ArithmeticExpr.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExprEClass, BooleanExpr.class, "BooleanExpr", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanExpr_Operator(), this.getBooleanOperator(), "operator", null, 0, 1, BooleanExpr.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanExpr_Right(), this.getExpression(), null, "right", null, 0, 1, BooleanExpr.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanExpr_Left(), this.getExpression(), null, "left", null, 0, 1, BooleanExpr.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_Condition(), this.getCondition(), null, "condition", null, 0, 1, Loop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_Instruction(), this.getInstruction(), null, "instruction", null, 0, -1, Loop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Booleanexpr(), this.getBooleanExpr(), null, "booleanexpr", null, 0, 1,
				Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Then(), this.getInstruction(), null, "then", null, 0, 1, Condition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Else(), this.getInstruction(), null, "else", null, 0, 1, Condition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(speedEClass, Speed.class, "Speed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeed_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Speed.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeed_Unit(), this.getUnits(), "unit", null, 0, 1, Speed.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intExpressionEClass, IntExpression.class, "IntExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntExpression_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanEClass, iDM_DSL.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, iDM_DSL.Boolean.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberExprEClass, NumberExpr.class, "NumberExpr", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableAssignementEClass, VariableAssignement.class, "VariableAssignement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAssignement_Variable(), this.getVariable(), null, "variable", null, 0, 1,
				VariableAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableAssignement_Expression(), this.getExpression(), null, "expression", null, 0, 1,
				VariableAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnTypeEClass, ReturnType.class, "ReturnType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnType_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1,
				ReturnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_Instruction(), this.getInstruction(), null, "instruction", null, 0, 1, Program.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.FRONT);
		addEEnumLiteral(directionEEnum, Direction.BACK);
		addEEnumLiteral(directionEEnum, Direction.RIGHT);
		addEEnumLiteral(directionEEnum, Direction.LEFT);

		initEEnum(angleUnitEEnum, AngleUnit.class, "AngleUnit");
		addEEnumLiteral(angleUnitEEnum, AngleUnit.DEGRE);
		addEEnumLiteral(angleUnitEEnum, AngleUnit.RADIAN);

		initEEnum(unitsEEnum, Units.class, "Units");
		addEEnumLiteral(unitsEEnum, Units.MM_S);
		addEEnumLiteral(unitsEEnum, Units.CM_S);
		addEEnumLiteral(unitsEEnum, Units.MS);

		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.ADD);
		addEEnumLiteral(operatorEEnum, Operator.SUB);
		addEEnumLiteral(operatorEEnum, Operator.MUL);
		addEEnumLiteral(operatorEEnum, Operator.DIV);

		initEEnum(booleanOperatorEEnum, BooleanOperator.class, "BooleanOperator");
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.AND);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.OR);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.NOT);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.EQUALS);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.LESS);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.GREATER);

		initEEnum(sensorTypeEEnum, SensorType.class, "SensorType");
		addEEnumLiteral(sensorTypeEEnum, SensorType.TIME);
		addEEnumLiteral(sensorTypeEEnum, SensorType.DISTANCE);

		initEEnum(distanceUnitEEnum, DistanceUnit.class, "DistanceUnit");
		addEEnumLiteral(distanceUnitEEnum, DistanceUnit.CM);
		addEEnumLiteral(distanceUnitEEnum, DistanceUnit.M);

		// Create resource
		createResource(eNS_URI);
	}

} //IDM_DSLPackageImpl
