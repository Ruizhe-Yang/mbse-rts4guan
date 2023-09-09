/**
 */
package mcs;

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
 * @see mcs.McsFactory
 * @model kind="package"
 * @generated
 */
public interface McsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mcs";

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
	String eNS_PREFIX = "mcs_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	McsPackage eINSTANCE = mcs.impl.McsPackageImpl.init();

	/**
	 * The meta object id for the '{@link mcs.impl.MCSElementImpl <em>MCS Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcs.impl.MCSElementImpl
	 * @see mcs.impl.McsPackageImpl#getMCSElement()
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
	 * The meta object id for the '{@link mcs.impl.CoreImpl <em>Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcs.impl.CoreImpl
	 * @see mcs.impl.McsPackageImpl#getCore()
	 * @generated
	 */
	int CORE = 2;

	/**
	 * The meta object id for the '{@link mcs.impl.MCSystemImpl <em>MC System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcs.impl.MCSystemImpl
	 * @see mcs.impl.McsPackageImpl#getMCSystem()
	 * @generated
	 */
	int MC_SYSTEM = 1;

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
	 * The feature id for the '<em><b>Ceiling priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__CEILING_PRIORITY = MCS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__STATUS = MCS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__TASKS = MCS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Critical sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__CRITICAL_SECTIONS = MCS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM__CORE = MCS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MC System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_SYSTEM_FEATURE_COUNT = MCS_ELEMENT_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__LOCKED = MCS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__CURRENT_TASK = MCS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_COUNT = MCS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mcs.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcs.impl.TaskImpl
	 * @see mcs.impl.McsPackageImpl#getTask()
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
	 * The feature id for the '<em><b>Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__UTILISATION = MCS_ELEMENT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Wcet low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__WCET_LOW = MCS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Wcet high</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__WCET_HIGH = MCS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cstime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CSTIME = MCS_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRIORITY = MCS_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dynamic priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DYNAMIC_PRIORITY = MCS_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Timeleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TIMELEFT = MCS_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_MANDATORY = MCS_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CRITICALITY = MCS_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATE = MCS_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Critical section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CRITICAL_SECTION = MCS_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = MCS_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link mcs.impl.CriticalSectionImpl <em>Critical Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcs.impl.CriticalSectionImpl
	 * @see mcs.impl.McsPackageImpl#getCriticalSection()
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
	 * The feature id for the '<em><b>Ceiling priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__CEILING_PRIORITY = MCS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__LOCKED = MCS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__CRITICALITY = MCS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION__TASKS = MCS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Critical Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_SECTION_FEATURE_COUNT = MCS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mcs.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcs.Status
	 * @see mcs.impl.McsPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 5;

	/**
	 * The meta object id for the '{@link mcs.Criticality <em>Criticality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcs.Criticality
	 * @see mcs.impl.McsPackageImpl#getCriticality()
	 * @generated
	 */
	int CRITICALITY = 6;

	/**
	 * The meta object id for the '{@link mcs.WorkingState <em>Working State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcs.WorkingState
	 * @see mcs.impl.McsPackageImpl#getWorkingState()
	 * @generated
	 */
	int WORKING_STATE = 7;


	/**
	 * Returns the meta object for class '{@link mcs.MCSElement <em>MCS Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MCS Element</em>'.
	 * @see mcs.MCSElement
	 * @generated
	 */
	EClass getMCSElement();

	/**
	 * Returns the meta object for class '{@link mcs.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core</em>'.
	 * @see mcs.Core
	 * @generated
	 */
	EClass getCore();

	/**
	 * Returns the meta object for the attribute '{@link mcs.Core#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see mcs.Core#getTime()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Time();

	/**
	 * Returns the meta object for the attribute '{@link mcs.Core#isLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see mcs.Core#isLocked()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Locked();

	/**
	 * Returns the meta object for the reference '{@link mcs.Core#getCurrent_task <em>Current task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current task</em>'.
	 * @see mcs.Core#getCurrent_task()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_Current_task();

	/**
	 * Returns the meta object for class '{@link mcs.MCSystem <em>MC System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MC System</em>'.
	 * @see mcs.MCSystem
	 * @generated
	 */
	EClass getMCSystem();

	/**
	 * Returns the meta object for the attribute '{@link mcs.MCSystem#getCeiling_priority <em>Ceiling priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ceiling priority</em>'.
	 * @see mcs.MCSystem#getCeiling_priority()
	 * @see #getMCSystem()
	 * @generated
	 */
	EAttribute getMCSystem_Ceiling_priority();

	/**
	 * Returns the meta object for the attribute '{@link mcs.MCSystem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see mcs.MCSystem#getStatus()
	 * @see #getMCSystem()
	 * @generated
	 */
	EAttribute getMCSystem_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link mcs.MCSystem#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see mcs.MCSystem#getTasks()
	 * @see #getMCSystem()
	 * @generated
	 */
	EReference getMCSystem_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link mcs.MCSystem#getCritical_sections <em>Critical sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Critical sections</em>'.
	 * @see mcs.MCSystem#getCritical_sections()
	 * @see #getMCSystem()
	 * @generated
	 */
	EReference getMCSystem_Critical_sections();

	/**
	 * Returns the meta object for the containment reference '{@link mcs.MCSystem#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Core</em>'.
	 * @see mcs.MCSystem#getCore()
	 * @see #getMCSystem()
	 * @generated
	 */
	EReference getMCSystem_Core();

	/**
	 * Returns the meta object for class '{@link mcs.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see mcs.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link mcs.Task#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see mcs.Task#isIsMandatory()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_IsMandatory();

	/**
	 * Returns the meta object for the attribute '{@link mcs.Task#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see mcs.Task#getState()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_State();

	/**
	 * Returns the meta object for the attribute '{@link mcs.Task#getTimeleft <em>Timeleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeleft</em>'.
	 * @see mcs.Task#getTimeleft()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Timeleft();

	/**
	 * Returns the meta object for the attribute '{@link mcs.Task#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see mcs.Task#getPriority()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Priority();

	/**
	 * Returns the meta object for the attribute '{@link mcs.Task#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see mcs.Task#getPeriod()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Period();

	/**
	 * Returns the meta object for the attribute '{@link mcs.Task#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see mcs.Task#getDeadline()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link mcs.Task#getUtilisation <em>Utilisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilisation</em>'.
	 * @see mcs.Task#getUtilisation()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Utilisation();

	/**
	 * Returns the meta object for the attribute '{@link mcs.Task#getWcet_low <em>Wcet low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcet low</em>'.
	 * @see mcs.Task#getWcet_low()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Wcet_low();

	/**
	 * Returns the meta object for the attribute '{@link mcs.Task#getCstime <em>Cstime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cstime</em>'.
	 * @see mcs.Task#getCstime()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Cstime();

	/**
	 * Returns the meta object for the attribute '{@link mcs.Task#getWcet_high <em>Wcet high</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcet high</em>'.
	 * @see mcs.Task#getWcet_high()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Wcet_high();

	/**
	 * Returns the meta object for the attribute '{@link mcs.Task#getCriticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality</em>'.
	 * @see mcs.Task#getCriticality()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Criticality();

	/**
	 * Returns the meta object for the attribute '{@link mcs.Task#getDynamic_priority <em>Dynamic priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic priority</em>'.
	 * @see mcs.Task#getDynamic_priority()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Dynamic_priority();

	/**
	 * Returns the meta object for the reference '{@link mcs.Task#getCritical_section <em>Critical section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Critical section</em>'.
	 * @see mcs.Task#getCritical_section()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Critical_section();

	/**
	 * Returns the meta object for class '{@link mcs.CriticalSection <em>Critical Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Critical Section</em>'.
	 * @see mcs.CriticalSection
	 * @generated
	 */
	EClass getCriticalSection();

	/**
	 * Returns the meta object for the attribute '{@link mcs.CriticalSection#getCriticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality</em>'.
	 * @see mcs.CriticalSection#getCriticality()
	 * @see #getCriticalSection()
	 * @generated
	 */
	EAttribute getCriticalSection_Criticality();

	/**
	 * Returns the meta object for the attribute '{@link mcs.CriticalSection#getCeiling_priority <em>Ceiling priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ceiling priority</em>'.
	 * @see mcs.CriticalSection#getCeiling_priority()
	 * @see #getCriticalSection()
	 * @generated
	 */
	EAttribute getCriticalSection_Ceiling_priority();

	/**
	 * Returns the meta object for the attribute '{@link mcs.CriticalSection#isLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see mcs.CriticalSection#isLocked()
	 * @see #getCriticalSection()
	 * @generated
	 */
	EAttribute getCriticalSection_Locked();

	/**
	 * Returns the meta object for the reference list '{@link mcs.CriticalSection#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see mcs.CriticalSection#getTasks()
	 * @see #getCriticalSection()
	 * @generated
	 */
	EReference getCriticalSection_Tasks();

	/**
	 * Returns the meta object for enum '{@link mcs.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see mcs.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link mcs.Criticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Criticality</em>'.
	 * @see mcs.Criticality
	 * @generated
	 */
	EEnum getCriticality();

	/**
	 * Returns the meta object for enum '{@link mcs.WorkingState <em>Working State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Working State</em>'.
	 * @see mcs.WorkingState
	 * @generated
	 */
	EEnum getWorkingState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	McsFactory getMcsFactory();

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
		 * The meta object literal for the '{@link mcs.impl.MCSElementImpl <em>MCS Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcs.impl.MCSElementImpl
		 * @see mcs.impl.McsPackageImpl#getMCSElement()
		 * @generated
		 */
		EClass MCS_ELEMENT = eINSTANCE.getMCSElement();

		/**
		 * The meta object literal for the '{@link mcs.impl.CoreImpl <em>Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcs.impl.CoreImpl
		 * @see mcs.impl.McsPackageImpl#getCore()
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
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__LOCKED = eINSTANCE.getCore_Locked();

		/**
		 * The meta object literal for the '<em><b>Current task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE__CURRENT_TASK = eINSTANCE.getCore_Current_task();

		/**
		 * The meta object literal for the '{@link mcs.impl.MCSystemImpl <em>MC System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcs.impl.MCSystemImpl
		 * @see mcs.impl.McsPackageImpl#getMCSystem()
		 * @generated
		 */
		EClass MC_SYSTEM = eINSTANCE.getMCSystem();

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
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MC_SYSTEM__TASKS = eINSTANCE.getMCSystem_Tasks();

		/**
		 * The meta object literal for the '<em><b>Critical sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MC_SYSTEM__CRITICAL_SECTIONS = eINSTANCE.getMCSystem_Critical_sections();

		/**
		 * The meta object literal for the '<em><b>Core</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MC_SYSTEM__CORE = eINSTANCE.getMCSystem_Core();

		/**
		 * The meta object literal for the '{@link mcs.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcs.impl.TaskImpl
		 * @see mcs.impl.McsPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IS_MANDATORY = eINSTANCE.getTask_IsMandatory();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__STATE = eINSTANCE.getTask_State();

		/**
		 * The meta object literal for the '<em><b>Timeleft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TIMELEFT = eINSTANCE.getTask_Timeleft();

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
		 * The meta object literal for the '<em><b>Wcet low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__WCET_LOW = eINSTANCE.getTask_Wcet_low();

		/**
		 * The meta object literal for the '<em><b>Cstime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__CSTIME = eINSTANCE.getTask_Cstime();

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
		 * The meta object literal for the '<em><b>Critical section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__CRITICAL_SECTION = eINSTANCE.getTask_Critical_section();

		/**
		 * The meta object literal for the '{@link mcs.impl.CriticalSectionImpl <em>Critical Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcs.impl.CriticalSectionImpl
		 * @see mcs.impl.McsPackageImpl#getCriticalSection()
		 * @generated
		 */
		EClass CRITICAL_SECTION = eINSTANCE.getCriticalSection();

		/**
		 * The meta object literal for the '<em><b>Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_SECTION__CRITICALITY = eINSTANCE.getCriticalSection_Criticality();

		/**
		 * The meta object literal for the '<em><b>Ceiling priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_SECTION__CEILING_PRIORITY = eINSTANCE.getCriticalSection_Ceiling_priority();

		/**
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_SECTION__LOCKED = eINSTANCE.getCriticalSection_Locked();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITICAL_SECTION__TASKS = eINSTANCE.getCriticalSection_Tasks();

		/**
		 * The meta object literal for the '{@link mcs.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcs.Status
		 * @see mcs.impl.McsPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link mcs.Criticality <em>Criticality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcs.Criticality
		 * @see mcs.impl.McsPackageImpl#getCriticality()
		 * @generated
		 */
		EEnum CRITICALITY = eINSTANCE.getCriticality();

		/**
		 * The meta object literal for the '{@link mcs.WorkingState <em>Working State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcs.WorkingState
		 * @see mcs.impl.McsPackageImpl#getWorkingState()
		 * @generated
		 */
		EEnum WORKING_STATE = eINSTANCE.getWorkingState();

	}

} //McsPackage
