/**
 */
package org.xtext.example.myModel.cSharp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.xtext.example.myModel.cSharp.CSharpFactory
 * @model kind="package"
 * @generated
 */
public interface CSharpPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cSharp";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/myModel/CSharp";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cSharp";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CSharpPackage eINSTANCE = org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ModelImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__INPUTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.QualifiedIdentifierImpl <em>Qualified Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.QualifiedIdentifierImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getQualifiedIdentifier()
   * @generated
   */
  int QUALIFIED_IDENTIFIER = 1;

  /**
   * The number of structural features of the '<em>Qualified Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_IDENTIFIER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.IDImpl <em>ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.IDImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getID()
   * @generated
   */
  int ID = 2;

  /**
   * The number of structural features of the '<em>ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_FEATURE_COUNT = QUALIFIED_IDENTIFIER_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.myModel.cSharp.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.myModel.cSharp.Model#isInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inputs</em>'.
   * @see org.xtext.example.myModel.cSharp.Model#isInputs()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Inputs();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.QualifiedIdentifier <em>Qualified Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Identifier</em>'.
   * @see org.xtext.example.myModel.cSharp.QualifiedIdentifier
   * @generated
   */
  EClass getQualifiedIdentifier();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ID</em>'.
   * @see org.xtext.example.myModel.cSharp.ID
   * @generated
   */
  EClass getID();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CSharpFactory getCSharpFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ModelImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__INPUTS = eINSTANCE.getModel_Inputs();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.QualifiedIdentifierImpl <em>Qualified Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.QualifiedIdentifierImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getQualifiedIdentifier()
     * @generated
     */
    EClass QUALIFIED_IDENTIFIER = eINSTANCE.getQualifiedIdentifier();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.IDImpl <em>ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.IDImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getID()
     * @generated
     */
    EClass ID = eINSTANCE.getID();

  }

} //CSharpPackage