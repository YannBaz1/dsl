/**
 */
package iDM_DSL.impl;

import iDM_DSL.ArithmeticExpr;
import iDM_DSL.IDM_DSLPackage;
import iDM_DSL.NumberExpr;
import iDM_DSL.Operator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arithmetic Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.impl.ArithmeticExprImpl#getRight <em>Right</em>}</li>
 *   <li>{@link iDM_DSL.impl.ArithmeticExprImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link iDM_DSL.impl.ArithmeticExprImpl#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArithmeticExprImpl extends NumberExprImpl implements ArithmeticExpr {
	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected NumberExpr right;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final Operator OPERATOR_EDEFAULT = Operator.ADD;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected NumberExpr left;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDM_DSLPackage.Literals.ARITHMETIC_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberExpr getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject) right;
			right = (NumberExpr) eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IDM_DSLPackage.ARITHMETIC_EXPR__RIGHT,
							oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberExpr basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRight(NumberExpr newRight) {
		NumberExpr oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDM_DSLPackage.ARITHMETIC_EXPR__RIGHT, oldRight,
					right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(Operator newOperator) {
		Operator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDM_DSLPackage.ARITHMETIC_EXPR__OPERATOR, oldOperator,
					operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberExpr getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject) left;
			left = (NumberExpr) eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IDM_DSLPackage.ARITHMETIC_EXPR__LEFT,
							oldLeft, left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberExpr basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeft(NumberExpr newLeft) {
		NumberExpr oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDM_DSLPackage.ARITHMETIC_EXPR__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IDM_DSLPackage.ARITHMETIC_EXPR__RIGHT:
			if (resolve)
				return getRight();
			return basicGetRight();
		case IDM_DSLPackage.ARITHMETIC_EXPR__OPERATOR:
			return getOperator();
		case IDM_DSLPackage.ARITHMETIC_EXPR__LEFT:
			if (resolve)
				return getLeft();
			return basicGetLeft();
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
		case IDM_DSLPackage.ARITHMETIC_EXPR__RIGHT:
			setRight((NumberExpr) newValue);
			return;
		case IDM_DSLPackage.ARITHMETIC_EXPR__OPERATOR:
			setOperator((Operator) newValue);
			return;
		case IDM_DSLPackage.ARITHMETIC_EXPR__LEFT:
			setLeft((NumberExpr) newValue);
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
		case IDM_DSLPackage.ARITHMETIC_EXPR__RIGHT:
			setRight((NumberExpr) null);
			return;
		case IDM_DSLPackage.ARITHMETIC_EXPR__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case IDM_DSLPackage.ARITHMETIC_EXPR__LEFT:
			setLeft((NumberExpr) null);
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
		case IDM_DSLPackage.ARITHMETIC_EXPR__RIGHT:
			return right != null;
		case IDM_DSLPackage.ARITHMETIC_EXPR__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
		case IDM_DSLPackage.ARITHMETIC_EXPR__LEFT:
			return left != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //ArithmeticExprImpl
