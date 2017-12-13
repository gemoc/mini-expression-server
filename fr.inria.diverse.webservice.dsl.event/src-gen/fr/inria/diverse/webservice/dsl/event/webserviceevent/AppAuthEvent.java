/**
 */
package fr.inria.diverse.webservice.dsl.event.webserviceevent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Auth Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthEvent#getLogin <em>Login</em>}</li>
 *   <li>{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthEvent#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage#getAppAuthEvent()
 * @model
 * @generated
 */
public interface AppAuthEvent extends AppEvent {
	/**
	 * Returns the value of the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login</em>' attribute.
	 * @see #setLogin(String)
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage#getAppAuthEvent_Login()
	 * @model
	 * @generated
	 */
	String getLogin();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthEvent#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage#getAppAuthEvent_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthEvent#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // AppAuthEvent
