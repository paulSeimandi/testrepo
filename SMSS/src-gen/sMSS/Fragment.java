/**
 */
package sMSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sMSS.Fragment#getOperands <em>Operands</em>}</li>
 *   <li>{@link sMSS.Fragment#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sMSS.SMSSPackage#getFragment()
 * @model
 * @generated
 */
public interface Fragment extends Element {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link sMSS.Operand}.
	 * It is bidirectional and its opposite is '{@link sMSS.Operand#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see sMSS.SMSSPackage#getFragment_Operands()
	 * @see sMSS.Operand#getFragment
	 * @model opposite="fragment" containment="true"
	 * @generated
	 */
	EList<Operand> getOperands();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sMSS.FragmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sMSS.FragmentType
	 * @see #setType(FragmentType)
	 * @see sMSS.SMSSPackage#getFragment_Type()
	 * @model required="true"
	 * @generated
	 */
	FragmentType getType();

	/**
	 * Sets the value of the '{@link sMSS.Fragment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sMSS.FragmentType
	 * @see #getType()
	 * @generated
	 */
	void setType(FragmentType value);

} // Fragment
