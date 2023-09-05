/**
 */
package artifact.impl;

import artifact.ArtifactPackage;
import artifact.Task;
import artifact.TaskSet;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Task Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link artifact.impl.TaskSetImpl#getTask_number <em>Task number</em>}</li>
 *   <li>{@link artifact.impl.TaskSetImpl#getU <em>U</em>}</li>
 *   <li>{@link artifact.impl.TaskSetImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskSetImpl extends MCSElementImpl implements TaskSet {
	/**
	 * The default value of the '{@link #getTask_number() <em>Task number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask_number()
	 * @generated
	 * @ordered
	 */
	protected static final int TASK_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTask_number() <em>Task number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask_number()
	 * @generated
	 * @ordered
	 */
	protected int task_number = TASK_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getU() <em>U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU()
	 * @generated
	 * @ordered
	 */
	protected static final double U_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getU() <em>U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU()
	 * @generated
	 * @ordered
	 */
	protected double u = U_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtifactPackage.Literals.TASK_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTask_number() {
		return task_number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTask_number(int newTask_number) {
		int oldTask_number = task_number;
		task_number = newTask_number;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK_SET__TASK_NUMBER, oldTask_number, task_number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getU() {
		return u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setU(double newU) {
		double oldU = u;
		u = newU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK_SET__U, oldU, u));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, ArtifactPackage.TASK_SET__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArtifactPackage.TASK_SET__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
			case ArtifactPackage.TASK_SET__TASK_NUMBER:
				return getTask_number();
			case ArtifactPackage.TASK_SET__U:
				return getU();
			case ArtifactPackage.TASK_SET__TASKS:
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
			case ArtifactPackage.TASK_SET__TASK_NUMBER:
				setTask_number((Integer)newValue);
				return;
			case ArtifactPackage.TASK_SET__U:
				setU((Double)newValue);
				return;
			case ArtifactPackage.TASK_SET__TASKS:
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
			case ArtifactPackage.TASK_SET__TASK_NUMBER:
				setTask_number(TASK_NUMBER_EDEFAULT);
				return;
			case ArtifactPackage.TASK_SET__U:
				setU(U_EDEFAULT);
				return;
			case ArtifactPackage.TASK_SET__TASKS:
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
			case ArtifactPackage.TASK_SET__TASK_NUMBER:
				return task_number != TASK_NUMBER_EDEFAULT;
			case ArtifactPackage.TASK_SET__U:
				return u != U_EDEFAULT;
			case ArtifactPackage.TASK_SET__TASKS:
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
		result.append(" (task_number: ");
		result.append(task_number);
		result.append(", u: ");
		result.append(u);
		result.append(')');
		return result.toString();
	}

} //TaskSetImpl
