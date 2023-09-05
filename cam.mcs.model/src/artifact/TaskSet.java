/**
 */
package artifact;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link artifact.TaskSet#getTask_number <em>Task number</em>}</li>
 *   <li>{@link artifact.TaskSet#getU <em>U</em>}</li>
 *   <li>{@link artifact.TaskSet#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see artifact.ArtifactPackage#getTaskSet()
 * @model
 * @generated
 */
public interface TaskSet extends MCSElement {
	/**
	 * Returns the value of the '<em><b>Task number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task number</em>' attribute.
	 * @see #setTask_number(int)
	 * @see artifact.ArtifactPackage#getTaskSet_Task_number()
	 * @model
	 * @generated
	 */
	int getTask_number();

	/**
	 * Sets the value of the '{@link artifact.TaskSet#getTask_number <em>Task number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task number</em>' attribute.
	 * @see #getTask_number()
	 * @generated
	 */
	void setTask_number(int value);

	/**
	 * Returns the value of the '<em><b>U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U</em>' attribute.
	 * @see #setU(double)
	 * @see artifact.ArtifactPackage#getTaskSet_U()
	 * @model
	 * @generated
	 */
	double getU();

	/**
	 * Sets the value of the '{@link artifact.TaskSet#getU <em>U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U</em>' attribute.
	 * @see #getU()
	 * @generated
	 */
	void setU(double value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link artifact.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see artifact.ArtifactPackage#getTaskSet_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // TaskSet
