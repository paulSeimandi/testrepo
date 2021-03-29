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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sMSS.MessageType;
import sMSS.Method;
import sMSS.SMSS;
import sMSS.SMSSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMSS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sMSS.impl.SMSSImpl#getMessageTypes <em>Message Types</em>}</li>
 *   <li>{@link sMSS.impl.SMSSImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link sMSS.impl.SMSSImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link sMSS.impl.SMSSImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SMSSImpl extends MinimalEObjectImpl.Container implements SMSS {
	/**
	 * The cached value of the '{@link #getMessageTypes() <em>Message Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageType> messageTypes;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<sMSS.Object> objects;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<sMSS.Class> classes;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Method method;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SMSSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SMSSPackage.Literals.SMSS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getMessageTypes() {
		if (messageTypes == null) {
			messageTypes = new EObjectContainmentWithInverseEList<MessageType>(MessageType.class, this,
					SMSSPackage.SMSS__MESSAGE_TYPES, SMSSPackage.MESSAGE_TYPE__SMSS);
		}
		return messageTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<sMSS.Object> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentWithInverseEList<sMSS.Object>(sMSS.Object.class, this,
					SMSSPackage.SMSS__OBJECTS, SMSSPackage.OBJECT__SMSS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<sMSS.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList<sMSS.Class>(sMSS.Class.class, this,
					SMSSPackage.SMSS__CLASSES, SMSSPackage.CLASS__SMSS);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(Method newMethod, NotificationChain msgs) {
		Method oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SMSSPackage.SMSS__METHOD,
					oldMethod, newMethod);
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
	public void setMethod(Method newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject) method).eInverseRemove(this, SMSSPackage.METHOD__SMSS, Method.class, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject) newMethod).eInverseAdd(this, SMSSPackage.METHOD__SMSS, Method.class, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMSSPackage.SMSS__METHOD, newMethod, newMethod));
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
		case SMSSPackage.SMSS__MESSAGE_TYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMessageTypes()).basicAdd(otherEnd, msgs);
		case SMSSPackage.SMSS__OBJECTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getObjects()).basicAdd(otherEnd, msgs);
		case SMSSPackage.SMSS__CLASSES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getClasses()).basicAdd(otherEnd, msgs);
		case SMSSPackage.SMSS__METHOD:
			if (method != null)
				msgs = ((InternalEObject) method).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SMSSPackage.SMSS__METHOD, null, msgs);
			return basicSetMethod((Method) otherEnd, msgs);
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
		case SMSSPackage.SMSS__MESSAGE_TYPES:
			return ((InternalEList<?>) getMessageTypes()).basicRemove(otherEnd, msgs);
		case SMSSPackage.SMSS__OBJECTS:
			return ((InternalEList<?>) getObjects()).basicRemove(otherEnd, msgs);
		case SMSSPackage.SMSS__CLASSES:
			return ((InternalEList<?>) getClasses()).basicRemove(otherEnd, msgs);
		case SMSSPackage.SMSS__METHOD:
			return basicSetMethod(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SMSSPackage.SMSS__MESSAGE_TYPES:
			return getMessageTypes();
		case SMSSPackage.SMSS__OBJECTS:
			return getObjects();
		case SMSSPackage.SMSS__CLASSES:
			return getClasses();
		case SMSSPackage.SMSS__METHOD:
			return getMethod();
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
		case SMSSPackage.SMSS__MESSAGE_TYPES:
			getMessageTypes().clear();
			getMessageTypes().addAll((Collection<? extends MessageType>) newValue);
			return;
		case SMSSPackage.SMSS__OBJECTS:
			getObjects().clear();
			getObjects().addAll((Collection<? extends sMSS.Object>) newValue);
			return;
		case SMSSPackage.SMSS__CLASSES:
			getClasses().clear();
			getClasses().addAll((Collection<? extends sMSS.Class>) newValue);
			return;
		case SMSSPackage.SMSS__METHOD:
			setMethod((Method) newValue);
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
		case SMSSPackage.SMSS__MESSAGE_TYPES:
			getMessageTypes().clear();
			return;
		case SMSSPackage.SMSS__OBJECTS:
			getObjects().clear();
			return;
		case SMSSPackage.SMSS__CLASSES:
			getClasses().clear();
			return;
		case SMSSPackage.SMSS__METHOD:
			setMethod((Method) null);
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
		case SMSSPackage.SMSS__MESSAGE_TYPES:
			return messageTypes != null && !messageTypes.isEmpty();
		case SMSSPackage.SMSS__OBJECTS:
			return objects != null && !objects.isEmpty();
		case SMSSPackage.SMSS__CLASSES:
			return classes != null && !classes.isEmpty();
		case SMSSPackage.SMSS__METHOD:
			return method != null;
		}
		return super.eIsSet(featureID);
	}

} //SMSSImpl
