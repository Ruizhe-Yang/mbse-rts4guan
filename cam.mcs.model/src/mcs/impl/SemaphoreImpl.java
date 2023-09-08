/**
 */
package mcs.impl;

import java.util.Collection;

import mcs.McsPackage;
import mcs.Semaphore;
import mcs.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mcs.impl.SemaphoreImpl#isLocked <em>Locked</em>}</li>
 *   <li>{@link mcs.impl.SemaphoreImpl#getInitial_priority <em>Initial priority</em>}</li>
 *   <li>{@link mcs.impl.SemaphoreImpl#getCeiling_priority <em>Ceiling priority</em>}</li>
 *   <li>{@link mcs.impl.SemaphoreImpl#getAcquisition <em>Acquisition</em>}</li>
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
	 * The cached value of the '{@link #getAcquisition() <em>Acquisition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquisition()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> acquisition;

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
		return McsPackage.Literals.SEMAPHORE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.SEMAPHORE__LOCKED, oldLocked, locked));
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
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.SEMAPHORE__INITIAL_PRIORITY, oldInitial_priority, initial_priority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.SEMAPHORE__CEILING_PRIORITY, oldCeiling_priority, ceiling_priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getAcquisition() {
		if (acquisition == null) {
			acquisition = new EObjectResolvingEList<Task>(Task.class, this, McsPackage.SEMAPHORE__ACQUISITION);
		}
		return acquisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case McsPackage.SEMAPHORE__LOCKED:
				return isLocked();
			case McsPackage.SEMAPHORE__INITIAL_PRIORITY:
				return getInitial_priority();
			case McsPackage.SEMAPHORE__CEILING_PRIORITY:
				return getCeiling_priority();
			case McsPackage.SEMAPHORE__ACQUISITION:
				return getAcquisition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case McsPackage.SEMAPHORE__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case McsPackage.SEMAPHORE__INITIAL_PRIORITY:
				setInitial_priority((Integer)newValue);
				return;
			case McsPackage.SEMAPHORE__CEILING_PRIORITY:
				setCeiling_priority((Integer)newValue);
				return;
			case McsPackage.SEMAPHORE__ACQUISITION:
				getAcquisition().clear();
				getAcquisition().addAll((Collection<? extends Task>)newValue);
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
			case McsPackage.SEMAPHORE__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case McsPackage.SEMAPHORE__INITIAL_PRIORITY:
				setInitial_priority(INITIAL_PRIORITY_EDEFAULT);
				return;
			case McsPackage.SEMAPHORE__CEILING_PRIORITY:
				setCeiling_priority(CEILING_PRIORITY_EDEFAULT);
				return;
			case McsPackage.SEMAPHORE__ACQUISITION:
				getAcquisition().clear();
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
			case McsPackage.SEMAPHORE__LOCKED:
				return locked != LOCKED_EDEFAULT;
			case McsPackage.SEMAPHORE__INITIAL_PRIORITY:
				return initial_priority != INITIAL_PRIORITY_EDEFAULT;
			case McsPackage.SEMAPHORE__CEILING_PRIORITY:
				return ceiling_priority != CEILING_PRIORITY_EDEFAULT;
			case McsPackage.SEMAPHORE__ACQUISITION:
				return acquisition != null && !acquisition.isEmpty();
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
