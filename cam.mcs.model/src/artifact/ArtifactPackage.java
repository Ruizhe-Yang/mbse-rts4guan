/**
 */
package artifact;

import base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see artifact.ArtifactFactory
 * @model kind="package"
 * @generated
 */
public interface ArtifactPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "artifact";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cam.mcs.model/mcs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "artifact_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArtifactPackage eINSTANCE = artifact.impl.ArtifactPackageImpl.init();

	/**
	 * The meta object id for the '{@link artifact.impl.MCSElementImpl <em>MCS Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.MCSElementImpl
	 * @see artifact.impl.ArtifactPackageImpl#getMCSElement()
	 * @generated
	 */
	int MCS_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCS_ELEMENT__GID = BasePackage.ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCS_ELEMENT__IS_CITATION = BasePackage.ARTIFACT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCS_ELEMENT__IS_ABSTRACT = BasePackage.ARTIFACT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCS_ELEMENT__CITED_ELEMENT = BasePackage.ARTIFACT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCS_ELEMENT__NAME = BasePackage.ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCS_ELEMENT__DESCRIPTION = BasePackage.ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCS_ELEMENT__IMPLEMENTATION_CONSTRAINT = BasePackage.ARTIFACT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCS_ELEMENT__NOTE = BasePackage.ARTIFACT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCS_ELEMENT__TAGGED_VALUE = BasePackage.ARTIFACT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCS_ELEMENT__EXTERNAL_REFERENCE = BasePackage.ARTIFACT_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The number of structural features of the '<em>MCS Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCS_ELEMENT_FEATURE_COUNT = BasePackage.ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link artifact.impl.CoreImpl <em>Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.CoreImpl
	 * @see artifact.impl.ArtifactPackageImpl#getCore()
	 * @generated
	 */
	int CORE = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__GID = MCS_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__IS_CITATION = MCS_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__IS_ABSTRACT = MCS_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__CITED_ELEMENT = MCS_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__NAME = MCS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__DESCRIPTION = MCS_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__IMPLEMENTATION_CONSTRAINT = MCS_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__NOTE = MCS_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__TAGGED_VALUE = MCS_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__EXTERNAL_REFERENCE = MCS_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__TIME = MCS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__CURRENT_TASK = MCS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__QUEUE = MCS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_COUNT = MCS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link artifact.impl.MCSystemImpl <em>MC System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.MCSystemImpl
	 * @see artifact.impl.ArtifactPackageImpl#getMCSystem()
	 * @generated
	 */
	int MC_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__GID = MCS_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__IS_CITATION = MCS_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__IS_ABSTRACT = MCS_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__CITED_ELEMENT = MCS_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__NAME = MCS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__DESCRIPTION = MCS_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__IMPLEMENTATION_CONSTRAINT = MCS_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__NOTE = MCS_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__TAGGED_VALUE = MCS_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__EXTERNAL_REFERENCE = MCS_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__CRITICALITY = MCS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ceiling priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__CEILING_PRIORITY = MCS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__STATUS = MCS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__RESOURCES = MCS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__TASKS = MCS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__CORE = MCS_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Task Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__TASK_SET = MCS_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>MC System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM_FEATURE_COUNT = MCS_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link artifact.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.TaskImpl
	 * @see artifact.impl.ArtifactPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 3;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__GID = MCS_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_CITATION = MCS_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_ABSTRACT = MCS_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CITED_ELEMENT = MCS_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = MCS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = MCS_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPLEMENTATION_CONSTRAINT = MCS_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NOTE = MCS_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TAGGED_VALUE = MCS_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXTERNAL_REFERENCE = MCS_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRIORITY = MCS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PERIOD = MCS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEADLINE = MCS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__UTILISATION = MCS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Computation time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__COMPUTATION_TIME = MCS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Wcet low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__WCET_LOW = MCS_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Wcet high</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__WCET_HIGH = MCS_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CRITICALITY = MCS_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dynamic priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DYNAMIC_PRIORITY = MCS_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OFFSET = MCS_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Release time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RELEASE_TIME = MCS_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Current cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CURRENT_CS = MCS_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Critical sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CRITICAL_SECTIONS = MCS_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = MCS_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link artifact.impl.CriticalSectionImpl <em>Critical Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.CriticalSectionImpl
	 * @see artifact.impl.ArtifactPackageImpl#getCriticalSection()
	 * @generated
	 */
	int CRITICAL_SECTION = 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__GID = MCS_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__IS_CITATION = MCS_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__IS_ABSTRACT = MCS_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__CITED_ELEMENT = MCS_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__NAME = MCS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__DESCRIPTION = MCS_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__IMPLEMENTATION_CONSTRAINT = MCS_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__NOTE = MCS_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__TAGGED_VALUE = MCS_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__EXTERNAL_REFERENCE = MCS_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__START = MCS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__EXECUTION = MCS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__ELAPSED = MCS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Semaphore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__SEMAPHORE = MCS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Critical Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION_FEATURE_COUNT = MCS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link artifact.impl.SemaphoreImpl <em>Semaphore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.SemaphoreImpl
	 * @see artifact.impl.ArtifactPackageImpl#getSemaphore()
	 * @generated
	 */
	int SEMAPHORE = 5;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__GID = MCS_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__IS_CITATION = MCS_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__IS_ABSTRACT = MCS_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__CITED_ELEMENT = MCS_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__NAME = MCS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__DESCRIPTION = MCS_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__IMPLEMENTATION_CONSTRAINT = MCS_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__NOTE = MCS_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__TAGGED_VALUE = MCS_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__EXTERNAL_REFERENCE = MCS_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__LOCKED = MCS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__INITIAL_PRIORITY = MCS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ceiling priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__CEILING_PRIORITY = MCS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Acquisition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__ACQUISITION = MCS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Semaphore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_FEATURE_COUNT = MCS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link artifact.impl.TaskSetImpl <em>Task Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.impl.TaskSetImpl
	 * @see artifact.impl.ArtifactPackageImpl#getTaskSet()
	 * @generated
	 */
	int TASK_SET = 6;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__GID = MCS_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__IS_CITATION = MCS_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__IS_ABSTRACT = MCS_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__CITED_ELEMENT = MCS_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__NAME = MCS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__DESCRIPTION = MCS_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__IMPLEMENTATION_CONSTRAINT = MCS_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__NOTE = MCS_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__TAGGED_VALUE = MCS_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__EXTERNAL_REFERENCE = MCS_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Task number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__TASK_NUMBER = MCS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__U = MCS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__TASKS = MCS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET_FEATURE_COUNT = MCS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link artifact.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.Status
	 * @see artifact.impl.ArtifactPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 7;

	/**
	 * The meta object id for the '{@link artifact.Criticality <em>Criticality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see artifact.Criticality
	 * @see artifact.impl.ArtifactPackageImpl#getCriticality()
	 * @generated
	 */
	int CRITICALITY = 8;


	/**
	 * Returns the meta object for class '{@link artifact.MCSElement <em>MCS Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MCS Element</em>'.
	 * @see artifact.MCSElement
	 * @generated
	 */
	EClass getMCSElement();

	/**
	 * Returns the meta object for class '{@link artifact.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core</em>'.
	 * @see artifact.Core
	 * @generated
	 */
	EClass getCore();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Core#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see artifact.Core#getTime()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Time();

	/**
	 * Returns the meta object for the reference '{@link artifact.Core#getCurrent_task <em>Current task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current task</em>'.
	 * @see artifact.Core#getCurrent_task()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_Current_task();

	/**
	 * Returns the meta object for the reference list '{@link artifact.Core#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Queue</em>'.
	 * @see artifact.Core#getQueue()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_Queue();

	/**
	 * Returns the meta object for class '{@link artifact.MCSystem <em>MC System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MC System</em>'.
	 * @see artifact.MCSystem
	 * @generated
	 */
	EClass getMCSystem();

	/**
	 * Returns the meta object for the attribute '{@link artifact.MCSystem#getCriticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality</em>'.
	 * @see artifact.MCSystem#getCriticality()
	 * @see #getMCSystem()
	 * @generated
	 */
	EAttribute getMCSystem_Criticality();

	/**
	 * Returns the meta object for the attribute '{@link artifact.MCSystem#getCeiling_priority <em>Ceiling priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ceiling priority</em>'.
	 * @see artifact.MCSystem#getCeiling_priority()
	 * @see #getMCSystem()
	 * @generated
	 */
	EAttribute getMCSystem_Ceiling_priority();

	/**
	 * Returns the meta object for the attribute '{@link artifact.MCSystem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see artifact.MCSystem#getStatus()
	 * @see #getMCSystem()
	 * @generated
	 */
	EAttribute getMCSystem_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link artifact.MCSystem#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see artifact.MCSystem#getResources()
	 * @see #getMCSystem()
	 * @generated
	 */
	EReference getMCSystem_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link artifact.MCSystem#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see artifact.MCSystem#getTasks()
	 * @see #getMCSystem()
	 * @generated
	 */
	EReference getMCSystem_Tasks();

	/**
	 * Returns the meta object for the containment reference '{@link artifact.MCSystem#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Core</em>'.
	 * @see artifact.MCSystem#getCore()
	 * @see #getMCSystem()
	 * @generated
	 */
	EReference getMCSystem_Core();

	/**
	 * Returns the meta object for the containment reference '{@link artifact.MCSystem#getTaskSet <em>Task Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Set</em>'.
	 * @see artifact.MCSystem#getTaskSet()
	 * @see #getMCSystem()
	 * @generated
	 */
	EReference getMCSystem_TaskSet();

	/**
	 * Returns the meta object for class '{@link artifact.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see artifact.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Task#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see artifact.Task#getPriority()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Priority();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Task#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see artifact.Task#getPeriod()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Period();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Task#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see artifact.Task#getDeadline()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Task#getUtilisation <em>Utilisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilisation</em>'.
	 * @see artifact.Task#getUtilisation()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Utilisation();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Task#getComputation_time <em>Computation time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computation time</em>'.
	 * @see artifact.Task#getComputation_time()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Computation_time();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Task#getWcet_low <em>Wcet low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcet low</em>'.
	 * @see artifact.Task#getWcet_low()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Wcet_low();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Task#getWcet_high <em>Wcet high</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcet high</em>'.
	 * @see artifact.Task#getWcet_high()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Wcet_high();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Task#getCriticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality</em>'.
	 * @see artifact.Task#getCriticality()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Criticality();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Task#getDynamic_priority <em>Dynamic priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic priority</em>'.
	 * @see artifact.Task#getDynamic_priority()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Dynamic_priority();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Task#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see artifact.Task#getOffset()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Offset();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Task#getRelease_time <em>Release time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release time</em>'.
	 * @see artifact.Task#getRelease_time()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Release_time();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Task#getCurrent_cs <em>Current cs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current cs</em>'.
	 * @see artifact.Task#getCurrent_cs()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Current_cs();

	/**
	 * Returns the meta object for the containment reference list '{@link artifact.Task#getCritical_sections <em>Critical sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Critical sections</em>'.
	 * @see artifact.Task#getCritical_sections()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Critical_sections();

	/**
	 * Returns the meta object for class '{@link artifact.CriticalSection <em>Critical Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Critical Section</em>'.
	 * @see artifact.CriticalSection
	 * @generated
	 */
	EClass getCriticalSection();

	/**
	 * Returns the meta object for the attribute '{@link artifact.CriticalSection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see artifact.CriticalSection#getStart()
	 * @see #getCriticalSection()
	 * @generated
	 */
	EAttribute getCriticalSection_Start();

	/**
	 * Returns the meta object for the attribute '{@link artifact.CriticalSection#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution</em>'.
	 * @see artifact.CriticalSection#getExecution()
	 * @see #getCriticalSection()
	 * @generated
	 */
	EAttribute getCriticalSection_Execution();

	/**
	 * Returns the meta object for the attribute '{@link artifact.CriticalSection#getElapsed <em>Elapsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elapsed</em>'.
	 * @see artifact.CriticalSection#getElapsed()
	 * @see #getCriticalSection()
	 * @generated
	 */
	EAttribute getCriticalSection_Elapsed();

	/**
	 * Returns the meta object for the reference '{@link artifact.CriticalSection#getSemaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semaphore</em>'.
	 * @see artifact.CriticalSection#getSemaphore()
	 * @see #getCriticalSection()
	 * @generated
	 */
	EReference getCriticalSection_Semaphore();

	/**
	 * Returns the meta object for class '{@link artifact.Semaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semaphore</em>'.
	 * @see artifact.Semaphore
	 * @generated
	 */
	EClass getSemaphore();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Semaphore#isLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see artifact.Semaphore#isLocked()
	 * @see #getSemaphore()
	 * @generated
	 */
	EAttribute getSemaphore_Locked();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Semaphore#getInitial_priority <em>Initial priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial priority</em>'.
	 * @see artifact.Semaphore#getInitial_priority()
	 * @see #getSemaphore()
	 * @generated
	 */
	EAttribute getSemaphore_Initial_priority();

	/**
	 * Returns the meta object for the attribute '{@link artifact.Semaphore#getCeiling_priority <em>Ceiling priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ceiling priority</em>'.
	 * @see artifact.Semaphore#getCeiling_priority()
	 * @see #getSemaphore()
	 * @generated
	 */
	EAttribute getSemaphore_Ceiling_priority();

	/**
	 * Returns the meta object for the reference '{@link artifact.Semaphore#getAcquisition <em>Acquisition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acquisition</em>'.
	 * @see artifact.Semaphore#getAcquisition()
	 * @see #getSemaphore()
	 * @generated
	 */
	EReference getSemaphore_Acquisition();

	/**
	 * Returns the meta object for class '{@link artifact.TaskSet <em>Task Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Set</em>'.
	 * @see artifact.TaskSet
	 * @generated
	 */
	EClass getTaskSet();

	/**
	 * Returns the meta object for the attribute '{@link artifact.TaskSet#getTask_number <em>Task number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task number</em>'.
	 * @see artifact.TaskSet#getTask_number()
	 * @see #getTaskSet()
	 * @generated
	 */
	EAttribute getTaskSet_Task_number();

	/**
	 * Returns the meta object for the attribute '{@link artifact.TaskSet#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>U</em>'.
	 * @see artifact.TaskSet#getU()
	 * @see #getTaskSet()
	 * @generated
	 */
	EAttribute getTaskSet_U();

	/**
	 * Returns the meta object for the containment reference list '{@link artifact.TaskSet#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see artifact.TaskSet#getTasks()
	 * @see #getTaskSet()
	 * @generated
	 */
	EReference getTaskSet_Tasks();

	/**
	 * Returns the meta object for enum '{@link artifact.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see artifact.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link artifact.Criticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Criticality</em>'.
	 * @see artifact.Criticality
	 * @generated
	 */
	EEnum getCriticality();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArtifactFactory getArtifactFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link artifact.impl.MCSElementImpl <em>MCS Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.MCSElementImpl
		 * @see artifact.impl.ArtifactPackageImpl#getMCSElement()
		 * @generated
		 */
		EClass MCS_ELEMENT = eINSTANCE.getMCSElement();

		/**
		 * The meta object literal for the '{@link artifact.impl.CoreImpl <em>Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.CoreImpl
		 * @see artifact.impl.ArtifactPackageImpl#getCore()
		 * @generated
		 */
		EClass CORE = eINSTANCE.getCore();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__TIME = eINSTANCE.getCore_Time();

		/**
		 * The meta object literal for the '<em><b>Current task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE__CURRENT_TASK = eINSTANCE.getCore_Current_task();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE__QUEUE = eINSTANCE.getCore_Queue();

		/**
		 * The meta object literal for the '{@link artifact.impl.MCSystemImpl <em>MC System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.MCSystemImpl
		 * @see artifact.impl.ArtifactPackageImpl#getMCSystem()
		 * @generated
		 */
		EClass MC_SYSTEM = eINSTANCE.getMCSystem();

		/**
		 * The meta object literal for the '<em><b>Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MC_SYSTEM__CRITICALITY = eINSTANCE.getMCSystem_Criticality();

		/**
		 * The meta object literal for the '<em><b>Ceiling priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MC_SYSTEM__CEILING_PRIORITY = eINSTANCE.getMCSystem_Ceiling_priority();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MC_SYSTEM__STATUS = eINSTANCE.getMCSystem_Status();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MC_SYSTEM__RESOURCES = eINSTANCE.getMCSystem_Resources();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MC_SYSTEM__TASKS = eINSTANCE.getMCSystem_Tasks();

		/**
		 * The meta object literal for the '<em><b>Core</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MC_SYSTEM__CORE = eINSTANCE.getMCSystem_Core();

		/**
		 * The meta object literal for the '<em><b>Task Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MC_SYSTEM__TASK_SET = eINSTANCE.getMCSystem_TaskSet();

		/**
		 * The meta object literal for the '{@link artifact.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.TaskImpl
		 * @see artifact.impl.ArtifactPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PRIORITY = eINSTANCE.getTask_Priority();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PERIOD = eINSTANCE.getTask_Period();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DEADLINE = eINSTANCE.getTask_Deadline();

		/**
		 * The meta object literal for the '<em><b>Utilisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__UTILISATION = eINSTANCE.getTask_Utilisation();

		/**
		 * The meta object literal for the '<em><b>Computation time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__COMPUTATION_TIME = eINSTANCE.getTask_Computation_time();

		/**
		 * The meta object literal for the '<em><b>Wcet low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__WCET_LOW = eINSTANCE.getTask_Wcet_low();

		/**
		 * The meta object literal for the '<em><b>Wcet high</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__WCET_HIGH = eINSTANCE.getTask_Wcet_high();

		/**
		 * The meta object literal for the '<em><b>Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__CRITICALITY = eINSTANCE.getTask_Criticality();

		/**
		 * The meta object literal for the '<em><b>Dynamic priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DYNAMIC_PRIORITY = eINSTANCE.getTask_Dynamic_priority();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__OFFSET = eINSTANCE.getTask_Offset();

		/**
		 * The meta object literal for the '<em><b>Release time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__RELEASE_TIME = eINSTANCE.getTask_Release_time();

		/**
		 * The meta object literal for the '<em><b>Current cs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__CURRENT_CS = eINSTANCE.getTask_Current_cs();

		/**
		 * The meta object literal for the '<em><b>Critical sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__CRITICAL_SECTIONS = eINSTANCE.getTask_Critical_sections();

		/**
		 * The meta object literal for the '{@link artifact.impl.CriticalSectionImpl <em>Critical Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.CriticalSectionImpl
		 * @see artifact.impl.ArtifactPackageImpl#getCriticalSection()
		 * @generated
		 */
		EClass CRITICAL_SECTION = eINSTANCE.getCriticalSection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_SECTION__START = eINSTANCE.getCriticalSection_Start();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_SECTION__EXECUTION = eINSTANCE.getCriticalSection_Execution();

		/**
		 * The meta object literal for the '<em><b>Elapsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_SECTION__ELAPSED = eINSTANCE.getCriticalSection_Elapsed();

		/**
		 * The meta object literal for the '<em><b>Semaphore</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITICAL_SECTION__SEMAPHORE = eINSTANCE.getCriticalSection_Semaphore();

		/**
		 * The meta object literal for the '{@link artifact.impl.SemaphoreImpl <em>Semaphore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.SemaphoreImpl
		 * @see artifact.impl.ArtifactPackageImpl#getSemaphore()
		 * @generated
		 */
		EClass SEMAPHORE = eINSTANCE.getSemaphore();

		/**
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMAPHORE__LOCKED = eINSTANCE.getSemaphore_Locked();

		/**
		 * The meta object literal for the '<em><b>Initial priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMAPHORE__INITIAL_PRIORITY = eINSTANCE.getSemaphore_Initial_priority();

		/**
		 * The meta object literal for the '<em><b>Ceiling priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMAPHORE__CEILING_PRIORITY = eINSTANCE.getSemaphore_Ceiling_priority();

		/**
		 * The meta object literal for the '<em><b>Acquisition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMAPHORE__ACQUISITION = eINSTANCE.getSemaphore_Acquisition();

		/**
		 * The meta object literal for the '{@link artifact.impl.TaskSetImpl <em>Task Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.impl.TaskSetImpl
		 * @see artifact.impl.ArtifactPackageImpl#getTaskSet()
		 * @generated
		 */
		EClass TASK_SET = eINSTANCE.getTaskSet();

		/**
		 * The meta object literal for the '<em><b>Task number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_SET__TASK_NUMBER = eINSTANCE.getTaskSet_Task_number();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_SET__U = eINSTANCE.getTaskSet_U();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_SET__TASKS = eINSTANCE.getTaskSet_Tasks();

		/**
		 * The meta object literal for the '{@link artifact.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.Status
		 * @see artifact.impl.ArtifactPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link artifact.Criticality <em>Criticality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see artifact.Criticality
		 * @see artifact.impl.ArtifactPackageImpl#getCriticality()
		 * @generated
		 */
		EEnum CRITICALITY = eINSTANCE.getCriticality();

	}

} //ArtifactPackage
