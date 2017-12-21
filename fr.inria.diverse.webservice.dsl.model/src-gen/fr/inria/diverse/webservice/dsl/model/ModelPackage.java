/**
 */
package fr.inria.diverse.webservice.dsl.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.webservice.dsl.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = fr.inria.diverse.webservice.dsl.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.webservice.dsl.model.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.webservice.dsl.model.impl.UserImpl
	 * @see fr.inria.diverse.webservice.dsl.model.impl.ModelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.webservice.dsl.model.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.webservice.dsl.model.impl.ServiceImpl
	 * @see fr.inria.diverse.webservice.dsl.model.impl.ModelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Allowed Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ALLOWED_USERS = 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__METHOD_NAME = 2;

	/**
	 * The feature id for the '<em><b>Accepted Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ACCEPTED_PARAMS = 3;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.webservice.dsl.model.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.webservice.dsl.model.impl.AppImpl
	 * @see fr.inria.diverse.webservice.dsl.model.impl.ModelPackageImpl#getApp()
	 * @generated
	 */
	int APP = 2;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__USERS = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__SERVICES = 1;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Auth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP___AUTH__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP___SERVICE__STRING_STRING_ELIST = 1;

	/**
	 * The operation id for the '<em>Auth Success</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP___AUTH_SUCCESS__STRING = 2;

	/**
	 * The operation id for the '<em>Auth Failure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP___AUTH_FAILURE = 3;

	/**
	 * The operation id for the '<em>Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP___RESULT__STRING = 4;

	/**
	 * The number of operations of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.webservice.dsl.model.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.webservice.dsl.model.impl.ParamImpl
	 * @see fr.inria.diverse.webservice.dsl.model.impl.ModelPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.webservice.dsl.model.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see fr.inria.diverse.webservice.dsl.model.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.webservice.dsl.model.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.webservice.dsl.model.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.webservice.dsl.model.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see fr.inria.diverse.webservice.dsl.model.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.webservice.dsl.model.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see fr.inria.diverse.webservice.dsl.model.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.webservice.dsl.model.Service#getAllowedUsers <em>Allowed Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Users</em>'.
	 * @see fr.inria.diverse.webservice.dsl.model.Service#getAllowedUsers()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_AllowedUsers();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.webservice.dsl.model.Service#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see fr.inria.diverse.webservice.dsl.model.Service#getMethodName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_MethodName();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.diverse.webservice.dsl.model.Service#getAcceptedParams <em>Accepted Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Params</em>'.
	 * @see fr.inria.diverse.webservice.dsl.model.Service#getAcceptedParams()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_AcceptedParams();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.webservice.dsl.model.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.webservice.dsl.model.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.webservice.dsl.model.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see fr.inria.diverse.webservice.dsl.model.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.webservice.dsl.model.App#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see fr.inria.diverse.webservice.dsl.model.App#getUsers()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.webservice.dsl.model.App#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see fr.inria.diverse.webservice.dsl.model.App#getServices()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Services();

	/**
	 * Returns the meta object for the '{@link fr.inria.diverse.webservice.dsl.model.App#auth(java.lang.String, java.lang.String) <em>Auth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Auth</em>' operation.
	 * @see fr.inria.diverse.webservice.dsl.model.App#auth(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getApp__Auth__String_String();

	/**
	 * Returns the meta object for the '{@link fr.inria.diverse.webservice.dsl.model.App#service(java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList) <em>Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Service</em>' operation.
	 * @see fr.inria.diverse.webservice.dsl.model.App#service(java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getApp__Service__String_String_EList();

	/**
	 * Returns the meta object for the '{@link fr.inria.diverse.webservice.dsl.model.App#authSuccess(java.lang.String) <em>Auth Success</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Auth Success</em>' operation.
	 * @see fr.inria.diverse.webservice.dsl.model.App#authSuccess(java.lang.String)
	 * @generated
	 */
	EOperation getApp__AuthSuccess__String();

	/**
	 * Returns the meta object for the '{@link fr.inria.diverse.webservice.dsl.model.App#authFailure() <em>Auth Failure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Auth Failure</em>' operation.
	 * @see fr.inria.diverse.webservice.dsl.model.App#authFailure()
	 * @generated
	 */
	EOperation getApp__AuthFailure();

	/**
	 * Returns the meta object for the '{@link fr.inria.diverse.webservice.dsl.model.App#result(java.lang.String) <em>Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Result</em>' operation.
	 * @see fr.inria.diverse.webservice.dsl.model.App#result(java.lang.String)
	 * @generated
	 */
	EOperation getApp__Result__String();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.webservice.dsl.model.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see fr.inria.diverse.webservice.dsl.model.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.webservice.dsl.model.Param#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.webservice.dsl.model.Param#getName()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.webservice.dsl.model.Param#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.webservice.dsl.model.Param#getValue()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.diverse.webservice.dsl.model.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.webservice.dsl.model.impl.UserImpl
		 * @see fr.inria.diverse.webservice.dsl.model.impl.ModelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.webservice.dsl.model.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.webservice.dsl.model.impl.ServiceImpl
		 * @see fr.inria.diverse.webservice.dsl.model.impl.ModelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Allowed Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ALLOWED_USERS = eINSTANCE.getService_AllowedUsers();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__METHOD_NAME = eINSTANCE.getService_MethodName();

		/**
		 * The meta object literal for the '<em><b>Accepted Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ACCEPTED_PARAMS = eINSTANCE.getService_AcceptedParams();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.webservice.dsl.model.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.webservice.dsl.model.impl.AppImpl
		 * @see fr.inria.diverse.webservice.dsl.model.impl.ModelPackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__USERS = eINSTANCE.getApp_Users();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__SERVICES = eINSTANCE.getApp_Services();

		/**
		 * The meta object literal for the '<em><b>Auth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APP___AUTH__STRING_STRING = eINSTANCE.getApp__Auth__String_String();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APP___SERVICE__STRING_STRING_ELIST = eINSTANCE.getApp__Service__String_String_EList();

		/**
		 * The meta object literal for the '<em><b>Auth Success</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APP___AUTH_SUCCESS__STRING = eINSTANCE.getApp__AuthSuccess__String();

		/**
		 * The meta object literal for the '<em><b>Auth Failure</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APP___AUTH_FAILURE = eINSTANCE.getApp__AuthFailure();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APP___RESULT__STRING = eINSTANCE.getApp__Result__String();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.webservice.dsl.model.impl.ParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.webservice.dsl.model.impl.ParamImpl
		 * @see fr.inria.diverse.webservice.dsl.model.impl.ModelPackageImpl#getParam()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__VALUE = eINSTANCE.getParam_Value();

	}

} //ModelPackage
