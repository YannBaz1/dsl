/**
 */
package iDM_DSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.ArithmeticExpr#getRight <em>Right</em>}</li>
 *   <li>{@link iDM_DSL.ArithmeticExpr#getOperator <em>Operator</em>}</li>
 *   <li>{@link iDM_DSL.ArithmeticExpr#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see iDM_DSL.IDM_DSLPackage#getArithmeticExpr()
 * @model
 * @generated
 */
public interface ArithmeticExpr extends NumberExpr {
	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(NumberExpr)
	 * @see iDM_DSL.IDM_DSLPackage#getArithmeticExpr_Right()
	 * @model
	 * @generated
	 */
	NumberExpr getRight();

	/**
	 * Sets the value of the '{@link iDM_DSL.ArithmeticExpr#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(NumberExpr value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link iDM_DSL.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see iDM_DSL.Operator
	 * @see #setOperator(Operator)
	 * @see iDM_DSL.IDM_DSLPackage#getArithmeticExpr_Operator()
	 * @model
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link iDM_DSL.ArithmeticExpr#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see iDM_DSL.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(NumberExpr)
	 * @see iDM_DSL.IDM_DSLPackage#getArithmeticExpr_Left()
	 * @model
	 * @generated
	 */
	NumberExpr getLeft();

	/**
	 * Sets the value of the '{@link iDM_DSL.ArithmeticExpr#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(NumberExpr value);

} // ArithmeticExpr
