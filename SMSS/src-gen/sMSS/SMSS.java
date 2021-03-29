/**
 */
package sMSS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMSS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sMSS.SMSS#getMessageTypes <em>Message Types</em>}</li>
 *   <li>{@link sMSS.SMSS#getObjects <em>Objects</em>}</li>
 *   <li>{@link sMSS.SMSS#getClasses <em>Classes</em>}</li>
 *   <li>{@link sMSS.SMSS#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see sMSS.SMSSPackage#getSMSS()
 * @model
 * @generated
 */
public interface SMSS extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Types</b></em>' containment reference list.
	 * The list contents are of type {@link sMSS.MessageType}.
	 * It is bidirectional and its opposite is '{@link sMSS.MessageType#getSmss <em>Smss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Types</em>' containment reference list.
	 * @see sMSS.SMSSPackage#getSMSS_MessageTypes()
	 * @see sMSS.MessageType#getSmss
	 * @model opposite="smss" containment="true"
	 * @generated
	 */
	EList<MessageType> getMessageTypes();

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link sMSS.Object}.
	 * It is bidirectional and its opposite is '{@link sMSS.Object#getSmss <em>Smss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see sMSS.SMSSPackage#getSMSS_Objects()
	 * @see sMSS.Object#getSmss
	 * @model opposite="smss" containment="true"
	 * @generated
	 */
	EList<sMSS.Object> getObjects();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link sMSS.Class}.
	 * It is bidirectional and its opposite is '{@link sMSS.Class#getSmss <em>Smss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see sMSS.SMSSPackage#getSMSS_Classes()
	 * @see sMSS.Class#getSmss
	 * @model opposite="smss" containment="true"
	 * @generated
	 */
	EList<sMSS.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sMSS.Method#getSmss <em>Smss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(Method)
	 * @see sMSS.SMSSPackage#getSMSS_Method()
	 * @see sMSS.Method#getSmss
	 * @model opposite="smss" containment="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link sMSS.SMSS#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

} // SMSS
