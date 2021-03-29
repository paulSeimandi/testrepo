/**
 */
package sMSS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sMSS.Message#getType <em>Type</em>}</li>
 *   <li>{@link sMSS.Message#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see sMSS.SMSSPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends Element {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sMSS.MessageType#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(MessageType)
	 * @see sMSS.SMSSPackage#getMessage_Type()
	 * @see sMSS.MessageType#getMessages
	 * @model opposite="messages" required="true"
	 * @generated
	 */
	MessageType getType();

	/**
	 * Sets the value of the '{@link sMSS.Message#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sMSS.Operand#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' container reference.
	 * @see #setOperand(Operand)
	 * @see sMSS.SMSSPackage#getMessage_Operand()
	 * @see sMSS.Operand#getMessages
	 * @model opposite="messages" transient="false"
	 * @generated
	 */
	Operand getOperand();

	/**
	 * Sets the value of the '{@link sMSS.Message#getOperand <em>Operand</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' container reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Operand value);

} // Message
