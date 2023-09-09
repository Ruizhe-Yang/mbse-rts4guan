/**
 */
package mcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MC System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mcs.MCSystem#getCeiling_priority <em>Ceiling priority</em>}</li>
 *   <li>{@link mcs.MCSystem#getStatus <em>Status</em>}</li>
 *   <li>{@link mcs.MCSystem#getTasks <em>Tasks</em>}</li>
 *   <li>{@link mcs.MCSystem#getCritical_sections <em>Critical sections</em>}</li>
 *   <li>{@link mcs.MCSystem#getCore <em>Core</em>}</li>
 * </ul>
 *
 * @see mcs.McsPackage#getMCSystem()
 * @model
 * @generated
 */
public interface MCSystem extends MCSElement {
	/**
	 * Returns the value of the '<em><b>Ceiling priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceiling priority</em>' attribute.
	 * @see #setCeiling_priority(int)
	 * @see mcs.McsPackage#getMCSystem_Ceiling_priority()
	 * @model
	 * @generated
	 */
	int getCeiling_priority();

	/**
	 * Sets the value of the '{@link mcs.MCSystem#getCeiling_priority <em>Ceiling priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ceiling priority</em>' attribute.
	 * @see #getCeiling_priority()
	 * @generated
	 */
	void setCeiling_priority(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link mcs.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see mcs.Status
	 * @see #setStatus(Status)
	 * @see mcs.McsPackage#getMCSystem_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link mcs.MCSystem#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see mcs.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link mcs.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see mcs.McsPackage#getMCSystem_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Critical sections</b></em>' containment reference list.
	 * The list contents are of type {@link mcs.CriticalSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical sections</em>' containment reference list.
	 * @see mcs.McsPackage#getMCSystem_Critical_sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<CriticalSection> getCritical_sections();

	/**
	 * Returns the value of the '<em><b>Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' containment reference.
	 * @see #setCore(Core)
	 * @see mcs.McsPackage#getMCSystem_Core()
	 * @model containment="true"
	 * @generated
	 */
	Core getCore();

	/**
	 * Sets the value of the '{@link mcs.MCSystem#getCore <em>Core</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core</em>' containment reference.
	 * @see #getCore()
	 * @generated
	 */
	void setCore(Core value);

} // MCSystem
