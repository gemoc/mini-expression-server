/**
 */
package fr.inria.diverse.webservice.dsl.event.webserviceevent.util;

import fr.inria.diverse.webservice.dsl.event.webserviceevent.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gemoc.executionframework.event.model.event.Event;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage
 * @generated
 */
public class WebserviceeventSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebserviceeventPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebserviceeventSwitch() {
		if (modelPackage == null) {
			modelPackage = WebserviceeventPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WebserviceeventPackage.WEB_SERVICE_DSL_EVENT: {
				WebServiceDSLEvent webServiceDSLEvent = (WebServiceDSLEvent)theEObject;
				T result = caseWebServiceDSLEvent(webServiceDSLEvent);
				if (result == null) result = caseEvent(webServiceDSLEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebserviceeventPackage.APP_EVENT: {
				AppEvent appEvent = (AppEvent)theEObject;
				T result = caseAppEvent(appEvent);
				if (result == null) result = caseWebServiceDSLEvent(appEvent);
				if (result == null) result = caseEvent(appEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebserviceeventPackage.APP_SERVICE_EVENT: {
				AppServiceEvent appServiceEvent = (AppServiceEvent)theEObject;
				T result = caseAppServiceEvent(appServiceEvent);
				if (result == null) result = caseAppEvent(appServiceEvent);
				if (result == null) result = caseWebServiceDSLEvent(appServiceEvent);
				if (result == null) result = caseEvent(appServiceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebserviceeventPackage.APP_RESULT_EVENT: {
				AppResultEvent appResultEvent = (AppResultEvent)theEObject;
				T result = caseAppResultEvent(appResultEvent);
				if (result == null) result = caseAppEvent(appResultEvent);
				if (result == null) result = caseWebServiceDSLEvent(appResultEvent);
				if (result == null) result = caseEvent(appResultEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebserviceeventPackage.APP_AUTH_FAILURE_EVENT: {
				AppAuthFailureEvent appAuthFailureEvent = (AppAuthFailureEvent)theEObject;
				T result = caseAppAuthFailureEvent(appAuthFailureEvent);
				if (result == null) result = caseAppEvent(appAuthFailureEvent);
				if (result == null) result = caseWebServiceDSLEvent(appAuthFailureEvent);
				if (result == null) result = caseEvent(appAuthFailureEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebserviceeventPackage.APP_AUTH_EVENT: {
				AppAuthEvent appAuthEvent = (AppAuthEvent)theEObject;
				T result = caseAppAuthEvent(appAuthEvent);
				if (result == null) result = caseAppEvent(appAuthEvent);
				if (result == null) result = caseWebServiceDSLEvent(appAuthEvent);
				if (result == null) result = caseEvent(appAuthEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebserviceeventPackage.APP_AUTH_SUCCESS_EVENT: {
				AppAuthSuccessEvent appAuthSuccessEvent = (AppAuthSuccessEvent)theEObject;
				T result = caseAppAuthSuccessEvent(appAuthSuccessEvent);
				if (result == null) result = caseAppEvent(appAuthSuccessEvent);
				if (result == null) result = caseWebServiceDSLEvent(appAuthSuccessEvent);
				if (result == null) result = caseEvent(appAuthSuccessEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Service DSL Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Service DSL Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebServiceDSLEvent(WebServiceDSLEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppEvent(AppEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Service Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppServiceEvent(AppServiceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Result Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Result Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppResultEvent(AppResultEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Auth Failure Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Auth Failure Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppAuthFailureEvent(AppAuthFailureEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Auth Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Auth Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppAuthEvent(AppAuthEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Auth Success Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Auth Success Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppAuthSuccessEvent(AppAuthSuccessEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WebserviceeventSwitch
