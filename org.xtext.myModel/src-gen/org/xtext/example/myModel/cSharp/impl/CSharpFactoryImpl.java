/**
 */
package org.xtext.example.myModel.cSharp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.myModel.cSharp.AccessorDeclarations;
import org.xtext.example.myModel.cSharp.AddAccessorDeclaration;
import org.xtext.example.myModel.cSharp.Argument;
import org.xtext.example.myModel.cSharp.ArgumentList;
import org.xtext.example.myModel.cSharp.ArrayInitializer;
import org.xtext.example.myModel.cSharp.ArrayType;
import org.xtext.example.myModel.cSharp.Attribute;
import org.xtext.example.myModel.cSharp.AttributeArguments;
import org.xtext.example.myModel.cSharp.AttributeList;
import org.xtext.example.myModel.cSharp.AttributeName;
import org.xtext.example.myModel.cSharp.AttributeSection;
import org.xtext.example.myModel.cSharp.Attributes;
import org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator;
import org.xtext.example.myModel.cSharp.Block;
import org.xtext.example.myModel.cSharp.Bool;
import org.xtext.example.myModel.cSharp.BreakStatement;
import org.xtext.example.myModel.cSharp.BuiltInClassType;
import org.xtext.example.myModel.cSharp.BuiltInType;
import org.xtext.example.myModel.cSharp.CSharpFactory;
import org.xtext.example.myModel.cSharp.CSharpPackage;
import org.xtext.example.myModel.cSharp.CatchClauses;
import org.xtext.example.myModel.cSharp.Char;
import org.xtext.example.myModel.cSharp.ClassBase;
import org.xtext.example.myModel.cSharp.ClassBody;
import org.xtext.example.myModel.cSharp.ClassDeclaration;
import org.xtext.example.myModel.cSharp.ClassMemberDeclaration;
import org.xtext.example.myModel.cSharp.CompilationUnit;
import org.xtext.example.myModel.cSharp.ConstantDeclaration;
import org.xtext.example.myModel.cSharp.ConstantDeclarator;
import org.xtext.example.myModel.cSharp.ConstructorDeclaration;
import org.xtext.example.myModel.cSharp.ConstructorDeclarator;
import org.xtext.example.myModel.cSharp.ConstructorInitializer;
import org.xtext.example.myModel.cSharp.ContinueStatement;
import org.xtext.example.myModel.cSharp.ConversionOperatorDeclarator;
import org.xtext.example.myModel.cSharp.Decimal;
import org.xtext.example.myModel.cSharp.DeclarationStatment;
import org.xtext.example.myModel.cSharp.DelegateDeclaration;
import org.xtext.example.myModel.cSharp.DestructorDeclaration;
import org.xtext.example.myModel.cSharp.DoStatement;
import org.xtext.example.myModel.cSharp.ElsePart;
import org.xtext.example.myModel.cSharp.EmbeddedStatement;
import org.xtext.example.myModel.cSharp.EnumBody;
import org.xtext.example.myModel.cSharp.EnumDeclaration;
import org.xtext.example.myModel.cSharp.EnumMemberDeclaration;
import org.xtext.example.myModel.cSharp.EventAccessorDeclarations;
import org.xtext.example.myModel.cSharp.EventDeclaration;
import org.xtext.example.myModel.cSharp.Expression;
import org.xtext.example.myModel.cSharp.Expression2;
import org.xtext.example.myModel.cSharp.ExpressionList;
import org.xtext.example.myModel.cSharp.FieldDeclaration;
import org.xtext.example.myModel.cSharp.FinallyClause;
import org.xtext.example.myModel.cSharp.FixedParameter;
import org.xtext.example.myModel.cSharp.FixedParameters;
import org.xtext.example.myModel.cSharp.ForInitializer;
import org.xtext.example.myModel.cSharp.ForStatement;
import org.xtext.example.myModel.cSharp.ForeachStatement;
import org.xtext.example.myModel.cSharp.FormalParameterList;
import org.xtext.example.myModel.cSharp.GeneralCatchclause;
import org.xtext.example.myModel.cSharp.GetAccessorDeclaration;
import org.xtext.example.myModel.cSharp.GlobalAttributeSection;
import org.xtext.example.myModel.cSharp.GlobalAttributes;
import org.xtext.example.myModel.cSharp.GotoStatement;
import org.xtext.example.myModel.cSharp.Identifier;
import org.xtext.example.myModel.cSharp.IfStatement;
import org.xtext.example.myModel.cSharp.IndexerDeclaration;
import org.xtext.example.myModel.cSharp.IndexerDeclarator;
import org.xtext.example.myModel.cSharp.Int;
import org.xtext.example.myModel.cSharp.IntegralType;
import org.xtext.example.myModel.cSharp.InterfaceAccessors;
import org.xtext.example.myModel.cSharp.InterfaceBody;
import org.xtext.example.myModel.cSharp.InterfaceDeclaration;
import org.xtext.example.myModel.cSharp.InterfaceEventDeclaration;
import org.xtext.example.myModel.cSharp.InterfaceIndexerDeclaration;
import org.xtext.example.myModel.cSharp.InterfaceMemberDeclaration;
import org.xtext.example.myModel.cSharp.InterfaceMethodDeclaration;
import org.xtext.example.myModel.cSharp.InterfacePropertyDeclaration;
import org.xtext.example.myModel.cSharp.IterationStatement;
import org.xtext.example.myModel.cSharp.JumpStatement;
import org.xtext.example.myModel.cSharp.LabeledStatement;
import org.xtext.example.myModel.cSharp.LocalVariableDeclaration;
import org.xtext.example.myModel.cSharp.LocalconstantDeclaration;
import org.xtext.example.myModel.cSharp.LockStatement;
import org.xtext.example.myModel.cSharp.MaybeEmptyBlock;
import org.xtext.example.myModel.cSharp.MethodDeclaration;
import org.xtext.example.myModel.cSharp.MethodHeader;
import org.xtext.example.myModel.cSharp.NamespaceBody;
import org.xtext.example.myModel.cSharp.NamespaceDeclaration;
import org.xtext.example.myModel.cSharp.NamespaceMemberDeclaration;
import org.xtext.example.myModel.cSharp.NonArrayType;
import org.xtext.example.myModel.cSharp.OperatorDeclaration;
import org.xtext.example.myModel.cSharp.OperatorDeclarator;
import org.xtext.example.myModel.cSharp.ParameterArray;
import org.xtext.example.myModel.cSharp.PrimaryExpression;
import org.xtext.example.myModel.cSharp.PrimaryExpression2;
import org.xtext.example.myModel.cSharp.PropertyDeclaration;
import org.xtext.example.myModel.cSharp.QualifiedIdentifier;
import org.xtext.example.myModel.cSharp.QualifiedIdentifierList;
import org.xtext.example.myModel.cSharp.RemoveAccessorDeclaration;
import org.xtext.example.myModel.cSharp.ResourceAquisition;
import org.xtext.example.myModel.cSharp.ReturnStatement;
import org.xtext.example.myModel.cSharp.SByte;
import org.xtext.example.myModel.cSharp.SelectionStatement;
import org.xtext.example.myModel.cSharp.SetAccessorDeclaration;
import org.xtext.example.myModel.cSharp.SpecificCatchClause;
import org.xtext.example.myModel.cSharp.Statement;
import org.xtext.example.myModel.cSharp.StatementExpression;
import org.xtext.example.myModel.cSharp.StatementExpressionList;
import org.xtext.example.myModel.cSharp.StaticConstructorDeclaration;
import org.xtext.example.myModel.cSharp.SwitchLabel;
import org.xtext.example.myModel.cSharp.SwitchSection;
import org.xtext.example.myModel.cSharp.SwitchStatement;
import org.xtext.example.myModel.cSharp.ThrowStatement;
import org.xtext.example.myModel.cSharp.TryStatement;
import org.xtext.example.myModel.cSharp.Type;
import org.xtext.example.myModel.cSharp.TypeDeclaration;
import org.xtext.example.myModel.cSharp.TypeOrVoid;
import org.xtext.example.myModel.cSharp.UInt;
import org.xtext.example.myModel.cSharp.ULong;
import org.xtext.example.myModel.cSharp.UShort;
import org.xtext.example.myModel.cSharp.UnaryExpression;
import org.xtext.example.myModel.cSharp.UnaryOperatorDeclarator;
import org.xtext.example.myModel.cSharp.UsingDirective;
import org.xtext.example.myModel.cSharp.UsingStatement;
import org.xtext.example.myModel.cSharp.VariableDeclarator;
import org.xtext.example.myModel.cSharp.VariableInitializer;
import org.xtext.example.myModel.cSharp.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSharpFactoryImpl extends EFactoryImpl implements CSharpFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CSharpFactory init()
  {
    try
    {
      CSharpFactory theCSharpFactory = (CSharpFactory)EPackage.Registry.INSTANCE.getEFactory(CSharpPackage.eNS_URI);
      if (theCSharpFactory != null)
      {
        return theCSharpFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CSharpFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSharpFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CSharpPackage.COMPILATION_UNIT: return createCompilationUnit();
      case CSharpPackage.IDENTIFIER: return createIdentifier();
      case CSharpPackage.USING_DIRECTIVE: return createUsingDirective();
      case CSharpPackage.ARRAY_TYPE: return createArrayType();
      case CSharpPackage.GLOBAL_ATTRIBUTES: return createGlobalAttributes();
      case CSharpPackage.GLOBAL_ATTRIBUTE_SECTION: return createGlobalAttributeSection();
      case CSharpPackage.ATTRIBUTES: return createAttributes();
      case CSharpPackage.ATTRIBUTE_SECTION: return createAttributeSection();
      case CSharpPackage.ATTRIBUTE_LIST: return createAttributeList();
      case CSharpPackage.ATTRIBUTE: return createAttribute();
      case CSharpPackage.ATTRIBUTE_ARGUMENTS: return createAttributeArguments();
      case CSharpPackage.EXPRESSION_LIST: return createExpressionList();
      case CSharpPackage.EXPRESSION: return createExpression();
      case CSharpPackage.EXPRESSION2: return createExpression2();
      case CSharpPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case CSharpPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      case CSharpPackage.PRIMARY_EXPRESSION2: return createPrimaryExpression2();
      case CSharpPackage.ARRAY_INITIALIZER: return createArrayInitializer();
      case CSharpPackage.VARIABLE_INITIALIZER: return createVariableInitializer();
      case CSharpPackage.ATTRIBUTE_NAME: return createAttributeName();
      case CSharpPackage.TYPE: return createType();
      case CSharpPackage.INTEGRAL_TYPE: return createIntegralType();
      case CSharpPackage.NON_ARRAY_TYPE: return createNonArrayType();
      case CSharpPackage.BUILT_IN_TYPE: return createBuiltInType();
      case CSharpPackage.BUILT_IN_CLASS_TYPE: return createBuiltInClassType();
      case CSharpPackage.QUALIFIED_IDENTIFIER: return createQualifiedIdentifier();
      case CSharpPackage.NAMESPACE_MEMBER_DECLARATION: return createNamespaceMemberDeclaration();
      case CSharpPackage.NAMESPACE_DECLARATION: return createNamespaceDeclaration();
      case CSharpPackage.NAMESPACE_BODY: return createNamespaceBody();
      case CSharpPackage.TYPE_DECLARATION: return createTypeDeclaration();
      case CSharpPackage.DELEGATE_DECLARATION: return createDelegateDeclaration();
      case CSharpPackage.ENUM_DECLARATION: return createEnumDeclaration();
      case CSharpPackage.ENUM_BODY: return createEnumBody();
      case CSharpPackage.ENUM_MEMBER_DECLARATION: return createEnumMemberDeclaration();
      case CSharpPackage.INTERFACE_DECLARATION: return createInterfaceDeclaration();
      case CSharpPackage.INTERFACE_BODY: return createInterfaceBody();
      case CSharpPackage.INTERFACE_MEMBER_DECLARATION: return createInterfaceMemberDeclaration();
      case CSharpPackage.INTERFACE_INDEXER_DECLARATION: return createInterfaceIndexerDeclaration();
      case CSharpPackage.INTERFACE_EVENT_DECLARATION: return createInterfaceEventDeclaration();
      case CSharpPackage.INTERFACE_PROPERTY_DECLARATION: return createInterfacePropertyDeclaration();
      case CSharpPackage.INTERFACE_ACCESSORS: return createInterfaceAccessors();
      case CSharpPackage.INTERFACE_METHOD_DECLARATION: return createInterfaceMethodDeclaration();
      case CSharpPackage.CLASS_DECLARATION: return createClassDeclaration();
      case CSharpPackage.CLASS_BODY: return createClassBody();
      case CSharpPackage.CLASS_MEMBER_DECLARATION: return createClassMemberDeclaration();
      case CSharpPackage.STATIC_CONSTRUCTOR_DECLARATION: return createStaticConstructorDeclaration();
      case CSharpPackage.DESTRUCTOR_DECLARATION: return createDestructorDeclaration();
      case CSharpPackage.CONSTRUCTOR_DECLARATION: return createConstructorDeclaration();
      case CSharpPackage.CONSTRUCTOR_DECLARATOR: return createConstructorDeclarator();
      case CSharpPackage.CONSTRUCTOR_INITIALIZER: return createConstructorInitializer();
      case CSharpPackage.ARGUMENT_LIST: return createArgumentList();
      case CSharpPackage.ARGUMENT: return createArgument();
      case CSharpPackage.OPERATOR_DECLARATION: return createOperatorDeclaration();
      case CSharpPackage.OPERATOR_DECLARATOR: return createOperatorDeclarator();
      case CSharpPackage.CONVERSION_OPERATOR_DECLARATOR: return createConversionOperatorDeclarator();
      case CSharpPackage.BINARY_OPERATOR_DECLARATOR: return createBinaryOperatorDeclarator();
      case CSharpPackage.UNARY_OPERATOR_DECLARATOR: return createUnaryOperatorDeclarator();
      case CSharpPackage.INDEXER_DECLARATION: return createIndexerDeclaration();
      case CSharpPackage.INDEXER_DECLARATOR: return createIndexerDeclarator();
      case CSharpPackage.EVENT_DECLARATION: return createEventDeclaration();
      case CSharpPackage.EVENT_ACCESSOR_DECLARATIONS: return createEventAccessorDeclarations();
      case CSharpPackage.REMOVE_ACCESSOR_DECLARATION: return createRemoveAccessorDeclaration();
      case CSharpPackage.ADD_ACCESSOR_DECLARATION: return createAddAccessorDeclaration();
      case CSharpPackage.PROPERTY_DECLARATION: return createPropertyDeclaration();
      case CSharpPackage.ACCESSOR_DECLARATIONS: return createAccessorDeclarations();
      case CSharpPackage.SET_ACCESSOR_DECLARATION: return createSetAccessorDeclaration();
      case CSharpPackage.GET_ACCESSOR_DECLARATION: return createGetAccessorDeclaration();
      case CSharpPackage.METHOD_DECLARATION: return createMethodDeclaration();
      case CSharpPackage.METHOD_HEADER: return createMethodHeader();
      case CSharpPackage.FORMAL_PARAMETER_LIST: return createFormalParameterList();
      case CSharpPackage.PARAMETER_ARRAY: return createParameterArray();
      case CSharpPackage.FIXED_PARAMETERS: return createFixedParameters();
      case CSharpPackage.FIXED_PARAMETER: return createFixedParameter();
      case CSharpPackage.TYPE_OR_VOID: return createTypeOrVoid();
      case CSharpPackage.FIELD_DECLARATION: return createFieldDeclaration();
      case CSharpPackage.VARIABLE_DECLARATOR: return createVariableDeclarator();
      case CSharpPackage.CONSTANT_DECLARATION: return createConstantDeclaration();
      case CSharpPackage.CONSTANT_DECLARATOR: return createConstantDeclarator();
      case CSharpPackage.CLASS_BASE: return createClassBase();
      case CSharpPackage.QUALIFIED_IDENTIFIER_LIST: return createQualifiedIdentifierList();
      case CSharpPackage.STATEMENT: return createStatement();
      case CSharpPackage.DECLARATION_STATMENT: return createDeclarationStatment();
      case CSharpPackage.LOCALCONSTANT_DECLARATION: return createLocalconstantDeclaration();
      case CSharpPackage.LABELED_STATEMENT: return createLabeledStatement();
      case CSharpPackage.EMBEDDED_STATEMENT: return createEmbeddedStatement();
      case CSharpPackage.USING_STATEMENT: return createUsingStatement();
      case CSharpPackage.RESOURCE_AQUISITION: return createResourceAquisition();
      case CSharpPackage.LOCAL_VARIABLE_DECLARATION: return createLocalVariableDeclaration();
      case CSharpPackage.LOCK_STATEMENT: return createLockStatement();
      case CSharpPackage.TRY_STATEMENT: return createTryStatement();
      case CSharpPackage.FINALLY_CLAUSE: return createFinallyClause();
      case CSharpPackage.CATCH_CLAUSES: return createCatchClauses();
      case CSharpPackage.GENERAL_CATCHCLAUSE: return createGeneralCatchclause();
      case CSharpPackage.SPECIFIC_CATCH_CLAUSE: return createSpecificCatchClause();
      case CSharpPackage.JUMP_STATEMENT: return createJumpStatement();
      case CSharpPackage.THROW_STATEMENT: return createThrowStatement();
      case CSharpPackage.RETURN_STATEMENT: return createReturnStatement();
      case CSharpPackage.GOTO_STATEMENT: return createGotoStatement();
      case CSharpPackage.CONTINUE_STATEMENT: return createContinueStatement();
      case CSharpPackage.BREAK_STATEMENT: return createBreakStatement();
      case CSharpPackage.ITERATION_STATEMENT: return createIterationStatement();
      case CSharpPackage.FOREACH_STATEMENT: return createForeachStatement();
      case CSharpPackage.FOR_STATEMENT: return createForStatement();
      case CSharpPackage.FOR_INITIALIZER: return createForInitializer();
      case CSharpPackage.STATEMENT_EXPRESSION_LIST: return createStatementExpressionList();
      case CSharpPackage.STATEMENT_EXPRESSION: return createStatementExpression();
      case CSharpPackage.DO_STATEMENT: return createDoStatement();
      case CSharpPackage.WHILE_STATEMENT: return createWhileStatement();
      case CSharpPackage.SELECTION_STATEMENT: return createSelectionStatement();
      case CSharpPackage.SWITCH_STATEMENT: return createSwitchStatement();
      case CSharpPackage.SWITCH_SECTION: return createSwitchSection();
      case CSharpPackage.SWITCH_LABEL: return createSwitchLabel();
      case CSharpPackage.IF_STATEMENT: return createIfStatement();
      case CSharpPackage.ELSE_PART: return createElsePart();
      case CSharpPackage.BLOCK: return createBlock();
      case CSharpPackage.MAYBE_EMPTY_BLOCK: return createMaybeEmptyBlock();
      case CSharpPackage.SBYTE: return createSByte();
      case CSharpPackage.BYTE: return createByte();
      case CSharpPackage.SHORT: return createShort();
      case CSharpPackage.USHORT: return createUShort();
      case CSharpPackage.INT: return createInt();
      case CSharpPackage.UINT: return createUInt();
      case CSharpPackage.LONG: return createLong();
      case CSharpPackage.ULONG: return createULong();
      case CSharpPackage.CHAR: return createChar();
      case CSharpPackage.BOOL: return createBool();
      case CSharpPackage.DECIMAL: return createDecimal();
      case CSharpPackage.FLOAT: return createFloat();
      case CSharpPackage.DOUBLE: return createDouble();
      case CSharpPackage.OBJECT: return createObject();
      case CSharpPackage.STRING: return createString();
      case CSharpPackage.VOID: return createVoid();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompilationUnit createCompilationUnit()
  {
    CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
    return compilationUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identifier createIdentifier()
  {
    IdentifierImpl identifier = new IdentifierImpl();
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsingDirective createUsingDirective()
  {
    UsingDirectiveImpl usingDirective = new UsingDirectiveImpl();
    return usingDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType createArrayType()
  {
    ArrayTypeImpl arrayType = new ArrayTypeImpl();
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalAttributes createGlobalAttributes()
  {
    GlobalAttributesImpl globalAttributes = new GlobalAttributesImpl();
    return globalAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalAttributeSection createGlobalAttributeSection()
  {
    GlobalAttributeSectionImpl globalAttributeSection = new GlobalAttributeSectionImpl();
    return globalAttributeSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attributes createAttributes()
  {
    AttributesImpl attributes = new AttributesImpl();
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeSection createAttributeSection()
  {
    AttributeSectionImpl attributeSection = new AttributeSectionImpl();
    return attributeSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeList createAttributeList()
  {
    AttributeListImpl attributeList = new AttributeListImpl();
    return attributeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeArguments createAttributeArguments()
  {
    AttributeArgumentsImpl attributeArguments = new AttributeArgumentsImpl();
    return attributeArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList createExpressionList()
  {
    ExpressionListImpl expressionList = new ExpressionListImpl();
    return expressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression2 createExpression2()
  {
    Expression2Impl expression2 = new Expression2Impl();
    return expression2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpression2 createPrimaryExpression2()
  {
    PrimaryExpression2Impl primaryExpression2 = new PrimaryExpression2Impl();
    return primaryExpression2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayInitializer createArrayInitializer()
  {
    ArrayInitializerImpl arrayInitializer = new ArrayInitializerImpl();
    return arrayInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableInitializer createVariableInitializer()
  {
    VariableInitializerImpl variableInitializer = new VariableInitializerImpl();
    return variableInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeName createAttributeName()
  {
    AttributeNameImpl attributeName = new AttributeNameImpl();
    return attributeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegralType createIntegralType()
  {
    IntegralTypeImpl integralType = new IntegralTypeImpl();
    return integralType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonArrayType createNonArrayType()
  {
    NonArrayTypeImpl nonArrayType = new NonArrayTypeImpl();
    return nonArrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltInType createBuiltInType()
  {
    BuiltInTypeImpl builtInType = new BuiltInTypeImpl();
    return builtInType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltInClassType createBuiltInClassType()
  {
    BuiltInClassTypeImpl builtInClassType = new BuiltInClassTypeImpl();
    return builtInClassType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedIdentifier createQualifiedIdentifier()
  {
    QualifiedIdentifierImpl qualifiedIdentifier = new QualifiedIdentifierImpl();
    return qualifiedIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceMemberDeclaration createNamespaceMemberDeclaration()
  {
    NamespaceMemberDeclarationImpl namespaceMemberDeclaration = new NamespaceMemberDeclarationImpl();
    return namespaceMemberDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceDeclaration createNamespaceDeclaration()
  {
    NamespaceDeclarationImpl namespaceDeclaration = new NamespaceDeclarationImpl();
    return namespaceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceBody createNamespaceBody()
  {
    NamespaceBodyImpl namespaceBody = new NamespaceBodyImpl();
    return namespaceBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDeclaration createTypeDeclaration()
  {
    TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
    return typeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DelegateDeclaration createDelegateDeclaration()
  {
    DelegateDeclarationImpl delegateDeclaration = new DelegateDeclarationImpl();
    return delegateDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumDeclaration createEnumDeclaration()
  {
    EnumDeclarationImpl enumDeclaration = new EnumDeclarationImpl();
    return enumDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumBody createEnumBody()
  {
    EnumBodyImpl enumBody = new EnumBodyImpl();
    return enumBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumMemberDeclaration createEnumMemberDeclaration()
  {
    EnumMemberDeclarationImpl enumMemberDeclaration = new EnumMemberDeclarationImpl();
    return enumMemberDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDeclaration createInterfaceDeclaration()
  {
    InterfaceDeclarationImpl interfaceDeclaration = new InterfaceDeclarationImpl();
    return interfaceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceBody createInterfaceBody()
  {
    InterfaceBodyImpl interfaceBody = new InterfaceBodyImpl();
    return interfaceBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceMemberDeclaration createInterfaceMemberDeclaration()
  {
    InterfaceMemberDeclarationImpl interfaceMemberDeclaration = new InterfaceMemberDeclarationImpl();
    return interfaceMemberDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceIndexerDeclaration createInterfaceIndexerDeclaration()
  {
    InterfaceIndexerDeclarationImpl interfaceIndexerDeclaration = new InterfaceIndexerDeclarationImpl();
    return interfaceIndexerDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceEventDeclaration createInterfaceEventDeclaration()
  {
    InterfaceEventDeclarationImpl interfaceEventDeclaration = new InterfaceEventDeclarationImpl();
    return interfaceEventDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfacePropertyDeclaration createInterfacePropertyDeclaration()
  {
    InterfacePropertyDeclarationImpl interfacePropertyDeclaration = new InterfacePropertyDeclarationImpl();
    return interfacePropertyDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceAccessors createInterfaceAccessors()
  {
    InterfaceAccessorsImpl interfaceAccessors = new InterfaceAccessorsImpl();
    return interfaceAccessors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceMethodDeclaration createInterfaceMethodDeclaration()
  {
    InterfaceMethodDeclarationImpl interfaceMethodDeclaration = new InterfaceMethodDeclarationImpl();
    return interfaceMethodDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDeclaration createClassDeclaration()
  {
    ClassDeclarationImpl classDeclaration = new ClassDeclarationImpl();
    return classDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassBody createClassBody()
  {
    ClassBodyImpl classBody = new ClassBodyImpl();
    return classBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassMemberDeclaration createClassMemberDeclaration()
  {
    ClassMemberDeclarationImpl classMemberDeclaration = new ClassMemberDeclarationImpl();
    return classMemberDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticConstructorDeclaration createStaticConstructorDeclaration()
  {
    StaticConstructorDeclarationImpl staticConstructorDeclaration = new StaticConstructorDeclarationImpl();
    return staticConstructorDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DestructorDeclaration createDestructorDeclaration()
  {
    DestructorDeclarationImpl destructorDeclaration = new DestructorDeclarationImpl();
    return destructorDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructorDeclaration createConstructorDeclaration()
  {
    ConstructorDeclarationImpl constructorDeclaration = new ConstructorDeclarationImpl();
    return constructorDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructorDeclarator createConstructorDeclarator()
  {
    ConstructorDeclaratorImpl constructorDeclarator = new ConstructorDeclaratorImpl();
    return constructorDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructorInitializer createConstructorInitializer()
  {
    ConstructorInitializerImpl constructorInitializer = new ConstructorInitializerImpl();
    return constructorInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentList createArgumentList()
  {
    ArgumentListImpl argumentList = new ArgumentListImpl();
    return argumentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorDeclaration createOperatorDeclaration()
  {
    OperatorDeclarationImpl operatorDeclaration = new OperatorDeclarationImpl();
    return operatorDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorDeclarator createOperatorDeclarator()
  {
    OperatorDeclaratorImpl operatorDeclarator = new OperatorDeclaratorImpl();
    return operatorDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConversionOperatorDeclarator createConversionOperatorDeclarator()
  {
    ConversionOperatorDeclaratorImpl conversionOperatorDeclarator = new ConversionOperatorDeclaratorImpl();
    return conversionOperatorDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryOperatorDeclarator createBinaryOperatorDeclarator()
  {
    BinaryOperatorDeclaratorImpl binaryOperatorDeclarator = new BinaryOperatorDeclaratorImpl();
    return binaryOperatorDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOperatorDeclarator createUnaryOperatorDeclarator()
  {
    UnaryOperatorDeclaratorImpl unaryOperatorDeclarator = new UnaryOperatorDeclaratorImpl();
    return unaryOperatorDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexerDeclaration createIndexerDeclaration()
  {
    IndexerDeclarationImpl indexerDeclaration = new IndexerDeclarationImpl();
    return indexerDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexerDeclarator createIndexerDeclarator()
  {
    IndexerDeclaratorImpl indexerDeclarator = new IndexerDeclaratorImpl();
    return indexerDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventDeclaration createEventDeclaration()
  {
    EventDeclarationImpl eventDeclaration = new EventDeclarationImpl();
    return eventDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventAccessorDeclarations createEventAccessorDeclarations()
  {
    EventAccessorDeclarationsImpl eventAccessorDeclarations = new EventAccessorDeclarationsImpl();
    return eventAccessorDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RemoveAccessorDeclaration createRemoveAccessorDeclaration()
  {
    RemoveAccessorDeclarationImpl removeAccessorDeclaration = new RemoveAccessorDeclarationImpl();
    return removeAccessorDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddAccessorDeclaration createAddAccessorDeclaration()
  {
    AddAccessorDeclarationImpl addAccessorDeclaration = new AddAccessorDeclarationImpl();
    return addAccessorDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDeclaration createPropertyDeclaration()
  {
    PropertyDeclarationImpl propertyDeclaration = new PropertyDeclarationImpl();
    return propertyDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessorDeclarations createAccessorDeclarations()
  {
    AccessorDeclarationsImpl accessorDeclarations = new AccessorDeclarationsImpl();
    return accessorDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetAccessorDeclaration createSetAccessorDeclaration()
  {
    SetAccessorDeclarationImpl setAccessorDeclaration = new SetAccessorDeclarationImpl();
    return setAccessorDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetAccessorDeclaration createGetAccessorDeclaration()
  {
    GetAccessorDeclarationImpl getAccessorDeclaration = new GetAccessorDeclarationImpl();
    return getAccessorDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDeclaration createMethodDeclaration()
  {
    MethodDeclarationImpl methodDeclaration = new MethodDeclarationImpl();
    return methodDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodHeader createMethodHeader()
  {
    MethodHeaderImpl methodHeader = new MethodHeaderImpl();
    return methodHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalParameterList createFormalParameterList()
  {
    FormalParameterListImpl formalParameterList = new FormalParameterListImpl();
    return formalParameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterArray createParameterArray()
  {
    ParameterArrayImpl parameterArray = new ParameterArrayImpl();
    return parameterArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FixedParameters createFixedParameters()
  {
    FixedParametersImpl fixedParameters = new FixedParametersImpl();
    return fixedParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FixedParameter createFixedParameter()
  {
    FixedParameterImpl fixedParameter = new FixedParameterImpl();
    return fixedParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeOrVoid createTypeOrVoid()
  {
    TypeOrVoidImpl typeOrVoid = new TypeOrVoidImpl();
    return typeOrVoid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDeclaration createFieldDeclaration()
  {
    FieldDeclarationImpl fieldDeclaration = new FieldDeclarationImpl();
    return fieldDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclarator createVariableDeclarator()
  {
    VariableDeclaratorImpl variableDeclarator = new VariableDeclaratorImpl();
    return variableDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDeclaration createConstantDeclaration()
  {
    ConstantDeclarationImpl constantDeclaration = new ConstantDeclarationImpl();
    return constantDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDeclarator createConstantDeclarator()
  {
    ConstantDeclaratorImpl constantDeclarator = new ConstantDeclaratorImpl();
    return constantDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassBase createClassBase()
  {
    ClassBaseImpl classBase = new ClassBaseImpl();
    return classBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedIdentifierList createQualifiedIdentifierList()
  {
    QualifiedIdentifierListImpl qualifiedIdentifierList = new QualifiedIdentifierListImpl();
    return qualifiedIdentifierList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarationStatment createDeclarationStatment()
  {
    DeclarationStatmentImpl declarationStatment = new DeclarationStatmentImpl();
    return declarationStatment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalconstantDeclaration createLocalconstantDeclaration()
  {
    LocalconstantDeclarationImpl localconstantDeclaration = new LocalconstantDeclarationImpl();
    return localconstantDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabeledStatement createLabeledStatement()
  {
    LabeledStatementImpl labeledStatement = new LabeledStatementImpl();
    return labeledStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbeddedStatement createEmbeddedStatement()
  {
    EmbeddedStatementImpl embeddedStatement = new EmbeddedStatementImpl();
    return embeddedStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsingStatement createUsingStatement()
  {
    UsingStatementImpl usingStatement = new UsingStatementImpl();
    return usingStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceAquisition createResourceAquisition()
  {
    ResourceAquisitionImpl resourceAquisition = new ResourceAquisitionImpl();
    return resourceAquisition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVariableDeclaration createLocalVariableDeclaration()
  {
    LocalVariableDeclarationImpl localVariableDeclaration = new LocalVariableDeclarationImpl();
    return localVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LockStatement createLockStatement()
  {
    LockStatementImpl lockStatement = new LockStatementImpl();
    return lockStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TryStatement createTryStatement()
  {
    TryStatementImpl tryStatement = new TryStatementImpl();
    return tryStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FinallyClause createFinallyClause()
  {
    FinallyClauseImpl finallyClause = new FinallyClauseImpl();
    return finallyClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatchClauses createCatchClauses()
  {
    CatchClausesImpl catchClauses = new CatchClausesImpl();
    return catchClauses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralCatchclause createGeneralCatchclause()
  {
    GeneralCatchclauseImpl generalCatchclause = new GeneralCatchclauseImpl();
    return generalCatchclause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecificCatchClause createSpecificCatchClause()
  {
    SpecificCatchClauseImpl specificCatchClause = new SpecificCatchClauseImpl();
    return specificCatchClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JumpStatement createJumpStatement()
  {
    JumpStatementImpl jumpStatement = new JumpStatementImpl();
    return jumpStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThrowStatement createThrowStatement()
  {
    ThrowStatementImpl throwStatement = new ThrowStatementImpl();
    return throwStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement createReturnStatement()
  {
    ReturnStatementImpl returnStatement = new ReturnStatementImpl();
    return returnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GotoStatement createGotoStatement()
  {
    GotoStatementImpl gotoStatement = new GotoStatementImpl();
    return gotoStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContinueStatement createContinueStatement()
  {
    ContinueStatementImpl continueStatement = new ContinueStatementImpl();
    return continueStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreakStatement createBreakStatement()
  {
    BreakStatementImpl breakStatement = new BreakStatementImpl();
    return breakStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IterationStatement createIterationStatement()
  {
    IterationStatementImpl iterationStatement = new IterationStatementImpl();
    return iterationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForeachStatement createForeachStatement()
  {
    ForeachStatementImpl foreachStatement = new ForeachStatementImpl();
    return foreachStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStatement createForStatement()
  {
    ForStatementImpl forStatement = new ForStatementImpl();
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForInitializer createForInitializer()
  {
    ForInitializerImpl forInitializer = new ForInitializerImpl();
    return forInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementExpressionList createStatementExpressionList()
  {
    StatementExpressionListImpl statementExpressionList = new StatementExpressionListImpl();
    return statementExpressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementExpression createStatementExpression()
  {
    StatementExpressionImpl statementExpression = new StatementExpressionImpl();
    return statementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoStatement createDoStatement()
  {
    DoStatementImpl doStatement = new DoStatementImpl();
    return doStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileStatement createWhileStatement()
  {
    WhileStatementImpl whileStatement = new WhileStatementImpl();
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionStatement createSelectionStatement()
  {
    SelectionStatementImpl selectionStatement = new SelectionStatementImpl();
    return selectionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchStatement createSwitchStatement()
  {
    SwitchStatementImpl switchStatement = new SwitchStatementImpl();
    return switchStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchSection createSwitchSection()
  {
    SwitchSectionImpl switchSection = new SwitchSectionImpl();
    return switchSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchLabel createSwitchLabel()
  {
    SwitchLabelImpl switchLabel = new SwitchLabelImpl();
    return switchLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElsePart createElsePart()
  {
    ElsePartImpl elsePart = new ElsePartImpl();
    return elsePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaybeEmptyBlock createMaybeEmptyBlock()
  {
    MaybeEmptyBlockImpl maybeEmptyBlock = new MaybeEmptyBlockImpl();
    return maybeEmptyBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SByte createSByte()
  {
    SByteImpl sByte = new SByteImpl();
    return sByte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.myModel.cSharp.Byte createByte()
  {
    ByteImpl byte_ = new ByteImpl();
    return byte_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.myModel.cSharp.Short createShort()
  {
    ShortImpl short_ = new ShortImpl();
    return short_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UShort createUShort()
  {
    UShortImpl uShort = new UShortImpl();
    return uShort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Int createInt()
  {
    IntImpl int_ = new IntImpl();
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UInt createUInt()
  {
    UIntImpl uInt = new UIntImpl();
    return uInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.myModel.cSharp.Long createLong()
  {
    LongImpl long_ = new LongImpl();
    return long_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ULong createULong()
  {
    ULongImpl uLong = new ULongImpl();
    return uLong;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Char createChar()
  {
    CharImpl char_ = new CharImpl();
    return char_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bool createBool()
  {
    BoolImpl bool = new BoolImpl();
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decimal createDecimal()
  {
    DecimalImpl decimal = new DecimalImpl();
    return decimal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.myModel.cSharp.Float createFloat()
  {
    FloatImpl float_ = new FloatImpl();
    return float_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.myModel.cSharp.Double createDouble()
  {
    DoubleImpl double_ = new DoubleImpl();
    return double_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.myModel.cSharp.Object createObject()
  {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.myModel.cSharp.String createString()
  {
    StringImpl string = new StringImpl();
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.myModel.cSharp.Void createVoid()
  {
    VoidImpl void_ = new VoidImpl();
    return void_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSharpPackage getCSharpPackage()
  {
    return (CSharpPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CSharpPackage getPackage()
  {
    return CSharpPackage.eINSTANCE;
  }

} //CSharpFactoryImpl
