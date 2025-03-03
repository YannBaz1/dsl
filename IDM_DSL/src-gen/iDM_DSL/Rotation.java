/**
 */
package iDM_DSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.Rotation#getAngleUnit <em>Angle Unit</em>}</li>
 *   <li>{@link iDM_DSL.Rotation#getAngleValue <em>Angle Value</em>}</li>
 * </ul>
 *
 * @see iDM_DSL.IDM_DSLPackage#getRotation()
 * @model
 * @generated
 */
public interface Rotation extends Instruction {
	/**
	 * Returns the value of the '<em><b>Angle Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link iDM_DSL.AngleUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Unit</em>' attribute.
	 * @see iDM_DSL.AngleUnit
	 * @see #setAngleUnit(AngleUnit)
	 * @see iDM_DSL.IDM_DSLPackage#getRotation_AngleUnit()
	 * @model
	 * @generated
	 */
	AngleUnit getAngleUnit();

	/**
	 * Sets the value of the '{@link iDM_DSL.Rotation#getAngleUnit <em>Angle Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Unit</em>' attribute.
	 * @see iDM_DSL.AngleUnit
	 * @see #getAngleUnit()
	 * @generated
	 */
	void setAngleUnit(AngleUnit value);

	/**
	 * Returns the value of the '<em><b>Angle Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Value</em>' attribute.
	 * @see #setAngleValue(double)
	 * @see iDM_DSL.IDM_DSLPackage#getRotation_AngleValue()
	 * @model
	 * @generated
	 */
	double getAngleValue();

	/**
	 * Sets the value of the '{@link iDM_DSL.Rotation#getAngleValue <em>Angle Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Value</em>' attribute.
	 * @see #getAngleValue()
	 * @generated
	 */
	void setAngleValue(double value);

} // Rotation
