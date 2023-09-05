/**
 */
package artifact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Critical Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link artifact.CriticalSection#getStart <em>Start</em>}</li>
 *   <li>{@link artifact.CriticalSection#getExecution <em>Execution</em>}</li>
 *   <li>{@link artifact.CriticalSection#getElapsed <em>Elapsed</em>}</li>
 *   <li>{@link artifact.CriticalSection#getSemaphore <em>Semaphore</em>}</li>
 * </ul>
 *
 * @see artifact.ArtifactPackage#getCriticalSection()
 * @model
 * @generated
 */
public interface CriticalSection extends MCSElement {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(int)
	 * @see artifact.ArtifactPackage#getCriticalSection_Start()
	 * @model
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link artifact.CriticalSection#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(int value);

	/**
	 * Returns the value of the '<em><b>Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' attribute.
	 * @see #setExecution(int)
	 * @see artifact.ArtifactPackage#getCriticalSection_Execution()
	 * @model
	 * @generated
	 */
	int getExecution();

	/**
	 * Sets the value of the '{@link artifact.CriticalSection#getExecution <em>Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' attribute.
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(int value);

	/**
	 * Returns the value of the '<em><b>Elapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elapsed</em>' attribute.
	 * @see #setElapsed(int)
	 * @see artifact.ArtifactPackage#getCriticalSection_Elapsed()
	 * @model
	 * @generated
	 */
	int getElapsed();

	/**
	 * Sets the value of the '{@link artifact.CriticalSection#getElapsed <em>Elapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elapsed</em>' attribute.
	 * @see #getElapsed()
	 * @generated
	 */
	void setElapsed(int value);

	/**
	 * Returns the value of the '<em><b>Semaphore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semaphore</em>' reference.
	 * @see #setSemaphore(Semaphore)
	 * @see artifact.ArtifactPackage#getCriticalSection_Semaphore()
	 * @model
	 * @generated
	 */
	Semaphore getSemaphore();

	/**
	 * Sets the value of the '{@link artifact.CriticalSection#getSemaphore <em>Semaphore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semaphore</em>' reference.
	 * @see #getSemaphore()
	 * @generated
	 */
	void setSemaphore(Semaphore value);

} // CriticalSection
