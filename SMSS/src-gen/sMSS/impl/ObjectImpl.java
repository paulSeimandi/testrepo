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

import sMSS.MessageType;
import sMSS.SMSS;
import sMSS.SMSSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sMSS.impl.ObjectImpl#getSent <em>Sent</em>}</li>
 *   <li>{@link sMSS.impl.ObjectImpl#getReceived <em>Received</em>}</li>
 *   <li>{@link sMSS.impl.ObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link sMSS.impl.ObjectImpl#getSmss <em>Smss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectImpl extends NamedElementImpl implements sMSS.Object {
	/**
	 * The cached value of the '{@link #getSent() <em>Sent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSent()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageType> sent;

	/**
	 * The cached value of the '{@link #getReceived() <em>Received</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceived()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageType> received;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected sMSS.Class type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SMSSPackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getSent() {
		if (sent == null) {
			sent = new EObjectWithInverseResolvingEList<MessageType>(MessageType.class, this, SMSSPackage.OBJECT__SENT,
					SMSSPackage.MESSAGE_TYPE__SENDER);
		}
		return sent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getReceived() {
		if (received == null) {
			received = new EObjectWithInverseResolvingEList<MessageType>(MessageType.class, this,
					SMSSPackage.OBJECT__RECEIVED, SMSSPackage.MESSAGE_TYPE__RECEIVER);
		}
		return received;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sMSS.Class getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (sMSS.Class) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMSSPackage.OBJECT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sMSS.Class basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(sMSS.Class newType, NotificationChain msgs) {
		sMSS.Class oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SMSSPackage.OBJECT__TYPE,
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
	public void setType(sMSS.Class newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this, SMSSPackage.CLASS__OBJECTS, sMSS.Class.class,
						msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this, SMSSPackage.CLASS__OBJECTS, sMSS.Class.class,
						msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMSSPackage.OBJECT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMSS getSmss() {
		if (eContainerFeatureID() != SMSSPackage.OBJECT__SMSS)
			return null;
		return (SMSS) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmss(SMSS newSmss, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSmss, SMSSPackage.OBJECT__SMSS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmss(SMSS newSmss) {
		if (newSmss != eInternalContainer() || (eContainerFeatureID() != SMSSPackage.OBJECT__SMSS && newSmss != null)) {
			if (EcoreUtil.isAncestor(this, newSmss))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSmss != null)
				msgs = ((InternalEObject) newSmss).eInverseAdd(this, SMSSPackage.SMSS__OBJECTS, SMSS.class, msgs);
			msgs = basicSetSmss(newSmss, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMSSPackage.OBJECT__SMSS, newSmss, newSmss));
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
		case SMSSPackage.OBJECT__SENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSent()).basicAdd(otherEnd, msgs);
		case SMSSPackage.OBJECT__RECEIVED:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReceived()).basicAdd(otherEnd, msgs);
		case SMSSPackage.OBJECT__TYPE:
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this, SMSSPackage.CLASS__OBJECTS, sMSS.Class.class,
						msgs);
			return basicSetType((sMSS.Class) otherEnd, msgs);
		case SMSSPackage.OBJECT__SMSS:
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
		case SMSSPackage.OBJECT__SENT:
			return ((InternalEList<?>) getSent()).basicRemove(otherEnd, msgs);
		case SMSSPackage.OBJECT__RECEIVED:
			return ((InternalEList<?>) getReceived()).basicRemove(otherEnd, msgs);
		case SMSSPackage.OBJECT__TYPE:
			return basicSetType(null, msgs);
		case SMSSPackage.OBJECT__SMSS:
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
		case SMSSPackage.OBJECT__SMSS:
			return eInternalContainer().eInverseRemove(this, SMSSPackage.SMSS__OBJECTS, SMSS.class, msgs);
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
		case SMSSPackage.OBJECT__SENT:
			return getSent();
		case SMSSPackage.OBJECT__RECEIVED:
			return getReceived();
		case SMSSPackage.OBJECT__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case SMSSPackage.OBJECT__SMSS:
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
		case SMSSPackage.OBJECT__SENT:
			getSent().clear();
			getSent().addAll((Collection<? extends MessageType>) newValue);
			return;
		case SMSSPackage.OBJECT__RECEIVED:
			getReceived().clear();
			getReceived().addAll((Collection<? extends MessageType>) newValue);
			return;
		case SMSSPackage.OBJECT__TYPE:
			setType((sMSS.Class) newValue);
			return;
		case SMSSPackage.OBJECT__SMSS:
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
		case SMSSPackage.OBJECT__SENT:
			getSent().clear();
			return;
		case SMSSPackage.OBJECT__RECEIVED:
			getReceived().clear();
			return;
		case SMSSPackage.OBJECT__TYPE:
			setType((sMSS.Class) null);
			return;
		case SMSSPackage.OBJECT__SMSS:
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
		case SMSSPackage.OBJECT__SENT:
			return sent != null && !sent.isEmpty();
		case SMSSPackage.OBJECT__RECEIVED:
			return received != null && !received.isEmpty();
		case SMSSPackage.OBJECT__TYPE:
			return type != null;
		case SMSSPackage.OBJECT__SMSS:
			return getSmss() != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectImpl
