/**
 */
package mcs.impl;

import base.impl.ArtifactElementImpl;

import mcs.MCSElement;
import mcs.McsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MCS Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class MCSElementImpl extends ArtifactElementImpl implements MCSElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MCSElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McsPackage.Literals.MCS_ELEMENT;
	}

} //MCSElementImpl
