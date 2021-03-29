/**
 */
package sMSS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import sMSS.Message;
import sMSS.MessageType;
import sMSS.Operand;
import sMSS.SMSSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sMSS.impl.MessageImpl#getType <em>Type</em>}</li>
 *   <li>{@link sMSS.impl.MessageImpl#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends ElementImpl implements Message {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MessageType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SMSSPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (MessageType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMSSPackage.MESSAGE__TYPE, oldType,
							type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(MessageType newType, NotificationChain msgs) {
		MessageType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SMSSPackage.MESSAGE__TYPE,
					oldType, newType);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MessageType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this, SMSSPackage.MESSAGE_TYPE__MESSAGES,
						MessageType.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this, SMSSPackage.MESSAGE_TYPE__MESSAGES,
						MessageType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMSSPackage.MESSAGE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operand getOperand() {
		if (eContainerFeatureID() != SMSSPackage.MESSAGE__OPERAND)
			return null;
		return (Operand) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand(Operand newOperand, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOperand, SMSSPackage.MESSAGE__OPERAND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(Operand newOperand) {
		if (newOperand != eInternalContainer()
				|| (eContainerFeatureID() != SMSSPackage.MESSAGE__OPERAND && newOperand != null)) {
			if (EcoreUtil.isAncestor(this, newOperand))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperand != null)
				msgs = ((InternalEObject) newOperand).eInverseAdd(this, SMSSPackage.OPERAND__MESSAGES, Operand.class,
						msgs);
			msgs = basicSetOperand(newOperand, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMSSPackage.MESSAGE__OPERAND, newOperand,
					newOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SMSSPackage.MESSAGE__TYPE:
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this, SMSSPackage.MESSAGE_TYPE__MESSAGES,
						MessageType.class, msgs);
			return basicSetType((MessageType) otherEnd, msgs);
		case SMSSPackage.MESSAGE__OPERAND:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOperand((Operand) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SMSSPackage.MESSAGE__TYPE:
			return basicSetType(null, msgs);
		case SMSSPackage.MESSAGE__OPERAND:
			return basicSetOperand(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SMSSPackage.MESSAGE__OPERAND:
			return eInternalContainer().eInverseRemove(this, SMSSPackage.OPERAND__MESSAGES, Operand.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SMSSPackage.MESSAGE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case SMSSPackage.MESSAGE__OPERAND:
			return getOperand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SMSSPackage.MESSAGE__TYPE:
			setType((MessageType) newValue);
			return;
		case SMSSPackage.MESSAGE__OPERAND:
			setOperand((Operand) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SMSSPackage.MESSAGE__TYPE:
			setType((MessageType) null);
			return;
		case SMSSPackage.MESSAGE__OPERAND:
			setOperand((Operand) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SMSSPackage.MESSAGE__TYPE:
			return type != null;
		case SMSSPackage.MESSAGE__OPERAND:
			return getOperand() != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageImpl
