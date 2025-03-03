/**
 */
package iDM_DSL.impl;

import iDM_DSL.BooleanExpr;
import iDM_DSL.Condition;
import iDM_DSL.IDM_DSLPackage;
import iDM_DSL.Instruction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.impl.ConditionImpl#getBooleanexpr <em>Booleanexpr</em>}</li>
 *   <li>{@link iDM_DSL.impl.ConditionImpl#getThen <em>Then</em>}</li>
 *   <li>{@link iDM_DSL.impl.ConditionImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends ControlStructImpl implements Condition {
	/**
	 * The cached value of the '{@link #getBooleanexpr() <em>Booleanexpr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanexpr()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpr booleanexpr;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected Instruction then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected Instruction else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDM_DSLPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanExpr getBooleanexpr() {
		if (booleanexpr != null && booleanexpr.eIsProxy()) {
			InternalEObject oldBooleanexpr = (InternalEObject) booleanexpr;
			booleanexpr = (BooleanExpr) eResolveProxy(oldBooleanexpr);
			if (booleanexpr != oldBooleanexpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IDM_DSLPackage.CONDITION__BOOLEANEXPR,
							oldBooleanexpr, booleanexpr));
			}
		}
		return booleanexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpr basicGetBooleanexpr() {
		return booleanexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooleanexpr(BooleanExpr newBooleanexpr) {
		BooleanExpr oldBooleanexpr = booleanexpr;
		booleanexpr = newBooleanexpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDM_DSLPackage.CONDITION__BOOLEANEXPR, oldBooleanexpr,
					booleanexpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instruction getThen() {
		if (then != null && then.eIsProxy()) {
			InternalEObject oldThen = (InternalEObject) then;
			then = (Instruction) eResolveProxy(oldThen);
			if (then != oldThen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IDM_DSLPackage.CONDITION__THEN, oldThen,
							then));
			}
		}
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction basicGetThen() {
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThen(Instruction newThen) {
		Instruction oldThen = then;
		then = newThen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDM_DSLPackage.CONDITION__THEN, oldThen, then));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instruction getElse() {
		if (else_ != null && else_.eIsProxy()) {
			InternalEObject oldElse = (InternalEObject) else_;
			else_ = (Instruction) eResolveProxy(oldElse);
			if (else_ != oldElse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IDM_DSLPackage.CONDITION__ELSE, oldElse,
							else_));
			}
		}
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction basicGetElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElse(Instruction newElse) {
		Instruction oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDM_DSLPackage.CONDITION__ELSE, oldElse, else_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IDM_DSLPackage.CONDITION__BOOLEANEXPR:
			if (resolve)
				return getBooleanexpr();
			return basicGetBooleanexpr();
		case IDM_DSLPackage.CONDITION__THEN:
			if (resolve)
				return getThen();
			return basicGetThen();
		case IDM_DSLPackage.CONDITION__ELSE:
			if (resolve)
				return getElse();
			return basicGetElse();
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
		case IDM_DSLPackage.CONDITION__BOOLEANEXPR:
			setBooleanexpr((BooleanExpr) newValue);
			return;
		case IDM_DSLPackage.CONDITION__THEN:
			setThen((Instruction) newValue);
			return;
		case IDM_DSLPackage.CONDITION__ELSE:
			setElse((Instruction) newValue);
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
		case IDM_DSLPackage.CONDITION__BOOLEANEXPR:
			setBooleanexpr((BooleanExpr) null);
			return;
		case IDM_DSLPackage.CONDITION__THEN:
			setThen((Instruction) null);
			return;
		case IDM_DSLPackage.CONDITION__ELSE:
			setElse((Instruction) null);
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
		case IDM_DSLPackage.CONDITION__BOOLEANEXPR:
			return booleanexpr != null;
		case IDM_DSLPackage.CONDITION__THEN:
			return then != null;
		case IDM_DSLPackage.CONDITION__ELSE:
			return else_ != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
