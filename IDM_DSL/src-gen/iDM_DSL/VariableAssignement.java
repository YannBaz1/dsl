/**
 */
package iDM_DSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.VariableAssignement#getVariable <em>Variable</em>}</li>
 *   <li>{@link iDM_DSL.VariableAssignement#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see iDM_DSL.IDM_DSLPackage#getVariableAssignement()
 * @model
 * @generated
 */
public interface VariableAssignement extends Instruction {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see iDM_DSL.IDM_DSLPackage#getVariableAssignement_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link iDM_DSL.VariableAssignement#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Expression)
	 * @see iDM_DSL.IDM_DSLPackage#getVariableAssignement_Expression()
	 * @model
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link iDM_DSL.VariableAssignement#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // VariableAssignement
