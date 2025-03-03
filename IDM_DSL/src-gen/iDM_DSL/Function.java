/**
 */
package iDM_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.Function#getName <em>Name</em>}</li>
 *   <li>{@link iDM_DSL.Function#getParameters <em>Parameters</em>}</li>
 *   <li>{@link iDM_DSL.Function#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link iDM_DSL.Function#getReturntype <em>Returntype</em>}</li>
 * </ul>
 *
 * @see iDM_DSL.IDM_DSLPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iDM_DSL.IDM_DSLPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iDM_DSL.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link iDM_DSL.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see iDM_DSL.IDM_DSLPackage#getFunction_Parameters()
	 * @model
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' reference list.
	 * The list contents are of type {@link iDM_DSL.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' reference list.
	 * @see iDM_DSL.IDM_DSLPackage#getFunction_Instruction()
	 * @model
	 * @generated
	 */
	EList<Instruction> getInstruction();

	/**
	 * Returns the value of the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returntype</em>' reference.
	 * @see #setReturntype(ReturnType)
	 * @see iDM_DSL.IDM_DSLPackage#getFunction_Returntype()
	 * @model
	 * @generated
	 */
	ReturnType getReturntype();

	/**
	 * Sets the value of the '{@link iDM_DSL.Function#getReturntype <em>Returntype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returntype</em>' reference.
	 * @see #getReturntype()
	 * @generated
	 */
	void setReturntype(ReturnType value);

} // Function
