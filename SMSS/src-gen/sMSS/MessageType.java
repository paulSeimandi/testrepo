/**
 */
package sMSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sMSS.MessageType#getSender <em>Sender</em>}</li>
 *   <li>{@link sMSS.MessageType#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link sMSS.MessageType#getMessages <em>Messages</em>}</li>
 *   <li>{@link sMSS.MessageType#getSmss <em>Smss</em>}</li>
 * </ul>
 *
 * @see sMSS.SMSSPackage#getMessageType()
 * @model
 * @generated
 */
public interface MessageType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sMSS.Object#getSent <em>Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(sMSS.Object)
	 * @see sMSS.SMSSPackage#getMessageType_Sender()
	 * @see sMSS.Object#getSent
	 * @model opposite="sent" required="true"
	 * @generated
	 */
	sMSS.Object getSender();

	/**
	 * Sets the value of the '{@link sMSS.MessageType#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(sMSS.Object value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sMSS.Object#getReceived <em>Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(sMSS.Object)
	 * @see sMSS.SMSSPackage#getMessageType_Receiver()
	 * @see sMSS.Object#getReceived
	 * @model opposite="received" required="true"
	 * @generated
	 */
	sMSS.Object getReceiver();

	/**
	 * Sets the value of the '{@link sMSS.MessageType#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(sMSS.Object value);

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' reference list.
	 * The list contents are of type {@link sMSS.Message}.
	 * It is bidirectional and its opposite is '{@link sMSS.Message#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' reference list.
	 * @see sMSS.SMSSPackage#getMessageType_Messages()
	 * @see sMSS.Message#getType
	 * @model opposite="type"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Returns the value of the '<em><b>Smss</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sMSS.SMSS#getMessageTypes <em>Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smss</em>' container reference.
	 * @see #setSmss(SMSS)
	 * @see sMSS.SMSSPackage#getMessageType_Smss()
	 * @see sMSS.SMSS#getMessageTypes
	 * @model opposite="messageTypes" required="true" transient="false"
	 * @generated
	 */
	SMSS getSmss();

	/**
	 * Sets the value of the '{@link sMSS.MessageType#getSmss <em>Smss</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smss</em>' container reference.
	 * @see #getSmss()
	 * @generated
	 */
	void setSmss(SMSS value);

} // MessageType
