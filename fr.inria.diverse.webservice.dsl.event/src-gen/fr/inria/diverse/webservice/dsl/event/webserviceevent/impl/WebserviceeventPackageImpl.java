/**
 */
package fr.inria.diverse.webservice.dsl.event.webserviceevent.impl;

import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthFailureEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthSuccessEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppResultEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.WebServiceDSLEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventFactory;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage;

import fr.inria.diverse.webservice.dsl.model.ModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gemoc.executionframework.event.model.event.EventPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebserviceeventPackageImpl extends EPackageImpl implements WebserviceeventPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webServiceDSLEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appServiceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appResultEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appAuthFailureEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appAuthEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appAuthSuccessEventEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebserviceeventPackageImpl() {
		super(eNS_URI, WebserviceeventFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WebserviceeventPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebserviceeventPackage init() {
		if (isInited) return (WebserviceeventPackage)EPackage.Registry.INSTANCE.getEPackage(WebserviceeventPackage.eNS_URI);

		// Obtain or create and register package
		WebserviceeventPackageImpl theWebserviceeventPackage = (WebserviceeventPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WebserviceeventPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WebserviceeventPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EventPackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWebserviceeventPackage.createPackageContents();

		// Initialize created meta-data
		theWebserviceeventPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWebserviceeventPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebserviceeventPackage.eNS_URI, theWebserviceeventPackage);
		return theWebserviceeventPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebServiceDSLEvent() {
		return webServiceDSLEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppEvent() {
		return appEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppEvent_App() {
		return (EReference)appEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppServiceEvent() {
		return appServiceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppServiceEvent_Token() {
		return (EAttribute)appServiceEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppServiceEvent_Service() {
		return (EAttribute)appServiceEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppServiceEvent_Params() {
		return (EReference)appServiceEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppResultEvent() {
		return appResultEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppResultEvent_Result() {
		return (EAttribute)appResultEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppAuthFailureEvent() {
		return appAuthFailureEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppAuthEvent() {
		return appAuthEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppAuthEvent_Login() {
		return (EAttribute)appAuthEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppAuthEvent_Password() {
		return (EAttribute)appAuthEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppAuthSuccessEvent() {
		return appAuthSuccessEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppAuthSuccessEvent_Token() {
		return (EAttribute)appAuthSuccessEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebserviceeventFactory getWebserviceeventFactory() {
		return (WebserviceeventFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		webServiceDSLEventEClass = createEClass(WEB_SERVICE_DSL_EVENT);

		appEventEClass = createEClass(APP_EVENT);
		createEReference(appEventEClass, APP_EVENT__APP);

		appServiceEventEClass = createEClass(APP_SERVICE_EVENT);
		createEAttribute(appServiceEventEClass, APP_SERVICE_EVENT__TOKEN);
		createEAttribute(appServiceEventEClass, APP_SERVICE_EVENT__SERVICE);
		createEReference(appServiceEventEClass, APP_SERVICE_EVENT__PARAMS);

		appResultEventEClass = createEClass(APP_RESULT_EVENT);
		createEAttribute(appResultEventEClass, APP_RESULT_EVENT__RESULT);

		appAuthFailureEventEClass = createEClass(APP_AUTH_FAILURE_EVENT);

		appAuthEventEClass = createEClass(APP_AUTH_EVENT);
		createEAttribute(appAuthEventEClass, APP_AUTH_EVENT__LOGIN);
		createEAttribute(appAuthEventEClass, APP_AUTH_EVENT__PASSWORD);

		appAuthSuccessEventEClass = createEClass(APP_AUTH_SUCCESS_EVENT);
		createEAttribute(appAuthSuccessEventEClass, APP_AUTH_SUCCESS_EVENT__TOKEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EventPackage theEventPackage = (EventPackage)EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		webServiceDSLEventEClass.getESuperTypes().add(theEventPackage.getEvent());
		appEventEClass.getESuperTypes().add(this.getWebServiceDSLEvent());
		appServiceEventEClass.getESuperTypes().add(this.getAppEvent());
		appResultEventEClass.getESuperTypes().add(this.getAppEvent());
		appAuthFailureEventEClass.getESuperTypes().add(this.getAppEvent());
		appAuthEventEClass.getESuperTypes().add(this.getAppEvent());
		appAuthSuccessEventEClass.getESuperTypes().add(this.getAppEvent());

		// Initialize classes and features; add operations and parameters
		initEClass(webServiceDSLEventEClass, WebServiceDSLEvent.class, "WebServiceDSLEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(appEventEClass, AppEvent.class, "AppEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppEvent_App(), theModelPackage.getApp(), null, "app", null, 1, 1, AppEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appServiceEventEClass, AppServiceEvent.class, "AppServiceEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppServiceEvent_Token(), ecorePackage.getEString(), "token", null, 0, 1, AppServiceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppServiceEvent_Service(), ecorePackage.getEString(), "service", null, 0, 1, AppServiceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppServiceEvent_Params(), theModelPackage.getParam(), null, "params", null, 0, -1, AppServiceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appResultEventEClass, AppResultEvent.class, "AppResultEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppResultEvent_Result(), ecorePackage.getEString(), "result", null, 0, 1, AppResultEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appAuthFailureEventEClass, AppAuthFailureEvent.class, "AppAuthFailureEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(appAuthEventEClass, AppAuthEvent.class, "AppAuthEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppAuthEvent_Login(), ecorePackage.getEString(), "login", null, 0, 1, AppAuthEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppAuthEvent_Password(), ecorePackage.getEString(), "password", null, 0, 1, AppAuthEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appAuthSuccessEventEClass, AppAuthSuccessEvent.class, "AppAuthSuccessEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppAuthSuccessEvent_Token(), ecorePackage.getEString(), "token", null, 0, 1, AppAuthSuccessEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WebserviceeventPackageImpl
