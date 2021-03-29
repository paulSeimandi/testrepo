/**
 */
package sMSS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sMSS.SMSSFactory
 * @model kind="package"
 * @generated
 */
public interface SMSSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sMSS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sMSS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sMSS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SMSSPackage eINSTANCE = sMSS.impl.SMSSPackageImpl.init();

	/**
	 * The meta object id for the '{@link sMSS.impl.SMSSImpl <em>SMSS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sMSS.impl.SMSSImpl
	 * @see sMSS.impl.SMSSPackageImpl#getSMSS()
	 * @generated
	 */
	int SMSS = 0;

	/**
	 * The feature id for the '<em><b>Message Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMSS__MESSAGE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMSS__OBJECTS = 1;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMSS__CLASSES = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMSS__METHOD = 3;

	/**
	 * The number of structural features of the '<em>SMSS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMSS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>SMSS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMSS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sMSS.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sMSS.impl.NamedElementImpl
	 * @see sMSS.impl.SMSSPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sMSS.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sMSS.impl.ClassImpl
	 * @see sMSS.impl.SMSSPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METHOD = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OBJECTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Smss</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SMSS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sMSS.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sMSS.impl.MethodImpl
	 * @see sMSS.impl.SMSSPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CLASS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Smss</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SMSS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sMSS.impl.MessageTypeImpl <em>Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sMSS.impl.MessageTypeImpl
	 * @see sMSS.impl.SMSSPackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__SENDER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__RECEIVER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__MESSAGES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Smss</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__SMSS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sMSS.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sMSS.impl.ElementImpl
	 * @see sMSS.impl.SMSSPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__METHOD = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sMSS.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sMSS.impl.MessageImpl
	 * @see sMSS.impl.SMSSPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__METHOD = ELEMENT__METHOD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TYPE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OPERAND = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sMSS.impl.FragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sMSS.impl.FragmentImpl
	 * @see sMSS.impl.SMSSPackageImpl#getFragment()
	 * @generated
	 */
	int FRAGMENT = 6;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__METHOD = ELEMENT__METHOD;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__OPERANDS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__TYPE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sMSS.impl.OperandImpl <em>Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sMSS.impl.OperandImpl
	 * @see sMSS.impl.SMSSPackageImpl#getOperand()
	 * @generated
	 */
	int OPERAND = 7;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__MESSAGES = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__FRAGMENT = 2;

	/**
	 * The number of structural features of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sMSS.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sMSS.impl.ObjectImpl
	 * @see sMSS.impl.SMSSPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Received</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__RECEIVED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Smss</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SMSS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sMSS.FragmentType <em>Fragment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sMSS.FragmentType
	 * @see sMSS.impl.SMSSPackageImpl#getFragmentType()
	 * @generated
	 */
	int FRAGMENT_TYPE = 10;

	/**
	 * Returns the meta object for class '{@link sMSS.SMSS <em>SMSS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SMSS</em>'.
	 * @see sMSS.SMSS
	 * @generated
	 */
	EClass getSMSS();

	/**
	 * Returns the meta object for the containment reference list '{@link sMSS.SMSS#getMessageTypes <em>Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Types</em>'.
	 * @see sMSS.SMSS#getMessageTypes()
	 * @see #getSMSS()
	 * @generated
	 */
	EReference getSMSS_MessageTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link sMSS.SMSS#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see sMSS.SMSS#getObjects()
	 * @see #getSMSS()
	 * @generated
	 */
	EReference getSMSS_Objects();

	/**
	 * Returns the meta object for the containment reference list '{@link sMSS.SMSS#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see sMSS.SMSS#getClasses()
	 * @see #getSMSS()
	 * @generated
	 */
	EReference getSMSS_Classes();

	/**
	 * Returns the meta object for the containment reference '{@link sMSS.SMSS#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see sMSS.SMSS#getMethod()
	 * @see #getSMSS()
	 * @generated
	 */
	EReference getSMSS_Method();

	/**
	 * Returns the meta object for class '{@link sMSS.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see sMSS.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference '{@link sMSS.Class#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see sMSS.Class#getMethod()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Method();

	/**
	 * Returns the meta object for the reference list '{@link sMSS.Class#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Objects</em>'.
	 * @see sMSS.Class#getObjects()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Objects();

	/**
	 * Returns the meta object for the container reference '{@link sMSS.Class#getSmss <em>Smss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Smss</em>'.
	 * @see sMSS.Class#getSmss()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Smss();

	/**
	 * Returns the meta object for class '{@link sMSS.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see sMSS.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link sMSS.Method#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see sMSS.Method#getElements()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Elements();

	/**
	 * Returns the meta object for the reference '{@link sMSS.Method#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see sMSS.Method#getClass_()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Class();

	/**
	 * Returns the meta object for the container reference '{@link sMSS.Method#getSmss <em>Smss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Smss</em>'.
	 * @see sMSS.Method#getSmss()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Smss();

	/**
	 * Returns the meta object for class '{@link sMSS.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Type</em>'.
	 * @see sMSS.MessageType
	 * @generated
	 */
	EClass getMessageType();

	/**
	 * Returns the meta object for the reference '{@link sMSS.MessageType#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see sMSS.MessageType#getSender()
	 * @see #getMessageType()
	 * @generated
	 */
	EReference getMessageType_Sender();

	/**
	 * Returns the meta object for the reference '{@link sMSS.MessageType#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see sMSS.MessageType#getReceiver()
	 * @see #getMessageType()
	 * @generated
	 */
	EReference getMessageType_Receiver();

	/**
	 * Returns the meta object for the reference list '{@link sMSS.MessageType#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Messages</em>'.
	 * @see sMSS.MessageType#getMessages()
	 * @see #getMessageType()
	 * @generated
	 */
	EReference getMessageType_Messages();

	/**
	 * Returns the meta object for the container reference '{@link sMSS.MessageType#getSmss <em>Smss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Smss</em>'.
	 * @see sMSS.MessageType#getSmss()
	 * @see #getMessageType()
	 * @generated
	 */
	EReference getMessageType_Smss();

	/**
	 * Returns the meta object for class '{@link sMSS.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see sMSS.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link sMSS.Message#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see sMSS.Message#getType()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Type();

	/**
	 * Returns the meta object for the container reference '{@link sMSS.Message#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operand</em>'.
	 * @see sMSS.Message#getOperand()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Operand();

	/**
	 * Returns the meta object for class '{@link sMSS.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see sMSS.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the container reference '{@link sMSS.Element#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see sMSS.Element#getMethod()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Method();

	/**
	 * Returns the meta object for class '{@link sMSS.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see sMSS.Fragment
	 * @generated
	 */
	EClass getFragment();

	/**
	 * Returns the meta object for the containment reference list '{@link sMSS.Fragment#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see sMSS.Fragment#getOperands()
	 * @see #getFragment()
	 * @generated
	 */
	EReference getFragment_Operands();

	/**
	 * Returns the meta object for the attribute '{@link sMSS.Fragment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sMSS.Fragment#getType()
	 * @see #getFragment()
	 * @generated
	 */
	EAttribute getFragment_Type();

	/**
	 * Returns the meta object for class '{@link sMSS.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand</em>'.
	 * @see sMSS.Operand
	 * @generated
	 */
	EClass getOperand();

	/**
	 * Returns the meta object for the containment reference list '{@link sMSS.Operand#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see sMSS.Operand#getMessages()
	 * @see #getOperand()
	 * @generated
	 */
	EReference getOperand_Messages();

	/**
	 * Returns the meta object for the attribute '{@link sMSS.Operand#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see sMSS.Operand#getCondition()
	 * @see #getOperand()
	 * @generated
	 */
	EAttribute getOperand_Condition();

	/**
	 * Returns the meta object for the container reference '{@link sMSS.Operand#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fragment</em>'.
	 * @see sMSS.Operand#getFragment()
	 * @see #getOperand()
	 * @generated
	 */
	EReference getOperand_Fragment();

	/**
	 * Returns the meta object for class '{@link sMSS.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see sMSS.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the reference list '{@link sMSS.Object#getSent <em>Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sent</em>'.
	 * @see sMSS.Object#getSent()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Sent();

	/**
	 * Returns the meta object for the reference list '{@link sMSS.Object#getReceived <em>Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Received</em>'.
	 * @see sMSS.Object#getReceived()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Received();

	/**
	 * Returns the meta object for the reference '{@link sMSS.Object#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see sMSS.Object#getType()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Type();

	/**
	 * Returns the meta object for the container reference '{@link sMSS.Object#getSmss <em>Smss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Smss</em>'.
	 * @see sMSS.Object#getSmss()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Smss();

	/**
	 * Returns the meta object for class '{@link sMSS.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see sMSS.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link sMSS.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sMSS.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for enum '{@link sMSS.FragmentType <em>Fragment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fragment Type</em>'.
	 * @see sMSS.FragmentType
	 * @generated
	 */
	EEnum getFragmentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SMSSFactory getSMSSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sMSS.impl.SMSSImpl <em>SMSS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sMSS.impl.SMSSImpl
		 * @see sMSS.impl.SMSSPackageImpl#getSMSS()
		 * @generated
		 */
		EClass SMSS = eINSTANCE.getSMSS();

		/**
		 * The meta object literal for the '<em><b>Message Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMSS__MESSAGE_TYPES = eINSTANCE.getSMSS_MessageTypes();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMSS__OBJECTS = eINSTANCE.getSMSS_Objects();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMSS__CLASSES = eINSTANCE.getSMSS_Classes();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMSS__METHOD = eINSTANCE.getSMSS_Method();

		/**
		 * The meta object literal for the '{@link sMSS.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sMSS.impl.ClassImpl
		 * @see sMSS.impl.SMSSPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__METHOD = eINSTANCE.getClass_Method();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OBJECTS = eINSTANCE.getClass_Objects();

		/**
		 * The meta object literal for the '<em><b>Smss</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SMSS = eINSTANCE.getClass_Smss();

		/**
		 * The meta object literal for the '{@link sMSS.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sMSS.impl.MethodImpl
		 * @see sMSS.impl.SMSSPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__ELEMENTS = eINSTANCE.getMethod_Elements();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__CLASS = eINSTANCE.getMethod_Class();

		/**
		 * The meta object literal for the '<em><b>Smss</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__SMSS = eINSTANCE.getMethod_Smss();

		/**
		 * The meta object literal for the '{@link sMSS.impl.MessageTypeImpl <em>Message Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sMSS.impl.MessageTypeImpl
		 * @see sMSS.impl.SMSSPackageImpl#getMessageType()
		 * @generated
		 */
		EClass MESSAGE_TYPE = eINSTANCE.getMessageType();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_TYPE__SENDER = eINSTANCE.getMessageType_Sender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_TYPE__RECEIVER = eINSTANCE.getMessageType_Receiver();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_TYPE__MESSAGES = eINSTANCE.getMessageType_Messages();

		/**
		 * The meta object literal for the '<em><b>Smss</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_TYPE__SMSS = eINSTANCE.getMessageType_Smss();

		/**
		 * The meta object literal for the '{@link sMSS.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sMSS.impl.MessageImpl
		 * @see sMSS.impl.SMSSPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__TYPE = eINSTANCE.getMessage_Type();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__OPERAND = eINSTANCE.getMessage_Operand();

		/**
		 * The meta object literal for the '{@link sMSS.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sMSS.impl.ElementImpl
		 * @see sMSS.impl.SMSSPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__METHOD = eINSTANCE.getElement_Method();

		/**
		 * The meta object literal for the '{@link sMSS.impl.FragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sMSS.impl.FragmentImpl
		 * @see sMSS.impl.SMSSPackageImpl#getFragment()
		 * @generated
		 */
		EClass FRAGMENT = eINSTANCE.getFragment();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT__OPERANDS = eINSTANCE.getFragment_Operands();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT__TYPE = eINSTANCE.getFragment_Type();

		/**
		 * The meta object literal for the '{@link sMSS.impl.OperandImpl <em>Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sMSS.impl.OperandImpl
		 * @see sMSS.impl.SMSSPackageImpl#getOperand()
		 * @generated
		 */
		EClass OPERAND = eINSTANCE.getOperand();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND__MESSAGES = eINSTANCE.getOperand_Messages();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERAND__CONDITION = eINSTANCE.getOperand_Condition();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND__FRAGMENT = eINSTANCE.getOperand_Fragment();

		/**
		 * The meta object literal for the '{@link sMSS.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sMSS.impl.ObjectImpl
		 * @see sMSS.impl.SMSSPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Sent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__SENT = eINSTANCE.getObject_Sent();

		/**
		 * The meta object literal for the '<em><b>Received</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__RECEIVED = eINSTANCE.getObject_Received();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__TYPE = eINSTANCE.getObject_Type();

		/**
		 * The meta object literal for the '<em><b>Smss</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__SMSS = eINSTANCE.getObject_Smss();

		/**
		 * The meta object literal for the '{@link sMSS.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sMSS.impl.NamedElementImpl
		 * @see sMSS.impl.SMSSPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link sMSS.FragmentType <em>Fragment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sMSS.FragmentType
		 * @see sMSS.impl.SMSSPackageImpl#getFragmentType()
		 * @generated
		 */
		EEnum FRAGMENT_TYPE = eINSTANCE.getFragmentType();

	}

} //SMSSPackage
