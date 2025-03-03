/**
 */
package iDM_DSL.util;

import iDM_DSL.ArithmeticExpr;
import iDM_DSL.BooleanExpr;
import iDM_DSL.Condition;
import iDM_DSL.ControlStruct;
import iDM_DSL.Expression;
import iDM_DSL.Function;
import iDM_DSL.IDM_DSLPackage;
import iDM_DSL.Instruction;
import iDM_DSL.IntExpression;
import iDM_DSL.Loop;
import iDM_DSL.Movement;
import iDM_DSL.NumberExpr;
import iDM_DSL.Parameter;
import iDM_DSL.Program;
import iDM_DSL.ReturnType;
import iDM_DSL.Rotation;
import iDM_DSL.Sensors;
import iDM_DSL.Speed;
import iDM_DSL.Variable;
import iDM_DSL.VariableAssignement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iDM_DSL.IDM_DSLPackage
 * @generated
 */
public class IDM_DSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IDM_DSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDM_DSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IDM_DSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDM_DSLSwitch<Adapter> modelSwitch = new IDM_DSLSwitch<Adapter>() {
		@Override
		public Adapter caseMovement(Movement object) {
			return createMovementAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseFunction(Function object) {
			return createFunctionAdapter();
		}

		@Override
		public Adapter caseRotation(Rotation object) {
			return createRotationAdapter();
		}

		@Override
		public Adapter caseSensors(Sensors object) {
			return createSensorsAdapter();
		}

		@Override
		public Adapter caseControlStruct(ControlStruct object) {
			return createControlStructAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseArithmeticExpr(ArithmeticExpr object) {
			return createArithmeticExprAdapter();
		}

		@Override
		public Adapter caseBooleanExpr(BooleanExpr object) {
			return createBooleanExprAdapter();
		}

		@Override
		public Adapter caseLoop(Loop object) {
			return createLoopAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseInstruction(Instruction object) {
			return createInstructionAdapter();
		}

		@Override
		public Adapter caseSpeed(Speed object) {
			return createSpeedAdapter();
		}

		@Override
		public Adapter caseIntExpression(IntExpression object) {
			return createIntExpressionAdapter();
		}

		@Override
		public Adapter caseBoolean(iDM_DSL.Boolean object) {
			return createBooleanAdapter();
		}

		@Override
		public Adapter caseNumberExpr(NumberExpr object) {
			return createNumberExprAdapter();
		}

		@Override
		public Adapter caseVariableAssignement(VariableAssignement object) {
			return createVariableAssignementAdapter();
		}

		@Override
		public Adapter caseReturnType(ReturnType object) {
			return createReturnTypeAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.Movement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.Movement
	 * @generated
	 */
	public Adapter createMovementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.Rotation
	 * @generated
	 */
	public Adapter createRotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.Sensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.Sensors
	 * @generated
	 */
	public Adapter createSensorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.ControlStruct <em>Control Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.ControlStruct
	 * @generated
	 */
	public Adapter createControlStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.ArithmeticExpr <em>Arithmetic Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.ArithmeticExpr
	 * @generated
	 */
	public Adapter createArithmeticExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.BooleanExpr <em>Boolean Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.BooleanExpr
	 * @generated
	 */
	public Adapter createBooleanExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.Speed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.Speed
	 * @generated
	 */
	public Adapter createSpeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.IntExpression <em>Int Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.IntExpression
	 * @generated
	 */
	public Adapter createIntExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.NumberExpr <em>Number Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.NumberExpr
	 * @generated
	 */
	public Adapter createNumberExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.VariableAssignement <em>Variable Assignement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.VariableAssignement
	 * @generated
	 */
	public Adapter createVariableAssignementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.ReturnType
	 * @generated
	 */
	public Adapter createReturnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iDM_DSL.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iDM_DSL.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IDM_DSLAdapterFactory
