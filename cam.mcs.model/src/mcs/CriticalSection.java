/**
 */
package mcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Critical Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mcs.CriticalSection#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link mcs.CriticalSection#getStart <em>Start</em>}</li>
 *   <li>{@link mcs.CriticalSection#getExecution <em>Execution</em>}</li>
 *   <li>{@link mcs.CriticalSection#getElapsed <em>Elapsed</em>}</li>
 *   <li>{@link mcs.CriticalSection#getTasks <em>Tasks</em>}</li>
 *   <li>{@link mcs.CriticalSection#getSemaphore <em>Semaphore</em>}</li>
 * </ul>
 *
 * @see mcs.McsPackage#getCriticalSection()
 * @model
 * @generated
 */
public interface CriticalSection extends MCSElement {
	/**
	 * Returns the value of the '<em><b>Criticality</b></em>' attribute.
	 * The literals are from the enumeration {@link mcs.Criticality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criticality</em>' attribute.
	 * @see mcs.Criticality
	 * @see #setCriticality(Criticality)
	 * @see mcs.McsPackage#getCriticalSection_Criticality()
	 * @model
	 * @generated
	 */
	Criticality getCriticality();

	/**
	 * Sets the value of the '{@link mcs.CriticalSection#getCriticality <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality</em>' attribute.
	 * @see mcs.Criticality
	 * @see #getCriticality()
	 * @generated
	 */
	void setCriticality(Criticality value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(int)
	 * @see mcs.McsPackage#getCriticalSection_Start()
	 * @model
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link mcs.CriticalSection#getStart <em>Start</em>}' attribute.
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
	 * @see mcs.McsPackage#getCriticalSection_Execution()
	 * @model
	 * @generated
	 */
	int getExecution();

	/**
	 * Sets the value of the '{@link mcs.CriticalSection#getExecution <em>Execution</em>}' attribute.
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
	 * @see mcs.McsPackage#getCriticalSection_Elapsed()
	 * @model
	 * @generated
	 */
	int getElapsed();

	/**
	 * Sets the value of the '{@link mcs.CriticalSection#getElapsed <em>Elapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elapsed</em>' attribute.
	 * @see #getElapsed()
	 * @generated
	 */
	void setElapsed(int value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link mcs.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see mcs.McsPackage#getCriticalSection_Tasks()
	 * @model
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Semaphore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semaphore</em>' containment reference.
	 * @see #setSemaphore(Semaphore)
	 * @see mcs.McsPackage#getCriticalSection_Semaphore()
	 * @model containment="true"
	 * @generated
	 */
	Semaphore getSemaphore();

	/**
	 * Sets the value of the '{@link mcs.CriticalSection#getSemaphore <em>Semaphore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semaphore</em>' containment reference.
	 * @see #getSemaphore()
	 * @generated
	 */
	void setSemaphore(Semaphore value);

} // CriticalSection