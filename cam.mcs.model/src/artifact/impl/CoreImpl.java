/**
 */
package artifact.impl;

import artifact.ArtifactPackage;
import artifact.Core;
import artifact.Task;

import java.util.Collection;

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
 *   <li>{@link artifact.impl.CoreImpl#getTime <em>Time</em>}</li>
 *   <li>{@link artifact.impl.CoreImpl#getCurrent_task <em>Current task</em>}</li>
 *   <li>{@link artifact.impl.CoreImpl#getQueue <em>Queue</em>}</li>
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
	 * The cached value of the '{@link #getCurrent_task() <em>Current task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_task()
	 * @generated
	 * @ordered
	 */
	protected Task current_task;

	/**
	 * The cached value of the '{@link #getQueue() <em>Queue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueue()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> queue;

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
		return ArtifactPackage.Literals.CORE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.CORE__TIME, oldTime, time));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArtifactPackage.CORE__CURRENT_TASK, oldCurrent_task, current_task));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.CORE__CURRENT_TASK, oldCurrent_task, current_task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getQueue() {
		if (queue == null) {
			queue = new EObjectResolvingEList<Task>(Task.class, this, ArtifactPackage.CORE__QUEUE);
		}
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArtifactPackage.CORE__TIME:
				return getTime();
			case ArtifactPackage.CORE__CURRENT_TASK:
				if (resolve) return getCurrent_task();
				return basicGetCurrent_task();
			case ArtifactPackage.CORE__QUEUE:
				return getQueue();
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
			case ArtifactPackage.CORE__TIME:
				setTime((Integer)newValue);
				return;
			case ArtifactPackage.CORE__CURRENT_TASK:
				setCurrent_task((Task)newValue);
				return;
			case ArtifactPackage.CORE__QUEUE:
				getQueue().clear();
				getQueue().addAll((Collection<? extends Task>)newValue);
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
			case ArtifactPackage.CORE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ArtifactPackage.CORE__CURRENT_TASK:
				setCurrent_task((Task)null);
				return;
			case ArtifactPackage.CORE__QUEUE:
				getQueue().clear();
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
			case ArtifactPackage.CORE__TIME:
				return time != TIME_EDEFAULT;
			case ArtifactPackage.CORE__CURRENT_TASK:
				return current_task != null;
			case ArtifactPackage.CORE__QUEUE:
				return queue != null && !queue.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //CoreImpl
