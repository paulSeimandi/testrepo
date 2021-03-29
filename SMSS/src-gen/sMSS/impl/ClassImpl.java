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

import sMSS.Method;
import sMSS.SMSS;
import sMSS.SMSSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sMSS.impl.ClassImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link sMSS.impl.ClassImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link sMSS.impl.ClassImpl#getSmss <em>Smss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends NamedElementImpl implements sMSS.Class {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Method method;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<sMSS.Object> objects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SMSSPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject) method;
			method = (Method) eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMSSPackage.CLASS__METHOD, oldMethod,
							method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetMethod() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SMSSPackage.CLASS__METHOD,
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
				msgs = ((InternalEObject) method).eInverseRemove(this, SMSSPackage.METHOD__CLASS, Method.class, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject) newMethod).eInverseAdd(this, SMSSPackage.METHOD__CLASS, Method.class, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMSSPackage.CLASS__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<sMSS.Object> getObjects() {
		if (objects == null) {
			objects = new EObjectWithInverseResolvingEList<sMSS.Object>(sMSS.Object.class, this,
					SMSSPackage.CLASS__OBJECTS, SMSSPackage.OBJECT__TYPE);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMSS getSmss() {
		if (eContainerFeatureID() != SMSSPackage.CLASS__SMSS)
			return null;
		return (SMSS) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmss(SMSS newSmss, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSmss, SMSSPackage.CLASS__SMSS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmss(SMSS newSmss) {
		if (newSmss != eInternalContainer() || (eContainerFeatureID() != SMSSPackage.CLASS__SMSS && newSmss != null)) {
			if (EcoreUtil.isAncestor(this, newSmss))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSmss != null)
				msgs = ((InternalEObject) newSmss).eInverseAdd(this, SMSSPackage.SMSS__CLASSES, SMSS.class, msgs);
			msgs = basicSetSmss(newSmss, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMSSPackage.CLASS__SMSS, newSmss, newSmss));
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
		case SMSSPackage.CLASS__METHOD:
			if (method != null)
				msgs = ((InternalEObject) method).eInverseRemove(this, SMSSPackage.METHOD__CLASS, Method.class, msgs);
			return basicSetMethod((Method) otherEnd, msgs);
		case SMSSPackage.CLASS__OBJECTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getObjects()).basicAdd(otherEnd, msgs);
		case SMSSPackage.CLASS__SMSS:
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
		case SMSSPackage.CLASS__METHOD:
			return basicSetMethod(null, msgs);
		case SMSSPackage.CLASS__OBJECTS:
			return ((InternalEList<?>) getObjects()).basicRemove(otherEnd, msgs);
		case SMSSPackage.CLASS__SMSS:
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
		case SMSSPackage.CLASS__SMSS:
			return eInternalContainer().eInverseRemove(this, SMSSPackage.SMSS__CLASSES, SMSS.class, msgs);
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
		case SMSSPackage.CLASS__METHOD:
			if (resolve)
				return getMethod();
			return basicGetMethod();
		case SMSSPackage.CLASS__OBJECTS:
			return getObjects();
		case SMSSPackage.CLASS__SMSS:
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
		case SMSSPackage.CLASS__METHOD:
			setMethod((Method) newValue);
			return;
		case SMSSPackage.CLASS__OBJECTS:
			getObjects().clear();
			getObjects().addAll((Collection<? extends sMSS.Object>) newValue);
			return;
		case SMSSPackage.CLASS__SMSS:
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
		case SMSSPackage.CLASS__METHOD:
			setMethod((Method) null);
			return;
		case SMSSPackage.CLASS__OBJECTS:
			getObjects().clear();
			return;
		case SMSSPackage.CLASS__SMSS:
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
		case SMSSPackage.CLASS__METHOD:
			return method != null;
		case SMSSPackage.CLASS__OBJECTS:
			return objects != null && !objects.isEmpty();
		case SMSSPackage.CLASS__SMSS:
			return getSmss() != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
