/**
 */
package org.xtext.example.myModel.cSharp.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
import org.xtext.example.myModel.cSharp.BreakStatement;
import org.xtext.example.myModel.cSharp.BuiltInType;
import org.xtext.example.myModel.cSharp.CSharpPackage;
import org.xtext.example.myModel.cSharp.CatchClauses;
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
import org.xtext.example.myModel.cSharp.DeclarationStatment;
import org.xtext.example.myModel.cSharp.DelegateDeclaration;
import org.xtext.example.myModel.cSharp.DestructorDeclaration;
import org.xtext.example.myModel.cSharp.DoStatement;
import org.xtext.example.myModel.cSharp.ElsePart;
import org.xtext.example.myModel.cSharp.EmbeddedStatement;
import org.xtext.example.myModel.cSharp.EnumBody;
import org.xtext.example.myModel.cSharp.EnumDeclaration;
import org.xtext.example.myModel.cSharp.EnumMemberDeclaration;
import org.xtext.example.myModel.cSharp.EnumType;
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
import org.xtext.example.myModel.cSharp.Model;
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
import org.xtext.example.myModel.cSharp.SelectionStatement;
import org.xtext.example.myModel.cSharp.SetAccessorDeclaration;
import org.xtext.example.myModel.cSharp.SpecificCatchClause;
import org.xtext.example.myModel.cSharp.Statement;
import org.xtext.example.myModel.cSharp.StatementExpression;
import org.xtext.example.myModel.cSharp.StatementExpressionList;
import org.xtext.example.myModel.cSharp.StaticConstructorDeclaration;
import org.xtext.example.myModel.cSharp.StructBody;
import org.xtext.example.myModel.cSharp.StructDeclaration;
import org.xtext.example.myModel.cSharp.StructMemberDeclaration;
import org.xtext.example.myModel.cSharp.StructMemberDeclarations;
import org.xtext.example.myModel.cSharp.StructMemberDeclarations2;
import org.xtext.example.myModel.cSharp.SwitchLabel;
import org.xtext.example.myModel.cSharp.SwitchSection;
import org.xtext.example.myModel.cSharp.SwitchStatement;
import org.xtext.example.myModel.cSharp.ThrowStatement;
import org.xtext.example.myModel.cSharp.TryStatement;
import org.xtext.example.myModel.cSharp.Type;
import org.xtext.example.myModel.cSharp.TypeDeclaration;
import org.xtext.example.myModel.cSharp.TypeOrVoid;
import org.xtext.example.myModel.cSharp.UnaryExpression;
import org.xtext.example.myModel.cSharp.UnaryOperatorDeclarator;
import org.xtext.example.myModel.cSharp.UsingDirective;
import org.xtext.example.myModel.cSharp.UsingStatement;
import org.xtext.example.myModel.cSharp.VariableDeclarator;
import org.xtext.example.myModel.cSharp.VariableInitializer;
import org.xtext.example.myModel.cSharp.WhileStatement;

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
 * @see org.xtext.example.myModel.cSharp.CSharpPackage
 * @generated
 */
