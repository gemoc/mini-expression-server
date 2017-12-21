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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
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
 *   <li>{@link fr.inria.diverse.webservice.dsl.model.impl.ServiceImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link fr.inria.diverse.webservice.dsl.model.impl.ServiceImpl#getAcceptedParams <em>Accepted Params</em>}</li>
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
	 * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcceptedParams() <em>Accepted Params</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedParams()
	 * @generated
	 * @ordered
	 */
	protected EList<String> acceptedParams;

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
	public String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(String newMethodName) {
		String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SERVICE__METHOD_NAME, oldMethodName,
					methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAcceptedParams() {
		if (acceptedParams == null) {
			acceptedParams = new EDataTypeUniqueEList<String>(String.class, this,
					ModelPackage.SERVICE__ACCEPTED_PARAMS);
		}
		return acceptedParams;
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
		case ModelPackage.SERVICE__METHOD_NAME:
			return getMethodName();
		case ModelPackage.SERVICE__ACCEPTED_PARAMS:
			return getAcceptedParams();
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
		case ModelPackage.SERVICE__METHOD_NAME:
			setMethodName((String) newValue);
			return;
		case ModelPackage.SERVICE__ACCEPTED_PARAMS:
			getAcceptedParams().clear();
			getAcceptedParams().addAll((Collection<? extends String>) newValue);
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
		case ModelPackage.SERVICE__METHOD_NAME:
			setMethodName(METHOD_NAME_EDEFAULT);
			return;
		case ModelPackage.SERVICE__ACCEPTED_PARAMS:
			getAcceptedParams().clear();
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
		case ModelPackage.SERVICE__METHOD_NAME:
			return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
		case ModelPackage.SERVICE__ACCEPTED_PARAMS:
			return acceptedParams != null && !acceptedParams.isEmpty();
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
		result.append(", methodName: ");
		result.append(methodName);
		result.append(", acceptedParams: ");
		result.append(acceptedParams);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
