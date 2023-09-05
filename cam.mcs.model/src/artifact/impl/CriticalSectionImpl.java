/**
 */
package artifact.impl;

import artifact.ArtifactPackage;
import artifact.CriticalSection;
import artifact.Semaphore;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Critical Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link artifact.impl.CriticalSectionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link artifact.impl.CriticalSectionImpl#getExecution <em>Execution</em>}</li>
 *   <li>{@link artifact.impl.CriticalSectionImpl#getElapsed <em>Elapsed</em>}</li>
 *   <li>{@link artifact.impl.CriticalSectionImpl#getSemaphore <em>Semaphore</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CriticalSectionImpl extends MCSElementImpl implements CriticalSection {
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected int start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecution() <em>Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected static final int EXECUTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExecution() <em>Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected int execution = EXECUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getElapsed() <em>Elapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsed()
	 * @generated
	 * @ordered
	 */
	protected static final int ELAPSED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElapsed() <em>Elapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsed()
	 * @generated
	 * @ordered
	 */
	protected int elapsed = ELAPSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemaphore() <em>Semaphore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphore()
	 * @generated
	 * @ordered
	 */
	protected Semaphore semaphore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriticalSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtifactPackage.Literals.CRITICAL_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(int newStart) {
		int oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.CRITICAL_SECTION__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExecution() {
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecution(int newExecution) {
		int oldExecution = execution;
		execution = newExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.CRITICAL_SECTION__EXECUTION, oldExecution, execution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getElapsed() {
		return elapsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElapsed(int newElapsed) {
		int oldElapsed = elapsed;
		elapsed = newElapsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.CRITICAL_SECTION__ELAPSED, oldElapsed, elapsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semaphore getSemaphore() {
		if (semaphore != null && semaphore.eIsProxy()) {
			InternalEObject oldSemaphore = (InternalEObject)semaphore;
			semaphore = (Semaphore)eResolveProxy(oldSemaphore);
			if (semaphore != oldSemaphore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArtifactPackage.CRITICAL_SECTION__SEMAPHORE, oldSemaphore, semaphore));
			}
		}
		return semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaphore basicGetSemaphore() {
		return semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemaphore(Semaphore newSemaphore) {
		Semaphore oldSemaphore = semaphore;
		semaphore = newSemaphore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.CRITICAL_SECTION__SEMAPHORE, oldSemaphore, semaphore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArtifactPackage.CRITICAL_SECTION__START:
				return getStart();
			case ArtifactPackage.CRITICAL_SECTION__EXECUTION:
				return getExecution();
			case ArtifactPackage.CRITICAL_SECTION__ELAPSED:
				return getElapsed();
			case ArtifactPackage.CRITICAL_SECTION__SEMAPHORE:
				if (resolve) return getSemaphore();
				return basicGetSemaphore();
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
			case ArtifactPackage.CRITICAL_SECTION__START:
				setStart((Integer)newValue);
				return;
			case ArtifactPackage.CRITICAL_SECTION__EXECUTION:
				setExecution((Integer)newValue);
				return;
			case ArtifactPackage.CRITICAL_SECTION__ELAPSED:
				setElapsed((Integer)newValue);
				return;
			case ArtifactPackage.CRITICAL_SECTION__SEMAPHORE:
				setSemaphore((Semaphore)newValue);
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
			case ArtifactPackage.CRITICAL_SECTION__START:
				setStart(START_EDEFAULT);
				return;
			case ArtifactPackage.CRITICAL_SECTION__EXECUTION:
				setExecution(EXECUTION_EDEFAULT);
				return;
			case ArtifactPackage.CRITICAL_SECTION__ELAPSED:
				setElapsed(ELAPSED_EDEFAULT);
				return;
			case ArtifactPackage.CRITICAL_SECTION__SEMAPHORE:
				setSemaphore((Semaphore)null);
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
			case ArtifactPackage.CRITICAL_SECTION__START:
				return start != START_EDEFAULT;
			case ArtifactPackage.CRITICAL_SECTION__EXECUTION:
				return execution != EXECUTION_EDEFAULT;
			case ArtifactPackage.CRITICAL_SECTION__ELAPSED:
				return elapsed != ELAPSED_EDEFAULT;
			case ArtifactPackage.CRITICAL_SECTION__SEMAPHORE:
				return semaphore != null;
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
		result.append(" (start: ");
		result.append(start);
		result.append(", execution: ");
		result.append(execution);
		result.append(", elapsed: ");
		result.append(elapsed);
		result.append(')');
		return result.toString();
	}

} //CriticalSectionImpl
