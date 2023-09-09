/**
 */
package mcs.impl;

import base.BasePackage;

import base.impl.BasePackageImpl;

import mcs.Core;
import mcs.CriticalSection;
import mcs.Criticality;
import mcs.MCSElement;
import mcs.MCSystem;
import mcs.McsFactory;
import mcs.McsPackage;
import mcs.Semaphore;
import mcs.Status;
import mcs.Task;
import mcs.WorkingState;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class McsPackageImpl extends EPackageImpl implements McsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mcsElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mcSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criticalSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum criticalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workingStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mcs.McsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private McsPackageImpl() {
		super(eNS_URI, McsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link McsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static McsPackage init() {
		if (isInited) return (McsPackage)EPackage.Registry.INSTANCE.getEPackage(McsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMcsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		McsPackageImpl theMcsPackage = registeredMcsPackage instanceof McsPackageImpl ? (McsPackageImpl)registeredMcsPackage : new McsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		BasePackageImpl theBasePackage = (BasePackageImpl)(registeredPackage instanceof BasePackageImpl ? registeredPackage : BasePackage.eINSTANCE);

		// Create package meta-data objects
		theMcsPackage.createPackageContents();
		theBasePackage.createPackageContents();

		// Initialize created meta-data
		theMcsPackage.initializePackageContents();
		theBasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMcsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(McsPackage.eNS_URI, theMcsPackage);
		return theMcsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMCSElement() {
		return mcsElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCore() {
		return coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCore_Time() {
		return (EAttribute)coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCore_Locked() {
		return (EAttribute)coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCore_Current_task() {
		return (EReference)coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMCSystem() {
		return mcSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMCSystem_Ceiling_priority() {
		return (EAttribute)mcSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMCSystem_Status() {
		return (EAttribute)mcSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMCSystem_Tasks() {
		return (EReference)mcSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMCSystem_Critical_sections() {
		return (EReference)mcSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMCSystem_Core() {
		return (EReference)mcSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_IsMandatory() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_State() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Timeleft() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Priority() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Period() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Deadline() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Utilisation() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Wcet_low() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Cstime() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Wcet_high() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Criticality() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Dynamic_priority() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Critical_section() {
		return (EReference)taskEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCriticalSection() {
		return criticalSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriticalSection_Criticality() {
		return (EAttribute)criticalSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriticalSection_Ceiling_priority() {
		return (EAttribute)criticalSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriticalSection_Locked() {
		return (EAttribute)criticalSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCriticalSection_Tasks() {
		return (EReference)criticalSectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCriticality() {
		return criticalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWorkingState() {
		return workingStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public McsFactory getMcsFactory() {
		return (McsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mcsElementEClass = createEClass(MCS_ELEMENT);

		mcSystemEClass = createEClass(MC_SYSTEM);
		createEAttribute(mcSystemEClass, MC_SYSTEM__CEILING_PRIORITY);
		createEAttribute(mcSystemEClass, MC_SYSTEM__STATUS);
		createEReference(mcSystemEClass, MC_SYSTEM__TASKS);
		createEReference(mcSystemEClass, MC_SYSTEM__CRITICAL_SECTIONS);
		createEReference(mcSystemEClass, MC_SYSTEM__CORE);

		coreEClass = createEClass(CORE);
		createEAttribute(coreEClass, CORE__TIME);
		createEAttribute(coreEClass, CORE__LOCKED);
		createEReference(coreEClass, CORE__CURRENT_TASK);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__UTILISATION);
		createEAttribute(taskEClass, TASK__PERIOD);
		createEAttribute(taskEClass, TASK__DEADLINE);
		createEAttribute(taskEClass, TASK__WCET_LOW);
		createEAttribute(taskEClass, TASK__WCET_HIGH);
		createEAttribute(taskEClass, TASK__CSTIME);
		createEAttribute(taskEClass, TASK__PRIORITY);
		createEAttribute(taskEClass, TASK__DYNAMIC_PRIORITY);
		createEAttribute(taskEClass, TASK__TIMELEFT);
		createEAttribute(taskEClass, TASK__IS_MANDATORY);
		createEAttribute(taskEClass, TASK__CRITICALITY);
		createEAttribute(taskEClass, TASK__STATE);
		createEReference(taskEClass, TASK__CRITICAL_SECTION);

		criticalSectionEClass = createEClass(CRITICAL_SECTION);
		createEAttribute(criticalSectionEClass, CRITICAL_SECTION__CEILING_PRIORITY);
		createEAttribute(criticalSectionEClass, CRITICAL_SECTION__LOCKED);
		createEAttribute(criticalSectionEClass, CRITICAL_SECTION__CRITICALITY);
		createEReference(criticalSectionEClass, CRITICAL_SECTION__TASKS);

		// Create enums
		statusEEnum = createEEnum(STATUS);
		criticalityEEnum = createEEnum(CRITICALITY);
		workingStateEEnum = createEEnum(WORKING_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mcsElementEClass.getESuperTypes().add(theBasePackage.getArtifactElement());
		mcSystemEClass.getESuperTypes().add(this.getMCSElement());
		coreEClass.getESuperTypes().add(this.getMCSElement());
		taskEClass.getESuperTypes().add(this.getMCSElement());
		criticalSectionEClass.getESuperTypes().add(this.getMCSElement());

		// Initialize classes and features; add operations and parameters
		initEClass(mcsElementEClass, MCSElement.class, "MCSElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mcSystemEClass, MCSystem.class, "MCSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMCSystem_Ceiling_priority(), ecorePackage.getEInt(), "ceiling_priority", null, 0, 1, MCSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCSystem_Status(), this.getStatus(), "status", null, 0, 1, MCSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCSystem_Tasks(), this.getTask(), null, "tasks", null, 0, -1, MCSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCSystem_Critical_sections(), this.getCriticalSection(), null, "critical_sections", null, 0, -1, MCSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCSystem_Core(), this.getCore(), null, "core", null, 0, 1, MCSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreEClass, Core.class, "Core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCore_Time(), ecorePackage.getEInt(), "time", null, 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCore_Locked(), ecorePackage.getEBoolean(), "locked", null, 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCore_Current_task(), this.getTask(), null, "current_task", null, 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Utilisation(), ecorePackage.getEDouble(), "utilisation", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Period(), ecorePackage.getEInt(), "period", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Deadline(), ecorePackage.getEInt(), "deadline", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Wcet_low(), ecorePackage.getEInt(), "wcet_low", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Wcet_high(), ecorePackage.getEInt(), "wcet_high", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Cstime(), ecorePackage.getEInt(), "cstime", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Dynamic_priority(), ecorePackage.getEInt(), "dynamic_priority", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Timeleft(), ecorePackage.getEInt(), "timeleft", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_IsMandatory(), ecorePackage.getEBoolean(), "IsMandatory", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Criticality(), this.getCriticality(), "criticality", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_State(), this.getWorkingState(), "state", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Critical_section(), this.getCriticalSection(), null, "critical_section", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(criticalSectionEClass, CriticalSection.class, "CriticalSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCriticalSection_Ceiling_priority(), ecorePackage.getEInt(), "ceiling_priority", null, 0, 1, CriticalSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriticalSection_Locked(), ecorePackage.getEBoolean(), "locked", null, 0, 1, CriticalSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriticalSection_Criticality(), this.getCriticality(), "criticality", null, 0, 1, CriticalSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCriticalSection_Tasks(), this.getTask(), null, "tasks", null, 0, -1, CriticalSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.LOW);
		addEEnumLiteral(statusEEnum, Status.MCP);
		addEEnumLiteral(statusEEnum, Status.HIGH);

		initEEnum(criticalityEEnum, Criticality.class, "Criticality");
		addEEnumLiteral(criticalityEEnum, Criticality.LO);
		addEEnumLiteral(criticalityEEnum, Criticality.HI);

		initEEnum(workingStateEEnum, WorkingState.class, "WorkingState");
		addEEnumLiteral(workingStateEEnum, WorkingState.UNSTART);
		addEEnumLiteral(workingStateEEnum, WorkingState.WORKING);
		addEEnumLiteral(workingStateEEnum, WorkingState.HANGING);

		// Create resource
		createResource(eNS_URI);
	}

} //McsPackageImpl
