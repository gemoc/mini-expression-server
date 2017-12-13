/**
 */
package fr.inria.diverse.webservice.dsl.event.webserviceevent.util;

import fr.inria.diverse.webservice.dsl.event.webserviceevent.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gemoc.executionframework.event.model.event.Event;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage
 * @generated
 */
public class WebserviceeventAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebserviceeventPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebserviceeventAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WebserviceeventPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebserviceeventSwitch<Adapter> modelSwitch =
		new WebserviceeventSwitch<Adapter>() {
			@Override
			public Adapter caseWebServiceDSLEvent(WebServiceDSLEvent object) {
				return createWebServiceDSLEventAdapter();
			}
			@Override
			public Adapter caseAppEvent(AppEvent object) {
				return createAppEventAdapter();
			}
			@Override
			public Adapter caseAppServiceEvent(AppServiceEvent object) {
				return createAppServiceEventAdapter();
			}
			@Override
			public Adapter caseAppResultEvent(AppResultEvent object) {
				return createAppResultEventAdapter();
			}
			@Override
			public Adapter caseAppAuthFailureEvent(AppAuthFailureEvent object) {
				return createAppAuthFailureEventAdapter();
			}
			@Override
			public Adapter caseAppAuthEvent(AppAuthEvent object) {
				return createAppAuthEventAdapter();
			}
			@Override
			public Adapter caseAppAuthSuccessEvent(AppAuthSuccessEvent object) {
				return createAppAuthSuccessEventAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.WebServiceDSLEvent <em>Web Service DSL Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebServiceDSLEvent
	 * @generated
	 */
	public Adapter createWebServiceDSLEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppEvent <em>App Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppEvent
	 * @generated
	 */
	public Adapter createAppEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent <em>App Service Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent
	 * @generated
	 */
	public Adapter createAppServiceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppResultEvent <em>App Result Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppResultEvent
	 * @generated
	 */
	public Adapter createAppResultEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthFailureEvent <em>App Auth Failure Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthFailureEvent
	 * @generated
	 */
	public Adapter createAppAuthFailureEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthEvent <em>App Auth Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthEvent
	 * @generated
	 */
	public Adapter createAppAuthEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthSuccessEvent <em>App Auth Success Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthSuccessEvent
	 * @generated
	 */
	public Adapter createAppAuthSuccessEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.executionframework.event.model.event.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.executionframework.event.model.event.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WebserviceeventAdapterFactory
