/**
 */
package fr.inria.diverse.webservice.dsl.event.webserviceevent;

import fr.inria.diverse.webservice.dsl.model.Param;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Service Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent#getToken <em>Token</em>}</li>
 *   <li>{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent#getService <em>Service</em>}</li>
 *   <li>{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage#getAppServiceEvent()
 * @model
 * @generated
 */
public interface AppServiceEvent extends AppEvent {
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
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage#getAppServiceEvent_Token()
	 * @model
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(String)
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage#getAppServiceEvent_Service()
	 * @model
	 * @generated
	 */
	String getService();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.webservice.dsl.model.Param}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' reference list.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage#getAppServiceEvent_Params()
	 * @model
	 * @generated
	 */
	EList<Param> getParams();

} // AppServiceEvent
