/**
 */
package iDM_DSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.Loop#getCondition <em>Condition</em>}</li>
 *   <li>{@link iDM_DSL.Loop#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see iDM_DSL.IDM_DSLPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends ControlStruct {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Condition)
	 * @see iDM_DSL.IDM_DSLPackage#getLoop_Condition()
	 * @model
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link iDM_DSL.Loop#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' reference list.
	 * The list contents are of type {@link iDM_DSL.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' reference list.
	 * @see iDM_DSL.IDM_DSLPackage#getLoop_Instruction()
	 * @model
	 * @generated
	 */
	EList<Instruction> getInstruction();

} // Loop
