/**
 */
package iDM_DSL.impl;

import iDM_DSL.Function;
import iDM_DSL.IDM_DSLPackage;
import iDM_DSL.Instruction;
import iDM_DSL.Parameter;
import iDM_DSL.ReturnType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link iDM_DSL.impl.FunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link iDM_DSL.impl.FunctionImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link iDM_DSL.impl.FunctionImpl#getReturntype <em>Returntype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> instruction;

	/**
	 * The cached value of the '{@link #getReturntype() <em>Returntype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturntype()
	 * @generated
	 * @ordered
	 */
	protected ReturnType returntype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDM_DSLPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDM_DSLPackage.FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this,
					IDM_DSLPackage.FUNCTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instruction> getInstruction() {
		if (instruction == null) {
			instruction = new EObjectResolvingEList<Instruction>(Instruction.class, this,
					IDM_DSLPackage.FUNCTION__INSTRUCTION);
		}
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType getReturntype() {
		if (returntype != null && returntype.eIsProxy()) {
			InternalEObject oldReturntype = (InternalEObject) returntype;
			returntype = (ReturnType) eResolveProxy(oldReturntype);
			if (returntype != oldReturntype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IDM_DSLPackage.FUNCTION__RETURNTYPE,
							oldReturntype, returntype));
			}
		}
		return returntype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnType basicGetReturntype() {
		return returntype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturntype(ReturnType newReturntype) {
		ReturnType oldReturntype = returntype;
		returntype = newReturntype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDM_DSLPackage.FUNCTION__RETURNTYPE, oldReturntype,
					returntype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IDM_DSLPackage.FUNCTION__NAME:
			return getName();
		case IDM_DSLPackage.FUNCTION__PARAMETERS:
			return getParameters();
		case IDM_DSLPackage.FUNCTION__INSTRUCTION:
			return getInstruction();
		case IDM_DSLPackage.FUNCTION__RETURNTYPE:
			if (resolve)
				return getReturntype();
			return basicGetReturntype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case IDM_DSLPackage.FUNCTION__NAME:
			setName((String) newValue);
			return;
		case IDM_DSLPackage.FUNCTION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case IDM_DSLPackage.FUNCTION__INSTRUCTION:
			getInstruction().clear();
			getInstruction().addAll((Collection<? extends Instruction>) newValue);
			return;
		case IDM_DSLPackage.FUNCTION__RETURNTYPE:
			setReturntype((ReturnType) newValue);
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
		case IDM_DSLPackage.FUNCTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case IDM_DSLPackage.FUNCTION__PARAMETERS:
			getParameters().clear();
			return;
		case IDM_DSLPackage.FUNCTION__INSTRUCTION:
			getInstruction().clear();
			return;
		case IDM_DSLPackage.FUNCTION__RETURNTYPE:
			setReturntype((ReturnType) null);
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
		case IDM_DSLPackage.FUNCTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case IDM_DSLPackage.FUNCTION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case IDM_DSLPackage.FUNCTION__INSTRUCTION:
			return instruction != null && !instruction.isEmpty();
		case IDM_DSLPackage.FUNCTION__RETURNTYPE:
			return returntype != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
