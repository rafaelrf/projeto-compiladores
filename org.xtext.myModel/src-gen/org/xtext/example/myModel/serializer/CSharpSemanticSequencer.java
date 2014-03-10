package org.xtext.example.myModel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.myModel.cSharp.AccessorDeclarations;
import org.xtext.example.myModel.cSharp.ArgumentList;
import org.xtext.example.myModel.cSharp.ArrayInitializer;
import org.xtext.example.myModel.cSharp.Attribute;
import org.xtext.example.myModel.cSharp.AttributeArguments;
import org.xtext.example.myModel.cSharp.AttributeList;
import org.xtext.example.myModel.cSharp.AttributeName;
import org.xtext.example.myModel.cSharp.Attributes;
import org.xtext.example.myModel.cSharp.BinaryOperatorDeclarator;
import org.xtext.example.myModel.cSharp.Block;
import org.xtext.example.myModel.cSharp.BreakStatement;
import org.xtext.example.myModel.cSharp.BuiltInType;
import org.xtext.example.myModel.cSharp.CSharpPackage;
import org.xtext.example.myModel.cSharp.CatchClauses;
import org.xtext.example.myModel.cSharp.ClassBody;
import org.xtext.example.myModel.cSharp.ClassDeclaration;
import org.xtext.example.myModel.cSharp.ClassMemberDeclaration;
import org.xtext.example.myModel.cSharp.CompilationUnit;
import org.xtext.example.myModel.cSharp.ConstantDeclarator;
import org.xtext.example.myModel.cSharp.ConstructorDeclaration;
import org.xtext.example.myModel.cSharp.ContinueStatement;
import org.xtext.example.myModel.cSharp.ConversionOperatorDeclarator;
import org.xtext.example.myModel.cSharp.DeclarationStatment;
import org.xtext.example.myModel.cSharp.DestructorDeclaration;
import org.xtext.example.myModel.cSharp.DoStatement;
import org.xtext.example.myModel.cSharp.ElsePart;
import org.xtext.example.myModel.cSharp.EmbeddedStatement;
import org.xtext.example.myModel.cSharp.EnumBody;
import org.xtext.example.myModel.cSharp.EnumDeclaration;
import org.xtext.example.myModel.cSharp.EnumMemberDeclaration;
import org.xtext.example.myModel.cSharp.EventAccessorDeclarations;
import org.xtext.example.myModel.cSharp.Expression;
import org.xtext.example.myModel.cSharp.Expression2;
import org.xtext.example.myModel.cSharp.ExpressionList;
import org.xtext.example.myModel.cSharp.FinallyClause;
import org.xtext.example.myModel.cSharp.FixedParameter;
import org.xtext.example.myModel.cSharp.FixedParameters;
import org.xtext.example.myModel.cSharp.ForInitializer;
import org.xtext.example.myModel.cSharp.ForStatement;
import org.xtext.example.myModel.cSharp.ForeachStatement;
import org.xtext.example.myModel.cSharp.GeneralCatchclause;
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
import org.xtext.example.myModel.cSharp.Model;
import org.xtext.example.myModel.cSharp.NamespaceBody;
import org.xtext.example.myModel.cSharp.NamespaceDeclaration;
import org.xtext.example.myModel.cSharp.NamespaceMemberDeclaration;
import org.xtext.example.myModel.cSharp.NonArrayType;
import org.xtext.example.myModel.cSharp.OperatorDeclaration;
import org.xtext.example.myModel.cSharp.ParameterArray;
import org.xtext.example.myModel.cSharp.PrimaryExpression;
import org.xtext.example.myModel.cSharp.PrimaryExpression2;
import org.xtext.example.myModel.cSharp.QualifiedIdentifier;
import org.xtext.example.myModel.cSharp.QualifiedIdentifierList;
import org.xtext.example.myModel.cSharp.ReturnStatement;
import org.xtext.example.myModel.cSharp.SelectionStatement;
import org.xtext.example.myModel.cSharp.SpecificCatchClause;
import org.xtext.example.myModel.cSharp.Statement;
import org.xtext.example.myModel.cSharp.StatementExpression;
import org.xtext.example.myModel.cSharp.StatementExpressionList;
import org.xtext.example.myModel.cSharp.StaticConstructorDeclaration;
import org.xtext.example.myModel.cSharp.StructBody;
import org.xtext.example.myModel.cSharp.StructDeclaration;
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
import org.xtext.example.myModel.cSharp.WhileStatement;
import org.xtext.example.myModel.services.CSharpGrammarAccess;

