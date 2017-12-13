/**
 */
package fr.inria.diverse.webservice.dsl.event.webserviceevent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.gemoc.executionframework.event.model.event.EventPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventFactory
 * @model kind="package"
 * @generated
 */
public interface WebserviceeventPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webserviceevent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/modelevent/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webserviceevent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebserviceeventPackage eINSTANCE = fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebServiceDSLEventImpl <em>Web Service DSL Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebServiceDSLEventImpl
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventPackageImpl#getWebServiceDSLEvent()
	 * @generated
	 */
	int WEB_SERVICE_DSL_EVENT = 0;

	/**
	 * The number of structural features of the '<em>Web Service DSL Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE_DSL_EVENT_FEATURE_COUNT = EventPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppEventImpl <em>App Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppEventImpl
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventPackageImpl#getAppEvent()
	 * @generated
	 */
	int APP_EVENT = 1;

	/**
	 * The feature id for the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_EVENT__APP = WEB_SERVICE_DSL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>App Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_EVENT_FEATURE_COUNT = WEB_SERVICE_DSL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppServiceEventImpl <em>App Service Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppServiceEventImpl
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventPackageImpl#getAppServiceEvent()
	 * @generated
	 */
	int APP_SERVICE_EVENT = 2;

	/**
	 * The feature id for the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE_EVENT__APP = APP_EVENT__APP;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE_EVENT__TOKEN = APP_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE_EVENT__SERVICE = APP_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE_EVENT__PARAMS = APP_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>App Service Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE_EVENT_FEATURE_COUNT = APP_EVENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppResultEventImpl <em>App Result Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppResultEventImpl
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventPackageImpl#getAppResultEvent()
	 * @generated
	 */
	int APP_RESULT_EVENT = 3;

	/**
	 * The feature id for the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_RESULT_EVENT__APP = APP_EVENT__APP;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_RESULT_EVENT__RESULT = APP_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>App Result Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_RESULT_EVENT_FEATURE_COUNT = APP_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppAuthFailureEventImpl <em>App Auth Failure Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppAuthFailureEventImpl
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventPackageImpl#getAppAuthFailureEvent()
	 * @generated
	 */
	int APP_AUTH_FAILURE_EVENT = 4;

	/**
	 * The feature id for the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_AUTH_FAILURE_EVENT__APP = APP_EVENT__APP;

	/**
	 * The number of structural features of the '<em>App Auth Failure Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_AUTH_FAILURE_EVENT_FEATURE_COUNT = APP_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppAuthEventImpl <em>App Auth Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppAuthEventImpl
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventPackageImpl#getAppAuthEvent()
	 * @generated
	 */
	int APP_AUTH_EVENT = 5;

	/**
	 * The feature id for the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_AUTH_EVENT__APP = APP_EVENT__APP;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_AUTH_EVENT__LOGIN = APP_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_AUTH_EVENT__PASSWORD = APP_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>App Auth Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_AUTH_EVENT_FEATURE_COUNT = APP_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppAuthSuccessEventImpl <em>App Auth Success Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppAuthSuccessEventImpl
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventPackageImpl#getAppAuthSuccessEvent()
	 * @generated
	 */
	int APP_AUTH_SUCCESS_EVENT = 6;

	/**
	 * The feature id for the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_AUTH_SUCCESS_EVENT__APP = APP_EVENT__APP;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_AUTH_SUCCESS_EVENT__TOKEN = APP_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>App Auth Success Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_AUTH_SUCCESS_EVENT_FEATURE_COUNT = APP_EVENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.WebServiceDSLEvent <em>Web Service DSL Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Service DSL Event</em>'.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebServiceDSLEvent
	 * @generated
	 */
	EClass getWebServiceDSLEvent();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppEvent <em>App Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Event</em>'.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppEvent
	 * @generated
	 */
	EClass getAppEvent();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppEvent#getApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App</em>'.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppEvent#getApp()
	 * @see #getAppEvent()
	 * @generated
	 */
	EReference getAppEvent_App();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent <em>App Service Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Service Event</em>'.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent
	 * @generated
	 */
	EClass getAppServiceEvent();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent#getToken()
	 * @see #getAppServiceEvent()
	 * @generated
	 */
	EAttribute getAppServiceEvent_Token();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent#getService()
	 * @see #getAppServiceEvent()
	 * @generated
	 */
	EAttribute getAppServiceEvent_Service();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Params</em>'.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent#getParams()
	 * @see #getAppServiceEvent()
	 * @generated
	 */
	EReference getAppServiceEvent_Params();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppResultEvent <em>App Result Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Result Event</em>'.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppResultEvent
	 * @generated
	 */
	EClass getAppResultEvent();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppResultEvent#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppResultEvent#getResult()
	 * @see #getAppResultEvent()
	 * @generated
	 */
	EAttribute getAppResultEvent_Result();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthFailureEvent <em>App Auth Failure Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Auth Failure Event</em>'.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthFailureEvent
	 * @generated
	 */
	EClass getAppAuthFailureEvent();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthEvent <em>App Auth Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Auth Event</em>'.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthEvent
	 * @generated
	 */
	EClass getAppAuthEvent();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthEvent#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthEvent#getLogin()
	 * @see #getAppAuthEvent()
	 * @generated
	 */
	EAttribute getAppAuthEvent_Login();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthEvent#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthEvent#getPassword()
	 * @see #getAppAuthEvent()
	 * @generated
	 */
	EAttribute getAppAuthEvent_Password();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthSuccessEvent <em>App Auth Success Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Auth Success Event</em>'.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthSuccessEvent
	 * @generated
	 */
	EClass getAppAuthSuccessEvent();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthSuccessEvent#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthSuccessEvent#getToken()
	 * @see #getAppAuthSuccessEvent()
	 * @generated
	 */
	EAttribute getAppAuthSuccessEvent_Token();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebserviceeventFactory getWebserviceeventFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebServiceDSLEventImpl <em>Web Service DSL Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebServiceDSLEventImpl
		 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventPackageImpl#getWebServiceDSLEvent()
		 * @generated
		 */
		EClass WEB_SERVICE_DSL_EVENT = eINSTANCE.getWebServiceDSLEvent();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppEventImpl <em>App Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppEventImpl
		 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventPackageImpl#getAppEvent()
		 * @generated
		 */
		EClass APP_EVENT = eINSTANCE.getAppEvent();

		/**
		 * The meta object literal for the '<em><b>App</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_EVENT__APP = eINSTANCE.getAppEvent_App();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppServiceEventImpl <em>App Service Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppServiceEventImpl
		 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventPackageImpl#getAppServiceEvent()
		 * @generated
		 */
		EClass APP_SERVICE_EVENT = eINSTANCE.getAppServiceEvent();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_SERVICE_EVENT__TOKEN = eINSTANCE.getAppServiceEvent_Token();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_SERVICE_EVENT__SERVICE = eINSTANCE.getAppServiceEvent_Service();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_SERVICE_EVENT__PARAMS = eINSTANCE.getAppServiceEvent_Params();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppResultEventImpl <em>App Result Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppResultEventImpl
		 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventPackageImpl#getAppResultEvent()
		 * @generated
		 */
		EClass APP_RESULT_EVENT = eINSTANCE.getAppResultEvent();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_RESULT_EVENT__RESULT = eINSTANCE.getAppResultEvent_Result();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppAuthFailureEventImpl <em>App Auth Failure Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppAuthFailureEventImpl
		 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventPackageImpl#getAppAuthFailureEvent()
		 * @generated
		 */
		EClass APP_AUTH_FAILURE_EVENT = eINSTANCE.getAppAuthFailureEvent();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppAuthEventImpl <em>App Auth Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppAuthEventImpl
		 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventPackageImpl#getAppAuthEvent()
		 * @generated
		 */
		EClass APP_AUTH_EVENT = eINSTANCE.getAppAuthEvent();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_AUTH_EVENT__LOGIN = eINSTANCE.getAppAuthEvent_Login();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_AUTH_EVENT__PASSWORD = eINSTANCE.getAppAuthEvent_Password();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppAuthSuccessEventImpl <em>App Auth Success Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppAuthSuccessEventImpl
		 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.WebserviceeventPackageImpl#getAppAuthSuccessEvent()
		 * @generated
		 */
		EClass APP_AUTH_SUCCESS_EVENT = eINSTANCE.getAppAuthSuccessEvent();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_AUTH_SUCCESS_EVENT__TOKEN = eINSTANCE.getAppAuthSuccessEvent_Token();

	}

} //WebserviceeventPackage
