/**
 */
package fr.inria.diverse.webservice.dsl.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.webservice.dsl.model.Service#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.webservice.dsl.model.Service#getAllowedUsers <em>Allowed Users</em>}</li>
 *   <li>{@link fr.inria.diverse.webservice.dsl.model.Service#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link fr.inria.diverse.webservice.dsl.model.Service#getAcceptedParams <em>Accepted Params</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.webservice.dsl.model.ModelPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Allowed Users</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.webservice.dsl.model.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Users</em>' reference list.
	 * @see fr.inria.diverse.webservice.dsl.model.ModelPackage#getService_AllowedUsers()
	 * @model
	 * @generated
	 */
	EList<User> getAllowedUsers();

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see fr.inria.diverse.webservice.dsl.model.ModelPackage#getService_MethodName()
	 * @model
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.webservice.dsl.model.Service#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Accepted Params</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepted Params</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Params</em>' attribute list.
	 * @see fr.inria.diverse.webservice.dsl.model.ModelPackage#getService_AcceptedParams()
	 * @model
	 * @generated
	 */
	EList<String> getAcceptedParams();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.inria.diverse.webservice.dsl.model.ModelPackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.webservice.dsl.model.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Service
