/**
 */
package mcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mcs.Semaphore#isLocked <em>Locked</em>}</li>
 *   <li>{@link mcs.Semaphore#getCeiling_priority <em>Ceiling priority</em>}</li>
 *   <li>{@link mcs.Semaphore#getAcquisition <em>Acquisition</em>}</li>
 * </ul>
 *
 * @see mcs.McsPackage#getSemaphore()
 * @model
 * @generated
 */
public interface Semaphore extends MCSElement {
	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(boolean)
	 * @see mcs.McsPackage#getSemaphore_Locked()
	 * @model
	 * @generated
	 */
	boolean isLocked();

	/**
	 * Sets the value of the '{@link mcs.Semaphore#isLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #isLocked()
	 * @generated
	 */
	void setLocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Ceiling priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceiling priority</em>' attribute.
	 * @see #setCeiling_priority(int)
	 * @see mcs.McsPackage#getSemaphore_Ceiling_priority()
	 * @model
	 * @generated
	 */
	int getCeiling_priority();

	/**
	 * Sets the value of the '{@link mcs.Semaphore#getCeiling_priority <em>Ceiling priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ceiling priority</em>' attribute.
	 * @see #getCeiling_priority()
	 * @generated
	 */
	void setCeiling_priority(int value);

	/**
	 * Returns the value of the '<em><b>Acquisition</b></em>' reference list.
	 * The list contents are of type {@link mcs.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acquisition</em>' reference list.
	 * @see mcs.McsPackage#getSemaphore_Acquisition()
	 * @model
	 * @generated
	 */
	EList<Task> getAcquisition();

} // Semaphore
