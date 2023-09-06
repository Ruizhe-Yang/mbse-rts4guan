/**
 */
package artifact.impl;

import artifact.ArtifactPackage;
import artifact.CriticalSection;
import artifact.Criticality;
import artifact.Task;

import artifact.WorkingState;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link artifact.impl.TaskImpl#getState <em>State</em>}</li>
 *   <li>{@link artifact.impl.TaskImpl#getTimeleft <em>Timeleft</em>}</li>
 *   <li>{@link artifact.impl.TaskImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link artifact.impl.TaskImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link artifact.impl.TaskImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link artifact.impl.TaskImpl#getUtilisation <em>Utilisation</em>}</li>
 *   <li>{@link artifact.impl.TaskImpl#getComputation_time <em>Computation time</em>}</li>
 *   <li>{@link artifact.impl.TaskImpl#getWcet_low <em>Wcet low</em>}</li>
 *   <li>{@link artifact.impl.TaskImpl#getCstime <em>Cstime</em>}</li>
 *   <li>{@link artifact.impl.TaskImpl#getWcet_high <em>Wcet high</em>}</li>
 *   <li>{@link artifact.impl.TaskImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link artifact.impl.TaskImpl#getDynamic_priority <em>Dynamic priority</em>}</li>
 *   <li>{@link artifact.impl.TaskImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link artifact.impl.TaskImpl#getRelease_time <em>Release time</em>}</li>
 *   <li>{@link artifact.impl.TaskImpl#getCurrent_cs <em>Current cs</em>}</li>
 *   <li>{@link artifact.impl.TaskImpl#getCritical_section <em>Critical section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MCSElementImpl implements Task {
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
	 * The default value of the '{@link #getComputation_time() <em>Computation time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputation_time()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPUTATION_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getComputation_time() <em>Computation time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputation_time()
	 * @generated
	 * @ordered
	 */
	protected int computation_time = COMPUTATION_TIME_EDEFAULT;

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
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected int offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelease_time() <em>Release time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease_time()
	 * @generated
	 * @ordered
	 */
	protected static final int RELEASE_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRelease_time() <em>Release time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease_time()
	 * @generated
	 * @ordered
	 */
	protected int release_time = RELEASE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_cs() <em>Current cs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_cs()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_CS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrent_cs() <em>Current cs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_cs()
	 * @generated
	 * @ordered
	 */
	protected int current_cs = CURRENT_CS_EDEFAULT;

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
		return ArtifactPackage.Literals.TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__TIMELEFT, oldTimeleft, timeleft));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__PRIORITY, oldPriority, priority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__PERIOD, oldPeriod, period));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__DEADLINE, oldDeadline, deadline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__UTILISATION, oldUtilisation, utilisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getComputation_time() {
		return computation_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComputation_time(int newComputation_time) {
		int oldComputation_time = computation_time;
		computation_time = newComputation_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__COMPUTATION_TIME, oldComputation_time, computation_time));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__WCET_LOW, oldWcet_low, wcet_low));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__CSTIME, oldCstime, cstime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__WCET_HIGH, oldWcet_high, wcet_high));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__CRITICALITY, oldCriticality, criticality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__DYNAMIC_PRIORITY, oldDynamic_priority, dynamic_priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffset(int newOffset) {
		int oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRelease_time() {
		return release_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelease_time(int newRelease_time) {
		int oldRelease_time = release_time;
		release_time = newRelease_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__RELEASE_TIME, oldRelease_time, release_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCurrent_cs() {
		return current_cs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrent_cs(int newCurrent_cs) {
		int oldCurrent_cs = current_cs;
		current_cs = newCurrent_cs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__CURRENT_CS, oldCurrent_cs, current_cs));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArtifactPackage.TASK__CRITICAL_SECTION, oldCritical_section, critical_section));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.TASK__CRITICAL_SECTION, oldCritical_section, critical_section));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArtifactPackage.TASK__STATE:
				return getState();
			case ArtifactPackage.TASK__TIMELEFT:
				return getTimeleft();
			case ArtifactPackage.TASK__PRIORITY:
				return getPriority();
			case ArtifactPackage.TASK__PERIOD:
				return getPeriod();
			case ArtifactPackage.TASK__DEADLINE:
				return getDeadline();
			case ArtifactPackage.TASK__UTILISATION:
				return getUtilisation();
			case ArtifactPackage.TASK__COMPUTATION_TIME:
				return getComputation_time();
			case ArtifactPackage.TASK__WCET_LOW:
				return getWcet_low();
			case ArtifactPackage.TASK__CSTIME:
				return getCstime();
			case ArtifactPackage.TASK__WCET_HIGH:
				return getWcet_high();
			case ArtifactPackage.TASK__CRITICALITY:
				return getCriticality();
			case ArtifactPackage.TASK__DYNAMIC_PRIORITY:
				return getDynamic_priority();
			case ArtifactPackage.TASK__OFFSET:
				return getOffset();
			case ArtifactPackage.TASK__RELEASE_TIME:
				return getRelease_time();
			case ArtifactPackage.TASK__CURRENT_CS:
				return getCurrent_cs();
			case ArtifactPackage.TASK__CRITICAL_SECTION:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArtifactPackage.TASK__STATE:
				setState((WorkingState)newValue);
				return;
			case ArtifactPackage.TASK__TIMELEFT:
				setTimeleft((Integer)newValue);
				return;
			case ArtifactPackage.TASK__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case ArtifactPackage.TASK__PERIOD:
				setPeriod((Integer)newValue);
				return;
			case ArtifactPackage.TASK__DEADLINE:
				setDeadline((Integer)newValue);
				return;
			case ArtifactPackage.TASK__UTILISATION:
				setUtilisation((Double)newValue);
				return;
			case ArtifactPackage.TASK__COMPUTATION_TIME:
				setComputation_time((Integer)newValue);
				return;
			case ArtifactPackage.TASK__WCET_LOW:
				setWcet_low((Integer)newValue);
				return;
			case ArtifactPackage.TASK__CSTIME:
				setCstime((Integer)newValue);
				return;
			case ArtifactPackage.TASK__WCET_HIGH:
				setWcet_high((Integer)newValue);
				return;
			case ArtifactPackage.TASK__CRITICALITY:
				setCriticality((Criticality)newValue);
				return;
			case ArtifactPackage.TASK__DYNAMIC_PRIORITY:
				setDynamic_priority((Integer)newValue);
				return;
			case ArtifactPackage.TASK__OFFSET:
				setOffset((Integer)newValue);
				return;
			case ArtifactPackage.TASK__RELEASE_TIME:
				setRelease_time((Integer)newValue);
				return;
			case ArtifactPackage.TASK__CURRENT_CS:
				setCurrent_cs((Integer)newValue);
				return;
			case ArtifactPackage.TASK__CRITICAL_SECTION:
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
			case ArtifactPackage.TASK__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ArtifactPackage.TASK__TIMELEFT:
				setTimeleft(TIMELEFT_EDEFAULT);
				return;
			case ArtifactPackage.TASK__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case ArtifactPackage.TASK__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case ArtifactPackage.TASK__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
				return;
			case ArtifactPackage.TASK__UTILISATION:
				setUtilisation(UTILISATION_EDEFAULT);
				return;
			case ArtifactPackage.TASK__COMPUTATION_TIME:
				setComputation_time(COMPUTATION_TIME_EDEFAULT);
				return;
			case ArtifactPackage.TASK__WCET_LOW:
				setWcet_low(WCET_LOW_EDEFAULT);
				return;
			case ArtifactPackage.TASK__CSTIME:
				setCstime(CSTIME_EDEFAULT);
				return;
			case ArtifactPackage.TASK__WCET_HIGH:
				setWcet_high(WCET_HIGH_EDEFAULT);
				return;
			case ArtifactPackage.TASK__CRITICALITY:
				setCriticality(CRITICALITY_EDEFAULT);
				return;
			case ArtifactPackage.TASK__DYNAMIC_PRIORITY:
				setDynamic_priority(DYNAMIC_PRIORITY_EDEFAULT);
				return;
			case ArtifactPackage.TASK__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case ArtifactPackage.TASK__RELEASE_TIME:
				setRelease_time(RELEASE_TIME_EDEFAULT);
				return;
			case ArtifactPackage.TASK__CURRENT_CS:
				setCurrent_cs(CURRENT_CS_EDEFAULT);
				return;
			case ArtifactPackage.TASK__CRITICAL_SECTION:
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
			case ArtifactPackage.TASK__STATE:
				return state != STATE_EDEFAULT;
			case ArtifactPackage.TASK__TIMELEFT:
				return timeleft != TIMELEFT_EDEFAULT;
			case ArtifactPackage.TASK__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case ArtifactPackage.TASK__PERIOD:
				return period != PERIOD_EDEFAULT;
			case ArtifactPackage.TASK__DEADLINE:
				return deadline != DEADLINE_EDEFAULT;
			case ArtifactPackage.TASK__UTILISATION:
				return utilisation != UTILISATION_EDEFAULT;
			case ArtifactPackage.TASK__COMPUTATION_TIME:
				return computation_time != COMPUTATION_TIME_EDEFAULT;
			case ArtifactPackage.TASK__WCET_LOW:
				return wcet_low != WCET_LOW_EDEFAULT;
			case ArtifactPackage.TASK__CSTIME:
				return cstime != CSTIME_EDEFAULT;
			case ArtifactPackage.TASK__WCET_HIGH:
				return wcet_high != WCET_HIGH_EDEFAULT;
			case ArtifactPackage.TASK__CRITICALITY:
				return criticality != CRITICALITY_EDEFAULT;
			case ArtifactPackage.TASK__DYNAMIC_PRIORITY:
				return dynamic_priority != DYNAMIC_PRIORITY_EDEFAULT;
			case ArtifactPackage.TASK__OFFSET:
				return offset != OFFSET_EDEFAULT;
			case ArtifactPackage.TASK__RELEASE_TIME:
				return release_time != RELEASE_TIME_EDEFAULT;
			case ArtifactPackage.TASK__CURRENT_CS:
				return current_cs != CURRENT_CS_EDEFAULT;
			case ArtifactPackage.TASK__CRITICAL_SECTION:
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
		result.append(" (state: ");
		result.append(state);
		result.append(", timeleft: ");
		result.append(timeleft);
		result.append(", priority: ");
		result.append(priority);
		result.append(", period: ");
		result.append(period);
		result.append(", deadline: ");
		result.append(deadline);
		result.append(", utilisation: ");
		result.append(utilisation);
		result.append(", computation_time: ");
		result.append(computation_time);
		result.append(", wcet_low: ");
		result.append(wcet_low);
		result.append(", cstime: ");
		result.append(cstime);
		result.append(", wcet_high: ");
		result.append(wcet_high);
		result.append(", criticality: ");
		result.append(criticality);
		result.append(", dynamic_priority: ");
		result.append(dynamic_priority);
		result.append(", offset: ");
		result.append(offset);
		result.append(", release_time: ");
		result.append(release_time);
		result.append(", current_cs: ");
		result.append(current_cs);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
