/**
 */
package mcs.impl;

import java.util.Collection;

import mcs.Core;
import mcs.McsPackage;
import mcs.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mcs.impl.CoreImpl#getTime <em>Time</em>}</li>
 *   <li>{@link mcs.impl.CoreImpl#isLocked <em>Locked</em>}</li>
 *   <li>{@link mcs.impl.CoreImpl#getCurrent_task <em>Current task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreImpl extends MCSElementImpl implements Core {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

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
	 * The cached value of the '{@link #getCurrent_task() <em>Current task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_task()
	 * @generated
	 * @ordered
	 */
	protected Task current_task;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McsPackage.Literals.CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CORE__TIME, oldTime, time));
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
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CORE__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getCurrent_task() {
		if (current_task != null && current_task.eIsProxy()) {
			InternalEObject oldCurrent_task = (InternalEObject)current_task;
			current_task = (Task)eResolveProxy(oldCurrent_task);
			if (current_task != oldCurrent_task) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.CORE__CURRENT_TASK, oldCurrent_task, current_task));
			}
		}
		return current_task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetCurrent_task() {
		return current_task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrent_task(Task newCurrent_task) {
		Task oldCurrent_task = current_task;
		current_task = newCurrent_task;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CORE__CURRENT_TASK, oldCurrent_task, current_task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case McsPackage.CORE__TIME:
				return getTime();
			case McsPackage.CORE__LOCKED:
				return isLocked();
			case McsPackage.CORE__CURRENT_TASK:
				if (resolve) return getCurrent_task();
				return basicGetCurrent_task();
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
			case McsPackage.CORE__TIME:
				setTime((Integer)newValue);
				return;
			case McsPackage.CORE__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case McsPackage.CORE__CURRENT_TASK:
				setCurrent_task((Task)newValue);
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
			case McsPackage.CORE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case McsPackage.CORE__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case McsPackage.CORE__CURRENT_TASK:
				setCurrent_task((Task)null);
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
			case McsPackage.CORE__TIME:
				return time != TIME_EDEFAULT;
			case McsPackage.CORE__LOCKED:
				return locked != LOCKED_EDEFAULT;
			case McsPackage.CORE__CURRENT_TASK:
				return current_task != null;
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
		result.append(" (time: ");
		result.append(time);
		result.append(", locked: ");
		result.append(locked);
		result.append(')');
		return result.toString();
	}

} //CoreImpl
