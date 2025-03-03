/**
 */
package iDM_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.Sensors#getValue <em>Value</em>}</li>
 *   <li>{@link iDM_DSL.Sensors#getType <em>Type</em>}</li>
 *   <li>{@link iDM_DSL.Sensors#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see iDM_DSL.IDM_DSLPackage#getSensors()
 * @model
 * @generated
 */
public interface Sensors extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see iDM_DSL.IDM_DSLPackage#getSensors_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link iDM_DSL.Sensors#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link iDM_DSL.SensorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see iDM_DSL.SensorType
	 * @see #setType(SensorType)
	 * @see iDM_DSL.IDM_DSLPackage#getSensors_Type()
	 * @model
	 * @generated
	 */
	SensorType getType();

	/**
	 * Sets the value of the '{@link iDM_DSL.Sensors#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see iDM_DSL.SensorType
	 * @see #getType()
	 * @generated
	 */
	void setType(SensorType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link iDM_DSL.DistanceUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see iDM_DSL.DistanceUnit
	 * @see #setUnit(DistanceUnit)
	 * @see iDM_DSL.IDM_DSLPackage#getSensors_Unit()
	 * @model
	 * @generated
	 */
	DistanceUnit getUnit();

	/**
	 * Sets the value of the '{@link iDM_DSL.Sensors#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see iDM_DSL.DistanceUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(DistanceUnit value);

} // Sensors
