/**
 */
package artifact.impl;

import artifact.ArtifactPackage;
import artifact.Semaphore;
import artifact.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link artifact.impl.SemaphoreImpl#isLocked <em>Locked</em>}</li>
 *   <li>{@link artifact.impl.SemaphoreImpl#getInitial_priority <em>Initial priority</em>}</li>
 *   <li>{@link artifact.impl.SemaphoreImpl#getCeiling_priority <em>Ceiling priority</em>}</li>
 *   <li>{@link artifact.impl.SemaphoreImpl#getAcquisition <em>Acquisition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemaphoreImpl extends MCSElementImpl implements Semaphore {
	/**
	 * The default value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected boolean locked = LOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitial_priority() <em>Initial priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_priority()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitial_priority() <em>Initial priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_priority()
	 * @generated
	 * @ordered
	 */
	protected int initial_priority = INITIAL_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCeiling_priority() <em>Ceiling priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeiling_priority()
	 * @generated
	 * @ordered
	 */
	protected static final int CEILING_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCeiling_priority() <em>Ceiling priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeiling_priority()
	 * @generated
	 * @ordered
	 */
	protected int ceiling_priority = CEILING_PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcquisition() <em>Acquisition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquisition()
	 * @generated
	 * @ordered
	 */
	protected Task acquisition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemaphoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtifactPackage.Literals.SEMAPHORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLocked() {
		return locked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocked(boolean newLocked) {
		boolean oldLocked = locked;
		locked = newLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.SEMAPHORE__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getInitial_priority() {
		return initial_priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitial_priority(int newInitial_priority) {
		int oldInitial_priority = initial_priority;
		initial_priority = newInitial_priority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.SEMAPHORE__INITIAL_PRIORITY, oldInitial_priority, initial_priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCeiling_priority() {
		return ceiling_priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCeiling_priority(int newCeiling_priority) {
		int oldCeiling_priority = ceiling_priority;
		ceiling_priority = newCeiling_priority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.SEMAPHORE__CEILING_PRIORITY, oldCeiling_priority, ceiling_priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getAcquisition() {
		if (acquisition != null && acquisition.eIsProxy()) {
			InternalEObject oldAcquisition = (InternalEObject)acquisition;
			acquisition = (Task)eResolveProxy(oldAcquisition);
			if (acquisition != oldAcquisition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArtifactPackage.SEMAPHORE__ACQUISITION, oldAcquisition, acquisition));
			}
		}
		return acquisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetAcquisition() {
		return acquisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcquisition(Task newAcquisition) {
		Task oldAcquisition = acquisition;
		acquisition = newAcquisition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.SEMAPHORE__ACQUISITION, oldAcquisition, acquisition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArtifactPackage.SEMAPHORE__LOCKED:
				return isLocked();
			case ArtifactPackage.SEMAPHORE__INITIAL_PRIORITY:
				return getInitial_priority();
			case ArtifactPackage.SEMAPHORE__CEILING_PRIORITY:
				return getCeiling_priority();
			case ArtifactPackage.SEMAPHORE__ACQUISITION:
				if (resolve) return getAcquisition();
				return basicGetAcquisition();
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
			case ArtifactPackage.SEMAPHORE__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case ArtifactPackage.SEMAPHORE__INITIAL_PRIORITY:
				setInitial_priority((Integer)newValue);
				return;
			case ArtifactPackage.SEMAPHORE__CEILING_PRIORITY:
				setCeiling_priority((Integer)newValue);
				return;
			case ArtifactPackage.SEMAPHORE__ACQUISITION:
				setAcquisition((Task)newValue);
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
			case ArtifactPackage.SEMAPHORE__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case ArtifactPackage.SEMAPHORE__INITIAL_PRIORITY:
				setInitial_priority(INITIAL_PRIORITY_EDEFAULT);
				return;
			case ArtifactPackage.SEMAPHORE__CEILING_PRIORITY:
				setCeiling_priority(CEILING_PRIORITY_EDEFAULT);
				return;
			case ArtifactPackage.SEMAPHORE__ACQUISITION:
				setAcquisition((Task)null);
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
			case ArtifactPackage.SEMAPHORE__LOCKED:
				return locked != LOCKED_EDEFAULT;
			case ArtifactPackage.SEMAPHORE__INITIAL_PRIORITY:
				return initial_priority != INITIAL_PRIORITY_EDEFAULT;
			case ArtifactPackage.SEMAPHORE__CEILING_PRIORITY:
				return ceiling_priority != CEILING_PRIORITY_EDEFAULT;
			case ArtifactPackage.SEMAPHORE__ACQUISITION:
				return acquisition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (locked: ");
		result.append(locked);
		result.append(", initial_priority: ");
		result.append(initial_priority);
		result.append(", ceiling_priority: ");
		result.append(ceiling_priority);
		result.append(')');
		return result.toString();
	}

} //SemaphoreImpl
