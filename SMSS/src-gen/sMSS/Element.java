/**
 */
package sMSS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sMSS.Element#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see sMSS.SMSSPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {

	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sMSS.Method#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(Method)
	 * @see sMSS.SMSSPackage#getElement_Method()
	 * @see sMSS.Method#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link sMSS.Element#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);
} // Element
