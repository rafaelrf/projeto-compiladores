/*
* generated by Xtext
*/
package org.xtext.example.myModel.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.myModel.services.CSharpGrammarAccess;

public class CSharpParser extends AbstractContentAssistParser {
	
	@Inject
	private CSharpGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.myModel.ui.contentassist.antlr.internal.InternalCSharpParser createParser() {
		org.xtext.example.myModel.ui.contentassist.antlr.internal.InternalCSharpParser result = new org.xtext.example.myModel.ui.contentassist.antlr.internal.InternalCSharpParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getInputSectionPartAccess().getAlternatives(), "rule__InputSectionPart__Alternatives");
					put(grammarAccess.getPPDirectiveAccess().getAlternatives(), "rule__PPDirective__Alternatives");
					put(grammarAccess.getPPDiagnosticAccess().getAlternatives_1(), "rule__PPDiagnostic__Alternatives_1");
					put(grammarAccess.getLineIndicatorAccess().getAlternatives(), "rule__LineIndicator__Alternatives");
					put(grammarAccess.getPPEqualityExpression2Access().getAlternatives_0(), "rule__PPEqualityExpression2__Alternatives_0");
					put(grammarAccess.getPPUnaryExpressionAccess().getAlternatives(), "rule__PPUnaryExpression__Alternatives");
					put(grammarAccess.getPPPrimaryExpressionAccess().getAlternatives(), "rule__PPPrimaryExpression__Alternatives");
					put(grammarAccess.getPPDeclarationAccess().getAlternatives_1(), "rule__PPDeclaration__Alternatives_1");
					put(grammarAccess.getInputElementAccess().getAlternatives(), "rule__InputElement__Alternatives");
					put(grammarAccess.getTokenAccess().getAlternatives(), "rule__Token__Alternatives");
					put(grammarAccess.getKeywordsAccess().getAlternatives(), "rule__Keywords__Alternatives");
					put(grammarAccess.getPredefinedTypeAccess().getAlternatives(), "rule__PredefinedType__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getBooleanLiteralAccess().getAlternatives(), "rule__BooleanLiteral__Alternatives");
					put(grammarAccess.getIntegerLiteralAccess().getAlternatives(), "rule__IntegerLiteral__Alternatives");
					put(grammarAccess.getIntegerLiteralAccess().getAlternatives_0_0(), "rule__IntegerLiteral__Alternatives_0_0");
					put(grammarAccess.getRealLiteralAccess().getAlternatives(), "rule__RealLiteral__Alternatives");
					put(grammarAccess.getExponentPartAccess().getAlternatives(), "rule__ExponentPart__Alternatives");
					put(grammarAccess.getCharacterAccess().getAlternatives(), "rule__Character__Alternatives");
					put(grammarAccess.getEscapeSequenceAccess().getAlternatives(), "rule__EscapeSequence__Alternatives");
					put(grammarAccess.getUnicodeCharacterEscapeSequenceAccess().getAlternatives(), "rule__UnicodeCharacterEscapeSequence__Alternatives");
					put(grammarAccess.getStringLiteralAccess().getAlternatives(), "rule__StringLiteral__Alternatives");
					put(grammarAccess.getVerbatimStringCharacterAccess().getAlternatives(), "rule__VerbatimStringCharacter__Alternatives");
					put(grammarAccess.getRegularStringCharacterAccess().getAlternatives(), "rule__RegularStringCharacter__Alternatives");
					put(grammarAccess.getCommentAccess().getAlternatives(), "rule__Comment__Alternatives");
					put(grammarAccess.getIdentifierAccess().getAlternatives(), "rule__Identifier__Alternatives");
					put(grammarAccess.getIdentifierPartCharacterAccess().getAlternatives(), "rule__IdentifierPartCharacter__Alternatives");
					put(grammarAccess.getNamespaceMemberDeclarationAccess().getAlternatives(), "rule__NamespaceMemberDeclaration__Alternatives");
					put(grammarAccess.getTypeDeclarationAccess().getAlternatives(), "rule__TypeDeclaration__Alternatives");
					put(grammarAccess.getModifierAccess().getAlternatives(), "rule__Modifier__Alternatives");
					put(grammarAccess.getInterfaceMemberDeclarationAccess().getAlternatives_1(), "rule__InterfaceMemberDeclaration__Alternatives_1");
					put(grammarAccess.getInterfaceMemberDeclarationAccess().getAlternatives_1_2_1(), "rule__InterfaceMemberDeclaration__Alternatives_1_2_1");
					put(grammarAccess.getInterfaceAccessorsAccess().getAlternatives_1(), "rule__InterfaceAccessors__Alternatives_1");
					put(grammarAccess.getStructMemberDeclarationAccess().getAlternatives(), "rule__StructMemberDeclaration__Alternatives");
					put(grammarAccess.getClassDeclarationAccess().getAlternatives_0(), "rule__ClassDeclaration__Alternatives_0");
					put(grammarAccess.getClassMemberDeclarationAccess().getAlternatives_1(), "rule__ClassMemberDeclaration__Alternatives_1");
					put(grammarAccess.getClassMemberDeclarationAccess().getAlternatives_1_0_1(), "rule__ClassMemberDeclaration__Alternatives_1_0_1");
					put(grammarAccess.getStaticConstructorModifiersAccess().getAlternatives(), "rule__StaticConstructorModifiers__Alternatives");
					put(grammarAccess.getConstructorInitializerAccess().getAlternatives(), "rule__ConstructorInitializer__Alternatives");
					put(grammarAccess.getRefOrOutAccess().getAlternatives(), "rule__RefOrOut__Alternatives");
					put(grammarAccess.getConstructorModifierAccess().getAlternatives(), "rule__ConstructorModifier__Alternatives");
					put(grammarAccess.getOperatorDeclaratorAccess().getAlternatives(), "rule__OperatorDeclarator__Alternatives");
					put(grammarAccess.getConversionKindAccess().getAlternatives(), "rule__ConversionKind__Alternatives");
					put(grammarAccess.getOverloadableBinaryOperatorAccess().getAlternatives(), "rule__OverloadableBinaryOperator__Alternatives");
					put(grammarAccess.getOverloadableUnaryOperatorAccess().getAlternatives(), "rule__OverloadableUnaryOperator__Alternatives");
					put(grammarAccess.getOperatorModifierAccess().getAlternatives(), "rule__OperatorModifier__Alternatives");
					put(grammarAccess.getIndexerDeclaratorAccess().getAlternatives_1(), "rule__IndexerDeclarator__Alternatives_1");
					put(grammarAccess.getIndexerModifierAccess().getAlternatives(), "rule__IndexerModifier__Alternatives");
					put(grammarAccess.getEventDeclarationAccess().getAlternatives_3(), "rule__EventDeclaration__Alternatives_3");
					put(grammarAccess.getEventAccessorDeclarationsAccess().getAlternatives_1(), "rule__EventAccessorDeclarations__Alternatives_1");
					put(grammarAccess.getEventModifierAccess().getAlternatives(), "rule__EventModifier__Alternatives");
					put(grammarAccess.getAccessorDeclarationsAccess().getAlternatives_1(), "rule__AccessorDeclarations__Alternatives_1");
					put(grammarAccess.getPropertyModifierAccess().getAlternatives(), "rule__PropertyModifier__Alternatives");
					put(grammarAccess.getFormalParameterListAccess().getAlternatives_1(), "rule__FormalParameterList__Alternatives_1");
					put(grammarAccess.getTypeOrVoidAccess().getAlternatives(), "rule__TypeOrVoid__Alternatives");
					put(grammarAccess.getMethodModifierAccess().getAlternatives(), "rule__MethodModifier__Alternatives");
					put(grammarAccess.getVariableInitializerAccess().getAlternatives(), "rule__VariableInitializer__Alternatives");
					put(grammarAccess.getArrayInitializerAccess().getAlternatives(), "rule__ArrayInitializer__Alternatives");
					put(grammarAccess.getFieldModifierAccess().getAlternatives(), "rule__FieldModifier__Alternatives");
					put(grammarAccess.getClassBaseAccess().getAlternatives_1(), "rule__ClassBase__Alternatives_1");
					put(grammarAccess.getAttributeTargetAccess().getAlternatives(), "rule__AttributeTarget__Alternatives");
					put(grammarAccess.getExpression2Access().getAlternatives(), "rule__Expression2__Alternatives");
					put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
					put(grammarAccess.getUnaryExpressionAccess().getAlternatives_0_0(), "rule__UnaryExpression__Alternatives_0_0");
					put(grammarAccess.getExpressionUnaryOperatorAccess().getAlternatives(), "rule__ExpressionUnaryOperator__Alternatives");
					put(grammarAccess.getExpressionShiftOperatorAccess().getAlternatives(), "rule__ExpressionShiftOperator__Alternatives");
					put(grammarAccess.getExpressionRelationalOperatorAccess().getAlternatives(), "rule__ExpressionRelationalOperator__Alternatives");
					put(grammarAccess.getIntegralTypeAccess().getAlternatives(), "rule__IntegralType__Alternatives");
					put(grammarAccess.getNonArrayTypeAccess().getAlternatives(), "rule__NonArrayType__Alternatives");
					put(grammarAccess.getBuiltInTypeAccess().getAlternatives(), "rule__BuiltInType__Alternatives");
					put(grammarAccess.getBuiltInClassTypeAccess().getAlternatives(), "rule__BuiltInClassType__Alternatives");
					put(grammarAccess.getEnumBodyAccess().getAlternatives(), "rule__EnumBody__Alternatives");
					put(grammarAccess.getEnumModifierAccess().getAlternatives(), "rule__EnumModifier__Alternatives");
					put(grammarAccess.getEmbeddedStatementAccess().getAlternatives(), "rule__EmbeddedStatement__Alternatives");
					put(grammarAccess.getEmbeddedStatementAccess().getAlternatives_6_0(), "rule__EmbeddedStatement__Alternatives_6_0");
					put(grammarAccess.getResourceAquisitionAccess().getAlternatives(), "rule__ResourceAquisition__Alternatives");
					put(grammarAccess.getTryStatementAccess().getAlternatives_2(), "rule__TryStatement__Alternatives_2");
					put(grammarAccess.getCatchClausesAccess().getAlternatives(), "rule__CatchClauses__Alternatives");
					put(grammarAccess.getSpecificCatchClauseAccess().getAlternatives_2(), "rule__SpecificCatchClause__Alternatives_2");
					put(grammarAccess.getJumpStatementAccess().getAlternatives(), "rule__JumpStatement__Alternatives");
					put(grammarAccess.getIterationStatementAccess().getAlternatives(), "rule__IterationStatement__Alternatives");
					put(grammarAccess.getForInitializerAccess().getAlternatives(), "rule__ForInitializer__Alternatives");
					put(grammarAccess.getStatementExpressionAccess().getAlternatives(), "rule__StatementExpression__Alternatives");
					put(grammarAccess.getStatementExpressionAccess().getAlternatives_0_1(), "rule__StatementExpression__Alternatives_0_1");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives_0(), "rule__PrimaryExpression__Alternatives_0");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives_0_0_1(), "rule__PrimaryExpression__Alternatives_0_0_1");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives_0_4_1(), "rule__PrimaryExpression__Alternatives_0_4_1");
					put(grammarAccess.getPrimaryExpression2Access().getAlternatives_0(), "rule__PrimaryExpression2__Alternatives_0");
					put(grammarAccess.getSelectionStatementAccess().getAlternatives(), "rule__SelectionStatement__Alternatives");
					put(grammarAccess.getSwitchLabelAccess().getAlternatives(), "rule__SwitchLabel__Alternatives");
					put(grammarAccess.getMaybeEmptyBlockAccess().getAlternatives(), "rule__MaybeEmptyBlock__Alternatives");
					put(grammarAccess.getInputSectionPartAccess().getGroup_0(), "rule__InputSectionPart__Group_0__0");
					put(grammarAccess.getPPRegionAccess().getGroup(), "rule__PPRegion__Group__0");
					put(grammarAccess.getPPEndRegionAccess().getGroup(), "rule__PPEndRegion__Group__0");
					put(grammarAccess.getPPStartRegionAccess().getGroup(), "rule__PPStartRegion__Group__0");
					put(grammarAccess.getPPDiagnosticAccess().getGroup(), "rule__PPDiagnostic__Group__0");
					put(grammarAccess.getPPDiagnosticAccess().getGroup_1_0(), "rule__PPDiagnostic__Group_1_0__0");
					put(grammarAccess.getPPDiagnosticAccess().getGroup_1_1(), "rule__PPDiagnostic__Group_1_1__0");
					put(grammarAccess.getPPMessageAccess().getGroup(), "rule__PPMessage__Group__0");
					put(grammarAccess.getPPLineAccess().getGroup(), "rule__PPLine__Group__0");
					put(grammarAccess.getLineIndicatorAccess().getGroup_0(), "rule__LineIndicator__Group_0__0");
					put(grammarAccess.getFileNameAccess().getGroup(), "rule__FileName__Group__0");
					put(grammarAccess.getFileNameCharactersAccess().getGroup(), "rule__FileNameCharacters__Group__0");
					put(grammarAccess.getFileNameCharacters2Access().getGroup(), "rule__FileNameCharacters2__Group__0");
					put(grammarAccess.getPPInitialSectionAccess().getGroup(), "rule__PPInitialSection__Group__0");
					put(grammarAccess.getPPConditionalAccess().getGroup(), "rule__PPConditional__Group__0");
					put(grammarAccess.getPPEndifAccess().getGroup(), "rule__PPEndif__Group__0");
					put(grammarAccess.getPPElseSectionAccess().getGroup(), "rule__PPElseSection__Group__0");
					put(grammarAccess.getPPElifSectionsAccess().getGroup(), "rule__PPElifSections__Group__0");
					put(grammarAccess.getPPElifSections2Access().getGroup(), "rule__PPElifSections2__Group__0");
					put(grammarAccess.getPPElifSectionAccess().getGroup(), "rule__PPElifSection__Group__0");
					put(grammarAccess.getPPIfSectionAccess().getGroup(), "rule__PPIfSection__Group__0");
					put(grammarAccess.getPPOrExpressionAccess().getGroup(), "rule__PPOrExpression__Group__0");
					put(grammarAccess.getPPOrExpression2Access().getGroup(), "rule__PPOrExpression2__Group__0");
					put(grammarAccess.getPPAndExpressionAccess().getGroup(), "rule__PPAndExpression__Group__0");
					put(grammarAccess.getPPAndExpression2Access().getGroup(), "rule__PPAndExpression2__Group__0");
					put(grammarAccess.getPPEqualityExpressionAccess().getGroup(), "rule__PPEqualityExpression__Group__0");
					put(grammarAccess.getPPEqualityExpression2Access().getGroup(), "rule__PPEqualityExpression2__Group__0");
					put(grammarAccess.getPPUnaryExpressionAccess().getGroup_1(), "rule__PPUnaryExpression__Group_1__0");
					put(grammarAccess.getPPPrimaryExpressionAccess().getGroup_3(), "rule__PPPrimaryExpression__Group_3__0");
					put(grammarAccess.getPPDeclarationAccess().getGroup(), "rule__PPDeclaration__Group__0");
					put(grammarAccess.getPPNewLineAccess().getGroup(), "rule__PPNewLine__Group__0");
					put(grammarAccess.getPredefinedTypeAccess().getGroup_13(), "rule__PredefinedType__Group_13__0");
					put(grammarAccess.getIntegerLiteralAccess().getGroup_0(), "rule__IntegerLiteral__Group_0__0");
					put(grammarAccess.getIntegerLiteralAccess().getGroup_1(), "rule__IntegerLiteral__Group_1__0");
					put(grammarAccess.getRealLiteralAccess().getGroup_0(), "rule__RealLiteral__Group_0__0");
					put(grammarAccess.getRealLiteralAccess().getGroup_1(), "rule__RealLiteral__Group_1__0");
					put(grammarAccess.getRealLiteralAccess().getGroup_2(), "rule__RealLiteral__Group_2__0");
					put(grammarAccess.getExponentPartAccess().getGroup_0(), "rule__ExponentPart__Group_0__0");
					put(grammarAccess.getExponentPartAccess().getGroup_1(), "rule__ExponentPart__Group_1__0");
					put(grammarAccess.getCharacterLiteralAccess().getGroup(), "rule__CharacterLiteral__Group__0");
					put(grammarAccess.getCharacterAccess().getGroup_1(), "rule__Character__Group_1__0");
					put(grammarAccess.getUnicodeCharacterEscapeSequenceAccess().getGroup_0(), "rule__UnicodeCharacterEscapeSequence__Group_0__0");
					put(grammarAccess.getUnicodeCharacterEscapeSequenceAccess().getGroup_1(), "rule__UnicodeCharacterEscapeSequence__Group_1__0");
					put(grammarAccess.getHexadecimalEscapeSequenceAccess().getGroup(), "rule__HexadecimalEscapeSequence__Group__0");
					put(grammarAccess.getHexadecimalEscapeSequenceAccess().getGroup_2(), "rule__HexadecimalEscapeSequence__Group_2__0");
					put(grammarAccess.getHexadecimalEscapeSequenceAccess().getGroup_2_1(), "rule__HexadecimalEscapeSequence__Group_2_1__0");
					put(grammarAccess.getStringLiteralAccess().getGroup_0(), "rule__StringLiteral__Group_0__0");
					put(grammarAccess.getStringLiteralAccess().getGroup_1(), "rule__StringLiteral__Group_1__0");
					put(grammarAccess.getRegularStringCharacterAccess().getGroup_1(), "rule__RegularStringCharacter__Group_1__0");
					put(grammarAccess.getIdentifierAccess().getGroup_1(), "rule__Identifier__Group_1__0");
					put(grammarAccess.getIdentifierOrKeywordAccess().getGroup(), "rule__IdentifierOrKeyword__Group__0");
					put(grammarAccess.getCompilationUnitAccess().getGroup(), "rule__CompilationUnit__Group__0");
					put(grammarAccess.getNamespaceDeclarationAccess().getGroup(), "rule__NamespaceDeclaration__Group__0");
					put(grammarAccess.getNamespaceBodyAccess().getGroup(), "rule__NamespaceBody__Group__0");
					put(grammarAccess.getDelegateDeclarationAccess().getGroup(), "rule__DelegateDeclaration__Group__0");
					put(grammarAccess.getEnumDeclarationAccess().getGroup(), "rule__EnumDeclaration__Group__0");
					put(grammarAccess.getEnumDeclarationAccess().getGroup_2(), "rule__EnumDeclaration__Group_2__0");
					put(grammarAccess.getInterfaceDeclarationAccess().getGroup(), "rule__InterfaceDeclaration__Group__0");
					put(grammarAccess.getInterfaceDeclarationAccess().getGroup_2(), "rule__InterfaceDeclaration__Group_2__0");
					put(grammarAccess.getInterfaceBodyAccess().getGroup(), "rule__InterfaceBody__Group__0");
					put(grammarAccess.getInterfaceMemberDeclarationAccess().getGroup(), "rule__InterfaceMemberDeclaration__Group__0");
					put(grammarAccess.getInterfaceMemberDeclarationAccess().getGroup_1_2(), "rule__InterfaceMemberDeclaration__Group_1_2__0");
					put(grammarAccess.getInterfaceIndexerDeclarationAccess().getGroup(), "rule__InterfaceIndexerDeclaration__Group__0");
					put(grammarAccess.getInterfaceEventDeclarationAccess().getGroup(), "rule__InterfaceEventDeclaration__Group__0");
					put(grammarAccess.getInterfacePropertyDeclarationAccess().getGroup(), "rule__InterfacePropertyDeclaration__Group__0");
					put(grammarAccess.getInterfaceAccessorsAccess().getGroup(), "rule__InterfaceAccessors__Group__0");
					put(grammarAccess.getInterfaceAccessorsAccess().getGroup_1_0(), "rule__InterfaceAccessors__Group_1_0__0");
					put(grammarAccess.getInterfaceAccessorsAccess().getGroup_1_0_2(), "rule__InterfaceAccessors__Group_1_0_2__0");
					put(grammarAccess.getInterfaceAccessorsAccess().getGroup_1_1(), "rule__InterfaceAccessors__Group_1_1__0");
					put(grammarAccess.getInterfaceAccessorsAccess().getGroup_1_1_2(), "rule__InterfaceAccessors__Group_1_1_2__0");
					put(grammarAccess.getInterfaceMethodDeclarationAccess().getGroup(), "rule__InterfaceMethodDeclaration__Group__0");
					put(grammarAccess.getStructDeclarationAccess().getGroup(), "rule__StructDeclaration__Group__0");
					put(grammarAccess.getStructDeclarationAccess().getGroup_2(), "rule__StructDeclaration__Group_2__0");
					put(grammarAccess.getStructBodyAccess().getGroup(), "rule__StructBody__Group__0");
					put(grammarAccess.getStructMemberDeclarationsAccess().getGroup(), "rule__StructMemberDeclarations__Group__0");
					put(grammarAccess.getStructMemberDeclarations2Access().getGroup(), "rule__StructMemberDeclarations2__Group__0");
					put(grammarAccess.getClassDeclarationAccess().getGroup(), "rule__ClassDeclaration__Group__0");
					put(grammarAccess.getClassBodyAccess().getGroup(), "rule__ClassBody__Group__0");
					put(grammarAccess.getClassMemberDeclarationAccess().getGroup(), "rule__ClassMemberDeclaration__Group__0");
					put(grammarAccess.getClassMemberDeclarationAccess().getGroup_1_0(), "rule__ClassMemberDeclaration__Group_1_0__0");
					put(grammarAccess.getStaticConstructorDeclarationAccess().getGroup(), "rule__StaticConstructorDeclaration__Group__0");
					put(grammarAccess.getStaticConstructorModifiersAccess().getGroup_0(), "rule__StaticConstructorModifiers__Group_0__0");
					put(grammarAccess.getStaticConstructorModifiersAccess().getGroup_1(), "rule__StaticConstructorModifiers__Group_1__0");
					put(grammarAccess.getDestructorDeclarationAccess().getGroup(), "rule__DestructorDeclaration__Group__0");
					put(grammarAccess.getConstructorDeclarationAccess().getGroup(), "rule__ConstructorDeclaration__Group__0");
					put(grammarAccess.getConstructorDeclaratorAccess().getGroup(), "rule__ConstructorDeclarator__Group__0");
					put(grammarAccess.getConstructorInitializerAccess().getGroup_0(), "rule__ConstructorInitializer__Group_0__0");
					put(grammarAccess.getConstructorInitializerAccess().getGroup_1(), "rule__ConstructorInitializer__Group_1__0");
					put(grammarAccess.getArgumentListAccess().getGroup(), "rule__ArgumentList__Group__0");
					put(grammarAccess.getArgumentAccess().getGroup(), "rule__Argument__Group__0");
					put(grammarAccess.getOperatorDeclarationAccess().getGroup(), "rule__OperatorDeclaration__Group__0");
					put(grammarAccess.getConversionOperatorDeclaratorAccess().getGroup(), "rule__ConversionOperatorDeclarator__Group__0");
					put(grammarAccess.getBinaryOperatorDeclaratorAccess().getGroup(), "rule__BinaryOperatorDeclarator__Group__0");
					put(grammarAccess.getUnaryOperatorDeclaratorAccess().getGroup(), "rule__UnaryOperatorDeclarator__Group__0");
					put(grammarAccess.getIndexerDeclarationAccess().getGroup(), "rule__IndexerDeclaration__Group__0");
					put(grammarAccess.getIndexerDeclaratorAccess().getGroup(), "rule__IndexerDeclarator__Group__0");
					put(grammarAccess.getIndexerDeclaratorAccess().getGroup_1_0(), "rule__IndexerDeclarator__Group_1_0__0");
					put(grammarAccess.getIndexerDeclaratorAccess().getGroup_1_1(), "rule__IndexerDeclarator__Group_1_1__0");
					put(grammarAccess.getEventDeclarationAccess().getGroup(), "rule__EventDeclaration__Group__0");
					put(grammarAccess.getEventDeclarationAccess().getGroup_3_0(), "rule__EventDeclaration__Group_3_0__0");
					put(grammarAccess.getEventDeclarationAccess().getGroup_3_0_0(), "rule__EventDeclaration__Group_3_0_0__0");
					put(grammarAccess.getEventDeclarationAccess().getGroup_3_1(), "rule__EventDeclaration__Group_3_1__0");
					put(grammarAccess.getEventAccessorDeclarationsAccess().getGroup(), "rule__EventAccessorDeclarations__Group__0");
					put(grammarAccess.getEventAccessorDeclarationsAccess().getGroup_1_0(), "rule__EventAccessorDeclarations__Group_1_0__0");
					put(grammarAccess.getEventAccessorDeclarationsAccess().getGroup_1_1(), "rule__EventAccessorDeclarations__Group_1_1__0");
					put(grammarAccess.getRemoveAccessorDeclarationAccess().getGroup(), "rule__RemoveAccessorDeclaration__Group__0");
					put(grammarAccess.getAddAccessorDeclarationAccess().getGroup(), "rule__AddAccessorDeclaration__Group__0");
					put(grammarAccess.getPropertyDeclarationAccess().getGroup(), "rule__PropertyDeclaration__Group__0");
					put(grammarAccess.getAccessorDeclarationsAccess().getGroup(), "rule__AccessorDeclarations__Group__0");
					put(grammarAccess.getAccessorDeclarationsAccess().getGroup_1_0(), "rule__AccessorDeclarations__Group_1_0__0");
					put(grammarAccess.getAccessorDeclarationsAccess().getGroup_1_1(), "rule__AccessorDeclarations__Group_1_1__0");
					put(grammarAccess.getSetAccessorDeclarationAccess().getGroup(), "rule__SetAccessorDeclaration__Group__0");
					put(grammarAccess.getGetAccessorDeclarationAccess().getGroup(), "rule__GetAccessorDeclaration__Group__0");
					put(grammarAccess.getMethodDeclarationAccess().getGroup(), "rule__MethodDeclaration__Group__0");
					put(grammarAccess.getMethodHeaderAccess().getGroup(), "rule__MethodHeader__Group__0");
					put(grammarAccess.getFormalParameterListAccess().getGroup(), "rule__FormalParameterList__Group__0");
					put(grammarAccess.getFormalParameterListAccess().getGroup_1_0(), "rule__FormalParameterList__Group_1_0__0");
					put(grammarAccess.getParameterArrayAccess().getGroup(), "rule__ParameterArray__Group__0");
					put(grammarAccess.getFixedParametersAccess().getGroup(), "rule__FixedParameters__Group__0");
					put(grammarAccess.getFixedParameterAccess().getGroup(), "rule__FixedParameter__Group__0");
					put(grammarAccess.getFieldDeclarationAccess().getGroup(), "rule__FieldDeclaration__Group__0");
					put(grammarAccess.getFieldDeclarationAccess().getGroup_2(), "rule__FieldDeclaration__Group_2__0");
					put(grammarAccess.getVariableDeclaratorAccess().getGroup(), "rule__VariableDeclarator__Group__0");
					put(grammarAccess.getArrayInitializerAccess().getGroup_0(), "rule__ArrayInitializer__Group_0__0");
					put(grammarAccess.getArrayInitializerAccess().getGroup_1(), "rule__ArrayInitializer__Group_1__0");
					put(grammarAccess.getArrayInitializerAccess().getGroup_1_1(), "rule__ArrayInitializer__Group_1_1__0");
					put(grammarAccess.getConstantDeclarationAccess().getGroup(), "rule__ConstantDeclaration__Group__0");
					put(grammarAccess.getConstantDeclarationAccess().getGroup_2(), "rule__ConstantDeclaration__Group_2__0");
					put(grammarAccess.getConstantDeclaratorAccess().getGroup(), "rule__ConstantDeclarator__Group__0");
					put(grammarAccess.getClassBaseAccess().getGroup(), "rule__ClassBase__Group__0");
					put(grammarAccess.getClassBaseAccess().getGroup_1_1(), "rule__ClassBase__Group_1_1__0");
					put(grammarAccess.getClassBaseAccess().getGroup_1_1_1(), "rule__ClassBase__Group_1_1_1__0");
					put(grammarAccess.getQualifiedIdentifierListAccess().getGroup(), "rule__QualifiedIdentifierList__Group__0");
					put(grammarAccess.getGlobalAttributeSectionAccess().getGroup(), "rule__GlobalAttributeSection__Group__0");
					put(grammarAccess.getAttributeSectionAccess().getGroup(), "rule__AttributeSection__Group__0");
					put(grammarAccess.getAttributeSectionAccess().getGroup_1(), "rule__AttributeSection__Group_1__0");
					put(grammarAccess.getAttributeListAccess().getGroup(), "rule__AttributeList__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeArgumentsAccess().getGroup(), "rule__AttributeArguments__Group__0");
					put(grammarAccess.getExpressionListAccess().getGroup(), "rule__ExpressionList__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getExpression2Access().getGroup_0(), "rule__Expression2__Group_0__0");
					put(grammarAccess.getExpression2Access().getGroup_1(), "rule__Expression2__Group_1__0");
					put(grammarAccess.getExpression2Access().getGroup_2(), "rule__Expression2__Group_2__0");
					put(grammarAccess.getExpression2Access().getGroup_3(), "rule__Expression2__Group_3__0");
					put(grammarAccess.getExpression2Access().getGroup_4(), "rule__Expression2__Group_4__0");
					put(grammarAccess.getExpression2Access().getGroup_5(), "rule__Expression2__Group_5__0");
					put(grammarAccess.getExpression2Access().getGroup_6(), "rule__Expression2__Group_6__0");
					put(grammarAccess.getExpression2Access().getGroup_7(), "rule__Expression2__Group_7__0");
					put(grammarAccess.getExpression2Access().getGroup_8(), "rule__Expression2__Group_8__0");
					put(grammarAccess.getExpression2Access().getGroup_9(), "rule__Expression2__Group_9__0");
					put(grammarAccess.getExpression2Access().getGroup_10(), "rule__Expression2__Group_10__0");
					put(grammarAccess.getExpression2Access().getGroup_11(), "rule__Expression2__Group_11__0");
					put(grammarAccess.getExpression2Access().getGroup_12(), "rule__Expression2__Group_12__0");
					put(grammarAccess.getExpression2Access().getGroup_13(), "rule__Expression2__Group_13__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup_0(), "rule__UnaryExpression__Group_0__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup_0_0_1(), "rule__UnaryExpression__Group_0_0_1__0");
					put(grammarAccess.getUsingDirectiveAccess().getGroup(), "rule__UsingDirective__Group__0");
					put(grammarAccess.getUsingDirectiveAccess().getGroup_1(), "rule__UsingDirective__Group_1__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getArrayTypeAccess().getGroup(), "rule__ArrayType__Group__0");
					put(grammarAccess.getEnumTypeAccess().getGroup(), "rule__EnumType__Group__0");
					put(grammarAccess.getEnumTypeAccess().getGroup_4(), "rule__EnumType__Group_4__0");
					put(grammarAccess.getQualifiedIdentifierAccess().getGroup(), "rule__QualifiedIdentifier__Group__0");
					put(grammarAccess.getEnumBodyAccess().getGroup_0(), "rule__EnumBody__Group_0__0");
					put(grammarAccess.getEnumBodyAccess().getGroup_1(), "rule__EnumBody__Group_1__0");
					put(grammarAccess.getEnumBodyAccess().getGroup_1_1(), "rule__EnumBody__Group_1_1__0");
					put(grammarAccess.getEnumMemberDeclarationAccess().getGroup(), "rule__EnumMemberDeclaration__Group__0");
					put(grammarAccess.getEnumMemberDeclarationAccess().getGroup_2(), "rule__EnumMemberDeclaration__Group_2__0");
					put(grammarAccess.getEmbeddedStatementAccess().getGroup_1(), "rule__EmbeddedStatement__Group_1__0");
					put(grammarAccess.getEmbeddedStatementAccess().getGroup_6(), "rule__EmbeddedStatement__Group_6__0");
					put(grammarAccess.getUsingStatementAccess().getGroup(), "rule__UsingStatement__Group__0");
					put(grammarAccess.getLocalVariableDeclarationAccess().getGroup(), "rule__LocalVariableDeclaration__Group__0");
					put(grammarAccess.getLocalVariableDeclarationAccess().getGroup_1(), "rule__LocalVariableDeclaration__Group_1__0");
					put(grammarAccess.getLockStatementAccess().getGroup(), "rule__LockStatement__Group__0");
					put(grammarAccess.getTryStatementAccess().getGroup(), "rule__TryStatement__Group__0");
					put(grammarAccess.getTryStatementAccess().getGroup_2_0(), "rule__TryStatement__Group_2_0__0");
					put(grammarAccess.getFinallyClauseAccess().getGroup(), "rule__FinallyClause__Group__0");
					put(grammarAccess.getCatchClausesAccess().getGroup_0(), "rule__CatchClauses__Group_0__0");
					put(grammarAccess.getCatchClausesAccess().getGroup_1(), "rule__CatchClauses__Group_1__0");
					put(grammarAccess.getGeneralCatchClauseAccess().getGroup(), "rule__GeneralCatchClause__Group__0");
					put(grammarAccess.getSpecificCatchClauseAccess().getGroup(), "rule__SpecificCatchClause__Group__0");
					put(grammarAccess.getThrowStatementAccess().getGroup(), "rule__ThrowStatement__Group__0");
					put(grammarAccess.getReturnStatementAccess().getGroup(), "rule__ReturnStatement__Group__0");
					put(grammarAccess.getGotoStatementAccess().getGroup(), "rule__GotoStatement__Group__0");
					put(grammarAccess.getContinueStatementAccess().getGroup(), "rule__ContinueStatement__Group__0");
					put(grammarAccess.getBreakStatementAccess().getGroup(), "rule__BreakStatement__Group__0");
					put(grammarAccess.getForeachStatementAccess().getGroup(), "rule__ForeachStatement__Group__0");
					put(grammarAccess.getForStatementAccess().getGroup(), "rule__ForStatement__Group__0");
					put(grammarAccess.getStatementExpressionListAccess().getGroup(), "rule__StatementExpressionList__Group__0");
					put(grammarAccess.getStatementExpressionAccess().getGroup_0(), "rule__StatementExpression__Group_0__0");
					put(grammarAccess.getStatementExpressionAccess().getGroup_0_1_0(), "rule__StatementExpression__Group_0_1_0__0");
					put(grammarAccess.getStatementExpressionAccess().getGroup_1(), "rule__StatementExpression__Group_1__0");
					put(grammarAccess.getStatementExpressionAccess().getGroup_2(), "rule__StatementExpression__Group_2__0");
					put(grammarAccess.getStatementExpressionAccess().getGroup_3(), "rule__StatementExpression__Group_3__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup(), "rule__PrimaryExpression__Group__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_0(), "rule__PrimaryExpression__Group_0_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_0_1_0(), "rule__PrimaryExpression__Group_0_0_1_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_0_1_1(), "rule__PrimaryExpression__Group_0_0_1_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_0_1_2(), "rule__PrimaryExpression__Group_0_0_1_2__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_3(), "rule__PrimaryExpression__Group_0_3__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_4(), "rule__PrimaryExpression__Group_0_4__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_4_1_0(), "rule__PrimaryExpression__Group_0_4_1_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_4_1_1(), "rule__PrimaryExpression__Group_0_4_1_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_5(), "rule__PrimaryExpression__Group_0_5__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_7(), "rule__PrimaryExpression__Group_0_7__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_8(), "rule__PrimaryExpression__Group_0_8__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_9(), "rule__PrimaryExpression__Group_0_9__0");
					put(grammarAccess.getPrimaryExpression2Access().getGroup(), "rule__PrimaryExpression2__Group__0");
					put(grammarAccess.getPrimaryExpression2Access().getGroup_0_0(), "rule__PrimaryExpression2__Group_0_0__0");
					put(grammarAccess.getPrimaryExpression2Access().getGroup_0_1(), "rule__PrimaryExpression2__Group_0_1__0");
					put(grammarAccess.getPrimaryExpression2Access().getGroup_0_2(), "rule__PrimaryExpression2__Group_0_2__0");
					put(grammarAccess.getDoStatementAccess().getGroup(), "rule__DoStatement__Group__0");
					put(grammarAccess.getWhileStatementAccess().getGroup(), "rule__WhileStatement__Group__0");
					put(grammarAccess.getSwitchStatementAccess().getGroup(), "rule__SwitchStatement__Group__0");
					put(grammarAccess.getSwitchSectionAccess().getGroup(), "rule__SwitchSection__Group__0");
					put(grammarAccess.getSwitchLabelAccess().getGroup_0(), "rule__SwitchLabel__Group_0__0");
					put(grammarAccess.getSwitchLabelAccess().getGroup_1(), "rule__SwitchLabel__Group_1__0");
					put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
					put(grammarAccess.getElsePartAccess().getGroup(), "rule__ElsePart__Group__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getMaybeEmptyBlockAccess().getGroup_0(), "rule__MaybeEmptyBlock__Group_0__0");
					put(grammarAccess.getModelAccess().getInputsAssignment(), "rule__Model__InputsAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.myModel.ui.contentassist.antlr.internal.InternalCSharpParser typedParser = (org.xtext.example.myModel.ui.contentassist.antlr.internal.InternalCSharpParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public CSharpGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CSharpGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
