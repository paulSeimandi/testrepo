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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import sMSS.Element;
import sMSS.Method;
import sMSS.SMSS;
import sMSS.SMSSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sMSS.impl.MethodImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link sMSS.impl.MethodImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link sMSS.impl.MethodImpl#getSmss <em>Smss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends NamedElementImpl implements Method {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected sMSS.Class class_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SMSSPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<Element>(Element.class, this,
					SMSSPackage.METHOD__ELEMENTS, SMSSPackage.ELEMENT__METHOD);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sMSS.Class getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject) class_;
			class_ = (sMSS.Class) eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMSSPackage.METHOD__CLASS, oldClass,
							class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sMSS.Class basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(sMSS.Class newClass, NotificationChain msgs) {
		sMSS.Class oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SMSSPackage.METHOD__CLASS,
					oldClass, newClass);
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
	public void setClass(sMSS.Class newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject) class_).eInverseRemove(this, SMSSPackage.CLASS__METHOD, sMSS.Class.class,
						msgs);
			if (newClass != null)
				msgs = ((InternalEObject) newClass).eInverseAdd(this, SMSSPackage.CLASS__METHOD, sMSS.Class.class,
						msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMSSPackage.METHOD__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMSS getSmss() {
		if (eContainerFeatureID() != SMSSPackage.METHOD__SMSS)
			return null;
		return (SMSS) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmss(SMSS newSmss, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSmss, SMSSPackage.METHOD__SMSS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmss(SMSS newSmss) {
		if (newSmss != eInternalContainer() || (eContainerFeatureID() != SMSSPackage.METHOD__SMSS && newSmss != null)) {
			if (EcoreUtil.isAncestor(this, newSmss))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSmss != null)
				msgs = ((InternalEObject) newSmss).eInverseAdd(this, SMSSPackage.SMSS__METHOD, SMSS.class, msgs);
			msgs = basicSetSmss(newSmss, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMSSPackage.METHOD__SMSS, newSmss, newSmss));
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
		case SMSSPackage.METHOD__ELEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getElements()).basicAdd(otherEnd, msgs);
		case SMSSPackage.METHOD__CLASS:
			if (class_ != null)
				msgs = ((InternalEObject) class_).eInverseRemove(this, SMSSPackage.CLASS__METHOD, sMSS.Class.class,
						msgs);
			return basicSetClass((sMSS.Class) otherEnd, msgs);
		case SMSSPackage.METHOD__SMSS:
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
		case SMSSPackage.METHOD__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case SMSSPackage.METHOD__CLASS:
			return basicSetClass(null, msgs);
		case SMSSPackage.METHOD__SMSS:
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
		case SMSSPackage.METHOD__SMSS:
			return eInternalContainer().eInverseRemove(this, SMSSPackage.SMSS__METHOD, SMSS.class, msgs);
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
		case SMSSPackage.METHOD__ELEMENTS:
			return getElements();
		case SMSSPackage.METHOD__CLASS:
			if (resolve)
				return getClass_();
			return basicGetClass();
		case SMSSPackage.METHOD__SMSS:
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
		case SMSSPackage.METHOD__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends Element>) newValue);
			return;
		case SMSSPackage.METHOD__CLASS:
			setClass((sMSS.Class) newValue);
			return;
		case SMSSPackage.METHOD__SMSS:
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
		case SMSSPackage.METHOD__ELEMENTS:
			getElements().clear();
			return;
		case SMSSPackage.METHOD__CLASS:
			setClass((sMSS.Class) null);
			return;
		case SMSSPackage.METHOD__SMSS:
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
		case SMSSPackage.METHOD__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case SMSSPackage.METHOD__CLASS:
			return class_ != null;
		case SMSSPackage.METHOD__SMSS:
			return getSmss() != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodImpl
