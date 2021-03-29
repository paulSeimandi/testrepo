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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import sMSS.Fragment;
import sMSS.Message;
import sMSS.Operand;
import sMSS.SMSSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sMSS.impl.OperandImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link sMSS.impl.OperandImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link sMSS.impl.OperandImpl#getFragment <em>Fragment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperandImpl extends MinimalEObjectImpl.Container implements Operand {
	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SMSSPackage.Literals.OPERAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentWithInverseEList<Message>(Message.class, this,
					SMSSPackage.OPERAND__MESSAGES, SMSSPackage.MESSAGE__OPERAND);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMSSPackage.OPERAND__CONDITION, oldCondition,
					condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment getFragment() {
		if (eContainerFeatureID() != SMSSPackage.OPERAND__FRAGMENT)
			return null;
		return (Fragment) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFragment(Fragment newFragment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFragment, SMSSPackage.OPERAND__FRAGMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFragment(Fragment newFragment) {
		if (newFragment != eInternalContainer()
				|| (eContainerFeatureID() != SMSSPackage.OPERAND__FRAGMENT && newFragment != null)) {
			if (EcoreUtil.isAncestor(this, newFragment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFragment != null)
				msgs = ((InternalEObject) newFragment).eInverseAdd(this, SMSSPackage.FRAGMENT__OPERANDS, Fragment.class,
						msgs);
			msgs = basicSetFragment(newFragment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMSSPackage.OPERAND__FRAGMENT, newFragment,
					newFragment));
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
		case SMSSPackage.OPERAND__MESSAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMessages()).basicAdd(otherEnd, msgs);
		case SMSSPackage.OPERAND__FRAGMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFragment((Fragment) otherEnd, msgs);
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
		case SMSSPackage.OPERAND__MESSAGES:
			return ((InternalEList<?>) getMessages()).basicRemove(otherEnd, msgs);
		case SMSSPackage.OPERAND__FRAGMENT:
			return basicSetFragment(null, msgs);
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
		case SMSSPackage.OPERAND__FRAGMENT:
			return eInternalContainer().eInverseRemove(this, SMSSPackage.FRAGMENT__OPERANDS, Fragment.class, msgs);
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
		case SMSSPackage.OPERAND__MESSAGES:
			return getMessages();
		case SMSSPackage.OPERAND__CONDITION:
			return getCondition();
		case SMSSPackage.OPERAND__FRAGMENT:
			return getFragment();
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
		case SMSSPackage.OPERAND__MESSAGES:
			getMessages().clear();
			getMessages().addAll((Collection<? extends Message>) newValue);
			return;
		case SMSSPackage.OPERAND__CONDITION:
			setCondition((String) newValue);
			return;
		case SMSSPackage.OPERAND__FRAGMENT:
			setFragment((Fragment) newValue);
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
		case SMSSPackage.OPERAND__MESSAGES:
			getMessages().clear();
			return;
		case SMSSPackage.OPERAND__CONDITION:
			setCondition(CONDITION_EDEFAULT);
			return;
		case SMSSPackage.OPERAND__FRAGMENT:
			setFragment((Fragment) null);
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
		case SMSSPackage.OPERAND__MESSAGES:
			return messages != null && !messages.isEmpty();
		case SMSSPackage.OPERAND__CONDITION:
			return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
		case SMSSPackage.OPERAND__FRAGMENT:
			return getFragment() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //OperandImpl
