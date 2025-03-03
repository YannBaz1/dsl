/**
 */
package iDM_DSL.impl;

import iDM_DSL.AngleUnit;
import iDM_DSL.ArithmeticExpr;
import iDM_DSL.BooleanExpr;
import iDM_DSL.BooleanOperator;
import iDM_DSL.Condition;
import iDM_DSL.Direction;
import iDM_DSL.DistanceUnit;
import iDM_DSL.Function;
import iDM_DSL.IDM_DSLFactory;
import iDM_DSL.IDM_DSLPackage;
import iDM_DSL.IntExpression;
import iDM_DSL.Loop;
import iDM_DSL.Movement;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IDM_DSLFactoryImpl extends EFactoryImpl implements IDM_DSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IDM_DSLFactory init() {
		try {
			IDM_DSLFactory theIDM_DSLFactory = (IDM_DSLFactory) EPackage.Registry.INSTANCE
					.getEFactory(IDM_DSLPackage.eNS_URI);
			if (theIDM_DSLFactory != null) {
				return theIDM_DSLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IDM_DSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDM_DSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case IDM_DSLPackage.MOVEMENT:
			return createMovement();
		case IDM_DSLPackage.VARIABLE:
			return createVariable();
		case IDM_DSLPackage.FUNCTION:
			return createFunction();
		case IDM_DSLPackage.ROTATION:
			return createRotation();
		case IDM_DSLPackage.SENSORS:
			return createSensors();
		case IDM_DSLPackage.ARITHMETIC_EXPR:
			return createArithmeticExpr();
		case IDM_DSLPackage.BOOLEAN_EXPR:
			return createBooleanExpr();
		case IDM_DSLPackage.LOOP:
			return createLoop();
		case IDM_DSLPackage.CONDITION:
			return createCondition();
		case IDM_DSLPackage.SPEED:
			return createSpeed();
		case IDM_DSLPackage.INT_EXPRESSION:
			return createIntExpression();
		case IDM_DSLPackage.BOOLEAN:
			return createBoolean();
		case IDM_DSLPackage.VARIABLE_ASSIGNEMENT:
			return createVariableAssignement();
		case IDM_DSLPackage.RETURN_TYPE:
			return createReturnType();
		case IDM_DSLPackage.PARAMETER:
			return createParameter();
		case IDM_DSLPackage.PROGRAM:
			return createProgram();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case IDM_DSLPackage.DIRECTION:
			return createDirectionFromString(eDataType, initialValue);
		case IDM_DSLPackage.ANGLE_UNIT:
			return createAngleUnitFromString(eDataType, initialValue);
		case IDM_DSLPackage.UNITS:
			return createUnitsFromString(eDataType, initialValue);
		case IDM_DSLPackage.OPERATOR:
			return createOperatorFromString(eDataType, initialValue);
		case IDM_DSLPackage.BOOLEAN_OPERATOR:
			return createBooleanOperatorFromString(eDataType, initialValue);
		case IDM_DSLPackage.SENSOR_TYPE:
			return createSensorTypeFromString(eDataType, initialValue);
		case IDM_DSLPackage.DISTANCE_UNIT:
			return createDistanceUnitFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case IDM_DSLPackage.DIRECTION:
			return convertDirectionToString(eDataType, instanceValue);
		case IDM_DSLPackage.ANGLE_UNIT:
			return convertAngleUnitToString(eDataType, instanceValue);
		case IDM_DSLPackage.UNITS:
			return convertUnitsToString(eDataType, instanceValue);
		case IDM_DSLPackage.OPERATOR:
			return convertOperatorToString(eDataType, instanceValue);
		case IDM_DSLPackage.BOOLEAN_OPERATOR:
			return convertBooleanOperatorToString(eDataType, instanceValue);
		case IDM_DSLPackage.SENSOR_TYPE:
			return convertSensorTypeToString(eDataType, instanceValue);
		case IDM_DSLPackage.DISTANCE_UNIT:
			return convertDistanceUnitToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Movement createMovement() {
		MovementImpl movement = new MovementImpl();
		return movement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rotation createRotation() {
		RotationImpl rotation = new RotationImpl();
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensors createSensors() {
		SensorsImpl sensors = new SensorsImpl();
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArithmeticExpr createArithmeticExpr() {
		ArithmeticExprImpl arithmeticExpr = new ArithmeticExprImpl();
		return arithmeticExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanExpr createBooleanExpr() {
		BooleanExprImpl booleanExpr = new BooleanExprImpl();
		return booleanExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Speed createSpeed() {
		SpeedImpl speed = new SpeedImpl();
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntExpression createIntExpression() {
		IntExpressionImpl intExpression = new IntExpressionImpl();
		return intExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public iDM_DSL.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableAssignement createVariableAssignement() {
		VariableAssignementImpl variableAssignement = new VariableAssignementImpl();
		return variableAssignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType createReturnType() {
		ReturnTypeImpl returnType = new ReturnTypeImpl();
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleUnit createAngleUnitFromString(EDataType eDataType, String initialValue) {
		AngleUnit result = AngleUnit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngleUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units createUnitsFromString(EDataType eDataType, String initialValue) {
		Units result = Units.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator createBooleanOperatorFromString(EDataType eDataType, String initialValue) {
		BooleanOperator result = BooleanOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType createSensorTypeFromString(EDataType eDataType, String initialValue) {
		SensorType result = SensorType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceUnit createDistanceUnitFromString(EDataType eDataType, String initialValue) {
		DistanceUnit result = DistanceUnit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistanceUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDM_DSLPackage getIDM_DSLPackage() {
		return (IDM_DSLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IDM_DSLPackage getPackage() {
		return IDM_DSLPackage.eINSTANCE;
	}

} //IDM_DSLFactoryImpl