@SuppressWarnings("all")
public class CSharpSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CSharpGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CSharpPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CSharpPackage.ACCESSOR_DECLARATIONS:
				if(context == grammarAccess.getAccessorDeclarationsRule()) {
					sequence_AccessorDeclarations(context, (AccessorDeclarations) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.ARGUMENT_LIST:
				if(context == grammarAccess.getArgumentListRule() ||
				   context == grammarAccess.getConstructorInitializerRule()) {
					sequence_ArgumentList(context, (ArgumentList) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.ARRAY_INITIALIZER:
				if(context == grammarAccess.getArrayInitializerRule() ||
				   context == grammarAccess.getVariableInitializerRule()) {
					sequence_ArrayInitializer(context, (ArrayInitializer) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.ATTRIBUTE_ARGUMENTS:
				if(context == grammarAccess.getAttributeArgumentsRule()) {
					sequence_AttributeArguments(context, (AttributeArguments) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.ATTRIBUTE_LIST:
				if(context == grammarAccess.getAttributeListRule() ||
				   context == grammarAccess.getAttributeSectionRule() ||
				   context == grammarAccess.getGlobalAttributeSectionRule()) {
					sequence_AttributeList(context, (AttributeList) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.ATTRIBUTE_NAME:
				if(context == grammarAccess.getAttributeNameRule()) {
					sequence_AttributeName(context, (AttributeName) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.ATTRIBUTES:
				if(context == grammarAccess.getAttributesRule()) {
					sequence_Attributes(context, (Attributes) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getEnumTypeRule()) {
					sequence_Attributes_EnumType(context, (Attributes) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getMethodHeaderRule()) {
					sequence_Attributes_MethodHeader(context, (Attributes) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.BINARY_OPERATOR_DECLARATOR:
				if(context == grammarAccess.getBinaryOperatorDeclaratorRule() ||
				   context == grammarAccess.getOperatorDeclaratorRule()) {
					sequence_BinaryOperatorDeclarator(context, (BinaryOperatorDeclarator) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.BLOCK:
				if(context == grammarAccess.getAddAccessorDeclarationRule() ||
				   context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getRemoveAccessorDeclarationRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.BREAK_STATEMENT:
				if(context == grammarAccess.getBreakStatementRule()) {
					sequence_BreakStatement(context, (BreakStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.BUILT_IN_TYPE:
				if(context == grammarAccess.getBuiltInTypeRule()) {
					sequence_BuiltInType(context, (BuiltInType) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.CATCH_CLAUSES:
				if(context == grammarAccess.getCatchClausesRule()) {
					sequence_CatchClauses(context, (CatchClauses) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.CLASS_BODY:
				if(context == grammarAccess.getClassBodyRule()) {
					sequence_ClassBody(context, (ClassBody) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.CLASS_DECLARATION:
				if(context == grammarAccess.getClassDeclarationRule()) {
					sequence_ClassDeclaration(context, (ClassDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.CLASS_MEMBER_DECLARATION:
				if(context == grammarAccess.getClassMemberDeclarationRule()) {
					sequence_ClassMemberDeclaration(context, (ClassMemberDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.COMPILATION_UNIT:
				if(context == grammarAccess.getCompilationUnitRule()) {
					sequence_CompilationUnit(context, (CompilationUnit) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.CONSTANT_DECLARATOR:
				if(context == grammarAccess.getConstantDeclaratorRule()) {
					sequence_ConstantDeclarator(context, (ConstantDeclarator) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.CONSTRUCTOR_DECLARATION:
				if(context == grammarAccess.getConstructorDeclarationRule() ||
				   context == grammarAccess.getStructMemberDeclarationRule()) {
					sequence_ConstructorDeclaration(context, (ConstructorDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructMemberDeclarations2Rule()) {
					sequence_ConstructorDeclaration_StructMemberDeclarations2(context, (ConstructorDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructMemberDeclarationsRule()) {
					sequence_ConstructorDeclaration_StructMemberDeclarations(context, (ConstructorDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.CONTINUE_STATEMENT:
				if(context == grammarAccess.getContinueStatementRule()) {
					sequence_ContinueStatement(context, (ContinueStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.CONVERSION_OPERATOR_DECLARATOR:
				if(context == grammarAccess.getConversionOperatorDeclaratorRule() ||
				   context == grammarAccess.getOperatorDeclaratorRule()) {
					sequence_ConversionOperatorDeclarator(context, (ConversionOperatorDeclarator) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.DECLARATION_STATMENT:
				if(context == grammarAccess.getDeclarationStatementRule()) {
					sequence_DeclarationStatement(context, (DeclarationStatment) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.DESTRUCTOR_DECLARATION:
				if(context == grammarAccess.getDestructorDeclarationRule()) {
					sequence_DestructorDeclaration(context, (DestructorDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.DO_STATEMENT:
				if(context == grammarAccess.getDoStatementRule()) {
					sequence_DoStatement(context, (DoStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.ELSE_PART:
				if(context == grammarAccess.getElsePartRule()) {
					sequence_ElsePart(context, (ElsePart) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.EMBEDDED_STATEMENT:
				if(context == grammarAccess.getEmbeddedStatementRule()) {
					sequence_EmbeddedStatement(context, (EmbeddedStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.ENUM_BODY:
				if(context == grammarAccess.getEnumBodyRule()) {
					sequence_EnumBody(context, (EnumBody) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.ENUM_DECLARATION:
				if(context == grammarAccess.getEnumDeclarationRule()) {
					sequence_EnumDeclaration(context, (EnumDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.ENUM_MEMBER_DECLARATION:
				if(context == grammarAccess.getEnumMemberDeclarationRule()) {
					sequence_EnumMemberDeclaration(context, (EnumMemberDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.EVENT_ACCESSOR_DECLARATIONS:
				if(context == grammarAccess.getEventAccessorDeclarationsRule()) {
					sequence_EventAccessorDeclarations(context, (EventAccessorDeclarations) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.EXPRESSION:
				if(context == grammarAccess.getArgumentRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getResourceAquisitionRule() ||
				   context == grammarAccess.getVariableInitializerRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.EXPRESSION2:
				if(context == grammarAccess.getExpression2Rule()) {
					sequence_Expression2(context, (Expression2) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.EXPRESSION_LIST:
				if(context == grammarAccess.getExpressionListRule()) {
					sequence_ExpressionList(context, (ExpressionList) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.FINALLY_CLAUSE:
				if(context == grammarAccess.getFinallyClauseRule()) {
					sequence_FinallyClause(context, (FinallyClause) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.FIXED_PARAMETER:
				if(context == grammarAccess.getFixedParameterRule()) {
					sequence_FixedParameter(context, (FixedParameter) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.FIXED_PARAMETERS:
				if(context == grammarAccess.getFixedParametersRule()) {
					sequence_FixedParameters(context, (FixedParameters) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFormalParameterListRule()) {
					sequence_FixedParameters_FormalParameterList(context, (FixedParameters) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.FOR_INITIALIZER:
				if(context == grammarAccess.getForInitializerRule()) {
					sequence_ForInitializer(context, (ForInitializer) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.FOR_STATEMENT:
				if(context == grammarAccess.getForStatementRule()) {
					sequence_ForStatement(context, (ForStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.FOREACH_STATEMENT:
				if(context == grammarAccess.getForeachStatementRule()) {
					sequence_ForeachStatement(context, (ForeachStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.GENERAL_CATCHCLAUSE:
				if(context == grammarAccess.getGeneralCatchClauseRule()) {
					sequence_GeneralCatchClause(context, (GeneralCatchclause) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.GLOBAL_ATTRIBUTES:
				if(context == grammarAccess.getGlobalAttributesRule()) {
					sequence_GlobalAttributes(context, (GlobalAttributes) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.GOTO_STATEMENT:
				if(context == grammarAccess.getGotoStatementRule()) {
					sequence_GotoStatement(context, (GotoStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.IDENTIFIER:
				if(context == grammarAccess.getConstructorDeclaratorRule()) {
					sequence_ConstructorDeclarator(context, (Identifier) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getIdentifierRule()) {
					sequence_Identifier(context, (Identifier) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.IF_STATEMENT:
				if(context == grammarAccess.getIfStatementRule()) {
					sequence_IfStatement(context, (IfStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.INDEXER_DECLARATION:
				if(context == grammarAccess.getIndexerDeclarationRule() ||
				   context == grammarAccess.getStructMemberDeclarationRule()) {
					sequence_IndexerDeclaration(context, (IndexerDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructMemberDeclarations2Rule()) {
					sequence_IndexerDeclaration_StructMemberDeclarations2(context, (IndexerDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructMemberDeclarationsRule()) {
					sequence_IndexerDeclaration_StructMemberDeclarations(context, (IndexerDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.INDEXER_DECLARATOR:
				if(context == grammarAccess.getIndexerDeclaratorRule()) {
					sequence_IndexerDeclarator(context, (IndexerDeclarator) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.INTEGRAL_TYPE:
				if(context == grammarAccess.getIntegralTypeRule()) {
					sequence_IntegralType(context, (IntegralType) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.INTERFACE_ACCESSORS:
				if(context == grammarAccess.getInterfaceAccessorsRule()) {
					sequence_InterfaceAccessors(context, (InterfaceAccessors) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.INTERFACE_BODY:
				if(context == grammarAccess.getInterfaceBodyRule()) {
					sequence_InterfaceBody(context, (InterfaceBody) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.INTERFACE_DECLARATION:
				if(context == grammarAccess.getInterfaceDeclarationRule()) {
					sequence_InterfaceDeclaration(context, (InterfaceDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.INTERFACE_EVENT_DECLARATION:
				if(context == grammarAccess.getInterfaceEventDeclarationRule()) {
					sequence_InterfaceEventDeclaration(context, (InterfaceEventDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.INTERFACE_INDEXER_DECLARATION:
				if(context == grammarAccess.getInterfaceIndexerDeclarationRule()) {
					sequence_InterfaceIndexerDeclaration(context, (InterfaceIndexerDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.INTERFACE_MEMBER_DECLARATION:
				if(context == grammarAccess.getInterfaceMemberDeclarationRule()) {
					sequence_InterfaceMemberDeclaration(context, (InterfaceMemberDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.INTERFACE_METHOD_DECLARATION:
				if(context == grammarAccess.getInterfaceMethodDeclarationRule()) {
					sequence_InterfaceMethodDeclaration(context, (InterfaceMethodDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.INTERFACE_PROPERTY_DECLARATION:
				if(context == grammarAccess.getInterfacePropertyDeclarationRule()) {
					sequence_InterfacePropertyDeclaration(context, (InterfacePropertyDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.ITERATION_STATEMENT:
				if(context == grammarAccess.getIterationStatementRule()) {
					sequence_IterationStatement(context, (IterationStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.JUMP_STATEMENT:
				if(context == grammarAccess.getJumpStatementRule()) {
					sequence_JumpStatement(context, (JumpStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.LABELED_STATEMENT:
				if(context == grammarAccess.getLabeledStatementRule()) {
					sequence_LabeledStatement(context, (LabeledStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.LOCAL_VARIABLE_DECLARATION:
				if(context == grammarAccess.getLocalVariableDeclarationRule() ||
				   context == grammarAccess.getResourceAquisitionRule()) {
					sequence_LocalVariableDeclaration(context, (LocalVariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.LOCALCONSTANT_DECLARATION:
				if(context == grammarAccess.getLocalConstantDeclarationRule()) {
					sequence_LocalConstantDeclaration(context, (LocalconstantDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.LOCK_STATEMENT:
				if(context == grammarAccess.getLockStatementRule()) {
					sequence_LockStatement(context, (LockStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.MAYBE_EMPTY_BLOCK:
				if(context == grammarAccess.getGetAccessorDeclarationRule() ||
				   context == grammarAccess.getMaybeEmptyBlockRule() ||
				   context == grammarAccess.getSetAccessorDeclarationRule()) {
					sequence_MaybeEmptyBlock(context, (MaybeEmptyBlock) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.METHOD_DECLARATION:
				if(context == grammarAccess.getClassMemberDeclarationRule() ||
				   context == grammarAccess.getMethodDeclarationRule() ||
				   context == grammarAccess.getStructMemberDeclarationRule()) {
					sequence_MethodDeclaration(context, (MethodDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructMemberDeclarations2Rule()) {
					sequence_MethodDeclaration_StructMemberDeclarations2(context, (MethodDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructMemberDeclarationsRule()) {
					sequence_MethodDeclaration_StructMemberDeclarations(context, (MethodDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.NAMESPACE_BODY:
				if(context == grammarAccess.getNamespaceBodyRule()) {
					sequence_NamespaceBody(context, (NamespaceBody) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.NAMESPACE_DECLARATION:
				if(context == grammarAccess.getNamespaceDeclarationRule()) {
					sequence_NamespaceDeclaration(context, (NamespaceDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.NAMESPACE_MEMBER_DECLARATION:
				if(context == grammarAccess.getNamespaceMemberDeclarationRule()) {
					sequence_NamespaceMemberDeclaration(context, (NamespaceMemberDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.NON_ARRAY_TYPE:
				if(context == grammarAccess.getArrayTypeRule() ||
				   context == grammarAccess.getNonArrayTypeRule()) {
					sequence_NonArrayType(context, (NonArrayType) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.OPERATOR_DECLARATION:
				if(context == grammarAccess.getOperatorDeclarationRule() ||
				   context == grammarAccess.getStructMemberDeclarationRule()) {
					sequence_OperatorDeclaration(context, (OperatorDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructMemberDeclarations2Rule()) {
					sequence_OperatorDeclaration_StructMemberDeclarations2(context, (OperatorDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructMemberDeclarationsRule()) {
					sequence_OperatorDeclaration_StructMemberDeclarations(context, (OperatorDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.PARAMETER_ARRAY:
				if(context == grammarAccess.getParameterArrayRule()) {
					sequence_ParameterArray(context, (ParameterArray) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.PRIMARY_EXPRESSION:
				if(context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (PrimaryExpression) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.PRIMARY_EXPRESSION2:
				if(context == grammarAccess.getPrimaryExpression2Rule()) {
					sequence_PrimaryExpression2(context, (PrimaryExpression2) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.QUALIFIED_IDENTIFIER:
				if(context == grammarAccess.getQualifiedIdentifierRule()) {
					sequence_QualifiedIdentifier(context, (QualifiedIdentifier) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.QUALIFIED_IDENTIFIER_LIST:
				if(context == grammarAccess.getClassBaseRule() ||
				   context == grammarAccess.getQualifiedIdentifierListRule()) {
					sequence_QualifiedIdentifierList(context, (QualifiedIdentifierList) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.RETURN_STATEMENT:
				if(context == grammarAccess.getReturnStatementRule()) {
					sequence_ReturnStatement(context, (ReturnStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.SELECTION_STATEMENT:
				if(context == grammarAccess.getSelectionStatementRule()) {
					sequence_SelectionStatement(context, (SelectionStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.SPECIFIC_CATCH_CLAUSE:
				if(context == grammarAccess.getSpecificCatchClauseRule()) {
					sequence_SpecificCatchClause(context, (SpecificCatchClause) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.STATEMENT_EXPRESSION:
				if(context == grammarAccess.getStatementExpressionRule()) {
					sequence_StatementExpression(context, (StatementExpression) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.STATEMENT_EXPRESSION_LIST:
				if(context == grammarAccess.getStatementExpressionListRule()) {
					sequence_StatementExpressionList(context, (StatementExpressionList) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.STATIC_CONSTRUCTOR_DECLARATION:
				if(context == grammarAccess.getStaticConstructorDeclarationRule() ||
				   context == grammarAccess.getStructMemberDeclarationRule()) {
					sequence_StaticConstructorDeclaration(context, (StaticConstructorDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructMemberDeclarations2Rule()) {
					sequence_StaticConstructorDeclaration_StructMemberDeclarations2(context, (StaticConstructorDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructMemberDeclarationsRule()) {
					sequence_StaticConstructorDeclaration_StructMemberDeclarations(context, (StaticConstructorDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.STRUCT_BODY:
				if(context == grammarAccess.getStructBodyRule()) {
					sequence_StructBody(context, (StructBody) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.STRUCT_DECLARATION:
				if(context == grammarAccess.getStructDeclarationRule()) {
					sequence_StructDeclaration(context, (StructDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.SWITCH_LABEL:
				if(context == grammarAccess.getSwitchLabelRule()) {
					sequence_SwitchLabel(context, (SwitchLabel) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.SWITCH_SECTION:
				if(context == grammarAccess.getSwitchSectionRule()) {
					sequence_SwitchSection(context, (SwitchSection) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.SWITCH_STATEMENT:
				if(context == grammarAccess.getSwitchStatementRule()) {
					sequence_SwitchStatement(context, (SwitchStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.THROW_STATEMENT:
				if(context == grammarAccess.getThrowStatementRule()) {
					sequence_ThrowStatement(context, (ThrowStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.TRY_STATEMENT:
				if(context == grammarAccess.getTryStatementRule()) {
					sequence_TryStatement(context, (TryStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.TYPE:
				if(context == grammarAccess.getStructMemberDeclarations2Rule()) {
					sequence_ConstantDeclaration_StructMemberDeclarations2_Type(context, (Type) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructMemberDeclarationsRule()) {
					sequence_ConstantDeclaration_StructMemberDeclarations_Type(context, (Type) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstantDeclarationRule() ||
				   context == grammarAccess.getStructMemberDeclarationRule()) {
					sequence_ConstantDeclaration_Type(context, (Type) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getEventDeclarationRule()) {
					sequence_EventDeclaration_Type(context, (Type) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFieldDeclarationRule()) {
					sequence_FieldDeclaration_Type(context, (Type) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPropertyDeclarationRule()) {
					sequence_PropertyDeclaration_Type(context, (Type) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.TYPE_DECLARATION:
				if(context == grammarAccess.getStructMemberDeclarations2Rule()) {
					sequence_StructMemberDeclarations2_TypeDeclaration(context, (TypeDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructMemberDeclarationsRule()) {
					sequence_StructMemberDeclarations_TypeDeclaration(context, (TypeDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructMemberDeclarationRule() ||
				   context == grammarAccess.getTypeDeclarationRule()) {
					sequence_TypeDeclaration(context, (TypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.TYPE_OR_VOID:
				if(context == grammarAccess.getDelegateDeclarationRule()) {
					sequence_DelegateDeclaration_TypeOrVoid(context, (TypeOrVoid) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeOrVoidRule()) {
					sequence_TypeOrVoid(context, (TypeOrVoid) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.UNARY_EXPRESSION:
				if(context == grammarAccess.getUnaryExpressionRule()) {
					sequence_UnaryExpression(context, (UnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.UNARY_OPERATOR_DECLARATOR:
				if(context == grammarAccess.getOperatorDeclaratorRule() ||
				   context == grammarAccess.getUnaryOperatorDeclaratorRule()) {
					sequence_UnaryOperatorDeclarator(context, (UnaryOperatorDeclarator) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.USING_DIRECTIVE:
				if(context == grammarAccess.getUsingDirectiveRule()) {
					sequence_UsingDirective(context, (UsingDirective) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.USING_STATEMENT:
				if(context == grammarAccess.getUsingStatementRule()) {
					sequence_UsingStatement(context, (UsingStatement) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.VARIABLE_DECLARATOR:
				if(context == grammarAccess.getVariableDeclaratorRule()) {
					sequence_VariableDeclarator(context, (VariableDeclarator) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.VOID:
				if(context == grammarAccess.getDelegateDeclarationRule()) {
					sequence_DelegateDeclaration(context, (org.xtext.example.myModel.cSharp.Void) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeOrVoidRule()) {
					sequence_TypeOrVoid(context, (org.xtext.example.myModel.cSharp.Void) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.WHILE_STATEMENT:
				if(context == grammarAccess.getWhileStatementRule()) {
					sequence_WhileStatement(context, (WhileStatement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         att=Attributes 
	 *         (
	 *             (getAcc=GetAccessorDeclaration att2=Attributes setAcc=SetAccessorDeclaration?) | 
	 *             (setAcc=SetAccessorDeclaration att2=Attributes getAcc=GetAccessorDeclaration?)
	 *         )
	 *     )
	 */
	protected void sequence_AccessorDeclarations(EObject context, AccessorDeclarations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg+=Argument*)
	 */
	protected void sequence_ArgumentList(EObject context, ArgumentList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ArrayInitializer}
	 */
	protected void sequence_ArrayInitializer(EObject context, ArrayInitializer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expresions+=ExpressionList?)
	 */
	protected void sequence_AttributeArguments(EObject context, AttributeArguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     attributes+=Attribute+
	 */
	protected void sequence_AttributeList(EObject context, AttributeList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     qualifiedId=QualifiedIdentifier
	 */
	protected void sequence_AttributeName(EObject context, AttributeName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.ATTRIBUTE_NAME__QUALIFIED_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.ATTRIBUTE_NAME__QUALIFIED_ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeNameAccess().getQualifiedIdQualifiedIdentifierParserRuleCall_1_0(), semanticObject.getQualifiedId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (attName=AttributeName attArguments=AttributeArguments?)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attributes+=AttributeSection*)
	 */
	protected void sequence_Attributes(EObject context, Attributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attributes+=AttributeSection* type=IntegralType? enumBody=EnumBody)
	 */
	protected void sequence_Attributes_EnumType(EObject context, Attributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attributes+=AttributeSection* typeOrVoid=TypeOrVoid qualifiedID=QualifiedIdentifier formalParameters=FormalParameterList?)
	 */
	protected void sequence_Attributes_MethodHeader(EObject context, Attributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         binType=Type 
	 *         overBinOperator=OverloadableBinaryOperator 
	 *         type=Type 
	 *         otherName=Identifier 
	 *         secondType=Type 
	 *         secondName=Identifier
	 *     )
	 */
	protected void sequence_BinaryOperatorDeclarator(EObject context, BinaryOperatorDeclarator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.OPERATOR_DECLARATOR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.OPERATOR_DECLARATOR__TYPE));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.BINARY_OPERATOR_DECLARATOR__BIN_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.BINARY_OPERATOR_DECLARATOR__BIN_TYPE));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.BINARY_OPERATOR_DECLARATOR__OVER_BIN_OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.BINARY_OPERATOR_DECLARATOR__OVER_BIN_OPERATOR));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.BINARY_OPERATOR_DECLARATOR__OTHER_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.BINARY_OPERATOR_DECLARATOR__OTHER_NAME));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.BINARY_OPERATOR_DECLARATOR__SECOND_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.BINARY_OPERATOR_DECLARATOR__SECOND_TYPE));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.BINARY_OPERATOR_DECLARATOR__SECOND_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.BINARY_OPERATOR_DECLARATOR__SECOND_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBinaryOperatorDeclaratorAccess().getBinTypeTypeParserRuleCall_0_0(), semanticObject.getBinType());
		feeder.accept(grammarAccess.getBinaryOperatorDeclaratorAccess().getOverBinOperatorOverloadableBinaryOperatorParserRuleCall_2_0(), semanticObject.getOverBinOperator());
		feeder.accept(grammarAccess.getBinaryOperatorDeclaratorAccess().getTypeTypeParserRuleCall_4_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getBinaryOperatorDeclaratorAccess().getOtherNameIdentifierParserRuleCall_5_0(), semanticObject.getOtherName());
		feeder.accept(grammarAccess.getBinaryOperatorDeclaratorAccess().getSecondTypeTypeParserRuleCall_7_0(), semanticObject.getSecondType());
		feeder.accept(grammarAccess.getBinaryOperatorDeclaratorAccess().getSecondNameIdentifierParserRuleCall_8_0(), semanticObject.getSecondName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (statement+=Statement*)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BreakStatement}
	 */
	protected void sequence_BreakStatement(EObject context, BreakStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BuiltInType}
	 */
	protected void sequence_BuiltInType(EObject context, BuiltInType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (speciCatchClause+=SpecificCatchClause+ genCatchClause=GeneralCatchClause?) | 
	 *         (specCatchClause=SpecificCatchClause* genCatchClause=GeneralCatchClause)
	 *     )
	 */
	protected void sequence_CatchClauses(EObject context, CatchClauses semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (classDeclaration+=ClassMemberDeclaration*)
	 */
	protected void sequence_ClassBody(EObject context, ClassBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (classModifier+=ClassModifier* className=Identifier classBase=ClassBase? classBody=ClassBody)
	 */
	protected void sequence_ClassDeclaration(EObject context, ClassDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         classAtt=Attributes 
	 *         (
	 *             constDeclaration=ConstantDeclaration | 
	 *             fieldDeclaration=FieldDeclaration | 
	 *             propertyDeclaration=PropertyDeclaration | 
	 *             eventDeclaration=EventDeclaration | 
	 *             indexDeclaration=IndexerDeclaration | 
	 *             opDeclaration=OperatorDeclaration | 
	 *             constructorDeclaration=ConstructorDeclaration | 
	 *             destructorDeclaration=DestructorDeclaration | 
	 *             staticDeclaration=StaticConstructorDeclaration | 
	 *             typeDeclaration=TypeDeclaration
	 *         )
	 *     )
	 */
	protected void sequence_ClassMemberDeclaration(EObject context, ClassMemberDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (usingDirectives+=UsingDirective* globalAtt=GlobalAttributes nameSpaces+=NamespaceMemberDeclaration*)
	 */
	protected void sequence_CompilationUnit(EObject context, CompilationUnit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nonArray=NonArrayType constDeclarators+=ConstantDeclarator+ structMember2+=StructMemberDeclarations2)
	 */
	protected void sequence_ConstantDeclaration_StructMemberDeclarations2_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nonArray=NonArrayType constDeclarators+=ConstantDeclarator+ structMember2+=StructMemberDeclarations2*)
	 */
	protected void sequence_ConstantDeclaration_StructMemberDeclarations_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nonArray=NonArrayType constDeclarators+=ConstantDeclarator+)
	 */
	protected void sequence_ConstantDeclaration_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier exp=Expression)
	 */
	protected void sequence_ConstantDeclarator(EObject context, ConstantDeclarator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.CONSTANT_DECLARATOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.CONSTANT_DECLARATOR__NAME));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.CONSTANT_DECLARATOR__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.CONSTANT_DECLARATOR__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantDeclaratorAccess().getNameIdentifierParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstantDeclaratorAccess().getExpExpressionParserRuleCall_3_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (constModifier+=ConstructorModifier* constrDeclarator=ConstructorDeclarator emptyBlock=MaybeEmptyBlock)
	 */
	protected void sequence_ConstructorDeclaration(EObject context, ConstructorDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constModifier+=ConstructorModifier* constrDeclarator=ConstructorDeclarator emptyBlock=MaybeEmptyBlock structMember2+=StructMemberDeclarations2)
	 */
	protected void sequence_ConstructorDeclaration_StructMemberDeclarations2(EObject context, ConstructorDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constModifier+=ConstructorModifier* constrDeclarator=ConstructorDeclarator emptyBlock=MaybeEmptyBlock structMember2+=StructMemberDeclarations2*)
	 */
	protected void sequence_ConstructorDeclaration_StructMemberDeclarations(EObject context, ConstructorDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (formalList=FormalParameterList? constInitializer=ConstructorInitializer?)
	 */
	protected void sequence_ConstructorDeclarator(EObject context, Identifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ContinueStatement}
	 */
	protected void sequence_ContinueStatement(EObject context, ContinueStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (firstType=Type type=Type conversionName=Identifier)
	 */
	protected void sequence_ConversionOperatorDeclarator(EObject context, ConversionOperatorDeclarator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.OPERATOR_DECLARATOR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.OPERATOR_DECLARATOR__TYPE));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.CONVERSION_OPERATOR_DECLARATOR__FIRST_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.CONVERSION_OPERATOR_DECLARATOR__FIRST_TYPE));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.CONVERSION_OPERATOR_DECLARATOR__CONVERSION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.CONVERSION_OPERATOR_DECLARATOR__CONVERSION_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConversionOperatorDeclaratorAccess().getFirstTypeTypeParserRuleCall_2_0(), semanticObject.getFirstType());
		feeder.accept(grammarAccess.getConversionOperatorDeclaratorAccess().getTypeTypeParserRuleCall_4_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getConversionOperatorDeclaratorAccess().getConversionNameIdentifierParserRuleCall_5_0(), semanticObject.getConversionName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (localVariableDeclaration=LocalVariableDeclaration | localCOnstant=LocalConstantDeclaration)
	 */
	protected void sequence_DeclarationStatement(EObject context, DeclarationStatment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=Identifier formalParameters=FormalParameterList?)
	 */
	protected void sequence_DelegateDeclaration_TypeOrVoid(EObject context, TypeOrVoid semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier formalParameters=FormalParameterList?)
	 */
	protected void sequence_DelegateDeclaration(EObject context, org.xtext.example.myModel.cSharp.Void semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier emptyBlock=MaybeEmptyBlock)
	 */
	protected void sequence_DestructorDeclaration(EObject context, DestructorDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.DESTRUCTOR_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.DESTRUCTOR_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.DESTRUCTOR_DECLARATION__EMPTY_BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.DESTRUCTOR_DECLARATION__EMPTY_BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDestructorDeclarationAccess().getNameIdentifierParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDestructorDeclarationAccess().getEmptyBlockMaybeEmptyBlockParserRuleCall_5_0(), semanticObject.getEmptyBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (embeddedStatement=EmbeddedStatement expression=Expression)
	 */
	protected void sequence_DoStatement(EObject context, DoStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.DO_STATEMENT__EMBEDDED_STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.DO_STATEMENT__EMBEDDED_STATEMENT));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.DO_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.DO_STATEMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoStatementAccess().getEmbeddedStatementEmbeddedStatementParserRuleCall_1_1_0(), semanticObject.getEmbeddedStatement());
		feeder.accept(grammarAccess.getDoStatementAccess().getExpressionExpressionParserRuleCall_1_4_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     embeddedStatement=EmbeddedStatement
	 */
	protected void sequence_ElsePart(EObject context, ElsePart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.ELSE_PART__EMBEDDED_STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.ELSE_PART__EMBEDDED_STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getElsePartAccess().getEmbeddedStatementEmbeddedStatementParserRuleCall_1_1_0(), semanticObject.getEmbeddedStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         maybeEmpty=MaybeEmptyBlock | 
	 *         statExp=StatementExpression | 
	 *         selectionStat=SelectionStatement | 
	 *         iterationStat=IterationStatement | 
	 *         jumpStat=JumpStatement | 
	 *         tryStat=TryStatement | 
	 *         block=Block | 
	 *         lockStat=LockStatement | 
	 *         usingStat=UsingStatement
	 *     )
	 */
	protected void sequence_EmbeddedStatement(EObject context, EmbeddedStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EnumBody}
	 */
	protected void sequence_EnumBody(EObject context, EnumBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier intType=IntegralType? enumBody=EnumBody)
	 */
	protected void sequence_EnumDeclaration(EObject context, EnumDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (att=Attributes name=Identifier exp=Expression?)
	 */
	protected void sequence_EnumMemberDeclaration(EObject context, EnumMemberDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         att1=Attributes 
	 *         (
	 *             (addAccessor=AddAccessorDeclaration att=Attributes removAccessor=RemoveAccessorDeclaration) | 
	 *             (removAccessor=RemoveAccessorDeclaration att=Attributes addAccessor=AddAccessorDeclaration)
	 *         )
	 *     )
	 */
	protected void sequence_EventAccessorDeclarations(EObject context, EventAccessorDeclarations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         nonArray=NonArrayType 
	 *         (variableDeclarator+=VariableDeclarator+ | (qIdent=QualifiedIdentifier eventAccessorDeclarations=EventAccessorDeclarations))
	 *     )
	 */
	protected void sequence_EventDeclaration_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (internalExp+=Expression exp+=Expression internalExp2+=Expression2) | 
	 *             (exp+=Expression internalExp2+=Expression2) | 
	 *             (exp+=Expression internalExp2+=Expression2) | 
	 *             (exp+=Expression internalExp2+=Expression2) | 
	 *             (exp+=Expression internalExp2+=Expression2) | 
	 *             (exp+=Expression internalExp2+=Expression2) | 
	 *             (exp+=Expression internalExp2+=Expression2) | 
	 *             (exp+=Expression internalExp2+=Expression2) | 
	 *             (buildInType+=BuiltInType internalExp2+=Expression2) | 
	 *             (exp+=Expression internalExp2+=Expression2) | 
	 *             (exp+=Expression internalExp2+=Expression2) | 
	 *             (exp+=Expression internalExp2+=Expression2) | 
	 *             (exp+=Expression internalExp2+=Expression2) | 
	 *             (exp+=Expression internalExp2+=Expression2)
	 *         )*
	 *     )
	 */
	protected void sequence_Expression2(EObject context, Expression2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expresions+=Expression+
	 */
	protected void sequence_ExpressionList(EObject context, ExpressionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unary=UnaryExpression (exp2=Expression2 | (exp=Expression otherExp2=Expression2)))
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nonArray=NonArrayType variables+=VariableDeclarator+)
	 */
	protected void sequence_FieldDeclaration_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     block=Block
	 */
	protected void sequence_FinallyClause(EObject context, FinallyClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.FINALLY_CLAUSE__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.FINALLY_CLAUSE__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFinallyClauseAccess().getBlockBlockParserRuleCall_2_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=Identifier)
	 */
	protected void sequence_FixedParameter(EObject context, FixedParameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.FIXED_PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.FIXED_PARAMETER__TYPE));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.FIXED_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.FIXED_PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFixedParameterAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getFixedParameterAccess().getNameIdentifierParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     fixParameters+=FixedParameter+
	 */
	protected void sequence_FixedParameters(EObject context, FixedParameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fixParameters+=FixedParameter+ (parameterArray=ParameterArray | parameterArray=ParameterArray))
	 */
	protected void sequence_FixedParameters_FormalParameterList(EObject context, FixedParameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (localVariableDeclaration=LocalVariableDeclaration | statementExpressionList=StatementExpressionList)
	 */
	protected void sequence_ForInitializer(EObject context, ForInitializer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (forInitializer+=ForInitializer? expression+=Expression? statementExpressionList+=StatementExpressionList? embeddedStatement=EmbeddedStatement)
	 */
	protected void sequence_ForStatement(EObject context, ForStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tipo=Type id=Identifier expression=Expression embeddedStatement=EmbeddedStatement)
	 */
	protected void sequence_ForeachStatement(EObject context, ForeachStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.FOREACH_STATEMENT__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.FOREACH_STATEMENT__TIPO));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.FOREACH_STATEMENT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.FOREACH_STATEMENT__ID));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.FOREACH_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.FOREACH_STATEMENT__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.FOREACH_STATEMENT__EMBEDDED_STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.FOREACH_STATEMENT__EMBEDDED_STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForeachStatementAccess().getTipoTypeParserRuleCall_1_2_0(), semanticObject.getTipo());
		feeder.accept(grammarAccess.getForeachStatementAccess().getIdIdentifierParserRuleCall_1_3_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getForeachStatementAccess().getExpressionExpressionParserRuleCall_1_5_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getForeachStatementAccess().getEmbeddedStatementEmbeddedStatementParserRuleCall_1_7_0(), semanticObject.getEmbeddedStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     block=Block
	 */
	protected void sequence_GeneralCatchClause(EObject context, GeneralCatchclause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.GENERAL_CATCHCLAUSE__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.GENERAL_CATCHCLAUSE__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGeneralCatchClauseAccess().getBlockBlockParserRuleCall_2_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (globalAttSections+=GlobalAttributeSection*)
	 */
	protected void sequence_GlobalAttributes(EObject context, GlobalAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=Identifier expression=Expression)
	 */
	protected void sequence_GotoStatement(EObject context, GotoStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.GOTO_STATEMENT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.GOTO_STATEMENT__ID));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.GOTO_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.GOTO_STATEMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGotoStatementAccess().getIdIdentifierParserRuleCall_1_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getGotoStatementAccess().getExpressionExpressionParserRuleCall_1_5_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Identifier}
	 */
	protected void sequence_Identifier(EObject context, Identifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression embeddedStatement=EmbeddedStatement elsePart=ElsePart?)
	 */
	protected void sequence_IfStatement(EObject context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (idModifier+=IndexerModifier* indexerDeclarator=IndexerDeclarator accDeclaration=AccessorDeclarations)
	 */
	protected void sequence_IndexerDeclaration(EObject context, IndexerDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (idModifier+=IndexerModifier* indexerDeclarator=IndexerDeclarator accDeclaration=AccessorDeclarations structMember2+=StructMemberDeclarations2)
	 */
	protected void sequence_IndexerDeclaration_StructMemberDeclarations2(EObject context, IndexerDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (idModifier+=IndexerModifier* indexerDeclarator=IndexerDeclarator accDeclaration=AccessorDeclarations structMember2+=StructMemberDeclarations2*)
	 */
	protected void sequence_IndexerDeclaration_StructMemberDeclarations(EObject context, IndexerDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type (formalList=FormalParameterList | (qualifiedId=QualifiedIdentifier formalList=FormalParameterList)))
	 */
	protected void sequence_IndexerDeclarator(EObject context, IndexerDeclarator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IntegralType}
	 */
	protected void sequence_IntegralType(EObject context, IntegralType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (att=Attributes (newAtt=Attributes? | otherAtt=Attributes?))
	 */
	protected void sequence_InterfaceAccessors(EObject context, InterfaceAccessors semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (interfaceMemberDeclarations+=InterfaceMemberDeclaration*)
	 */
	protected void sequence_InterfaceBody(EObject context, InterfaceBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier qIdentifiers=QualifiedIdentifierList? interBody=InterfaceBody?)
	 */
	protected void sequence_InterfaceDeclaration(EObject context, InterfaceDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=Identifier)
	 */
	protected void sequence_InterfaceEventDeclaration(EObject context, InterfaceEventDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.INTERFACE_EVENT_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.INTERFACE_EVENT_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.INTERFACE_EVENT_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.INTERFACE_EVENT_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInterfaceEventDeclarationAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInterfaceEventDeclarationAccess().getNameIdentifierParserRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameterList=FormalParameterList interAccessors=InterfaceAccessors)
	 */
	protected void sequence_InterfaceIndexerDeclaration(EObject context, InterfaceIndexerDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.INTERFACE_INDEXER_DECLARATION__PARAMETER_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.INTERFACE_INDEXER_DECLARATION__PARAMETER_LIST));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.INTERFACE_INDEXER_DECLARATION__INTER_ACCESSORS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.INTERFACE_INDEXER_DECLARATION__INTER_ACCESSORS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInterfaceIndexerDeclarationAccess().getParameterListFormalParameterListParserRuleCall_3_0(), semanticObject.getParameterList());
		feeder.accept(grammarAccess.getInterfaceIndexerDeclarationAccess().getInterAccessorsInterfaceAccessorsParserRuleCall_6_0(), semanticObject.getInterAccessors());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         intermethodDeclaration=InterfaceMethodDeclaration | 
	 *         interEventDeclaration=InterfaceEventDeclaration | 
	 *         (type1=Type (interfaceIndexerDecla=InterfaceIndexerDeclaration | interProperty=InterfacePropertyDeclaration))
	 *     )
	 */
	protected void sequence_InterfaceMemberDeclaration(EObject context, InterfaceMemberDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeOrVoid name=Identifier parameterList=FormalParameterList?)
	 */
	protected void sequence_InterfaceMethodDeclaration(EObject context, InterfaceMethodDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier interAccessor=InterfaceAccessors)
	 */
	protected void sequence_InterfacePropertyDeclaration(EObject context, InterfacePropertyDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.INTERFACE_PROPERTY_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.INTERFACE_PROPERTY_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.INTERFACE_PROPERTY_DECLARATION__INTER_ACCESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.INTERFACE_PROPERTY_DECLARATION__INTER_ACCESSOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInterfacePropertyDeclarationAccess().getNameIdentifierParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInterfacePropertyDeclarationAccess().getInterAccessorInterfaceAccessorsParserRuleCall_3_0(), semanticObject.getInterAccessor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (whileStatement=WhileStatement | doStatement=DoStatement | forStatement=ForStatement | foreachStatement=ForeachStatement)
	 */
	protected void sequence_IterationStatement(EObject context, IterationStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (breakStat=BreakStatement | continueStat=ContinueStatement | gotoStat=GotoStatement | returnStat=ReturnStatement | throwStat=ThrowStatement)
	 */
	protected void sequence_JumpStatement(EObject context, JumpStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=Identifier stat=Statement)
	 */
	protected void sequence_LabeledStatement(EObject context, LabeledStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.LABELED_STATEMENT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.LABELED_STATEMENT__ID));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.LABELED_STATEMENT__STAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.LABELED_STATEMENT__STAT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLabeledStatementAccess().getIdIdentifierParserRuleCall_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getLabeledStatementAccess().getStatStatementParserRuleCall_3_0(), semanticObject.getStat());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tipo=Type constDeclarator+=ConstantDeclarator+)
	 */
	protected void sequence_LocalConstantDeclaration(EObject context, LocalconstantDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tipo=Type variable+=VariableDeclarator+)
	 */
	protected void sequence_LocalVariableDeclaration(EObject context, LocalVariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp=Expression embeddedStat=EmbeddedStatement)
	 */
	protected void sequence_LockStatement(EObject context, LockStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.LOCK_STATEMENT__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.LOCK_STATEMENT__EXP));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.LOCK_STATEMENT__EMBEDDED_STAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.LOCK_STATEMENT__EMBEDDED_STAT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLockStatementAccess().getExpExpressionParserRuleCall_3_0(), semanticObject.getExp());
		feeder.accept(grammarAccess.getLockStatementAccess().getEmbeddedStatEmbeddedStatementParserRuleCall_5_0(), semanticObject.getEmbeddedStat());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (statement+=Statement*)
	 */
	protected void sequence_MaybeEmptyBlock(EObject context, MaybeEmptyBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (methodHeader=MethodHeader maybeEmpty=MaybeEmptyBlock)
	 */
	protected void sequence_MethodDeclaration(EObject context, MethodDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (methodHeader=MethodHeader maybeEmpty=MaybeEmptyBlock structMember2+=StructMemberDeclarations2)
	 */
	protected void sequence_MethodDeclaration_StructMemberDeclarations2(EObject context, MethodDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (methodHeader=MethodHeader maybeEmpty=MaybeEmptyBlock structMember2+=StructMemberDeclarations2*)
	 */
	protected void sequence_MethodDeclaration_StructMemberDeclarations(EObject context, MethodDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     inputs+=CompilationUnit
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (usingDirectives+=UsingDirective* nameSpaces+=NamespaceMemberDeclaration*)
	 */
	protected void sequence_NamespaceBody(EObject context, NamespaceBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qId=QualifiedIdentifier nameBody=NamespaceBody)
	 */
	protected void sequence_NamespaceDeclaration(EObject context, NamespaceDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.NAMESPACE_DECLARATION__QID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.NAMESPACE_DECLARATION__QID));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.NAMESPACE_DECLARATION__NAME_BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.NAMESPACE_DECLARATION__NAME_BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamespaceDeclarationAccess().getQIdQualifiedIdentifierParserRuleCall_1_0(), semanticObject.getQId());
		feeder.accept(grammarAccess.getNamespaceDeclarationAccess().getNameBodyNamespaceBodyParserRuleCall_2_0(), semanticObject.getNameBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nameDeclaretion=NamespaceDeclaration
	 */
	protected void sequence_NamespaceMemberDeclaration(EObject context, NamespaceMemberDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qualified=QualifiedIdentifier | builtType=BuiltInType)
	 */
	protected void sequence_NonArrayType(EObject context, NonArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opModifier+=OperatorModifier+ opDeclarator=OperatorDeclarator emptyBlock=MaybeEmptyBlock)
	 */
	protected void sequence_OperatorDeclaration(EObject context, OperatorDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opModifier+=OperatorModifier+ opDeclarator=OperatorDeclarator emptyBlock=MaybeEmptyBlock structMember2+=StructMemberDeclarations2)
	 */
	protected void sequence_OperatorDeclaration_StructMemberDeclarations2(EObject context, OperatorDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opModifier+=OperatorModifier+ opDeclarator=OperatorDeclarator emptyBlock=MaybeEmptyBlock structMember2+=StructMemberDeclarations2*)
	 */
	protected void sequence_OperatorDeclaration_StructMemberDeclarations(EObject context, OperatorDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (att=Attributes array=ArrayType name=Identifier)
	 */
	protected void sequence_ParameterArray(EObject context, ParameterArray semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.PARAMETER_ARRAY__ATT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.PARAMETER_ARRAY__ATT));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.PARAMETER_ARRAY__ARRAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.PARAMETER_ARRAY__ARRAY));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.PARAMETER_ARRAY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.PARAMETER_ARRAY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterArrayAccess().getAttAttributesParserRuleCall_1_0(), semanticObject.getAtt());
		feeder.accept(grammarAccess.getParameterArrayAccess().getArrayArrayTypeParserRuleCall_3_0(), semanticObject.getArray());
		feeder.accept(grammarAccess.getParameterArrayAccess().getNameIdentifierParserRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (id+=Identifier | argumentList+=ArgumentList | expressionList+=ExpressionList | incrementeDecrement+=INCREMENT_DECREMENT) 
	 *             primaryExpression2+=PrimaryExpression2
	 *         )*
	 *     )
	 */
	protected void sequence_PrimaryExpression2(EObject context, PrimaryExpression2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (nonArrayType=NonArrayType expressionList=ExpressionList rankSpecifier+=RANK_SPECIFIER* arrayInitializer+=ArrayInitializer?) | 
	 *             (arrayType=ArrayType arrayInitializer2=ArrayInitializer) | 
	 *             (tipo=Type argumentList=ArgumentList) | 
	 *             id=Identifier | 
	 *             literal=Literal | 
	 *             expression=Expression | 
	 *             id=Identifier | 
	 *             expressionList=ExpressionList | 
	 *             (predefinedType=PredefinedType id=Identifier) | 
	 *             typeOrVoid=TypeOrVoid | 
	 *             expression=Expression | 
	 *             expression=Expression
	 *         )? 
	 *         primaryExoression2=PrimaryExpression2
	 *     )
	 */
	protected void sequence_PrimaryExpression(EObject context, PrimaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nonArray=NonArrayType qualifiedId=QualifiedIdentifier accDeclarate=AccessorDeclarations)
	 */
	protected void sequence_PropertyDeclaration_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ids+=QualifiedIdentifier+
	 */
	protected void sequence_QualifiedIdentifierList(EObject context, QualifiedIdentifierList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ids+=Identifier+
	 */
	protected void sequence_QualifiedIdentifier(EObject context, QualifiedIdentifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression?)
	 */
	protected void sequence_ReturnStatement(EObject context, ReturnStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifStatement=IfStatement | switchStatement=SwitchStatement)
	 */
	protected void sequence_SelectionStatement(EObject context, SelectionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qualiId=QualifiedIdentifier? id=Identifier? block=Block)
	 */
	protected void sequence_SpecificCatchClause(EObject context, SpecificCatchClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     list+=StatementExpression+
	 */
	protected void sequence_StatementExpressionList(EObject context, StatementExpressionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (primaryExpression=PrimaryExpression (argumentList=ArgumentList | incrimentDecrement=INCREMENT_DECREMENT))
	 */
	protected void sequence_StatementExpression(EObject context, StatementExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     labelStat=LabeledStatement
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (staticCosntModifier=StaticConstructorModifiers name=Identifier emptyBlock=MaybeEmptyBlock)
	 */
	protected void sequence_StaticConstructorDeclaration(EObject context, StaticConstructorDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (staticCosntModifier=StaticConstructorModifiers name=Identifier emptyBlock=MaybeEmptyBlock structMember2+=StructMemberDeclarations2)
	 */
	protected void sequence_StaticConstructorDeclaration_StructMemberDeclarations2(EObject context, StaticConstructorDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (staticCosntModifier=StaticConstructorModifiers name=Identifier emptyBlock=MaybeEmptyBlock structMember2+=StructMemberDeclarations2*)
	 */
	protected void sequence_StaticConstructorDeclaration_StructMemberDeclarations(EObject context, StaticConstructorDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     structMember+=StructMemberDeclaration*
	 */
	protected void sequence_StructBody(EObject context, StructBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier qualId=QualifiedIdentifierList? structbody=StructBody)
	 */
	protected void sequence_StructDeclaration(EObject context, StructDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             classDeclaration=ClassDeclaration | 
	 *             (
	 *                 mod+=Modifier* 
	 *                 (
	 *                     structDeclaration=StructDeclaration | 
	 *                     interfaceDeclaration=InterfaceDeclaration | 
	 *                     enumDeclaration=EnumDeclaration | 
	 *                     delegateDeclaration=DelegateDeclaration
	 *                 )
	 *             )
	 *         ) 
	 *         structMember2+=StructMemberDeclarations2
	 *     )
	 */
	protected void sequence_StructMemberDeclarations2_TypeDeclaration(EObject context, TypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             classDeclaration=ClassDeclaration | 
	 *             (
	 *                 mod+=Modifier* 
	 *                 (
	 *                     structDeclaration=StructDeclaration | 
	 *                     interfaceDeclaration=InterfaceDeclaration | 
	 *                     enumDeclaration=EnumDeclaration | 
	 *                     delegateDeclaration=DelegateDeclaration
	 *                 )
	 *             )
	 *         ) 
	 *         structMember2+=StructMemberDeclarations2*
	 *     )
	 */
	protected void sequence_StructMemberDeclarations_TypeDeclaration(EObject context, TypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression?)
	 */
	protected void sequence_SwitchLabel(EObject context, SwitchLabel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (switchlabel+=SwitchLabel+ statement+=Statement+)
	 */
	protected void sequence_SwitchSection(EObject context, SwitchSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression switchSection+=SwitchSection*)
	 */
	protected void sequence_SwitchStatement(EObject context, SwitchStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression?)
	 */
	protected void sequence_ThrowStatement(EObject context, ThrowStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (block=Block ((catchClauses=CatchClauses finally=FinallyClause?) | finallyClause=FinallyClause))
	 */
	protected void sequence_TryStatement(EObject context, TryStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         classDeclaration=ClassDeclaration | 
	 *         (
	 *             mod+=Modifier* 
	 *             (
	 *                 structDeclaration=StructDeclaration | 
	 *                 interfaceDeclaration=InterfaceDeclaration | 
	 *                 enumDeclaration=EnumDeclaration | 
	 *                 delegateDeclaration=DelegateDeclaration
	 *             )
	 *         )
	 *     )
	 */
	protected void sequence_TypeDeclaration(EObject context, TypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=Type
	 */
	protected void sequence_TypeOrVoid(EObject context, TypeOrVoid semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Void}
	 */
	protected void sequence_TypeOrVoid(EObject context, org.xtext.example.myModel.cSharp.Void semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     nonArray=NonArrayType
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((expUnaryOperator=ExpressionUnaryOperator | type=Type) unaryExp=UnaryExpression)
	 */
	protected void sequence_UnaryExpression(EObject context, UnaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type otherType=Type name=Identifier)
	 */
	protected void sequence_UnaryOperatorDeclarator(EObject context, UnaryOperatorDeclarator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.OPERATOR_DECLARATOR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.OPERATOR_DECLARATOR__TYPE));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.UNARY_OPERATOR_DECLARATOR__OTHER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.UNARY_OPERATOR_DECLARATOR__OTHER_TYPE));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.UNARY_OPERATOR_DECLARATOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.UNARY_OPERATOR_DECLARATOR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnaryOperatorDeclaratorAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getUnaryOperatorDeclaratorAccess().getOtherTypeTypeParserRuleCall_4_0(), semanticObject.getOtherType());
		feeder.accept(grammarAccess.getUnaryOperatorDeclaratorAccess().getNameIdentifierParserRuleCall_5_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier? usings=QualifiedIdentifier)
	 */
	protected void sequence_UsingDirective(EObject context, UsingDirective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resourcAquisition=ResourceAquisition embeddedStat=EmbeddedStatement)
	 */
	protected void sequence_UsingStatement(EObject context, UsingStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.USING_STATEMENT__RESOURC_AQUISITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.USING_STATEMENT__RESOURC_AQUISITION));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.USING_STATEMENT__EMBEDDED_STAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.USING_STATEMENT__EMBEDDED_STAT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUsingStatementAccess().getResourcAquisitionResourceAquisitionParserRuleCall_1_2_0(), semanticObject.getResourcAquisition());
		feeder.accept(grammarAccess.getUsingStatementAccess().getEmbeddedStatEmbeddedStatementParserRuleCall_1_4_0(), semanticObject.getEmbeddedStat());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier variable=VariableInitializer?)
	 */
	protected void sequence_VariableDeclarator(EObject context, VariableDeclarator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression embeddedStatement=EmbeddedStatement)
	 */
	protected void sequence_WhileStatement(EObject context, WhileStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.WHILE_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.WHILE_STATEMENT__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, CSharpPackage.Literals.WHILE_STATEMENT__EMBEDDED_STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSharpPackage.Literals.WHILE_STATEMENT__EMBEDDED_STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhileStatementAccess().getExpressionExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getWhileStatementAccess().getEmbeddedStatementEmbeddedStatementParserRuleCall_5_0(), semanticObject.getEmbeddedStatement());
		feeder.finish();
	}
}
