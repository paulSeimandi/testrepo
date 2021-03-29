/**
 */
package sMSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sMSS.Class#getMethod <em>Method</em>}</li>
 *   <li>{@link sMSS.Class#getObjects <em>Objects</em>}</li>
 *   <li>{@link sMSS.Class#getSmss <em>Smss</em>}</li>
 * </ul>
 *
 * @see sMSS.SMSSPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sMSS.Method#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(Method)
	 * @see sMSS.SMSSPackage#getClass_Method()
	 * @see sMSS.Method#getClass_
	 * @model opposite="class"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link sMSS.Class#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' reference list.
	 * The list contents are of type {@link sMSS.Object}.
	 * It is bidirectional and its opposite is '{@link sMSS.Object#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' reference list.
	 * @see sMSS.SMSSPackage#getClass_Objects()
	 * @see sMSS.Object#getType
	 * @model opposite="type"
	 * @generated
	 */
	EList<sMSS.Object> getObjects();

	/**
	 * Returns the value of the '<em><b>Smss</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sMSS.SMSS#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smss</em>' container reference.
	 * @see #setSmss(SMSS)
	 * @see sMSS.SMSSPackage#getClass_Smss()
	 * @see sMSS.SMSS#getClasses
	 * @model opposite="classes" required="true" transient="false"
	 * @generated
	 */
	SMSS getSmss();

	/**
	 * Sets the value of the '{@link sMSS.Class#getSmss <em>Smss</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smss</em>' container reference.
	 * @see #getSmss()
	 * @generated
	 */
	void setSmss(SMSS value);

} // Class
