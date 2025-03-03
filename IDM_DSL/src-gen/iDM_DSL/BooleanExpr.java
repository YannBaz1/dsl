/**
 */
package iDM_DSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.BooleanExpr#getOperator <em>Operator</em>}</li>
 *   <li>{@link iDM_DSL.BooleanExpr#getRight <em>Right</em>}</li>
 *   <li>{@link iDM_DSL.BooleanExpr#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see iDM_DSL.IDM_DSLPackage#getBooleanExpr()
 * @model
 * @generated
 */
public interface BooleanExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link iDM_DSL.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see iDM_DSL.BooleanOperator
	 * @see #setOperator(BooleanOperator)
	 * @see iDM_DSL.IDM_DSLPackage#getBooleanExpr_Operator()
	 * @model
	 * @generated
	 */
	BooleanOperator getOperator();

	/**
	 * Sets the value of the '{@link iDM_DSL.BooleanExpr#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see iDM_DSL.BooleanOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanOperator value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Expression)
	 * @see iDM_DSL.IDM_DSLPackage#getBooleanExpr_Right()
	 * @model
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link iDM_DSL.BooleanExpr#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Expression)
	 * @see iDM_DSL.IDM_DSLPackage#getBooleanExpr_Left()
	 * @model
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link iDM_DSL.BooleanExpr#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

} // BooleanExpr
