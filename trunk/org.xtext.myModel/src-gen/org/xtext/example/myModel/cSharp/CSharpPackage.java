/**
 */
package org.xtext.example.myModel.cSharp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
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
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ConstructorDeclaratorImpl <em>Constructor Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ConstructorDeclaratorImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getConstructorDeclarator()
   * @generated
   */
  int CONSTRUCTOR_DECLARATOR = 28;

  /**
   * The number of structural features of the '<em>Constructor Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.IdentifierImpl <em>Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.IdentifierImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getIdentifier()
   * @generated
   */
  int IDENTIFIER = 1;

  /**
   * The feature id for the '<em><b>Formal List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__FORMAL_LIST = CONSTRUCTOR_DECLARATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Const Initializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__CONST_INITIALIZER = CONSTRUCTOR_DECLARATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_FEATURE_COUNT = CONSTRUCTOR_DECLARATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.CompilationUnitImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getCompilationUnit()
   * @generated
   */
  int COMPILATION_UNIT = 2;

  /**
   * The feature id for the '<em><b>Using Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__USING_DIRECTIVES = 0;

  /**
   * The feature id for the '<em><b>Global Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__GLOBAL_ATT = 1;

  /**
   * The feature id for the '<em><b>Name Spaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__NAME_SPACES = 2;

  /**
   * The number of structural features of the '<em>Compilation Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.NamespaceMemberDeclarationImpl <em>Namespace Member Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.NamespaceMemberDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getNamespaceMemberDeclaration()
   * @generated
   */
  int NAMESPACE_MEMBER_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Name Declaretion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_MEMBER_DECLARATION__NAME_DECLARETION = 0;

  /**
   * The feature id for the '<em><b>Type Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_MEMBER_DECLARATION__TYPE_DECLARATION = 1;

  /**
   * The number of structural features of the '<em>Namespace Member Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_MEMBER_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.NamespaceDeclarationImpl <em>Namespace Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.NamespaceDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getNamespaceDeclaration()
   * @generated
   */
  int NAMESPACE_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>QId</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION__QID = 0;

  /**
   * The feature id for the '<em><b>Name Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION__NAME_BODY = 1;

  /**
   * The number of structural features of the '<em>Namespace Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.NamespaceBodyImpl <em>Namespace Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.NamespaceBodyImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getNamespaceBody()
   * @generated
   */
  int NAMESPACE_BODY = 5;

  /**
   * The feature id for the '<em><b>Using Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_BODY__USING_DIRECTIVES = 0;

  /**
   * The feature id for the '<em><b>Name Spaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_BODY__NAME_SPACES = 1;

  /**
   * The number of structural features of the '<em>Namespace Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.StructMemberDeclarationsImpl <em>Struct Member Declarations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.StructMemberDeclarationsImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStructMemberDeclarations()
   * @generated
   */
  int STRUCT_MEMBER_DECLARATIONS = 19;

  /**
   * The number of structural features of the '<em>Struct Member Declarations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_MEMBER_DECLARATIONS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.StructMemberDeclarationImpl <em>Struct Member Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.StructMemberDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStructMemberDeclaration()
   * @generated
   */
  int STRUCT_MEMBER_DECLARATION = 21;

  /**
   * The feature id for the '<em><b>Struct Member2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_MEMBER_DECLARATION__STRUCT_MEMBER2 = STRUCT_MEMBER_DECLARATIONS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Struct Member Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_MEMBER_DECLARATION_FEATURE_COUNT = STRUCT_MEMBER_DECLARATIONS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.TypeDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getTypeDeclaration()
   * @generated
   */
  int TYPE_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Struct Member2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__STRUCT_MEMBER2 = STRUCT_MEMBER_DECLARATION__STRUCT_MEMBER2;

  /**
   * The feature id for the '<em><b>Class Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__CLASS_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mod</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__MOD = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Struct Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__STRUCT_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Interface Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__INTERFACE_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Enum Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__ENUM_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Delegate Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__DELEGATE_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION_FEATURE_COUNT = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.DelegateDeclarationImpl <em>Delegate Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.DelegateDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getDelegateDeclaration()
   * @generated
   */
  int DELEGATE_DECLARATION = 7;

  /**
   * The number of structural features of the '<em>Delegate Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELEGATE_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.EnumDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getEnumDeclaration()
   * @generated
   */
  int ENUM_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Int Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECLARATION__INT_TYPE = 1;

  /**
   * The feature id for the '<em><b>Enum Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECLARATION__ENUM_BODY = 2;

  /**
   * The number of structural features of the '<em>Enum Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.InterfaceDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfaceDeclaration()
   * @generated
   */
  int INTERFACE_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>QIdentifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__QIDENTIFIERS = 1;

  /**
   * The feature id for the '<em><b>Inter Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__INTER_BODY = 2;

  /**
   * The number of structural features of the '<em>Interface Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.InterfaceBodyImpl <em>Interface Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.InterfaceBodyImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfaceBody()
   * @generated
   */
  int INTERFACE_BODY = 10;

  /**
   * The feature id for the '<em><b>Interface Member Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_BODY__INTERFACE_MEMBER_DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Interface Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.InterfaceMemberDeclarationImpl <em>Interface Member Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.InterfaceMemberDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfaceMemberDeclaration()
   * @generated
   */
  int INTERFACE_MEMBER_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Intermethod Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_MEMBER_DECLARATION__INTERMETHOD_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Inter Event Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_MEMBER_DECLARATION__INTER_EVENT_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Type1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_MEMBER_DECLARATION__TYPE1 = 2;

  /**
   * The feature id for the '<em><b>Interface Indexer Decla</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_MEMBER_DECLARATION__INTERFACE_INDEXER_DECLA = 3;

  /**
   * The feature id for the '<em><b>Inter Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_MEMBER_DECLARATION__INTER_PROPERTY = 4;

  /**
   * The number of structural features of the '<em>Interface Member Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_MEMBER_DECLARATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.InterfaceIndexerDeclarationImpl <em>Interface Indexer Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.InterfaceIndexerDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfaceIndexerDeclaration()
   * @generated
   */
  int INTERFACE_INDEXER_DECLARATION = 12;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_INDEXER_DECLARATION__PARAMETER_LIST = 0;

  /**
   * The feature id for the '<em><b>Inter Accessors</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_INDEXER_DECLARATION__INTER_ACCESSORS = 1;

  /**
   * The number of structural features of the '<em>Interface Indexer Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_INDEXER_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.InterfaceEventDeclarationImpl <em>Interface Event Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.InterfaceEventDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfaceEventDeclaration()
   * @generated
   */
  int INTERFACE_EVENT_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_EVENT_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_EVENT_DECLARATION__NAME = 1;

  /**
   * The number of structural features of the '<em>Interface Event Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_EVENT_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.InterfacePropertyDeclarationImpl <em>Interface Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.InterfacePropertyDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfacePropertyDeclaration()
   * @generated
   */
  int INTERFACE_PROPERTY_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_PROPERTY_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Inter Accessor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_PROPERTY_DECLARATION__INTER_ACCESSOR = 1;

  /**
   * The number of structural features of the '<em>Interface Property Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_PROPERTY_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.InterfaceAccessorsImpl <em>Interface Accessors</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.InterfaceAccessorsImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfaceAccessors()
   * @generated
   */
  int INTERFACE_ACCESSORS = 15;

  /**
   * The feature id for the '<em><b>Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_ACCESSORS__ATT = 0;

  /**
   * The feature id for the '<em><b>New Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_ACCESSORS__NEW_ATT = 1;

  /**
   * The feature id for the '<em><b>Other Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_ACCESSORS__OTHER_ATT = 2;

  /**
   * The number of structural features of the '<em>Interface Accessors</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_ACCESSORS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.InterfaceMethodDeclarationImpl <em>Interface Method Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.InterfaceMethodDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfaceMethodDeclaration()
   * @generated
   */
  int INTERFACE_METHOD_DECLARATION = 16;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD_DECLARATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD_DECLARATION__PARAMETER_LIST = 2;

  /**
   * The number of structural features of the '<em>Interface Method Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.StructDeclarationImpl <em>Struct Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.StructDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStructDeclaration()
   * @generated
   */
  int STRUCT_DECLARATION = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Qual Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECLARATION__QUAL_ID = 1;

  /**
   * The feature id for the '<em><b>Structbody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECLARATION__STRUCTBODY = 2;

  /**
   * The number of structural features of the '<em>Struct Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.StructBodyImpl <em>Struct Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.StructBodyImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStructBody()
   * @generated
   */
  int STRUCT_BODY = 18;

  /**
   * The feature id for the '<em><b>Struct Member</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_BODY__STRUCT_MEMBER = 0;

  /**
   * The number of structural features of the '<em>Struct Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.StructMemberDeclarations2Impl <em>Struct Member Declarations2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.StructMemberDeclarations2Impl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStructMemberDeclarations2()
   * @generated
   */
  int STRUCT_MEMBER_DECLARATIONS2 = 20;

  /**
   * The number of structural features of the '<em>Struct Member Declarations2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_MEMBER_DECLARATIONS2_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ClassDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getClassDeclaration()
   * @generated
   */
  int CLASS_DECLARATION = 22;

  /**
   * The feature id for the '<em><b>Class Modifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__CLASS_MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__CLASS_NAME = 1;

  /**
   * The feature id for the '<em><b>Class Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__CLASS_BASE = 2;

  /**
   * The feature id for the '<em><b>Class Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__CLASS_BODY = 3;

  /**
   * The number of structural features of the '<em>Class Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ClassBodyImpl <em>Class Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ClassBodyImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getClassBody()
   * @generated
   */
  int CLASS_BODY = 23;

  /**
   * The feature id for the '<em><b>Class Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_BODY__CLASS_DECLARATION = 0;

  /**
   * The number of structural features of the '<em>Class Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ClassMemberDeclarationImpl <em>Class Member Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ClassMemberDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getClassMemberDeclaration()
   * @generated
   */
  int CLASS_MEMBER_DECLARATION = 24;

  /**
   * The feature id for the '<em><b>Class Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_DECLARATION__CLASS_ATT = 0;

  /**
   * The feature id for the '<em><b>Const Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_DECLARATION__CONST_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Field Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_DECLARATION__FIELD_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Property Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_DECLARATION__PROPERTY_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Event Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_DECLARATION__EVENT_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Index Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_DECLARATION__INDEX_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Op Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_DECLARATION__OP_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Constructor Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_DECLARATION__CONSTRUCTOR_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Destructor Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_DECLARATION__DESTRUCTOR_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Static Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_DECLARATION__STATIC_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Type Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_DECLARATION__TYPE_DECLARATION = 10;

  /**
   * The number of structural features of the '<em>Class Member Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_DECLARATION_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.StaticConstructorDeclarationImpl <em>Static Constructor Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.StaticConstructorDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStaticConstructorDeclaration()
   * @generated
   */
  int STATIC_CONSTRUCTOR_DECLARATION = 25;

  /**
   * The feature id for the '<em><b>Struct Member2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_CONSTRUCTOR_DECLARATION__STRUCT_MEMBER2 = STRUCT_MEMBER_DECLARATION__STRUCT_MEMBER2;

  /**
   * The feature id for the '<em><b>Static Cosnt Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_CONSTRUCTOR_DECLARATION__STATIC_COSNT_MODIFIER = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_CONSTRUCTOR_DECLARATION__NAME = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Empty Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_CONSTRUCTOR_DECLARATION__EMPTY_BLOCK = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Static Constructor Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_CONSTRUCTOR_DECLARATION_FEATURE_COUNT = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.DestructorDeclarationImpl <em>Destructor Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.DestructorDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getDestructorDeclaration()
   * @generated
   */
  int DESTRUCTOR_DECLARATION = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESTRUCTOR_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Empty Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESTRUCTOR_DECLARATION__EMPTY_BLOCK = 1;

  /**
   * The number of structural features of the '<em>Destructor Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESTRUCTOR_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ConstructorDeclarationImpl <em>Constructor Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ConstructorDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getConstructorDeclaration()
   * @generated
   */
  int CONSTRUCTOR_DECLARATION = 27;

  /**
   * The feature id for the '<em><b>Struct Member2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__STRUCT_MEMBER2 = STRUCT_MEMBER_DECLARATION__STRUCT_MEMBER2;

  /**
   * The feature id for the '<em><b>Const Modifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__CONST_MODIFIER = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constr Declarator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__CONSTR_DECLARATOR = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Empty Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__EMPTY_BLOCK = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Constructor Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION_FEATURE_COUNT = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ConstructorInitializerImpl <em>Constructor Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ConstructorInitializerImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getConstructorInitializer()
   * @generated
   */
  int CONSTRUCTOR_INITIALIZER = 29;

  /**
   * The number of structural features of the '<em>Constructor Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_INITIALIZER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ArgumentListImpl <em>Argument List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ArgumentListImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getArgumentList()
   * @generated
   */
  int ARGUMENT_LIST = 30;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_LIST__ARG = CONSTRUCTOR_INITIALIZER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Argument List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_LIST_FEATURE_COUNT = CONSTRUCTOR_INITIALIZER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ArgumentImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 31;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.OperatorDeclarationImpl <em>Operator Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.OperatorDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getOperatorDeclaration()
   * @generated
   */
  int OPERATOR_DECLARATION = 32;

  /**
   * The feature id for the '<em><b>Struct Member2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_DECLARATION__STRUCT_MEMBER2 = STRUCT_MEMBER_DECLARATION__STRUCT_MEMBER2;

  /**
   * The feature id for the '<em><b>Op Modifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_DECLARATION__OP_MODIFIER = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op Declarator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_DECLARATION__OP_DECLARATOR = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Empty Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_DECLARATION__EMPTY_BLOCK = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operator Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_DECLARATION_FEATURE_COUNT = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.OperatorDeclaratorImpl <em>Operator Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.OperatorDeclaratorImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getOperatorDeclarator()
   * @generated
   */
  int OPERATOR_DECLARATOR = 33;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_DECLARATOR__TYPE = 0;

  /**
   * The number of structural features of the '<em>Operator Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_DECLARATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ConversionOperatorDeclaratorImpl <em>Conversion Operator Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ConversionOperatorDeclaratorImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getConversionOperatorDeclarator()
   * @generated
   */
  int CONVERSION_OPERATOR_DECLARATOR = 34;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERSION_OPERATOR_DECLARATOR__TYPE = OPERATOR_DECLARATOR__TYPE;

  /**
   * The feature id for the '<em><b>First Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERSION_OPERATOR_DECLARATOR__FIRST_TYPE = OPERATOR_DECLARATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conversion Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERSION_OPERATOR_DECLARATOR__CONVERSION_NAME = OPERATOR_DECLARATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Conversion Operator Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERSION_OPERATOR_DECLARATOR_FEATURE_COUNT = OPERATOR_DECLARATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.BinaryOperatorDeclaratorImpl <em>Binary Operator Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.BinaryOperatorDeclaratorImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getBinaryOperatorDeclarator()
   * @generated
   */
  int BINARY_OPERATOR_DECLARATOR = 35;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATOR_DECLARATOR__TYPE = OPERATOR_DECLARATOR__TYPE;

  /**
   * The feature id for the '<em><b>Bin Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATOR_DECLARATOR__BIN_TYPE = OPERATOR_DECLARATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Over Bin Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATOR_DECLARATOR__OVER_BIN_OPERATOR = OPERATOR_DECLARATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Other Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATOR_DECLARATOR__OTHER_NAME = OPERATOR_DECLARATOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Second Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATOR_DECLARATOR__SECOND_TYPE = OPERATOR_DECLARATOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Second Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATOR_DECLARATOR__SECOND_NAME = OPERATOR_DECLARATOR_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Binary Operator Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATOR_DECLARATOR_FEATURE_COUNT = OPERATOR_DECLARATOR_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.UnaryOperatorDeclaratorImpl <em>Unary Operator Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.UnaryOperatorDeclaratorImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getUnaryOperatorDeclarator()
   * @generated
   */
  int UNARY_OPERATOR_DECLARATOR = 36;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATOR_DECLARATOR__TYPE = OPERATOR_DECLARATOR__TYPE;

  /**
   * The feature id for the '<em><b>Other Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATOR_DECLARATOR__OTHER_TYPE = OPERATOR_DECLARATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATOR_DECLARATOR__NAME = OPERATOR_DECLARATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Operator Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATOR_DECLARATOR_FEATURE_COUNT = OPERATOR_DECLARATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.IndexerDeclarationImpl <em>Indexer Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.IndexerDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getIndexerDeclaration()
   * @generated
   */
  int INDEXER_DECLARATION = 37;

  /**
   * The feature id for the '<em><b>Struct Member2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXER_DECLARATION__STRUCT_MEMBER2 = STRUCT_MEMBER_DECLARATION__STRUCT_MEMBER2;

  /**
   * The feature id for the '<em><b>Id Modifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXER_DECLARATION__ID_MODIFIER = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Indexer Declarator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXER_DECLARATION__INDEXER_DECLARATOR = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Acc Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXER_DECLARATION__ACC_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Indexer Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXER_DECLARATION_FEATURE_COUNT = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.IndexerDeclaratorImpl <em>Indexer Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.IndexerDeclaratorImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getIndexerDeclarator()
   * @generated
   */
  int INDEXER_DECLARATOR = 38;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXER_DECLARATOR__TYPE = 0;

  /**
   * The feature id for the '<em><b>Formal List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXER_DECLARATOR__FORMAL_LIST = 1;

  /**
   * The feature id for the '<em><b>Qualified Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXER_DECLARATOR__QUALIFIED_ID = 2;

  /**
   * The number of structural features of the '<em>Indexer Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXER_DECLARATOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.EventDeclarationImpl <em>Event Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.EventDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getEventDeclaration()
   * @generated
   */
  int EVENT_DECLARATION = 39;

  /**
   * The feature id for the '<em><b>Struct Member2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECLARATION__STRUCT_MEMBER2 = STRUCT_MEMBER_DECLARATION__STRUCT_MEMBER2;

  /**
   * The number of structural features of the '<em>Event Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECLARATION_FEATURE_COUNT = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.EventAccessorDeclarationsImpl <em>Event Accessor Declarations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.EventAccessorDeclarationsImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getEventAccessorDeclarations()
   * @generated
   */
  int EVENT_ACCESSOR_DECLARATIONS = 40;

  /**
   * The feature id for the '<em><b>Att1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_ACCESSOR_DECLARATIONS__ATT1 = 0;

  /**
   * The feature id for the '<em><b>Add Accessor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_ACCESSOR_DECLARATIONS__ADD_ACCESSOR = 1;

  /**
   * The feature id for the '<em><b>Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_ACCESSOR_DECLARATIONS__ATT = 2;

  /**
   * The feature id for the '<em><b>Remov Accessor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_ACCESSOR_DECLARATIONS__REMOV_ACCESSOR = 3;

  /**
   * The number of structural features of the '<em>Event Accessor Declarations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_ACCESSOR_DECLARATIONS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.RemoveAccessorDeclarationImpl <em>Remove Accessor Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.RemoveAccessorDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getRemoveAccessorDeclaration()
   * @generated
   */
  int REMOVE_ACCESSOR_DECLARATION = 41;

  /**
   * The number of structural features of the '<em>Remove Accessor Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_ACCESSOR_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.AddAccessorDeclarationImpl <em>Add Accessor Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.AddAccessorDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAddAccessorDeclaration()
   * @generated
   */
  int ADD_ACCESSOR_DECLARATION = 42;

  /**
   * The number of structural features of the '<em>Add Accessor Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_ACCESSOR_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.PropertyDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getPropertyDeclaration()
   * @generated
   */
  int PROPERTY_DECLARATION = 43;

  /**
   * The feature id for the '<em><b>Struct Member2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION__STRUCT_MEMBER2 = STRUCT_MEMBER_DECLARATION__STRUCT_MEMBER2;

  /**
   * The number of structural features of the '<em>Property Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION_FEATURE_COUNT = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.AccessorDeclarationsImpl <em>Accessor Declarations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.AccessorDeclarationsImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAccessorDeclarations()
   * @generated
   */
  int ACCESSOR_DECLARATIONS = 44;

  /**
   * The feature id for the '<em><b>Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESSOR_DECLARATIONS__ATT = 0;

  /**
   * The feature id for the '<em><b>Get Acc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESSOR_DECLARATIONS__GET_ACC = 1;

  /**
   * The feature id for the '<em><b>Att2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESSOR_DECLARATIONS__ATT2 = 2;

  /**
   * The feature id for the '<em><b>Set Acc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESSOR_DECLARATIONS__SET_ACC = 3;

  /**
   * The number of structural features of the '<em>Accessor Declarations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESSOR_DECLARATIONS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.SetAccessorDeclarationImpl <em>Set Accessor Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.SetAccessorDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getSetAccessorDeclaration()
   * @generated
   */
  int SET_ACCESSOR_DECLARATION = 45;

  /**
   * The number of structural features of the '<em>Set Accessor Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_ACCESSOR_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.GetAccessorDeclarationImpl <em>Get Accessor Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.GetAccessorDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getGetAccessorDeclaration()
   * @generated
   */
  int GET_ACCESSOR_DECLARATION = 46;

  /**
   * The number of structural features of the '<em>Get Accessor Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_ACCESSOR_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.MethodDeclarationImpl <em>Method Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.MethodDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getMethodDeclaration()
   * @generated
   */
  int METHOD_DECLARATION = 47;

  /**
   * The feature id for the '<em><b>Struct Member2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__STRUCT_MEMBER2 = STRUCT_MEMBER_DECLARATION__STRUCT_MEMBER2;

  /**
   * The feature id for the '<em><b>Class Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__CLASS_ATT = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Const Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__CONST_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Field Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__FIELD_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Property Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__PROPERTY_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Event Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__EVENT_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Index Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__INDEX_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Op Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__OP_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Constructor Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__CONSTRUCTOR_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Destructor Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__DESTRUCTOR_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Static Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__STATIC_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Type Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__TYPE_DECLARATION = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Method Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__METHOD_HEADER = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Maybe Empty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__MAYBE_EMPTY = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>Method Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION_FEATURE_COUNT = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 13;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.MethodHeaderImpl <em>Method Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.MethodHeaderImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getMethodHeader()
   * @generated
   */
  int METHOD_HEADER = 48;

  /**
   * The number of structural features of the '<em>Method Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_HEADER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.FormalParameterListImpl <em>Formal Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.FormalParameterListImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getFormalParameterList()
   * @generated
   */
  int FORMAL_PARAMETER_LIST = 49;

  /**
   * The number of structural features of the '<em>Formal Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ParameterArrayImpl <em>Parameter Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ParameterArrayImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getParameterArray()
   * @generated
   */
  int PARAMETER_ARRAY = 50;

  /**
   * The feature id for the '<em><b>Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ARRAY__ATT = 0;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ARRAY__ARRAY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ARRAY__NAME = 2;

  /**
   * The number of structural features of the '<em>Parameter Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ARRAY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.FixedParametersImpl <em>Fixed Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.FixedParametersImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getFixedParameters()
   * @generated
   */
  int FIXED_PARAMETERS = 51;

  /**
   * The feature id for the '<em><b>Parameter Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_PARAMETERS__PARAMETER_ARRAY = FORMAL_PARAMETER_LIST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fix Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_PARAMETERS__FIX_PARAMETERS = FORMAL_PARAMETER_LIST_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fixed Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_PARAMETERS_FEATURE_COUNT = FORMAL_PARAMETER_LIST_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.FixedParameterImpl <em>Fixed Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.FixedParameterImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getFixedParameter()
   * @generated
   */
  int FIXED_PARAMETER = 52;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_PARAMETER__NAME = 1;

  /**
   * The number of structural features of the '<em>Fixed Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.TypeOrVoidImpl <em>Type Or Void</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.TypeOrVoidImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getTypeOrVoid()
   * @generated
   */
  int TYPE_OR_VOID = 53;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OR_VOID__NAME = DELEGATE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OR_VOID__FORMAL_PARAMETERS = DELEGATE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OR_VOID__TYPE = DELEGATE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Type Or Void</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OR_VOID_FEATURE_COUNT = DELEGATE_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.FieldDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getFieldDeclaration()
   * @generated
   */
  int FIELD_DECLARATION = 54;

  /**
   * The feature id for the '<em><b>Struct Member2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__STRUCT_MEMBER2 = STRUCT_MEMBER_DECLARATION__STRUCT_MEMBER2;

  /**
   * The number of structural features of the '<em>Field Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION_FEATURE_COUNT = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.VariableDeclaratorImpl <em>Variable Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.VariableDeclaratorImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getVariableDeclarator()
   * @generated
   */
  int VARIABLE_DECLARATOR = 55;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR__VARIABLE = 1;

  /**
   * The number of structural features of the '<em>Variable Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.VariableInitializerImpl <em>Variable Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.VariableInitializerImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getVariableInitializer()
   * @generated
   */
  int VARIABLE_INITIALIZER = 56;

  /**
   * The number of structural features of the '<em>Variable Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_INITIALIZER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ArrayInitializerImpl <em>Array Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ArrayInitializerImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getArrayInitializer()
   * @generated
   */
  int ARRAY_INITIALIZER = 57;

  /**
   * The feature id for the '<em><b>Variable Initalizers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INITIALIZER__VARIABLE_INITALIZERS = VARIABLE_INITIALIZER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INITIALIZER_FEATURE_COUNT = VARIABLE_INITIALIZER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ConstantDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getConstantDeclaration()
   * @generated
   */
  int CONSTANT_DECLARATION = 58;

  /**
   * The feature id for the '<em><b>Struct Member2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION__STRUCT_MEMBER2 = STRUCT_MEMBER_DECLARATION__STRUCT_MEMBER2;

  /**
   * The number of structural features of the '<em>Constant Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION_FEATURE_COUNT = STRUCT_MEMBER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ConstantDeclaratorImpl <em>Constant Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ConstantDeclaratorImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getConstantDeclarator()
   * @generated
   */
  int CONSTANT_DECLARATOR = 59;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATOR__EXP = 1;

  /**
   * The number of structural features of the '<em>Constant Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ClassBaseImpl <em>Class Base</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ClassBaseImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getClassBase()
   * @generated
   */
  int CLASS_BASE = 60;

  /**
   * The number of structural features of the '<em>Class Base</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_BASE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.QualifiedIdentifierListImpl <em>Qualified Identifier List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.QualifiedIdentifierListImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getQualifiedIdentifierList()
   * @generated
   */
  int QUALIFIED_IDENTIFIER_LIST = 61;

  /**
   * The feature id for the '<em><b>Ids</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_IDENTIFIER_LIST__IDS = CLASS_BASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Qualified Identifier List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_IDENTIFIER_LIST_FEATURE_COUNT = CLASS_BASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.GlobalAttributesImpl <em>Global Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.GlobalAttributesImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getGlobalAttributes()
   * @generated
   */
  int GLOBAL_ATTRIBUTES = 62;

  /**
   * The feature id for the '<em><b>Global Att Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_ATTRIBUTES__GLOBAL_ATT_SECTIONS = 0;

  /**
   * The number of structural features of the '<em>Global Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_ATTRIBUTES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.GlobalAttributeSectionImpl <em>Global Attribute Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.GlobalAttributeSectionImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getGlobalAttributeSection()
   * @generated
   */
  int GLOBAL_ATTRIBUTE_SECTION = 63;

  /**
   * The number of structural features of the '<em>Global Attribute Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_ATTRIBUTE_SECTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.AttributesImpl <em>Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.AttributesImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAttributes()
   * @generated
   */
  int ATTRIBUTES = 64;

  /**
   * The feature id for the '<em><b>Type Or Void</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__TYPE_OR_VOID = METHOD_HEADER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qualified ID</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__QUALIFIED_ID = METHOD_HEADER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__FORMAL_PARAMETERS = METHOD_HEADER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__ATTRIBUTES = METHOD_HEADER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__TYPE = METHOD_HEADER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Enum Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__ENUM_BODY = METHOD_HEADER_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES_FEATURE_COUNT = METHOD_HEADER_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.AttributeSectionImpl <em>Attribute Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.AttributeSectionImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAttributeSection()
   * @generated
   */
  int ATTRIBUTE_SECTION = 65;

  /**
   * The number of structural features of the '<em>Attribute Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_SECTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.AttributeListImpl <em>Attribute List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.AttributeListImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAttributeList()
   * @generated
   */
  int ATTRIBUTE_LIST = 66;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_LIST__ATTRIBUTES = GLOBAL_ATTRIBUTE_SECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_LIST_FEATURE_COUNT = GLOBAL_ATTRIBUTE_SECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.AttributeImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 67;

  /**
   * The feature id for the '<em><b>Att Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATT_NAME = 0;

  /**
   * The feature id for the '<em><b>Att Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATT_ARGUMENTS = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.AttributeArgumentsImpl <em>Attribute Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.AttributeArgumentsImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAttributeArguments()
   * @generated
   */
  int ATTRIBUTE_ARGUMENTS = 68;

  /**
   * The feature id for the '<em><b>Expresions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_ARGUMENTS__EXPRESIONS = 0;

  /**
   * The number of structural features of the '<em>Attribute Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_ARGUMENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ExpressionListImpl <em>Expression List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ExpressionListImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getExpressionList()
   * @generated
   */
  int EXPRESSION_LIST = 69;

  /**
   * The feature id for the '<em><b>Expresions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__EXPRESIONS = 0;

  /**
   * The number of structural features of the '<em>Expression List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ExpressionImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 70;

  /**
   * The feature id for the '<em><b>Unary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__UNARY = ARGUMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXP2 = ARGUMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXP = ARGUMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Other Exp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OTHER_EXP2 = ARGUMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.Expression2Impl <em>Expression2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.Expression2Impl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getExpression2()
   * @generated
   */
  int EXPRESSION2 = 71;

  /**
   * The feature id for the '<em><b>Internal Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION2__INTERNAL_EXP = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION2__EXP = 1;

  /**
   * The feature id for the '<em><b>Internal Exp2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION2__INTERNAL_EXP2 = 2;

  /**
   * The feature id for the '<em><b>Build In Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION2__BUILD_IN_TYPE = 3;

  /**
   * The number of structural features of the '<em>Expression2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION2_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.UnaryExpressionImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 72;

  /**
   * The feature id for the '<em><b>Exp Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__EXP_UNARY_OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__UNARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Primary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__PRIMARY_EXP = 3;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.AttributeNameImpl <em>Attribute Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.AttributeNameImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAttributeName()
   * @generated
   */
  int ATTRIBUTE_NAME = 73;

  /**
   * The feature id for the '<em><b>Qualified Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__QUALIFIED_ID = 0;

  /**
   * The number of structural features of the '<em>Attribute Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.UsingDirectiveImpl <em>Using Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.UsingDirectiveImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getUsingDirective()
   * @generated
   */
  int USING_DIRECTIVE = 74;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_DIRECTIVE__NAME = 0;

  /**
   * The feature id for the '<em><b>Usings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_DIRECTIVE__USINGS = 1;

  /**
   * The number of structural features of the '<em>Using Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_DIRECTIVE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.TypeImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getType()
   * @generated
   */
  int TYPE = 75;

  /**
   * The feature id for the '<em><b>Struct Member2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__STRUCT_MEMBER2 = EVENT_DECLARATION__STRUCT_MEMBER2;

  /**
   * The feature id for the '<em><b>Variable Declarator</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__VARIABLE_DECLARATOR = EVENT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>QIdent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__QIDENT = EVENT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Event Accessor Declarations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__EVENT_ACCESSOR_DECLARATIONS = EVENT_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Qualified Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__QUALIFIED_ID = EVENT_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Acc Declarate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ACC_DECLARATE = EVENT_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__VARIABLES = EVENT_DECLARATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Const Declarators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__CONST_DECLARATORS = EVENT_DECLARATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Non Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NON_ARRAY = EVENT_DECLARATION_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = EVENT_DECLARATION_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.IntegralTypeImpl <em>Integral Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.IntegralTypeImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getIntegralType()
   * @generated
   */
  int INTEGRAL_TYPE = 76;

  /**
   * The number of structural features of the '<em>Integral Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRAL_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ArrayTypeImpl <em>Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ArrayTypeImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getArrayType()
   * @generated
   */
  int ARRAY_TYPE = 77;

  /**
   * The number of structural features of the '<em>Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.EnumTypeImpl <em>Enum Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.EnumTypeImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getEnumType()
   * @generated
   */
  int ENUM_TYPE = 78;

  /**
   * The number of structural features of the '<em>Enum Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.NonArrayTypeImpl <em>Non Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.NonArrayTypeImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getNonArrayType()
   * @generated
   */
  int NON_ARRAY_TYPE = 79;

  /**
   * The feature id for the '<em><b>Qualified</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_ARRAY_TYPE__QUALIFIED = ARRAY_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Built Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_ARRAY_TYPE__BUILT_TYPE = ARRAY_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Non Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_ARRAY_TYPE_FEATURE_COUNT = ARRAY_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.QualifiedIdentifierImpl <em>Qualified Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.QualifiedIdentifierImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getQualifiedIdentifier()
   * @generated
   */
  int QUALIFIED_IDENTIFIER = 80;

  /**
   * The feature id for the '<em><b>Ids</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_IDENTIFIER__IDS = 0;

  /**
   * The number of structural features of the '<em>Qualified Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_IDENTIFIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.BuiltInTypeImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getBuiltInType()
   * @generated
   */
  int BUILT_IN_TYPE = 81;

  /**
   * The number of structural features of the '<em>Built In Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.EnumBodyImpl <em>Enum Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.EnumBodyImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getEnumBody()
   * @generated
   */
  int ENUM_BODY = 82;

  /**
   * The feature id for the '<em><b>Enum Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_BODY__ENUM_DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Enum Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.EnumMemberDeclarationImpl <em>Enum Member Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.EnumMemberDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getEnumMemberDeclaration()
   * @generated
   */
  int ENUM_MEMBER_DECLARATION = 83;

  /**
   * The feature id for the '<em><b>Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER_DECLARATION__ATT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER_DECLARATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER_DECLARATION__EXP = 2;

  /**
   * The number of structural features of the '<em>Enum Member Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.StatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 84;

  /**
   * The feature id for the '<em><b>Label Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__LABEL_STAT = 0;

  /**
   * The feature id for the '<em><b>Declare Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__DECLARE_STAT = 1;

  /**
   * The feature id for the '<em><b>Embedded Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EMBEDDED_STAT = 2;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.DeclarationStatmentImpl <em>Declaration Statment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.DeclarationStatmentImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getDeclarationStatment()
   * @generated
   */
  int DECLARATION_STATMENT = 85;

  /**
   * The feature id for the '<em><b>Local Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_STATMENT__LOCAL_VARIABLE_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Local COnstant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_STATMENT__LOCAL_CONSTANT = 1;

  /**
   * The number of structural features of the '<em>Declaration Statment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_STATMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.LocalconstantDeclarationImpl <em>Localconstant Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.LocalconstantDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getLocalconstantDeclaration()
   * @generated
   */
  int LOCALCONSTANT_DECLARATION = 86;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCALCONSTANT_DECLARATION__TIPO = 0;

  /**
   * The feature id for the '<em><b>Const Declarator</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCALCONSTANT_DECLARATION__CONST_DECLARATOR = 1;

  /**
   * The number of structural features of the '<em>Localconstant Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCALCONSTANT_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.LabeledStatementImpl <em>Labeled Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.LabeledStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getLabeledStatement()
   * @generated
   */
  int LABELED_STATEMENT = 87;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_STATEMENT__ID = 0;

  /**
   * The feature id for the '<em><b>Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_STATEMENT__STAT = 1;

  /**
   * The number of structural features of the '<em>Labeled Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.EmbeddedStatementImpl <em>Embedded Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.EmbeddedStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getEmbeddedStatement()
   * @generated
   */
  int EMBEDDED_STATEMENT = 88;

  /**
   * The feature id for the '<em><b>Maybe Empty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_STATEMENT__MAYBE_EMPTY = 0;

  /**
   * The feature id for the '<em><b>Stat Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_STATEMENT__STAT_EXP = 1;

  /**
   * The feature id for the '<em><b>Selection Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_STATEMENT__SELECTION_STAT = 2;

  /**
   * The feature id for the '<em><b>Iteration Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_STATEMENT__ITERATION_STAT = 3;

  /**
   * The feature id for the '<em><b>Jump Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_STATEMENT__JUMP_STAT = 4;

  /**
   * The feature id for the '<em><b>Try Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_STATEMENT__TRY_STAT = 5;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_STATEMENT__BLOCK = 6;

  /**
   * The feature id for the '<em><b>Lock Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_STATEMENT__LOCK_STAT = 7;

  /**
   * The feature id for the '<em><b>Using Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_STATEMENT__USING_STAT = 8;

  /**
   * The number of structural features of the '<em>Embedded Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_STATEMENT_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.UsingStatementImpl <em>Using Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.UsingStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getUsingStatement()
   * @generated
   */
  int USING_STATEMENT = 89;

  /**
   * The feature id for the '<em><b>Resourc Aquisition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_STATEMENT__RESOURC_AQUISITION = 0;

  /**
   * The feature id for the '<em><b>Embedded Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_STATEMENT__EMBEDDED_STAT = 1;

  /**
   * The number of structural features of the '<em>Using Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ResourceAquisitionImpl <em>Resource Aquisition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ResourceAquisitionImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getResourceAquisition()
   * @generated
   */
  int RESOURCE_AQUISITION = 90;

  /**
   * The number of structural features of the '<em>Resource Aquisition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_AQUISITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.LocalVariableDeclarationImpl <em>Local Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.LocalVariableDeclarationImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getLocalVariableDeclaration()
   * @generated
   */
  int LOCAL_VARIABLE_DECLARATION = 91;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_DECLARATION__TIPO = RESOURCE_AQUISITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_DECLARATION__VARIABLE = RESOURCE_AQUISITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_DECLARATION_FEATURE_COUNT = RESOURCE_AQUISITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.LockStatementImpl <em>Lock Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.LockStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getLockStatement()
   * @generated
   */
  int LOCK_STATEMENT = 92;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCK_STATEMENT__EXP = 0;

  /**
   * The feature id for the '<em><b>Embedded Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCK_STATEMENT__EMBEDDED_STAT = 1;

  /**
   * The number of structural features of the '<em>Lock Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCK_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.TryStatementImpl <em>Try Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.TryStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getTryStatement()
   * @generated
   */
  int TRY_STATEMENT = 93;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__BLOCK = 0;

  /**
   * The feature id for the '<em><b>Catch Clauses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__CATCH_CLAUSES = 1;

  /**
   * The feature id for the '<em><b>Finally</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__FINALLY = 2;

  /**
   * The feature id for the '<em><b>Finally Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__FINALLY_CLAUSE = 3;

  /**
   * The number of structural features of the '<em>Try Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.FinallyClauseImpl <em>Finally Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.FinallyClauseImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getFinallyClause()
   * @generated
   */
  int FINALLY_CLAUSE = 94;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINALLY_CLAUSE__BLOCK = 0;

  /**
   * The number of structural features of the '<em>Finally Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINALLY_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.CatchClausesImpl <em>Catch Clauses</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.CatchClausesImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getCatchClauses()
   * @generated
   */
  int CATCH_CLAUSES = 95;

  /**
   * The feature id for the '<em><b>Speci Catch Clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATCH_CLAUSES__SPECI_CATCH_CLAUSE = 0;

  /**
   * The feature id for the '<em><b>Gen Catch Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATCH_CLAUSES__GEN_CATCH_CLAUSE = 1;

  /**
   * The feature id for the '<em><b>Spec Catch Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATCH_CLAUSES__SPEC_CATCH_CLAUSE = 2;

  /**
   * The number of structural features of the '<em>Catch Clauses</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATCH_CLAUSES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.GeneralCatchclauseImpl <em>General Catchclause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.GeneralCatchclauseImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getGeneralCatchclause()
   * @generated
   */
  int GENERAL_CATCHCLAUSE = 96;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_CATCHCLAUSE__BLOCK = 0;

  /**
   * The number of structural features of the '<em>General Catchclause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_CATCHCLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.SpecificCatchClauseImpl <em>Specific Catch Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.SpecificCatchClauseImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getSpecificCatchClause()
   * @generated
   */
  int SPECIFIC_CATCH_CLAUSE = 97;

  /**
   * The feature id for the '<em><b>Quali Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIC_CATCH_CLAUSE__QUALI_ID = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIC_CATCH_CLAUSE__ID = 1;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIC_CATCH_CLAUSE__BLOCK = 2;

  /**
   * The number of structural features of the '<em>Specific Catch Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIC_CATCH_CLAUSE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.JumpStatementImpl <em>Jump Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.JumpStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getJumpStatement()
   * @generated
   */
  int JUMP_STATEMENT = 98;

  /**
   * The feature id for the '<em><b>Break Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_STATEMENT__BREAK_STAT = 0;

  /**
   * The feature id for the '<em><b>Continue Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_STATEMENT__CONTINUE_STAT = 1;

  /**
   * The feature id for the '<em><b>Goto Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_STATEMENT__GOTO_STAT = 2;

  /**
   * The feature id for the '<em><b>Return Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_STATEMENT__RETURN_STAT = 3;

  /**
   * The feature id for the '<em><b>Throw Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_STATEMENT__THROW_STAT = 4;

  /**
   * The number of structural features of the '<em>Jump Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_STATEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ThrowStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getThrowStatement()
   * @generated
   */
  int THROW_STATEMENT = 99;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROW_STATEMENT__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Throw Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROW_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ReturnStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getReturnStatement()
   * @generated
   */
  int RETURN_STATEMENT = 100;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.GotoStatementImpl <em>Goto Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.GotoStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getGotoStatement()
   * @generated
   */
  int GOTO_STATEMENT = 101;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_STATEMENT__ID = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_STATEMENT__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Goto Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ContinueStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getContinueStatement()
   * @generated
   */
  int CONTINUE_STATEMENT = 102;

  /**
   * The number of structural features of the '<em>Continue Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUE_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.BreakStatementImpl <em>Break Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.BreakStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getBreakStatement()
   * @generated
   */
  int BREAK_STATEMENT = 103;

  /**
   * The number of structural features of the '<em>Break Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.IterationStatementImpl <em>Iteration Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.IterationStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getIterationStatement()
   * @generated
   */
  int ITERATION_STATEMENT = 104;

  /**
   * The feature id for the '<em><b>While Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STATEMENT__WHILE_STATEMENT = 0;

  /**
   * The feature id for the '<em><b>Do Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STATEMENT__DO_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>For Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STATEMENT__FOR_STATEMENT = 2;

  /**
   * The feature id for the '<em><b>Foreach Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STATEMENT__FOREACH_STATEMENT = 3;

  /**
   * The number of structural features of the '<em>Iteration Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STATEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ForeachStatementImpl <em>Foreach Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ForeachStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getForeachStatement()
   * @generated
   */
  int FOREACH_STATEMENT = 105;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_STATEMENT__TIPO = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_STATEMENT__ID = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_STATEMENT__EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Embedded Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_STATEMENT__EMBEDDED_STATEMENT = 3;

  /**
   * The number of structural features of the '<em>Foreach Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_STATEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ForStatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ForStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getForStatement()
   * @generated
   */
  int FOR_STATEMENT = 106;

  /**
   * The feature id for the '<em><b>For Initializer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FOR_INITIALIZER = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Statement Expression List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__STATEMENT_EXPRESSION_LIST = 2;

  /**
   * The feature id for the '<em><b>Embedded Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__EMBEDDED_STATEMENT = 3;

  /**
   * The number of structural features of the '<em>For Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ForInitializerImpl <em>For Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ForInitializerImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getForInitializer()
   * @generated
   */
  int FOR_INITIALIZER = 107;

  /**
   * The feature id for the '<em><b>Local Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_INITIALIZER__LOCAL_VARIABLE_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Statement Expression List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_INITIALIZER__STATEMENT_EXPRESSION_LIST = 1;

  /**
   * The number of structural features of the '<em>For Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_INITIALIZER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.StatementExpressionListImpl <em>Statement Expression List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.StatementExpressionListImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStatementExpressionList()
   * @generated
   */
  int STATEMENT_EXPRESSION_LIST = 108;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_EXPRESSION_LIST__LIST = 0;

  /**
   * The number of structural features of the '<em>Statement Expression List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_EXPRESSION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.StatementExpressionImpl <em>Statement Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.StatementExpressionImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStatementExpression()
   * @generated
   */
  int STATEMENT_EXPRESSION = 109;

  /**
   * The feature id for the '<em><b>Primary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_EXPRESSION__PRIMARY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_EXPRESSION__ARGUMENT_LIST = 1;

  /**
   * The feature id for the '<em><b>Incriment Decrement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_EXPRESSION__INCRIMENT_DECREMENT = 2;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_EXPRESSION__TIPO = 3;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_EXPRESSION__UNARY_EXPRESSION = 4;

  /**
   * The feature id for the '<em><b>Assignement Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_EXPRESSION__ASSIGNEMENT_OPERATOR = 5;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_EXPRESSION__EXPRESSION = 6;

  /**
   * The number of structural features of the '<em>Statement Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_EXPRESSION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.PrimaryExpressionImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getPrimaryExpression()
   * @generated
   */
  int PRIMARY_EXPRESSION = 110;

  /**
   * The feature id for the '<em><b>Non Array Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__NON_ARRAY_TYPE = 0;

  /**
   * The feature id for the '<em><b>Expression List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__EXPRESSION_LIST = 1;

  /**
   * The feature id for the '<em><b>Rank Specifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__RANK_SPECIFIER = 2;

  /**
   * The feature id for the '<em><b>Array Initializer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__ARRAY_INITIALIZER = 3;

  /**
   * The feature id for the '<em><b>Array Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__ARRAY_TYPE = 4;

  /**
   * The feature id for the '<em><b>Array Initializer2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__ARRAY_INITIALIZER2 = 5;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__TIPO = 6;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__ARGUMENT_LIST = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__ID = 8;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__LITERAL = 9;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Predefined Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__PREDEFINED_TYPE = 11;

  /**
   * The feature id for the '<em><b>Type Or Void</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__TYPE_OR_VOID = 12;

  /**
   * The feature id for the '<em><b>Primary Exoression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__PRIMARY_EXORESSION2 = 13;

  /**
   * The number of structural features of the '<em>Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_FEATURE_COUNT = 14;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.PrimaryExpression2Impl <em>Primary Expression2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.PrimaryExpression2Impl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getPrimaryExpression2()
   * @generated
   */
  int PRIMARY_EXPRESSION2 = 111;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION2__ID = 0;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION2__ARGUMENT_LIST = 1;

  /**
   * The feature id for the '<em><b>Expression List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION2__EXPRESSION_LIST = 2;

  /**
   * The feature id for the '<em><b>Incremente Decrement</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION2__INCREMENTE_DECREMENT = 3;

  /**
   * The feature id for the '<em><b>Primary Expression2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION2__PRIMARY_EXPRESSION2 = 4;

  /**
   * The number of structural features of the '<em>Primary Expression2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION2_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.DoStatementImpl <em>Do Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.DoStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getDoStatement()
   * @generated
   */
  int DO_STATEMENT = 112;

  /**
   * The feature id for the '<em><b>Embedded Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__EMBEDDED_STATEMENT = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Do Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.WhileStatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.WhileStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getWhileStatement()
   * @generated
   */
  int WHILE_STATEMENT = 113;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Embedded Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__EMBEDDED_STATEMENT = 1;

  /**
   * The number of structural features of the '<em>While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.SelectionStatementImpl <em>Selection Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.SelectionStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getSelectionStatement()
   * @generated
   */
  int SELECTION_STATEMENT = 114;

  /**
   * The feature id for the '<em><b>If Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STATEMENT__IF_STATEMENT = 0;

  /**
   * The feature id for the '<em><b>Switch Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STATEMENT__SWITCH_STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Selection Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.SwitchStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getSwitchStatement()
   * @generated
   */
  int SWITCH_STATEMENT = 115;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Switch Section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__SWITCH_SECTION = 1;

  /**
   * The number of structural features of the '<em>Switch Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.SwitchSectionImpl <em>Switch Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.SwitchSectionImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getSwitchSection()
   * @generated
   */
  int SWITCH_SECTION = 116;

  /**
   * The feature id for the '<em><b>Switchlabel</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_SECTION__SWITCHLABEL = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_SECTION__STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Switch Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.SwitchLabelImpl <em>Switch Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.SwitchLabelImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getSwitchLabel()
   * @generated
   */
  int SWITCH_LABEL = 117;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_LABEL__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Switch Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_LABEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.IfStatementImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 118;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Embedded Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__EMBEDDED_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Else Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSE_PART = 2;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.ElsePartImpl <em>Else Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.ElsePartImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getElsePart()
   * @generated
   */
  int ELSE_PART = 119;

  /**
   * The feature id for the '<em><b>Embedded Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_PART__EMBEDDED_STATEMENT = 0;

  /**
   * The number of structural features of the '<em>Else Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.BlockImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 120;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENT = REMOVE_ACCESSOR_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = REMOVE_ACCESSOR_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.MaybeEmptyBlockImpl <em>Maybe Empty Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.MaybeEmptyBlockImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getMaybeEmptyBlock()
   * @generated
   */
  int MAYBE_EMPTY_BLOCK = 121;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAYBE_EMPTY_BLOCK__STATEMENT = SET_ACCESSOR_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Maybe Empty Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAYBE_EMPTY_BLOCK_FEATURE_COUNT = SET_ACCESSOR_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.myModel.cSharp.impl.VoidImpl <em>Void</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.myModel.cSharp.impl.VoidImpl
   * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getVoid()
   * @generated
   */
  int VOID = 122;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID__NAME = TYPE_OR_VOID__NAME;

  /**
   * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID__FORMAL_PARAMETERS = TYPE_OR_VOID__FORMAL_PARAMETERS;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID__TYPE = TYPE_OR_VOID__TYPE;

  /**
   * The number of structural features of the '<em>Void</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID_FEATURE_COUNT = TYPE_OR_VOID_FEATURE_COUNT + 0;


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
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.Model#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see org.xtext.example.myModel.cSharp.Model#getInputs()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Inputs();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.Identifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier</em>'.
   * @see org.xtext.example.myModel.cSharp.Identifier
   * @generated
   */
  EClass getIdentifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Identifier#getFormalList <em>Formal List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal List</em>'.
   * @see org.xtext.example.myModel.cSharp.Identifier#getFormalList()
   * @see #getIdentifier()
   * @generated
   */
  EReference getIdentifier_FormalList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Identifier#getConstInitializer <em>Const Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Const Initializer</em>'.
   * @see org.xtext.example.myModel.cSharp.Identifier#getConstInitializer()
   * @see #getIdentifier()
   * @generated
   */
  EReference getIdentifier_ConstInitializer();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.CompilationUnit <em>Compilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compilation Unit</em>'.
   * @see org.xtext.example.myModel.cSharp.CompilationUnit
   * @generated
   */
  EClass getCompilationUnit();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.CompilationUnit#getUsingDirectives <em>Using Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Using Directives</em>'.
   * @see org.xtext.example.myModel.cSharp.CompilationUnit#getUsingDirectives()
   * @see #getCompilationUnit()
   * @generated
   */
  EReference getCompilationUnit_UsingDirectives();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.CompilationUnit#getGlobalAtt <em>Global Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Global Att</em>'.
   * @see org.xtext.example.myModel.cSharp.CompilationUnit#getGlobalAtt()
   * @see #getCompilationUnit()
   * @generated
   */
  EReference getCompilationUnit_GlobalAtt();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.CompilationUnit#getNameSpaces <em>Name Spaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name Spaces</em>'.
   * @see org.xtext.example.myModel.cSharp.CompilationUnit#getNameSpaces()
   * @see #getCompilationUnit()
   * @generated
   */
  EReference getCompilationUnit_NameSpaces();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.NamespaceMemberDeclaration <em>Namespace Member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Member Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.NamespaceMemberDeclaration
   * @generated
   */
  EClass getNamespaceMemberDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.NamespaceMemberDeclaration#getNameDeclaretion <em>Name Declaretion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Declaretion</em>'.
   * @see org.xtext.example.myModel.cSharp.NamespaceMemberDeclaration#getNameDeclaretion()
   * @see #getNamespaceMemberDeclaration()
   * @generated
   */
  EReference getNamespaceMemberDeclaration_NameDeclaretion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.NamespaceMemberDeclaration#getTypeDeclaration <em>Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.NamespaceMemberDeclaration#getTypeDeclaration()
   * @see #getNamespaceMemberDeclaration()
   * @generated
   */
  EReference getNamespaceMemberDeclaration_TypeDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.NamespaceDeclaration <em>Namespace Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.NamespaceDeclaration
   * @generated
   */
  EClass getNamespaceDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.NamespaceDeclaration#getQId <em>QId</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>QId</em>'.
   * @see org.xtext.example.myModel.cSharp.NamespaceDeclaration#getQId()
   * @see #getNamespaceDeclaration()
   * @generated
   */
  EReference getNamespaceDeclaration_QId();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.NamespaceDeclaration#getNameBody <em>Name Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Body</em>'.
   * @see org.xtext.example.myModel.cSharp.NamespaceDeclaration#getNameBody()
   * @see #getNamespaceDeclaration()
   * @generated
   */
  EReference getNamespaceDeclaration_NameBody();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.NamespaceBody <em>Namespace Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Body</em>'.
   * @see org.xtext.example.myModel.cSharp.NamespaceBody
   * @generated
   */
  EClass getNamespaceBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.NamespaceBody#getUsingDirectives <em>Using Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Using Directives</em>'.
   * @see org.xtext.example.myModel.cSharp.NamespaceBody#getUsingDirectives()
   * @see #getNamespaceBody()
   * @generated
   */
  EReference getNamespaceBody_UsingDirectives();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.NamespaceBody#getNameSpaces <em>Name Spaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name Spaces</em>'.
   * @see org.xtext.example.myModel.cSharp.NamespaceBody#getNameSpaces()
   * @see #getNamespaceBody()
   * @generated
   */
  EReference getNamespaceBody_NameSpaces();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.TypeDeclaration <em>Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.TypeDeclaration
   * @generated
   */
  EClass getTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.TypeDeclaration#getClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.TypeDeclaration#getClassDeclaration()
   * @see #getTypeDeclaration()
   * @generated
   */
  EReference getTypeDeclaration_ClassDeclaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.myModel.cSharp.TypeDeclaration#getMod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mod</em>'.
   * @see org.xtext.example.myModel.cSharp.TypeDeclaration#getMod()
   * @see #getTypeDeclaration()
   * @generated
   */
  EAttribute getTypeDeclaration_Mod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.TypeDeclaration#getStructDeclaration <em>Struct Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.TypeDeclaration#getStructDeclaration()
   * @see #getTypeDeclaration()
   * @generated
   */
  EReference getTypeDeclaration_StructDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.TypeDeclaration#getInterfaceDeclaration <em>Interface Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.TypeDeclaration#getInterfaceDeclaration()
   * @see #getTypeDeclaration()
   * @generated
   */
  EReference getTypeDeclaration_InterfaceDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.TypeDeclaration#getEnumDeclaration <em>Enum Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enum Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.TypeDeclaration#getEnumDeclaration()
   * @see #getTypeDeclaration()
   * @generated
   */
  EReference getTypeDeclaration_EnumDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.TypeDeclaration#getDelegateDeclaration <em>Delegate Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delegate Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.TypeDeclaration#getDelegateDeclaration()
   * @see #getTypeDeclaration()
   * @generated
   */
  EReference getTypeDeclaration_DelegateDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.DelegateDeclaration <em>Delegate Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delegate Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.DelegateDeclaration
   * @generated
   */
  EClass getDelegateDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.EnumDeclaration <em>Enum Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.EnumDeclaration
   * @generated
   */
  EClass getEnumDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EnumDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.EnumDeclaration#getName()
   * @see #getEnumDeclaration()
   * @generated
   */
  EReference getEnumDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EnumDeclaration#getIntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Int Type</em>'.
   * @see org.xtext.example.myModel.cSharp.EnumDeclaration#getIntType()
   * @see #getEnumDeclaration()
   * @generated
   */
  EReference getEnumDeclaration_IntType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EnumDeclaration#getEnumBody <em>Enum Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enum Body</em>'.
   * @see org.xtext.example.myModel.cSharp.EnumDeclaration#getEnumBody()
   * @see #getEnumDeclaration()
   * @generated
   */
  EReference getEnumDeclaration_EnumBody();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.InterfaceDeclaration <em>Interface Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceDeclaration
   * @generated
   */
  EClass getInterfaceDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceDeclaration#getName()
   * @see #getInterfaceDeclaration()
   * @generated
   */
  EReference getInterfaceDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceDeclaration#getQIdentifiers <em>QIdentifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>QIdentifiers</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceDeclaration#getQIdentifiers()
   * @see #getInterfaceDeclaration()
   * @generated
   */
  EReference getInterfaceDeclaration_QIdentifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceDeclaration#getInterBody <em>Inter Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inter Body</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceDeclaration#getInterBody()
   * @see #getInterfaceDeclaration()
   * @generated
   */
  EReference getInterfaceDeclaration_InterBody();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.InterfaceBody <em>Interface Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Body</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceBody
   * @generated
   */
  EClass getInterfaceBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.InterfaceBody#getInterfaceMemberDeclarations <em>Interface Member Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interface Member Declarations</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceBody#getInterfaceMemberDeclarations()
   * @see #getInterfaceBody()
   * @generated
   */
  EReference getInterfaceBody_InterfaceMemberDeclarations();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.InterfaceMemberDeclaration <em>Interface Member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Member Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceMemberDeclaration
   * @generated
   */
  EClass getInterfaceMemberDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceMemberDeclaration#getIntermethodDeclaration <em>Intermethod Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Intermethod Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceMemberDeclaration#getIntermethodDeclaration()
   * @see #getInterfaceMemberDeclaration()
   * @generated
   */
  EReference getInterfaceMemberDeclaration_IntermethodDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceMemberDeclaration#getInterEventDeclaration <em>Inter Event Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inter Event Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceMemberDeclaration#getInterEventDeclaration()
   * @see #getInterfaceMemberDeclaration()
   * @generated
   */
  EReference getInterfaceMemberDeclaration_InterEventDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceMemberDeclaration#getType1 <em>Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type1</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceMemberDeclaration#getType1()
   * @see #getInterfaceMemberDeclaration()
   * @generated
   */
  EReference getInterfaceMemberDeclaration_Type1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceMemberDeclaration#getInterfaceIndexerDecla <em>Interface Indexer Decla</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface Indexer Decla</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceMemberDeclaration#getInterfaceIndexerDecla()
   * @see #getInterfaceMemberDeclaration()
   * @generated
   */
  EReference getInterfaceMemberDeclaration_InterfaceIndexerDecla();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceMemberDeclaration#getInterProperty <em>Inter Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inter Property</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceMemberDeclaration#getInterProperty()
   * @see #getInterfaceMemberDeclaration()
   * @generated
   */
  EReference getInterfaceMemberDeclaration_InterProperty();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.InterfaceIndexerDeclaration <em>Interface Indexer Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Indexer Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceIndexerDeclaration
   * @generated
   */
  EClass getInterfaceIndexerDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceIndexerDeclaration#getParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceIndexerDeclaration#getParameterList()
   * @see #getInterfaceIndexerDeclaration()
   * @generated
   */
  EReference getInterfaceIndexerDeclaration_ParameterList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceIndexerDeclaration#getInterAccessors <em>Inter Accessors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inter Accessors</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceIndexerDeclaration#getInterAccessors()
   * @see #getInterfaceIndexerDeclaration()
   * @generated
   */
  EReference getInterfaceIndexerDeclaration_InterAccessors();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.InterfaceEventDeclaration <em>Interface Event Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Event Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceEventDeclaration
   * @generated
   */
  EClass getInterfaceEventDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceEventDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceEventDeclaration#getType()
   * @see #getInterfaceEventDeclaration()
   * @generated
   */
  EReference getInterfaceEventDeclaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceEventDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceEventDeclaration#getName()
   * @see #getInterfaceEventDeclaration()
   * @generated
   */
  EReference getInterfaceEventDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.InterfacePropertyDeclaration <em>Interface Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Property Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfacePropertyDeclaration
   * @generated
   */
  EClass getInterfacePropertyDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfacePropertyDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfacePropertyDeclaration#getName()
   * @see #getInterfacePropertyDeclaration()
   * @generated
   */
  EReference getInterfacePropertyDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfacePropertyDeclaration#getInterAccessor <em>Inter Accessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inter Accessor</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfacePropertyDeclaration#getInterAccessor()
   * @see #getInterfacePropertyDeclaration()
   * @generated
   */
  EReference getInterfacePropertyDeclaration_InterAccessor();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.InterfaceAccessors <em>Interface Accessors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Accessors</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceAccessors
   * @generated
   */
  EClass getInterfaceAccessors();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceAccessors#getAtt <em>Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Att</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceAccessors#getAtt()
   * @see #getInterfaceAccessors()
   * @generated
   */
  EReference getInterfaceAccessors_Att();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceAccessors#getNewAtt <em>New Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New Att</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceAccessors#getNewAtt()
   * @see #getInterfaceAccessors()
   * @generated
   */
  EReference getInterfaceAccessors_NewAtt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceAccessors#getOtherAtt <em>Other Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Other Att</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceAccessors#getOtherAtt()
   * @see #getInterfaceAccessors()
   * @generated
   */
  EReference getInterfaceAccessors_OtherAtt();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.InterfaceMethodDeclaration <em>Interface Method Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Method Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceMethodDeclaration
   * @generated
   */
  EClass getInterfaceMethodDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceMethodDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceMethodDeclaration#getType()
   * @see #getInterfaceMethodDeclaration()
   * @generated
   */
  EReference getInterfaceMethodDeclaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceMethodDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceMethodDeclaration#getName()
   * @see #getInterfaceMethodDeclaration()
   * @generated
   */
  EReference getInterfaceMethodDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.InterfaceMethodDeclaration#getParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List</em>'.
   * @see org.xtext.example.myModel.cSharp.InterfaceMethodDeclaration#getParameterList()
   * @see #getInterfaceMethodDeclaration()
   * @generated
   */
  EReference getInterfaceMethodDeclaration_ParameterList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.StructDeclaration <em>Struct Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.StructDeclaration
   * @generated
   */
  EClass getStructDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.StructDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.StructDeclaration#getName()
   * @see #getStructDeclaration()
   * @generated
   */
  EReference getStructDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.StructDeclaration#getQualId <em>Qual Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qual Id</em>'.
   * @see org.xtext.example.myModel.cSharp.StructDeclaration#getQualId()
   * @see #getStructDeclaration()
   * @generated
   */
  EReference getStructDeclaration_QualId();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.StructDeclaration#getStructbody <em>Structbody</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structbody</em>'.
   * @see org.xtext.example.myModel.cSharp.StructDeclaration#getStructbody()
   * @see #getStructDeclaration()
   * @generated
   */
  EReference getStructDeclaration_Structbody();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.StructBody <em>Struct Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Body</em>'.
   * @see org.xtext.example.myModel.cSharp.StructBody
   * @generated
   */
  EClass getStructBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.StructBody#getStructMember <em>Struct Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct Member</em>'.
   * @see org.xtext.example.myModel.cSharp.StructBody#getStructMember()
   * @see #getStructBody()
   * @generated
   */
  EReference getStructBody_StructMember();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.StructMemberDeclarations <em>Struct Member Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Member Declarations</em>'.
   * @see org.xtext.example.myModel.cSharp.StructMemberDeclarations
   * @generated
   */
  EClass getStructMemberDeclarations();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.StructMemberDeclarations2 <em>Struct Member Declarations2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Member Declarations2</em>'.
   * @see org.xtext.example.myModel.cSharp.StructMemberDeclarations2
   * @generated
   */
  EClass getStructMemberDeclarations2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.StructMemberDeclaration <em>Struct Member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Member Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.StructMemberDeclaration
   * @generated
   */
  EClass getStructMemberDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.StructMemberDeclaration#getStructMember2 <em>Struct Member2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct Member2</em>'.
   * @see org.xtext.example.myModel.cSharp.StructMemberDeclaration#getStructMember2()
   * @see #getStructMemberDeclaration()
   * @generated
   */
  EReference getStructMemberDeclaration_StructMember2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassDeclaration
   * @generated
   */
  EClass getClassDeclaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.myModel.cSharp.ClassDeclaration#getClassModifier <em>Class Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Class Modifier</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassDeclaration#getClassModifier()
   * @see #getClassDeclaration()
   * @generated
   */
  EAttribute getClassDeclaration_ClassModifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ClassDeclaration#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Name</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassDeclaration#getClassName()
   * @see #getClassDeclaration()
   * @generated
   */
  EReference getClassDeclaration_ClassName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ClassDeclaration#getClassBase <em>Class Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Base</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassDeclaration#getClassBase()
   * @see #getClassDeclaration()
   * @generated
   */
  EReference getClassDeclaration_ClassBase();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ClassDeclaration#getClassBody <em>Class Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Body</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassDeclaration#getClassBody()
   * @see #getClassDeclaration()
   * @generated
   */
  EReference getClassDeclaration_ClassBody();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ClassBody <em>Class Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Body</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassBody
   * @generated
   */
  EClass getClassBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.ClassBody#getClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassBody#getClassDeclaration()
   * @see #getClassBody()
   * @generated
   */
  EReference getClassBody_ClassDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ClassMemberDeclaration <em>Class Member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Member Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassMemberDeclaration
   * @generated
   */
  EClass getClassMemberDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getClassAtt <em>Class Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Att</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getClassAtt()
   * @see #getClassMemberDeclaration()
   * @generated
   */
  EReference getClassMemberDeclaration_ClassAtt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getConstDeclaration <em>Const Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Const Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getConstDeclaration()
   * @see #getClassMemberDeclaration()
   * @generated
   */
  EReference getClassMemberDeclaration_ConstDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getFieldDeclaration <em>Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getFieldDeclaration()
   * @see #getClassMemberDeclaration()
   * @generated
   */
  EReference getClassMemberDeclaration_FieldDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getPropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getPropertyDeclaration()
   * @see #getClassMemberDeclaration()
   * @generated
   */
  EReference getClassMemberDeclaration_PropertyDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getEventDeclaration <em>Event Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getEventDeclaration()
   * @see #getClassMemberDeclaration()
   * @generated
   */
  EReference getClassMemberDeclaration_EventDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getIndexDeclaration <em>Index Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getIndexDeclaration()
   * @see #getClassMemberDeclaration()
   * @generated
   */
  EReference getClassMemberDeclaration_IndexDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getOpDeclaration <em>Op Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getOpDeclaration()
   * @see #getClassMemberDeclaration()
   * @generated
   */
  EReference getClassMemberDeclaration_OpDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getConstructorDeclaration <em>Constructor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constructor Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getConstructorDeclaration()
   * @see #getClassMemberDeclaration()
   * @generated
   */
  EReference getClassMemberDeclaration_ConstructorDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getDestructorDeclaration <em>Destructor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Destructor Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getDestructorDeclaration()
   * @see #getClassMemberDeclaration()
   * @generated
   */
  EReference getClassMemberDeclaration_DestructorDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getStaticDeclaration <em>Static Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Static Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getStaticDeclaration()
   * @see #getClassMemberDeclaration()
   * @generated
   */
  EReference getClassMemberDeclaration_StaticDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getTypeDeclaration <em>Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassMemberDeclaration#getTypeDeclaration()
   * @see #getClassMemberDeclaration()
   * @generated
   */
  EReference getClassMemberDeclaration_TypeDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.StaticConstructorDeclaration <em>Static Constructor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Constructor Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.StaticConstructorDeclaration
   * @generated
   */
  EClass getStaticConstructorDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.myModel.cSharp.StaticConstructorDeclaration#getStaticCosntModifier <em>Static Cosnt Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static Cosnt Modifier</em>'.
   * @see org.xtext.example.myModel.cSharp.StaticConstructorDeclaration#getStaticCosntModifier()
   * @see #getStaticConstructorDeclaration()
   * @generated
   */
  EAttribute getStaticConstructorDeclaration_StaticCosntModifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.StaticConstructorDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.StaticConstructorDeclaration#getName()
   * @see #getStaticConstructorDeclaration()
   * @generated
   */
  EReference getStaticConstructorDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.StaticConstructorDeclaration#getEmptyBlock <em>Empty Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Block</em>'.
   * @see org.xtext.example.myModel.cSharp.StaticConstructorDeclaration#getEmptyBlock()
   * @see #getStaticConstructorDeclaration()
   * @generated
   */
  EReference getStaticConstructorDeclaration_EmptyBlock();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.DestructorDeclaration <em>Destructor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Destructor Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.DestructorDeclaration
   * @generated
   */
  EClass getDestructorDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.DestructorDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.DestructorDeclaration#getName()
   * @see #getDestructorDeclaration()
   * @generated
   */
  EReference getDestructorDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.DestructorDeclaration#getEmptyBlock <em>Empty Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Block</em>'.
   * @see org.xtext.example.myModel.cSharp.DestructorDeclaration#getEmptyBlock()
   * @see #getDestructorDeclaration()
   * @generated
   */
  EReference getDestructorDeclaration_EmptyBlock();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ConstructorDeclaration <em>Constructor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ConstructorDeclaration
   * @generated
   */
  EClass getConstructorDeclaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.myModel.cSharp.ConstructorDeclaration#getConstModifier <em>Const Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Const Modifier</em>'.
   * @see org.xtext.example.myModel.cSharp.ConstructorDeclaration#getConstModifier()
   * @see #getConstructorDeclaration()
   * @generated
   */
  EAttribute getConstructorDeclaration_ConstModifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ConstructorDeclaration#getConstrDeclarator <em>Constr Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constr Declarator</em>'.
   * @see org.xtext.example.myModel.cSharp.ConstructorDeclaration#getConstrDeclarator()
   * @see #getConstructorDeclaration()
   * @generated
   */
  EReference getConstructorDeclaration_ConstrDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ConstructorDeclaration#getEmptyBlock <em>Empty Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Block</em>'.
   * @see org.xtext.example.myModel.cSharp.ConstructorDeclaration#getEmptyBlock()
   * @see #getConstructorDeclaration()
   * @generated
   */
  EReference getConstructorDeclaration_EmptyBlock();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ConstructorDeclarator <em>Constructor Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor Declarator</em>'.
   * @see org.xtext.example.myModel.cSharp.ConstructorDeclarator
   * @generated
   */
  EClass getConstructorDeclarator();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ConstructorInitializer <em>Constructor Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor Initializer</em>'.
   * @see org.xtext.example.myModel.cSharp.ConstructorInitializer
   * @generated
   */
  EClass getConstructorInitializer();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument List</em>'.
   * @see org.xtext.example.myModel.cSharp.ArgumentList
   * @generated
   */
  EClass getArgumentList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.ArgumentList#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arg</em>'.
   * @see org.xtext.example.myModel.cSharp.ArgumentList#getArg()
   * @see #getArgumentList()
   * @generated
   */
  EReference getArgumentList_Arg();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see org.xtext.example.myModel.cSharp.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.OperatorDeclaration <em>Operator Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.OperatorDeclaration
   * @generated
   */
  EClass getOperatorDeclaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.myModel.cSharp.OperatorDeclaration#getOpModifier <em>Op Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op Modifier</em>'.
   * @see org.xtext.example.myModel.cSharp.OperatorDeclaration#getOpModifier()
   * @see #getOperatorDeclaration()
   * @generated
   */
  EAttribute getOperatorDeclaration_OpModifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.OperatorDeclaration#getOpDeclarator <em>Op Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op Declarator</em>'.
   * @see org.xtext.example.myModel.cSharp.OperatorDeclaration#getOpDeclarator()
   * @see #getOperatorDeclaration()
   * @generated
   */
  EReference getOperatorDeclaration_OpDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.OperatorDeclaration#getEmptyBlock <em>Empty Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Block</em>'.
   * @see org.xtext.example.myModel.cSharp.OperatorDeclaration#getEmptyBlock()
   * @see #getOperatorDeclaration()
   * @generated
   */
  EReference getOperatorDeclaration_EmptyBlock();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.OperatorDeclarator <em>Operator Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Declarator</em>'.
   * @see org.xtext.example.myModel.cSharp.OperatorDeclarator
   * @generated
   */
  EClass getOperatorDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.OperatorDeclarator#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.myModel.cSharp.OperatorDeclarator#getType()
   * @see #getOperatorDeclarator()
   * @generated
   */
  EReference getOperatorDeclarator_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ConversionOperatorDeclarator <em>Conversion Operator Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conversion Operator Declarator</em>'.
   * @see org.xtext.example.myModel.cSharp.ConversionOperatorDeclarator
   * @generated
   */
  EClass getConversionOperatorDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ConversionOperatorDeclarator#getFirstType <em>First Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First Type</em>'.
   * @see org.xtext.example.myModel.cSharp.ConversionOperatorDeclarator#getFirstType()
   * @see #getConversionOperatorDeclarator()
   * @generated
   */
  EReference getConversionOperatorDeclarator_FirstType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ConversionOperatorDeclarator#getConversionName <em>Conversion Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conversion Name</em>'.
   * @see org.xtext.example.myModel.cSharp.ConversionOperatorDeclarator#getConversionName()
   * @see #getConversionOperatorDeclarator()
   * @generated
   */
  EReference getConversionOperatorDeclarator_ConversionName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator <em>Binary Operator Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Operator Declarator</em>'.
   * @see org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator
   * @generated
   */
  EClass getBinaryOperatorDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator#getBinType <em>Bin Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bin Type</em>'.
   * @see org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator#getBinType()
   * @see #getBinaryOperatorDeclarator()
   * @generated
   */
  EReference getBinaryOperatorDeclarator_BinType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator#getOverBinOperator <em>Over Bin Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Over Bin Operator</em>'.
   * @see org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator#getOverBinOperator()
   * @see #getBinaryOperatorDeclarator()
   * @generated
   */
  EAttribute getBinaryOperatorDeclarator_OverBinOperator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator#getOtherName <em>Other Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Other Name</em>'.
   * @see org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator#getOtherName()
   * @see #getBinaryOperatorDeclarator()
   * @generated
   */
  EReference getBinaryOperatorDeclarator_OtherName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator#getSecondType <em>Second Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second Type</em>'.
   * @see org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator#getSecondType()
   * @see #getBinaryOperatorDeclarator()
   * @generated
   */
  EReference getBinaryOperatorDeclarator_SecondType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator#getSecondName <em>Second Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second Name</em>'.
   * @see org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator#getSecondName()
   * @see #getBinaryOperatorDeclarator()
   * @generated
   */
  EReference getBinaryOperatorDeclarator_SecondName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.UnaryOperatorDeclarator <em>Unary Operator Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Operator Declarator</em>'.
   * @see org.xtext.example.myModel.cSharp.UnaryOperatorDeclarator
   * @generated
   */
  EClass getUnaryOperatorDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.UnaryOperatorDeclarator#getOtherType <em>Other Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Other Type</em>'.
   * @see org.xtext.example.myModel.cSharp.UnaryOperatorDeclarator#getOtherType()
   * @see #getUnaryOperatorDeclarator()
   * @generated
   */
  EReference getUnaryOperatorDeclarator_OtherType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.UnaryOperatorDeclarator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.UnaryOperatorDeclarator#getName()
   * @see #getUnaryOperatorDeclarator()
   * @generated
   */
  EReference getUnaryOperatorDeclarator_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.IndexerDeclaration <em>Indexer Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indexer Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.IndexerDeclaration
   * @generated
   */
  EClass getIndexerDeclaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.myModel.cSharp.IndexerDeclaration#getIdModifier <em>Id Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Id Modifier</em>'.
   * @see org.xtext.example.myModel.cSharp.IndexerDeclaration#getIdModifier()
   * @see #getIndexerDeclaration()
   * @generated
   */
  EAttribute getIndexerDeclaration_IdModifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.IndexerDeclaration#getIndexerDeclarator <em>Indexer Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Indexer Declarator</em>'.
   * @see org.xtext.example.myModel.cSharp.IndexerDeclaration#getIndexerDeclarator()
   * @see #getIndexerDeclaration()
   * @generated
   */
  EReference getIndexerDeclaration_IndexerDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.IndexerDeclaration#getAccDeclaration <em>Acc Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Acc Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.IndexerDeclaration#getAccDeclaration()
   * @see #getIndexerDeclaration()
   * @generated
   */
  EReference getIndexerDeclaration_AccDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.IndexerDeclarator <em>Indexer Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indexer Declarator</em>'.
   * @see org.xtext.example.myModel.cSharp.IndexerDeclarator
   * @generated
   */
  EClass getIndexerDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.IndexerDeclarator#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.myModel.cSharp.IndexerDeclarator#getType()
   * @see #getIndexerDeclarator()
   * @generated
   */
  EReference getIndexerDeclarator_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.IndexerDeclarator#getFormalList <em>Formal List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal List</em>'.
   * @see org.xtext.example.myModel.cSharp.IndexerDeclarator#getFormalList()
   * @see #getIndexerDeclarator()
   * @generated
   */
  EReference getIndexerDeclarator_FormalList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.IndexerDeclarator#getQualifiedId <em>Qualified Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Id</em>'.
   * @see org.xtext.example.myModel.cSharp.IndexerDeclarator#getQualifiedId()
   * @see #getIndexerDeclarator()
   * @generated
   */
  EReference getIndexerDeclarator_QualifiedId();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.EventDeclaration <em>Event Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.EventDeclaration
   * @generated
   */
  EClass getEventDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.EventAccessorDeclarations <em>Event Accessor Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Accessor Declarations</em>'.
   * @see org.xtext.example.myModel.cSharp.EventAccessorDeclarations
   * @generated
   */
  EClass getEventAccessorDeclarations();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EventAccessorDeclarations#getAtt1 <em>Att1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Att1</em>'.
   * @see org.xtext.example.myModel.cSharp.EventAccessorDeclarations#getAtt1()
   * @see #getEventAccessorDeclarations()
   * @generated
   */
  EReference getEventAccessorDeclarations_Att1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EventAccessorDeclarations#getAddAccessor <em>Add Accessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Add Accessor</em>'.
   * @see org.xtext.example.myModel.cSharp.EventAccessorDeclarations#getAddAccessor()
   * @see #getEventAccessorDeclarations()
   * @generated
   */
  EReference getEventAccessorDeclarations_AddAccessor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EventAccessorDeclarations#getAtt <em>Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Att</em>'.
   * @see org.xtext.example.myModel.cSharp.EventAccessorDeclarations#getAtt()
   * @see #getEventAccessorDeclarations()
   * @generated
   */
  EReference getEventAccessorDeclarations_Att();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EventAccessorDeclarations#getRemovAccessor <em>Remov Accessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Remov Accessor</em>'.
   * @see org.xtext.example.myModel.cSharp.EventAccessorDeclarations#getRemovAccessor()
   * @see #getEventAccessorDeclarations()
   * @generated
   */
  EReference getEventAccessorDeclarations_RemovAccessor();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.RemoveAccessorDeclaration <em>Remove Accessor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remove Accessor Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.RemoveAccessorDeclaration
   * @generated
   */
  EClass getRemoveAccessorDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.AddAccessorDeclaration <em>Add Accessor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Accessor Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.AddAccessorDeclaration
   * @generated
   */
  EClass getAddAccessorDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.PropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.PropertyDeclaration
   * @generated
   */
  EClass getPropertyDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.AccessorDeclarations <em>Accessor Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accessor Declarations</em>'.
   * @see org.xtext.example.myModel.cSharp.AccessorDeclarations
   * @generated
   */
  EClass getAccessorDeclarations();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.AccessorDeclarations#getAtt <em>Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Att</em>'.
   * @see org.xtext.example.myModel.cSharp.AccessorDeclarations#getAtt()
   * @see #getAccessorDeclarations()
   * @generated
   */
  EReference getAccessorDeclarations_Att();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.AccessorDeclarations#getGetAcc <em>Get Acc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Get Acc</em>'.
   * @see org.xtext.example.myModel.cSharp.AccessorDeclarations#getGetAcc()
   * @see #getAccessorDeclarations()
   * @generated
   */
  EReference getAccessorDeclarations_GetAcc();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.AccessorDeclarations#getAtt2 <em>Att2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Att2</em>'.
   * @see org.xtext.example.myModel.cSharp.AccessorDeclarations#getAtt2()
   * @see #getAccessorDeclarations()
   * @generated
   */
  EReference getAccessorDeclarations_Att2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.AccessorDeclarations#getSetAcc <em>Set Acc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set Acc</em>'.
   * @see org.xtext.example.myModel.cSharp.AccessorDeclarations#getSetAcc()
   * @see #getAccessorDeclarations()
   * @generated
   */
  EReference getAccessorDeclarations_SetAcc();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.SetAccessorDeclaration <em>Set Accessor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Accessor Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.SetAccessorDeclaration
   * @generated
   */
  EClass getSetAccessorDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.GetAccessorDeclaration <em>Get Accessor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Accessor Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.GetAccessorDeclaration
   * @generated
   */
  EClass getGetAccessorDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.MethodDeclaration <em>Method Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.MethodDeclaration
   * @generated
   */
  EClass getMethodDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.MethodDeclaration#getMethodHeader <em>Method Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method Header</em>'.
   * @see org.xtext.example.myModel.cSharp.MethodDeclaration#getMethodHeader()
   * @see #getMethodDeclaration()
   * @generated
   */
  EReference getMethodDeclaration_MethodHeader();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.MethodDeclaration#getMaybeEmpty <em>Maybe Empty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Maybe Empty</em>'.
   * @see org.xtext.example.myModel.cSharp.MethodDeclaration#getMaybeEmpty()
   * @see #getMethodDeclaration()
   * @generated
   */
  EReference getMethodDeclaration_MaybeEmpty();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.MethodHeader <em>Method Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Header</em>'.
   * @see org.xtext.example.myModel.cSharp.MethodHeader
   * @generated
   */
  EClass getMethodHeader();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.FormalParameterList <em>Formal Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Parameter List</em>'.
   * @see org.xtext.example.myModel.cSharp.FormalParameterList
   * @generated
   */
  EClass getFormalParameterList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ParameterArray <em>Parameter Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Array</em>'.
   * @see org.xtext.example.myModel.cSharp.ParameterArray
   * @generated
   */
  EClass getParameterArray();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ParameterArray#getAtt <em>Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Att</em>'.
   * @see org.xtext.example.myModel.cSharp.ParameterArray#getAtt()
   * @see #getParameterArray()
   * @generated
   */
  EReference getParameterArray_Att();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ParameterArray#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array</em>'.
   * @see org.xtext.example.myModel.cSharp.ParameterArray#getArray()
   * @see #getParameterArray()
   * @generated
   */
  EReference getParameterArray_Array();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ParameterArray#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.ParameterArray#getName()
   * @see #getParameterArray()
   * @generated
   */
  EReference getParameterArray_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.FixedParameters <em>Fixed Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fixed Parameters</em>'.
   * @see org.xtext.example.myModel.cSharp.FixedParameters
   * @generated
   */
  EClass getFixedParameters();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.FixedParameters#getParameterArray <em>Parameter Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Array</em>'.
   * @see org.xtext.example.myModel.cSharp.FixedParameters#getParameterArray()
   * @see #getFixedParameters()
   * @generated
   */
  EReference getFixedParameters_ParameterArray();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.FixedParameters#getFixParameters <em>Fix Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fix Parameters</em>'.
   * @see org.xtext.example.myModel.cSharp.FixedParameters#getFixParameters()
   * @see #getFixedParameters()
   * @generated
   */
  EReference getFixedParameters_FixParameters();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.FixedParameter <em>Fixed Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fixed Parameter</em>'.
   * @see org.xtext.example.myModel.cSharp.FixedParameter
   * @generated
   */
  EClass getFixedParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.FixedParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.myModel.cSharp.FixedParameter#getType()
   * @see #getFixedParameter()
   * @generated
   */
  EReference getFixedParameter_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.FixedParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.FixedParameter#getName()
   * @see #getFixedParameter()
   * @generated
   */
  EReference getFixedParameter_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.TypeOrVoid <em>Type Or Void</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Or Void</em>'.
   * @see org.xtext.example.myModel.cSharp.TypeOrVoid
   * @generated
   */
  EClass getTypeOrVoid();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.TypeOrVoid#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.TypeOrVoid#getName()
   * @see #getTypeOrVoid()
   * @generated
   */
  EReference getTypeOrVoid_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.TypeOrVoid#getFormalParameters <em>Formal Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Parameters</em>'.
   * @see org.xtext.example.myModel.cSharp.TypeOrVoid#getFormalParameters()
   * @see #getTypeOrVoid()
   * @generated
   */
  EReference getTypeOrVoid_FormalParameters();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.TypeOrVoid#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.myModel.cSharp.TypeOrVoid#getType()
   * @see #getTypeOrVoid()
   * @generated
   */
  EReference getTypeOrVoid_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.FieldDeclaration <em>Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.FieldDeclaration
   * @generated
   */
  EClass getFieldDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.VariableDeclarator <em>Variable Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declarator</em>'.
   * @see org.xtext.example.myModel.cSharp.VariableDeclarator
   * @generated
   */
  EClass getVariableDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.VariableDeclarator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.VariableDeclarator#getName()
   * @see #getVariableDeclarator()
   * @generated
   */
  EReference getVariableDeclarator_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.VariableDeclarator#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.xtext.example.myModel.cSharp.VariableDeclarator#getVariable()
   * @see #getVariableDeclarator()
   * @generated
   */
  EReference getVariableDeclarator_Variable();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.VariableInitializer <em>Variable Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Initializer</em>'.
   * @see org.xtext.example.myModel.cSharp.VariableInitializer
   * @generated
   */
  EClass getVariableInitializer();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ArrayInitializer <em>Array Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Initializer</em>'.
   * @see org.xtext.example.myModel.cSharp.ArrayInitializer
   * @generated
   */
  EClass getArrayInitializer();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.ArrayInitializer#getVariableInitalizers <em>Variable Initalizers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable Initalizers</em>'.
   * @see org.xtext.example.myModel.cSharp.ArrayInitializer#getVariableInitalizers()
   * @see #getArrayInitializer()
   * @generated
   */
  EReference getArrayInitializer_VariableInitalizers();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ConstantDeclaration <em>Constant Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ConstantDeclaration
   * @generated
   */
  EClass getConstantDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ConstantDeclarator <em>Constant Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Declarator</em>'.
   * @see org.xtext.example.myModel.cSharp.ConstantDeclarator
   * @generated
   */
  EClass getConstantDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ConstantDeclarator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.ConstantDeclarator#getName()
   * @see #getConstantDeclarator()
   * @generated
   */
  EReference getConstantDeclarator_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ConstantDeclarator#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.myModel.cSharp.ConstantDeclarator#getExp()
   * @see #getConstantDeclarator()
   * @generated
   */
  EReference getConstantDeclarator_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ClassBase <em>Class Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Base</em>'.
   * @see org.xtext.example.myModel.cSharp.ClassBase
   * @generated
   */
  EClass getClassBase();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.QualifiedIdentifierList <em>Qualified Identifier List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Identifier List</em>'.
   * @see org.xtext.example.myModel.cSharp.QualifiedIdentifierList
   * @generated
   */
  EClass getQualifiedIdentifierList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.QualifiedIdentifierList#getIds <em>Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ids</em>'.
   * @see org.xtext.example.myModel.cSharp.QualifiedIdentifierList#getIds()
   * @see #getQualifiedIdentifierList()
   * @generated
   */
  EReference getQualifiedIdentifierList_Ids();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.GlobalAttributes <em>Global Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Attributes</em>'.
   * @see org.xtext.example.myModel.cSharp.GlobalAttributes
   * @generated
   */
  EClass getGlobalAttributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.GlobalAttributes#getGlobalAttSections <em>Global Att Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Global Att Sections</em>'.
   * @see org.xtext.example.myModel.cSharp.GlobalAttributes#getGlobalAttSections()
   * @see #getGlobalAttributes()
   * @generated
   */
  EReference getGlobalAttributes_GlobalAttSections();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.GlobalAttributeSection <em>Global Attribute Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Attribute Section</em>'.
   * @see org.xtext.example.myModel.cSharp.GlobalAttributeSection
   * @generated
   */
  EClass getGlobalAttributeSection();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.Attributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attributes</em>'.
   * @see org.xtext.example.myModel.cSharp.Attributes
   * @generated
   */
  EClass getAttributes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Attributes#getTypeOrVoid <em>Type Or Void</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Or Void</em>'.
   * @see org.xtext.example.myModel.cSharp.Attributes#getTypeOrVoid()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_TypeOrVoid();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Attributes#getQualifiedID <em>Qualified ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified ID</em>'.
   * @see org.xtext.example.myModel.cSharp.Attributes#getQualifiedID()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_QualifiedID();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Attributes#getFormalParameters <em>Formal Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Parameters</em>'.
   * @see org.xtext.example.myModel.cSharp.Attributes#getFormalParameters()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_FormalParameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.Attributes#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.example.myModel.cSharp.Attributes#getAttributes()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Attributes#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.myModel.cSharp.Attributes#getType()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Attributes#getEnumBody <em>Enum Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enum Body</em>'.
   * @see org.xtext.example.myModel.cSharp.Attributes#getEnumBody()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_EnumBody();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.AttributeSection <em>Attribute Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Section</em>'.
   * @see org.xtext.example.myModel.cSharp.AttributeSection
   * @generated
   */
  EClass getAttributeSection();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.AttributeList <em>Attribute List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute List</em>'.
   * @see org.xtext.example.myModel.cSharp.AttributeList
   * @generated
   */
  EClass getAttributeList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.AttributeList#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.example.myModel.cSharp.AttributeList#getAttributes()
   * @see #getAttributeList()
   * @generated
   */
  EReference getAttributeList_Attributes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.example.myModel.cSharp.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Attribute#getAttName <em>Att Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Att Name</em>'.
   * @see org.xtext.example.myModel.cSharp.Attribute#getAttName()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_AttName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Attribute#getAttArguments <em>Att Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Att Arguments</em>'.
   * @see org.xtext.example.myModel.cSharp.Attribute#getAttArguments()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_AttArguments();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.AttributeArguments <em>Attribute Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Arguments</em>'.
   * @see org.xtext.example.myModel.cSharp.AttributeArguments
   * @generated
   */
  EClass getAttributeArguments();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.AttributeArguments#getExpresions <em>Expresions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expresions</em>'.
   * @see org.xtext.example.myModel.cSharp.AttributeArguments#getExpresions()
   * @see #getAttributeArguments()
   * @generated
   */
  EReference getAttributeArguments_Expresions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ExpressionList <em>Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression List</em>'.
   * @see org.xtext.example.myModel.cSharp.ExpressionList
   * @generated
   */
  EClass getExpressionList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.ExpressionList#getExpresions <em>Expresions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expresions</em>'.
   * @see org.xtext.example.myModel.cSharp.ExpressionList#getExpresions()
   * @see #getExpressionList()
   * @generated
   */
  EReference getExpressionList_Expresions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Expression#getUnary <em>Unary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary</em>'.
   * @see org.xtext.example.myModel.cSharp.Expression#getUnary()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Unary();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Expression#getExp2 <em>Exp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp2</em>'.
   * @see org.xtext.example.myModel.cSharp.Expression#getExp2()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Exp2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Expression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.myModel.cSharp.Expression#getExp()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Exp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Expression#getOtherExp2 <em>Other Exp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Other Exp2</em>'.
   * @see org.xtext.example.myModel.cSharp.Expression#getOtherExp2()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_OtherExp2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.Expression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression2</em>'.
   * @see org.xtext.example.myModel.cSharp.Expression2
   * @generated
   */
  EClass getExpression2();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.Expression2#getInternalExp <em>Internal Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Internal Exp</em>'.
   * @see org.xtext.example.myModel.cSharp.Expression2#getInternalExp()
   * @see #getExpression2()
   * @generated
   */
  EReference getExpression2_InternalExp();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.Expression2#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.xtext.example.myModel.cSharp.Expression2#getExp()
   * @see #getExpression2()
   * @generated
   */
  EReference getExpression2_Exp();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.Expression2#getInternalExp2 <em>Internal Exp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Internal Exp2</em>'.
   * @see org.xtext.example.myModel.cSharp.Expression2#getInternalExp2()
   * @see #getExpression2()
   * @generated
   */
  EReference getExpression2_InternalExp2();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.Expression2#getBuildInType <em>Build In Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Build In Type</em>'.
   * @see org.xtext.example.myModel.cSharp.Expression2#getBuildInType()
   * @see #getExpression2()
   * @generated
   */
  EReference getExpression2_BuildInType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.myModel.cSharp.UnaryExpression#getExpUnaryOperator <em>Exp Unary Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exp Unary Operator</em>'.
   * @see org.xtext.example.myModel.cSharp.UnaryExpression#getExpUnaryOperator()
   * @see #getUnaryExpression()
   * @generated
   */
  EAttribute getUnaryExpression_ExpUnaryOperator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.UnaryExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.myModel.cSharp.UnaryExpression#getType()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.UnaryExpression#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see org.xtext.example.myModel.cSharp.UnaryExpression#getUnaryExp()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.UnaryExpression#getPrimaryExp <em>Primary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary Exp</em>'.
   * @see org.xtext.example.myModel.cSharp.UnaryExpression#getPrimaryExp()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_PrimaryExp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.AttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Name</em>'.
   * @see org.xtext.example.myModel.cSharp.AttributeName
   * @generated
   */
  EClass getAttributeName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.AttributeName#getQualifiedId <em>Qualified Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Id</em>'.
   * @see org.xtext.example.myModel.cSharp.AttributeName#getQualifiedId()
   * @see #getAttributeName()
   * @generated
   */
  EReference getAttributeName_QualifiedId();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.UsingDirective <em>Using Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Using Directive</em>'.
   * @see org.xtext.example.myModel.cSharp.UsingDirective
   * @generated
   */
  EClass getUsingDirective();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.UsingDirective#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.UsingDirective#getName()
   * @see #getUsingDirective()
   * @generated
   */
  EReference getUsingDirective_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.UsingDirective#getUsings <em>Usings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Usings</em>'.
   * @see org.xtext.example.myModel.cSharp.UsingDirective#getUsings()
   * @see #getUsingDirective()
   * @generated
   */
  EReference getUsingDirective_Usings();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.example.myModel.cSharp.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.Type#getVariableDeclarator <em>Variable Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable Declarator</em>'.
   * @see org.xtext.example.myModel.cSharp.Type#getVariableDeclarator()
   * @see #getType()
   * @generated
   */
  EReference getType_VariableDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Type#getQIdent <em>QIdent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>QIdent</em>'.
   * @see org.xtext.example.myModel.cSharp.Type#getQIdent()
   * @see #getType()
   * @generated
   */
  EReference getType_QIdent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Type#getEventAccessorDeclarations <em>Event Accessor Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event Accessor Declarations</em>'.
   * @see org.xtext.example.myModel.cSharp.Type#getEventAccessorDeclarations()
   * @see #getType()
   * @generated
   */
  EReference getType_EventAccessorDeclarations();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Type#getQualifiedId <em>Qualified Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Id</em>'.
   * @see org.xtext.example.myModel.cSharp.Type#getQualifiedId()
   * @see #getType()
   * @generated
   */
  EReference getType_QualifiedId();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Type#getAccDeclarate <em>Acc Declarate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Acc Declarate</em>'.
   * @see org.xtext.example.myModel.cSharp.Type#getAccDeclarate()
   * @see #getType()
   * @generated
   */
  EReference getType_AccDeclarate();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.Type#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.xtext.example.myModel.cSharp.Type#getVariables()
   * @see #getType()
   * @generated
   */
  EReference getType_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.Type#getConstDeclarators <em>Const Declarators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Const Declarators</em>'.
   * @see org.xtext.example.myModel.cSharp.Type#getConstDeclarators()
   * @see #getType()
   * @generated
   */
  EReference getType_ConstDeclarators();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Type#getNonArray <em>Non Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Non Array</em>'.
   * @see org.xtext.example.myModel.cSharp.Type#getNonArray()
   * @see #getType()
   * @generated
   */
  EReference getType_NonArray();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.IntegralType <em>Integral Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integral Type</em>'.
   * @see org.xtext.example.myModel.cSharp.IntegralType
   * @generated
   */
  EClass getIntegralType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Type</em>'.
   * @see org.xtext.example.myModel.cSharp.ArrayType
   * @generated
   */
  EClass getArrayType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.EnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Type</em>'.
   * @see org.xtext.example.myModel.cSharp.EnumType
   * @generated
   */
  EClass getEnumType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.NonArrayType <em>Non Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Array Type</em>'.
   * @see org.xtext.example.myModel.cSharp.NonArrayType
   * @generated
   */
  EClass getNonArrayType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.NonArrayType#getQualified <em>Qualified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified</em>'.
   * @see org.xtext.example.myModel.cSharp.NonArrayType#getQualified()
   * @see #getNonArrayType()
   * @generated
   */
  EReference getNonArrayType_Qualified();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.NonArrayType#getBuiltType <em>Built Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Built Type</em>'.
   * @see org.xtext.example.myModel.cSharp.NonArrayType#getBuiltType()
   * @see #getNonArrayType()
   * @generated
   */
  EReference getNonArrayType_BuiltType();

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
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.QualifiedIdentifier#getIds <em>Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ids</em>'.
   * @see org.xtext.example.myModel.cSharp.QualifiedIdentifier#getIds()
   * @see #getQualifiedIdentifier()
   * @generated
   */
  EReference getQualifiedIdentifier_Ids();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.BuiltInType <em>Built In Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Type</em>'.
   * @see org.xtext.example.myModel.cSharp.BuiltInType
   * @generated
   */
  EClass getBuiltInType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.EnumBody <em>Enum Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Body</em>'.
   * @see org.xtext.example.myModel.cSharp.EnumBody
   * @generated
   */
  EClass getEnumBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.EnumBody#getEnumDeclarations <em>Enum Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enum Declarations</em>'.
   * @see org.xtext.example.myModel.cSharp.EnumBody#getEnumDeclarations()
   * @see #getEnumBody()
   * @generated
   */
  EReference getEnumBody_EnumDeclarations();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.EnumMemberDeclaration <em>Enum Member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Member Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.EnumMemberDeclaration
   * @generated
   */
  EClass getEnumMemberDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EnumMemberDeclaration#getAtt <em>Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Att</em>'.
   * @see org.xtext.example.myModel.cSharp.EnumMemberDeclaration#getAtt()
   * @see #getEnumMemberDeclaration()
   * @generated
   */
  EReference getEnumMemberDeclaration_Att();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EnumMemberDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.myModel.cSharp.EnumMemberDeclaration#getName()
   * @see #getEnumMemberDeclaration()
   * @generated
   */
  EReference getEnumMemberDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EnumMemberDeclaration#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.myModel.cSharp.EnumMemberDeclaration#getExp()
   * @see #getEnumMemberDeclaration()
   * @generated
   */
  EReference getEnumMemberDeclaration_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Statement#getLabelStat <em>Label Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.Statement#getLabelStat()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_LabelStat();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Statement#getDeclareStat <em>Declare Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declare Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.Statement#getDeclareStat()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_DeclareStat();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.Statement#getEmbeddedStat <em>Embedded Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Embedded Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.Statement#getEmbeddedStat()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_EmbeddedStat();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.DeclarationStatment <em>Declaration Statment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration Statment</em>'.
   * @see org.xtext.example.myModel.cSharp.DeclarationStatment
   * @generated
   */
  EClass getDeclarationStatment();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.DeclarationStatment#getLocalVariableDeclaration <em>Local Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Local Variable Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.DeclarationStatment#getLocalVariableDeclaration()
   * @see #getDeclarationStatment()
   * @generated
   */
  EReference getDeclarationStatment_LocalVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.DeclarationStatment#getLocalCOnstant <em>Local COnstant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Local COnstant</em>'.
   * @see org.xtext.example.myModel.cSharp.DeclarationStatment#getLocalCOnstant()
   * @see #getDeclarationStatment()
   * @generated
   */
  EReference getDeclarationStatment_LocalCOnstant();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.LocalconstantDeclaration <em>Localconstant Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Localconstant Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.LocalconstantDeclaration
   * @generated
   */
  EClass getLocalconstantDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.LocalconstantDeclaration#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo</em>'.
   * @see org.xtext.example.myModel.cSharp.LocalconstantDeclaration#getTipo()
   * @see #getLocalconstantDeclaration()
   * @generated
   */
  EReference getLocalconstantDeclaration_Tipo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.LocalconstantDeclaration#getConstDeclarator <em>Const Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Const Declarator</em>'.
   * @see org.xtext.example.myModel.cSharp.LocalconstantDeclaration#getConstDeclarator()
   * @see #getLocalconstantDeclaration()
   * @generated
   */
  EReference getLocalconstantDeclaration_ConstDeclarator();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.LabeledStatement <em>Labeled Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Labeled Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.LabeledStatement
   * @generated
   */
  EClass getLabeledStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.LabeledStatement#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.xtext.example.myModel.cSharp.LabeledStatement#getId()
   * @see #getLabeledStatement()
   * @generated
   */
  EReference getLabeledStatement_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.LabeledStatement#getStat <em>Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.LabeledStatement#getStat()
   * @see #getLabeledStatement()
   * @generated
   */
  EReference getLabeledStatement_Stat();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.EmbeddedStatement <em>Embedded Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Embedded Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.EmbeddedStatement
   * @generated
   */
  EClass getEmbeddedStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EmbeddedStatement#getMaybeEmpty <em>Maybe Empty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Maybe Empty</em>'.
   * @see org.xtext.example.myModel.cSharp.EmbeddedStatement#getMaybeEmpty()
   * @see #getEmbeddedStatement()
   * @generated
   */
  EReference getEmbeddedStatement_MaybeEmpty();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EmbeddedStatement#getStatExp <em>Stat Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stat Exp</em>'.
   * @see org.xtext.example.myModel.cSharp.EmbeddedStatement#getStatExp()
   * @see #getEmbeddedStatement()
   * @generated
   */
  EReference getEmbeddedStatement_StatExp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EmbeddedStatement#getSelectionStat <em>Selection Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selection Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.EmbeddedStatement#getSelectionStat()
   * @see #getEmbeddedStatement()
   * @generated
   */
  EReference getEmbeddedStatement_SelectionStat();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EmbeddedStatement#getIterationStat <em>Iteration Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iteration Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.EmbeddedStatement#getIterationStat()
   * @see #getEmbeddedStatement()
   * @generated
   */
  EReference getEmbeddedStatement_IterationStat();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EmbeddedStatement#getJumpStat <em>Jump Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Jump Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.EmbeddedStatement#getJumpStat()
   * @see #getEmbeddedStatement()
   * @generated
   */
  EReference getEmbeddedStatement_JumpStat();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EmbeddedStatement#getTryStat <em>Try Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Try Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.EmbeddedStatement#getTryStat()
   * @see #getEmbeddedStatement()
   * @generated
   */
  EReference getEmbeddedStatement_TryStat();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EmbeddedStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.example.myModel.cSharp.EmbeddedStatement#getBlock()
   * @see #getEmbeddedStatement()
   * @generated
   */
  EReference getEmbeddedStatement_Block();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EmbeddedStatement#getLockStat <em>Lock Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lock Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.EmbeddedStatement#getLockStat()
   * @see #getEmbeddedStatement()
   * @generated
   */
  EReference getEmbeddedStatement_LockStat();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.EmbeddedStatement#getUsingStat <em>Using Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Using Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.EmbeddedStatement#getUsingStat()
   * @see #getEmbeddedStatement()
   * @generated
   */
  EReference getEmbeddedStatement_UsingStat();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.UsingStatement <em>Using Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Using Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.UsingStatement
   * @generated
   */
  EClass getUsingStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.UsingStatement#getResourcAquisition <em>Resourc Aquisition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resourc Aquisition</em>'.
   * @see org.xtext.example.myModel.cSharp.UsingStatement#getResourcAquisition()
   * @see #getUsingStatement()
   * @generated
   */
  EReference getUsingStatement_ResourcAquisition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.UsingStatement#getEmbeddedStat <em>Embedded Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Embedded Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.UsingStatement#getEmbeddedStat()
   * @see #getUsingStatement()
   * @generated
   */
  EReference getUsingStatement_EmbeddedStat();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ResourceAquisition <em>Resource Aquisition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Aquisition</em>'.
   * @see org.xtext.example.myModel.cSharp.ResourceAquisition
   * @generated
   */
  EClass getResourceAquisition();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.LocalVariableDeclaration <em>Local Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Variable Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.LocalVariableDeclaration
   * @generated
   */
  EClass getLocalVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.LocalVariableDeclaration#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo</em>'.
   * @see org.xtext.example.myModel.cSharp.LocalVariableDeclaration#getTipo()
   * @see #getLocalVariableDeclaration()
   * @generated
   */
  EReference getLocalVariableDeclaration_Tipo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.LocalVariableDeclaration#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable</em>'.
   * @see org.xtext.example.myModel.cSharp.LocalVariableDeclaration#getVariable()
   * @see #getLocalVariableDeclaration()
   * @generated
   */
  EReference getLocalVariableDeclaration_Variable();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.LockStatement <em>Lock Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lock Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.LockStatement
   * @generated
   */
  EClass getLockStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.LockStatement#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.myModel.cSharp.LockStatement#getExp()
   * @see #getLockStatement()
   * @generated
   */
  EReference getLockStatement_Exp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.LockStatement#getEmbeddedStat <em>Embedded Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Embedded Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.LockStatement#getEmbeddedStat()
   * @see #getLockStatement()
   * @generated
   */
  EReference getLockStatement_EmbeddedStat();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.TryStatement <em>Try Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Try Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.TryStatement
   * @generated
   */
  EClass getTryStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.TryStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.example.myModel.cSharp.TryStatement#getBlock()
   * @see #getTryStatement()
   * @generated
   */
  EReference getTryStatement_Block();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.TryStatement#getCatchClauses <em>Catch Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Catch Clauses</em>'.
   * @see org.xtext.example.myModel.cSharp.TryStatement#getCatchClauses()
   * @see #getTryStatement()
   * @generated
   */
  EReference getTryStatement_CatchClauses();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.TryStatement#getFinally <em>Finally</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Finally</em>'.
   * @see org.xtext.example.myModel.cSharp.TryStatement#getFinally()
   * @see #getTryStatement()
   * @generated
   */
  EReference getTryStatement_Finally();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.TryStatement#getFinallyClause <em>Finally Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Finally Clause</em>'.
   * @see org.xtext.example.myModel.cSharp.TryStatement#getFinallyClause()
   * @see #getTryStatement()
   * @generated
   */
  EReference getTryStatement_FinallyClause();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.FinallyClause <em>Finally Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Finally Clause</em>'.
   * @see org.xtext.example.myModel.cSharp.FinallyClause
   * @generated
   */
  EClass getFinallyClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.FinallyClause#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.example.myModel.cSharp.FinallyClause#getBlock()
   * @see #getFinallyClause()
   * @generated
   */
  EReference getFinallyClause_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.CatchClauses <em>Catch Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Catch Clauses</em>'.
   * @see org.xtext.example.myModel.cSharp.CatchClauses
   * @generated
   */
  EClass getCatchClauses();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.CatchClauses#getSpeciCatchClause <em>Speci Catch Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Speci Catch Clause</em>'.
   * @see org.xtext.example.myModel.cSharp.CatchClauses#getSpeciCatchClause()
   * @see #getCatchClauses()
   * @generated
   */
  EReference getCatchClauses_SpeciCatchClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.CatchClauses#getGenCatchClause <em>Gen Catch Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gen Catch Clause</em>'.
   * @see org.xtext.example.myModel.cSharp.CatchClauses#getGenCatchClause()
   * @see #getCatchClauses()
   * @generated
   */
  EReference getCatchClauses_GenCatchClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.CatchClauses#getSpecCatchClause <em>Spec Catch Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spec Catch Clause</em>'.
   * @see org.xtext.example.myModel.cSharp.CatchClauses#getSpecCatchClause()
   * @see #getCatchClauses()
   * @generated
   */
  EReference getCatchClauses_SpecCatchClause();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.GeneralCatchclause <em>General Catchclause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>General Catchclause</em>'.
   * @see org.xtext.example.myModel.cSharp.GeneralCatchclause
   * @generated
   */
  EClass getGeneralCatchclause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.GeneralCatchclause#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.example.myModel.cSharp.GeneralCatchclause#getBlock()
   * @see #getGeneralCatchclause()
   * @generated
   */
  EReference getGeneralCatchclause_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.SpecificCatchClause <em>Specific Catch Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specific Catch Clause</em>'.
   * @see org.xtext.example.myModel.cSharp.SpecificCatchClause
   * @generated
   */
  EClass getSpecificCatchClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.SpecificCatchClause#getQualiId <em>Quali Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quali Id</em>'.
   * @see org.xtext.example.myModel.cSharp.SpecificCatchClause#getQualiId()
   * @see #getSpecificCatchClause()
   * @generated
   */
  EReference getSpecificCatchClause_QualiId();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.SpecificCatchClause#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.xtext.example.myModel.cSharp.SpecificCatchClause#getId()
   * @see #getSpecificCatchClause()
   * @generated
   */
  EReference getSpecificCatchClause_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.SpecificCatchClause#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.example.myModel.cSharp.SpecificCatchClause#getBlock()
   * @see #getSpecificCatchClause()
   * @generated
   */
  EReference getSpecificCatchClause_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.JumpStatement <em>Jump Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jump Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.JumpStatement
   * @generated
   */
  EClass getJumpStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.JumpStatement#getBreakStat <em>Break Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Break Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.JumpStatement#getBreakStat()
   * @see #getJumpStatement()
   * @generated
   */
  EReference getJumpStatement_BreakStat();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.JumpStatement#getContinueStat <em>Continue Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Continue Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.JumpStatement#getContinueStat()
   * @see #getJumpStatement()
   * @generated
   */
  EReference getJumpStatement_ContinueStat();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.JumpStatement#getGotoStat <em>Goto Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Goto Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.JumpStatement#getGotoStat()
   * @see #getJumpStatement()
   * @generated
   */
  EReference getJumpStatement_GotoStat();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.JumpStatement#getReturnStat <em>Return Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.JumpStatement#getReturnStat()
   * @see #getJumpStatement()
   * @generated
   */
  EReference getJumpStatement_ReturnStat();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.JumpStatement#getThrowStat <em>Throw Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Throw Stat</em>'.
   * @see org.xtext.example.myModel.cSharp.JumpStatement#getThrowStat()
   * @see #getJumpStatement()
   * @generated
   */
  EReference getJumpStatement_ThrowStat();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ThrowStatement <em>Throw Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Throw Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.ThrowStatement
   * @generated
   */
  EClass getThrowStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ThrowStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.ThrowStatement#getExpression()
   * @see #getThrowStatement()
   * @generated
   */
  EReference getThrowStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ReturnStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.ReturnStatement#getExpression()
   * @see #getReturnStatement()
   * @generated
   */
  EReference getReturnStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.GotoStatement <em>Goto Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goto Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.GotoStatement
   * @generated
   */
  EClass getGotoStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.GotoStatement#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.xtext.example.myModel.cSharp.GotoStatement#getId()
   * @see #getGotoStatement()
   * @generated
   */
  EReference getGotoStatement_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.GotoStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.GotoStatement#getExpression()
   * @see #getGotoStatement()
   * @generated
   */
  EReference getGotoStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ContinueStatement <em>Continue Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Continue Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.ContinueStatement
   * @generated
   */
  EClass getContinueStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.BreakStatement <em>Break Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Break Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.BreakStatement
   * @generated
   */
  EClass getBreakStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.IterationStatement <em>Iteration Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Iteration Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.IterationStatement
   * @generated
   */
  EClass getIterationStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.IterationStatement#getWhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.IterationStatement#getWhileStatement()
   * @see #getIterationStatement()
   * @generated
   */
  EReference getIterationStatement_WhileStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.IterationStatement#getDoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Do Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.IterationStatement#getDoStatement()
   * @see #getIterationStatement()
   * @generated
   */
  EReference getIterationStatement_DoStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.IterationStatement#getForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.IterationStatement#getForStatement()
   * @see #getIterationStatement()
   * @generated
   */
  EReference getIterationStatement_ForStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.IterationStatement#getForeachStatement <em>Foreach Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Foreach Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.IterationStatement#getForeachStatement()
   * @see #getIterationStatement()
   * @generated
   */
  EReference getIterationStatement_ForeachStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ForeachStatement <em>Foreach Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreach Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.ForeachStatement
   * @generated
   */
  EClass getForeachStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ForeachStatement#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo</em>'.
   * @see org.xtext.example.myModel.cSharp.ForeachStatement#getTipo()
   * @see #getForeachStatement()
   * @generated
   */
  EReference getForeachStatement_Tipo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ForeachStatement#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.xtext.example.myModel.cSharp.ForeachStatement#getId()
   * @see #getForeachStatement()
   * @generated
   */
  EReference getForeachStatement_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ForeachStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.ForeachStatement#getExpression()
   * @see #getForeachStatement()
   * @generated
   */
  EReference getForeachStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ForeachStatement#getEmbeddedStatement <em>Embedded Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Embedded Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.ForeachStatement#getEmbeddedStatement()
   * @see #getForeachStatement()
   * @generated
   */
  EReference getForeachStatement_EmbeddedStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.ForStatement
   * @generated
   */
  EClass getForStatement();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.ForStatement#getForInitializer <em>For Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>For Initializer</em>'.
   * @see org.xtext.example.myModel.cSharp.ForStatement#getForInitializer()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_ForInitializer();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.ForStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.ForStatement#getExpression()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.ForStatement#getStatementExpressionList <em>Statement Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statement Expression List</em>'.
   * @see org.xtext.example.myModel.cSharp.ForStatement#getStatementExpressionList()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_StatementExpressionList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ForStatement#getEmbeddedStatement <em>Embedded Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Embedded Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.ForStatement#getEmbeddedStatement()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_EmbeddedStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ForInitializer <em>For Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Initializer</em>'.
   * @see org.xtext.example.myModel.cSharp.ForInitializer
   * @generated
   */
  EClass getForInitializer();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ForInitializer#getLocalVariableDeclaration <em>Local Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Local Variable Declaration</em>'.
   * @see org.xtext.example.myModel.cSharp.ForInitializer#getLocalVariableDeclaration()
   * @see #getForInitializer()
   * @generated
   */
  EReference getForInitializer_LocalVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ForInitializer#getStatementExpressionList <em>Statement Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Expression List</em>'.
   * @see org.xtext.example.myModel.cSharp.ForInitializer#getStatementExpressionList()
   * @see #getForInitializer()
   * @generated
   */
  EReference getForInitializer_StatementExpressionList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.StatementExpressionList <em>Statement Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Expression List</em>'.
   * @see org.xtext.example.myModel.cSharp.StatementExpressionList
   * @generated
   */
  EClass getStatementExpressionList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.StatementExpressionList#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
   * @see org.xtext.example.myModel.cSharp.StatementExpressionList#getList()
   * @see #getStatementExpressionList()
   * @generated
   */
  EReference getStatementExpressionList_List();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.StatementExpression <em>Statement Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.StatementExpression
   * @generated
   */
  EClass getStatementExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.StatementExpression#getPrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.StatementExpression#getPrimaryExpression()
   * @see #getStatementExpression()
   * @generated
   */
  EReference getStatementExpression_PrimaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.StatementExpression#getArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument List</em>'.
   * @see org.xtext.example.myModel.cSharp.StatementExpression#getArgumentList()
   * @see #getStatementExpression()
   * @generated
   */
  EReference getStatementExpression_ArgumentList();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.myModel.cSharp.StatementExpression#getIncrimentDecrement <em>Incriment Decrement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Incriment Decrement</em>'.
   * @see org.xtext.example.myModel.cSharp.StatementExpression#getIncrimentDecrement()
   * @see #getStatementExpression()
   * @generated
   */
  EAttribute getStatementExpression_IncrimentDecrement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.StatementExpression#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo</em>'.
   * @see org.xtext.example.myModel.cSharp.StatementExpression#getTipo()
   * @see #getStatementExpression()
   * @generated
   */
  EReference getStatementExpression_Tipo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.StatementExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.StatementExpression#getUnaryExpression()
   * @see #getStatementExpression()
   * @generated
   */
  EReference getStatementExpression_UnaryExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.myModel.cSharp.StatementExpression#getAssignementOperator <em>Assignement Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assignement Operator</em>'.
   * @see org.xtext.example.myModel.cSharp.StatementExpression#getAssignementOperator()
   * @see #getStatementExpression()
   * @generated
   */
  EAttribute getStatementExpression_AssignementOperator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.StatementExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.StatementExpression#getExpression()
   * @see #getStatementExpression()
   * @generated
   */
  EReference getStatementExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression
   * @generated
   */
  EClass getPrimaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.PrimaryExpression#getNonArrayType <em>Non Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Non Array Type</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression#getNonArrayType()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_NonArrayType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.PrimaryExpression#getExpressionList <em>Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression List</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression#getExpressionList()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_ExpressionList();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.myModel.cSharp.PrimaryExpression#getRankSpecifier <em>Rank Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Rank Specifier</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression#getRankSpecifier()
   * @see #getPrimaryExpression()
   * @generated
   */
  EAttribute getPrimaryExpression_RankSpecifier();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.PrimaryExpression#getArrayInitializer <em>Array Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Array Initializer</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression#getArrayInitializer()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_ArrayInitializer();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.PrimaryExpression#getArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Type</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression#getArrayType()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_ArrayType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.PrimaryExpression#getArrayInitializer2 <em>Array Initializer2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Initializer2</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression#getArrayInitializer2()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_ArrayInitializer2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.PrimaryExpression#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression#getTipo()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_Tipo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.PrimaryExpression#getArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument List</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression#getArgumentList()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_ArgumentList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.PrimaryExpression#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression#getId()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_Id();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.myModel.cSharp.PrimaryExpression#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression#getLiteral()
   * @see #getPrimaryExpression()
   * @generated
   */
  EAttribute getPrimaryExpression_Literal();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.PrimaryExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression#getExpression()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.myModel.cSharp.PrimaryExpression#getPredefinedType <em>Predefined Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Predefined Type</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression#getPredefinedType()
   * @see #getPrimaryExpression()
   * @generated
   */
  EAttribute getPrimaryExpression_PredefinedType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.PrimaryExpression#getTypeOrVoid <em>Type Or Void</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Or Void</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression#getTypeOrVoid()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_TypeOrVoid();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.PrimaryExpression#getPrimaryExoression2 <em>Primary Exoression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary Exoression2</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression#getPrimaryExoression2()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_PrimaryExoression2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.PrimaryExpression2 <em>Primary Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expression2</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression2
   * @generated
   */
  EClass getPrimaryExpression2();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.PrimaryExpression2#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression2#getId()
   * @see #getPrimaryExpression2()
   * @generated
   */
  EReference getPrimaryExpression2_Id();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.PrimaryExpression2#getArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Argument List</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression2#getArgumentList()
   * @see #getPrimaryExpression2()
   * @generated
   */
  EReference getPrimaryExpression2_ArgumentList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.PrimaryExpression2#getExpressionList <em>Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression List</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression2#getExpressionList()
   * @see #getPrimaryExpression2()
   * @generated
   */
  EReference getPrimaryExpression2_ExpressionList();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.myModel.cSharp.PrimaryExpression2#getIncrementeDecrement <em>Incremente Decrement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Incremente Decrement</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression2#getIncrementeDecrement()
   * @see #getPrimaryExpression2()
   * @generated
   */
  EAttribute getPrimaryExpression2_IncrementeDecrement();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.PrimaryExpression2#getPrimaryExpression2 <em>Primary Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Primary Expression2</em>'.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression2#getPrimaryExpression2()
   * @see #getPrimaryExpression2()
   * @generated
   */
  EReference getPrimaryExpression2_PrimaryExpression2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.DoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.DoStatement
   * @generated
   */
  EClass getDoStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.DoStatement#getEmbeddedStatement <em>Embedded Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Embedded Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.DoStatement#getEmbeddedStatement()
   * @see #getDoStatement()
   * @generated
   */
  EReference getDoStatement_EmbeddedStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.DoStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.DoStatement#getExpression()
   * @see #getDoStatement()
   * @generated
   */
  EReference getDoStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.WhileStatement
   * @generated
   */
  EClass getWhileStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.WhileStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.WhileStatement#getExpression()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.WhileStatement#getEmbeddedStatement <em>Embedded Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Embedded Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.WhileStatement#getEmbeddedStatement()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_EmbeddedStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.SelectionStatement <em>Selection Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.SelectionStatement
   * @generated
   */
  EClass getSelectionStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.SelectionStatement#getIfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.SelectionStatement#getIfStatement()
   * @see #getSelectionStatement()
   * @generated
   */
  EReference getSelectionStatement_IfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.SelectionStatement#getSwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switch Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.SelectionStatement#getSwitchStatement()
   * @see #getSelectionStatement()
   * @generated
   */
  EReference getSelectionStatement_SwitchStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.SwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.SwitchStatement
   * @generated
   */
  EClass getSwitchStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.SwitchStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.SwitchStatement#getExpression()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.SwitchStatement#getSwitchSection <em>Switch Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Switch Section</em>'.
   * @see org.xtext.example.myModel.cSharp.SwitchStatement#getSwitchSection()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_SwitchSection();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.SwitchSection <em>Switch Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Section</em>'.
   * @see org.xtext.example.myModel.cSharp.SwitchSection
   * @generated
   */
  EClass getSwitchSection();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.SwitchSection#getSwitchlabel <em>Switchlabel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Switchlabel</em>'.
   * @see org.xtext.example.myModel.cSharp.SwitchSection#getSwitchlabel()
   * @see #getSwitchSection()
   * @generated
   */
  EReference getSwitchSection_Switchlabel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.SwitchSection#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.SwitchSection#getStatement()
   * @see #getSwitchSection()
   * @generated
   */
  EReference getSwitchSection_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.SwitchLabel <em>Switch Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Label</em>'.
   * @see org.xtext.example.myModel.cSharp.SwitchLabel
   * @generated
   */
  EClass getSwitchLabel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.SwitchLabel#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.SwitchLabel#getExpression()
   * @see #getSwitchLabel()
   * @generated
   */
  EReference getSwitchLabel_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.IfStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.myModel.cSharp.IfStatement#getExpression()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.IfStatement#getEmbeddedStatement <em>Embedded Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Embedded Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.IfStatement#getEmbeddedStatement()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_EmbeddedStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.IfStatement#getElsePart <em>Else Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Part</em>'.
   * @see org.xtext.example.myModel.cSharp.IfStatement#getElsePart()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_ElsePart();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.ElsePart <em>Else Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Else Part</em>'.
   * @see org.xtext.example.myModel.cSharp.ElsePart
   * @generated
   */
  EClass getElsePart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.myModel.cSharp.ElsePart#getEmbeddedStatement <em>Embedded Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Embedded Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.ElsePart#getEmbeddedStatement()
   * @see #getElsePart()
   * @generated
   */
  EReference getElsePart_EmbeddedStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.xtext.example.myModel.cSharp.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.Block#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.Block#getStatement()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.MaybeEmptyBlock <em>Maybe Empty Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Maybe Empty Block</em>'.
   * @see org.xtext.example.myModel.cSharp.MaybeEmptyBlock
   * @generated
   */
  EClass getMaybeEmptyBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.myModel.cSharp.MaybeEmptyBlock#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statement</em>'.
   * @see org.xtext.example.myModel.cSharp.MaybeEmptyBlock#getStatement()
   * @see #getMaybeEmptyBlock()
   * @generated
   */
  EReference getMaybeEmptyBlock_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.myModel.cSharp.Void <em>Void</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Void</em>'.
   * @see org.xtext.example.myModel.cSharp.Void
   * @generated
   */
  EClass getVoid();

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
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__INPUTS = eINSTANCE.getModel_Inputs();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.IdentifierImpl <em>Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.IdentifierImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getIdentifier()
     * @generated
     */
    EClass IDENTIFIER = eINSTANCE.getIdentifier();

    /**
     * The meta object literal for the '<em><b>Formal List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER__FORMAL_LIST = eINSTANCE.getIdentifier_FormalList();

    /**
     * The meta object literal for the '<em><b>Const Initializer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER__CONST_INITIALIZER = eINSTANCE.getIdentifier_ConstInitializer();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.CompilationUnitImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getCompilationUnit()
     * @generated
     */
    EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

    /**
     * The meta object literal for the '<em><b>Using Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__USING_DIRECTIVES = eINSTANCE.getCompilationUnit_UsingDirectives();

    /**
     * The meta object literal for the '<em><b>Global Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__GLOBAL_ATT = eINSTANCE.getCompilationUnit_GlobalAtt();

    /**
     * The meta object literal for the '<em><b>Name Spaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__NAME_SPACES = eINSTANCE.getCompilationUnit_NameSpaces();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.NamespaceMemberDeclarationImpl <em>Namespace Member Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.NamespaceMemberDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getNamespaceMemberDeclaration()
     * @generated
     */
    EClass NAMESPACE_MEMBER_DECLARATION = eINSTANCE.getNamespaceMemberDeclaration();

    /**
     * The meta object literal for the '<em><b>Name Declaretion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_MEMBER_DECLARATION__NAME_DECLARETION = eINSTANCE.getNamespaceMemberDeclaration_NameDeclaretion();

    /**
     * The meta object literal for the '<em><b>Type Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_MEMBER_DECLARATION__TYPE_DECLARATION = eINSTANCE.getNamespaceMemberDeclaration_TypeDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.NamespaceDeclarationImpl <em>Namespace Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.NamespaceDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getNamespaceDeclaration()
     * @generated
     */
    EClass NAMESPACE_DECLARATION = eINSTANCE.getNamespaceDeclaration();

    /**
     * The meta object literal for the '<em><b>QId</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_DECLARATION__QID = eINSTANCE.getNamespaceDeclaration_QId();

    /**
     * The meta object literal for the '<em><b>Name Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_DECLARATION__NAME_BODY = eINSTANCE.getNamespaceDeclaration_NameBody();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.NamespaceBodyImpl <em>Namespace Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.NamespaceBodyImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getNamespaceBody()
     * @generated
     */
    EClass NAMESPACE_BODY = eINSTANCE.getNamespaceBody();

    /**
     * The meta object literal for the '<em><b>Using Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_BODY__USING_DIRECTIVES = eINSTANCE.getNamespaceBody_UsingDirectives();

    /**
     * The meta object literal for the '<em><b>Name Spaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_BODY__NAME_SPACES = eINSTANCE.getNamespaceBody_NameSpaces();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.TypeDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getTypeDeclaration()
     * @generated
     */
    EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Class Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__CLASS_DECLARATION = eINSTANCE.getTypeDeclaration_ClassDeclaration();

    /**
     * The meta object literal for the '<em><b>Mod</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DECLARATION__MOD = eINSTANCE.getTypeDeclaration_Mod();

    /**
     * The meta object literal for the '<em><b>Struct Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__STRUCT_DECLARATION = eINSTANCE.getTypeDeclaration_StructDeclaration();

    /**
     * The meta object literal for the '<em><b>Interface Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__INTERFACE_DECLARATION = eINSTANCE.getTypeDeclaration_InterfaceDeclaration();

    /**
     * The meta object literal for the '<em><b>Enum Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__ENUM_DECLARATION = eINSTANCE.getTypeDeclaration_EnumDeclaration();

    /**
     * The meta object literal for the '<em><b>Delegate Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__DELEGATE_DECLARATION = eINSTANCE.getTypeDeclaration_DelegateDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.DelegateDeclarationImpl <em>Delegate Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.DelegateDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getDelegateDeclaration()
     * @generated
     */
    EClass DELEGATE_DECLARATION = eINSTANCE.getDelegateDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.EnumDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getEnumDeclaration()
     * @generated
     */
    EClass ENUM_DECLARATION = eINSTANCE.getEnumDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECLARATION__NAME = eINSTANCE.getEnumDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Int Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECLARATION__INT_TYPE = eINSTANCE.getEnumDeclaration_IntType();

    /**
     * The meta object literal for the '<em><b>Enum Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECLARATION__ENUM_BODY = eINSTANCE.getEnumDeclaration_EnumBody();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.InterfaceDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfaceDeclaration()
     * @generated
     */
    EClass INTERFACE_DECLARATION = eINSTANCE.getInterfaceDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECLARATION__NAME = eINSTANCE.getInterfaceDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>QIdentifiers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECLARATION__QIDENTIFIERS = eINSTANCE.getInterfaceDeclaration_QIdentifiers();

    /**
     * The meta object literal for the '<em><b>Inter Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECLARATION__INTER_BODY = eINSTANCE.getInterfaceDeclaration_InterBody();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.InterfaceBodyImpl <em>Interface Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.InterfaceBodyImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfaceBody()
     * @generated
     */
    EClass INTERFACE_BODY = eINSTANCE.getInterfaceBody();

    /**
     * The meta object literal for the '<em><b>Interface Member Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_BODY__INTERFACE_MEMBER_DECLARATIONS = eINSTANCE.getInterfaceBody_InterfaceMemberDeclarations();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.InterfaceMemberDeclarationImpl <em>Interface Member Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.InterfaceMemberDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfaceMemberDeclaration()
     * @generated
     */
    EClass INTERFACE_MEMBER_DECLARATION = eINSTANCE.getInterfaceMemberDeclaration();

    /**
     * The meta object literal for the '<em><b>Intermethod Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_MEMBER_DECLARATION__INTERMETHOD_DECLARATION = eINSTANCE.getInterfaceMemberDeclaration_IntermethodDeclaration();

    /**
     * The meta object literal for the '<em><b>Inter Event Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_MEMBER_DECLARATION__INTER_EVENT_DECLARATION = eINSTANCE.getInterfaceMemberDeclaration_InterEventDeclaration();

    /**
     * The meta object literal for the '<em><b>Type1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_MEMBER_DECLARATION__TYPE1 = eINSTANCE.getInterfaceMemberDeclaration_Type1();

    /**
     * The meta object literal for the '<em><b>Interface Indexer Decla</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_MEMBER_DECLARATION__INTERFACE_INDEXER_DECLA = eINSTANCE.getInterfaceMemberDeclaration_InterfaceIndexerDecla();

    /**
     * The meta object literal for the '<em><b>Inter Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_MEMBER_DECLARATION__INTER_PROPERTY = eINSTANCE.getInterfaceMemberDeclaration_InterProperty();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.InterfaceIndexerDeclarationImpl <em>Interface Indexer Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.InterfaceIndexerDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfaceIndexerDeclaration()
     * @generated
     */
    EClass INTERFACE_INDEXER_DECLARATION = eINSTANCE.getInterfaceIndexerDeclaration();

    /**
     * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_INDEXER_DECLARATION__PARAMETER_LIST = eINSTANCE.getInterfaceIndexerDeclaration_ParameterList();

    /**
     * The meta object literal for the '<em><b>Inter Accessors</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_INDEXER_DECLARATION__INTER_ACCESSORS = eINSTANCE.getInterfaceIndexerDeclaration_InterAccessors();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.InterfaceEventDeclarationImpl <em>Interface Event Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.InterfaceEventDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfaceEventDeclaration()
     * @generated
     */
    EClass INTERFACE_EVENT_DECLARATION = eINSTANCE.getInterfaceEventDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_EVENT_DECLARATION__TYPE = eINSTANCE.getInterfaceEventDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_EVENT_DECLARATION__NAME = eINSTANCE.getInterfaceEventDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.InterfacePropertyDeclarationImpl <em>Interface Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.InterfacePropertyDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfacePropertyDeclaration()
     * @generated
     */
    EClass INTERFACE_PROPERTY_DECLARATION = eINSTANCE.getInterfacePropertyDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_PROPERTY_DECLARATION__NAME = eINSTANCE.getInterfacePropertyDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Inter Accessor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_PROPERTY_DECLARATION__INTER_ACCESSOR = eINSTANCE.getInterfacePropertyDeclaration_InterAccessor();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.InterfaceAccessorsImpl <em>Interface Accessors</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.InterfaceAccessorsImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfaceAccessors()
     * @generated
     */
    EClass INTERFACE_ACCESSORS = eINSTANCE.getInterfaceAccessors();

    /**
     * The meta object literal for the '<em><b>Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_ACCESSORS__ATT = eINSTANCE.getInterfaceAccessors_Att();

    /**
     * The meta object literal for the '<em><b>New Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_ACCESSORS__NEW_ATT = eINSTANCE.getInterfaceAccessors_NewAtt();

    /**
     * The meta object literal for the '<em><b>Other Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_ACCESSORS__OTHER_ATT = eINSTANCE.getInterfaceAccessors_OtherAtt();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.InterfaceMethodDeclarationImpl <em>Interface Method Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.InterfaceMethodDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getInterfaceMethodDeclaration()
     * @generated
     */
    EClass INTERFACE_METHOD_DECLARATION = eINSTANCE.getInterfaceMethodDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_METHOD_DECLARATION__TYPE = eINSTANCE.getInterfaceMethodDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_METHOD_DECLARATION__NAME = eINSTANCE.getInterfaceMethodDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_METHOD_DECLARATION__PARAMETER_LIST = eINSTANCE.getInterfaceMethodDeclaration_ParameterList();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.StructDeclarationImpl <em>Struct Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.StructDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStructDeclaration()
     * @generated
     */
    EClass STRUCT_DECLARATION = eINSTANCE.getStructDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_DECLARATION__NAME = eINSTANCE.getStructDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Qual Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_DECLARATION__QUAL_ID = eINSTANCE.getStructDeclaration_QualId();

    /**
     * The meta object literal for the '<em><b>Structbody</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_DECLARATION__STRUCTBODY = eINSTANCE.getStructDeclaration_Structbody();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.StructBodyImpl <em>Struct Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.StructBodyImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStructBody()
     * @generated
     */
    EClass STRUCT_BODY = eINSTANCE.getStructBody();

    /**
     * The meta object literal for the '<em><b>Struct Member</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_BODY__STRUCT_MEMBER = eINSTANCE.getStructBody_StructMember();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.StructMemberDeclarationsImpl <em>Struct Member Declarations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.StructMemberDeclarationsImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStructMemberDeclarations()
     * @generated
     */
    EClass STRUCT_MEMBER_DECLARATIONS = eINSTANCE.getStructMemberDeclarations();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.StructMemberDeclarations2Impl <em>Struct Member Declarations2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.StructMemberDeclarations2Impl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStructMemberDeclarations2()
     * @generated
     */
    EClass STRUCT_MEMBER_DECLARATIONS2 = eINSTANCE.getStructMemberDeclarations2();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.StructMemberDeclarationImpl <em>Struct Member Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.StructMemberDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStructMemberDeclaration()
     * @generated
     */
    EClass STRUCT_MEMBER_DECLARATION = eINSTANCE.getStructMemberDeclaration();

    /**
     * The meta object literal for the '<em><b>Struct Member2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_MEMBER_DECLARATION__STRUCT_MEMBER2 = eINSTANCE.getStructMemberDeclaration_StructMember2();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ClassDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getClassDeclaration()
     * @generated
     */
    EClass CLASS_DECLARATION = eINSTANCE.getClassDeclaration();

    /**
     * The meta object literal for the '<em><b>Class Modifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLARATION__CLASS_MODIFIER = eINSTANCE.getClassDeclaration_ClassModifier();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__CLASS_NAME = eINSTANCE.getClassDeclaration_ClassName();

    /**
     * The meta object literal for the '<em><b>Class Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__CLASS_BASE = eINSTANCE.getClassDeclaration_ClassBase();

    /**
     * The meta object literal for the '<em><b>Class Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__CLASS_BODY = eINSTANCE.getClassDeclaration_ClassBody();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ClassBodyImpl <em>Class Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ClassBodyImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getClassBody()
     * @generated
     */
    EClass CLASS_BODY = eINSTANCE.getClassBody();

    /**
     * The meta object literal for the '<em><b>Class Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_BODY__CLASS_DECLARATION = eINSTANCE.getClassBody_ClassDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ClassMemberDeclarationImpl <em>Class Member Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ClassMemberDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getClassMemberDeclaration()
     * @generated
     */
    EClass CLASS_MEMBER_DECLARATION = eINSTANCE.getClassMemberDeclaration();

    /**
     * The meta object literal for the '<em><b>Class Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MEMBER_DECLARATION__CLASS_ATT = eINSTANCE.getClassMemberDeclaration_ClassAtt();

    /**
     * The meta object literal for the '<em><b>Const Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MEMBER_DECLARATION__CONST_DECLARATION = eINSTANCE.getClassMemberDeclaration_ConstDeclaration();

    /**
     * The meta object literal for the '<em><b>Field Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MEMBER_DECLARATION__FIELD_DECLARATION = eINSTANCE.getClassMemberDeclaration_FieldDeclaration();

    /**
     * The meta object literal for the '<em><b>Property Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MEMBER_DECLARATION__PROPERTY_DECLARATION = eINSTANCE.getClassMemberDeclaration_PropertyDeclaration();

    /**
     * The meta object literal for the '<em><b>Event Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MEMBER_DECLARATION__EVENT_DECLARATION = eINSTANCE.getClassMemberDeclaration_EventDeclaration();

    /**
     * The meta object literal for the '<em><b>Index Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MEMBER_DECLARATION__INDEX_DECLARATION = eINSTANCE.getClassMemberDeclaration_IndexDeclaration();

    /**
     * The meta object literal for the '<em><b>Op Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MEMBER_DECLARATION__OP_DECLARATION = eINSTANCE.getClassMemberDeclaration_OpDeclaration();

    /**
     * The meta object literal for the '<em><b>Constructor Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MEMBER_DECLARATION__CONSTRUCTOR_DECLARATION = eINSTANCE.getClassMemberDeclaration_ConstructorDeclaration();

    /**
     * The meta object literal for the '<em><b>Destructor Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MEMBER_DECLARATION__DESTRUCTOR_DECLARATION = eINSTANCE.getClassMemberDeclaration_DestructorDeclaration();

    /**
     * The meta object literal for the '<em><b>Static Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MEMBER_DECLARATION__STATIC_DECLARATION = eINSTANCE.getClassMemberDeclaration_StaticDeclaration();

    /**
     * The meta object literal for the '<em><b>Type Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MEMBER_DECLARATION__TYPE_DECLARATION = eINSTANCE.getClassMemberDeclaration_TypeDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.StaticConstructorDeclarationImpl <em>Static Constructor Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.StaticConstructorDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStaticConstructorDeclaration()
     * @generated
     */
    EClass STATIC_CONSTRUCTOR_DECLARATION = eINSTANCE.getStaticConstructorDeclaration();

    /**
     * The meta object literal for the '<em><b>Static Cosnt Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_CONSTRUCTOR_DECLARATION__STATIC_COSNT_MODIFIER = eINSTANCE.getStaticConstructorDeclaration_StaticCosntModifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_CONSTRUCTOR_DECLARATION__NAME = eINSTANCE.getStaticConstructorDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Empty Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_CONSTRUCTOR_DECLARATION__EMPTY_BLOCK = eINSTANCE.getStaticConstructorDeclaration_EmptyBlock();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.DestructorDeclarationImpl <em>Destructor Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.DestructorDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getDestructorDeclaration()
     * @generated
     */
    EClass DESTRUCTOR_DECLARATION = eINSTANCE.getDestructorDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESTRUCTOR_DECLARATION__NAME = eINSTANCE.getDestructorDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Empty Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESTRUCTOR_DECLARATION__EMPTY_BLOCK = eINSTANCE.getDestructorDeclaration_EmptyBlock();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ConstructorDeclarationImpl <em>Constructor Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ConstructorDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getConstructorDeclaration()
     * @generated
     */
    EClass CONSTRUCTOR_DECLARATION = eINSTANCE.getConstructorDeclaration();

    /**
     * The meta object literal for the '<em><b>Const Modifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR_DECLARATION__CONST_MODIFIER = eINSTANCE.getConstructorDeclaration_ConstModifier();

    /**
     * The meta object literal for the '<em><b>Constr Declarator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_DECLARATION__CONSTR_DECLARATOR = eINSTANCE.getConstructorDeclaration_ConstrDeclarator();

    /**
     * The meta object literal for the '<em><b>Empty Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_DECLARATION__EMPTY_BLOCK = eINSTANCE.getConstructorDeclaration_EmptyBlock();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ConstructorDeclaratorImpl <em>Constructor Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ConstructorDeclaratorImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getConstructorDeclarator()
     * @generated
     */
    EClass CONSTRUCTOR_DECLARATOR = eINSTANCE.getConstructorDeclarator();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ConstructorInitializerImpl <em>Constructor Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ConstructorInitializerImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getConstructorInitializer()
     * @generated
     */
    EClass CONSTRUCTOR_INITIALIZER = eINSTANCE.getConstructorInitializer();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ArgumentListImpl <em>Argument List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ArgumentListImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getArgumentList()
     * @generated
     */
    EClass ARGUMENT_LIST = eINSTANCE.getArgumentList();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT_LIST__ARG = eINSTANCE.getArgumentList_Arg();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ArgumentImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.OperatorDeclarationImpl <em>Operator Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.OperatorDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getOperatorDeclaration()
     * @generated
     */
    EClass OPERATOR_DECLARATION = eINSTANCE.getOperatorDeclaration();

    /**
     * The meta object literal for the '<em><b>Op Modifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR_DECLARATION__OP_MODIFIER = eINSTANCE.getOperatorDeclaration_OpModifier();

    /**
     * The meta object literal for the '<em><b>Op Declarator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR_DECLARATION__OP_DECLARATOR = eINSTANCE.getOperatorDeclaration_OpDeclarator();

    /**
     * The meta object literal for the '<em><b>Empty Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR_DECLARATION__EMPTY_BLOCK = eINSTANCE.getOperatorDeclaration_EmptyBlock();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.OperatorDeclaratorImpl <em>Operator Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.OperatorDeclaratorImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getOperatorDeclarator()
     * @generated
     */
    EClass OPERATOR_DECLARATOR = eINSTANCE.getOperatorDeclarator();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR_DECLARATOR__TYPE = eINSTANCE.getOperatorDeclarator_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ConversionOperatorDeclaratorImpl <em>Conversion Operator Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ConversionOperatorDeclaratorImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getConversionOperatorDeclarator()
     * @generated
     */
    EClass CONVERSION_OPERATOR_DECLARATOR = eINSTANCE.getConversionOperatorDeclarator();

    /**
     * The meta object literal for the '<em><b>First Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONVERSION_OPERATOR_DECLARATOR__FIRST_TYPE = eINSTANCE.getConversionOperatorDeclarator_FirstType();

    /**
     * The meta object literal for the '<em><b>Conversion Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONVERSION_OPERATOR_DECLARATOR__CONVERSION_NAME = eINSTANCE.getConversionOperatorDeclarator_ConversionName();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.BinaryOperatorDeclaratorImpl <em>Binary Operator Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.BinaryOperatorDeclaratorImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getBinaryOperatorDeclarator()
     * @generated
     */
    EClass BINARY_OPERATOR_DECLARATOR = eINSTANCE.getBinaryOperatorDeclarator();

    /**
     * The meta object literal for the '<em><b>Bin Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_OPERATOR_DECLARATOR__BIN_TYPE = eINSTANCE.getBinaryOperatorDeclarator_BinType();

    /**
     * The meta object literal for the '<em><b>Over Bin Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_OPERATOR_DECLARATOR__OVER_BIN_OPERATOR = eINSTANCE.getBinaryOperatorDeclarator_OverBinOperator();

    /**
     * The meta object literal for the '<em><b>Other Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_OPERATOR_DECLARATOR__OTHER_NAME = eINSTANCE.getBinaryOperatorDeclarator_OtherName();

    /**
     * The meta object literal for the '<em><b>Second Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_OPERATOR_DECLARATOR__SECOND_TYPE = eINSTANCE.getBinaryOperatorDeclarator_SecondType();

    /**
     * The meta object literal for the '<em><b>Second Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_OPERATOR_DECLARATOR__SECOND_NAME = eINSTANCE.getBinaryOperatorDeclarator_SecondName();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.UnaryOperatorDeclaratorImpl <em>Unary Operator Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.UnaryOperatorDeclaratorImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getUnaryOperatorDeclarator()
     * @generated
     */
    EClass UNARY_OPERATOR_DECLARATOR = eINSTANCE.getUnaryOperatorDeclarator();

    /**
     * The meta object literal for the '<em><b>Other Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_OPERATOR_DECLARATOR__OTHER_TYPE = eINSTANCE.getUnaryOperatorDeclarator_OtherType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_OPERATOR_DECLARATOR__NAME = eINSTANCE.getUnaryOperatorDeclarator_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.IndexerDeclarationImpl <em>Indexer Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.IndexerDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getIndexerDeclaration()
     * @generated
     */
    EClass INDEXER_DECLARATION = eINSTANCE.getIndexerDeclaration();

    /**
     * The meta object literal for the '<em><b>Id Modifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEXER_DECLARATION__ID_MODIFIER = eINSTANCE.getIndexerDeclaration_IdModifier();

    /**
     * The meta object literal for the '<em><b>Indexer Declarator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEXER_DECLARATION__INDEXER_DECLARATOR = eINSTANCE.getIndexerDeclaration_IndexerDeclarator();

    /**
     * The meta object literal for the '<em><b>Acc Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEXER_DECLARATION__ACC_DECLARATION = eINSTANCE.getIndexerDeclaration_AccDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.IndexerDeclaratorImpl <em>Indexer Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.IndexerDeclaratorImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getIndexerDeclarator()
     * @generated
     */
    EClass INDEXER_DECLARATOR = eINSTANCE.getIndexerDeclarator();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEXER_DECLARATOR__TYPE = eINSTANCE.getIndexerDeclarator_Type();

    /**
     * The meta object literal for the '<em><b>Formal List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEXER_DECLARATOR__FORMAL_LIST = eINSTANCE.getIndexerDeclarator_FormalList();

    /**
     * The meta object literal for the '<em><b>Qualified Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEXER_DECLARATOR__QUALIFIED_ID = eINSTANCE.getIndexerDeclarator_QualifiedId();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.EventDeclarationImpl <em>Event Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.EventDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getEventDeclaration()
     * @generated
     */
    EClass EVENT_DECLARATION = eINSTANCE.getEventDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.EventAccessorDeclarationsImpl <em>Event Accessor Declarations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.EventAccessorDeclarationsImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getEventAccessorDeclarations()
     * @generated
     */
    EClass EVENT_ACCESSOR_DECLARATIONS = eINSTANCE.getEventAccessorDeclarations();

    /**
     * The meta object literal for the '<em><b>Att1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_ACCESSOR_DECLARATIONS__ATT1 = eINSTANCE.getEventAccessorDeclarations_Att1();

    /**
     * The meta object literal for the '<em><b>Add Accessor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_ACCESSOR_DECLARATIONS__ADD_ACCESSOR = eINSTANCE.getEventAccessorDeclarations_AddAccessor();

    /**
     * The meta object literal for the '<em><b>Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_ACCESSOR_DECLARATIONS__ATT = eINSTANCE.getEventAccessorDeclarations_Att();

    /**
     * The meta object literal for the '<em><b>Remov Accessor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_ACCESSOR_DECLARATIONS__REMOV_ACCESSOR = eINSTANCE.getEventAccessorDeclarations_RemovAccessor();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.RemoveAccessorDeclarationImpl <em>Remove Accessor Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.RemoveAccessorDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getRemoveAccessorDeclaration()
     * @generated
     */
    EClass REMOVE_ACCESSOR_DECLARATION = eINSTANCE.getRemoveAccessorDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.AddAccessorDeclarationImpl <em>Add Accessor Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.AddAccessorDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAddAccessorDeclaration()
     * @generated
     */
    EClass ADD_ACCESSOR_DECLARATION = eINSTANCE.getAddAccessorDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.PropertyDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getPropertyDeclaration()
     * @generated
     */
    EClass PROPERTY_DECLARATION = eINSTANCE.getPropertyDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.AccessorDeclarationsImpl <em>Accessor Declarations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.AccessorDeclarationsImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAccessorDeclarations()
     * @generated
     */
    EClass ACCESSOR_DECLARATIONS = eINSTANCE.getAccessorDeclarations();

    /**
     * The meta object literal for the '<em><b>Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCESSOR_DECLARATIONS__ATT = eINSTANCE.getAccessorDeclarations_Att();

    /**
     * The meta object literal for the '<em><b>Get Acc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCESSOR_DECLARATIONS__GET_ACC = eINSTANCE.getAccessorDeclarations_GetAcc();

    /**
     * The meta object literal for the '<em><b>Att2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCESSOR_DECLARATIONS__ATT2 = eINSTANCE.getAccessorDeclarations_Att2();

    /**
     * The meta object literal for the '<em><b>Set Acc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCESSOR_DECLARATIONS__SET_ACC = eINSTANCE.getAccessorDeclarations_SetAcc();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.SetAccessorDeclarationImpl <em>Set Accessor Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.SetAccessorDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getSetAccessorDeclaration()
     * @generated
     */
    EClass SET_ACCESSOR_DECLARATION = eINSTANCE.getSetAccessorDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.GetAccessorDeclarationImpl <em>Get Accessor Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.GetAccessorDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getGetAccessorDeclaration()
     * @generated
     */
    EClass GET_ACCESSOR_DECLARATION = eINSTANCE.getGetAccessorDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.MethodDeclarationImpl <em>Method Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.MethodDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getMethodDeclaration()
     * @generated
     */
    EClass METHOD_DECLARATION = eINSTANCE.getMethodDeclaration();

    /**
     * The meta object literal for the '<em><b>Method Header</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__METHOD_HEADER = eINSTANCE.getMethodDeclaration_MethodHeader();

    /**
     * The meta object literal for the '<em><b>Maybe Empty</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__MAYBE_EMPTY = eINSTANCE.getMethodDeclaration_MaybeEmpty();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.MethodHeaderImpl <em>Method Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.MethodHeaderImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getMethodHeader()
     * @generated
     */
    EClass METHOD_HEADER = eINSTANCE.getMethodHeader();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.FormalParameterListImpl <em>Formal Parameter List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.FormalParameterListImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getFormalParameterList()
     * @generated
     */
    EClass FORMAL_PARAMETER_LIST = eINSTANCE.getFormalParameterList();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ParameterArrayImpl <em>Parameter Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ParameterArrayImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getParameterArray()
     * @generated
     */
    EClass PARAMETER_ARRAY = eINSTANCE.getParameterArray();

    /**
     * The meta object literal for the '<em><b>Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_ARRAY__ATT = eINSTANCE.getParameterArray_Att();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_ARRAY__ARRAY = eINSTANCE.getParameterArray_Array();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_ARRAY__NAME = eINSTANCE.getParameterArray_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.FixedParametersImpl <em>Fixed Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.FixedParametersImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getFixedParameters()
     * @generated
     */
    EClass FIXED_PARAMETERS = eINSTANCE.getFixedParameters();

    /**
     * The meta object literal for the '<em><b>Parameter Array</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIXED_PARAMETERS__PARAMETER_ARRAY = eINSTANCE.getFixedParameters_ParameterArray();

    /**
     * The meta object literal for the '<em><b>Fix Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIXED_PARAMETERS__FIX_PARAMETERS = eINSTANCE.getFixedParameters_FixParameters();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.FixedParameterImpl <em>Fixed Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.FixedParameterImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getFixedParameter()
     * @generated
     */
    EClass FIXED_PARAMETER = eINSTANCE.getFixedParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIXED_PARAMETER__TYPE = eINSTANCE.getFixedParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIXED_PARAMETER__NAME = eINSTANCE.getFixedParameter_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.TypeOrVoidImpl <em>Type Or Void</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.TypeOrVoidImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getTypeOrVoid()
     * @generated
     */
    EClass TYPE_OR_VOID = eINSTANCE.getTypeOrVoid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_OR_VOID__NAME = eINSTANCE.getTypeOrVoid_Name();

    /**
     * The meta object literal for the '<em><b>Formal Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_OR_VOID__FORMAL_PARAMETERS = eINSTANCE.getTypeOrVoid_FormalParameters();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_OR_VOID__TYPE = eINSTANCE.getTypeOrVoid_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.FieldDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getFieldDeclaration()
     * @generated
     */
    EClass FIELD_DECLARATION = eINSTANCE.getFieldDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.VariableDeclaratorImpl <em>Variable Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.VariableDeclaratorImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getVariableDeclarator()
     * @generated
     */
    EClass VARIABLE_DECLARATOR = eINSTANCE.getVariableDeclarator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATOR__NAME = eINSTANCE.getVariableDeclarator_Name();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATOR__VARIABLE = eINSTANCE.getVariableDeclarator_Variable();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.VariableInitializerImpl <em>Variable Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.VariableInitializerImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getVariableInitializer()
     * @generated
     */
    EClass VARIABLE_INITIALIZER = eINSTANCE.getVariableInitializer();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ArrayInitializerImpl <em>Array Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ArrayInitializerImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getArrayInitializer()
     * @generated
     */
    EClass ARRAY_INITIALIZER = eINSTANCE.getArrayInitializer();

    /**
     * The meta object literal for the '<em><b>Variable Initalizers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_INITIALIZER__VARIABLE_INITALIZERS = eINSTANCE.getArrayInitializer_VariableInitalizers();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ConstantDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getConstantDeclaration()
     * @generated
     */
    EClass CONSTANT_DECLARATION = eINSTANCE.getConstantDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ConstantDeclaratorImpl <em>Constant Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ConstantDeclaratorImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getConstantDeclarator()
     * @generated
     */
    EClass CONSTANT_DECLARATOR = eINSTANCE.getConstantDeclarator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DECLARATOR__NAME = eINSTANCE.getConstantDeclarator_Name();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DECLARATOR__EXP = eINSTANCE.getConstantDeclarator_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ClassBaseImpl <em>Class Base</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ClassBaseImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getClassBase()
     * @generated
     */
    EClass CLASS_BASE = eINSTANCE.getClassBase();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.QualifiedIdentifierListImpl <em>Qualified Identifier List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.QualifiedIdentifierListImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getQualifiedIdentifierList()
     * @generated
     */
    EClass QUALIFIED_IDENTIFIER_LIST = eINSTANCE.getQualifiedIdentifierList();

    /**
     * The meta object literal for the '<em><b>Ids</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_IDENTIFIER_LIST__IDS = eINSTANCE.getQualifiedIdentifierList_Ids();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.GlobalAttributesImpl <em>Global Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.GlobalAttributesImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getGlobalAttributes()
     * @generated
     */
    EClass GLOBAL_ATTRIBUTES = eINSTANCE.getGlobalAttributes();

    /**
     * The meta object literal for the '<em><b>Global Att Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_ATTRIBUTES__GLOBAL_ATT_SECTIONS = eINSTANCE.getGlobalAttributes_GlobalAttSections();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.GlobalAttributeSectionImpl <em>Global Attribute Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.GlobalAttributeSectionImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getGlobalAttributeSection()
     * @generated
     */
    EClass GLOBAL_ATTRIBUTE_SECTION = eINSTANCE.getGlobalAttributeSection();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.AttributesImpl <em>Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.AttributesImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAttributes()
     * @generated
     */
    EClass ATTRIBUTES = eINSTANCE.getAttributes();

    /**
     * The meta object literal for the '<em><b>Type Or Void</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTES__TYPE_OR_VOID = eINSTANCE.getAttributes_TypeOrVoid();

    /**
     * The meta object literal for the '<em><b>Qualified ID</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTES__QUALIFIED_ID = eINSTANCE.getAttributes_QualifiedID();

    /**
     * The meta object literal for the '<em><b>Formal Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTES__FORMAL_PARAMETERS = eINSTANCE.getAttributes_FormalParameters();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTES__ATTRIBUTES = eINSTANCE.getAttributes_Attributes();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTES__TYPE = eINSTANCE.getAttributes_Type();

    /**
     * The meta object literal for the '<em><b>Enum Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTES__ENUM_BODY = eINSTANCE.getAttributes_EnumBody();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.AttributeSectionImpl <em>Attribute Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.AttributeSectionImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAttributeSection()
     * @generated
     */
    EClass ATTRIBUTE_SECTION = eINSTANCE.getAttributeSection();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.AttributeListImpl <em>Attribute List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.AttributeListImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAttributeList()
     * @generated
     */
    EClass ATTRIBUTE_LIST = eINSTANCE.getAttributeList();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_LIST__ATTRIBUTES = eINSTANCE.getAttributeList_Attributes();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.AttributeImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Att Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__ATT_NAME = eINSTANCE.getAttribute_AttName();

    /**
     * The meta object literal for the '<em><b>Att Arguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__ATT_ARGUMENTS = eINSTANCE.getAttribute_AttArguments();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.AttributeArgumentsImpl <em>Attribute Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.AttributeArgumentsImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAttributeArguments()
     * @generated
     */
    EClass ATTRIBUTE_ARGUMENTS = eINSTANCE.getAttributeArguments();

    /**
     * The meta object literal for the '<em><b>Expresions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_ARGUMENTS__EXPRESIONS = eINSTANCE.getAttributeArguments_Expresions();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ExpressionListImpl <em>Expression List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ExpressionListImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getExpressionList()
     * @generated
     */
    EClass EXPRESSION_LIST = eINSTANCE.getExpressionList();

    /**
     * The meta object literal for the '<em><b>Expresions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LIST__EXPRESIONS = eINSTANCE.getExpressionList_Expresions();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ExpressionImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Unary</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__UNARY = eINSTANCE.getExpression_Unary();

    /**
     * The meta object literal for the '<em><b>Exp2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXP2 = eINSTANCE.getExpression_Exp2();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXP = eINSTANCE.getExpression_Exp();

    /**
     * The meta object literal for the '<em><b>Other Exp2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__OTHER_EXP2 = eINSTANCE.getExpression_OtherExp2();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.Expression2Impl <em>Expression2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.Expression2Impl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getExpression2()
     * @generated
     */
    EClass EXPRESSION2 = eINSTANCE.getExpression2();

    /**
     * The meta object literal for the '<em><b>Internal Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION2__INTERNAL_EXP = eINSTANCE.getExpression2_InternalExp();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION2__EXP = eINSTANCE.getExpression2_Exp();

    /**
     * The meta object literal for the '<em><b>Internal Exp2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION2__INTERNAL_EXP2 = eINSTANCE.getExpression2_InternalExp2();

    /**
     * The meta object literal for the '<em><b>Build In Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION2__BUILD_IN_TYPE = eINSTANCE.getExpression2_BuildInType();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.UnaryExpressionImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getUnaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

    /**
     * The meta object literal for the '<em><b>Exp Unary Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPRESSION__EXP_UNARY_OPERATOR = eINSTANCE.getUnaryExpression_ExpUnaryOperator();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__TYPE = eINSTANCE.getUnaryExpression_Type();

    /**
     * The meta object literal for the '<em><b>Unary Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__UNARY_EXP = eINSTANCE.getUnaryExpression_UnaryExp();

    /**
     * The meta object literal for the '<em><b>Primary Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__PRIMARY_EXP = eINSTANCE.getUnaryExpression_PrimaryExp();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.AttributeNameImpl <em>Attribute Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.AttributeNameImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getAttributeName()
     * @generated
     */
    EClass ATTRIBUTE_NAME = eINSTANCE.getAttributeName();

    /**
     * The meta object literal for the '<em><b>Qualified Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_NAME__QUALIFIED_ID = eINSTANCE.getAttributeName_QualifiedId();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.UsingDirectiveImpl <em>Using Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.UsingDirectiveImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getUsingDirective()
     * @generated
     */
    EClass USING_DIRECTIVE = eINSTANCE.getUsingDirective();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USING_DIRECTIVE__NAME = eINSTANCE.getUsingDirective_Name();

    /**
     * The meta object literal for the '<em><b>Usings</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USING_DIRECTIVE__USINGS = eINSTANCE.getUsingDirective_Usings();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.TypeImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Variable Declarator</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__VARIABLE_DECLARATOR = eINSTANCE.getType_VariableDeclarator();

    /**
     * The meta object literal for the '<em><b>QIdent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__QIDENT = eINSTANCE.getType_QIdent();

    /**
     * The meta object literal for the '<em><b>Event Accessor Declarations</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__EVENT_ACCESSOR_DECLARATIONS = eINSTANCE.getType_EventAccessorDeclarations();

    /**
     * The meta object literal for the '<em><b>Qualified Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__QUALIFIED_ID = eINSTANCE.getType_QualifiedId();

    /**
     * The meta object literal for the '<em><b>Acc Declarate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__ACC_DECLARATE = eINSTANCE.getType_AccDeclarate();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__VARIABLES = eINSTANCE.getType_Variables();

    /**
     * The meta object literal for the '<em><b>Const Declarators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__CONST_DECLARATORS = eINSTANCE.getType_ConstDeclarators();

    /**
     * The meta object literal for the '<em><b>Non Array</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__NON_ARRAY = eINSTANCE.getType_NonArray();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.IntegralTypeImpl <em>Integral Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.IntegralTypeImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getIntegralType()
     * @generated
     */
    EClass INTEGRAL_TYPE = eINSTANCE.getIntegralType();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ArrayTypeImpl <em>Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ArrayTypeImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getArrayType()
     * @generated
     */
    EClass ARRAY_TYPE = eINSTANCE.getArrayType();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.EnumTypeImpl <em>Enum Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.EnumTypeImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getEnumType()
     * @generated
     */
    EClass ENUM_TYPE = eINSTANCE.getEnumType();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.NonArrayTypeImpl <em>Non Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.NonArrayTypeImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getNonArrayType()
     * @generated
     */
    EClass NON_ARRAY_TYPE = eINSTANCE.getNonArrayType();

    /**
     * The meta object literal for the '<em><b>Qualified</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_ARRAY_TYPE__QUALIFIED = eINSTANCE.getNonArrayType_Qualified();

    /**
     * The meta object literal for the '<em><b>Built Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_ARRAY_TYPE__BUILT_TYPE = eINSTANCE.getNonArrayType_BuiltType();

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
     * The meta object literal for the '<em><b>Ids</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_IDENTIFIER__IDS = eINSTANCE.getQualifiedIdentifier_Ids();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.BuiltInTypeImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getBuiltInType()
     * @generated
     */
    EClass BUILT_IN_TYPE = eINSTANCE.getBuiltInType();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.EnumBodyImpl <em>Enum Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.EnumBodyImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getEnumBody()
     * @generated
     */
    EClass ENUM_BODY = eINSTANCE.getEnumBody();

    /**
     * The meta object literal for the '<em><b>Enum Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_BODY__ENUM_DECLARATIONS = eINSTANCE.getEnumBody_EnumDeclarations();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.EnumMemberDeclarationImpl <em>Enum Member Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.EnumMemberDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getEnumMemberDeclaration()
     * @generated
     */
    EClass ENUM_MEMBER_DECLARATION = eINSTANCE.getEnumMemberDeclaration();

    /**
     * The meta object literal for the '<em><b>Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_MEMBER_DECLARATION__ATT = eINSTANCE.getEnumMemberDeclaration_Att();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_MEMBER_DECLARATION__NAME = eINSTANCE.getEnumMemberDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_MEMBER_DECLARATION__EXP = eINSTANCE.getEnumMemberDeclaration_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.StatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Label Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__LABEL_STAT = eINSTANCE.getStatement_LabelStat();

    /**
     * The meta object literal for the '<em><b>Declare Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__DECLARE_STAT = eINSTANCE.getStatement_DeclareStat();

    /**
     * The meta object literal for the '<em><b>Embedded Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EMBEDDED_STAT = eINSTANCE.getStatement_EmbeddedStat();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.DeclarationStatmentImpl <em>Declaration Statment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.DeclarationStatmentImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getDeclarationStatment()
     * @generated
     */
    EClass DECLARATION_STATMENT = eINSTANCE.getDeclarationStatment();

    /**
     * The meta object literal for the '<em><b>Local Variable Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_STATMENT__LOCAL_VARIABLE_DECLARATION = eINSTANCE.getDeclarationStatment_LocalVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Local COnstant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_STATMENT__LOCAL_CONSTANT = eINSTANCE.getDeclarationStatment_LocalCOnstant();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.LocalconstantDeclarationImpl <em>Localconstant Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.LocalconstantDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getLocalconstantDeclaration()
     * @generated
     */
    EClass LOCALCONSTANT_DECLARATION = eINSTANCE.getLocalconstantDeclaration();

    /**
     * The meta object literal for the '<em><b>Tipo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCALCONSTANT_DECLARATION__TIPO = eINSTANCE.getLocalconstantDeclaration_Tipo();

    /**
     * The meta object literal for the '<em><b>Const Declarator</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCALCONSTANT_DECLARATION__CONST_DECLARATOR = eINSTANCE.getLocalconstantDeclaration_ConstDeclarator();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.LabeledStatementImpl <em>Labeled Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.LabeledStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getLabeledStatement()
     * @generated
     */
    EClass LABELED_STATEMENT = eINSTANCE.getLabeledStatement();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELED_STATEMENT__ID = eINSTANCE.getLabeledStatement_Id();

    /**
     * The meta object literal for the '<em><b>Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELED_STATEMENT__STAT = eINSTANCE.getLabeledStatement_Stat();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.EmbeddedStatementImpl <em>Embedded Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.EmbeddedStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getEmbeddedStatement()
     * @generated
     */
    EClass EMBEDDED_STATEMENT = eINSTANCE.getEmbeddedStatement();

    /**
     * The meta object literal for the '<em><b>Maybe Empty</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMBEDDED_STATEMENT__MAYBE_EMPTY = eINSTANCE.getEmbeddedStatement_MaybeEmpty();

    /**
     * The meta object literal for the '<em><b>Stat Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMBEDDED_STATEMENT__STAT_EXP = eINSTANCE.getEmbeddedStatement_StatExp();

    /**
     * The meta object literal for the '<em><b>Selection Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMBEDDED_STATEMENT__SELECTION_STAT = eINSTANCE.getEmbeddedStatement_SelectionStat();

    /**
     * The meta object literal for the '<em><b>Iteration Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMBEDDED_STATEMENT__ITERATION_STAT = eINSTANCE.getEmbeddedStatement_IterationStat();

    /**
     * The meta object literal for the '<em><b>Jump Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMBEDDED_STATEMENT__JUMP_STAT = eINSTANCE.getEmbeddedStatement_JumpStat();

    /**
     * The meta object literal for the '<em><b>Try Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMBEDDED_STATEMENT__TRY_STAT = eINSTANCE.getEmbeddedStatement_TryStat();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMBEDDED_STATEMENT__BLOCK = eINSTANCE.getEmbeddedStatement_Block();

    /**
     * The meta object literal for the '<em><b>Lock Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMBEDDED_STATEMENT__LOCK_STAT = eINSTANCE.getEmbeddedStatement_LockStat();

    /**
     * The meta object literal for the '<em><b>Using Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMBEDDED_STATEMENT__USING_STAT = eINSTANCE.getEmbeddedStatement_UsingStat();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.UsingStatementImpl <em>Using Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.UsingStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getUsingStatement()
     * @generated
     */
    EClass USING_STATEMENT = eINSTANCE.getUsingStatement();

    /**
     * The meta object literal for the '<em><b>Resourc Aquisition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USING_STATEMENT__RESOURC_AQUISITION = eINSTANCE.getUsingStatement_ResourcAquisition();

    /**
     * The meta object literal for the '<em><b>Embedded Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USING_STATEMENT__EMBEDDED_STAT = eINSTANCE.getUsingStatement_EmbeddedStat();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ResourceAquisitionImpl <em>Resource Aquisition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ResourceAquisitionImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getResourceAquisition()
     * @generated
     */
    EClass RESOURCE_AQUISITION = eINSTANCE.getResourceAquisition();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.LocalVariableDeclarationImpl <em>Local Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.LocalVariableDeclarationImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getLocalVariableDeclaration()
     * @generated
     */
    EClass LOCAL_VARIABLE_DECLARATION = eINSTANCE.getLocalVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Tipo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VARIABLE_DECLARATION__TIPO = eINSTANCE.getLocalVariableDeclaration_Tipo();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VARIABLE_DECLARATION__VARIABLE = eINSTANCE.getLocalVariableDeclaration_Variable();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.LockStatementImpl <em>Lock Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.LockStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getLockStatement()
     * @generated
     */
    EClass LOCK_STATEMENT = eINSTANCE.getLockStatement();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCK_STATEMENT__EXP = eINSTANCE.getLockStatement_Exp();

    /**
     * The meta object literal for the '<em><b>Embedded Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCK_STATEMENT__EMBEDDED_STAT = eINSTANCE.getLockStatement_EmbeddedStat();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.TryStatementImpl <em>Try Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.TryStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getTryStatement()
     * @generated
     */
    EClass TRY_STATEMENT = eINSTANCE.getTryStatement();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__BLOCK = eINSTANCE.getTryStatement_Block();

    /**
     * The meta object literal for the '<em><b>Catch Clauses</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__CATCH_CLAUSES = eINSTANCE.getTryStatement_CatchClauses();

    /**
     * The meta object literal for the '<em><b>Finally</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__FINALLY = eINSTANCE.getTryStatement_Finally();

    /**
     * The meta object literal for the '<em><b>Finally Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__FINALLY_CLAUSE = eINSTANCE.getTryStatement_FinallyClause();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.FinallyClauseImpl <em>Finally Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.FinallyClauseImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getFinallyClause()
     * @generated
     */
    EClass FINALLY_CLAUSE = eINSTANCE.getFinallyClause();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FINALLY_CLAUSE__BLOCK = eINSTANCE.getFinallyClause_Block();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.CatchClausesImpl <em>Catch Clauses</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.CatchClausesImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getCatchClauses()
     * @generated
     */
    EClass CATCH_CLAUSES = eINSTANCE.getCatchClauses();

    /**
     * The meta object literal for the '<em><b>Speci Catch Clause</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATCH_CLAUSES__SPECI_CATCH_CLAUSE = eINSTANCE.getCatchClauses_SpeciCatchClause();

    /**
     * The meta object literal for the '<em><b>Gen Catch Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATCH_CLAUSES__GEN_CATCH_CLAUSE = eINSTANCE.getCatchClauses_GenCatchClause();

    /**
     * The meta object literal for the '<em><b>Spec Catch Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATCH_CLAUSES__SPEC_CATCH_CLAUSE = eINSTANCE.getCatchClauses_SpecCatchClause();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.GeneralCatchclauseImpl <em>General Catchclause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.GeneralCatchclauseImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getGeneralCatchclause()
     * @generated
     */
    EClass GENERAL_CATCHCLAUSE = eINSTANCE.getGeneralCatchclause();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERAL_CATCHCLAUSE__BLOCK = eINSTANCE.getGeneralCatchclause_Block();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.SpecificCatchClauseImpl <em>Specific Catch Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.SpecificCatchClauseImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getSpecificCatchClause()
     * @generated
     */
    EClass SPECIFIC_CATCH_CLAUSE = eINSTANCE.getSpecificCatchClause();

    /**
     * The meta object literal for the '<em><b>Quali Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFIC_CATCH_CLAUSE__QUALI_ID = eINSTANCE.getSpecificCatchClause_QualiId();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFIC_CATCH_CLAUSE__ID = eINSTANCE.getSpecificCatchClause_Id();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFIC_CATCH_CLAUSE__BLOCK = eINSTANCE.getSpecificCatchClause_Block();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.JumpStatementImpl <em>Jump Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.JumpStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getJumpStatement()
     * @generated
     */
    EClass JUMP_STATEMENT = eINSTANCE.getJumpStatement();

    /**
     * The meta object literal for the '<em><b>Break Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JUMP_STATEMENT__BREAK_STAT = eINSTANCE.getJumpStatement_BreakStat();

    /**
     * The meta object literal for the '<em><b>Continue Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JUMP_STATEMENT__CONTINUE_STAT = eINSTANCE.getJumpStatement_ContinueStat();

    /**
     * The meta object literal for the '<em><b>Goto Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JUMP_STATEMENT__GOTO_STAT = eINSTANCE.getJumpStatement_GotoStat();

    /**
     * The meta object literal for the '<em><b>Return Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JUMP_STATEMENT__RETURN_STAT = eINSTANCE.getJumpStatement_ReturnStat();

    /**
     * The meta object literal for the '<em><b>Throw Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JUMP_STATEMENT__THROW_STAT = eINSTANCE.getJumpStatement_ThrowStat();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ThrowStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getThrowStatement()
     * @generated
     */
    EClass THROW_STATEMENT = eINSTANCE.getThrowStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THROW_STATEMENT__EXPRESSION = eINSTANCE.getThrowStatement_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ReturnStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getReturnStatement()
     * @generated
     */
    EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_STATEMENT__EXPRESSION = eINSTANCE.getReturnStatement_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.GotoStatementImpl <em>Goto Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.GotoStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getGotoStatement()
     * @generated
     */
    EClass GOTO_STATEMENT = eINSTANCE.getGotoStatement();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOTO_STATEMENT__ID = eINSTANCE.getGotoStatement_Id();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOTO_STATEMENT__EXPRESSION = eINSTANCE.getGotoStatement_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ContinueStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getContinueStatement()
     * @generated
     */
    EClass CONTINUE_STATEMENT = eINSTANCE.getContinueStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.BreakStatementImpl <em>Break Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.BreakStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getBreakStatement()
     * @generated
     */
    EClass BREAK_STATEMENT = eINSTANCE.getBreakStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.IterationStatementImpl <em>Iteration Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.IterationStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getIterationStatement()
     * @generated
     */
    EClass ITERATION_STATEMENT = eINSTANCE.getIterationStatement();

    /**
     * The meta object literal for the '<em><b>While Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION_STATEMENT__WHILE_STATEMENT = eINSTANCE.getIterationStatement_WhileStatement();

    /**
     * The meta object literal for the '<em><b>Do Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION_STATEMENT__DO_STATEMENT = eINSTANCE.getIterationStatement_DoStatement();

    /**
     * The meta object literal for the '<em><b>For Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION_STATEMENT__FOR_STATEMENT = eINSTANCE.getIterationStatement_ForStatement();

    /**
     * The meta object literal for the '<em><b>Foreach Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION_STATEMENT__FOREACH_STATEMENT = eINSTANCE.getIterationStatement_ForeachStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ForeachStatementImpl <em>Foreach Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ForeachStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getForeachStatement()
     * @generated
     */
    EClass FOREACH_STATEMENT = eINSTANCE.getForeachStatement();

    /**
     * The meta object literal for the '<em><b>Tipo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH_STATEMENT__TIPO = eINSTANCE.getForeachStatement_Tipo();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH_STATEMENT__ID = eINSTANCE.getForeachStatement_Id();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH_STATEMENT__EXPRESSION = eINSTANCE.getForeachStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Embedded Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH_STATEMENT__EMBEDDED_STATEMENT = eINSTANCE.getForeachStatement_EmbeddedStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ForStatementImpl <em>For Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ForStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getForStatement()
     * @generated
     */
    EClass FOR_STATEMENT = eINSTANCE.getForStatement();

    /**
     * The meta object literal for the '<em><b>For Initializer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__FOR_INITIALIZER = eINSTANCE.getForStatement_ForInitializer();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__EXPRESSION = eINSTANCE.getForStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Statement Expression List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__STATEMENT_EXPRESSION_LIST = eINSTANCE.getForStatement_StatementExpressionList();

    /**
     * The meta object literal for the '<em><b>Embedded Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__EMBEDDED_STATEMENT = eINSTANCE.getForStatement_EmbeddedStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ForInitializerImpl <em>For Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ForInitializerImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getForInitializer()
     * @generated
     */
    EClass FOR_INITIALIZER = eINSTANCE.getForInitializer();

    /**
     * The meta object literal for the '<em><b>Local Variable Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_INITIALIZER__LOCAL_VARIABLE_DECLARATION = eINSTANCE.getForInitializer_LocalVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Statement Expression List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_INITIALIZER__STATEMENT_EXPRESSION_LIST = eINSTANCE.getForInitializer_StatementExpressionList();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.StatementExpressionListImpl <em>Statement Expression List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.StatementExpressionListImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStatementExpressionList()
     * @generated
     */
    EClass STATEMENT_EXPRESSION_LIST = eINSTANCE.getStatementExpressionList();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_EXPRESSION_LIST__LIST = eINSTANCE.getStatementExpressionList_List();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.StatementExpressionImpl <em>Statement Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.StatementExpressionImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getStatementExpression()
     * @generated
     */
    EClass STATEMENT_EXPRESSION = eINSTANCE.getStatementExpression();

    /**
     * The meta object literal for the '<em><b>Primary Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_EXPRESSION__PRIMARY_EXPRESSION = eINSTANCE.getStatementExpression_PrimaryExpression();

    /**
     * The meta object literal for the '<em><b>Argument List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_EXPRESSION__ARGUMENT_LIST = eINSTANCE.getStatementExpression_ArgumentList();

    /**
     * The meta object literal for the '<em><b>Incriment Decrement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT_EXPRESSION__INCRIMENT_DECREMENT = eINSTANCE.getStatementExpression_IncrimentDecrement();

    /**
     * The meta object literal for the '<em><b>Tipo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_EXPRESSION__TIPO = eINSTANCE.getStatementExpression_Tipo();

    /**
     * The meta object literal for the '<em><b>Unary Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_EXPRESSION__UNARY_EXPRESSION = eINSTANCE.getStatementExpression_UnaryExpression();

    /**
     * The meta object literal for the '<em><b>Assignement Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT_EXPRESSION__ASSIGNEMENT_OPERATOR = eINSTANCE.getStatementExpression_AssignementOperator();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_EXPRESSION__EXPRESSION = eINSTANCE.getStatementExpression_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.PrimaryExpressionImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getPrimaryExpression()
     * @generated
     */
    EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

    /**
     * The meta object literal for the '<em><b>Non Array Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__NON_ARRAY_TYPE = eINSTANCE.getPrimaryExpression_NonArrayType();

    /**
     * The meta object literal for the '<em><b>Expression List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__EXPRESSION_LIST = eINSTANCE.getPrimaryExpression_ExpressionList();

    /**
     * The meta object literal for the '<em><b>Rank Specifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_EXPRESSION__RANK_SPECIFIER = eINSTANCE.getPrimaryExpression_RankSpecifier();

    /**
     * The meta object literal for the '<em><b>Array Initializer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__ARRAY_INITIALIZER = eINSTANCE.getPrimaryExpression_ArrayInitializer();

    /**
     * The meta object literal for the '<em><b>Array Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__ARRAY_TYPE = eINSTANCE.getPrimaryExpression_ArrayType();

    /**
     * The meta object literal for the '<em><b>Array Initializer2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__ARRAY_INITIALIZER2 = eINSTANCE.getPrimaryExpression_ArrayInitializer2();

    /**
     * The meta object literal for the '<em><b>Tipo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__TIPO = eINSTANCE.getPrimaryExpression_Tipo();

    /**
     * The meta object literal for the '<em><b>Argument List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__ARGUMENT_LIST = eINSTANCE.getPrimaryExpression_ArgumentList();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__ID = eINSTANCE.getPrimaryExpression_Id();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_EXPRESSION__LITERAL = eINSTANCE.getPrimaryExpression_Literal();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__EXPRESSION = eINSTANCE.getPrimaryExpression_Expression();

    /**
     * The meta object literal for the '<em><b>Predefined Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_EXPRESSION__PREDEFINED_TYPE = eINSTANCE.getPrimaryExpression_PredefinedType();

    /**
     * The meta object literal for the '<em><b>Type Or Void</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__TYPE_OR_VOID = eINSTANCE.getPrimaryExpression_TypeOrVoid();

    /**
     * The meta object literal for the '<em><b>Primary Exoression2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__PRIMARY_EXORESSION2 = eINSTANCE.getPrimaryExpression_PrimaryExoression2();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.PrimaryExpression2Impl <em>Primary Expression2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.PrimaryExpression2Impl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getPrimaryExpression2()
     * @generated
     */
    EClass PRIMARY_EXPRESSION2 = eINSTANCE.getPrimaryExpression2();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION2__ID = eINSTANCE.getPrimaryExpression2_Id();

    /**
     * The meta object literal for the '<em><b>Argument List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION2__ARGUMENT_LIST = eINSTANCE.getPrimaryExpression2_ArgumentList();

    /**
     * The meta object literal for the '<em><b>Expression List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION2__EXPRESSION_LIST = eINSTANCE.getPrimaryExpression2_ExpressionList();

    /**
     * The meta object literal for the '<em><b>Incremente Decrement</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_EXPRESSION2__INCREMENTE_DECREMENT = eINSTANCE.getPrimaryExpression2_IncrementeDecrement();

    /**
     * The meta object literal for the '<em><b>Primary Expression2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION2__PRIMARY_EXPRESSION2 = eINSTANCE.getPrimaryExpression2_PrimaryExpression2();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.DoStatementImpl <em>Do Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.DoStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getDoStatement()
     * @generated
     */
    EClass DO_STATEMENT = eINSTANCE.getDoStatement();

    /**
     * The meta object literal for the '<em><b>Embedded Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_STATEMENT__EMBEDDED_STATEMENT = eINSTANCE.getDoStatement_EmbeddedStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_STATEMENT__EXPRESSION = eINSTANCE.getDoStatement_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.WhileStatementImpl <em>While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.WhileStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getWhileStatement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__EXPRESSION = eINSTANCE.getWhileStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Embedded Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__EMBEDDED_STATEMENT = eINSTANCE.getWhileStatement_EmbeddedStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.SelectionStatementImpl <em>Selection Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.SelectionStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getSelectionStatement()
     * @generated
     */
    EClass SELECTION_STATEMENT = eINSTANCE.getSelectionStatement();

    /**
     * The meta object literal for the '<em><b>If Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_STATEMENT__IF_STATEMENT = eINSTANCE.getSelectionStatement_IfStatement();

    /**
     * The meta object literal for the '<em><b>Switch Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_STATEMENT__SWITCH_STATEMENT = eINSTANCE.getSelectionStatement_SwitchStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.SwitchStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getSwitchStatement()
     * @generated
     */
    EClass SWITCH_STATEMENT = eINSTANCE.getSwitchStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__EXPRESSION = eINSTANCE.getSwitchStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Switch Section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__SWITCH_SECTION = eINSTANCE.getSwitchStatement_SwitchSection();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.SwitchSectionImpl <em>Switch Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.SwitchSectionImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getSwitchSection()
     * @generated
     */
    EClass SWITCH_SECTION = eINSTANCE.getSwitchSection();

    /**
     * The meta object literal for the '<em><b>Switchlabel</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_SECTION__SWITCHLABEL = eINSTANCE.getSwitchSection_Switchlabel();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_SECTION__STATEMENT = eINSTANCE.getSwitchSection_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.SwitchLabelImpl <em>Switch Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.SwitchLabelImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getSwitchLabel()
     * @generated
     */
    EClass SWITCH_LABEL = eINSTANCE.getSwitchLabel();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_LABEL__EXPRESSION = eINSTANCE.getSwitchLabel_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.IfStatementImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getIfStatement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIfStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__EXPRESSION = eINSTANCE.getIfStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Embedded Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__EMBEDDED_STATEMENT = eINSTANCE.getIfStatement_EmbeddedStatement();

    /**
     * The meta object literal for the '<em><b>Else Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSE_PART = eINSTANCE.getIfStatement_ElsePart();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.ElsePartImpl <em>Else Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.ElsePartImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getElsePart()
     * @generated
     */
    EClass ELSE_PART = eINSTANCE.getElsePart();

    /**
     * The meta object literal for the '<em><b>Embedded Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSE_PART__EMBEDDED_STATEMENT = eINSTANCE.getElsePart_EmbeddedStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.BlockImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STATEMENT = eINSTANCE.getBlock_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.MaybeEmptyBlockImpl <em>Maybe Empty Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.MaybeEmptyBlockImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getMaybeEmptyBlock()
     * @generated
     */
    EClass MAYBE_EMPTY_BLOCK = eINSTANCE.getMaybeEmptyBlock();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAYBE_EMPTY_BLOCK__STATEMENT = eINSTANCE.getMaybeEmptyBlock_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.myModel.cSharp.impl.VoidImpl <em>Void</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.myModel.cSharp.impl.VoidImpl
     * @see org.xtext.example.myModel.cSharp.impl.CSharpPackageImpl#getVoid()
     * @generated
     */
    EClass VOID = eINSTANCE.getVoid();

  }

} //CSharpPackage
