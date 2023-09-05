/**
 */
package base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utility Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.UtilityElement#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see base.BasePackage#getUtilityElement()
 * @model abstract="true"
 * @generated
 */
public interface UtilityElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see base.BasePackage#getUtilityElement_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link base.UtilityElement#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // UtilityElement
