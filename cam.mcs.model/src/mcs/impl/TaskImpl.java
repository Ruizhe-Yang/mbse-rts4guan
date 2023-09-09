/**
 */
package mcs.impl;

import mcs.CriticalSection;
import mcs.Criticality;
import mcs.McsPackage;
import mcs.Task;
import mcs.WorkingState;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mcs.impl.TaskImpl#getUtilisation <em>Utilisation</em>}</li>
 *   <li>{@link mcs.impl.TaskImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link mcs.impl.TaskImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link mcs.impl.TaskImpl#getWcet_low <em>Wcet low</em>}</li>
 *   <li>{@link mcs.impl.TaskImpl#getWcet_high <em>Wcet high</em>}</li>
 *   <li>{@link mcs.impl.TaskImpl#getCstime <em>Cstime</em>}</li>
 *   <li>{@link mcs.impl.TaskImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link mcs.impl.TaskImpl#getDynamic_priority <em>Dynamic priority</em>}</li>
 *   <li>{@link mcs.impl.TaskImpl#getTimeleft <em>Timeleft</em>}</li>
 *   <li>{@link mcs.impl.TaskImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link mcs.impl.TaskImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link mcs.impl.TaskImpl#getState <em>State</em>}</li>
 *   <li>{@link mcs.impl.TaskImpl#getCritical_section <em>Critical section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MCSElementImpl implements Task {
	/**
	 * The default value of the '{@link #getUtilisation() <em>Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilisation()
	 * @generated
	 * @ordered
	 */
	protected static final double UTILISATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUtilisation() <em>Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilisation()
	 * @generated
	 * @ordered
	 */
	protected double utilisation = UTILISATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final int DEADLINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected int deadline = DEADLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWcet_low() <em>Wcet low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcet_low()
	 * @generated
	 * @ordered
	 */
	protected static final int WCET_LOW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWcet_low() <em>Wcet low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcet_low()
	 * @generated
	 * @ordered
	 */
	protected int wcet_low = WCET_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getWcet_high() <em>Wcet high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcet_high()
	 * @generated
	 * @ordered
	 */
	protected static final int WCET_HIGH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWcet_high() <em>Wcet high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcet_high()
	 * @generated
	 * @ordered
	 */
	protected int wcet_high = WCET_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCstime() <em>Cstime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCstime()
	 * @generated
	 * @ordered
	 */
	protected static final int CSTIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCstime() <em>Cstime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCstime()
	 * @generated
	 * @ordered
	 */
	protected int cstime = CSTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDynamic_priority() <em>Dynamic priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamic_priority()
	 * @generated
	 * @ordered
	 */
	protected static final int DYNAMIC_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDynamic_priority() <em>Dynamic priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamic_priority()
	 * @generated
	 * @ordered
	 */
	protected int dynamic_priority = DYNAMIC_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeleft() <em>Timeleft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeleft()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMELEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeleft() <em>Timeleft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeleft()
	 * @generated
	 * @ordered
	 */
	protected int timeleft = TIMELEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected static final Criticality CRITICALITY_EDEFAULT = Criticality.LO;

	/**
	 * The cached value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected Criticality criticality = CRITICALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final WorkingState STATE_EDEFAULT = WorkingState.UNSTART;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected WorkingState state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCritical_section() <em>Critical section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCritical_section()
	 * @generated
	 * @ordered
	 */
	protected CriticalSection critical_section;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McsPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMandatory(boolean newIsMandatory) {
		boolean oldIsMandatory = isMandatory;
		isMandatory = newIsMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TASK__IS_MANDATORY, oldIsMandatory, isMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkingState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(WorkingState newState) {
		WorkingState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TASK__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTimeleft() {
		return timeleft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeleft(int newTimeleft) {
		int oldTimeleft = timeleft;
		timeleft = newTimeleft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TASK__TIMELEFT, oldTimeleft, timeleft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TASK__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TASK__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeadline(int newDeadline) {
		int oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TASK__DEADLINE, oldDeadline, deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUtilisation() {
		return utilisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUtilisation(double newUtilisation) {
		double oldUtilisation = utilisation;
		utilisation = newUtilisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TASK__UTILISATION, oldUtilisation, utilisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWcet_low() {
		return wcet_low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWcet_low(int newWcet_low) {
		int oldWcet_low = wcet_low;
		wcet_low = newWcet_low;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TASK__WCET_LOW, oldWcet_low, wcet_low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCstime() {
		return cstime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCstime(int newCstime) {
		int oldCstime = cstime;
		cstime = newCstime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TASK__CSTIME, oldCstime, cstime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWcet_high() {
		return wcet_high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWcet_high(int newWcet_high) {
		int oldWcet_high = wcet_high;
		wcet_high = newWcet_high;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TASK__WCET_HIGH, oldWcet_high, wcet_high));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Criticality getCriticality() {
		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCriticality(Criticality newCriticality) {
		Criticality oldCriticality = criticality;
		criticality = newCriticality == null ? CRITICALITY_EDEFAULT : newCriticality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TASK__CRITICALITY, oldCriticality, criticality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDynamic_priority() {
		return dynamic_priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDynamic_priority(int newDynamic_priority) {
		int oldDynamic_priority = dynamic_priority;
		dynamic_priority = newDynamic_priority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TASK__DYNAMIC_PRIORITY, oldDynamic_priority, dynamic_priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CriticalSection getCritical_section() {
		if (critical_section != null && critical_section.eIsProxy()) {
			InternalEObject oldCritical_section = (InternalEObject)critical_section;
			critical_section = (CriticalSection)eResolveProxy(oldCritical_section);
			if (critical_section != oldCritical_section) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.TASK__CRITICAL_SECTION, oldCritical_section, critical_section));
			}
		}
		return critical_section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriticalSection basicGetCritical_section() {
		return critical_section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCritical_section(CriticalSection newCritical_section) {
		CriticalSection oldCritical_section = critical_section;
		critical_section = newCritical_section;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TASK__CRITICAL_SECTION, oldCritical_section, critical_section));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case McsPackage.TASK__UTILISATION:
				return getUtilisation();
			case McsPackage.TASK__PERIOD:
				return getPeriod();
			case McsPackage.TASK__DEADLINE:
				return getDeadline();
			case McsPackage.TASK__WCET_LOW:
				return getWcet_low();
			case McsPackage.TASK__WCET_HIGH:
				return getWcet_high();
			case McsPackage.TASK__CSTIME:
				return getCstime();
			case McsPackage.TASK__PRIORITY:
				return getPriority();
			case McsPackage.TASK__DYNAMIC_PRIORITY:
				return getDynamic_priority();
			case McsPackage.TASK__TIMELEFT:
				return getTimeleft();
			case McsPackage.TASK__IS_MANDATORY:
				return isIsMandatory();
			case McsPackage.TASK__CRITICALITY:
				return getCriticality();
			case McsPackage.TASK__STATE:
				return getState();
			case McsPackage.TASK__CRITICAL_SECTION:
				if (resolve) return getCritical_section();
				return basicGetCritical_section();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case McsPackage.TASK__UTILISATION:
				setUtilisation((Double)newValue);
				return;
			case McsPackage.TASK__PERIOD:
				setPeriod((Integer)newValue);
				return;
			case McsPackage.TASK__DEADLINE:
				setDeadline((Integer)newValue);
				return;
			case McsPackage.TASK__WCET_LOW:
				setWcet_low((Integer)newValue);
				return;
			case McsPackage.TASK__WCET_HIGH:
				setWcet_high((Integer)newValue);
				return;
			case McsPackage.TASK__CSTIME:
				setCstime((Integer)newValue);
				return;
			case McsPackage.TASK__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case McsPackage.TASK__DYNAMIC_PRIORITY:
				setDynamic_priority((Integer)newValue);
				return;
			case McsPackage.TASK__TIMELEFT:
				setTimeleft((Integer)newValue);
				return;
			case McsPackage.TASK__IS_MANDATORY:
				setIsMandatory((Boolean)newValue);
				return;
			case McsPackage.TASK__CRITICALITY:
				setCriticality((Criticality)newValue);
				return;
			case McsPackage.TASK__STATE:
				setState((WorkingState)newValue);
				return;
			case McsPackage.TASK__CRITICAL_SECTION:
				setCritical_section((CriticalSection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case McsPackage.TASK__UTILISATION:
				setUtilisation(UTILISATION_EDEFAULT);
				return;
			case McsPackage.TASK__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case McsPackage.TASK__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
				return;
			case McsPackage.TASK__WCET_LOW:
				setWcet_low(WCET_LOW_EDEFAULT);
				return;
			case McsPackage.TASK__WCET_HIGH:
				setWcet_high(WCET_HIGH_EDEFAULT);
				return;
			case McsPackage.TASK__CSTIME:
				setCstime(CSTIME_EDEFAULT);
				return;
			case McsPackage.TASK__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case McsPackage.TASK__DYNAMIC_PRIORITY:
				setDynamic_priority(DYNAMIC_PRIORITY_EDEFAULT);
				return;
			case McsPackage.TASK__TIMELEFT:
				setTimeleft(TIMELEFT_EDEFAULT);
				return;
			case McsPackage.TASK__IS_MANDATORY:
				setIsMandatory(IS_MANDATORY_EDEFAULT);
				return;
			case McsPackage.TASK__CRITICALITY:
				setCriticality(CRITICALITY_EDEFAULT);
				return;
			case McsPackage.TASK__STATE:
				setState(STATE_EDEFAULT);
				return;
			case McsPackage.TASK__CRITICAL_SECTION:
				setCritical_section((CriticalSection)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case McsPackage.TASK__UTILISATION:
				return utilisation != UTILISATION_EDEFAULT;
			case McsPackage.TASK__PERIOD:
				return period != PERIOD_EDEFAULT;
			case McsPackage.TASK__DEADLINE:
				return deadline != DEADLINE_EDEFAULT;
			case McsPackage.TASK__WCET_LOW:
				return wcet_low != WCET_LOW_EDEFAULT;
			case McsPackage.TASK__WCET_HIGH:
				return wcet_high != WCET_HIGH_EDEFAULT;
			case McsPackage.TASK__CSTIME:
				return cstime != CSTIME_EDEFAULT;
			case McsPackage.TASK__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case McsPackage.TASK__DYNAMIC_PRIORITY:
				return dynamic_priority != DYNAMIC_PRIORITY_EDEFAULT;
			case McsPackage.TASK__TIMELEFT:
				return timeleft != TIMELEFT_EDEFAULT;
			case McsPackage.TASK__IS_MANDATORY:
				return isMandatory != IS_MANDATORY_EDEFAULT;
			case McsPackage.TASK__CRITICALITY:
				return criticality != CRITICALITY_EDEFAULT;
			case McsPackage.TASK__STATE:
				return state != STATE_EDEFAULT;
			case McsPackage.TASK__CRITICAL_SECTION:
				return critical_section != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (utilisation: ");
		result.append(utilisation);
		result.append(", period: ");
		result.append(period);
		result.append(", deadline: ");
		result.append(deadline);
		result.append(", wcet_low: ");
		result.append(wcet_low);
		result.append(", wcet_high: ");
		result.append(wcet_high);
		result.append(", cstime: ");
		result.append(cstime);
		result.append(", priority: ");
		result.append(priority);
		result.append(", dynamic_priority: ");
		result.append(dynamic_priority);
		result.append(", timeleft: ");
		result.append(timeleft);
		result.append(", IsMandatory: ");
		result.append(isMandatory);
		result.append(", criticality: ");
		result.append(criticality);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
