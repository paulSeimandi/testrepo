/**
 */
package sMSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sMSS.Object#getSent <em>Sent</em>}</li>
 *   <li>{@link sMSS.Object#getReceived <em>Received</em>}</li>
 *   <li>{@link sMSS.Object#getType <em>Type</em>}</li>
 *   <li>{@link sMSS.Object#getSmss <em>Smss</em>}</li>
 * </ul>
 *
 * @see sMSS.SMSSPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sent</b></em>' reference list.
	 * The list contents are of type {@link sMSS.MessageType}.
	 * It is bidirectional and its opposite is '{@link sMSS.MessageType#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sent</em>' reference list.
	 * @see sMSS.SMSSPackage#getObject_Sent()
	 * @see sMSS.MessageType#getSender
	 * @model opposite="sender"
	 * @generated
	 */
	EList<MessageType> getSent();

	/**
	 * Returns the value of the '<em><b>Received</b></em>' reference list.
	 * The list contents are of type {@link sMSS.MessageType}.
	 * It is bidirectional and its opposite is '{@link sMSS.MessageType#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received</em>' reference list.
	 * @see sMSS.SMSSPackage#getObject_Received()
	 * @see sMSS.MessageType#getReceiver
	 * @model opposite="receiver"
	 * @generated
	 */
	EList<MessageType> getReceived();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sMSS.Class#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(sMSS.Class)
	 * @see sMSS.SMSSPackage#getObject_Type()
	 * @see sMSS.Class#getObjects
	 * @model opposite="objects" required="true"
	 * @generated
	 */
	sMSS.Class getType();

	/**
	 * Sets the value of the '{@link sMSS.Object#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(sMSS.Class value);

	/**
	 * Returns the value of the '<em><b>Smss</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sMSS.SMSS#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smss</em>' container reference.
	 * @see #setSmss(SMSS)
	 * @see sMSS.SMSSPackage#getObject_Smss()
	 * @see sMSS.SMSS#getObjects
	 * @model opposite="objects" required="true" transient="false"
	 * @generated
	 */
	SMSS getSmss();

	/**
	 * Sets the value of the '{@link sMSS.Object#getSmss <em>Smss</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smss</em>' container reference.
	 * @see #getSmss()
	 * @generated
	 */
	void setSmss(SMSS value);

} // Object
