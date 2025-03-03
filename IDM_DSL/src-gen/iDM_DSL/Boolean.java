/**
 */
package iDM_DSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.Boolean#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see iDM_DSL.IDM_DSLPackage#getBoolean()
 * @model
 * @generated
 */
public interface Boolean extends Expression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see iDM_DSL.IDM_DSLPackage#getBoolean_Value()
	 * @model
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link iDM_DSL.Boolean#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // Boolean
