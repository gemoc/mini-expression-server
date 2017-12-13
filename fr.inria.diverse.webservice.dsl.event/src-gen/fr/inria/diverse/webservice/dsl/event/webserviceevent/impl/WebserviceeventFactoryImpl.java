/**
 */
package fr.inria.diverse.webservice.dsl.event.webserviceevent.impl;

import fr.inria.diverse.webservice.dsl.event.webserviceevent.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebserviceeventFactoryImpl extends EFactoryImpl implements WebserviceeventFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebserviceeventFactory init() {
		try {
			WebserviceeventFactory theWebserviceeventFactory = (WebserviceeventFactory)EPackage.Registry.INSTANCE.getEFactory(WebserviceeventPackage.eNS_URI);
			if (theWebserviceeventFactory != null) {
				return theWebserviceeventFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebserviceeventFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebserviceeventFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WebserviceeventPackage.APP_SERVICE_EVENT: return createAppServiceEvent();
			case WebserviceeventPackage.APP_RESULT_EVENT: return createAppResultEvent();
			case WebserviceeventPackage.APP_AUTH_FAILURE_EVENT: return createAppAuthFailureEvent();
			case WebserviceeventPackage.APP_AUTH_EVENT: return createAppAuthEvent();
			case WebserviceeventPackage.APP_AUTH_SUCCESS_EVENT: return createAppAuthSuccessEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppServiceEvent createAppServiceEvent() {
		AppServiceEventImpl appServiceEvent = new AppServiceEventImpl();
		return appServiceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppResultEvent createAppResultEvent() {
		AppResultEventImpl appResultEvent = new AppResultEventImpl();
		return appResultEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppAuthFailureEvent createAppAuthFailureEvent() {
		AppAuthFailureEventImpl appAuthFailureEvent = new AppAuthFailureEventImpl();
		return appAuthFailureEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppAuthEvent createAppAuthEvent() {
		AppAuthEventImpl appAuthEvent = new AppAuthEventImpl();
		return appAuthEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppAuthSuccessEvent createAppAuthSuccessEvent() {
		AppAuthSuccessEventImpl appAuthSuccessEvent = new AppAuthSuccessEventImpl();
		return appAuthSuccessEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebserviceeventPackage getWebserviceeventPackage() {
		return (WebserviceeventPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebserviceeventPackage getPackage() {
		return WebserviceeventPackage.eINSTANCE;
	}

} //WebserviceeventFactoryImpl
