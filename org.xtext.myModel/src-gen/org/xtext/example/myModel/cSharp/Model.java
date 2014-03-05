/**
 */
package org.xtext.example.myModel.cSharp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.myModel.cSharp.Model#isInputs <em>Inputs</em>}</li>
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
   * Returns the value of the '<em><b>Inputs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' attribute.
   * @see #setInputs(boolean)
   * @see org.xtext.example.myModel.cSharp.CSharpPackage#getModel_Inputs()
   * @model
   * @generated
   */
  boolean isInputs();

  /**
   * Sets the value of the '{@link org.xtext.example.myModel.cSharp.Model#isInputs <em>Inputs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inputs</em>' attribute.
   * @see #isInputs()
   * @generated
   */
  void setInputs(boolean value);

} // Model
