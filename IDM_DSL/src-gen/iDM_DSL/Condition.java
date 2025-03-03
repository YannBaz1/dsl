/**
 */
package iDM_DSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.Condition#getBooleanexpr <em>Booleanexpr</em>}</li>
 *   <li>{@link iDM_DSL.Condition#getThen <em>Then</em>}</li>
 *   <li>{@link iDM_DSL.Condition#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see iDM_DSL.IDM_DSLPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends ControlStruct {
	/**
	 * Returns the value of the '<em><b>Booleanexpr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booleanexpr</em>' reference.
	 * @see #setBooleanexpr(BooleanExpr)
	 * @see iDM_DSL.IDM_DSLPackage#getCondition_Booleanexpr()
	 * @model
	 * @generated
	 */
	BooleanExpr getBooleanexpr();

	/**
	 * Sets the value of the '{@link iDM_DSL.Condition#getBooleanexpr <em>Booleanexpr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booleanexpr</em>' reference.
	 * @see #getBooleanexpr()
	 * @generated
	 */
	void setBooleanexpr(BooleanExpr value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' reference.
	 * @see #setThen(Instruction)
	 * @see iDM_DSL.IDM_DSLPackage#getCondition_Then()
	 * @model
	 * @generated
	 */
	Instruction getThen();

	/**
	 * Sets the value of the '{@link iDM_DSL.Condition#getThen <em>Then</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(Instruction value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' reference.
	 * @see #setElse(Instruction)
	 * @see iDM_DSL.IDM_DSLPackage#getCondition_Else()
	 * @model
	 * @generated
	 */
	Instruction getElse();

	/**
	 * Sets the value of the '{@link iDM_DSL.Condition#getElse <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Instruction value);

} // Condition
