/**
 */
package fr.inria.diverse.webservice.dsl.event.webserviceevent;

import fr.inria.diverse.webservice.dsl.model.App;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppEvent#getApp <em>App</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage#getAppEvent()
 * @model abstract="true"
 * @generated
 */
public interface AppEvent extends WebServiceDSLEvent {
	/**
	 * Returns the value of the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App</em>' reference.
	 * @see #setApp(App)
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage#getAppEvent_App()
	 * @model required="true"
	 * @generated
	 */
	App getApp();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppEvent#getApp <em>App</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App</em>' reference.
	 * @see #getApp()
	 * @generated
	 */
	void setApp(App value);

} // AppEvent