public class CSharpSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CSharpPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSharpSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CSharpPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CSharpPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.IDENTIFIER:
      {
        Identifier identifier = (Identifier)theEObject;
        T result = caseIdentifier(identifier);
        if (result == null) result = caseConstructorDeclarator(identifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.COMPILATION_UNIT:
      {
        CompilationUnit compilationUnit = (CompilationUnit)theEObject;
        T result = caseCompilationUnit(compilationUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.NAMESPACE_MEMBER_DECLARATION:
      {
        NamespaceMemberDeclaration namespaceMemberDeclaration = (NamespaceMemberDeclaration)theEObject;
        T result = caseNamespaceMemberDeclaration(namespaceMemberDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.NAMESPACE_DECLARATION:
      {
        NamespaceDeclaration namespaceDeclaration = (NamespaceDeclaration)theEObject;
        T result = caseNamespaceDeclaration(namespaceDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.NAMESPACE_BODY:
      {
        NamespaceBody namespaceBody = (NamespaceBody)theEObject;
        T result = caseNamespaceBody(namespaceBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.TYPE_DECLARATION:
      {
        TypeDeclaration typeDeclaration = (TypeDeclaration)theEObject;
        T result = caseTypeDeclaration(typeDeclaration);
        if (result == null) result = caseStructMemberDeclaration(typeDeclaration);
        if (result == null) result = caseStructMemberDeclarations(typeDeclaration);
        if (result == null) result = caseStructMemberDeclarations2(typeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.DELEGATE_DECLARATION:
      {
        DelegateDeclaration delegateDeclaration = (DelegateDeclaration)theEObject;
        T result = caseDelegateDeclaration(delegateDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ENUM_DECLARATION:
      {
        EnumDeclaration enumDeclaration = (EnumDeclaration)theEObject;
        T result = caseEnumDeclaration(enumDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.INTERFACE_DECLARATION:
      {
        InterfaceDeclaration interfaceDeclaration = (InterfaceDeclaration)theEObject;
        T result = caseInterfaceDeclaration(interfaceDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.INTERFACE_BODY:
      {
        InterfaceBody interfaceBody = (InterfaceBody)theEObject;
        T result = caseInterfaceBody(interfaceBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.INTERFACE_MEMBER_DECLARATION:
      {
        InterfaceMemberDeclaration interfaceMemberDeclaration = (InterfaceMemberDeclaration)theEObject;
        T result = caseInterfaceMemberDeclaration(interfaceMemberDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.INTERFACE_INDEXER_DECLARATION:
      {
        InterfaceIndexerDeclaration interfaceIndexerDeclaration = (InterfaceIndexerDeclaration)theEObject;
        T result = caseInterfaceIndexerDeclaration(interfaceIndexerDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.INTERFACE_EVENT_DECLARATION:
      {
        InterfaceEventDeclaration interfaceEventDeclaration = (InterfaceEventDeclaration)theEObject;
        T result = caseInterfaceEventDeclaration(interfaceEventDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.INTERFACE_PROPERTY_DECLARATION:
      {
        InterfacePropertyDeclaration interfacePropertyDeclaration = (InterfacePropertyDeclaration)theEObject;
        T result = caseInterfacePropertyDeclaration(interfacePropertyDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.INTERFACE_ACCESSORS:
      {
        InterfaceAccessors interfaceAccessors = (InterfaceAccessors)theEObject;
        T result = caseInterfaceAccessors(interfaceAccessors);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.INTERFACE_METHOD_DECLARATION:
      {
        InterfaceMethodDeclaration interfaceMethodDeclaration = (InterfaceMethodDeclaration)theEObject;
        T result = caseInterfaceMethodDeclaration(interfaceMethodDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.STRUCT_DECLARATION:
      {
        StructDeclaration structDeclaration = (StructDeclaration)theEObject;
        T result = caseStructDeclaration(structDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.STRUCT_BODY:
      {
        StructBody structBody = (StructBody)theEObject;
        T result = caseStructBody(structBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.STRUCT_MEMBER_DECLARATIONS:
      {
        StructMemberDeclarations structMemberDeclarations = (StructMemberDeclarations)theEObject;
        T result = caseStructMemberDeclarations(structMemberDeclarations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.STRUCT_MEMBER_DECLARATIONS2:
      {
        StructMemberDeclarations2 structMemberDeclarations2 = (StructMemberDeclarations2)theEObject;
        T result = caseStructMemberDeclarations2(structMemberDeclarations2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.STRUCT_MEMBER_DECLARATION:
      {
        StructMemberDeclaration structMemberDeclaration = (StructMemberDeclaration)theEObject;
        T result = caseStructMemberDeclaration(structMemberDeclaration);
        if (result == null) result = caseStructMemberDeclarations(structMemberDeclaration);
        if (result == null) result = caseStructMemberDeclarations2(structMemberDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.CLASS_DECLARATION:
      {
        ClassDeclaration classDeclaration = (ClassDeclaration)theEObject;
        T result = caseClassDeclaration(classDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.CLASS_BODY:
      {
        ClassBody classBody = (ClassBody)theEObject;
        T result = caseClassBody(classBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.CLASS_MEMBER_DECLARATION:
      {
        ClassMemberDeclaration classMemberDeclaration = (ClassMemberDeclaration)theEObject;
        T result = caseClassMemberDeclaration(classMemberDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.STATIC_CONSTRUCTOR_DECLARATION:
      {
        StaticConstructorDeclaration staticConstructorDeclaration = (StaticConstructorDeclaration)theEObject;
        T result = caseStaticConstructorDeclaration(staticConstructorDeclaration);
        if (result == null) result = caseStructMemberDeclaration(staticConstructorDeclaration);
        if (result == null) result = caseStructMemberDeclarations(staticConstructorDeclaration);
        if (result == null) result = caseStructMemberDeclarations2(staticConstructorDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.DESTRUCTOR_DECLARATION:
      {
        DestructorDeclaration destructorDeclaration = (DestructorDeclaration)theEObject;
        T result = caseDestructorDeclaration(destructorDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.CONSTRUCTOR_DECLARATION:
      {
        ConstructorDeclaration constructorDeclaration = (ConstructorDeclaration)theEObject;
        T result = caseConstructorDeclaration(constructorDeclaration);
        if (result == null) result = caseStructMemberDeclaration(constructorDeclaration);
        if (result == null) result = caseStructMemberDeclarations(constructorDeclaration);
        if (result == null) result = caseStructMemberDeclarations2(constructorDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.CONSTRUCTOR_DECLARATOR:
      {
        ConstructorDeclarator constructorDeclarator = (ConstructorDeclarator)theEObject;
        T result = caseConstructorDeclarator(constructorDeclarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.CONSTRUCTOR_INITIALIZER:
      {
        ConstructorInitializer constructorInitializer = (ConstructorInitializer)theEObject;
        T result = caseConstructorInitializer(constructorInitializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ARGUMENT_LIST:
      {
        ArgumentList argumentList = (ArgumentList)theEObject;
        T result = caseArgumentList(argumentList);
        if (result == null) result = caseConstructorInitializer(argumentList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ARGUMENT:
      {
        Argument argument = (Argument)theEObject;
        T result = caseArgument(argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.OPERATOR_DECLARATION:
      {
        OperatorDeclaration operatorDeclaration = (OperatorDeclaration)theEObject;
        T result = caseOperatorDeclaration(operatorDeclaration);
        if (result == null) result = caseStructMemberDeclaration(operatorDeclaration);
        if (result == null) result = caseStructMemberDeclarations(operatorDeclaration);
        if (result == null) result = caseStructMemberDeclarations2(operatorDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.OPERATOR_DECLARATOR:
      {
        OperatorDeclarator operatorDeclarator = (OperatorDeclarator)theEObject;
        T result = caseOperatorDeclarator(operatorDeclarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.CONVERSION_OPERATOR_DECLARATOR:
      {
        ConversionOperatorDeclarator conversionOperatorDeclarator = (ConversionOperatorDeclarator)theEObject;
        T result = caseConversionOperatorDeclarator(conversionOperatorDeclarator);
        if (result == null) result = caseOperatorDeclarator(conversionOperatorDeclarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.BINARY_OPERATOR_DECLARATOR:
      {
        BinaryOperatorDeclarator binaryOperatorDeclarator = (BinaryOperatorDeclarator)theEObject;
        T result = caseBinaryOperatorDeclarator(binaryOperatorDeclarator);
        if (result == null) result = caseOperatorDeclarator(binaryOperatorDeclarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.UNARY_OPERATOR_DECLARATOR:
      {
        UnaryOperatorDeclarator unaryOperatorDeclarator = (UnaryOperatorDeclarator)theEObject;
        T result = caseUnaryOperatorDeclarator(unaryOperatorDeclarator);
        if (result == null) result = caseOperatorDeclarator(unaryOperatorDeclarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.INDEXER_DECLARATION:
      {
        IndexerDeclaration indexerDeclaration = (IndexerDeclaration)theEObject;
        T result = caseIndexerDeclaration(indexerDeclaration);
        if (result == null) result = caseStructMemberDeclaration(indexerDeclaration);
        if (result == null) result = caseStructMemberDeclarations(indexerDeclaration);
        if (result == null) result = caseStructMemberDeclarations2(indexerDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.INDEXER_DECLARATOR:
      {
        IndexerDeclarator indexerDeclarator = (IndexerDeclarator)theEObject;
        T result = caseIndexerDeclarator(indexerDeclarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.EVENT_DECLARATION:
      {
        EventDeclaration eventDeclaration = (EventDeclaration)theEObject;
        T result = caseEventDeclaration(eventDeclaration);
        if (result == null) result = caseStructMemberDeclaration(eventDeclaration);
        if (result == null) result = caseStructMemberDeclarations(eventDeclaration);
        if (result == null) result = caseStructMemberDeclarations2(eventDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.EVENT_ACCESSOR_DECLARATIONS:
      {
        EventAccessorDeclarations eventAccessorDeclarations = (EventAccessorDeclarations)theEObject;
        T result = caseEventAccessorDeclarations(eventAccessorDeclarations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.REMOVE_ACCESSOR_DECLARATION:
      {
        RemoveAccessorDeclaration removeAccessorDeclaration = (RemoveAccessorDeclaration)theEObject;
        T result = caseRemoveAccessorDeclaration(removeAccessorDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ADD_ACCESSOR_DECLARATION:
      {
        AddAccessorDeclaration addAccessorDeclaration = (AddAccessorDeclaration)theEObject;
        T result = caseAddAccessorDeclaration(addAccessorDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.PROPERTY_DECLARATION:
      {
        PropertyDeclaration propertyDeclaration = (PropertyDeclaration)theEObject;
        T result = casePropertyDeclaration(propertyDeclaration);
        if (result == null) result = caseStructMemberDeclaration(propertyDeclaration);
        if (result == null) result = caseStructMemberDeclarations(propertyDeclaration);
        if (result == null) result = caseStructMemberDeclarations2(propertyDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ACCESSOR_DECLARATIONS:
      {
        AccessorDeclarations accessorDeclarations = (AccessorDeclarations)theEObject;
        T result = caseAccessorDeclarations(accessorDeclarations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.SET_ACCESSOR_DECLARATION:
      {
        SetAccessorDeclaration setAccessorDeclaration = (SetAccessorDeclaration)theEObject;
        T result = caseSetAccessorDeclaration(setAccessorDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.GET_ACCESSOR_DECLARATION:
      {
        GetAccessorDeclaration getAccessorDeclaration = (GetAccessorDeclaration)theEObject;
        T result = caseGetAccessorDeclaration(getAccessorDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.METHOD_DECLARATION:
      {
        MethodDeclaration methodDeclaration = (MethodDeclaration)theEObject;
        T result = caseMethodDeclaration(methodDeclaration);
        if (result == null) result = caseStructMemberDeclaration(methodDeclaration);
        if (result == null) result = caseClassMemberDeclaration(methodDeclaration);
        if (result == null) result = caseStructMemberDeclarations(methodDeclaration);
        if (result == null) result = caseStructMemberDeclarations2(methodDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.METHOD_HEADER:
      {
        MethodHeader methodHeader = (MethodHeader)theEObject;
        T result = caseMethodHeader(methodHeader);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.FORMAL_PARAMETER_LIST:
      {
        FormalParameterList formalParameterList = (FormalParameterList)theEObject;
        T result = caseFormalParameterList(formalParameterList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.PARAMETER_ARRAY:
      {
        ParameterArray parameterArray = (ParameterArray)theEObject;
        T result = caseParameterArray(parameterArray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.FIXED_PARAMETERS:
      {
        FixedParameters fixedParameters = (FixedParameters)theEObject;
        T result = caseFixedParameters(fixedParameters);
        if (result == null) result = caseFormalParameterList(fixedParameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.FIXED_PARAMETER:
      {
        FixedParameter fixedParameter = (FixedParameter)theEObject;
        T result = caseFixedParameter(fixedParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.TYPE_OR_VOID:
      {
        TypeOrVoid typeOrVoid = (TypeOrVoid)theEObject;
        T result = caseTypeOrVoid(typeOrVoid);
        if (result == null) result = caseDelegateDeclaration(typeOrVoid);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.FIELD_DECLARATION:
      {
        FieldDeclaration fieldDeclaration = (FieldDeclaration)theEObject;
        T result = caseFieldDeclaration(fieldDeclaration);
        if (result == null) result = caseStructMemberDeclaration(fieldDeclaration);
        if (result == null) result = caseStructMemberDeclarations(fieldDeclaration);
        if (result == null) result = caseStructMemberDeclarations2(fieldDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.VARIABLE_DECLARATOR:
      {
        VariableDeclarator variableDeclarator = (VariableDeclarator)theEObject;
        T result = caseVariableDeclarator(variableDeclarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.VARIABLE_INITIALIZER:
      {
        VariableInitializer variableInitializer = (VariableInitializer)theEObject;
        T result = caseVariableInitializer(variableInitializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ARRAY_INITIALIZER:
      {
        ArrayInitializer arrayInitializer = (ArrayInitializer)theEObject;
        T result = caseArrayInitializer(arrayInitializer);
        if (result == null) result = caseVariableInitializer(arrayInitializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.CONSTANT_DECLARATION:
      {
        ConstantDeclaration constantDeclaration = (ConstantDeclaration)theEObject;
        T result = caseConstantDeclaration(constantDeclaration);
        if (result == null) result = caseStructMemberDeclaration(constantDeclaration);
        if (result == null) result = caseStructMemberDeclarations(constantDeclaration);
        if (result == null) result = caseStructMemberDeclarations2(constantDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.CONSTANT_DECLARATOR:
      {
        ConstantDeclarator constantDeclarator = (ConstantDeclarator)theEObject;
        T result = caseConstantDeclarator(constantDeclarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.CLASS_BASE:
      {
        ClassBase classBase = (ClassBase)theEObject;
        T result = caseClassBase(classBase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.QUALIFIED_IDENTIFIER_LIST:
      {
        QualifiedIdentifierList qualifiedIdentifierList = (QualifiedIdentifierList)theEObject;
        T result = caseQualifiedIdentifierList(qualifiedIdentifierList);
        if (result == null) result = caseClassBase(qualifiedIdentifierList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.GLOBAL_ATTRIBUTES:
      {
        GlobalAttributes globalAttributes = (GlobalAttributes)theEObject;
        T result = caseGlobalAttributes(globalAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.GLOBAL_ATTRIBUTE_SECTION:
      {
        GlobalAttributeSection globalAttributeSection = (GlobalAttributeSection)theEObject;
        T result = caseGlobalAttributeSection(globalAttributeSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ATTRIBUTES:
      {
        Attributes attributes = (Attributes)theEObject;
        T result = caseAttributes(attributes);
        if (result == null) result = caseMethodHeader(attributes);
        if (result == null) result = caseEnumType(attributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ATTRIBUTE_SECTION:
      {
        AttributeSection attributeSection = (AttributeSection)theEObject;
        T result = caseAttributeSection(attributeSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ATTRIBUTE_LIST:
      {
        AttributeList attributeList = (AttributeList)theEObject;
        T result = caseAttributeList(attributeList);
        if (result == null) result = caseGlobalAttributeSection(attributeList);
        if (result == null) result = caseAttributeSection(attributeList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ATTRIBUTE_ARGUMENTS:
      {
        AttributeArguments attributeArguments = (AttributeArguments)theEObject;
        T result = caseAttributeArguments(attributeArguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.EXPRESSION_LIST:
      {
        ExpressionList expressionList = (ExpressionList)theEObject;
        T result = caseExpressionList(expressionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseArgument(expression);
        if (result == null) result = caseVariableInitializer(expression);
        if (result == null) result = caseResourceAquisition(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.EXPRESSION2:
      {
        Expression2 expression2 = (Expression2)theEObject;
        T result = caseExpression2(expression2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.UNARY_EXPRESSION:
      {
        UnaryExpression unaryExpression = (UnaryExpression)theEObject;
        T result = caseUnaryExpression(unaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ATTRIBUTE_NAME:
      {
        AttributeName attributeName = (AttributeName)theEObject;
        T result = caseAttributeName(attributeName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.USING_DIRECTIVE:
      {
        UsingDirective usingDirective = (UsingDirective)theEObject;
        T result = caseUsingDirective(usingDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseEventDeclaration(type);
        if (result == null) result = casePropertyDeclaration(type);
        if (result == null) result = caseFieldDeclaration(type);
        if (result == null) result = caseConstantDeclaration(type);
        if (result == null) result = caseStructMemberDeclaration(type);
        if (result == null) result = caseStructMemberDeclarations(type);
        if (result == null) result = caseStructMemberDeclarations2(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.INTEGRAL_TYPE:
      {
        IntegralType integralType = (IntegralType)theEObject;
        T result = caseIntegralType(integralType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ARRAY_TYPE:
      {
        ArrayType arrayType = (ArrayType)theEObject;
        T result = caseArrayType(arrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ENUM_TYPE:
      {
        EnumType enumType = (EnumType)theEObject;
        T result = caseEnumType(enumType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.NON_ARRAY_TYPE:
      {
        NonArrayType nonArrayType = (NonArrayType)theEObject;
        T result = caseNonArrayType(nonArrayType);
        if (result == null) result = caseArrayType(nonArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.QUALIFIED_IDENTIFIER:
      {
        QualifiedIdentifier qualifiedIdentifier = (QualifiedIdentifier)theEObject;
        T result = caseQualifiedIdentifier(qualifiedIdentifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.BUILT_IN_TYPE:
      {
        BuiltInType builtInType = (BuiltInType)theEObject;
        T result = caseBuiltInType(builtInType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ENUM_BODY:
      {
        EnumBody enumBody = (EnumBody)theEObject;
        T result = caseEnumBody(enumBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ENUM_MEMBER_DECLARATION:
      {
        EnumMemberDeclaration enumMemberDeclaration = (EnumMemberDeclaration)theEObject;
        T result = caseEnumMemberDeclaration(enumMemberDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.DECLARATION_STATMENT:
      {
        DeclarationStatment declarationStatment = (DeclarationStatment)theEObject;
        T result = caseDeclarationStatment(declarationStatment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.LOCALCONSTANT_DECLARATION:
      {
        LocalconstantDeclaration localconstantDeclaration = (LocalconstantDeclaration)theEObject;
        T result = caseLocalconstantDeclaration(localconstantDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.LABELED_STATEMENT:
      {
        LabeledStatement labeledStatement = (LabeledStatement)theEObject;
        T result = caseLabeledStatement(labeledStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.EMBEDDED_STATEMENT:
      {
        EmbeddedStatement embeddedStatement = (EmbeddedStatement)theEObject;
        T result = caseEmbeddedStatement(embeddedStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.USING_STATEMENT:
      {
        UsingStatement usingStatement = (UsingStatement)theEObject;
        T result = caseUsingStatement(usingStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.RESOURCE_AQUISITION:
      {
        ResourceAquisition resourceAquisition = (ResourceAquisition)theEObject;
        T result = caseResourceAquisition(resourceAquisition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.LOCAL_VARIABLE_DECLARATION:
      {
        LocalVariableDeclaration localVariableDeclaration = (LocalVariableDeclaration)theEObject;
        T result = caseLocalVariableDeclaration(localVariableDeclaration);
        if (result == null) result = caseResourceAquisition(localVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.LOCK_STATEMENT:
      {
        LockStatement lockStatement = (LockStatement)theEObject;
        T result = caseLockStatement(lockStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.TRY_STATEMENT:
      {
        TryStatement tryStatement = (TryStatement)theEObject;
        T result = caseTryStatement(tryStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.FINALLY_CLAUSE:
      {
        FinallyClause finallyClause = (FinallyClause)theEObject;
        T result = caseFinallyClause(finallyClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.CATCH_CLAUSES:
      {
        CatchClauses catchClauses = (CatchClauses)theEObject;
        T result = caseCatchClauses(catchClauses);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.GENERAL_CATCHCLAUSE:
      {
        GeneralCatchclause generalCatchclause = (GeneralCatchclause)theEObject;
        T result = caseGeneralCatchclause(generalCatchclause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.SPECIFIC_CATCH_CLAUSE:
      {
        SpecificCatchClause specificCatchClause = (SpecificCatchClause)theEObject;
        T result = caseSpecificCatchClause(specificCatchClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.JUMP_STATEMENT:
      {
        JumpStatement jumpStatement = (JumpStatement)theEObject;
        T result = caseJumpStatement(jumpStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.THROW_STATEMENT:
      {
        ThrowStatement throwStatement = (ThrowStatement)theEObject;
        T result = caseThrowStatement(throwStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.RETURN_STATEMENT:
      {
        ReturnStatement returnStatement = (ReturnStatement)theEObject;
        T result = caseReturnStatement(returnStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.GOTO_STATEMENT:
      {
        GotoStatement gotoStatement = (GotoStatement)theEObject;
        T result = caseGotoStatement(gotoStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.CONTINUE_STATEMENT:
      {
        ContinueStatement continueStatement = (ContinueStatement)theEObject;
        T result = caseContinueStatement(continueStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.BREAK_STATEMENT:
      {
        BreakStatement breakStatement = (BreakStatement)theEObject;
        T result = caseBreakStatement(breakStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ITERATION_STATEMENT:
      {
        IterationStatement iterationStatement = (IterationStatement)theEObject;
        T result = caseIterationStatement(iterationStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.FOREACH_STATEMENT:
      {
        ForeachStatement foreachStatement = (ForeachStatement)theEObject;
        T result = caseForeachStatement(foreachStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.FOR_STATEMENT:
      {
        ForStatement forStatement = (ForStatement)theEObject;
        T result = caseForStatement(forStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.FOR_INITIALIZER:
      {
        ForInitializer forInitializer = (ForInitializer)theEObject;
        T result = caseForInitializer(forInitializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.STATEMENT_EXPRESSION_LIST:
      {
        StatementExpressionList statementExpressionList = (StatementExpressionList)theEObject;
        T result = caseStatementExpressionList(statementExpressionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.STATEMENT_EXPRESSION:
      {
        StatementExpression statementExpression = (StatementExpression)theEObject;
        T result = caseStatementExpression(statementExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.PRIMARY_EXPRESSION:
      {
        PrimaryExpression primaryExpression = (PrimaryExpression)theEObject;
        T result = casePrimaryExpression(primaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.PRIMARY_EXPRESSION2:
      {
        PrimaryExpression2 primaryExpression2 = (PrimaryExpression2)theEObject;
        T result = casePrimaryExpression2(primaryExpression2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.DO_STATEMENT:
      {
        DoStatement doStatement = (DoStatement)theEObject;
        T result = caseDoStatement(doStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.WHILE_STATEMENT:
      {
        WhileStatement whileStatement = (WhileStatement)theEObject;
        T result = caseWhileStatement(whileStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.SELECTION_STATEMENT:
      {
        SelectionStatement selectionStatement = (SelectionStatement)theEObject;
        T result = caseSelectionStatement(selectionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.SWITCH_STATEMENT:
      {
        SwitchStatement switchStatement = (SwitchStatement)theEObject;
        T result = caseSwitchStatement(switchStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.SWITCH_SECTION:
      {
        SwitchSection switchSection = (SwitchSection)theEObject;
        T result = caseSwitchSection(switchSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.SWITCH_LABEL:
      {
        SwitchLabel switchLabel = (SwitchLabel)theEObject;
        T result = caseSwitchLabel(switchLabel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.IF_STATEMENT:
      {
        IfStatement ifStatement = (IfStatement)theEObject;
        T result = caseIfStatement(ifStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.ELSE_PART:
      {
        ElsePart elsePart = (ElsePart)theEObject;
        T result = caseElsePart(elsePart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseRemoveAccessorDeclaration(block);
        if (result == null) result = caseAddAccessorDeclaration(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.MAYBE_EMPTY_BLOCK:
      {
        MaybeEmptyBlock maybeEmptyBlock = (MaybeEmptyBlock)theEObject;
        T result = caseMaybeEmptyBlock(maybeEmptyBlock);
        if (result == null) result = caseSetAccessorDeclaration(maybeEmptyBlock);
        if (result == null) result = caseGetAccessorDeclaration(maybeEmptyBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSharpPackage.VOID:
      {
        org.xtext.example.myModel.cSharp.Void void_ = (org.xtext.example.myModel.cSharp.Void)theEObject;
        T result = caseVoid(void_);
        if (result == null) result = caseTypeOrVoid(void_);
        if (result == null) result = caseDelegateDeclaration(void_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentifier(Identifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompilationUnit(CompilationUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace Member Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace Member Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespaceMemberDeclaration(NamespaceMemberDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespaceDeclaration(NamespaceDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespaceBody(NamespaceBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDeclaration(TypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delegate Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delegate Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDelegateDeclaration(DelegateDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumDeclaration(EnumDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceDeclaration(InterfaceDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceBody(InterfaceBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Member Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Member Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceMemberDeclaration(InterfaceMemberDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Indexer Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Indexer Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceIndexerDeclaration(InterfaceIndexerDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Event Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Event Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceEventDeclaration(InterfaceEventDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Property Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfacePropertyDeclaration(InterfacePropertyDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Accessors</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Accessors</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceAccessors(InterfaceAccessors object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Method Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Method Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceMethodDeclaration(InterfaceMethodDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructDeclaration(StructDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructBody(StructBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Member Declarations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Member Declarations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructMemberDeclarations(StructMemberDeclarations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Member Declarations2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Member Declarations2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructMemberDeclarations2(StructMemberDeclarations2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Member Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Member Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructMemberDeclaration(StructMemberDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassDeclaration(ClassDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassBody(ClassBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Member Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Member Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassMemberDeclaration(ClassMemberDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static Constructor Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static Constructor Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStaticConstructorDeclaration(StaticConstructorDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Destructor Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Destructor Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDestructorDeclaration(DestructorDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructorDeclaration(ConstructorDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor Declarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor Declarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructorDeclarator(ConstructorDeclarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor Initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor Initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructorInitializer(ConstructorInitializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgumentList(ArgumentList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgument(Argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorDeclaration(OperatorDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Declarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Declarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorDeclarator(OperatorDeclarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conversion Operator Declarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conversion Operator Declarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConversionOperatorDeclarator(ConversionOperatorDeclarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Operator Declarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Operator Declarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryOperatorDeclarator(BinaryOperatorDeclarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Operator Declarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Operator Declarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryOperatorDeclarator(UnaryOperatorDeclarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indexer Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indexer Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexerDeclaration(IndexerDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indexer Declarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indexer Declarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexerDeclarator(IndexerDeclarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventDeclaration(EventDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Accessor Declarations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Accessor Declarations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventAccessorDeclarations(EventAccessorDeclarations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Remove Accessor Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remove Accessor Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRemoveAccessorDeclaration(RemoveAccessorDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Accessor Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Accessor Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddAccessorDeclaration(AddAccessorDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyDeclaration(PropertyDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Accessor Declarations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accessor Declarations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessorDeclarations(AccessorDeclarations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Accessor Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Accessor Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetAccessorDeclaration(SetAccessorDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Accessor Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Accessor Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetAccessorDeclaration(GetAccessorDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodDeclaration(MethodDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodHeader(MethodHeader object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Parameter List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Parameter List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalParameterList(FormalParameterList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterArray(ParameterArray object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fixed Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fixed Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFixedParameters(FixedParameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fixed Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fixed Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFixedParameter(FixedParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Or Void</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Or Void</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeOrVoid(TypeOrVoid object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldDeclaration(FieldDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclarator(VariableDeclarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableInitializer(VariableInitializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayInitializer(ArrayInitializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantDeclaration(ConstantDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Declarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Declarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantDeclarator(ConstantDeclarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Base</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Base</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassBase(ClassBase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualified Identifier List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualified Identifier List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifiedIdentifierList(QualifiedIdentifierList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalAttributes(GlobalAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Attribute Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Attribute Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalAttributeSection(GlobalAttributeSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributes(Attributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeSection(AttributeSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeList(AttributeList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Arguments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Arguments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeArguments(AttributeArguments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionList(ExpressionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression2(Expression2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpression(UnaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeName(AttributeName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Using Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Using Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsingDirective(UsingDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integral Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integral Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegralType(IntegralType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayType(ArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumType(EnumType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonArrayType(NonArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualified Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualified Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifiedIdentifier(QualifiedIdentifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Built In Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Built In Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuiltInType(BuiltInType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumBody(EnumBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Member Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Member Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumMemberDeclaration(EnumMemberDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration Statment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration Statment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarationStatment(DeclarationStatment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Localconstant Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Localconstant Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalconstantDeclaration(LocalconstantDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Labeled Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Labeled Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabeledStatement(LabeledStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Embedded Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Embedded Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmbeddedStatement(EmbeddedStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Using Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Using Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsingStatement(UsingStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Aquisition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Aquisition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceAquisition(ResourceAquisition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalVariableDeclaration(LocalVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lock Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lock Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLockStatement(LockStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Try Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Try Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTryStatement(TryStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Finally Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Finally Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFinallyClause(FinallyClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Catch Clauses</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Catch Clauses</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCatchClauses(CatchClauses object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>General Catchclause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>General Catchclause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralCatchclause(GeneralCatchclause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Specific Catch Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Specific Catch Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecificCatchClause(SpecificCatchClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jump Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jump Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJumpStatement(JumpStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThrowStatement(ThrowStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnStatement(ReturnStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goto Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goto Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGotoStatement(GotoStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContinueStatement(ContinueStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Break Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Break Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBreakStatement(BreakStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Iteration Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Iteration Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIterationStatement(IterationStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Foreach Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Foreach Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForeachStatement(ForeachStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForStatement(ForStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForInitializer(ForInitializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement Expression List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement Expression List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatementExpressionList(StatementExpressionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatementExpression(StatementExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryExpression(PrimaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Expression2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Expression2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryExpression2(PrimaryExpression2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Do Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Do Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoStatement(DoStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhileStatement(WhileStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectionStatement(SelectionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchStatement(SwitchStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchSection(SwitchSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchLabel(SwitchLabel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStatement(IfStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Else Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Else Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElsePart(ElsePart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Maybe Empty Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Maybe Empty Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaybeEmptyBlock(MaybeEmptyBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Void</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Void</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVoid(org.xtext.example.myModel.cSharp.Void object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CSharpSwitch
