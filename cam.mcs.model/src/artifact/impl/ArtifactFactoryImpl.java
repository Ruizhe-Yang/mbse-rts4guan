/**
 */
package artifact.impl;

import artifact.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactFactoryImpl extends EFactoryImpl implements ArtifactFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArtifactFactory init() {
		try {
			ArtifactFactory theArtifactFactory = (ArtifactFactory)EPackage.Registry.INSTANCE.getEFactory(ArtifactPackage.eNS_URI);
			if (theArtifactFactory != null) {
				return theArtifactFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArtifactFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArtifactPackage.CORE: return createCore();
			case ArtifactPackage.MC_SYSTEM: return createMCSystem();
			case ArtifactPackage.TASK: return createTask();
			case ArtifactPackage.CRITICAL_SECTION: return createCriticalSection();
			case ArtifactPackage.SEMAPHORE: return createSemaphore();
			case ArtifactPackage.TASK_SET: return createTaskSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ArtifactPackage.STATUS:
				return createStatusFromString(eDataType, initialValue);
			case ArtifactPackage.CRITICALITY:
				return createCriticalityFromString(eDataType, initialValue);
			case ArtifactPackage.WORKING_STATE:
				return createWorkingStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ArtifactPackage.STATUS:
				return convertStatusToString(eDataType, instanceValue);
			case ArtifactPackage.CRITICALITY:
				return convertCriticalityToString(eDataType, instanceValue);
			case ArtifactPackage.WORKING_STATE:
				return convertWorkingStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Core createCore() {
		CoreImpl core = new CoreImpl();
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCSystem createMCSystem() {
		MCSystemImpl mcSystem = new MCSystemImpl();
		return mcSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CriticalSection createCriticalSection() {
		CriticalSectionImpl criticalSection = new CriticalSectionImpl();
		return criticalSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semaphore createSemaphore() {
		SemaphoreImpl semaphore = new SemaphoreImpl();
		return semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskSet createTaskSet() {
		TaskSetImpl taskSet = new TaskSetImpl();
		return taskSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Criticality createCriticalityFromString(EDataType eDataType, String initialValue) {
		Criticality result = Criticality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCriticalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkingState createWorkingStateFromString(EDataType eDataType, String initialValue) {
		WorkingState result = WorkingState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkingStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactPackage getArtifactPackage() {
		return (ArtifactPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArtifactPackage getPackage() {
		return ArtifactPackage.eINSTANCE;
	}

} //ArtifactFactoryImpl
