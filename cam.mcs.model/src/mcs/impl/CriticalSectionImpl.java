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
 *   <li>{@link mcs.impl.CriticalSectionImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link mcs.impl.CriticalSectionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link mcs.impl.CriticalSectionImpl#getExecution <em>Execution</em>}</li>
 *   <li>{@link mcs.impl.CriticalSectionImpl#getElapsed <em>Elapsed</em>}</li>
 *   <li>{@link mcs.impl.CriticalSectionImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link mcs.impl.CriticalSectionImpl#getSemaphore <em>Semaphore</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CriticalSectionImpl extends MCSElementImpl implements CriticalSection {
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
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected int start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecution() <em>Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected static final int EXECUTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExecution() <em>Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected int execution = EXECUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getElapsed() <em>Elapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsed()
	 * @generated
	 * @ordered
	 */
	protected static final int ELAPSED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElapsed() <em>Elapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsed()
	 * @generated
	 * @ordered
	 */
	protected int elapsed = ELAPSED_EDEFAULT;

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
	 * The cached value of the '{@link #getSemaphore() <em>Semaphore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphore()
	 * @generated
	 * @ordered
	 */
	protected Semaphore semaphore;

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
	public int getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(int newStart) {
		int oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CRITICAL_SECTION__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExecution() {
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecution(int newExecution) {
		int oldExecution = execution;
		execution = newExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CRITICAL_SECTION__EXECUTION, oldExecution, execution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getElapsed() {
		return elapsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElapsed(int newElapsed) {
		int oldElapsed = elapsed;
		elapsed = newElapsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CRITICAL_SECTION__ELAPSED, oldElapsed, elapsed));
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
	public Semaphore getSemaphore() {
		return semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemaphore(Semaphore newSemaphore, NotificationChain msgs) {
		Semaphore oldSemaphore = semaphore;
		semaphore = newSemaphore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.CRITICAL_SECTION__SEMAPHORE, oldSemaphore, newSemaphore);
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
	public void setSemaphore(Semaphore newSemaphore) {
		if (newSemaphore != semaphore) {
			NotificationChain msgs = null;
			if (semaphore != null)
				msgs = ((InternalEObject)semaphore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.CRITICAL_SECTION__SEMAPHORE, null, msgs);
			if (newSemaphore != null)
				msgs = ((InternalEObject)newSemaphore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.CRITICAL_SECTION__SEMAPHORE, null, msgs);
			msgs = basicSetSemaphore(newSemaphore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CRITICAL_SECTION__SEMAPHORE, newSemaphore, newSemaphore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McsPackage.CRITICAL_SECTION__SEMAPHORE:
				return basicSetSemaphore(null, msgs);
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
			case McsPackage.CRITICAL_SECTION__CRITICALITY:
				return getCriticality();
			case McsPackage.CRITICAL_SECTION__START:
				return getStart();
			case McsPackage.CRITICAL_SECTION__EXECUTION:
				return getExecution();
			case McsPackage.CRITICAL_SECTION__ELAPSED:
				return getElapsed();
			case McsPackage.CRITICAL_SECTION__TASKS:
				return getTasks();
			case McsPackage.CRITICAL_SECTION__SEMAPHORE:
				return getSemaphore();
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
			case McsPackage.CRITICAL_SECTION__CRITICALITY:
				setCriticality((Criticality)newValue);
				return;
			case McsPackage.CRITICAL_SECTION__START:
				setStart((Integer)newValue);
				return;
			case McsPackage.CRITICAL_SECTION__EXECUTION:
				setExecution((Integer)newValue);
				return;
			case McsPackage.CRITICAL_SECTION__ELAPSED:
				setElapsed((Integer)newValue);
				return;
			case McsPackage.CRITICAL_SECTION__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case McsPackage.CRITICAL_SECTION__SEMAPHORE:
				setSemaphore((Semaphore)newValue);
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
			case McsPackage.CRITICAL_SECTION__CRITICALITY:
				setCriticality(CRITICALITY_EDEFAULT);
				return;
			case McsPackage.CRITICAL_SECTION__START:
				setStart(START_EDEFAULT);
				return;
			case McsPackage.CRITICAL_SECTION__EXECUTION:
				setExecution(EXECUTION_EDEFAULT);
				return;
			case McsPackage.CRITICAL_SECTION__ELAPSED:
				setElapsed(ELAPSED_EDEFAULT);
				return;
			case McsPackage.CRITICAL_SECTION__TASKS:
				getTasks().clear();
				return;
			case McsPackage.CRITICAL_SECTION__SEMAPHORE:
				setSemaphore((Semaphore)null);
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
			case McsPackage.CRITICAL_SECTION__CRITICALITY:
				return criticality != CRITICALITY_EDEFAULT;
			case McsPackage.CRITICAL_SECTION__START:
				return start != START_EDEFAULT;
			case McsPackage.CRITICAL_SECTION__EXECUTION:
				return execution != EXECUTION_EDEFAULT;
			case McsPackage.CRITICAL_SECTION__ELAPSED:
				return elapsed != ELAPSED_EDEFAULT;
			case McsPackage.CRITICAL_SECTION__TASKS:
				return tasks != null && !tasks.isEmpty();
			case McsPackage.CRITICAL_SECTION__SEMAPHORE:
				return semaphore != null;
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
		result.append(" (criticality: ");
		result.append(criticality);
		result.append(", start: ");
		result.append(start);
		result.append(", execution: ");
		result.append(execution);
		result.append(", elapsed: ");
		result.append(elapsed);
		result.append(')');
		return result.toString();
	}

} //CriticalSectionImpl
