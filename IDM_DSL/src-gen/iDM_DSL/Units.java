/**
 */
package iDM_DSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Units</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iDM_DSL.IDM_DSLPackage#getUnits()
 * @model
 * @generated
 */
public enum Units implements Enumerator {
	/**
	 * The '<em><b>MM S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MM_S_VALUE
	 * @generated
	 * @ordered
	 */
	MM_S(0, "MM_S", "MM_S"),

	/**
	 * The '<em><b>CM S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CM_S_VALUE
	 * @generated
	 * @ordered
	 */
	CM_S(1, "CM_S", "CM_S"),

	/**
	 * The '<em><b>MS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_VALUE
	 * @generated
	 * @ordered
	 */
	MS(2, "M_S", "M_S");

	/**
	 * The '<em><b>MM S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MM_S
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MM_S_VALUE = 0;

	/**
	 * The '<em><b>CM S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CM_S
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CM_S_VALUE = 1;

	/**
	 * The '<em><b>MS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS
	 * @model name="M_S"
	 * @generated
	 * @ordered
	 */
	public static final int MS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Units[] VALUES_ARRAY = new Units[] { MM_S, CM_S, MS, };

	/**
	 * A public read-only list of all the '<em><b>Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Units> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Units</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Units get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Units result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Units getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Units result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Units get(int value) {
		switch (value) {
		case MM_S_VALUE:
			return MM_S;
		case CM_S_VALUE:
			return CM_S;
		case MS_VALUE:
			return MS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Units(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Units
