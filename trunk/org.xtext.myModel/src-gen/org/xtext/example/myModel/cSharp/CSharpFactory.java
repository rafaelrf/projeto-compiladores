/**
 */
package org.xtext.example.myModel.cSharp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.myModel.cSharp.CSharpPackage
 * @generated
 */
public interface CSharpFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CSharpFactory eINSTANCE = org.xtext.example.myModel.cSharp.impl.CSharpFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Compilation Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compilation Unit</em>'.
   * @generated
   */
  CompilationUnit createCompilationUnit();

  /**
   * Returns a new object of class '<em>Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identifier</em>'.
   * @generated
   */
  Identifier createIdentifier();

  /**
   * Returns a new object of class '<em>Using Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Using Directive</em>'.
   * @generated
   */
  UsingDirective createUsingDirective();

  /**
   * Returns a new object of class '<em>Array Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Type</em>'.
   * @generated
   */
  ArrayType createArrayType();

  /**
   * Returns a new object of class '<em>Global Attributes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Attributes</em>'.
   * @generated
   */
  GlobalAttributes createGlobalAttributes();

  /**
   * Returns a new object of class '<em>Global Attribute Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Attribute Section</em>'.
   * @generated
   */
  GlobalAttributeSection createGlobalAttributeSection();

  /**
   * Returns a new object of class '<em>Attributes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attributes</em>'.
   * @generated
   */
  Attributes createAttributes();

  /**
   * Returns a new object of class '<em>Attribute Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Section</em>'.
   * @generated
   */
  AttributeSection createAttributeSection();

  /**
   * Returns a new object of class '<em>Attribute List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute List</em>'.
   * @generated
   */
  AttributeList createAttributeList();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Attribute Arguments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Arguments</em>'.
   * @generated
   */
  AttributeArguments createAttributeArguments();

  /**
   * Returns a new object of class '<em>Expression List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression List</em>'.
   * @generated
   */
  ExpressionList createExpressionList();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Expression2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression2</em>'.
   * @generated
   */
  Expression2 createExpression2();

  /**
   * Returns a new object of class '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Expression</em>'.
   * @generated
   */
  UnaryExpression createUnaryExpression();

  /**
   * Returns a new object of class '<em>Primary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Expression</em>'.
   * @generated
   */
  PrimaryExpression createPrimaryExpression();

  /**
   * Returns a new object of class '<em>Primary Expression2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Expression2</em>'.
   * @generated
   */
  PrimaryExpression2 createPrimaryExpression2();

  /**
   * Returns a new object of class '<em>Array Initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Initializer</em>'.
   * @generated
   */
  ArrayInitializer createArrayInitializer();

  /**
   * Returns a new object of class '<em>Variable Initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Initializer</em>'.
   * @generated
   */
  VariableInitializer createVariableInitializer();

  /**
   * Returns a new object of class '<em>Attribute Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Name</em>'.
   * @generated
   */
  AttributeName createAttributeName();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Integral Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integral Type</em>'.
   * @generated
   */
  IntegralType createIntegralType();

  /**
   * Returns a new object of class '<em>Non Array Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Array Type</em>'.
   * @generated
   */
  NonArrayType createNonArrayType();

  /**
   * Returns a new object of class '<em>Built In Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Built In Type</em>'.
   * @generated
   */
  BuiltInType createBuiltInType();

  /**
   * Returns a new object of class '<em>Built In Class Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Built In Class Type</em>'.
   * @generated
   */
  BuiltInClassType createBuiltInClassType();

  /**
   * Returns a new object of class '<em>Qualified Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Identifier</em>'.
   * @generated
   */
  QualifiedIdentifier createQualifiedIdentifier();

  /**
   * Returns a new object of class '<em>Namespace Member Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace Member Declaration</em>'.
   * @generated
   */
  NamespaceMemberDeclaration createNamespaceMemberDeclaration();

  /**
   * Returns a new object of class '<em>Namespace Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace Declaration</em>'.
   * @generated
   */
  NamespaceDeclaration createNamespaceDeclaration();

  /**
   * Returns a new object of class '<em>Namespace Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace Body</em>'.
   * @generated
   */
  NamespaceBody createNamespaceBody();

  /**
   * Returns a new object of class '<em>Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Declaration</em>'.
   * @generated
   */
  TypeDeclaration createTypeDeclaration();

  /**
   * Returns a new object of class '<em>Delegate Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delegate Declaration</em>'.
   * @generated
   */
  DelegateDeclaration createDelegateDeclaration();

  /**
   * Returns a new object of class '<em>Enum Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Declaration</em>'.
   * @generated
   */
  EnumDeclaration createEnumDeclaration();

  /**
   * Returns a new object of class '<em>Enum Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Body</em>'.
   * @generated
   */
  EnumBody createEnumBody();

  /**
   * Returns a new object of class '<em>Enum Member Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Member Declaration</em>'.
   * @generated
   */
  EnumMemberDeclaration createEnumMemberDeclaration();

  /**
   * Returns a new object of class '<em>Interface Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Declaration</em>'.
   * @generated
   */
  InterfaceDeclaration createInterfaceDeclaration();

  /**
   * Returns a new object of class '<em>Interface Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Body</em>'.
   * @generated
   */
  InterfaceBody createInterfaceBody();

  /**
   * Returns a new object of class '<em>Interface Member Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Member Declaration</em>'.
   * @generated
   */
  InterfaceMemberDeclaration createInterfaceMemberDeclaration();

  /**
   * Returns a new object of class '<em>Interface Indexer Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Indexer Declaration</em>'.
   * @generated
   */
  InterfaceIndexerDeclaration createInterfaceIndexerDeclaration();

  /**
   * Returns a new object of class '<em>Interface Event Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Event Declaration</em>'.
   * @generated
   */
  InterfaceEventDeclaration createInterfaceEventDeclaration();

  /**
   * Returns a new object of class '<em>Interface Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Property Declaration</em>'.
   * @generated
   */
  InterfacePropertyDeclaration createInterfacePropertyDeclaration();

  /**
   * Returns a new object of class '<em>Interface Accessors</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Accessors</em>'.
   * @generated
   */
  InterfaceAccessors createInterfaceAccessors();

  /**
   * Returns a new object of class '<em>Interface Method Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Method Declaration</em>'.
   * @generated
   */
  InterfaceMethodDeclaration createInterfaceMethodDeclaration();

  /**
   * Returns a new object of class '<em>Class Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Declaration</em>'.
   * @generated
   */
  ClassDeclaration createClassDeclaration();

  /**
   * Returns a new object of class '<em>Class Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Body</em>'.
   * @generated
   */
  ClassBody createClassBody();

  /**
   * Returns a new object of class '<em>Class Member Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Member Declaration</em>'.
   * @generated
   */
  ClassMemberDeclaration createClassMemberDeclaration();

  /**
   * Returns a new object of class '<em>Static Constructor Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Constructor Declaration</em>'.
   * @generated
   */
  StaticConstructorDeclaration createStaticConstructorDeclaration();

  /**
   * Returns a new object of class '<em>Destructor Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Destructor Declaration</em>'.
   * @generated
   */
  DestructorDeclaration createDestructorDeclaration();

  /**
   * Returns a new object of class '<em>Constructor Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor Declaration</em>'.
   * @generated
   */
  ConstructorDeclaration createConstructorDeclaration();

  /**
   * Returns a new object of class '<em>Constructor Declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor Declarator</em>'.
   * @generated
   */
  ConstructorDeclarator createConstructorDeclarator();

  /**
   * Returns a new object of class '<em>Constructor Initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor Initializer</em>'.
   * @generated
   */
  ConstructorInitializer createConstructorInitializer();

  /**
   * Returns a new object of class '<em>Argument List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument List</em>'.
   * @generated
   */
  ArgumentList createArgumentList();

  /**
   * Returns a new object of class '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument</em>'.
   * @generated
   */
  Argument createArgument();

  /**
   * Returns a new object of class '<em>Operator Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator Declaration</em>'.
   * @generated
   */
  OperatorDeclaration createOperatorDeclaration();

  /**
   * Returns a new object of class '<em>Operator Declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator Declarator</em>'.
   * @generated
   */
  OperatorDeclarator createOperatorDeclarator();

  /**
   * Returns a new object of class '<em>Conversion Operator Declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conversion Operator Declarator</em>'.
   * @generated
   */
  ConversionOperatorDeclarator createConversionOperatorDeclarator();

  /**
   * Returns a new object of class '<em>Binary Operator Declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binary Operator Declarator</em>'.
   * @generated
   */
  BinaryOperatorDeclarator createBinaryOperatorDeclarator();

  /**
   * Returns a new object of class '<em>Unary Operator Declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Operator Declarator</em>'.
   * @generated
   */
  UnaryOperatorDeclarator createUnaryOperatorDeclarator();

  /**
   * Returns a new object of class '<em>Indexer Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indexer Declaration</em>'.
   * @generated
   */
  IndexerDeclaration createIndexerDeclaration();

  /**
   * Returns a new object of class '<em>Indexer Declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indexer Declarator</em>'.
   * @generated
   */
  IndexerDeclarator createIndexerDeclarator();

  /**
   * Returns a new object of class '<em>Event Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Declaration</em>'.
   * @generated
   */
  EventDeclaration createEventDeclaration();

  /**
   * Returns a new object of class '<em>Event Accessor Declarations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Accessor Declarations</em>'.
   * @generated
   */
  EventAccessorDeclarations createEventAccessorDeclarations();

  /**
   * Returns a new object of class '<em>Remove Accessor Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Accessor Declaration</em>'.
   * @generated
   */
  RemoveAccessorDeclaration createRemoveAccessorDeclaration();

  /**
   * Returns a new object of class '<em>Add Accessor Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Accessor Declaration</em>'.
   * @generated
   */
  AddAccessorDeclaration createAddAccessorDeclaration();

  /**
   * Returns a new object of class '<em>Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Declaration</em>'.
   * @generated
   */
  PropertyDeclaration createPropertyDeclaration();

  /**
   * Returns a new object of class '<em>Accessor Declarations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Accessor Declarations</em>'.
   * @generated
   */
  AccessorDeclarations createAccessorDeclarations();

  /**
   * Returns a new object of class '<em>Set Accessor Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Accessor Declaration</em>'.
   * @generated
   */
  SetAccessorDeclaration createSetAccessorDeclaration();

  /**
   * Returns a new object of class '<em>Get Accessor Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Get Accessor Declaration</em>'.
   * @generated
   */
  GetAccessorDeclaration createGetAccessorDeclaration();

  /**
   * Returns a new object of class '<em>Method Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Declaration</em>'.
   * @generated
   */
  MethodDeclaration createMethodDeclaration();

  /**
   * Returns a new object of class '<em>Method Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Header</em>'.
   * @generated
   */
  MethodHeader createMethodHeader();

  /**
   * Returns a new object of class '<em>Formal Parameter List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Parameter List</em>'.
   * @generated
   */
  FormalParameterList createFormalParameterList();

  /**
   * Returns a new object of class '<em>Parameter Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Array</em>'.
   * @generated
   */
  ParameterArray createParameterArray();

  /**
   * Returns a new object of class '<em>Fixed Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fixed Parameters</em>'.
   * @generated
   */
  FixedParameters createFixedParameters();

  /**
   * Returns a new object of class '<em>Fixed Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fixed Parameter</em>'.
   * @generated
   */
  FixedParameter createFixedParameter();

  /**
   * Returns a new object of class '<em>Type Or Void</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Or Void</em>'.
   * @generated
   */
  TypeOrVoid createTypeOrVoid();

  /**
   * Returns a new object of class '<em>Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Declaration</em>'.
   * @generated
   */
  FieldDeclaration createFieldDeclaration();

  /**
   * Returns a new object of class '<em>Variable Declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declarator</em>'.
   * @generated
   */
  VariableDeclarator createVariableDeclarator();

  /**
   * Returns a new object of class '<em>Constant Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Declaration</em>'.
   * @generated
   */
  ConstantDeclaration createConstantDeclaration();

  /**
   * Returns a new object of class '<em>Constant Declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Declarator</em>'.
   * @generated
   */
  ConstantDeclarator createConstantDeclarator();

  /**
   * Returns a new object of class '<em>Class Base</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Base</em>'.
   * @generated
   */
  ClassBase createClassBase();

  /**
   * Returns a new object of class '<em>Qualified Identifier List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Identifier List</em>'.
   * @generated
   */
  QualifiedIdentifierList createQualifiedIdentifierList();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Declaration Statment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration Statment</em>'.
   * @generated
   */
  DeclarationStatment createDeclarationStatment();

  /**
   * Returns a new object of class '<em>Localconstant Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Localconstant Declaration</em>'.
   * @generated
   */
  LocalconstantDeclaration createLocalconstantDeclaration();

  /**
   * Returns a new object of class '<em>Labeled Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Labeled Statement</em>'.
   * @generated
   */
  LabeledStatement createLabeledStatement();

  /**
   * Returns a new object of class '<em>Embedded Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Embedded Statement</em>'.
   * @generated
   */
  EmbeddedStatement createEmbeddedStatement();

  /**
   * Returns a new object of class '<em>Using Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Using Statement</em>'.
   * @generated
   */
  UsingStatement createUsingStatement();

  /**
   * Returns a new object of class '<em>Resource Aquisition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Aquisition</em>'.
   * @generated
   */
  ResourceAquisition createResourceAquisition();

  /**
   * Returns a new object of class '<em>Local Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Variable Declaration</em>'.
   * @generated
   */
  LocalVariableDeclaration createLocalVariableDeclaration();

  /**
   * Returns a new object of class '<em>Lock Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lock Statement</em>'.
   * @generated
   */
  LockStatement createLockStatement();

  /**
   * Returns a new object of class '<em>Try Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Try Statement</em>'.
   * @generated
   */
  TryStatement createTryStatement();

  /**
   * Returns a new object of class '<em>Finally Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Finally Clause</em>'.
   * @generated
   */
  FinallyClause createFinallyClause();

  /**
   * Returns a new object of class '<em>Catch Clauses</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Catch Clauses</em>'.
   * @generated
   */
  CatchClauses createCatchClauses();

  /**
   * Returns a new object of class '<em>General Catchclause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>General Catchclause</em>'.
   * @generated
   */
  GeneralCatchclause createGeneralCatchclause();

  /**
   * Returns a new object of class '<em>Specific Catch Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Specific Catch Clause</em>'.
   * @generated
   */
  SpecificCatchClause createSpecificCatchClause();

  /**
   * Returns a new object of class '<em>Jump Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jump Statement</em>'.
   * @generated
   */
  JumpStatement createJumpStatement();

  /**
   * Returns a new object of class '<em>Throw Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Throw Statement</em>'.
   * @generated
   */
  ThrowStatement createThrowStatement();

  /**
   * Returns a new object of class '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Statement</em>'.
   * @generated
   */
  ReturnStatement createReturnStatement();

  /**
   * Returns a new object of class '<em>Goto Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goto Statement</em>'.
   * @generated
   */
  GotoStatement createGotoStatement();

  /**
   * Returns a new object of class '<em>Continue Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Continue Statement</em>'.
   * @generated
   */
  ContinueStatement createContinueStatement();

  /**
   * Returns a new object of class '<em>Break Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Break Statement</em>'.
   * @generated
   */
  BreakStatement createBreakStatement();

  /**
   * Returns a new object of class '<em>Iteration Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iteration Statement</em>'.
   * @generated
   */
  IterationStatement createIterationStatement();

  /**
   * Returns a new object of class '<em>Foreach Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Foreach Statement</em>'.
   * @generated
   */
  ForeachStatement createForeachStatement();

  /**
   * Returns a new object of class '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Statement</em>'.
   * @generated
   */
  ForStatement createForStatement();

  /**
   * Returns a new object of class '<em>For Initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Initializer</em>'.
   * @generated
   */
  ForInitializer createForInitializer();

  /**
   * Returns a new object of class '<em>Statement Expression List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement Expression List</em>'.
   * @generated
   */
  StatementExpressionList createStatementExpressionList();

  /**
   * Returns a new object of class '<em>Statement Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement Expression</em>'.
   * @generated
   */
  StatementExpression createStatementExpression();

  /**
   * Returns a new object of class '<em>Do Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do Statement</em>'.
   * @generated
   */
  DoStatement createDoStatement();

  /**
   * Returns a new object of class '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Statement</em>'.
   * @generated
   */
  WhileStatement createWhileStatement();

  /**
   * Returns a new object of class '<em>Selection Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selection Statement</em>'.
   * @generated
   */
  SelectionStatement createSelectionStatement();

  /**
   * Returns a new object of class '<em>Switch Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch Statement</em>'.
   * @generated
   */
  SwitchStatement createSwitchStatement();

  /**
   * Returns a new object of class '<em>Switch Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch Section</em>'.
   * @generated
   */
  SwitchSection createSwitchSection();

  /**
   * Returns a new object of class '<em>Switch Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch Label</em>'.
   * @generated
   */
  SwitchLabel createSwitchLabel();

  /**
   * Returns a new object of class '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement</em>'.
   * @generated
   */
  IfStatement createIfStatement();

  /**
   * Returns a new object of class '<em>Else Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Else Part</em>'.
   * @generated
   */
  ElsePart createElsePart();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Maybe Empty Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Maybe Empty Block</em>'.
   * @generated
   */
  MaybeEmptyBlock createMaybeEmptyBlock();

  /**
   * Returns a new object of class '<em>SByte</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SByte</em>'.
   * @generated
   */
  SByte createSByte();

  /**
   * Returns a new object of class '<em>Byte</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Byte</em>'.
   * @generated
   */
  Byte createByte();

  /**
   * Returns a new object of class '<em>Short</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Short</em>'.
   * @generated
   */
  Short createShort();

  /**
   * Returns a new object of class '<em>UShort</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UShort</em>'.
   * @generated
   */
  UShort createUShort();

  /**
   * Returns a new object of class '<em>Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int</em>'.
   * @generated
   */
  Int createInt();

  /**
   * Returns a new object of class '<em>UInt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UInt</em>'.
   * @generated
   */
  UInt createUInt();

  /**
   * Returns a new object of class '<em>Long</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Long</em>'.
   * @generated
   */
  Long createLong();

  /**
   * Returns a new object of class '<em>ULong</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ULong</em>'.
   * @generated
   */
  ULong createULong();

  /**
   * Returns a new object of class '<em>Char</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Char</em>'.
   * @generated
   */
  Char createChar();

  /**
   * Returns a new object of class '<em>Bool</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool</em>'.
   * @generated
   */
  Bool createBool();

  /**
   * Returns a new object of class '<em>Decimal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decimal</em>'.
   * @generated
   */
  Decimal createDecimal();

  /**
   * Returns a new object of class '<em>Float</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float</em>'.
   * @generated
   */
  Float createFloat();

  /**
   * Returns a new object of class '<em>Double</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double</em>'.
   * @generated
   */
  Double createDouble();

  /**
   * Returns a new object of class '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object</em>'.
   * @generated
   */
  Object createObject();

  /**
   * Returns a new object of class '<em>String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String</em>'.
   * @generated
   */
  String createString();

  /**
   * Returns a new object of class '<em>Void</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Void</em>'.
   * @generated
   */
  Void createVoid();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CSharpPackage getCSharpPackage();

} //CSharpFactory
