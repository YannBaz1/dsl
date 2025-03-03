/**
 */
package iDM_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.Speed#getValue <em>Value</em>}</li>
 *   <li>{@link iDM_DSL.Speed#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see iDM_DSL.IDM_DSLPackage#getSpeed()
 * @model
 * @generated
 */
public interface Speed extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see iDM_DSL.IDM_DSLPackage#getSpeed_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link iDM_DSL.Speed#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link iDM_DSL.Units}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see iDM_DSL.Units
	 * @see #setUnit(Units)
	 * @see iDM_DSL.IDM_DSLPackage#getSpeed_Unit()
	 * @model
	 * @generated
	 */
	Units getUnit();

	/**
	 * Sets the value of the '{@link iDM_DSL.Speed#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see iDM_DSL.Units
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Units value);

} // Speed
