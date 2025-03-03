/**
 */
package iDM_DSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Movement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.Movement#getDirection <em>Direction</em>}</li>
 *   <li>{@link iDM_DSL.Movement#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see iDM_DSL.IDM_DSLPackage#getMovement()
 * @model
 * @generated
 */
public interface Movement extends Instruction {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link iDM_DSL.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see iDM_DSL.Direction
	 * @see #setDirection(Direction)
	 * @see iDM_DSL.IDM_DSLPackage#getMovement_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link iDM_DSL.Movement#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see iDM_DSL.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' reference.
	 * @see #setSpeed(Speed)
	 * @see iDM_DSL.IDM_DSLPackage#getMovement_Speed()
	 * @model
	 * @generated
	 */
	Speed getSpeed();

	/**
	 * Sets the value of the '{@link iDM_DSL.Movement#getSpeed <em>Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' reference.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(Speed value);

} // Movement
