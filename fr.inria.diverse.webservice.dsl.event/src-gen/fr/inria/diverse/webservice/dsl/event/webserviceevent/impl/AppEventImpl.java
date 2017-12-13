/**
 */
package fr.inria.diverse.webservice.dsl.event.webserviceevent.impl;

import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage;

import fr.inria.diverse.webservice.dsl.model.App;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.webservice.dsl.event.webserviceevent.impl.AppEventImpl#getApp <em>App</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AppEventImpl extends WebServiceDSLEventImpl implements AppEvent {
	/**
	 * The cached value of the '{@link #getApp() <em>App</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp()
	 * @generated
	 * @ordered
	 */
	protected App app;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebserviceeventPackage.Literals.APP_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App getApp() {
		if (app != null && app.eIsProxy()) {
			InternalEObject oldApp = (InternalEObject)app;
			app = (App)eResolveProxy(oldApp);
			if (app != oldApp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebserviceeventPackage.APP_EVENT__APP, oldApp, app));
			}
		}
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App basicGetApp() {
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp(App newApp) {
		App oldApp = app;
		app = newApp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebserviceeventPackage.APP_EVENT__APP, oldApp, app));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebserviceeventPackage.APP_EVENT__APP:
				if (resolve) return getApp();
				return basicGetApp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebserviceeventPackage.APP_EVENT__APP:
				setApp((App)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebserviceeventPackage.APP_EVENT__APP:
				setApp((App)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebserviceeventPackage.APP_EVENT__APP:
				return app != null;
		}
		return super.eIsSet(featureID);
	}

} //AppEventImpl
