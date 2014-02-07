/**
 */
package org.myModel.cSharp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.myModel.cSharp.Model#getTypies <em>Typies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.myModel.cSharp.CSharpPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Typies</b></em>' containment reference list.
   * The list contents are of type {@link org.myModel.cSharp.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typies</em>' containment reference list.
   * @see org.myModel.cSharp.CSharpPackage#getModel_Typies()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypies();

} // Model
