/**
 */
package fr.inria.diverse.webservice.dsl.model.impl;

import fr.inria.diverse.webservice.dsl.model.ModelPackage;
import fr.inria.diverse.webservice.dsl.model.Service;
import fr.inria.diverse.webservice.dsl.model.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.webservice.dsl.model.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.webservice.dsl.model.impl.ServiceImpl#getAllowedUsers <em>Allowed Users</em>}</li>
 *   <li>{@link fr.inria.diverse.webservice.dsl.model.impl.ServiceImpl#getFqn <em>Fqn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllowedUsers() <em>Allowed Users</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> allowedUsers;

	/**
	 * The default value of the '{@link #getFqn() <em>Fqn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFqn()
	 * @generated
	 * @ordered
	 */
	protected static final String FQN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFqn() <em>Fqn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFqn()
	 * @generated
	 * @ordered
	 */
	protected String fqn = FQN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getAllowedUsers() {
		if (allowedUsers == null) {
			allowedUsers = new EObjectResolvingEList<User>(User.class, this, ModelPackage.SERVICE__ALLOWED_USERS);
		}
		return allowedUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFqn() {
		return fqn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFqn(String newFqn) {
		String oldFqn = fqn;
		fqn = newFqn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SERVICE__FQN, oldFqn, fqn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.SERVICE__NAME:
			return getName();
		case ModelPackage.SERVICE__ALLOWED_USERS:
			return getAllowedUsers();
		case ModelPackage.SERVICE__FQN:
			return getFqn();
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
		case ModelPackage.SERVICE__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.SERVICE__ALLOWED_USERS:
			getAllowedUsers().clear();
			getAllowedUsers().addAll((Collection<? extends User>) newValue);
			return;
		case ModelPackage.SERVICE__FQN:
			setFqn((String) newValue);
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
		case ModelPackage.SERVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.SERVICE__ALLOWED_USERS:
			getAllowedUsers().clear();
			return;
		case ModelPackage.SERVICE__FQN:
			setFqn(FQN_EDEFAULT);
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
		case ModelPackage.SERVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.SERVICE__ALLOWED_USERS:
			return allowedUsers != null && !allowedUsers.isEmpty();
		case ModelPackage.SERVICE__FQN:
			return FQN_EDEFAULT == null ? fqn != null : !FQN_EDEFAULT.equals(fqn);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", fqn: ");
		result.append(fqn);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
