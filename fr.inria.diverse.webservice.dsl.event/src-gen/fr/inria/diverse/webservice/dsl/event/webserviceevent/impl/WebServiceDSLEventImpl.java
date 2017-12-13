/**
 */
package fr.inria.diverse.webservice.dsl.event.webserviceevent.impl;

import fr.inria.diverse.webservice.dsl.event.webserviceevent.WebServiceDSLEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gemoc.executionframework.event.model.event.impl.EventImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Service DSL Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class WebServiceDSLEventImpl extends EventImpl implements WebServiceDSLEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebServiceDSLEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebserviceeventPackage.Literals.WEB_SERVICE_DSL_EVENT;
	}

} //WebServiceDSLEventImpl
