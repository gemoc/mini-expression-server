/**
 */
package fr.inria.diverse.webservice.dsl.event.webserviceevent;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage
 * @generated
 */
public interface WebserviceeventFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebserviceeventFactory eINSTANCE = fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>App Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Service Event</em>'.
	 * @generated
	 */
	AppServiceEvent createAppServiceEvent();

	/**
	 * Returns a new object of class '<em>App Result Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Result Event</em>'.
	 * @generated
	 */
	AppResultEvent createAppResultEvent();

	/**
	 * Returns a new object of class '<em>App Auth Failure Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Auth Failure Event</em>'.
	 * @generated
	 */
	AppAuthFailureEvent createAppAuthFailureEvent();

	/**
	 * Returns a new object of class '<em>App Auth Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Auth Event</em>'.
	 * @generated
	 */
	AppAuthEvent createAppAuthEvent();

	/**
	 * Returns a new object of class '<em>App Auth Success Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Auth Success Event</em>'.
	 * @generated
	 */
	AppAuthSuccessEvent createAppAuthSuccessEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WebserviceeventPackage getWebserviceeventPackage();

} //WebserviceeventFactory
