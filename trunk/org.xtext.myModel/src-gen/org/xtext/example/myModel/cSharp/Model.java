/**
 */
package org.xtext.example.myModel.cSharp;

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
 *   <li>{@link org.xtext.example.myModel.cSharp.Model#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.myModel.cSharp.CSharpPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' attribute list.
   * @see org.xtext.example.myModel.cSharp.CSharpPackage#getModel_Input()
   * @model unique="false"
   * @generated
   */
  EList<String> getInput();

} // Model
