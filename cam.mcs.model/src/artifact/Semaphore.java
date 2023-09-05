/**
 */
package artifact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link artifact.Semaphore#isLocked <em>Locked</em>}</li>
 *   <li>{@link artifact.Semaphore#getInitial_priority <em>Initial priority</em>}</li>
 *   <li>{@link artifact.Semaphore#getCeiling_priority <em>Ceiling priority</em>}</li>
 *   <li>{@link artifact.Semaphore#getAcquisition <em>Acquisition</em>}</li>
 * </ul>
 *
 * @see artifact.ArtifactPackage#getSemaphore()
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
	 * @see artifact.ArtifactPackage#getSemaphore_Locked()
	 * @model
	 * @generated
	 */
	boolean isLocked();

	/**
	 * Sets the value of the '{@link artifact.Semaphore#isLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #isLocked()
	 * @generated
	 */
	void setLocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Initial priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial priority</em>' attribute.
	 * @see #setInitial_priority(int)
	 * @see artifact.ArtifactPackage#getSemaphore_Initial_priority()
	 * @model
	 * @generated
	 */
	int getInitial_priority();

	/**
	 * Sets the value of the '{@link artifact.Semaphore#getInitial_priority <em>Initial priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial priority</em>' attribute.
	 * @see #getInitial_priority()
	 * @generated
	 */
	void setInitial_priority(int value);

	/**
	 * Returns the value of the '<em><b>Ceiling priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceiling priority</em>' attribute.
	 * @see #setCeiling_priority(int)
	 * @see artifact.ArtifactPackage#getSemaphore_Ceiling_priority()
	 * @model
	 * @generated
	 */
	int getCeiling_priority();

	/**
	 * Sets the value of the '{@link artifact.Semaphore#getCeiling_priority <em>Ceiling priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ceiling priority</em>' attribute.
	 * @see #getCeiling_priority()
	 * @generated
	 */
	void setCeiling_priority(int value);

	/**
	 * Returns the value of the '<em><b>Acquisition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acquisition</em>' reference.
	 * @see #setAcquisition(Task)
	 * @see artifact.ArtifactPackage#getSemaphore_Acquisition()
	 * @model
	 * @generated
	 */
	Task getAcquisition();

	/**
	 * Sets the value of the '{@link artifact.Semaphore#getAcquisition <em>Acquisition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acquisition</em>' reference.
	 * @see #getAcquisition()
	 * @generated
	 */
	void setAcquisition(Task value);

} // Semaphore
