/**
 */
package iDM_DSL.impl;

import iDM_DSL.AngleUnit;
import iDM_DSL.IDM_DSLPackage;
import iDM_DSL.Rotation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.impl.RotationImpl#getAngleUnit <em>Angle Unit</em>}</li>
 *   <li>{@link iDM_DSL.impl.RotationImpl#getAngleValue <em>Angle Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotationImpl extends InstructionImpl implements Rotation {
	/**
	 * The default value of the '{@link #getAngleUnit() <em>Angle Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleUnit()
	 * @generated
	 * @ordered
	 */
	protected static final AngleUnit ANGLE_UNIT_EDEFAULT = AngleUnit.DEGRE;

	/**
	 * The cached value of the '{@link #getAngleUnit() <em>Angle Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleUnit()
	 * @generated
	 * @ordered
	 */
	protected AngleUnit angleUnit = ANGLE_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAngleValue() <em>Angle Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleValue()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGLE_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAngleValue() <em>Angle Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleValue()
	 * @generated
	 * @ordered
	 */
	protected double angleValue = ANGLE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDM_DSLPackage.Literals.ROTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngleUnit getAngleUnit() {
		return angleUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAngleUnit(AngleUnit newAngleUnit) {
		AngleUnit oldAngleUnit = angleUnit;
		angleUnit = newAngleUnit == null ? ANGLE_UNIT_EDEFAULT : newAngleUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDM_DSLPackage.ROTATION__ANGLE_UNIT, oldAngleUnit,
					angleUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAngleValue() {
		return angleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAngleValue(double newAngleValue) {
		double oldAngleValue = angleValue;
		angleValue = newAngleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDM_DSLPackage.ROTATION__ANGLE_VALUE, oldAngleValue,
					angleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IDM_DSLPackage.ROTATION__ANGLE_UNIT:
			return getAngleUnit();
		case IDM_DSLPackage.ROTATION__ANGLE_VALUE:
			return getAngleValue();
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
		case IDM_DSLPackage.ROTATION__ANGLE_UNIT:
			setAngleUnit((AngleUnit) newValue);
			return;
		case IDM_DSLPackage.ROTATION__ANGLE_VALUE:
			setAngleValue((Double) newValue);
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
		case IDM_DSLPackage.ROTATION__ANGLE_UNIT:
			setAngleUnit(ANGLE_UNIT_EDEFAULT);
			return;
		case IDM_DSLPackage.ROTATION__ANGLE_VALUE:
			setAngleValue(ANGLE_VALUE_EDEFAULT);
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
		case IDM_DSLPackage.ROTATION__ANGLE_UNIT:
			return angleUnit != ANGLE_UNIT_EDEFAULT;
		case IDM_DSLPackage.ROTATION__ANGLE_VALUE:
			return angleValue != ANGLE_VALUE_EDEFAULT;
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
		result.append(" (angleUnit: ");
		result.append(angleUnit);
		result.append(", angleValue: ");
		result.append(angleValue);
		result.append(')');
		return result.toString();
	}

} //RotationImpl
