/**
 */
package mcs.impl;

import java.util.Collection;

import mcs.Core;
import mcs.CriticalSection;
import mcs.Criticality;
import mcs.MCSystem;
import mcs.McsPackage;
import mcs.Semaphore;
import mcs.Status;
import mcs.Task;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MC System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mcs.impl.MCSystemImpl#getCeiling_priority <em>Ceiling priority</em>}</li>
 *   <li>{@link mcs.impl.MCSystemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link mcs.impl.MCSystemImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link mcs.impl.MCSystemImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link mcs.impl.MCSystemImpl#getCritical_sections <em>Critical sections</em>}</li>
 *   <li>{@link mcs.impl.MCSystemImpl#getCore <em>Core</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MCSystemImpl extends MCSElementImpl implements MCSystem {
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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.LOW;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Semaphore> resources;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getCritical_sections() <em>Critical sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCritical_sections()
	 * @generated
	 * @ordered
	 */
	protected EList<CriticalSection> critical_sections;

	/**
	 * The cached value of the '{@link #getCore() <em>Core</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore()
	 * @generated
	 * @ordered
	 */
	protected Core core;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MCSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McsPackage.Literals.MC_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MC_SYSTEM__CEILING_PRIORITY, oldCeiling_priority, ceiling_priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MC_SYSTEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semaphore> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<Semaphore>(Semaphore.class, this, McsPackage.MC_SYSTEM__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, McsPackage.MC_SYSTEM__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CriticalSection> getCritical_sections() {
		if (critical_sections == null) {
			critical_sections = new EObjectContainmentEList<CriticalSection>(CriticalSection.class, this, McsPackage.MC_SYSTEM__CRITICAL_SECTIONS);
		}
		return critical_sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Core getCore() {
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCore(Core newCore, NotificationChain msgs) {
		Core oldCore = core;
		core = newCore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.MC_SYSTEM__CORE, oldCore, newCore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCore(Core newCore) {
		if (newCore != core) {
			NotificationChain msgs = null;
			if (core != null)
				msgs = ((InternalEObject)core).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.MC_SYSTEM__CORE, null, msgs);
			if (newCore != null)
				msgs = ((InternalEObject)newCore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.MC_SYSTEM__CORE, null, msgs);
			msgs = basicSetCore(newCore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MC_SYSTEM__CORE, newCore, newCore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McsPackage.MC_SYSTEM__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case McsPackage.MC_SYSTEM__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case McsPackage.MC_SYSTEM__CRITICAL_SECTIONS:
				return ((InternalEList<?>)getCritical_sections()).basicRemove(otherEnd, msgs);
			case McsPackage.MC_SYSTEM__CORE:
				return basicSetCore(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case McsPackage.MC_SYSTEM__CEILING_PRIORITY:
				return getCeiling_priority();
			case McsPackage.MC_SYSTEM__STATUS:
				return getStatus();
			case McsPackage.MC_SYSTEM__RESOURCES:
				return getResources();
			case McsPackage.MC_SYSTEM__TASKS:
				return getTasks();
			case McsPackage.MC_SYSTEM__CRITICAL_SECTIONS:
				return getCritical_sections();
			case McsPackage.MC_SYSTEM__CORE:
				return getCore();
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
			case McsPackage.MC_SYSTEM__CEILING_PRIORITY:
				setCeiling_priority((Integer)newValue);
				return;
			case McsPackage.MC_SYSTEM__STATUS:
				setStatus((Status)newValue);
				return;
			case McsPackage.MC_SYSTEM__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Semaphore>)newValue);
				return;
			case McsPackage.MC_SYSTEM__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case McsPackage.MC_SYSTEM__CRITICAL_SECTIONS:
				getCritical_sections().clear();
				getCritical_sections().addAll((Collection<? extends CriticalSection>)newValue);
				return;
			case McsPackage.MC_SYSTEM__CORE:
				setCore((Core)newValue);
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
			case McsPackage.MC_SYSTEM__CEILING_PRIORITY:
				setCeiling_priority(CEILING_PRIORITY_EDEFAULT);
				return;
			case McsPackage.MC_SYSTEM__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case McsPackage.MC_SYSTEM__RESOURCES:
				getResources().clear();
				return;
			case McsPackage.MC_SYSTEM__TASKS:
				getTasks().clear();
				return;
			case McsPackage.MC_SYSTEM__CRITICAL_SECTIONS:
				getCritical_sections().clear();
				return;
			case McsPackage.MC_SYSTEM__CORE:
				setCore((Core)null);
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
			case McsPackage.MC_SYSTEM__CEILING_PRIORITY:
				return ceiling_priority != CEILING_PRIORITY_EDEFAULT;
			case McsPackage.MC_SYSTEM__STATUS:
				return status != STATUS_EDEFAULT;
			case McsPackage.MC_SYSTEM__RESOURCES:
				return resources != null && !resources.isEmpty();
			case McsPackage.MC_SYSTEM__TASKS:
				return tasks != null && !tasks.isEmpty();
			case McsPackage.MC_SYSTEM__CRITICAL_SECTIONS:
				return critical_sections != null && !critical_sections.isEmpty();
			case McsPackage.MC_SYSTEM__CORE:
				return core != null;
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
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //MCSystemImpl
