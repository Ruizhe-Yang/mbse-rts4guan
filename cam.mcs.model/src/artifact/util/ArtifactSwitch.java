/**
 */
package artifact.util;

import artifact.*;

import base.ArtifactElement;
import base.Element;
import base.ModelElement;
import base.NamedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see artifact.ArtifactPackage
 * @generated
 */
public class ArtifactSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArtifactPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactSwitch() {
		if (modelPackage == null) {
			modelPackage = ArtifactPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArtifactPackage.MCS_ELEMENT: {
				MCSElement mcsElement = (MCSElement)theEObject;
				T result = caseMCSElement(mcsElement);
				if (result == null) result = caseArtifactElement(mcsElement);
				if (result == null) result = caseModelElement(mcsElement);
				if (result == null) result = caseNamedElement(mcsElement);
				if (result == null) result = caseElement(mcsElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtifactPackage.CORE: {
				Core core = (Core)theEObject;
				T result = caseCore(core);
				if (result == null) result = caseMCSElement(core);
				if (result == null) result = caseArtifactElement(core);
				if (result == null) result = caseModelElement(core);
				if (result == null) result = caseNamedElement(core);
				if (result == null) result = caseElement(core);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtifactPackage.MC_SYSTEM: {
				MCSystem mcSystem = (MCSystem)theEObject;
				T result = caseMCSystem(mcSystem);
				if (result == null) result = caseMCSElement(mcSystem);
				if (result == null) result = caseArtifactElement(mcSystem);
				if (result == null) result = caseModelElement(mcSystem);
				if (result == null) result = caseNamedElement(mcSystem);
				if (result == null) result = caseElement(mcSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtifactPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseMCSElement(task);
				if (result == null) result = caseArtifactElement(task);
				if (result == null) result = caseModelElement(task);
				if (result == null) result = caseNamedElement(task);
				if (result == null) result = caseElement(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtifactPackage.CRITICAL_SECTION: {
				CriticalSection criticalSection = (CriticalSection)theEObject;
				T result = caseCriticalSection(criticalSection);
				if (result == null) result = caseMCSElement(criticalSection);
				if (result == null) result = caseArtifactElement(criticalSection);
				if (result == null) result = caseModelElement(criticalSection);
				if (result == null) result = caseNamedElement(criticalSection);
				if (result == null) result = caseElement(criticalSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtifactPackage.SEMAPHORE: {
				Semaphore semaphore = (Semaphore)theEObject;
				T result = caseSemaphore(semaphore);
				if (result == null) result = caseMCSElement(semaphore);
				if (result == null) result = caseArtifactElement(semaphore);
				if (result == null) result = caseModelElement(semaphore);
				if (result == null) result = caseNamedElement(semaphore);
				if (result == null) result = caseElement(semaphore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtifactPackage.TASK_SET: {
				TaskSet taskSet = (TaskSet)theEObject;
				T result = caseTaskSet(taskSet);
				if (result == null) result = caseMCSElement(taskSet);
				if (result == null) result = caseArtifactElement(taskSet);
				if (result == null) result = caseModelElement(taskSet);
				if (result == null) result = caseNamedElement(taskSet);
				if (result == null) result = caseElement(taskSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCS Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCS Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCSElement(MCSElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCore(Core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MC System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MC System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCSystem(MCSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Critical Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Critical Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriticalSection(CriticalSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semaphore</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semaphore</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemaphore(Semaphore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskSet(TaskSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactElement(ArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArtifactSwitch
