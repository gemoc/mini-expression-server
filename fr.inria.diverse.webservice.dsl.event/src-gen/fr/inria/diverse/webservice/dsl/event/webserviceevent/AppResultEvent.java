/**
 */
package fr.inria.diverse.webservice.dsl.event.webserviceevent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Result Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppResultEvent#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage#getAppResultEvent()
 * @model
 * @generated
 */
public interface AppResultEvent extends AppEvent {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage#getAppResultEvent_Result()
	 * @model
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppResultEvent#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

} // AppResultEvent
