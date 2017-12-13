/**
 */
package fr.inria.diverse.webservice.dsl.event.webserviceevent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Auth Success Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthSuccessEvent#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage#getAppAuthSuccessEvent()
 * @model
 * @generated
 */
public interface AppAuthSuccessEvent extends AppEvent {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage#getAppAuthSuccessEvent_Token()
	 * @model
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthSuccessEvent#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

} // AppAuthSuccessEvent
