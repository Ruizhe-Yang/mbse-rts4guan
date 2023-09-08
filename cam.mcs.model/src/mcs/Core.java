/**
 */
package mcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mcs.Core#getTime <em>Time</em>}</li>
 *   <li>{@link mcs.Core#isLocked <em>Locked</em>}</li>
 *   <li>{@link mcs.Core#getCurrent_task <em>Current task</em>}</li>
 *   <li>{@link mcs.Core#getQueue <em>Queue</em>}</li>
 * </ul>
 *
 * @see mcs.McsPackage#getCore()
 * @model
 * @generated
 */
public interface Core extends MCSElement {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see mcs.McsPackage#getCore_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link mcs.Core#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(boolean)
	 * @see mcs.McsPackage#getCore_Locked()
	 * @model
	 * @generated
	 */
	boolean isLocked();

	/**
	 * Sets the value of the '{@link mcs.Core#isLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #isLocked()
	 * @generated
	 */
	void setLocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Current task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current task</em>' reference.
	 * @see #setCurrent_task(Task)
	 * @see mcs.McsPackage#getCore_Current_task()
	 * @model
	 * @generated
	 */
	Task getCurrent_task();

	/**
	 * Sets the value of the '{@link mcs.Core#getCurrent_task <em>Current task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current task</em>' reference.
	 * @see #getCurrent_task()
	 * @generated
	 */
	void setCurrent_task(Task value);

	/**
	 * Returns the value of the '<em><b>Queue</b></em>' reference list.
	 * The list contents are of type {@link mcs.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue</em>' reference list.
	 * @see mcs.McsPackage#getCore_Queue()
	 * @model
	 * @generated
	 */
	EList<Task> getQueue();

} // Core
