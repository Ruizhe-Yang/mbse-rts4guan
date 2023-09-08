/**
 */
package mcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mcs.Task#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link mcs.Task#isLocking <em>Locking</em>}</li>
 *   <li>{@link mcs.Task#getState <em>State</em>}</li>
 *   <li>{@link mcs.Task#getTimeleft <em>Timeleft</em>}</li>
 *   <li>{@link mcs.Task#getPriority <em>Priority</em>}</li>
 *   <li>{@link mcs.Task#getPeriod <em>Period</em>}</li>
 *   <li>{@link mcs.Task#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link mcs.Task#getUtilisation <em>Utilisation</em>}</li>
 *   <li>{@link mcs.Task#getComputation_time <em>Computation time</em>}</li>
 *   <li>{@link mcs.Task#getWcet_low <em>Wcet low</em>}</li>
 *   <li>{@link mcs.Task#getCstime <em>Cstime</em>}</li>
 *   <li>{@link mcs.Task#getWcet_high <em>Wcet high</em>}</li>
 *   <li>{@link mcs.Task#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link mcs.Task#getDynamic_priority <em>Dynamic priority</em>}</li>
 *   <li>{@link mcs.Task#getOffset <em>Offset</em>}</li>
 *   <li>{@link mcs.Task#getRelease_time <em>Release time</em>}</li>
 *   <li>{@link mcs.Task#getCurrent_cs <em>Current cs</em>}</li>
 *   <li>{@link mcs.Task#getCritical_section <em>Critical section</em>}</li>
 * </ul>
 *
 * @see mcs.McsPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends MCSElement {
	/**
	 * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mandatory</em>' attribute.
	 * @see #setIsMandatory(boolean)
	 * @see mcs.McsPackage#getTask_IsMandatory()
	 * @model
	 * @generated
	 */
	boolean isIsMandatory();

	/**
	 * Sets the value of the '{@link mcs.Task#isIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mandatory</em>' attribute.
	 * @see #isIsMandatory()
	 * @generated
	 */
	void setIsMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locking</em>' attribute.
	 * @see #setLocking(boolean)
	 * @see mcs.McsPackage#getTask_Locking()
	 * @model
	 * @generated
	 */
	boolean isLocking();

	/**
	 * Sets the value of the '{@link mcs.Task#isLocking <em>Locking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locking</em>' attribute.
	 * @see #isLocking()
	 * @generated
	 */
	void setLocking(boolean value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link mcs.WorkingState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see mcs.WorkingState
	 * @see #setState(WorkingState)
	 * @see mcs.McsPackage#getTask_State()
	 * @model
	 * @generated
	 */
	WorkingState getState();

	/**
	 * Sets the value of the '{@link mcs.Task#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see mcs.WorkingState
	 * @see #getState()
	 * @generated
	 */
	void setState(WorkingState value);

	/**
	 * Returns the value of the '<em><b>Timeleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeleft</em>' attribute.
	 * @see #setTimeleft(int)
	 * @see mcs.McsPackage#getTask_Timeleft()
	 * @model
	 * @generated
	 */
	int getTimeleft();

	/**
	 * Sets the value of the '{@link mcs.Task#getTimeleft <em>Timeleft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeleft</em>' attribute.
	 * @see #getTimeleft()
	 * @generated
	 */
	void setTimeleft(int value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see mcs.McsPackage#getTask_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link mcs.Task#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see mcs.McsPackage#getTask_Period()
	 * @model
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link mcs.Task#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #setDeadline(int)
	 * @see mcs.McsPackage#getTask_Deadline()
	 * @model
	 * @generated
	 */
	int getDeadline();

	/**
	 * Sets the value of the '{@link mcs.Task#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(int value);

	/**
	 * Returns the value of the '<em><b>Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilisation</em>' attribute.
	 * @see #setUtilisation(double)
	 * @see mcs.McsPackage#getTask_Utilisation()
	 * @model
	 * @generated
	 */
	double getUtilisation();

	/**
	 * Sets the value of the '{@link mcs.Task#getUtilisation <em>Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilisation</em>' attribute.
	 * @see #getUtilisation()
	 * @generated
	 */
	void setUtilisation(double value);

	/**
	 * Returns the value of the '<em><b>Computation time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computation time</em>' attribute.
	 * @see #setComputation_time(int)
	 * @see mcs.McsPackage#getTask_Computation_time()
	 * @model
	 * @generated
	 */
	int getComputation_time();

	/**
	 * Sets the value of the '{@link mcs.Task#getComputation_time <em>Computation time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computation time</em>' attribute.
	 * @see #getComputation_time()
	 * @generated
	 */
	void setComputation_time(int value);

	/**
	 * Returns the value of the '<em><b>Wcet low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wcet low</em>' attribute.
	 * @see #setWcet_low(int)
	 * @see mcs.McsPackage#getTask_Wcet_low()
	 * @model
	 * @generated
	 */
	int getWcet_low();

	/**
	 * Sets the value of the '{@link mcs.Task#getWcet_low <em>Wcet low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcet low</em>' attribute.
	 * @see #getWcet_low()
	 * @generated
	 */
	void setWcet_low(int value);

	/**
	 * Returns the value of the '<em><b>Cstime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cstime</em>' attribute.
	 * @see #setCstime(int)
	 * @see mcs.McsPackage#getTask_Cstime()
	 * @model
	 * @generated
	 */
	int getCstime();

	/**
	 * Sets the value of the '{@link mcs.Task#getCstime <em>Cstime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cstime</em>' attribute.
	 * @see #getCstime()
	 * @generated
	 */
	void setCstime(int value);

	/**
	 * Returns the value of the '<em><b>Wcet high</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wcet high</em>' attribute.
	 * @see #setWcet_high(int)
	 * @see mcs.McsPackage#getTask_Wcet_high()
	 * @model
	 * @generated
	 */
	int getWcet_high();

	/**
	 * Sets the value of the '{@link mcs.Task#getWcet_high <em>Wcet high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcet high</em>' attribute.
	 * @see #getWcet_high()
	 * @generated
	 */
	void setWcet_high(int value);

	/**
	 * Returns the value of the '<em><b>Criticality</b></em>' attribute.
	 * The literals are from the enumeration {@link mcs.Criticality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criticality</em>' attribute.
	 * @see mcs.Criticality
	 * @see #setCriticality(Criticality)
	 * @see mcs.McsPackage#getTask_Criticality()
	 * @model
	 * @generated
	 */
	Criticality getCriticality();

	/**
	 * Sets the value of the '{@link mcs.Task#getCriticality <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality</em>' attribute.
	 * @see mcs.Criticality
	 * @see #getCriticality()
	 * @generated
	 */
	void setCriticality(Criticality value);

	/**
	 * Returns the value of the '<em><b>Dynamic priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic priority</em>' attribute.
	 * @see #setDynamic_priority(int)
	 * @see mcs.McsPackage#getTask_Dynamic_priority()
	 * @model
	 * @generated
	 */
	int getDynamic_priority();

	/**
	 * Sets the value of the '{@link mcs.Task#getDynamic_priority <em>Dynamic priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic priority</em>' attribute.
	 * @see #getDynamic_priority()
	 * @generated
	 */
	void setDynamic_priority(int value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see mcs.McsPackage#getTask_Offset()
	 * @model
	 * @generated
	 */
	int getOffset();

	/**
	 * Sets the value of the '{@link mcs.Task#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(int value);

	/**
	 * Returns the value of the '<em><b>Release time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release time</em>' attribute.
	 * @see #setRelease_time(int)
	 * @see mcs.McsPackage#getTask_Release_time()
	 * @model
	 * @generated
	 */
	int getRelease_time();

	/**
	 * Sets the value of the '{@link mcs.Task#getRelease_time <em>Release time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release time</em>' attribute.
	 * @see #getRelease_time()
	 * @generated
	 */
	void setRelease_time(int value);

	/**
	 * Returns the value of the '<em><b>Current cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current cs</em>' attribute.
	 * @see #setCurrent_cs(int)
	 * @see mcs.McsPackage#getTask_Current_cs()
	 * @model
	 * @generated
	 */
	int getCurrent_cs();

	/**
	 * Sets the value of the '{@link mcs.Task#getCurrent_cs <em>Current cs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current cs</em>' attribute.
	 * @see #getCurrent_cs()
	 * @generated
	 */
	void setCurrent_cs(int value);

	/**
	 * Returns the value of the '<em><b>Critical section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical section</em>' reference.
	 * @see #setCritical_section(CriticalSection)
	 * @see mcs.McsPackage#getTask_Critical_section()
	 * @model
	 * @generated
	 */
	CriticalSection getCritical_section();

	/**
	 * Sets the value of the '{@link mcs.Task#getCritical_section <em>Critical section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical section</em>' reference.
	 * @see #getCritical_section()
	 * @generated
	 */
	void setCritical_section(CriticalSection value);

} // Task
