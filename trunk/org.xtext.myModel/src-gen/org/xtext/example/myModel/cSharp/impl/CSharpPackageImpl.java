/**
 */
package org.xtext.example.myModel.cSharp.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSharpPackageImpl extends EPackageImpl implements CSharpPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compilationUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass usingDirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globalAttributesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globalAttributeSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeArgumentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryExpression2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayInitializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableInitializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integralTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nonArrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builtInTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builtInClassTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedIdentifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespaceMemberDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespaceDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespaceBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass delegateDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumMemberDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceMemberDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceIndexerDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceEventDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfacePropertyDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceAccessorsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceMethodDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classMemberDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticConstructorDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass destructorDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructorDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructorDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructorInitializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conversionOperatorDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryOperatorDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryOperatorDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexerDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexerDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventAccessorDeclarationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass removeAccessorDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addAccessorDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accessorDeclarationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setAccessorDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getAccessorDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodHeaderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formalParameterListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterArrayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fixedParametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fixedParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeOrVoidEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classBaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedIdentifierListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationStatmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localconstantDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labeledStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass embeddedStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass usingStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceAquisitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localVariableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lockStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tryStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass finallyClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass catchClausesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generalCatchclauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specificCatchClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jumpStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass throwStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gotoStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass continueStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass breakStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iterationStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass foreachStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forInitializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementExpressionListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchLabelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elsePartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maybeEmptyBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sByteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass byteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uShortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass longEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uLongEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass charEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decimalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass voidEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.myModel.cSharp.CSharpPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CSharpPackageImpl()
  {
    super(eNS_URI, CSharpFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CSharpPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CSharpPackage init()
  {
    if (isInited) return (CSharpPackage)EPackage.Registry.INSTANCE.getEPackage(CSharpPackage.eNS_URI);

    // Obtain or create and register package
    CSharpPackageImpl theCSharpPackage = (CSharpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CSharpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CSharpPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCSharpPackage.createPackageContents();

    // Initialize created meta-data
    theCSharpPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCSharpPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CSharpPackage.eNS_URI, theCSharpPackage);
    return theCSharpPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompilationUnit()
  {
    return compilationUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilationUnit_UsingDirectives()
  {
    return (EReference)compilationUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilationUnit_GlobalAtt()
  {
    return (EReference)compilationUnitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilationUnit_NameSpaces()
  {
    return (EReference)compilationUnitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentifier()
  {
    return identifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUsingDirective()
  {
    return usingDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsingDirective_Name()
  {
    return (EReference)usingDirectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsingDirective_Usings()
  {
    return (EReference)usingDirectiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayType()
  {
    return arrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobalAttributes()
  {
    return globalAttributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobalAttributes_GlobalAttSections()
  {
    return (EReference)globalAttributesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobalAttributeSection()
  {
    return globalAttributeSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobalAttributeSection_Attributes()
  {
    return (EReference)globalAttributeSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributes()
  {
    return attributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributes_Attributes()
  {
    return (EReference)attributesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeSection()
  {
    return attributeSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeList()
  {
    return attributeListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeList_Attribute()
  {
    return (EReference)attributeListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeList_Attributes()
  {
    return (EReference)attributeListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Name()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_AttArguments()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeArguments()
  {
    return attributeArgumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeArguments_ExpresionList()
  {
    return (EReference)attributeArgumentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionList()
  {
    return expressionListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionList_Expression()
  {
    return (EReference)expressionListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionList_Expressions()
  {
    return (EReference)expressionListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Unary()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Exp()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Exp2()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression2()
  {
    return expression2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_InterExp()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_InterExp2()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_PipelineExp()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_PipelineExp2()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_InExp()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_InExp2()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_BarExp()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_BarExp2()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_Exp()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_Exp2()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_AmpExp()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_AmpExp2()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_EqualityExp()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_EqualityExp2()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_RelopExp()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_RelopExp2()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_BuildInType()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_ShiftExp()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_ShiftExp2()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_OperatorExp()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_OperatorExp2()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_MultipExp()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_MultipExp2()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_DivExp()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_DivExp2()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_ModExp()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression2_ModExp2()
  {
    return (EReference)expression2EClass.getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryExpression()
  {
    return unaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryExpression_ExpUnaryOperator()
  {
    return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpression_Type()
  {
    return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpression_UnaryExp()
  {
    return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpression_PrimaryExp()
  {
    return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryExpression()
  {
    return primaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_NonArrayType()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_ExpressionList()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryExpression_RankSpecifier()
  {
    return (EAttribute)primaryExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_ArrayInitializer()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_ArrayType()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_ArrayInitializer2()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_Tipo()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_ArgumentList()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_Id()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryExpression_Literal()
  {
    return (EAttribute)primaryExpressionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_Expression()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryExpression_PredefinedType()
  {
    return (EAttribute)primaryExpressionEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_TypeOrVoid()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_PrimaryExoression2()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryExpression2()
  {
    return primaryExpression2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression2_Id()
  {
    return (EReference)primaryExpression2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression2_ArgumentList()
  {
    return (EReference)primaryExpression2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression2_ExpressionList()
  {
    return (EReference)primaryExpression2EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryExpression2_IncrementeDecrement()
  {
    return (EAttribute)primaryExpression2EClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression2_PrimaryExpression2()
  {
    return (EReference)primaryExpression2EClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayInitializer()
  {
    return arrayInitializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayInitializer_VariableInitalizer()
  {
    return (EReference)arrayInitializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayInitializer_VariableInitalizers()
  {
    return (EReference)arrayInitializerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableInitializer()
  {
    return variableInitializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeName()
  {
    return attributeNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeName_QualifiedId()
  {
    return (EReference)attributeNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_NonArray()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_VariableDeclarator()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_VariableDeclarators()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_QIdent()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_EventAccessorDeclarations()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_QualifiedId()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_AccDeclarate()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Variable()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Variables()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_ConstDeclarator()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_ConstDeclarators()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegralType()
  {
    return integralTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNonArrayType()
  {
    return nonArrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNonArrayType_BuiltType()
  {
    return (EReference)nonArrayTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNonArrayType_Qualified()
  {
    return (EReference)nonArrayTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuiltInType()
  {
    return builtInTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuiltInClassType()
  {
    return builtInClassTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltInClassType_QID2()
  {
    return (EReference)builtInClassTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedIdentifier()
  {
    return qualifiedIdentifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualifiedIdentifier_Id()
  {
    return (EReference)qualifiedIdentifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualifiedIdentifier_Ids()
  {
    return (EReference)qualifiedIdentifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespaceMemberDeclaration()
  {
    return namespaceMemberDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespaceMemberDeclaration_NameDeclaretion()
  {
    return (EReference)namespaceMemberDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespaceMemberDeclaration_TypeDeclaration()
  {
    return (EReference)namespaceMemberDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespaceDeclaration()
  {
    return namespaceDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespaceDeclaration_QId()
  {
    return (EReference)namespaceDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespaceDeclaration_NameBody()
  {
    return (EReference)namespaceDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespaceBody()
  {
    return namespaceBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespaceBody_UsingDirectives()
  {
    return (EReference)namespaceBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespaceBody_NameSpaces()
  {
    return (EReference)namespaceBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDeclaration()
  {
    return typeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDeclaration_ClassDeclaration()
  {
    return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDeclaration_InterfaceDeclaration()
  {
    return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDeclaration_EnumDeclaration()
  {
    return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDeclaration_DelegateDeclaration()
  {
    return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelegateDeclaration()
  {
    return delegateDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumDeclaration()
  {
    return enumDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumDeclaration_Name()
  {
    return (EReference)enumDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumDeclaration_IntType()
  {
    return (EReference)enumDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumDeclaration_EnumBody()
  {
    return (EReference)enumDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumBody()
  {
    return enumBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumBody_EnumDeclaration()
  {
    return (EReference)enumBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumBody_EnumDeclarations()
  {
    return (EReference)enumBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumMemberDeclaration()
  {
    return enumMemberDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumMemberDeclaration_Att()
  {
    return (EReference)enumMemberDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumMemberDeclaration_Name()
  {
    return (EReference)enumMemberDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumMemberDeclaration_Exp()
  {
    return (EReference)enumMemberDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceDeclaration()
  {
    return interfaceDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceDeclaration_Name()
  {
    return (EReference)interfaceDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceDeclaration_QIdentifiers()
  {
    return (EReference)interfaceDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceDeclaration_InterBody()
  {
    return (EReference)interfaceDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceBody()
  {
    return interfaceBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceBody_InterfaceMemberDeclarations()
  {
    return (EReference)interfaceBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceMemberDeclaration()
  {
    return interfaceMemberDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceMemberDeclaration_IntermethodDeclaration()
  {
    return (EReference)interfaceMemberDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceMemberDeclaration_InterEventDeclaration()
  {
    return (EReference)interfaceMemberDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceMemberDeclaration_Type1()
  {
    return (EReference)interfaceMemberDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceMemberDeclaration_InterfaceIndexerDecla()
  {
    return (EReference)interfaceMemberDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceMemberDeclaration_InterProperty()
  {
    return (EReference)interfaceMemberDeclarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceIndexerDeclaration()
  {
    return interfaceIndexerDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceIndexerDeclaration_ParameterList()
  {
    return (EReference)interfaceIndexerDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceIndexerDeclaration_InterAccessors()
  {
    return (EReference)interfaceIndexerDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceEventDeclaration()
  {
    return interfaceEventDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceEventDeclaration_Type()
  {
    return (EReference)interfaceEventDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceEventDeclaration_Name()
  {
    return (EReference)interfaceEventDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfacePropertyDeclaration()
  {
    return interfacePropertyDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfacePropertyDeclaration_Name()
  {
    return (EReference)interfacePropertyDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfacePropertyDeclaration_InterAccessor()
  {
    return (EReference)interfacePropertyDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceAccessors()
  {
    return interfaceAccessorsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceAccessors_Att()
  {
    return (EReference)interfaceAccessorsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceAccessors_NewAtt()
  {
    return (EReference)interfaceAccessorsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceAccessors_OtherAtt()
  {
    return (EReference)interfaceAccessorsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceMethodDeclaration()
  {
    return interfaceMethodDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceMethodDeclaration_Type()
  {
    return (EReference)interfaceMethodDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceMethodDeclaration_Name()
  {
    return (EReference)interfaceMethodDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceMethodDeclaration_ParameterList()
  {
    return (EReference)interfaceMethodDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassDeclaration()
  {
    return classDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassDeclaration_ClassModifier()
  {
    return (EAttribute)classDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDeclaration_ClassName()
  {
    return (EReference)classDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDeclaration_ClassBase()
  {
    return (EReference)classDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDeclaration_ClassBody()
  {
    return (EReference)classDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassBody()
  {
    return classBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassBody_ClassAtt()
  {
    return (EReference)classBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassBody_ClassDeclaration()
  {
    return (EReference)classBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassMemberDeclaration()
  {
    return classMemberDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassMemberDeclaration_FieldDeclaration()
  {
    return (EReference)classMemberDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassMemberDeclaration_MethodDeclaration()
  {
    return (EReference)classMemberDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassMemberDeclaration_ConstDeclaration()
  {
    return (EReference)classMemberDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassMemberDeclaration_PropertyDeclaration()
  {
    return (EReference)classMemberDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassMemberDeclaration_EventDeclaration()
  {
    return (EReference)classMemberDeclarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassMemberDeclaration_IndexDeclaration()
  {
    return (EReference)classMemberDeclarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassMemberDeclaration_TypeDeclaration()
  {
    return (EReference)classMemberDeclarationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassMemberDeclaration_OpDeclaration()
  {
    return (EReference)classMemberDeclarationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassMemberDeclaration_ConstructorDeclaration()
  {
    return (EReference)classMemberDeclarationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassMemberDeclaration_DestructorDeclaration()
  {
    return (EReference)classMemberDeclarationEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassMemberDeclaration_StaticDeclaration()
  {
    return (EReference)classMemberDeclarationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStaticConstructorDeclaration()
  {
    return staticConstructorDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStaticConstructorDeclaration_StaticCosntModifier()
  {
    return (EAttribute)staticConstructorDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStaticConstructorDeclaration_Name()
  {
    return (EReference)staticConstructorDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStaticConstructorDeclaration_EmptyBlock()
  {
    return (EReference)staticConstructorDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDestructorDeclaration()
  {
    return destructorDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDestructorDeclaration_Name()
  {
    return (EReference)destructorDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDestructorDeclaration_EmptyBlock()
  {
    return (EReference)destructorDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstructorDeclaration()
  {
    return constructorDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructorDeclaration_ConstModifier()
  {
    return (EAttribute)constructorDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructorDeclaration_ConstrDeclarator()
  {
    return (EReference)constructorDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructorDeclaration_EmptyBlock()
  {
    return (EReference)constructorDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstructorDeclarator()
  {
    return constructorDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructorDeclarator_ClassName()
  {
    return (EReference)constructorDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructorDeclarator_FormalList()
  {
    return (EReference)constructorDeclaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructorDeclarator_ConstInitializer()
  {
    return (EReference)constructorDeclaratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstructorInitializer()
  {
    return constructorInitializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgumentList()
  {
    return argumentListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgumentList_Arg()
  {
    return (EReference)argumentListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgumentList_Args()
  {
    return (EReference)argumentListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgument()
  {
    return argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorDeclaration()
  {
    return operatorDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorDeclaration_OpModifier()
  {
    return (EAttribute)operatorDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperatorDeclaration_OpDeclarator()
  {
    return (EReference)operatorDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperatorDeclaration_EmptyBlock()
  {
    return (EReference)operatorDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorDeclarator()
  {
    return operatorDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperatorDeclarator_Type()
  {
    return (EReference)operatorDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConversionOperatorDeclarator()
  {
    return conversionOperatorDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConversionOperatorDeclarator_FirstType()
  {
    return (EReference)conversionOperatorDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConversionOperatorDeclarator_ConversionName()
  {
    return (EReference)conversionOperatorDeclaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryOperatorDeclarator()
  {
    return binaryOperatorDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryOperatorDeclarator_BinType()
  {
    return (EReference)binaryOperatorDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryOperatorDeclarator_OverBinOperator()
  {
    return (EAttribute)binaryOperatorDeclaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryOperatorDeclarator_OtherName()
  {
    return (EReference)binaryOperatorDeclaratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryOperatorDeclarator_SecondType()
  {
    return (EReference)binaryOperatorDeclaratorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryOperatorDeclarator_SecondName()
  {
    return (EReference)binaryOperatorDeclaratorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryOperatorDeclarator()
  {
    return unaryOperatorDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryOperatorDeclarator_OtherType()
  {
    return (EReference)unaryOperatorDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryOperatorDeclarator_Name()
  {
    return (EReference)unaryOperatorDeclaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexerDeclaration()
  {
    return indexerDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndexerDeclaration_IdModifier()
  {
    return (EAttribute)indexerDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexerDeclaration_IndexerDeclarator()
  {
    return (EReference)indexerDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexerDeclaration_AccDeclaration()
  {
    return (EReference)indexerDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexerDeclarator()
  {
    return indexerDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexerDeclarator_Type()
  {
    return (EReference)indexerDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexerDeclarator_FormalList()
  {
    return (EReference)indexerDeclaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexerDeclarator_QualifiedId()
  {
    return (EReference)indexerDeclaratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventDeclaration()
  {
    return eventDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventAccessorDeclarations()
  {
    return eventAccessorDeclarationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventAccessorDeclarations_Att1()
  {
    return (EReference)eventAccessorDeclarationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventAccessorDeclarations_AddAccessor()
  {
    return (EReference)eventAccessorDeclarationsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventAccessorDeclarations_Att()
  {
    return (EReference)eventAccessorDeclarationsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventAccessorDeclarations_RemovAccessor()
  {
    return (EReference)eventAccessorDeclarationsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemoveAccessorDeclaration()
  {
    return removeAccessorDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddAccessorDeclaration()
  {
    return addAccessorDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyDeclaration()
  {
    return propertyDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccessorDeclarations()
  {
    return accessorDeclarationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessorDeclarations_Att()
  {
    return (EReference)accessorDeclarationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessorDeclarations_GetAcc()
  {
    return (EReference)accessorDeclarationsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessorDeclarations_Att2()
  {
    return (EReference)accessorDeclarationsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessorDeclarations_SetAcc()
  {
    return (EReference)accessorDeclarationsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetAccessorDeclaration()
  {
    return setAccessorDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGetAccessorDeclaration()
  {
    return getAccessorDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodDeclaration()
  {
    return methodDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodDeclaration_MethodHeader()
  {
    return (EReference)methodDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodDeclaration_MaybeEmpty()
  {
    return (EReference)methodDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodHeader()
  {
    return methodHeaderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodHeader_Modifier()
  {
    return (EAttribute)methodHeaderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodHeader_TypeOrVoid()
  {
    return (EReference)methodHeaderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodHeader_QualifiedIdentifier()
  {
    return (EReference)methodHeaderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodHeader_FormalParameters()
  {
    return (EReference)methodHeaderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormalParameterList()
  {
    return formalParameterListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalParameterList_ParameterArray()
  {
    return (EReference)formalParameterListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterArray()
  {
    return parameterArrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterArray_Att()
  {
    return (EReference)parameterArrayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterArray_Array()
  {
    return (EReference)parameterArrayEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterArray_Name()
  {
    return (EReference)parameterArrayEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFixedParameters()
  {
    return fixedParametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFixedParameters_FixParameter()
  {
    return (EReference)fixedParametersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFixedParameters_FixParameters()
  {
    return (EReference)fixedParametersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFixedParameter()
  {
    return fixedParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFixedParameter_Att()
  {
    return (EReference)fixedParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFixedParameter_Type()
  {
    return (EReference)fixedParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFixedParameter_Name()
  {
    return (EReference)fixedParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeOrVoid()
  {
    return typeOrVoidEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeOrVoid_Name()
  {
    return (EReference)typeOrVoidEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeOrVoid_FormalParameters()
  {
    return (EReference)typeOrVoidEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeOrVoid_Type()
  {
    return (EReference)typeOrVoidEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldDeclaration()
  {
    return fieldDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclarator()
  {
    return variableDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclarator_VariableName()
  {
    return (EReference)variableDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclarator_Variable()
  {
    return (EReference)variableDeclaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantDeclaration()
  {
    return constantDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantDeclarator()
  {
    return constantDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantDeclarator_Name()
  {
    return (EReference)constantDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantDeclarator_Exp()
  {
    return (EReference)constantDeclaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassBase()
  {
    return classBaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassBase_QIDs()
  {
    return (EReference)classBaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedIdentifierList()
  {
    return qualifiedIdentifierListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualifiedIdentifierList_Id()
  {
    return (EReference)qualifiedIdentifierListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualifiedIdentifierList_Ids()
  {
    return (EReference)qualifiedIdentifierListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_LabelStat()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_DeclareStat()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_EmbeddedStat()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclarationStatment()
  {
    return declarationStatmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarationStatment_LocalVariableDeclaration()
  {
    return (EReference)declarationStatmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarationStatment_LocalCOnstant()
  {
    return (EReference)declarationStatmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalconstantDeclaration()
  {
    return localconstantDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalconstantDeclaration_Tipo()
  {
    return (EReference)localconstantDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalconstantDeclaration_ConstDeclarator()
  {
    return (EReference)localconstantDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalconstantDeclaration_ConstDeclarators()
  {
    return (EReference)localconstantDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabeledStatement()
  {
    return labeledStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabeledStatement_Id()
  {
    return (EReference)labeledStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabeledStatement_Stat()
  {
    return (EReference)labeledStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmbeddedStatement()
  {
    return embeddedStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmbeddedStatement_MaybeEmpty()
  {
    return (EReference)embeddedStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmbeddedStatement_StatExp()
  {
    return (EReference)embeddedStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmbeddedStatement_SelectionStat()
  {
    return (EReference)embeddedStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmbeddedStatement_IterationStat()
  {
    return (EReference)embeddedStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmbeddedStatement_JumpStat()
  {
    return (EReference)embeddedStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmbeddedStatement_TryStat()
  {
    return (EReference)embeddedStatementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmbeddedStatement_Block()
  {
    return (EReference)embeddedStatementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmbeddedStatement_LockStat()
  {
    return (EReference)embeddedStatementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmbeddedStatement_UsingStat()
  {
    return (EReference)embeddedStatementEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUsingStatement()
  {
    return usingStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsingStatement_ResourcAquisition()
  {
    return (EReference)usingStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsingStatement_EmbeddedStat()
  {
    return (EReference)usingStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceAquisition()
  {
    return resourceAquisitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalVariableDeclaration()
  {
    return localVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalVariableDeclaration_Tipo()
  {
    return (EReference)localVariableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalVariableDeclaration_Variable()
  {
    return (EReference)localVariableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalVariableDeclaration_Variables()
  {
    return (EReference)localVariableDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLockStatement()
  {
    return lockStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLockStatement_Exp()
  {
    return (EReference)lockStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLockStatement_EmbeddedStat()
  {
    return (EReference)lockStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTryStatement()
  {
    return tryStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTryStatement_Block()
  {
    return (EReference)tryStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTryStatement_CatchClauses()
  {
    return (EReference)tryStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTryStatement_Finally()
  {
    return (EReference)tryStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTryStatement_FinallyClause()
  {
    return (EReference)tryStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFinallyClause()
  {
    return finallyClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFinallyClause_Block()
  {
    return (EReference)finallyClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCatchClauses()
  {
    return catchClausesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCatchClauses_SpeciCatchClause()
  {
    return (EReference)catchClausesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCatchClauses_GenCatchClause()
  {
    return (EReference)catchClausesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCatchClauses_SpecCatchClause()
  {
    return (EReference)catchClausesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeneralCatchclause()
  {
    return generalCatchclauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralCatchclause_Block()
  {
    return (EReference)generalCatchclauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpecificCatchClause()
  {
    return specificCatchClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecificCatchClause_ClassType()
  {
    return (EReference)specificCatchClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecificCatchClause_QualiId()
  {
    return (EReference)specificCatchClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecificCatchClause_Id()
  {
    return (EReference)specificCatchClauseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecificCatchClause_Block()
  {
    return (EReference)specificCatchClauseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJumpStatement()
  {
    return jumpStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJumpStatement_BreakStat()
  {
    return (EReference)jumpStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJumpStatement_ContinueStat()
  {
    return (EReference)jumpStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJumpStatement_GotoStat()
  {
    return (EReference)jumpStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJumpStatement_ReturnStat()
  {
    return (EReference)jumpStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJumpStatement_ThrowStat()
  {
    return (EReference)jumpStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getThrowStatement()
  {
    return throwStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThrowStatement_Expression()
  {
    return (EReference)throwStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturnStatement()
  {
    return returnStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReturnStatement_Expression()
  {
    return (EReference)returnStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGotoStatement()
  {
    return gotoStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGotoStatement_Id()
  {
    return (EReference)gotoStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGotoStatement_Expression()
  {
    return (EReference)gotoStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContinueStatement()
  {
    return continueStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBreakStatement()
  {
    return breakStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIterationStatement()
  {
    return iterationStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIterationStatement_WhileStatement()
  {
    return (EReference)iterationStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIterationStatement_DoStatement()
  {
    return (EReference)iterationStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIterationStatement_ForStatement()
  {
    return (EReference)iterationStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIterationStatement_ForeachStatement()
  {
    return (EReference)iterationStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForeachStatement()
  {
    return foreachStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForeachStatement_Tipo()
  {
    return (EReference)foreachStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForeachStatement_Id()
  {
    return (EReference)foreachStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForeachStatement_Expression()
  {
    return (EReference)foreachStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForeachStatement_EmbeddedStatement()
  {
    return (EReference)foreachStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForStatement()
  {
    return forStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_ForInitializer()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Expression()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_StatementExpressionList()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_EmbeddedStatement()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForInitializer()
  {
    return forInitializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForInitializer_LocalVariableDeclaration()
  {
    return (EReference)forInitializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForInitializer_StatementExpressionList()
  {
    return (EReference)forInitializerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatementExpressionList()
  {
    return statementExpressionListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementExpressionList_List()
  {
    return (EReference)statementExpressionListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementExpressionList_Lists()
  {
    return (EReference)statementExpressionListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatementExpression()
  {
    return statementExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementExpression_Tipo()
  {
    return (EReference)statementExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementExpression_ArgumentList()
  {
    return (EReference)statementExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementExpression_PrimaryExpression()
  {
    return (EReference)statementExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatementExpression_IncrimentDecrement()
  {
    return (EAttribute)statementExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementExpression_UnaryExpression()
  {
    return (EReference)statementExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatementExpression_AssignementOperator()
  {
    return (EAttribute)statementExpressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementExpression_Expression()
  {
    return (EReference)statementExpressionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoStatement()
  {
    return doStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoStatement_EmbeddedStatement()
  {
    return (EReference)doStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoStatement_Expression()
  {
    return (EReference)doStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhileStatement()
  {
    return whileStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileStatement_Expression()
  {
    return (EReference)whileStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileStatement_EmbeddedStatement()
  {
    return (EReference)whileStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectionStatement()
  {
    return selectionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionStatement_IfStatement()
  {
    return (EReference)selectionStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionStatement_SwitchStatement()
  {
    return (EReference)selectionStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitchStatement()
  {
    return switchStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchStatement_Expression()
  {
    return (EReference)switchStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchStatement_SwitchSection()
  {
    return (EReference)switchStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitchSection()
  {
    return switchSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchSection_Switchlabel()
  {
    return (EReference)switchSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchSection_Statement()
  {
    return (EReference)switchSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitchLabel()
  {
    return switchLabelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchLabel_Expression()
  {
    return (EReference)switchLabelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfStatement()
  {
    return ifStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_Expression()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_EmbeddedStatement()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_ElsePart()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElsePart()
  {
    return elsePartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElsePart_EmbeddedStatement()
  {
    return (EReference)elsePartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_Statement()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaybeEmptyBlock()
  {
    return maybeEmptyBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSByte()
  {
    return sByteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getByte()
  {
    return byteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShort()
  {
    return shortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUShort()
  {
    return uShortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInt()
  {
    return intEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUInt()
  {
    return uIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLong()
  {
    return longEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getULong()
  {
    return uLongEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChar()
  {
    return charEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBool()
  {
    return boolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecimal()
  {
    return decimalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloat()
  {
    return floatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDouble()
  {
    return doubleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObject()
  {
    return objectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getString()
  {
    return stringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVoid()
  {
    return voidEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSharpFactory getCSharpFactory()
  {
    return (CSharpFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    compilationUnitEClass = createEClass(COMPILATION_UNIT);
    createEReference(compilationUnitEClass, COMPILATION_UNIT__USING_DIRECTIVES);
    createEReference(compilationUnitEClass, COMPILATION_UNIT__GLOBAL_ATT);
    createEReference(compilationUnitEClass, COMPILATION_UNIT__NAME_SPACES);

    identifierEClass = createEClass(IDENTIFIER);

    usingDirectiveEClass = createEClass(USING_DIRECTIVE);
    createEReference(usingDirectiveEClass, USING_DIRECTIVE__NAME);
    createEReference(usingDirectiveEClass, USING_DIRECTIVE__USINGS);

    arrayTypeEClass = createEClass(ARRAY_TYPE);

    globalAttributesEClass = createEClass(GLOBAL_ATTRIBUTES);
    createEReference(globalAttributesEClass, GLOBAL_ATTRIBUTES__GLOBAL_ATT_SECTIONS);

    globalAttributeSectionEClass = createEClass(GLOBAL_ATTRIBUTE_SECTION);
    createEReference(globalAttributeSectionEClass, GLOBAL_ATTRIBUTE_SECTION__ATTRIBUTES);

    attributesEClass = createEClass(ATTRIBUTES);
    createEReference(attributesEClass, ATTRIBUTES__ATTRIBUTES);

    attributeSectionEClass = createEClass(ATTRIBUTE_SECTION);

    attributeListEClass = createEClass(ATTRIBUTE_LIST);
    createEReference(attributeListEClass, ATTRIBUTE_LIST__ATTRIBUTE);
    createEReference(attributeListEClass, ATTRIBUTE_LIST__ATTRIBUTES);

    attributeEClass = createEClass(ATTRIBUTE);
    createEReference(attributeEClass, ATTRIBUTE__NAME);
    createEReference(attributeEClass, ATTRIBUTE__ATT_ARGUMENTS);

    attributeArgumentsEClass = createEClass(ATTRIBUTE_ARGUMENTS);
    createEReference(attributeArgumentsEClass, ATTRIBUTE_ARGUMENTS__EXPRESION_LIST);

    expressionListEClass = createEClass(EXPRESSION_LIST);
    createEReference(expressionListEClass, EXPRESSION_LIST__EXPRESSION);
    createEReference(expressionListEClass, EXPRESSION_LIST__EXPRESSIONS);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__UNARY);
    createEReference(expressionEClass, EXPRESSION__EXP);
    createEReference(expressionEClass, EXPRESSION__EXP2);

    expression2EClass = createEClass(EXPRESSION2);
    createEReference(expression2EClass, EXPRESSION2__INTER_EXP);
    createEReference(expression2EClass, EXPRESSION2__INTER_EXP2);
    createEReference(expression2EClass, EXPRESSION2__PIPELINE_EXP);
    createEReference(expression2EClass, EXPRESSION2__PIPELINE_EXP2);
    createEReference(expression2EClass, EXPRESSION2__IN_EXP);
    createEReference(expression2EClass, EXPRESSION2__IN_EXP2);
    createEReference(expression2EClass, EXPRESSION2__BAR_EXP);
    createEReference(expression2EClass, EXPRESSION2__BAR_EXP2);
    createEReference(expression2EClass, EXPRESSION2__EXP);
    createEReference(expression2EClass, EXPRESSION2__EXP2);
    createEReference(expression2EClass, EXPRESSION2__AMP_EXP);
    createEReference(expression2EClass, EXPRESSION2__AMP_EXP2);
    createEReference(expression2EClass, EXPRESSION2__EQUALITY_EXP);
    createEReference(expression2EClass, EXPRESSION2__EQUALITY_EXP2);
    createEReference(expression2EClass, EXPRESSION2__RELOP_EXP);
    createEReference(expression2EClass, EXPRESSION2__RELOP_EXP2);
    createEReference(expression2EClass, EXPRESSION2__BUILD_IN_TYPE);
    createEReference(expression2EClass, EXPRESSION2__SHIFT_EXP);
    createEReference(expression2EClass, EXPRESSION2__SHIFT_EXP2);
    createEReference(expression2EClass, EXPRESSION2__OPERATOR_EXP);
    createEReference(expression2EClass, EXPRESSION2__OPERATOR_EXP2);
    createEReference(expression2EClass, EXPRESSION2__MULTIP_EXP);
    createEReference(expression2EClass, EXPRESSION2__MULTIP_EXP2);
    createEReference(expression2EClass, EXPRESSION2__DIV_EXP);
    createEReference(expression2EClass, EXPRESSION2__DIV_EXP2);
    createEReference(expression2EClass, EXPRESSION2__MOD_EXP);
    createEReference(expression2EClass, EXPRESSION2__MOD_EXP2);

    unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
    createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__EXP_UNARY_OPERATOR);
    createEReference(unaryExpressionEClass, UNARY_EXPRESSION__TYPE);
    createEReference(unaryExpressionEClass, UNARY_EXPRESSION__UNARY_EXP);
    createEReference(unaryExpressionEClass, UNARY_EXPRESSION__PRIMARY_EXP);

    primaryExpressionEClass = createEClass(PRIMARY_EXPRESSION);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__NON_ARRAY_TYPE);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__EXPRESSION_LIST);
    createEAttribute(primaryExpressionEClass, PRIMARY_EXPRESSION__RANK_SPECIFIER);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__ARRAY_INITIALIZER);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__ARRAY_TYPE);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__ARRAY_INITIALIZER2);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__TIPO);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__ARGUMENT_LIST);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__ID);
    createEAttribute(primaryExpressionEClass, PRIMARY_EXPRESSION__LITERAL);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__EXPRESSION);
    createEAttribute(primaryExpressionEClass, PRIMARY_EXPRESSION__PREDEFINED_TYPE);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__TYPE_OR_VOID);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__PRIMARY_EXORESSION2);

    primaryExpression2EClass = createEClass(PRIMARY_EXPRESSION2);
    createEReference(primaryExpression2EClass, PRIMARY_EXPRESSION2__ID);
    createEReference(primaryExpression2EClass, PRIMARY_EXPRESSION2__ARGUMENT_LIST);
    createEReference(primaryExpression2EClass, PRIMARY_EXPRESSION2__EXPRESSION_LIST);
    createEAttribute(primaryExpression2EClass, PRIMARY_EXPRESSION2__INCREMENTE_DECREMENT);
    createEReference(primaryExpression2EClass, PRIMARY_EXPRESSION2__PRIMARY_EXPRESSION2);

    arrayInitializerEClass = createEClass(ARRAY_INITIALIZER);
    createEReference(arrayInitializerEClass, ARRAY_INITIALIZER__VARIABLE_INITALIZER);
    createEReference(arrayInitializerEClass, ARRAY_INITIALIZER__VARIABLE_INITALIZERS);

    variableInitializerEClass = createEClass(VARIABLE_INITIALIZER);

    attributeNameEClass = createEClass(ATTRIBUTE_NAME);
    createEReference(attributeNameEClass, ATTRIBUTE_NAME__QUALIFIED_ID);

    typeEClass = createEClass(TYPE);
    createEReference(typeEClass, TYPE__NON_ARRAY);
    createEReference(typeEClass, TYPE__VARIABLE_DECLARATOR);
    createEReference(typeEClass, TYPE__VARIABLE_DECLARATORS);
    createEReference(typeEClass, TYPE__QIDENT);
    createEReference(typeEClass, TYPE__EVENT_ACCESSOR_DECLARATIONS);
    createEReference(typeEClass, TYPE__QUALIFIED_ID);
    createEReference(typeEClass, TYPE__ACC_DECLARATE);
    createEReference(typeEClass, TYPE__VARIABLE);
    createEReference(typeEClass, TYPE__VARIABLES);
    createEReference(typeEClass, TYPE__CONST_DECLARATOR);
    createEReference(typeEClass, TYPE__CONST_DECLARATORS);

    integralTypeEClass = createEClass(INTEGRAL_TYPE);

    nonArrayTypeEClass = createEClass(NON_ARRAY_TYPE);
    createEReference(nonArrayTypeEClass, NON_ARRAY_TYPE__BUILT_TYPE);
    createEReference(nonArrayTypeEClass, NON_ARRAY_TYPE__QUALIFIED);

    builtInTypeEClass = createEClass(BUILT_IN_TYPE);

    builtInClassTypeEClass = createEClass(BUILT_IN_CLASS_TYPE);
    createEReference(builtInClassTypeEClass, BUILT_IN_CLASS_TYPE__QID2);

    qualifiedIdentifierEClass = createEClass(QUALIFIED_IDENTIFIER);
    createEReference(qualifiedIdentifierEClass, QUALIFIED_IDENTIFIER__ID);
    createEReference(qualifiedIdentifierEClass, QUALIFIED_IDENTIFIER__IDS);

    namespaceMemberDeclarationEClass = createEClass(NAMESPACE_MEMBER_DECLARATION);
    createEReference(namespaceMemberDeclarationEClass, NAMESPACE_MEMBER_DECLARATION__NAME_DECLARETION);
    createEReference(namespaceMemberDeclarationEClass, NAMESPACE_MEMBER_DECLARATION__TYPE_DECLARATION);

    namespaceDeclarationEClass = createEClass(NAMESPACE_DECLARATION);
    createEReference(namespaceDeclarationEClass, NAMESPACE_DECLARATION__QID);
    createEReference(namespaceDeclarationEClass, NAMESPACE_DECLARATION__NAME_BODY);

    namespaceBodyEClass = createEClass(NAMESPACE_BODY);
    createEReference(namespaceBodyEClass, NAMESPACE_BODY__USING_DIRECTIVES);
    createEReference(namespaceBodyEClass, NAMESPACE_BODY__NAME_SPACES);

    typeDeclarationEClass = createEClass(TYPE_DECLARATION);
    createEReference(typeDeclarationEClass, TYPE_DECLARATION__CLASS_DECLARATION);
    createEReference(typeDeclarationEClass, TYPE_DECLARATION__INTERFACE_DECLARATION);
    createEReference(typeDeclarationEClass, TYPE_DECLARATION__ENUM_DECLARATION);
    createEReference(typeDeclarationEClass, TYPE_DECLARATION__DELEGATE_DECLARATION);

    delegateDeclarationEClass = createEClass(DELEGATE_DECLARATION);

    enumDeclarationEClass = createEClass(ENUM_DECLARATION);
    createEReference(enumDeclarationEClass, ENUM_DECLARATION__NAME);
    createEReference(enumDeclarationEClass, ENUM_DECLARATION__INT_TYPE);
    createEReference(enumDeclarationEClass, ENUM_DECLARATION__ENUM_BODY);

    enumBodyEClass = createEClass(ENUM_BODY);
    createEReference(enumBodyEClass, ENUM_BODY__ENUM_DECLARATION);
    createEReference(enumBodyEClass, ENUM_BODY__ENUM_DECLARATIONS);

    enumMemberDeclarationEClass = createEClass(ENUM_MEMBER_DECLARATION);
    createEReference(enumMemberDeclarationEClass, ENUM_MEMBER_DECLARATION__ATT);
    createEReference(enumMemberDeclarationEClass, ENUM_MEMBER_DECLARATION__NAME);
    createEReference(enumMemberDeclarationEClass, ENUM_MEMBER_DECLARATION__EXP);

    interfaceDeclarationEClass = createEClass(INTERFACE_DECLARATION);
    createEReference(interfaceDeclarationEClass, INTERFACE_DECLARATION__NAME);
    createEReference(interfaceDeclarationEClass, INTERFACE_DECLARATION__QIDENTIFIERS);
    createEReference(interfaceDeclarationEClass, INTERFACE_DECLARATION__INTER_BODY);

    interfaceBodyEClass = createEClass(INTERFACE_BODY);
    createEReference(interfaceBodyEClass, INTERFACE_BODY__INTERFACE_MEMBER_DECLARATIONS);

    interfaceMemberDeclarationEClass = createEClass(INTERFACE_MEMBER_DECLARATION);
    createEReference(interfaceMemberDeclarationEClass, INTERFACE_MEMBER_DECLARATION__INTERMETHOD_DECLARATION);
    createEReference(interfaceMemberDeclarationEClass, INTERFACE_MEMBER_DECLARATION__INTER_EVENT_DECLARATION);
    createEReference(interfaceMemberDeclarationEClass, INTERFACE_MEMBER_DECLARATION__TYPE1);
    createEReference(interfaceMemberDeclarationEClass, INTERFACE_MEMBER_DECLARATION__INTERFACE_INDEXER_DECLA);
    createEReference(interfaceMemberDeclarationEClass, INTERFACE_MEMBER_DECLARATION__INTER_PROPERTY);

    interfaceIndexerDeclarationEClass = createEClass(INTERFACE_INDEXER_DECLARATION);
    createEReference(interfaceIndexerDeclarationEClass, INTERFACE_INDEXER_DECLARATION__PARAMETER_LIST);
    createEReference(interfaceIndexerDeclarationEClass, INTERFACE_INDEXER_DECLARATION__INTER_ACCESSORS);

    interfaceEventDeclarationEClass = createEClass(INTERFACE_EVENT_DECLARATION);
    createEReference(interfaceEventDeclarationEClass, INTERFACE_EVENT_DECLARATION__TYPE);
    createEReference(interfaceEventDeclarationEClass, INTERFACE_EVENT_DECLARATION__NAME);

    interfacePropertyDeclarationEClass = createEClass(INTERFACE_PROPERTY_DECLARATION);
    createEReference(interfacePropertyDeclarationEClass, INTERFACE_PROPERTY_DECLARATION__NAME);
    createEReference(interfacePropertyDeclarationEClass, INTERFACE_PROPERTY_DECLARATION__INTER_ACCESSOR);

    interfaceAccessorsEClass = createEClass(INTERFACE_ACCESSORS);
    createEReference(interfaceAccessorsEClass, INTERFACE_ACCESSORS__ATT);
    createEReference(interfaceAccessorsEClass, INTERFACE_ACCESSORS__NEW_ATT);
    createEReference(interfaceAccessorsEClass, INTERFACE_ACCESSORS__OTHER_ATT);

    interfaceMethodDeclarationEClass = createEClass(INTERFACE_METHOD_DECLARATION);
    createEReference(interfaceMethodDeclarationEClass, INTERFACE_METHOD_DECLARATION__TYPE);
    createEReference(interfaceMethodDeclarationEClass, INTERFACE_METHOD_DECLARATION__NAME);
    createEReference(interfaceMethodDeclarationEClass, INTERFACE_METHOD_DECLARATION__PARAMETER_LIST);

    classDeclarationEClass = createEClass(CLASS_DECLARATION);
    createEAttribute(classDeclarationEClass, CLASS_DECLARATION__CLASS_MODIFIER);
    createEReference(classDeclarationEClass, CLASS_DECLARATION__CLASS_NAME);
    createEReference(classDeclarationEClass, CLASS_DECLARATION__CLASS_BASE);
    createEReference(classDeclarationEClass, CLASS_DECLARATION__CLASS_BODY);

    classBodyEClass = createEClass(CLASS_BODY);
    createEReference(classBodyEClass, CLASS_BODY__CLASS_ATT);
    createEReference(classBodyEClass, CLASS_BODY__CLASS_DECLARATION);

    classMemberDeclarationEClass = createEClass(CLASS_MEMBER_DECLARATION);
    createEReference(classMemberDeclarationEClass, CLASS_MEMBER_DECLARATION__FIELD_DECLARATION);
    createEReference(classMemberDeclarationEClass, CLASS_MEMBER_DECLARATION__METHOD_DECLARATION);
    createEReference(classMemberDeclarationEClass, CLASS_MEMBER_DECLARATION__CONST_DECLARATION);
    createEReference(classMemberDeclarationEClass, CLASS_MEMBER_DECLARATION__PROPERTY_DECLARATION);
    createEReference(classMemberDeclarationEClass, CLASS_MEMBER_DECLARATION__EVENT_DECLARATION);
    createEReference(classMemberDeclarationEClass, CLASS_MEMBER_DECLARATION__INDEX_DECLARATION);
    createEReference(classMemberDeclarationEClass, CLASS_MEMBER_DECLARATION__TYPE_DECLARATION);
    createEReference(classMemberDeclarationEClass, CLASS_MEMBER_DECLARATION__OP_DECLARATION);
    createEReference(classMemberDeclarationEClass, CLASS_MEMBER_DECLARATION__CONSTRUCTOR_DECLARATION);
    createEReference(classMemberDeclarationEClass, CLASS_MEMBER_DECLARATION__DESTRUCTOR_DECLARATION);
    createEReference(classMemberDeclarationEClass, CLASS_MEMBER_DECLARATION__STATIC_DECLARATION);

    staticConstructorDeclarationEClass = createEClass(STATIC_CONSTRUCTOR_DECLARATION);
    createEAttribute(staticConstructorDeclarationEClass, STATIC_CONSTRUCTOR_DECLARATION__STATIC_COSNT_MODIFIER);
    createEReference(staticConstructorDeclarationEClass, STATIC_CONSTRUCTOR_DECLARATION__NAME);
    createEReference(staticConstructorDeclarationEClass, STATIC_CONSTRUCTOR_DECLARATION__EMPTY_BLOCK);

    destructorDeclarationEClass = createEClass(DESTRUCTOR_DECLARATION);
    createEReference(destructorDeclarationEClass, DESTRUCTOR_DECLARATION__NAME);
    createEReference(destructorDeclarationEClass, DESTRUCTOR_DECLARATION__EMPTY_BLOCK);

    constructorDeclarationEClass = createEClass(CONSTRUCTOR_DECLARATION);
    createEAttribute(constructorDeclarationEClass, CONSTRUCTOR_DECLARATION__CONST_MODIFIER);
    createEReference(constructorDeclarationEClass, CONSTRUCTOR_DECLARATION__CONSTR_DECLARATOR);
    createEReference(constructorDeclarationEClass, CONSTRUCTOR_DECLARATION__EMPTY_BLOCK);

    constructorDeclaratorEClass = createEClass(CONSTRUCTOR_DECLARATOR);
    createEReference(constructorDeclaratorEClass, CONSTRUCTOR_DECLARATOR__CLASS_NAME);
    createEReference(constructorDeclaratorEClass, CONSTRUCTOR_DECLARATOR__FORMAL_LIST);
    createEReference(constructorDeclaratorEClass, CONSTRUCTOR_DECLARATOR__CONST_INITIALIZER);

    constructorInitializerEClass = createEClass(CONSTRUCTOR_INITIALIZER);

    argumentListEClass = createEClass(ARGUMENT_LIST);
    createEReference(argumentListEClass, ARGUMENT_LIST__ARG);
    createEReference(argumentListEClass, ARGUMENT_LIST__ARGS);

    argumentEClass = createEClass(ARGUMENT);

    operatorDeclarationEClass = createEClass(OPERATOR_DECLARATION);
    createEAttribute(operatorDeclarationEClass, OPERATOR_DECLARATION__OP_MODIFIER);
    createEReference(operatorDeclarationEClass, OPERATOR_DECLARATION__OP_DECLARATOR);
    createEReference(operatorDeclarationEClass, OPERATOR_DECLARATION__EMPTY_BLOCK);

    operatorDeclaratorEClass = createEClass(OPERATOR_DECLARATOR);
    createEReference(operatorDeclaratorEClass, OPERATOR_DECLARATOR__TYPE);

    conversionOperatorDeclaratorEClass = createEClass(CONVERSION_OPERATOR_DECLARATOR);
    createEReference(conversionOperatorDeclaratorEClass, CONVERSION_OPERATOR_DECLARATOR__FIRST_TYPE);
    createEReference(conversionOperatorDeclaratorEClass, CONVERSION_OPERATOR_DECLARATOR__CONVERSION_NAME);

    binaryOperatorDeclaratorEClass = createEClass(BINARY_OPERATOR_DECLARATOR);
    createEReference(binaryOperatorDeclaratorEClass, BINARY_OPERATOR_DECLARATOR__BIN_TYPE);
    createEAttribute(binaryOperatorDeclaratorEClass, BINARY_OPERATOR_DECLARATOR__OVER_BIN_OPERATOR);
    createEReference(binaryOperatorDeclaratorEClass, BINARY_OPERATOR_DECLARATOR__OTHER_NAME);
    createEReference(binaryOperatorDeclaratorEClass, BINARY_OPERATOR_DECLARATOR__SECOND_TYPE);
    createEReference(binaryOperatorDeclaratorEClass, BINARY_OPERATOR_DECLARATOR__SECOND_NAME);

    unaryOperatorDeclaratorEClass = createEClass(UNARY_OPERATOR_DECLARATOR);
    createEReference(unaryOperatorDeclaratorEClass, UNARY_OPERATOR_DECLARATOR__OTHER_TYPE);
    createEReference(unaryOperatorDeclaratorEClass, UNARY_OPERATOR_DECLARATOR__NAME);

    indexerDeclarationEClass = createEClass(INDEXER_DECLARATION);
    createEAttribute(indexerDeclarationEClass, INDEXER_DECLARATION__ID_MODIFIER);
    createEReference(indexerDeclarationEClass, INDEXER_DECLARATION__INDEXER_DECLARATOR);
    createEReference(indexerDeclarationEClass, INDEXER_DECLARATION__ACC_DECLARATION);

    indexerDeclaratorEClass = createEClass(INDEXER_DECLARATOR);
    createEReference(indexerDeclaratorEClass, INDEXER_DECLARATOR__TYPE);
    createEReference(indexerDeclaratorEClass, INDEXER_DECLARATOR__FORMAL_LIST);
    createEReference(indexerDeclaratorEClass, INDEXER_DECLARATOR__QUALIFIED_ID);

    eventDeclarationEClass = createEClass(EVENT_DECLARATION);

    eventAccessorDeclarationsEClass = createEClass(EVENT_ACCESSOR_DECLARATIONS);
    createEReference(eventAccessorDeclarationsEClass, EVENT_ACCESSOR_DECLARATIONS__ATT1);
    createEReference(eventAccessorDeclarationsEClass, EVENT_ACCESSOR_DECLARATIONS__ADD_ACCESSOR);
    createEReference(eventAccessorDeclarationsEClass, EVENT_ACCESSOR_DECLARATIONS__ATT);
    createEReference(eventAccessorDeclarationsEClass, EVENT_ACCESSOR_DECLARATIONS__REMOV_ACCESSOR);

    removeAccessorDeclarationEClass = createEClass(REMOVE_ACCESSOR_DECLARATION);

    addAccessorDeclarationEClass = createEClass(ADD_ACCESSOR_DECLARATION);

    propertyDeclarationEClass = createEClass(PROPERTY_DECLARATION);

    accessorDeclarationsEClass = createEClass(ACCESSOR_DECLARATIONS);
    createEReference(accessorDeclarationsEClass, ACCESSOR_DECLARATIONS__ATT);
    createEReference(accessorDeclarationsEClass, ACCESSOR_DECLARATIONS__GET_ACC);
    createEReference(accessorDeclarationsEClass, ACCESSOR_DECLARATIONS__ATT2);
    createEReference(accessorDeclarationsEClass, ACCESSOR_DECLARATIONS__SET_ACC);

    setAccessorDeclarationEClass = createEClass(SET_ACCESSOR_DECLARATION);

    getAccessorDeclarationEClass = createEClass(GET_ACCESSOR_DECLARATION);

    methodDeclarationEClass = createEClass(METHOD_DECLARATION);
    createEReference(methodDeclarationEClass, METHOD_DECLARATION__METHOD_HEADER);
    createEReference(methodDeclarationEClass, METHOD_DECLARATION__MAYBE_EMPTY);

    methodHeaderEClass = createEClass(METHOD_HEADER);
    createEAttribute(methodHeaderEClass, METHOD_HEADER__MODIFIER);
    createEReference(methodHeaderEClass, METHOD_HEADER__TYPE_OR_VOID);
    createEReference(methodHeaderEClass, METHOD_HEADER__QUALIFIED_IDENTIFIER);
    createEReference(methodHeaderEClass, METHOD_HEADER__FORMAL_PARAMETERS);

    formalParameterListEClass = createEClass(FORMAL_PARAMETER_LIST);
    createEReference(formalParameterListEClass, FORMAL_PARAMETER_LIST__PARAMETER_ARRAY);

    parameterArrayEClass = createEClass(PARAMETER_ARRAY);
    createEReference(parameterArrayEClass, PARAMETER_ARRAY__ATT);
    createEReference(parameterArrayEClass, PARAMETER_ARRAY__ARRAY);
    createEReference(parameterArrayEClass, PARAMETER_ARRAY__NAME);

    fixedParametersEClass = createEClass(FIXED_PARAMETERS);
    createEReference(fixedParametersEClass, FIXED_PARAMETERS__FIX_PARAMETER);
    createEReference(fixedParametersEClass, FIXED_PARAMETERS__FIX_PARAMETERS);

    fixedParameterEClass = createEClass(FIXED_PARAMETER);
    createEReference(fixedParameterEClass, FIXED_PARAMETER__ATT);
    createEReference(fixedParameterEClass, FIXED_PARAMETER__TYPE);
    createEReference(fixedParameterEClass, FIXED_PARAMETER__NAME);

    typeOrVoidEClass = createEClass(TYPE_OR_VOID);
    createEReference(typeOrVoidEClass, TYPE_OR_VOID__NAME);
    createEReference(typeOrVoidEClass, TYPE_OR_VOID__FORMAL_PARAMETERS);
    createEReference(typeOrVoidEClass, TYPE_OR_VOID__TYPE);

    fieldDeclarationEClass = createEClass(FIELD_DECLARATION);

    variableDeclaratorEClass = createEClass(VARIABLE_DECLARATOR);
    createEReference(variableDeclaratorEClass, VARIABLE_DECLARATOR__VARIABLE_NAME);
    createEReference(variableDeclaratorEClass, VARIABLE_DECLARATOR__VARIABLE);

    constantDeclarationEClass = createEClass(CONSTANT_DECLARATION);

    constantDeclaratorEClass = createEClass(CONSTANT_DECLARATOR);
    createEReference(constantDeclaratorEClass, CONSTANT_DECLARATOR__NAME);
    createEReference(constantDeclaratorEClass, CONSTANT_DECLARATOR__EXP);

    classBaseEClass = createEClass(CLASS_BASE);
    createEReference(classBaseEClass, CLASS_BASE__QI_DS);

    qualifiedIdentifierListEClass = createEClass(QUALIFIED_IDENTIFIER_LIST);
    createEReference(qualifiedIdentifierListEClass, QUALIFIED_IDENTIFIER_LIST__ID);
    createEReference(qualifiedIdentifierListEClass, QUALIFIED_IDENTIFIER_LIST__IDS);

    statementEClass = createEClass(STATEMENT);
    createEReference(statementEClass, STATEMENT__LABEL_STAT);
    createEReference(statementEClass, STATEMENT__DECLARE_STAT);
    createEReference(statementEClass, STATEMENT__EMBEDDED_STAT);

    declarationStatmentEClass = createEClass(DECLARATION_STATMENT);
    createEReference(declarationStatmentEClass, DECLARATION_STATMENT__LOCAL_VARIABLE_DECLARATION);
    createEReference(declarationStatmentEClass, DECLARATION_STATMENT__LOCAL_CONSTANT);

    localconstantDeclarationEClass = createEClass(LOCALCONSTANT_DECLARATION);
    createEReference(localconstantDeclarationEClass, LOCALCONSTANT_DECLARATION__TIPO);
    createEReference(localconstantDeclarationEClass, LOCALCONSTANT_DECLARATION__CONST_DECLARATOR);
    createEReference(localconstantDeclarationEClass, LOCALCONSTANT_DECLARATION__CONST_DECLARATORS);

    labeledStatementEClass = createEClass(LABELED_STATEMENT);
    createEReference(labeledStatementEClass, LABELED_STATEMENT__ID);
    createEReference(labeledStatementEClass, LABELED_STATEMENT__STAT);

    embeddedStatementEClass = createEClass(EMBEDDED_STATEMENT);
    createEReference(embeddedStatementEClass, EMBEDDED_STATEMENT__MAYBE_EMPTY);
    createEReference(embeddedStatementEClass, EMBEDDED_STATEMENT__STAT_EXP);
    createEReference(embeddedStatementEClass, EMBEDDED_STATEMENT__SELECTION_STAT);
    createEReference(embeddedStatementEClass, EMBEDDED_STATEMENT__ITERATION_STAT);
    createEReference(embeddedStatementEClass, EMBEDDED_STATEMENT__JUMP_STAT);
    createEReference(embeddedStatementEClass, EMBEDDED_STATEMENT__TRY_STAT);
    createEReference(embeddedStatementEClass, EMBEDDED_STATEMENT__BLOCK);
    createEReference(embeddedStatementEClass, EMBEDDED_STATEMENT__LOCK_STAT);
    createEReference(embeddedStatementEClass, EMBEDDED_STATEMENT__USING_STAT);

    usingStatementEClass = createEClass(USING_STATEMENT);
    createEReference(usingStatementEClass, USING_STATEMENT__RESOURC_AQUISITION);
    createEReference(usingStatementEClass, USING_STATEMENT__EMBEDDED_STAT);

    resourceAquisitionEClass = createEClass(RESOURCE_AQUISITION);

    localVariableDeclarationEClass = createEClass(LOCAL_VARIABLE_DECLARATION);
    createEReference(localVariableDeclarationEClass, LOCAL_VARIABLE_DECLARATION__TIPO);
    createEReference(localVariableDeclarationEClass, LOCAL_VARIABLE_DECLARATION__VARIABLE);
    createEReference(localVariableDeclarationEClass, LOCAL_VARIABLE_DECLARATION__VARIABLES);

    lockStatementEClass = createEClass(LOCK_STATEMENT);
    createEReference(lockStatementEClass, LOCK_STATEMENT__EXP);
    createEReference(lockStatementEClass, LOCK_STATEMENT__EMBEDDED_STAT);

    tryStatementEClass = createEClass(TRY_STATEMENT);
    createEReference(tryStatementEClass, TRY_STATEMENT__BLOCK);
    createEReference(tryStatementEClass, TRY_STATEMENT__CATCH_CLAUSES);
    createEReference(tryStatementEClass, TRY_STATEMENT__FINALLY);
    createEReference(tryStatementEClass, TRY_STATEMENT__FINALLY_CLAUSE);

    finallyClauseEClass = createEClass(FINALLY_CLAUSE);
    createEReference(finallyClauseEClass, FINALLY_CLAUSE__BLOCK);

    catchClausesEClass = createEClass(CATCH_CLAUSES);
    createEReference(catchClausesEClass, CATCH_CLAUSES__SPECI_CATCH_CLAUSE);
    createEReference(catchClausesEClass, CATCH_CLAUSES__GEN_CATCH_CLAUSE);
    createEReference(catchClausesEClass, CATCH_CLAUSES__SPEC_CATCH_CLAUSE);

    generalCatchclauseEClass = createEClass(GENERAL_CATCHCLAUSE);
    createEReference(generalCatchclauseEClass, GENERAL_CATCHCLAUSE__BLOCK);

    specificCatchClauseEClass = createEClass(SPECIFIC_CATCH_CLAUSE);
    createEReference(specificCatchClauseEClass, SPECIFIC_CATCH_CLAUSE__CLASS_TYPE);
    createEReference(specificCatchClauseEClass, SPECIFIC_CATCH_CLAUSE__QUALI_ID);
    createEReference(specificCatchClauseEClass, SPECIFIC_CATCH_CLAUSE__ID);
    createEReference(specificCatchClauseEClass, SPECIFIC_CATCH_CLAUSE__BLOCK);

    jumpStatementEClass = createEClass(JUMP_STATEMENT);
    createEReference(jumpStatementEClass, JUMP_STATEMENT__BREAK_STAT);
    createEReference(jumpStatementEClass, JUMP_STATEMENT__CONTINUE_STAT);
    createEReference(jumpStatementEClass, JUMP_STATEMENT__GOTO_STAT);
    createEReference(jumpStatementEClass, JUMP_STATEMENT__RETURN_STAT);
    createEReference(jumpStatementEClass, JUMP_STATEMENT__THROW_STAT);

    throwStatementEClass = createEClass(THROW_STATEMENT);
    createEReference(throwStatementEClass, THROW_STATEMENT__EXPRESSION);

    returnStatementEClass = createEClass(RETURN_STATEMENT);
    createEReference(returnStatementEClass, RETURN_STATEMENT__EXPRESSION);

    gotoStatementEClass = createEClass(GOTO_STATEMENT);
    createEReference(gotoStatementEClass, GOTO_STATEMENT__ID);
    createEReference(gotoStatementEClass, GOTO_STATEMENT__EXPRESSION);

    continueStatementEClass = createEClass(CONTINUE_STATEMENT);

    breakStatementEClass = createEClass(BREAK_STATEMENT);

    iterationStatementEClass = createEClass(ITERATION_STATEMENT);
    createEReference(iterationStatementEClass, ITERATION_STATEMENT__WHILE_STATEMENT);
    createEReference(iterationStatementEClass, ITERATION_STATEMENT__DO_STATEMENT);
    createEReference(iterationStatementEClass, ITERATION_STATEMENT__FOR_STATEMENT);
    createEReference(iterationStatementEClass, ITERATION_STATEMENT__FOREACH_STATEMENT);

    foreachStatementEClass = createEClass(FOREACH_STATEMENT);
    createEReference(foreachStatementEClass, FOREACH_STATEMENT__TIPO);
    createEReference(foreachStatementEClass, FOREACH_STATEMENT__ID);
    createEReference(foreachStatementEClass, FOREACH_STATEMENT__EXPRESSION);
    createEReference(foreachStatementEClass, FOREACH_STATEMENT__EMBEDDED_STATEMENT);

    forStatementEClass = createEClass(FOR_STATEMENT);
    createEReference(forStatementEClass, FOR_STATEMENT__FOR_INITIALIZER);
    createEReference(forStatementEClass, FOR_STATEMENT__EXPRESSION);
    createEReference(forStatementEClass, FOR_STATEMENT__STATEMENT_EXPRESSION_LIST);
    createEReference(forStatementEClass, FOR_STATEMENT__EMBEDDED_STATEMENT);

    forInitializerEClass = createEClass(FOR_INITIALIZER);
    createEReference(forInitializerEClass, FOR_INITIALIZER__LOCAL_VARIABLE_DECLARATION);
    createEReference(forInitializerEClass, FOR_INITIALIZER__STATEMENT_EXPRESSION_LIST);

    statementExpressionListEClass = createEClass(STATEMENT_EXPRESSION_LIST);
    createEReference(statementExpressionListEClass, STATEMENT_EXPRESSION_LIST__LIST);
    createEReference(statementExpressionListEClass, STATEMENT_EXPRESSION_LIST__LISTS);

    statementExpressionEClass = createEClass(STATEMENT_EXPRESSION);
    createEReference(statementExpressionEClass, STATEMENT_EXPRESSION__TIPO);
    createEReference(statementExpressionEClass, STATEMENT_EXPRESSION__ARGUMENT_LIST);
    createEReference(statementExpressionEClass, STATEMENT_EXPRESSION__PRIMARY_EXPRESSION);
    createEAttribute(statementExpressionEClass, STATEMENT_EXPRESSION__INCRIMENT_DECREMENT);
    createEReference(statementExpressionEClass, STATEMENT_EXPRESSION__UNARY_EXPRESSION);
    createEAttribute(statementExpressionEClass, STATEMENT_EXPRESSION__ASSIGNEMENT_OPERATOR);
    createEReference(statementExpressionEClass, STATEMENT_EXPRESSION__EXPRESSION);

    doStatementEClass = createEClass(DO_STATEMENT);
    createEReference(doStatementEClass, DO_STATEMENT__EMBEDDED_STATEMENT);
    createEReference(doStatementEClass, DO_STATEMENT__EXPRESSION);

    whileStatementEClass = createEClass(WHILE_STATEMENT);
    createEReference(whileStatementEClass, WHILE_STATEMENT__EXPRESSION);
    createEReference(whileStatementEClass, WHILE_STATEMENT__EMBEDDED_STATEMENT);

    selectionStatementEClass = createEClass(SELECTION_STATEMENT);
    createEReference(selectionStatementEClass, SELECTION_STATEMENT__IF_STATEMENT);
    createEReference(selectionStatementEClass, SELECTION_STATEMENT__SWITCH_STATEMENT);

    switchStatementEClass = createEClass(SWITCH_STATEMENT);
    createEReference(switchStatementEClass, SWITCH_STATEMENT__EXPRESSION);
    createEReference(switchStatementEClass, SWITCH_STATEMENT__SWITCH_SECTION);

    switchSectionEClass = createEClass(SWITCH_SECTION);
    createEReference(switchSectionEClass, SWITCH_SECTION__SWITCHLABEL);
    createEReference(switchSectionEClass, SWITCH_SECTION__STATEMENT);

    switchLabelEClass = createEClass(SWITCH_LABEL);
    createEReference(switchLabelEClass, SWITCH_LABEL__EXPRESSION);

    ifStatementEClass = createEClass(IF_STATEMENT);
    createEReference(ifStatementEClass, IF_STATEMENT__EXPRESSION);
    createEReference(ifStatementEClass, IF_STATEMENT__EMBEDDED_STATEMENT);
    createEReference(ifStatementEClass, IF_STATEMENT__ELSE_PART);

    elsePartEClass = createEClass(ELSE_PART);
    createEReference(elsePartEClass, ELSE_PART__EMBEDDED_STATEMENT);

    blockEClass = createEClass(BLOCK);
    createEReference(blockEClass, BLOCK__STATEMENT);

    maybeEmptyBlockEClass = createEClass(MAYBE_EMPTY_BLOCK);

    sByteEClass = createEClass(SBYTE);

    byteEClass = createEClass(BYTE);

    shortEClass = createEClass(SHORT);

    uShortEClass = createEClass(USHORT);

    intEClass = createEClass(INT);

    uIntEClass = createEClass(UINT);

    longEClass = createEClass(LONG);

    uLongEClass = createEClass(ULONG);

    charEClass = createEClass(CHAR);

    boolEClass = createEClass(BOOL);

    decimalEClass = createEClass(DECIMAL);

    floatEClass = createEClass(FLOAT);

    doubleEClass = createEClass(DOUBLE);

    objectEClass = createEClass(OBJECT);

    stringEClass = createEClass(STRING);

    voidEClass = createEClass(VOID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    attributeListEClass.getESuperTypes().add(this.getAttributeSection());
    expressionEClass.getESuperTypes().add(this.getVariableInitializer());
    expressionEClass.getESuperTypes().add(this.getArgument());
    expressionEClass.getESuperTypes().add(this.getResourceAquisition());
    arrayInitializerEClass.getESuperTypes().add(this.getVariableInitializer());
    typeEClass.getESuperTypes().add(this.getEventDeclaration());
    typeEClass.getESuperTypes().add(this.getPropertyDeclaration());
    typeEClass.getESuperTypes().add(this.getFieldDeclaration());
    typeEClass.getESuperTypes().add(this.getConstantDeclaration());
    integralTypeEClass.getESuperTypes().add(this.getBuiltInType());
    nonArrayTypeEClass.getESuperTypes().add(this.getArrayType());
    builtInClassTypeEClass.getESuperTypes().add(this.getBuiltInType());
    builtInClassTypeEClass.getESuperTypes().add(this.getClassBase());
    argumentListEClass.getESuperTypes().add(this.getConstructorInitializer());
    conversionOperatorDeclaratorEClass.getESuperTypes().add(this.getOperatorDeclarator());
    binaryOperatorDeclaratorEClass.getESuperTypes().add(this.getOperatorDeclarator());
    unaryOperatorDeclaratorEClass.getESuperTypes().add(this.getOperatorDeclarator());
    fixedParametersEClass.getESuperTypes().add(this.getFormalParameterList());
    typeOrVoidEClass.getESuperTypes().add(this.getDelegateDeclaration());
    localVariableDeclarationEClass.getESuperTypes().add(this.getResourceAquisition());
    blockEClass.getESuperTypes().add(this.getRemoveAccessorDeclaration());
    blockEClass.getESuperTypes().add(this.getAddAccessorDeclaration());
    blockEClass.getESuperTypes().add(this.getMaybeEmptyBlock());
    maybeEmptyBlockEClass.getESuperTypes().add(this.getSetAccessorDeclaration());
    maybeEmptyBlockEClass.getESuperTypes().add(this.getGetAccessorDeclaration());
    sByteEClass.getESuperTypes().add(this.getIntegralType());
    byteEClass.getESuperTypes().add(this.getIntegralType());
    shortEClass.getESuperTypes().add(this.getIntegralType());
    uShortEClass.getESuperTypes().add(this.getIntegralType());
    intEClass.getESuperTypes().add(this.getIntegralType());
    uIntEClass.getESuperTypes().add(this.getIntegralType());
    longEClass.getESuperTypes().add(this.getIntegralType());
    uLongEClass.getESuperTypes().add(this.getIntegralType());
    charEClass.getESuperTypes().add(this.getIntegralType());
    boolEClass.getESuperTypes().add(this.getBuiltInType());
    decimalEClass.getESuperTypes().add(this.getBuiltInType());
    floatEClass.getESuperTypes().add(this.getBuiltInType());
    doubleEClass.getESuperTypes().add(this.getBuiltInType());
    objectEClass.getESuperTypes().add(this.getBuiltInClassType());
    stringEClass.getESuperTypes().add(this.getBuiltInClassType());
    voidEClass.getESuperTypes().add(this.getTypeOrVoid());

    // Initialize classes and features; add operations and parameters
    initEClass(compilationUnitEClass, CompilationUnit.class, "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompilationUnit_UsingDirectives(), this.getUsingDirective(), null, "usingDirectives", null, 0, -1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompilationUnit_GlobalAtt(), this.getGlobalAttributes(), null, "globalAtt", null, 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompilationUnit_NameSpaces(), this.getNamespaceMemberDeclaration(), null, "nameSpaces", null, 0, -1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(usingDirectiveEClass, UsingDirective.class, "UsingDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUsingDirective_Name(), this.getIdentifier(), null, "name", null, 0, 1, UsingDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUsingDirective_Usings(), this.getQualifiedIdentifier(), null, "usings", null, 0, 1, UsingDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(globalAttributesEClass, GlobalAttributes.class, "GlobalAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGlobalAttributes_GlobalAttSections(), this.getGlobalAttributeSection(), null, "globalAttSections", null, 0, -1, GlobalAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(globalAttributeSectionEClass, GlobalAttributeSection.class, "GlobalAttributeSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGlobalAttributeSection_Attributes(), this.getAttributeList(), null, "attributes", null, 0, 1, GlobalAttributeSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributesEClass, Attributes.class, "Attributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributes_Attributes(), this.getAttributeSection(), null, "attributes", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeSectionEClass, AttributeSection.class, "AttributeSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeListEClass, AttributeList.class, "AttributeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeList_Attribute(), this.getAttribute(), null, "attribute", null, 0, 1, AttributeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeList_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, AttributeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttribute_Name(), this.getAttributeName(), null, "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_AttArguments(), this.getAttributeArguments(), null, "attArguments", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeArgumentsEClass, AttributeArguments.class, "AttributeArguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeArguments_ExpresionList(), this.getExpressionList(), null, "expresionList", null, 0, 1, AttributeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionListEClass, ExpressionList.class, "ExpressionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionList_Expression(), this.getExpression(), null, "expression", null, 0, 1, ExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionList_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, ExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Unary(), this.getUnaryExpression(), null, "unary", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Exp(), this.getExpression(), null, "exp", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Exp2(), this.getExpression2(), null, "exp2", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expression2EClass, Expression2.class, "Expression2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression2_InterExp(), this.getExpression(), null, "interExp", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_InterExp2(), this.getExpression2(), null, "interExp2", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_PipelineExp(), this.getExpression(), null, "pipelineExp", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_PipelineExp2(), this.getExpression2(), null, "pipelineExp2", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_InExp(), this.getExpression(), null, "inExp", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_InExp2(), this.getExpression2(), null, "inExp2", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_BarExp(), this.getExpression(), null, "barExp", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_BarExp2(), this.getExpression2(), null, "barExp2", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_Exp(), this.getExpression(), null, "exp", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_Exp2(), this.getExpression2(), null, "exp2", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_AmpExp(), this.getExpression(), null, "ampExp", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_AmpExp2(), this.getExpression2(), null, "ampExp2", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_EqualityExp(), this.getExpression(), null, "equalityExp", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_EqualityExp2(), this.getExpression2(), null, "equalityExp2", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_RelopExp(), this.getExpression(), null, "relopExp", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_RelopExp2(), this.getExpression2(), null, "relopExp2", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_BuildInType(), this.getBuiltInType(), null, "buildInType", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_ShiftExp(), this.getExpression(), null, "shiftExp", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_ShiftExp2(), this.getExpression2(), null, "shiftExp2", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_OperatorExp(), this.getExpression(), null, "operatorExp", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_OperatorExp2(), this.getExpression2(), null, "operatorExp2", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_MultipExp(), this.getExpression(), null, "multipExp", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_MultipExp2(), this.getExpression2(), null, "multipExp2", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_DivExp(), this.getExpression(), null, "divExp", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_DivExp2(), this.getExpression2(), null, "divExp2", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_ModExp(), this.getExpression(), null, "modExp", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression2_ModExp2(), this.getExpression2(), null, "modExp2", null, 0, 1, Expression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryExpression_ExpUnaryOperator(), ecorePackage.getEString(), "expUnaryOperator", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryExpression_Type(), this.getType(), null, "type", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryExpression_UnaryExp(), this.getUnaryExpression(), null, "unaryExp", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryExpression_PrimaryExp(), this.getPrimaryExpression(), null, "primaryExp", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryExpressionEClass, PrimaryExpression.class, "PrimaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimaryExpression_NonArrayType(), this.getNonArrayType(), null, "nonArrayType", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_ExpressionList(), this.getExpressionList(), null, "expressionList", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimaryExpression_RankSpecifier(), ecorePackage.getEString(), "rankSpecifier", null, 0, -1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_ArrayInitializer(), this.getArrayInitializer(), null, "arrayInitializer", null, 0, -1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_ArrayType(), this.getArrayType(), null, "arrayType", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_ArrayInitializer2(), this.getArrayInitializer(), null, "arrayInitializer2", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_Tipo(), this.getType(), null, "tipo", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_ArgumentList(), this.getArgumentList(), null, "argumentList", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_Id(), this.getIdentifier(), null, "id", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimaryExpression_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimaryExpression_PredefinedType(), ecorePackage.getEString(), "predefinedType", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_TypeOrVoid(), this.getTypeOrVoid(), null, "typeOrVoid", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_PrimaryExoression2(), this.getPrimaryExpression2(), null, "primaryExoression2", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryExpression2EClass, PrimaryExpression2.class, "PrimaryExpression2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimaryExpression2_Id(), this.getIdentifier(), null, "id", null, 0, -1, PrimaryExpression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression2_ArgumentList(), this.getArgumentList(), null, "argumentList", null, 0, -1, PrimaryExpression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression2_ExpressionList(), this.getExpressionList(), null, "expressionList", null, 0, -1, PrimaryExpression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimaryExpression2_IncrementeDecrement(), ecorePackage.getEString(), "incrementeDecrement", null, 0, -1, PrimaryExpression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression2_PrimaryExpression2(), this.getPrimaryExpression2(), null, "primaryExpression2", null, 0, -1, PrimaryExpression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayInitializerEClass, ArrayInitializer.class, "ArrayInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayInitializer_VariableInitalizer(), this.getVariableInitializer(), null, "variableInitalizer", null, 0, 1, ArrayInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArrayInitializer_VariableInitalizers(), this.getVariableInitializer(), null, "variableInitalizers", null, 0, -1, ArrayInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableInitializerEClass, VariableInitializer.class, "VariableInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeNameEClass, AttributeName.class, "AttributeName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeName_QualifiedId(), this.getQualifiedIdentifier(), null, "qualifiedId", null, 0, 1, AttributeName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getType_NonArray(), this.getNonArrayType(), null, "nonArray", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_VariableDeclarator(), this.getVariableDeclarator(), null, "variableDeclarator", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_VariableDeclarators(), this.getVariableDeclarator(), null, "variableDeclarators", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_QIdent(), this.getQualifiedIdentifier(), null, "qIdent", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_EventAccessorDeclarations(), this.getEventAccessorDeclarations(), null, "eventAccessorDeclarations", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_QualifiedId(), this.getQualifiedIdentifier(), null, "qualifiedId", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_AccDeclarate(), this.getAccessorDeclarations(), null, "accDeclarate", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Variable(), this.getVariableDeclarator(), null, "variable", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Variables(), this.getVariableDeclarator(), null, "variables", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_ConstDeclarator(), this.getConstantDeclarator(), null, "constDeclarator", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_ConstDeclarators(), this.getConstantDeclarator(), null, "constDeclarators", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integralTypeEClass, IntegralType.class, "IntegralType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nonArrayTypeEClass, NonArrayType.class, "NonArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNonArrayType_BuiltType(), this.getBuiltInType(), null, "builtType", null, 0, 1, NonArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNonArrayType_Qualified(), this.getQualifiedIdentifier(), null, "qualified", null, 0, 1, NonArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(builtInTypeEClass, BuiltInType.class, "BuiltInType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(builtInClassTypeEClass, BuiltInClassType.class, "BuiltInClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBuiltInClassType_QID2(), this.getQualifiedIdentifierList(), null, "qID2", null, 0, 1, BuiltInClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedIdentifierEClass, QualifiedIdentifier.class, "QualifiedIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQualifiedIdentifier_Id(), this.getIdentifier(), null, "id", null, 0, 1, QualifiedIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQualifiedIdentifier_Ids(), this.getIdentifier(), null, "ids", null, 0, -1, QualifiedIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespaceMemberDeclarationEClass, NamespaceMemberDeclaration.class, "NamespaceMemberDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamespaceMemberDeclaration_NameDeclaretion(), this.getNamespaceDeclaration(), null, "nameDeclaretion", null, 0, 1, NamespaceMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamespaceMemberDeclaration_TypeDeclaration(), this.getTypeDeclaration(), null, "typeDeclaration", null, 0, 1, NamespaceMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespaceDeclarationEClass, NamespaceDeclaration.class, "NamespaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamespaceDeclaration_QId(), this.getQualifiedIdentifier(), null, "qId", null, 0, 1, NamespaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamespaceDeclaration_NameBody(), this.getNamespaceBody(), null, "nameBody", null, 0, 1, NamespaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespaceBodyEClass, NamespaceBody.class, "NamespaceBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamespaceBody_UsingDirectives(), this.getUsingDirective(), null, "usingDirectives", null, 0, -1, NamespaceBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamespaceBody_NameSpaces(), this.getNamespaceMemberDeclaration(), null, "nameSpaces", null, 0, -1, NamespaceBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDeclarationEClass, TypeDeclaration.class, "TypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeDeclaration_ClassDeclaration(), this.getClassDeclaration(), null, "classDeclaration", null, 0, 1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDeclaration_InterfaceDeclaration(), this.getInterfaceDeclaration(), null, "interfaceDeclaration", null, 0, 1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDeclaration_EnumDeclaration(), this.getEnumDeclaration(), null, "enumDeclaration", null, 0, 1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDeclaration_DelegateDeclaration(), this.getDelegateDeclaration(), null, "delegateDeclaration", null, 0, 1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(delegateDeclarationEClass, DelegateDeclaration.class, "DelegateDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumDeclarationEClass, EnumDeclaration.class, "EnumDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumDeclaration_Name(), this.getIdentifier(), null, "name", null, 0, 1, EnumDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumDeclaration_IntType(), this.getIntegralType(), null, "intType", null, 0, 1, EnumDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumDeclaration_EnumBody(), this.getEnumBody(), null, "enumBody", null, 0, 1, EnumDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumBodyEClass, EnumBody.class, "EnumBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumBody_EnumDeclaration(), this.getEnumMemberDeclaration(), null, "enumDeclaration", null, 0, 1, EnumBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumBody_EnumDeclarations(), this.getEnumMemberDeclaration(), null, "enumDeclarations", null, 0, -1, EnumBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumMemberDeclarationEClass, EnumMemberDeclaration.class, "EnumMemberDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumMemberDeclaration_Att(), this.getAttributes(), null, "att", null, 0, 1, EnumMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumMemberDeclaration_Name(), this.getIdentifier(), null, "name", null, 0, 1, EnumMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumMemberDeclaration_Exp(), this.getExpression(), null, "exp", null, 0, 1, EnumMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceDeclarationEClass, InterfaceDeclaration.class, "InterfaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceDeclaration_Name(), this.getIdentifier(), null, "name", null, 0, 1, InterfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceDeclaration_QIdentifiers(), this.getQualifiedIdentifierList(), null, "qIdentifiers", null, 0, 1, InterfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceDeclaration_InterBody(), this.getInterfaceBody(), null, "interBody", null, 0, 1, InterfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceBodyEClass, InterfaceBody.class, "InterfaceBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceBody_InterfaceMemberDeclarations(), this.getInterfaceMemberDeclaration(), null, "interfaceMemberDeclarations", null, 0, -1, InterfaceBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceMemberDeclarationEClass, InterfaceMemberDeclaration.class, "InterfaceMemberDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceMemberDeclaration_IntermethodDeclaration(), this.getInterfaceMethodDeclaration(), null, "intermethodDeclaration", null, 0, 1, InterfaceMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceMemberDeclaration_InterEventDeclaration(), this.getInterfaceEventDeclaration(), null, "interEventDeclaration", null, 0, 1, InterfaceMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceMemberDeclaration_Type1(), this.getType(), null, "type1", null, 0, 1, InterfaceMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceMemberDeclaration_InterfaceIndexerDecla(), this.getInterfaceIndexerDeclaration(), null, "interfaceIndexerDecla", null, 0, 1, InterfaceMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceMemberDeclaration_InterProperty(), this.getInterfacePropertyDeclaration(), null, "interProperty", null, 0, 1, InterfaceMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceIndexerDeclarationEClass, InterfaceIndexerDeclaration.class, "InterfaceIndexerDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceIndexerDeclaration_ParameterList(), this.getFormalParameterList(), null, "parameterList", null, 0, 1, InterfaceIndexerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceIndexerDeclaration_InterAccessors(), this.getInterfaceAccessors(), null, "interAccessors", null, 0, 1, InterfaceIndexerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceEventDeclarationEClass, InterfaceEventDeclaration.class, "InterfaceEventDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceEventDeclaration_Type(), this.getType(), null, "type", null, 0, 1, InterfaceEventDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceEventDeclaration_Name(), this.getIdentifier(), null, "name", null, 0, 1, InterfaceEventDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfacePropertyDeclarationEClass, InterfacePropertyDeclaration.class, "InterfacePropertyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfacePropertyDeclaration_Name(), this.getIdentifier(), null, "name", null, 0, 1, InterfacePropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfacePropertyDeclaration_InterAccessor(), this.getInterfaceAccessors(), null, "interAccessor", null, 0, 1, InterfacePropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceAccessorsEClass, InterfaceAccessors.class, "InterfaceAccessors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceAccessors_Att(), this.getAttributes(), null, "att", null, 0, 1, InterfaceAccessors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceAccessors_NewAtt(), this.getAttributes(), null, "newAtt", null, 0, 1, InterfaceAccessors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceAccessors_OtherAtt(), this.getAttributes(), null, "otherAtt", null, 0, 1, InterfaceAccessors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceMethodDeclarationEClass, InterfaceMethodDeclaration.class, "InterfaceMethodDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceMethodDeclaration_Type(), this.getTypeOrVoid(), null, "type", null, 0, 1, InterfaceMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceMethodDeclaration_Name(), this.getIdentifier(), null, "name", null, 0, 1, InterfaceMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceMethodDeclaration_ParameterList(), this.getFormalParameterList(), null, "parameterList", null, 0, 1, InterfaceMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classDeclarationEClass, ClassDeclaration.class, "ClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassDeclaration_ClassModifier(), ecorePackage.getEString(), "classModifier", null, 0, -1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassDeclaration_ClassName(), this.getIdentifier(), null, "className", null, 0, 1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassDeclaration_ClassBase(), this.getClassBase(), null, "classBase", null, 0, 1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassDeclaration_ClassBody(), this.getClassBody(), null, "classBody", null, 0, 1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classBodyEClass, ClassBody.class, "ClassBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassBody_ClassAtt(), this.getAttributes(), null, "classAtt", null, 0, -1, ClassBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassBody_ClassDeclaration(), this.getClassMemberDeclaration(), null, "classDeclaration", null, 0, -1, ClassBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classMemberDeclarationEClass, ClassMemberDeclaration.class, "ClassMemberDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassMemberDeclaration_FieldDeclaration(), this.getFieldDeclaration(), null, "fieldDeclaration", null, 0, 1, ClassMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassMemberDeclaration_MethodDeclaration(), this.getMethodDeclaration(), null, "methodDeclaration", null, 0, 1, ClassMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassMemberDeclaration_ConstDeclaration(), this.getConstantDeclaration(), null, "constDeclaration", null, 0, 1, ClassMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassMemberDeclaration_PropertyDeclaration(), this.getPropertyDeclaration(), null, "propertyDeclaration", null, 0, 1, ClassMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassMemberDeclaration_EventDeclaration(), this.getEventDeclaration(), null, "eventDeclaration", null, 0, 1, ClassMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassMemberDeclaration_IndexDeclaration(), this.getIndexerDeclaration(), null, "indexDeclaration", null, 0, 1, ClassMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassMemberDeclaration_TypeDeclaration(), this.getTypeDeclaration(), null, "typeDeclaration", null, 0, 1, ClassMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassMemberDeclaration_OpDeclaration(), this.getOperatorDeclaration(), null, "opDeclaration", null, 0, 1, ClassMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassMemberDeclaration_ConstructorDeclaration(), this.getConstructorDeclaration(), null, "constructorDeclaration", null, 0, 1, ClassMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassMemberDeclaration_DestructorDeclaration(), this.getDestructorDeclaration(), null, "destructorDeclaration", null, 0, 1, ClassMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassMemberDeclaration_StaticDeclaration(), this.getStaticConstructorDeclaration(), null, "staticDeclaration", null, 0, 1, ClassMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(staticConstructorDeclarationEClass, StaticConstructorDeclaration.class, "StaticConstructorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStaticConstructorDeclaration_StaticCosntModifier(), ecorePackage.getEString(), "staticCosntModifier", null, 0, 1, StaticConstructorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStaticConstructorDeclaration_Name(), this.getIdentifier(), null, "name", null, 0, 1, StaticConstructorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStaticConstructorDeclaration_EmptyBlock(), this.getMaybeEmptyBlock(), null, "emptyBlock", null, 0, 1, StaticConstructorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(destructorDeclarationEClass, DestructorDeclaration.class, "DestructorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDestructorDeclaration_Name(), this.getIdentifier(), null, "name", null, 0, 1, DestructorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDestructorDeclaration_EmptyBlock(), this.getMaybeEmptyBlock(), null, "emptyBlock", null, 0, 1, DestructorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructorDeclarationEClass, ConstructorDeclaration.class, "ConstructorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstructorDeclaration_ConstModifier(), ecorePackage.getEString(), "constModifier", null, 0, -1, ConstructorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructorDeclaration_ConstrDeclarator(), this.getConstructorDeclarator(), null, "constrDeclarator", null, 0, 1, ConstructorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructorDeclaration_EmptyBlock(), this.getMaybeEmptyBlock(), null, "emptyBlock", null, 0, 1, ConstructorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructorDeclaratorEClass, ConstructorDeclarator.class, "ConstructorDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstructorDeclarator_ClassName(), this.getIdentifier(), null, "className", null, 0, 1, ConstructorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructorDeclarator_FormalList(), this.getFormalParameterList(), null, "formalList", null, 0, 1, ConstructorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructorDeclarator_ConstInitializer(), this.getConstructorInitializer(), null, "constInitializer", null, 0, 1, ConstructorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructorInitializerEClass, ConstructorInitializer.class, "ConstructorInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(argumentListEClass, ArgumentList.class, "ArgumentList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArgumentList_Arg(), this.getArgument(), null, "arg", null, 0, 1, ArgumentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArgumentList_Args(), this.getArgument(), null, "args", null, 0, -1, ArgumentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operatorDeclarationEClass, OperatorDeclaration.class, "OperatorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperatorDeclaration_OpModifier(), ecorePackage.getEString(), "opModifier", null, 0, -1, OperatorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperatorDeclaration_OpDeclarator(), this.getOperatorDeclarator(), null, "opDeclarator", null, 0, 1, OperatorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperatorDeclaration_EmptyBlock(), this.getMaybeEmptyBlock(), null, "emptyBlock", null, 0, 1, OperatorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorDeclaratorEClass, OperatorDeclarator.class, "OperatorDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperatorDeclarator_Type(), this.getType(), null, "type", null, 0, 1, OperatorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conversionOperatorDeclaratorEClass, ConversionOperatorDeclarator.class, "ConversionOperatorDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConversionOperatorDeclarator_FirstType(), this.getType(), null, "firstType", null, 0, 1, ConversionOperatorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConversionOperatorDeclarator_ConversionName(), this.getIdentifier(), null, "conversionName", null, 0, 1, ConversionOperatorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryOperatorDeclaratorEClass, BinaryOperatorDeclarator.class, "BinaryOperatorDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryOperatorDeclarator_BinType(), this.getType(), null, "binType", null, 0, 1, BinaryOperatorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryOperatorDeclarator_OverBinOperator(), ecorePackage.getEString(), "overBinOperator", null, 0, 1, BinaryOperatorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryOperatorDeclarator_OtherName(), this.getIdentifier(), null, "otherName", null, 0, 1, BinaryOperatorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryOperatorDeclarator_SecondType(), this.getType(), null, "secondType", null, 0, 1, BinaryOperatorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryOperatorDeclarator_SecondName(), this.getIdentifier(), null, "secondName", null, 0, 1, BinaryOperatorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryOperatorDeclaratorEClass, UnaryOperatorDeclarator.class, "UnaryOperatorDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnaryOperatorDeclarator_OtherType(), this.getType(), null, "otherType", null, 0, 1, UnaryOperatorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryOperatorDeclarator_Name(), this.getIdentifier(), null, "name", null, 0, 1, UnaryOperatorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexerDeclarationEClass, IndexerDeclaration.class, "IndexerDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIndexerDeclaration_IdModifier(), ecorePackage.getEString(), "idModifier", null, 0, -1, IndexerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndexerDeclaration_IndexerDeclarator(), this.getIndexerDeclarator(), null, "indexerDeclarator", null, 0, 1, IndexerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndexerDeclaration_AccDeclaration(), this.getAccessorDeclarations(), null, "accDeclaration", null, 0, 1, IndexerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexerDeclaratorEClass, IndexerDeclarator.class, "IndexerDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndexerDeclarator_Type(), this.getType(), null, "type", null, 0, 1, IndexerDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndexerDeclarator_FormalList(), this.getFormalParameterList(), null, "formalList", null, 0, 1, IndexerDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndexerDeclarator_QualifiedId(), this.getQualifiedIdentifier(), null, "qualifiedId", null, 0, 1, IndexerDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventDeclarationEClass, EventDeclaration.class, "EventDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eventAccessorDeclarationsEClass, EventAccessorDeclarations.class, "EventAccessorDeclarations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEventAccessorDeclarations_Att1(), this.getAttributes(), null, "att1", null, 0, 1, EventAccessorDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventAccessorDeclarations_AddAccessor(), this.getAddAccessorDeclaration(), null, "addAccessor", null, 0, 1, EventAccessorDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventAccessorDeclarations_Att(), this.getAttributes(), null, "att", null, 0, 1, EventAccessorDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventAccessorDeclarations_RemovAccessor(), this.getRemoveAccessorDeclaration(), null, "removAccessor", null, 0, 1, EventAccessorDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(removeAccessorDeclarationEClass, RemoveAccessorDeclaration.class, "RemoveAccessorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(addAccessorDeclarationEClass, AddAccessorDeclaration.class, "AddAccessorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertyDeclarationEClass, PropertyDeclaration.class, "PropertyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(accessorDeclarationsEClass, AccessorDeclarations.class, "AccessorDeclarations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAccessorDeclarations_Att(), this.getAttributes(), null, "att", null, 0, 1, AccessorDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccessorDeclarations_GetAcc(), this.getGetAccessorDeclaration(), null, "getAcc", null, 0, 1, AccessorDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccessorDeclarations_Att2(), this.getAttributes(), null, "att2", null, 0, 1, AccessorDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccessorDeclarations_SetAcc(), this.getSetAccessorDeclaration(), null, "setAcc", null, 0, 1, AccessorDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setAccessorDeclarationEClass, SetAccessorDeclaration.class, "SetAccessorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(getAccessorDeclarationEClass, GetAccessorDeclaration.class, "GetAccessorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(methodDeclarationEClass, MethodDeclaration.class, "MethodDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodDeclaration_MethodHeader(), this.getMethodHeader(), null, "methodHeader", null, 0, 1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodDeclaration_MaybeEmpty(), this.getMaybeEmptyBlock(), null, "maybeEmpty", null, 0, 1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodHeaderEClass, MethodHeader.class, "MethodHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethodHeader_Modifier(), ecorePackage.getEString(), "modifier", null, 0, -1, MethodHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodHeader_TypeOrVoid(), this.getTypeOrVoid(), null, "typeOrVoid", null, 0, 1, MethodHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodHeader_QualifiedIdentifier(), this.getQualifiedIdentifier(), null, "qualifiedIdentifier", null, 0, 1, MethodHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodHeader_FormalParameters(), this.getFormalParameterList(), null, "formalParameters", null, 0, 1, MethodHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formalParameterListEClass, FormalParameterList.class, "FormalParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFormalParameterList_ParameterArray(), this.getParameterArray(), null, "parameterArray", null, 0, 1, FormalParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterArrayEClass, ParameterArray.class, "ParameterArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterArray_Att(), this.getAttributes(), null, "att", null, 0, 1, ParameterArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterArray_Array(), this.getArrayType(), null, "array", null, 0, 1, ParameterArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterArray_Name(), this.getIdentifier(), null, "name", null, 0, 1, ParameterArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fixedParametersEClass, FixedParameters.class, "FixedParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFixedParameters_FixParameter(), this.getFixedParameter(), null, "fixParameter", null, 0, 1, FixedParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFixedParameters_FixParameters(), this.getFixedParameter(), null, "fixParameters", null, 0, -1, FixedParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fixedParameterEClass, FixedParameter.class, "FixedParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFixedParameter_Att(), this.getAttributes(), null, "Att", null, 0, 1, FixedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFixedParameter_Type(), this.getType(), null, "type", null, 0, 1, FixedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFixedParameter_Name(), this.getIdentifier(), null, "name", null, 0, 1, FixedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeOrVoidEClass, TypeOrVoid.class, "TypeOrVoid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeOrVoid_Name(), this.getIdentifier(), null, "name", null, 0, 1, TypeOrVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeOrVoid_FormalParameters(), this.getFormalParameterList(), null, "formalParameters", null, 0, 1, TypeOrVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeOrVoid_Type(), this.getType(), null, "type", null, 0, 1, TypeOrVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldDeclarationEClass, FieldDeclaration.class, "FieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableDeclaratorEClass, VariableDeclarator.class, "VariableDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableDeclarator_VariableName(), this.getIdentifier(), null, "variableName", null, 0, 1, VariableDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDeclarator_Variable(), this.getVariableInitializer(), null, "variable", null, 0, 1, VariableDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantDeclarationEClass, ConstantDeclaration.class, "ConstantDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constantDeclaratorEClass, ConstantDeclarator.class, "ConstantDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantDeclarator_Name(), this.getIdentifier(), null, "name", null, 0, 1, ConstantDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantDeclarator_Exp(), this.getExpression(), null, "exp", null, 0, 1, ConstantDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classBaseEClass, ClassBase.class, "ClassBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassBase_QIDs(), this.getQualifiedIdentifierList(), null, "qIDs", null, 0, 1, ClassBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedIdentifierListEClass, QualifiedIdentifierList.class, "QualifiedIdentifierList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQualifiedIdentifierList_Id(), this.getQualifiedIdentifier(), null, "id", null, 0, 1, QualifiedIdentifierList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQualifiedIdentifierList_Ids(), this.getQualifiedIdentifier(), null, "ids", null, 0, -1, QualifiedIdentifierList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatement_LabelStat(), this.getLabeledStatement(), null, "labelStat", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_DeclareStat(), this.getDeclarationStatment(), null, "declareStat", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_EmbeddedStat(), this.getEmbeddedStatement(), null, "embeddedStat", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationStatmentEClass, DeclarationStatment.class, "DeclarationStatment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclarationStatment_LocalVariableDeclaration(), this.getLocalVariableDeclaration(), null, "localVariableDeclaration", null, 0, 1, DeclarationStatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclarationStatment_LocalCOnstant(), this.getLocalconstantDeclaration(), null, "localCOnstant", null, 0, 1, DeclarationStatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localconstantDeclarationEClass, LocalconstantDeclaration.class, "LocalconstantDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalconstantDeclaration_Tipo(), this.getType(), null, "tipo", null, 0, 1, LocalconstantDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalconstantDeclaration_ConstDeclarator(), this.getConstantDeclarator(), null, "constDeclarator", null, 0, 1, LocalconstantDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalconstantDeclaration_ConstDeclarators(), this.getConstantDeclarator(), null, "constDeclarators", null, 0, -1, LocalconstantDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labeledStatementEClass, LabeledStatement.class, "LabeledStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLabeledStatement_Id(), this.getIdentifier(), null, "id", null, 0, 1, LabeledStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLabeledStatement_Stat(), this.getStatement(), null, "stat", null, 0, 1, LabeledStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(embeddedStatementEClass, EmbeddedStatement.class, "EmbeddedStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEmbeddedStatement_MaybeEmpty(), this.getMaybeEmptyBlock(), null, "maybeEmpty", null, 0, 1, EmbeddedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEmbeddedStatement_StatExp(), this.getStatementExpression(), null, "statExp", null, 0, 1, EmbeddedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEmbeddedStatement_SelectionStat(), this.getSelectionStatement(), null, "selectionStat", null, 0, 1, EmbeddedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEmbeddedStatement_IterationStat(), this.getIterationStatement(), null, "iterationStat", null, 0, 1, EmbeddedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEmbeddedStatement_JumpStat(), this.getJumpStatement(), null, "jumpStat", null, 0, 1, EmbeddedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEmbeddedStatement_TryStat(), this.getTryStatement(), null, "tryStat", null, 0, 1, EmbeddedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEmbeddedStatement_Block(), this.getBlock(), null, "block", null, 0, 1, EmbeddedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEmbeddedStatement_LockStat(), this.getLockStatement(), null, "lockStat", null, 0, 1, EmbeddedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEmbeddedStatement_UsingStat(), this.getUsingStatement(), null, "usingStat", null, 0, 1, EmbeddedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(usingStatementEClass, UsingStatement.class, "UsingStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUsingStatement_ResourcAquisition(), this.getResourceAquisition(), null, "resourcAquisition", null, 0, 1, UsingStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUsingStatement_EmbeddedStat(), this.getEmbeddedStatement(), null, "embeddedStat", null, 0, 1, UsingStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceAquisitionEClass, ResourceAquisition.class, "ResourceAquisition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(localVariableDeclarationEClass, LocalVariableDeclaration.class, "LocalVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalVariableDeclaration_Tipo(), this.getType(), null, "tipo", null, 0, 1, LocalVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalVariableDeclaration_Variable(), this.getVariableDeclarator(), null, "variable", null, 0, 1, LocalVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalVariableDeclaration_Variables(), this.getVariableDeclarator(), null, "variables", null, 0, -1, LocalVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lockStatementEClass, LockStatement.class, "LockStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLockStatement_Exp(), this.getExpression(), null, "exp", null, 0, 1, LockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLockStatement_EmbeddedStat(), this.getEmbeddedStatement(), null, "embeddedStat", null, 0, 1, LockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tryStatementEClass, TryStatement.class, "TryStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTryStatement_Block(), this.getBlock(), null, "block", null, 0, 1, TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTryStatement_CatchClauses(), this.getCatchClauses(), null, "catchClauses", null, 0, 1, TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTryStatement_Finally(), this.getFinallyClause(), null, "finally", null, 0, 1, TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTryStatement_FinallyClause(), this.getFinallyClause(), null, "finallyClause", null, 0, 1, TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(finallyClauseEClass, FinallyClause.class, "FinallyClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFinallyClause_Block(), this.getBlock(), null, "block", null, 0, 1, FinallyClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(catchClausesEClass, CatchClauses.class, "CatchClauses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCatchClauses_SpeciCatchClause(), this.getSpecificCatchClause(), null, "speciCatchClause", null, 0, -1, CatchClauses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCatchClauses_GenCatchClause(), this.getGeneralCatchclause(), null, "genCatchClause", null, 0, 1, CatchClauses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCatchClauses_SpecCatchClause(), this.getSpecificCatchClause(), null, "specCatchClause", null, 0, -1, CatchClauses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generalCatchclauseEClass, GeneralCatchclause.class, "GeneralCatchclause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGeneralCatchclause_Block(), this.getBlock(), null, "block", null, 0, 1, GeneralCatchclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(specificCatchClauseEClass, SpecificCatchClause.class, "SpecificCatchClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpecificCatchClause_ClassType(), this.getBuiltInClassType(), null, "classType", null, 0, 1, SpecificCatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecificCatchClause_QualiId(), this.getQualifiedIdentifier(), null, "qualiId", null, 0, 1, SpecificCatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecificCatchClause_Id(), this.getIdentifier(), null, "id", null, 0, 1, SpecificCatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecificCatchClause_Block(), this.getBlock(), null, "block", null, 0, 1, SpecificCatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jumpStatementEClass, JumpStatement.class, "JumpStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJumpStatement_BreakStat(), this.getBreakStatement(), null, "breakStat", null, 0, 1, JumpStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJumpStatement_ContinueStat(), this.getContinueStatement(), null, "continueStat", null, 0, 1, JumpStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJumpStatement_GotoStat(), this.getGotoStatement(), null, "gotoStat", null, 0, 1, JumpStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJumpStatement_ReturnStat(), this.getReturnStatement(), null, "returnStat", null, 0, 1, JumpStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJumpStatement_ThrowStat(), this.getThrowStatement(), null, "throwStat", null, 0, 1, JumpStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(throwStatementEClass, ThrowStatement.class, "ThrowStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getThrowStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, ThrowStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(returnStatementEClass, ReturnStatement.class, "ReturnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReturnStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, ReturnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gotoStatementEClass, GotoStatement.class, "GotoStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGotoStatement_Id(), this.getIdentifier(), null, "id", null, 0, 1, GotoStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGotoStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, GotoStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(continueStatementEClass, ContinueStatement.class, "ContinueStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(breakStatementEClass, BreakStatement.class, "BreakStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(iterationStatementEClass, IterationStatement.class, "IterationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIterationStatement_WhileStatement(), this.getWhileStatement(), null, "whileStatement", null, 0, 1, IterationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIterationStatement_DoStatement(), this.getDoStatement(), null, "doStatement", null, 0, 1, IterationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIterationStatement_ForStatement(), this.getForStatement(), null, "forStatement", null, 0, 1, IterationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIterationStatement_ForeachStatement(), this.getForeachStatement(), null, "foreachStatement", null, 0, 1, IterationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(foreachStatementEClass, ForeachStatement.class, "ForeachStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForeachStatement_Tipo(), this.getType(), null, "tipo", null, 0, 1, ForeachStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForeachStatement_Id(), this.getIdentifier(), null, "id", null, 0, 1, ForeachStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForeachStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, ForeachStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForeachStatement_EmbeddedStatement(), this.getEmbeddedStatement(), null, "embeddedStatement", null, 0, 1, ForeachStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forStatementEClass, ForStatement.class, "ForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForStatement_ForInitializer(), this.getForInitializer(), null, "forInitializer", null, 0, -1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_Expression(), this.getExpression(), null, "expression", null, 0, -1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_StatementExpressionList(), this.getStatementExpressionList(), null, "statementExpressionList", null, 0, -1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_EmbeddedStatement(), this.getEmbeddedStatement(), null, "embeddedStatement", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forInitializerEClass, ForInitializer.class, "ForInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForInitializer_LocalVariableDeclaration(), this.getLocalVariableDeclaration(), null, "localVariableDeclaration", null, 0, 1, ForInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForInitializer_StatementExpressionList(), this.getStatementExpressionList(), null, "statementExpressionList", null, 0, 1, ForInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementExpressionListEClass, StatementExpressionList.class, "StatementExpressionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatementExpressionList_List(), this.getStatementExpression(), null, "list", null, 0, 1, StatementExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatementExpressionList_Lists(), this.getStatementExpression(), null, "lists", null, 0, -1, StatementExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementExpressionEClass, StatementExpression.class, "StatementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatementExpression_Tipo(), this.getType(), null, "tipo", null, 0, 1, StatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatementExpression_ArgumentList(), this.getArgumentList(), null, "argumentList", null, 0, 1, StatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatementExpression_PrimaryExpression(), this.getPrimaryExpression(), null, "primaryExpression", null, 0, 1, StatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatementExpression_IncrimentDecrement(), ecorePackage.getEString(), "incrimentDecrement", null, 0, 1, StatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatementExpression_UnaryExpression(), this.getUnaryExpression(), null, "unaryExpression", null, 0, 1, StatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatementExpression_AssignementOperator(), ecorePackage.getEString(), "assignementOperator", null, 0, 1, StatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatementExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, StatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doStatementEClass, DoStatement.class, "DoStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDoStatement_EmbeddedStatement(), this.getEmbeddedStatement(), null, "embeddedStatement", null, 0, 1, DoStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDoStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, DoStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileStatementEClass, WhileStatement.class, "WhileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhileStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhileStatement_EmbeddedStatement(), this.getEmbeddedStatement(), null, "embeddedStatement", null, 0, 1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionStatementEClass, SelectionStatement.class, "SelectionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectionStatement_IfStatement(), this.getIfStatement(), null, "ifStatement", null, 0, 1, SelectionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectionStatement_SwitchStatement(), this.getSwitchStatement(), null, "switchStatement", null, 0, 1, SelectionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchStatementEClass, SwitchStatement.class, "SwitchStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitchStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, SwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitchStatement_SwitchSection(), this.getSwitchSection(), null, "switchSection", null, 0, -1, SwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchSectionEClass, SwitchSection.class, "SwitchSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitchSection_Switchlabel(), this.getSwitchLabel(), null, "switchlabel", null, 0, -1, SwitchSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitchSection_Statement(), this.getStatement(), null, "statement", null, 0, -1, SwitchSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchLabelEClass, SwitchLabel.class, "SwitchLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitchLabel_Expression(), this.getExpression(), null, "expression", null, 0, 1, SwitchLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_EmbeddedStatement(), this.getEmbeddedStatement(), null, "embeddedStatement", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_ElsePart(), this.getElsePart(), null, "elsePart", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elsePartEClass, ElsePart.class, "ElsePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElsePart_EmbeddedStatement(), this.getEmbeddedStatement(), null, "embeddedStatement", null, 0, 1, ElsePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlock_Statement(), this.getStatement(), null, "statement", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(maybeEmptyBlockEClass, MaybeEmptyBlock.class, "MaybeEmptyBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sByteEClass, SByte.class, "SByte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(byteEClass, org.xtext.example.myModel.cSharp.Byte.class, "Byte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(shortEClass, org.xtext.example.myModel.cSharp.Short.class, "Short", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uShortEClass, UShort.class, "UShort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intEClass, Int.class, "Int", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uIntEClass, UInt.class, "UInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(longEClass, org.xtext.example.myModel.cSharp.Long.class, "Long", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uLongEClass, ULong.class, "ULong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(charEClass, Char.class, "Char", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boolEClass, Bool.class, "Bool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(decimalEClass, Decimal.class, "Decimal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatEClass, org.xtext.example.myModel.cSharp.Float.class, "Float", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(doubleEClass, org.xtext.example.myModel.cSharp.Double.class, "Double", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectEClass, org.xtext.example.myModel.cSharp.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringEClass, org.xtext.example.myModel.cSharp.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(voidEClass, org.xtext.example.myModel.cSharp.Void.class, "Void", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //CSharpPackageImpl
