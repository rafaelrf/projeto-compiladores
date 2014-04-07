/**
 */
package org.xtext.example.myModel.cSharp.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.myModel.cSharp.CSharpPackage
 * @generated
 */
public class CSharpAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CSharpPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSharpAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CSharpPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CSharpSwitch<Adapter> modelSwitch =
    new CSharpSwitch<Adapter>()
    {
      @Override
      public Adapter caseCompilationUnit(CompilationUnit object)
      {
        return createCompilationUnitAdapter();
      }
      @Override
      public Adapter caseIdentifier(Identifier object)
      {
        return createIdentifierAdapter();
      }
      @Override
      public Adapter caseUsingDirective(UsingDirective object)
      {
        return createUsingDirectiveAdapter();
      }
      @Override
      public Adapter caseArrayType(ArrayType object)
      {
        return createArrayTypeAdapter();
      }
      @Override
      public Adapter caseGlobalAttributes(GlobalAttributes object)
      {
        return createGlobalAttributesAdapter();
      }
      @Override
      public Adapter caseGlobalAttributeSection(GlobalAttributeSection object)
      {
        return createGlobalAttributeSectionAdapter();
      }
      @Override
      public Adapter caseAttributes(Attributes object)
      {
        return createAttributesAdapter();
      }
      @Override
      public Adapter caseAttributeSection(AttributeSection object)
      {
        return createAttributeSectionAdapter();
      }
      @Override
      public Adapter caseAttributeList(AttributeList object)
      {
        return createAttributeListAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseAttributeArguments(AttributeArguments object)
      {
        return createAttributeArgumentsAdapter();
      }
      @Override
      public Adapter caseExpressionList(ExpressionList object)
      {
        return createExpressionListAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseExpression2(Expression2 object)
      {
        return createExpression2Adapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
      }
      @Override
      public Adapter casePrimaryExpression(PrimaryExpression object)
      {
        return createPrimaryExpressionAdapter();
      }
      @Override
      public Adapter casePrimaryExpression2(PrimaryExpression2 object)
      {
        return createPrimaryExpression2Adapter();
      }
      @Override
      public Adapter caseArrayInitializer(ArrayInitializer object)
      {
        return createArrayInitializerAdapter();
      }
      @Override
      public Adapter caseVariableInitializer(VariableInitializer object)
      {
        return createVariableInitializerAdapter();
      }
      @Override
      public Adapter caseAttributeName(AttributeName object)
      {
        return createAttributeNameAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseIntegralType(IntegralType object)
      {
        return createIntegralTypeAdapter();
      }
      @Override
      public Adapter caseNonArrayType(NonArrayType object)
      {
        return createNonArrayTypeAdapter();
      }
      @Override
      public Adapter caseBuiltInType(BuiltInType object)
      {
        return createBuiltInTypeAdapter();
      }
      @Override
      public Adapter caseBuiltInClassType(BuiltInClassType object)
      {
        return createBuiltInClassTypeAdapter();
      }
      @Override
      public Adapter caseQualifiedIdentifier(QualifiedIdentifier object)
      {
        return createQualifiedIdentifierAdapter();
      }
      @Override
      public Adapter caseNamespaceMemberDeclaration(NamespaceMemberDeclaration object)
      {
        return createNamespaceMemberDeclarationAdapter();
      }
      @Override
      public Adapter caseNamespaceDeclaration(NamespaceDeclaration object)
      {
        return createNamespaceDeclarationAdapter();
      }
      @Override
      public Adapter caseNamespaceBody(NamespaceBody object)
      {
        return createNamespaceBodyAdapter();
      }
      @Override
      public Adapter caseTypeDeclaration(TypeDeclaration object)
      {
        return createTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseDelegateDeclaration(DelegateDeclaration object)
      {
        return createDelegateDeclarationAdapter();
      }
      @Override
      public Adapter caseEnumDeclaration(EnumDeclaration object)
      {
        return createEnumDeclarationAdapter();
      }
      @Override
      public Adapter caseEnumBody(EnumBody object)
      {
        return createEnumBodyAdapter();
      }
      @Override
      public Adapter caseEnumMemberDeclaration(EnumMemberDeclaration object)
      {
        return createEnumMemberDeclarationAdapter();
      }
      @Override
      public Adapter caseInterfaceDeclaration(InterfaceDeclaration object)
      {
        return createInterfaceDeclarationAdapter();
      }
      @Override
      public Adapter caseInterfaceBody(InterfaceBody object)
      {
        return createInterfaceBodyAdapter();
      }
      @Override
      public Adapter caseInterfaceMemberDeclaration(InterfaceMemberDeclaration object)
      {
        return createInterfaceMemberDeclarationAdapter();
      }
      @Override
      public Adapter caseInterfaceIndexerDeclaration(InterfaceIndexerDeclaration object)
      {
        return createInterfaceIndexerDeclarationAdapter();
      }
      @Override
      public Adapter caseInterfaceEventDeclaration(InterfaceEventDeclaration object)
      {
        return createInterfaceEventDeclarationAdapter();
      }
      @Override
      public Adapter caseInterfacePropertyDeclaration(InterfacePropertyDeclaration object)
      {
        return createInterfacePropertyDeclarationAdapter();
      }
      @Override
      public Adapter caseInterfaceAccessors(InterfaceAccessors object)
      {
        return createInterfaceAccessorsAdapter();
      }
      @Override
      public Adapter caseInterfaceMethodDeclaration(InterfaceMethodDeclaration object)
      {
        return createInterfaceMethodDeclarationAdapter();
      }
      @Override
      public Adapter caseClassDeclaration(ClassDeclaration object)
      {
        return createClassDeclarationAdapter();
      }
      @Override
      public Adapter caseClassBody(ClassBody object)
      {
        return createClassBodyAdapter();
      }
      @Override
      public Adapter caseClassMemberDeclaration(ClassMemberDeclaration object)
      {
        return createClassMemberDeclarationAdapter();
      }
      @Override
      public Adapter caseStaticConstructorDeclaration(StaticConstructorDeclaration object)
      {
        return createStaticConstructorDeclarationAdapter();
      }
      @Override
      public Adapter caseDestructorDeclaration(DestructorDeclaration object)
      {
        return createDestructorDeclarationAdapter();
      }
      @Override
      public Adapter caseConstructorDeclaration(ConstructorDeclaration object)
      {
        return createConstructorDeclarationAdapter();
      }
      @Override
      public Adapter caseConstructorDeclarator(ConstructorDeclarator object)
      {
        return createConstructorDeclaratorAdapter();
      }
      @Override
      public Adapter caseConstructorInitializer(ConstructorInitializer object)
      {
        return createConstructorInitializerAdapter();
      }
      @Override
      public Adapter caseArgumentList(ArgumentList object)
      {
        return createArgumentListAdapter();
      }
      @Override
      public Adapter caseArgument(Argument object)
      {
        return createArgumentAdapter();
      }
      @Override
      public Adapter caseOperatorDeclaration(OperatorDeclaration object)
      {
        return createOperatorDeclarationAdapter();
      }
      @Override
      public Adapter caseOperatorDeclarator(OperatorDeclarator object)
      {
        return createOperatorDeclaratorAdapter();
      }
      @Override
      public Adapter caseConversionOperatorDeclarator(ConversionOperatorDeclarator object)
      {
        return createConversionOperatorDeclaratorAdapter();
      }
      @Override
      public Adapter caseBinaryOperatorDeclarator(BinaryOperatorDeclarator object)
      {
        return createBinaryOperatorDeclaratorAdapter();
      }
      @Override
      public Adapter caseUnaryOperatorDeclarator(UnaryOperatorDeclarator object)
      {
        return createUnaryOperatorDeclaratorAdapter();
      }
      @Override
      public Adapter caseIndexerDeclaration(IndexerDeclaration object)
      {
        return createIndexerDeclarationAdapter();
      }
      @Override
      public Adapter caseIndexerDeclarator(IndexerDeclarator object)
      {
        return createIndexerDeclaratorAdapter();
      }
      @Override
      public Adapter caseEventDeclaration(EventDeclaration object)
      {
        return createEventDeclarationAdapter();
      }
      @Override
      public Adapter caseEventAccessorDeclarations(EventAccessorDeclarations object)
      {
        return createEventAccessorDeclarationsAdapter();
      }
      @Override
      public Adapter caseRemoveAccessorDeclaration(RemoveAccessorDeclaration object)
      {
        return createRemoveAccessorDeclarationAdapter();
      }
      @Override
      public Adapter caseAddAccessorDeclaration(AddAccessorDeclaration object)
      {
        return createAddAccessorDeclarationAdapter();
      }
      @Override
      public Adapter casePropertyDeclaration(PropertyDeclaration object)
      {
        return createPropertyDeclarationAdapter();
      }
      @Override
      public Adapter caseAccessorDeclarations(AccessorDeclarations object)
      {
        return createAccessorDeclarationsAdapter();
      }
      @Override
      public Adapter caseSetAccessorDeclaration(SetAccessorDeclaration object)
      {
        return createSetAccessorDeclarationAdapter();
      }
      @Override
      public Adapter caseGetAccessorDeclaration(GetAccessorDeclaration object)
      {
        return createGetAccessorDeclarationAdapter();
      }
      @Override
      public Adapter caseMethodDeclaration(MethodDeclaration object)
      {
        return createMethodDeclarationAdapter();
      }
      @Override
      public Adapter caseMethodHeader(MethodHeader object)
      {
        return createMethodHeaderAdapter();
      }
      @Override
      public Adapter caseFormalParameterList(FormalParameterList object)
      {
        return createFormalParameterListAdapter();
      }
      @Override
      public Adapter caseParameterArray(ParameterArray object)
      {
        return createParameterArrayAdapter();
      }
      @Override
      public Adapter caseFixedParameters(FixedParameters object)
      {
        return createFixedParametersAdapter();
      }
      @Override
      public Adapter caseFixedParameter(FixedParameter object)
      {
        return createFixedParameterAdapter();
      }
      @Override
      public Adapter caseTypeOrVoid(TypeOrVoid object)
      {
        return createTypeOrVoidAdapter();
      }
      @Override
      public Adapter caseFieldDeclaration(FieldDeclaration object)
      {
        return createFieldDeclarationAdapter();
      }
      @Override
      public Adapter caseVariableDeclarator(VariableDeclarator object)
      {
        return createVariableDeclaratorAdapter();
      }
      @Override
      public Adapter caseConstantDeclaration(ConstantDeclaration object)
      {
        return createConstantDeclarationAdapter();
      }
      @Override
      public Adapter caseConstantDeclarator(ConstantDeclarator object)
      {
        return createConstantDeclaratorAdapter();
      }
      @Override
      public Adapter caseClassBase(ClassBase object)
      {
        return createClassBaseAdapter();
      }
      @Override
      public Adapter caseQualifiedIdentifierList(QualifiedIdentifierList object)
      {
        return createQualifiedIdentifierListAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseDeclarationStatment(DeclarationStatment object)
      {
        return createDeclarationStatmentAdapter();
      }
      @Override
      public Adapter caseLocalconstantDeclaration(LocalconstantDeclaration object)
      {
        return createLocalconstantDeclarationAdapter();
      }
      @Override
      public Adapter caseLabeledStatement(LabeledStatement object)
      {
        return createLabeledStatementAdapter();
      }
      @Override
      public Adapter caseEmbeddedStatement(EmbeddedStatement object)
      {
        return createEmbeddedStatementAdapter();
      }
      @Override
      public Adapter caseUsingStatement(UsingStatement object)
      {
        return createUsingStatementAdapter();
      }
      @Override
      public Adapter caseResourceAquisition(ResourceAquisition object)
      {
        return createResourceAquisitionAdapter();
      }
      @Override
      public Adapter caseLocalVariableDeclaration(LocalVariableDeclaration object)
      {
        return createLocalVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseLockStatement(LockStatement object)
      {
        return createLockStatementAdapter();
      }
      @Override
      public Adapter caseTryStatement(TryStatement object)
      {
        return createTryStatementAdapter();
      }
      @Override
      public Adapter caseFinallyClause(FinallyClause object)
      {
        return createFinallyClauseAdapter();
      }
      @Override
      public Adapter caseCatchClauses(CatchClauses object)
      {
        return createCatchClausesAdapter();
      }
      @Override
      public Adapter caseGeneralCatchclause(GeneralCatchclause object)
      {
        return createGeneralCatchclauseAdapter();
      }
      @Override
      public Adapter caseSpecificCatchClause(SpecificCatchClause object)
      {
        return createSpecificCatchClauseAdapter();
      }
      @Override
      public Adapter caseJumpStatement(JumpStatement object)
      {
        return createJumpStatementAdapter();
      }
      @Override
      public Adapter caseThrowStatement(ThrowStatement object)
      {
        return createThrowStatementAdapter();
      }
      @Override
      public Adapter caseReturnStatement(ReturnStatement object)
      {
        return createReturnStatementAdapter();
      }
      @Override
      public Adapter caseGotoStatement(GotoStatement object)
      {
        return createGotoStatementAdapter();
      }
      @Override
      public Adapter caseContinueStatement(ContinueStatement object)
      {
        return createContinueStatementAdapter();
      }
      @Override
      public Adapter caseBreakStatement(BreakStatement object)
      {
        return createBreakStatementAdapter();
      }
      @Override
      public Adapter caseIterationStatement(IterationStatement object)
      {
        return createIterationStatementAdapter();
      }
      @Override
      public Adapter caseForeachStatement(ForeachStatement object)
      {
        return createForeachStatementAdapter();
      }
      @Override
      public Adapter caseForStatement(ForStatement object)
      {
        return createForStatementAdapter();
      }
      @Override
      public Adapter caseForInitializer(ForInitializer object)
      {
        return createForInitializerAdapter();
      }
      @Override
      public Adapter caseStatementExpressionList(StatementExpressionList object)
      {
        return createStatementExpressionListAdapter();
      }
      @Override
      public Adapter caseStatementExpression(StatementExpression object)
      {
        return createStatementExpressionAdapter();
      }
      @Override
      public Adapter caseDoStatement(DoStatement object)
      {
        return createDoStatementAdapter();
      }
      @Override
      public Adapter caseWhileStatement(WhileStatement object)
      {
        return createWhileStatementAdapter();
      }
      @Override
      public Adapter caseSelectionStatement(SelectionStatement object)
      {
        return createSelectionStatementAdapter();
      }
      @Override
      public Adapter caseSwitchStatement(SwitchStatement object)
      {
        return createSwitchStatementAdapter();
      }
      @Override
      public Adapter caseSwitchSection(SwitchSection object)
      {
        return createSwitchSectionAdapter();
      }
      @Override
      public Adapter caseSwitchLabel(SwitchLabel object)
      {
        return createSwitchLabelAdapter();
      }
      @Override
      public Adapter caseIfStatement(IfStatement object)
      {
        return createIfStatementAdapter();
      }
      @Override
      public Adapter caseElsePart(ElsePart object)
      {
        return createElsePartAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseMaybeEmptyBlock(MaybeEmptyBlock object)
      {
        return createMaybeEmptyBlockAdapter();
      }
      @Override
      public Adapter caseSByte(SByte object)
      {
        return createSByteAdapter();
      }
      @Override
      public Adapter caseByte(org.xtext.example.myModel.cSharp.Byte object)
      {
        return createByteAdapter();
      }
      @Override
      public Adapter caseShort(org.xtext.example.myModel.cSharp.Short object)
      {
        return createShortAdapter();
      }
      @Override
      public Adapter caseUShort(UShort object)
      {
        return createUShortAdapter();
      }
      @Override
      public Adapter caseInt(Int object)
      {
        return createIntAdapter();
      }
      @Override
      public Adapter caseUInt(UInt object)
      {
        return createUIntAdapter();
      }
      @Override
      public Adapter caseLong(org.xtext.example.myModel.cSharp.Long object)
      {
        return createLongAdapter();
      }
      @Override
      public Adapter caseULong(ULong object)
      {
        return createULongAdapter();
      }
      @Override
      public Adapter caseChar(Char object)
      {
        return createCharAdapter();
      }
      @Override
      public Adapter caseBool(Bool object)
      {
        return createBoolAdapter();
      }
      @Override
      public Adapter caseDecimal(Decimal object)
      {
        return createDecimalAdapter();
      }
      @Override
      public Adapter caseFloat(org.xtext.example.myModel.cSharp.Float object)
      {
        return createFloatAdapter();
      }
      @Override
      public Adapter caseDouble(org.xtext.example.myModel.cSharp.Double object)
      {
        return createDoubleAdapter();
      }
      @Override
      public Adapter caseObject(org.xtext.example.myModel.cSharp.Object object)
      {
        return createObjectAdapter();
      }
      @Override
      public Adapter caseString(org.xtext.example.myModel.cSharp.String object)
      {
        return createStringAdapter();
      }
      @Override
      public Adapter caseVoid(org.xtext.example.myModel.cSharp.Void object)
      {
        return createVoidAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.CompilationUnit <em>Compilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.CompilationUnit
   * @generated
   */
  public Adapter createCompilationUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Identifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Identifier
   * @generated
   */
  public Adapter createIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.UsingDirective <em>Using Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.UsingDirective
   * @generated
   */
  public Adapter createUsingDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ArrayType
   * @generated
   */
  public Adapter createArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.GlobalAttributes <em>Global Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.GlobalAttributes
   * @generated
   */
  public Adapter createGlobalAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.GlobalAttributeSection <em>Global Attribute Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.GlobalAttributeSection
   * @generated
   */
  public Adapter createGlobalAttributeSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Attributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Attributes
   * @generated
   */
  public Adapter createAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.AttributeSection <em>Attribute Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.AttributeSection
   * @generated
   */
  public Adapter createAttributeSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.AttributeList <em>Attribute List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.AttributeList
   * @generated
   */
  public Adapter createAttributeListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.AttributeArguments <em>Attribute Arguments</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.AttributeArguments
   * @generated
   */
  public Adapter createAttributeArgumentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ExpressionList <em>Expression List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ExpressionList
   * @generated
   */
  public Adapter createExpressionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Expression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Expression2
   * @generated
   */
  public Adapter createExpression2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression
   * @generated
   */
  public Adapter createPrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.PrimaryExpression2 <em>Primary Expression2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.PrimaryExpression2
   * @generated
   */
  public Adapter createPrimaryExpression2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ArrayInitializer <em>Array Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ArrayInitializer
   * @generated
   */
  public Adapter createArrayInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.VariableInitializer <em>Variable Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.VariableInitializer
   * @generated
   */
  public Adapter createVariableInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.AttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.AttributeName
   * @generated
   */
  public Adapter createAttributeNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.IntegralType <em>Integral Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.IntegralType
   * @generated
   */
  public Adapter createIntegralTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.NonArrayType <em>Non Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.NonArrayType
   * @generated
   */
  public Adapter createNonArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.BuiltInType <em>Built In Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.BuiltInType
   * @generated
   */
  public Adapter createBuiltInTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.BuiltInClassType <em>Built In Class Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.BuiltInClassType
   * @generated
   */
  public Adapter createBuiltInClassTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.QualifiedIdentifier <em>Qualified Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.QualifiedIdentifier
   * @generated
   */
  public Adapter createQualifiedIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.NamespaceMemberDeclaration <em>Namespace Member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.NamespaceMemberDeclaration
   * @generated
   */
  public Adapter createNamespaceMemberDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.NamespaceDeclaration <em>Namespace Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.NamespaceDeclaration
   * @generated
   */
  public Adapter createNamespaceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.NamespaceBody <em>Namespace Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.NamespaceBody
   * @generated
   */
  public Adapter createNamespaceBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.TypeDeclaration <em>Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.TypeDeclaration
   * @generated
   */
  public Adapter createTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.DelegateDeclaration <em>Delegate Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.DelegateDeclaration
   * @generated
   */
  public Adapter createDelegateDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.EnumDeclaration <em>Enum Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.EnumDeclaration
   * @generated
   */
  public Adapter createEnumDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.EnumBody <em>Enum Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.EnumBody
   * @generated
   */
  public Adapter createEnumBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.EnumMemberDeclaration <em>Enum Member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.EnumMemberDeclaration
   * @generated
   */
  public Adapter createEnumMemberDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.InterfaceDeclaration <em>Interface Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.InterfaceDeclaration
   * @generated
   */
  public Adapter createInterfaceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.InterfaceBody <em>Interface Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.InterfaceBody
   * @generated
   */
  public Adapter createInterfaceBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.InterfaceMemberDeclaration <em>Interface Member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.InterfaceMemberDeclaration
   * @generated
   */
  public Adapter createInterfaceMemberDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.InterfaceIndexerDeclaration <em>Interface Indexer Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.InterfaceIndexerDeclaration
   * @generated
   */
  public Adapter createInterfaceIndexerDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.InterfaceEventDeclaration <em>Interface Event Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.InterfaceEventDeclaration
   * @generated
   */
  public Adapter createInterfaceEventDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.InterfacePropertyDeclaration <em>Interface Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.InterfacePropertyDeclaration
   * @generated
   */
  public Adapter createInterfacePropertyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.InterfaceAccessors <em>Interface Accessors</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.InterfaceAccessors
   * @generated
   */
  public Adapter createInterfaceAccessorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.InterfaceMethodDeclaration <em>Interface Method Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.InterfaceMethodDeclaration
   * @generated
   */
  public Adapter createInterfaceMethodDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ClassDeclaration
   * @generated
   */
  public Adapter createClassDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ClassBody <em>Class Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ClassBody
   * @generated
   */
  public Adapter createClassBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ClassMemberDeclaration <em>Class Member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ClassMemberDeclaration
   * @generated
   */
  public Adapter createClassMemberDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.StaticConstructorDeclaration <em>Static Constructor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.StaticConstructorDeclaration
   * @generated
   */
  public Adapter createStaticConstructorDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.DestructorDeclaration <em>Destructor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.DestructorDeclaration
   * @generated
   */
  public Adapter createDestructorDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ConstructorDeclaration <em>Constructor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ConstructorDeclaration
   * @generated
   */
  public Adapter createConstructorDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ConstructorDeclarator <em>Constructor Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ConstructorDeclarator
   * @generated
   */
  public Adapter createConstructorDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ConstructorInitializer <em>Constructor Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ConstructorInitializer
   * @generated
   */
  public Adapter createConstructorInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ArgumentList
   * @generated
   */
  public Adapter createArgumentListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Argument
   * @generated
   */
  public Adapter createArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.OperatorDeclaration <em>Operator Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.OperatorDeclaration
   * @generated
   */
  public Adapter createOperatorDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.OperatorDeclarator <em>Operator Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.OperatorDeclarator
   * @generated
   */
  public Adapter createOperatorDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ConversionOperatorDeclarator <em>Conversion Operator Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ConversionOperatorDeclarator
   * @generated
   */
  public Adapter createConversionOperatorDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator <em>Binary Operator Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator
   * @generated
   */
  public Adapter createBinaryOperatorDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.UnaryOperatorDeclarator <em>Unary Operator Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.UnaryOperatorDeclarator
   * @generated
   */
  public Adapter createUnaryOperatorDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.IndexerDeclaration <em>Indexer Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.IndexerDeclaration
   * @generated
   */
  public Adapter createIndexerDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.IndexerDeclarator <em>Indexer Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.IndexerDeclarator
   * @generated
   */
  public Adapter createIndexerDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.EventDeclaration <em>Event Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.EventDeclaration
   * @generated
   */
  public Adapter createEventDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.EventAccessorDeclarations <em>Event Accessor Declarations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.EventAccessorDeclarations
   * @generated
   */
  public Adapter createEventAccessorDeclarationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.RemoveAccessorDeclaration <em>Remove Accessor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.RemoveAccessorDeclaration
   * @generated
   */
  public Adapter createRemoveAccessorDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.AddAccessorDeclaration <em>Add Accessor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.AddAccessorDeclaration
   * @generated
   */
  public Adapter createAddAccessorDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.PropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.PropertyDeclaration
   * @generated
   */
  public Adapter createPropertyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.AccessorDeclarations <em>Accessor Declarations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.AccessorDeclarations
   * @generated
   */
  public Adapter createAccessorDeclarationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.SetAccessorDeclaration <em>Set Accessor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.SetAccessorDeclaration
   * @generated
   */
  public Adapter createSetAccessorDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.GetAccessorDeclaration <em>Get Accessor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.GetAccessorDeclaration
   * @generated
   */
  public Adapter createGetAccessorDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.MethodDeclaration <em>Method Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.MethodDeclaration
   * @generated
   */
  public Adapter createMethodDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.MethodHeader <em>Method Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.MethodHeader
   * @generated
   */
  public Adapter createMethodHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.FormalParameterList <em>Formal Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.FormalParameterList
   * @generated
   */
  public Adapter createFormalParameterListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ParameterArray <em>Parameter Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ParameterArray
   * @generated
   */
  public Adapter createParameterArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.FixedParameters <em>Fixed Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.FixedParameters
   * @generated
   */
  public Adapter createFixedParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.FixedParameter <em>Fixed Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.FixedParameter
   * @generated
   */
  public Adapter createFixedParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.TypeOrVoid <em>Type Or Void</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.TypeOrVoid
   * @generated
   */
  public Adapter createTypeOrVoidAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.FieldDeclaration <em>Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.FieldDeclaration
   * @generated
   */
  public Adapter createFieldDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.VariableDeclarator <em>Variable Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.VariableDeclarator
   * @generated
   */
  public Adapter createVariableDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ConstantDeclaration <em>Constant Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ConstantDeclaration
   * @generated
   */
  public Adapter createConstantDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ConstantDeclarator <em>Constant Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ConstantDeclarator
   * @generated
   */
  public Adapter createConstantDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ClassBase <em>Class Base</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ClassBase
   * @generated
   */
  public Adapter createClassBaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.QualifiedIdentifierList <em>Qualified Identifier List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.QualifiedIdentifierList
   * @generated
   */
  public Adapter createQualifiedIdentifierListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.DeclarationStatment <em>Declaration Statment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.DeclarationStatment
   * @generated
   */
  public Adapter createDeclarationStatmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.LocalconstantDeclaration <em>Localconstant Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.LocalconstantDeclaration
   * @generated
   */
  public Adapter createLocalconstantDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.LabeledStatement <em>Labeled Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.LabeledStatement
   * @generated
   */
  public Adapter createLabeledStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.EmbeddedStatement <em>Embedded Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.EmbeddedStatement
   * @generated
   */
  public Adapter createEmbeddedStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.UsingStatement <em>Using Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.UsingStatement
   * @generated
   */
  public Adapter createUsingStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ResourceAquisition <em>Resource Aquisition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ResourceAquisition
   * @generated
   */
  public Adapter createResourceAquisitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.LocalVariableDeclaration <em>Local Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.LocalVariableDeclaration
   * @generated
   */
  public Adapter createLocalVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.LockStatement <em>Lock Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.LockStatement
   * @generated
   */
  public Adapter createLockStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.TryStatement <em>Try Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.TryStatement
   * @generated
   */
  public Adapter createTryStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.FinallyClause <em>Finally Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.FinallyClause
   * @generated
   */
  public Adapter createFinallyClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.CatchClauses <em>Catch Clauses</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.CatchClauses
   * @generated
   */
  public Adapter createCatchClausesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.GeneralCatchclause <em>General Catchclause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.GeneralCatchclause
   * @generated
   */
  public Adapter createGeneralCatchclauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.SpecificCatchClause <em>Specific Catch Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.SpecificCatchClause
   * @generated
   */
  public Adapter createSpecificCatchClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.JumpStatement <em>Jump Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.JumpStatement
   * @generated
   */
  public Adapter createJumpStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ThrowStatement <em>Throw Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ThrowStatement
   * @generated
   */
  public Adapter createThrowStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ReturnStatement
   * @generated
   */
  public Adapter createReturnStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.GotoStatement <em>Goto Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.GotoStatement
   * @generated
   */
  public Adapter createGotoStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ContinueStatement <em>Continue Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ContinueStatement
   * @generated
   */
  public Adapter createContinueStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.BreakStatement <em>Break Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.BreakStatement
   * @generated
   */
  public Adapter createBreakStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.IterationStatement <em>Iteration Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.IterationStatement
   * @generated
   */
  public Adapter createIterationStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ForeachStatement <em>Foreach Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ForeachStatement
   * @generated
   */
  public Adapter createForeachStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ForStatement
   * @generated
   */
  public Adapter createForStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ForInitializer <em>For Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ForInitializer
   * @generated
   */
  public Adapter createForInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.StatementExpressionList <em>Statement Expression List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.StatementExpressionList
   * @generated
   */
  public Adapter createStatementExpressionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.StatementExpression <em>Statement Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.StatementExpression
   * @generated
   */
  public Adapter createStatementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.DoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.DoStatement
   * @generated
   */
  public Adapter createDoStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.WhileStatement
   * @generated
   */
  public Adapter createWhileStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.SelectionStatement <em>Selection Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.SelectionStatement
   * @generated
   */
  public Adapter createSelectionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.SwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.SwitchStatement
   * @generated
   */
  public Adapter createSwitchStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.SwitchSection <em>Switch Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.SwitchSection
   * @generated
   */
  public Adapter createSwitchSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.SwitchLabel <em>Switch Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.SwitchLabel
   * @generated
   */
  public Adapter createSwitchLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.IfStatement
   * @generated
   */
  public Adapter createIfStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ElsePart <em>Else Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ElsePart
   * @generated
   */
  public Adapter createElsePartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.MaybeEmptyBlock <em>Maybe Empty Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.MaybeEmptyBlock
   * @generated
   */
  public Adapter createMaybeEmptyBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.SByte <em>SByte</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.SByte
   * @generated
   */
  public Adapter createSByteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Byte <em>Byte</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Byte
   * @generated
   */
  public Adapter createByteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Short <em>Short</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Short
   * @generated
   */
  public Adapter createShortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.UShort <em>UShort</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.UShort
   * @generated
   */
  public Adapter createUShortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Int <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Int
   * @generated
   */
  public Adapter createIntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.UInt <em>UInt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.UInt
   * @generated
   */
  public Adapter createUIntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Long <em>Long</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Long
   * @generated
   */
  public Adapter createLongAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.ULong <em>ULong</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.ULong
   * @generated
   */
  public Adapter createULongAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Char <em>Char</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Char
   * @generated
   */
  public Adapter createCharAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Bool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Bool
   * @generated
   */
  public Adapter createBoolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Decimal <em>Decimal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Decimal
   * @generated
   */
  public Adapter createDecimalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Float <em>Float</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Float
   * @generated
   */
  public Adapter createFloatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Double <em>Double</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Double
   * @generated
   */
  public Adapter createDoubleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Object
   * @generated
   */
  public Adapter createObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.String <em>String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.String
   * @generated
   */
  public Adapter createStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.myModel.cSharp.Void <em>Void</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.myModel.cSharp.Void
   * @generated
   */
  public Adapter createVoidAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CSharpAdapterFactory
