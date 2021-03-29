/**
 */
package sMSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sMSS.Method#getElements <em>Elements</em>}</li>
 *   <li>{@link sMSS.Method#getClass_ <em>Class</em>}</li>
 *   <li>{@link sMSS.Method#getSmss <em>Smss</em>}</li>
 * </ul>
 *
 * @see sMSS.SMSSPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link sMSS.Element}.
	 * It is bidirectional and its opposite is '{@link sMSS.Element#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see sMSS.SMSSPackage#getMethod_Elements()
	 * @see sMSS.Element#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sMSS.Class#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(sMSS.Class)
	 * @see sMSS.SMSSPackage#getMethod_Class()
	 * @see sMSS.Class#getMethod
	 * @model opposite="method" required="true"
	 * @generated
	 */
	sMSS.Class getClass_();

	/**
	 * Sets the value of the '{@link sMSS.Method#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(sMSS.Class value);

	/**
	 * Returns the value of the '<em><b>Smss</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sMSS.SMSS#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smss</em>' container reference.
	 * @see #setSmss(SMSS)
	 * @see sMSS.SMSSPackage#getMethod_Smss()
	 * @see sMSS.SMSS#getMethod
	 * @model opposite="method" required="true" transient="false"
	 * @generated
	 */
	SMSS getSmss();

	/**
	 * Sets the value of the '{@link sMSS.Method#getSmss <em>Smss</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smss</em>' container reference.
	 * @see #getSmss()
	 * @generated
	 */
	void setSmss(SMSS value);

} // Method
