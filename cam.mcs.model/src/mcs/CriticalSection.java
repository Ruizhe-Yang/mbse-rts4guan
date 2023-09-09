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
 *   <li>{@link mcs.CriticalSection#getCeiling_priority <em>Ceiling priority</em>}</li>
 *   <li>{@link mcs.CriticalSection#isLocked <em>Locked</em>}</li>
 *   <li>{@link mcs.CriticalSection#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link mcs.CriticalSection#getTasks <em>Tasks</em>}</li>
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
	 * Returns the value of the '<em><b>Ceiling priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceiling priority</em>' attribute.
	 * @see #setCeiling_priority(int)
	 * @see mcs.McsPackage#getCriticalSection_Ceiling_priority()
	 * @model
	 * @generated
	 */
	int getCeiling_priority();

	/**
	 * Sets the value of the '{@link mcs.CriticalSection#getCeiling_priority <em>Ceiling priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ceiling priority</em>' attribute.
	 * @see #getCeiling_priority()
	 * @generated
	 */
	void setCeiling_priority(int value);

	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(boolean)
	 * @see mcs.McsPackage#getCriticalSection_Locked()
	 * @model
	 * @generated
	 */
	boolean isLocked();

	/**
	 * Sets the value of the '{@link mcs.CriticalSection#isLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #isLocked()
	 * @generated
	 */
	void setLocked(boolean value);

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

} // CriticalSection
