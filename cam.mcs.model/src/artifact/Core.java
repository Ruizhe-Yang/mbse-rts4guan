/**
 */
package artifact;

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
 *   <li>{@link artifact.Core#getTime <em>Time</em>}</li>
 *   <li>{@link artifact.Core#isLocked <em>Locked</em>}</li>
 *   <li>{@link artifact.Core#getCurrent_task <em>Current task</em>}</li>
 *   <li>{@link artifact.Core#getQueue <em>Queue</em>}</li>
 * </ul>
 *
 * @see artifact.ArtifactPackage#getCore()
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
	 * @see artifact.ArtifactPackage#getCore_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link artifact.Core#getTime <em>Time</em>}' attribute.
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
	 * @see artifact.ArtifactPackage#getCore_Locked()
	 * @model
	 * @generated
	 */
	boolean isLocked();

	/**
	 * Sets the value of the '{@link artifact.Core#isLocked <em>Locked</em>}' attribute.
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
	 * @see artifact.ArtifactPackage#getCore_Current_task()
	 * @model
	 * @generated
	 */
	Task getCurrent_task();

	/**
	 * Sets the value of the '{@link artifact.Core#getCurrent_task <em>Current task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current task</em>' reference.
	 * @see #getCurrent_task()
	 * @generated
	 */
	void setCurrent_task(Task value);

	/**
	 * Returns the value of the '<em><b>Queue</b></em>' reference list.
	 * The list contents are of type {@link artifact.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue</em>' reference list.
	 * @see artifact.ArtifactPackage#getCore_Queue()
	 * @model
	 * @generated
	 */
	EList<Task> getQueue();

} // Core
