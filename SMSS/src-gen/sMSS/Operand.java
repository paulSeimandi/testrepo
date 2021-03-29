/**
 */
package sMSS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sMSS.Operand#getMessages <em>Messages</em>}</li>
 *   <li>{@link sMSS.Operand#getCondition <em>Condition</em>}</li>
 *   <li>{@link sMSS.Operand#getFragment <em>Fragment</em>}</li>
 * </ul>
 *
 * @see sMSS.SMSSPackage#getOperand()
 * @model
 * @generated
 */
public interface Operand extends EObject {
	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link sMSS.Message}.
	 * It is bidirectional and its opposite is '{@link sMSS.Message#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see sMSS.SMSSPackage#getOperand_Messages()
	 * @see sMSS.Message#getOperand
	 * @model opposite="operand" containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see sMSS.SMSSPackage#getOperand_Condition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link sMSS.Operand#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sMSS.Fragment#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' container reference.
	 * @see #setFragment(Fragment)
	 * @see sMSS.SMSSPackage#getOperand_Fragment()
	 * @see sMSS.Fragment#getOperands
	 * @model opposite="operands" required="true" transient="false"
	 * @generated
	 */
	Fragment getFragment();

	/**
	 * Sets the value of the '{@link sMSS.Operand#getFragment <em>Fragment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment</em>' container reference.
	 * @see #getFragment()
	 * @generated
	 */
	void setFragment(Fragment value);

} // Operand
