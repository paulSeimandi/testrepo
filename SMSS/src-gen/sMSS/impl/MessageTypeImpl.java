/**
 */
package sMSS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import sMSS.Message;
import sMSS.MessageType;
import sMSS.SMSS;
import sMSS.SMSSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sMSS.impl.MessageTypeImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link sMSS.impl.MessageTypeImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link sMSS.impl.MessageTypeImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link sMSS.impl.MessageTypeImpl#getSmss <em>Smss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageTypeImpl extends NamedElementImpl implements MessageType {
	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected sMSS.Object sender;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected sMSS.Object receiver;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SMSSPackage.Literals.MESSAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sMSS.Object getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject) sender;
			sender = (sMSS.Object) eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMSSPackage.MESSAGE_TYPE__SENDER,
							oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sMSS.Object basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(sMSS.Object newSender, NotificationChain msgs) {
		sMSS.Object oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SMSSPackage.MESSAGE_TYPE__SENDER, oldSender, newSender);
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
	public void setSender(sMSS.Object newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject) sender).eInverseRemove(this, SMSSPackage.OBJECT__SENT, sMSS.Object.class,
						msgs);
			if (newSender != null)
				msgs = ((InternalEObject) newSender).eInverseAdd(this, SMSSPackage.OBJECT__SENT, sMSS.Object.class,
						msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMSSPackage.MESSAGE_TYPE__SENDER, newSender,
					newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sMSS.Object getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject) receiver;
			receiver = (sMSS.Object) eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMSSPackage.MESSAGE_TYPE__RECEIVER,
							oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sMSS.Object basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiver(sMSS.Object newReceiver, NotificationChain msgs) {
		sMSS.Object oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SMSSPackage.MESSAGE_TYPE__RECEIVER, oldReceiver, newReceiver);
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
	public void setReceiver(sMSS.Object newReceiver) {
		if (newReceiver != receiver) {
			NotificationChain msgs = null;
			if (receiver != null)
				msgs = ((InternalEObject) receiver).eInverseRemove(this, SMSSPackage.OBJECT__RECEIVED,
						sMSS.Object.class, msgs);
			if (newReceiver != null)
				msgs = ((InternalEObject) newReceiver).eInverseAdd(this, SMSSPackage.OBJECT__RECEIVED,
						sMSS.Object.class, msgs);
			msgs = basicSetReceiver(newReceiver, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMSSPackage.MESSAGE_TYPE__RECEIVER, newReceiver,
					newReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectWithInverseResolvingEList<Message>(Message.class, this,
					SMSSPackage.MESSAGE_TYPE__MESSAGES, SMSSPackage.MESSAGE__TYPE);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMSS getSmss() {
		if (eContainerFeatureID() != SMSSPackage.MESSAGE_TYPE__SMSS)
			return null;
		return (SMSS) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmss(SMSS newSmss, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSmss, SMSSPackage.MESSAGE_TYPE__SMSS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmss(SMSS newSmss) {
		if (newSmss != eInternalContainer()
				|| (eContainerFeatureID() != SMSSPackage.MESSAGE_TYPE__SMSS && newSmss != null)) {
			if (EcoreUtil.isAncestor(this, newSmss))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSmss != null)
				msgs = ((InternalEObject) newSmss).eInverseAdd(this, SMSSPackage.SMSS__MESSAGE_TYPES, SMSS.class, msgs);
			msgs = basicSetSmss(newSmss, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMSSPackage.MESSAGE_TYPE__SMSS, newSmss, newSmss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SMSSPackage.MESSAGE_TYPE__SENDER:
			if (sender != null)
				msgs = ((InternalEObject) sender).eInverseRemove(this, SMSSPackage.OBJECT__SENT, sMSS.Object.class,
						msgs);
			return basicSetSender((sMSS.Object) otherEnd, msgs);
		case SMSSPackage.MESSAGE_TYPE__RECEIVER:
			if (receiver != null)
				msgs = ((InternalEObject) receiver).eInverseRemove(this, SMSSPackage.OBJECT__RECEIVED,
						sMSS.Object.class, msgs);
			return basicSetReceiver((sMSS.Object) otherEnd, msgs);
		case SMSSPackage.MESSAGE_TYPE__MESSAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMessages()).basicAdd(otherEnd, msgs);
		case SMSSPackage.MESSAGE_TYPE__SMSS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSmss((SMSS) otherEnd, msgs);
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
		case SMSSPackage.MESSAGE_TYPE__SENDER:
			return basicSetSender(null, msgs);
		case SMSSPackage.MESSAGE_TYPE__RECEIVER:
			return basicSetReceiver(null, msgs);
		case SMSSPackage.MESSAGE_TYPE__MESSAGES:
			return ((InternalEList<?>) getMessages()).basicRemove(otherEnd, msgs);
		case SMSSPackage.MESSAGE_TYPE__SMSS:
			return basicSetSmss(null, msgs);
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
		case SMSSPackage.MESSAGE_TYPE__SMSS:
			return eInternalContainer().eInverseRemove(this, SMSSPackage.SMSS__MESSAGE_TYPES, SMSS.class, msgs);
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
		case SMSSPackage.MESSAGE_TYPE__SENDER:
			if (resolve)
				return getSender();
			return basicGetSender();
		case SMSSPackage.MESSAGE_TYPE__RECEIVER:
			if (resolve)
				return getReceiver();
			return basicGetReceiver();
		case SMSSPackage.MESSAGE_TYPE__MESSAGES:
			return getMessages();
		case SMSSPackage.MESSAGE_TYPE__SMSS:
			return getSmss();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SMSSPackage.MESSAGE_TYPE__SENDER:
			setSender((sMSS.Object) newValue);
			return;
		case SMSSPackage.MESSAGE_TYPE__RECEIVER:
			setReceiver((sMSS.Object) newValue);
			return;
		case SMSSPackage.MESSAGE_TYPE__MESSAGES:
			getMessages().clear();
			getMessages().addAll((Collection<? extends Message>) newValue);
			return;
		case SMSSPackage.MESSAGE_TYPE__SMSS:
			setSmss((SMSS) newValue);
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
		case SMSSPackage.MESSAGE_TYPE__SENDER:
			setSender((sMSS.Object) null);
			return;
		case SMSSPackage.MESSAGE_TYPE__RECEIVER:
			setReceiver((sMSS.Object) null);
			return;
		case SMSSPackage.MESSAGE_TYPE__MESSAGES:
			getMessages().clear();
			return;
		case SMSSPackage.MESSAGE_TYPE__SMSS:
			setSmss((SMSS) null);
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
		case SMSSPackage.MESSAGE_TYPE__SENDER:
			return sender != null;
		case SMSSPackage.MESSAGE_TYPE__RECEIVER:
			return receiver != null;
		case SMSSPackage.MESSAGE_TYPE__MESSAGES:
			return messages != null && !messages.isEmpty();
		case SMSSPackage.MESSAGE_TYPE__SMSS:
			return getSmss() != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageTypeImpl
