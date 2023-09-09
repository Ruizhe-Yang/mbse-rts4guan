/**
 */
package mcs.impl;

import java.util.Collection;

import mcs.CriticalSection;
import mcs.Criticality;
import mcs.McsPackage;
import mcs.Semaphore;
import mcs.Task;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Critical Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mcs.impl.CriticalSectionImpl#getCeiling_priority <em>Ceiling priority</em>}</li>
 *   <li>{@link mcs.impl.CriticalSectionImpl#isLocked <em>Locked</em>}</li>
 *   <li>{@link mcs.impl.CriticalSectionImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link mcs.impl.CriticalSectionImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CriticalSectionImpl extends MCSElementImpl implements CriticalSection {
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
	 * The default value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected static final Criticality CRITICALITY_EDEFAULT = Criticality.LO;

	/**
	 * The cached value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected Criticality criticality = CRITICALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriticalSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McsPackage.Literals.CRITICAL_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Criticality getCriticality() {
		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCriticality(Criticality newCriticality) {
		Criticality oldCriticality = criticality;
		criticality = newCriticality == null ? CRITICALITY_EDEFAULT : newCriticality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CRITICAL_SECTION__CRITICALITY, oldCriticality, criticality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CRITICAL_SECTION__CEILING_PRIORITY, oldCeiling_priority, ceiling_priority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CRITICAL_SECTION__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<Task>(Task.class, this, McsPackage.CRITICAL_SECTION__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case McsPackage.CRITICAL_SECTION__CEILING_PRIORITY:
				return getCeiling_priority();
			case McsPackage.CRITICAL_SECTION__LOCKED:
				return isLocked();
			case McsPackage.CRITICAL_SECTION__CRITICALITY:
				return getCriticality();
			case McsPackage.CRITICAL_SECTION__TASKS:
				return getTasks();
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
			case McsPackage.CRITICAL_SECTION__CEILING_PRIORITY:
				setCeiling_priority((Integer)newValue);
				return;
			case McsPackage.CRITICAL_SECTION__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case McsPackage.CRITICAL_SECTION__CRITICALITY:
				setCriticality((Criticality)newValue);
				return;
			case McsPackage.CRITICAL_SECTION__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
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
			case McsPackage.CRITICAL_SECTION__CEILING_PRIORITY:
				setCeiling_priority(CEILING_PRIORITY_EDEFAULT);
				return;
			case McsPackage.CRITICAL_SECTION__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case McsPackage.CRITICAL_SECTION__CRITICALITY:
				setCriticality(CRITICALITY_EDEFAULT);
				return;
			case McsPackage.CRITICAL_SECTION__TASKS:
				getTasks().clear();
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
			case McsPackage.CRITICAL_SECTION__CEILING_PRIORITY:
				return ceiling_priority != CEILING_PRIORITY_EDEFAULT;
			case McsPackage.CRITICAL_SECTION__LOCKED:
				return locked != LOCKED_EDEFAULT;
			case McsPackage.CRITICAL_SECTION__CRITICALITY:
				return criticality != CRITICALITY_EDEFAULT;
			case McsPackage.CRITICAL_SECTION__TASKS:
				return tasks != null && !tasks.isEmpty();
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
		result.append(" (ceiling_priority: ");
		result.append(ceiling_priority);
		result.append(", locked: ");
		result.append(locked);
		result.append(", criticality: ");
		result.append(criticality);
		result.append(')');
		return result.toString();
	}

} //CriticalSectionImpl
