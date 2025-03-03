/**
 */
package iDM_DSL.impl;

import iDM_DSL.Direction;
import iDM_DSL.IDM_DSLPackage;
import iDM_DSL.Movement;
import iDM_DSL.Speed;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Movement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.impl.MovementImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link iDM_DSL.impl.MovementImpl#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MovementImpl extends InstructionImpl implements Movement {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.FRONT;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected Speed speed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDM_DSLPackage.Literals.MOVEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDM_DSLPackage.MOVEMENT__DIRECTION, oldDirection,
					direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Speed getSpeed() {
		if (speed != null && speed.eIsProxy()) {
			InternalEObject oldSpeed = (InternalEObject) speed;
			speed = (Speed) eResolveProxy(oldSpeed);
			if (speed != oldSpeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IDM_DSLPackage.MOVEMENT__SPEED, oldSpeed,
							speed));
			}
		}
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speed basicGetSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeed(Speed newSpeed) {
		Speed oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDM_DSLPackage.MOVEMENT__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IDM_DSLPackage.MOVEMENT__DIRECTION:
			return getDirection();
		case IDM_DSLPackage.MOVEMENT__SPEED:
			if (resolve)
				return getSpeed();
			return basicGetSpeed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case IDM_DSLPackage.MOVEMENT__DIRECTION:
			setDirection((Direction) newValue);
			return;
		case IDM_DSLPackage.MOVEMENT__SPEED:
			setSpeed((Speed) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case IDM_DSLPackage.MOVEMENT__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case IDM_DSLPackage.MOVEMENT__SPEED:
			setSpeed((Speed) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case IDM_DSLPackage.MOVEMENT__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
		case IDM_DSLPackage.MOVEMENT__SPEED:
			return speed != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //MovementImpl
