/**
 */
package iDM_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDM_DSL.Program#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see iDM_DSL.IDM_DSLPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' reference.
	 * @see #setInstruction(Instruction)
	 * @see iDM_DSL.IDM_DSLPackage#getProgram_Instruction()
	 * @model
	 * @generated
	 */
	Instruction getInstruction();

	/**
	 * Sets the value of the '{@link iDM_DSL.Program#getInstruction <em>Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(Instruction value);

} // Program
