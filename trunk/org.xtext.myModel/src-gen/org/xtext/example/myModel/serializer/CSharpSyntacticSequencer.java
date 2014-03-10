package org.xtext.example.myModel.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.myModel.services.CSharpGrammarAccess;

@SuppressWarnings("all")
public class CSharpSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CSharpGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Argument_RefOrOutParserRuleCall_0_q;
	protected AbstractElementAlias match_ArrayInitializer_CommaKeyword_1_2_q;
	protected AbstractElementAlias match_ArrayType_RANK_SPECIFIERTerminalRuleCall_1_p;
	protected AbstractElementAlias match_AttributeSection_CommaKeyword_3_q;
	protected AbstractElementAlias match_AttributeSection___AttributeTargetParserRuleCall_1_0_ColonKeyword_1_1__q;
	protected AbstractElementAlias match_BuiltInType_BoolKeyword_1_or_DecimalKeyword_2_or_DoubleKeyword_4_or_FloatKeyword_3;
	protected AbstractElementAlias match_ClassBase___BuiltInClassTypeParserRuleCall_1_1_0_CommaKeyword_1_1_1_0__q;
	protected AbstractElementAlias match_ClassDeclaration_SEMICOLONTerminalRuleCall_6_q;
	protected AbstractElementAlias match_ConstantDeclaration_ConstantModifierParserRuleCall_0_a;
	protected AbstractElementAlias match_ConstantDeclaration_EventDeclaration_FieldDeclaration_PropertyDeclaration_FieldModifierParserRuleCall_0_a_or_PropertyModifierParserRuleCall_0_a_or___ConstantModifierParserRuleCall_0_a_ConstKeyword_1___or___EventModifierParserRuleCall_0_a_EventKeyword_1__;
	protected AbstractElementAlias match_ConstructorInitializer___ColonKeyword_0_0_BaseKeyword_0_1_LeftParenthesisKeyword_0_2___or___ColonKeyword_1_0_ThisKeyword_1_1_LeftParenthesisKeyword_1_2__;
	protected AbstractElementAlias match_DestructorDeclaration_ExternKeyword_0_q;
	protected AbstractElementAlias match_EmbeddedStatement_CheckedKeyword_1_6_0_0_or_UncheckedKeyword_1_6_0_1;
	protected AbstractElementAlias match_EnumBody_CommaKeyword_1_2_q;
	protected AbstractElementAlias match_EnumDeclaration_SEMICOLONTerminalRuleCall_4_q;
	protected AbstractElementAlias match_EnumType_EnumModifierParserRuleCall_1_a;
	protected AbstractElementAlias match_EnumType_SEMICOLONTerminalRuleCall_6_q;
	protected AbstractElementAlias match_EventDeclaration_EventModifierParserRuleCall_0_a;
	protected AbstractElementAlias match_FieldDeclaration_FieldModifierParserRuleCall_0_a;
	protected AbstractElementAlias match_FixedParameter_ParameterModifierParserRuleCall_0_q;
	protected AbstractElementAlias match_GlobalAttributeSection_CommaKeyword_4_q;
	protected AbstractElementAlias match_Identifier_AvailableIdentifierParserRuleCall_0_1_or___CommercialAtKeyword_1_0_IDENTIFIER_START_CHARACTERTerminalRuleCall_1_1__;
	protected AbstractElementAlias match_IntegralType_ByteKeyword_1_or_CharKeyword_8_or_IntKeyword_4_or_LongKeyword_6_or_ShortKeyword_2_or_UintKeyword_5_or_UlongKeyword_7_or_UshortKeyword_3;
	protected AbstractElementAlias match_InterfaceAccessors___GetKeyword_1_0_0_SEMICOLONTerminalRuleCall_1_0_1___or___SetKeyword_1_1_0_SEMICOLONTerminalRuleCall_1_1_1__;
	protected AbstractElementAlias match_InterfaceDeclaration_SEMICOLONTerminalRuleCall_4_q;
	protected AbstractElementAlias match_InterfaceMemberDeclaration_NewKeyword_1_q;
	protected AbstractElementAlias match_MaybeEmptyBlock_SEMICOLONTerminalRuleCall_1_1_or___LeftCurlyBracketKeyword_1_0_0_RightCurlyBracketKeyword_1_0_2__;
	protected AbstractElementAlias match_MethodHeader_MethodModifierParserRuleCall_1_a;
	protected AbstractElementAlias match_NamespaceDeclaration_SEMICOLONTerminalRuleCall_3_q;
	protected AbstractElementAlias match_PropertyDeclaration_PropertyModifierParserRuleCall_0_a;
	protected AbstractElementAlias match_StructDeclaration_SEMICOLONTerminalRuleCall_4_q;
	protected AbstractElementAlias match_Type_RANK_SPECIFIERTerminalRuleCall_2_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CSharpGrammarAccess) access;
		match_Argument_RefOrOutParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getArgumentAccess().getRefOrOutParserRuleCall_0());
		match_ArrayInitializer_CommaKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getArrayInitializerAccess().getCommaKeyword_1_2());
		match_ArrayType_RANK_SPECIFIERTerminalRuleCall_1_p = new TokenAlias(true, false, grammarAccess.getArrayTypeAccess().getRANK_SPECIFIERTerminalRuleCall_1());
		match_AttributeSection_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getAttributeSectionAccess().getCommaKeyword_3());
		match_AttributeSection___AttributeTargetParserRuleCall_1_0_ColonKeyword_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeSectionAccess().getAttributeTargetParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getAttributeSectionAccess().getColonKeyword_1_1()));
		match_BuiltInType_BoolKeyword_1_or_DecimalKeyword_2_or_DoubleKeyword_4_or_FloatKeyword_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBuiltInTypeAccess().getBoolKeyword_1()), new TokenAlias(false, false, grammarAccess.getBuiltInTypeAccess().getDecimalKeyword_2()), new TokenAlias(false, false, grammarAccess.getBuiltInTypeAccess().getDoubleKeyword_4()), new TokenAlias(false, false, grammarAccess.getBuiltInTypeAccess().getFloatKeyword_3()));
		match_ClassBase___BuiltInClassTypeParserRuleCall_1_1_0_CommaKeyword_1_1_1_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getClassBaseAccess().getBuiltInClassTypeParserRuleCall_1_1_0()), new TokenAlias(false, false, grammarAccess.getClassBaseAccess().getCommaKeyword_1_1_1_0()));
		match_ClassDeclaration_SEMICOLONTerminalRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getClassDeclarationAccess().getSEMICOLONTerminalRuleCall_6());
		match_ConstantDeclaration_ConstantModifierParserRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getConstantDeclarationAccess().getConstantModifierParserRuleCall_0());
		match_ConstantDeclaration_EventDeclaration_FieldDeclaration_PropertyDeclaration_FieldModifierParserRuleCall_0_a_or_PropertyModifierParserRuleCall_0_a_or___ConstantModifierParserRuleCall_0_a_ConstKeyword_1___or___EventModifierParserRuleCall_0_a_EventKeyword_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getConstantDeclarationAccess().getConstantModifierParserRuleCall_0()), new TokenAlias(false, false, grammarAccess.getConstantDeclarationAccess().getConstKeyword_1())), new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getEventDeclarationAccess().getEventModifierParserRuleCall_0()), new TokenAlias(false, false, grammarAccess.getEventDeclarationAccess().getEventKeyword_1())), new TokenAlias(true, true, grammarAccess.getFieldDeclarationAccess().getFieldModifierParserRuleCall_0()), new TokenAlias(true, true, grammarAccess.getPropertyDeclarationAccess().getPropertyModifierParserRuleCall_0()));
		match_ConstructorInitializer___ColonKeyword_0_0_BaseKeyword_0_1_LeftParenthesisKeyword_0_2___or___ColonKeyword_1_0_ThisKeyword_1_1_LeftParenthesisKeyword_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getConstructorInitializerAccess().getColonKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getConstructorInitializerAccess().getBaseKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getConstructorInitializerAccess().getLeftParenthesisKeyword_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getConstructorInitializerAccess().getColonKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getConstructorInitializerAccess().getThisKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getConstructorInitializerAccess().getLeftParenthesisKeyword_1_2())));
		match_DestructorDeclaration_ExternKeyword_0_q = new TokenAlias(false, true, grammarAccess.getDestructorDeclarationAccess().getExternKeyword_0());
		match_EmbeddedStatement_CheckedKeyword_1_6_0_0_or_UncheckedKeyword_1_6_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getEmbeddedStatementAccess().getCheckedKeyword_1_6_0_0()), new TokenAlias(false, false, grammarAccess.getEmbeddedStatementAccess().getUncheckedKeyword_1_6_0_1()));
		match_EnumBody_CommaKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getEnumBodyAccess().getCommaKeyword_1_2());
		match_EnumDeclaration_SEMICOLONTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getEnumDeclarationAccess().getSEMICOLONTerminalRuleCall_4());
		match_EnumType_EnumModifierParserRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getEnumTypeAccess().getEnumModifierParserRuleCall_1());
		match_EnumType_SEMICOLONTerminalRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getEnumTypeAccess().getSEMICOLONTerminalRuleCall_6());
		match_EventDeclaration_EventModifierParserRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getEventDeclarationAccess().getEventModifierParserRuleCall_0());
		match_FieldDeclaration_FieldModifierParserRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getFieldDeclarationAccess().getFieldModifierParserRuleCall_0());
		match_FixedParameter_ParameterModifierParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getFixedParameterAccess().getParameterModifierParserRuleCall_0());
		match_GlobalAttributeSection_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getGlobalAttributeSectionAccess().getCommaKeyword_4());
		match_Identifier_AvailableIdentifierParserRuleCall_0_1_or___CommercialAtKeyword_1_0_IDENTIFIER_START_CHARACTERTerminalRuleCall_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getIdentifierAccess().getCommercialAtKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getIdentifierAccess().getIDENTIFIER_START_CHARACTERTerminalRuleCall_1_1())), new TokenAlias(false, false, grammarAccess.getIdentifierAccess().getAvailableIdentifierParserRuleCall_0_1()));
		match_IntegralType_ByteKeyword_1_or_CharKeyword_8_or_IntKeyword_4_or_LongKeyword_6_or_ShortKeyword_2_or_UintKeyword_5_or_UlongKeyword_7_or_UshortKeyword_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIntegralTypeAccess().getByteKeyword_1()), new TokenAlias(false, false, grammarAccess.getIntegralTypeAccess().getCharKeyword_8()), new TokenAlias(false, false, grammarAccess.getIntegralTypeAccess().getIntKeyword_4()), new TokenAlias(false, false, grammarAccess.getIntegralTypeAccess().getLongKeyword_6()), new TokenAlias(false, false, grammarAccess.getIntegralTypeAccess().getShortKeyword_2()), new TokenAlias(false, false, grammarAccess.getIntegralTypeAccess().getUintKeyword_5()), new TokenAlias(false, false, grammarAccess.getIntegralTypeAccess().getUlongKeyword_7()), new TokenAlias(false, false, grammarAccess.getIntegralTypeAccess().getUshortKeyword_3()));
		match_InterfaceAccessors___GetKeyword_1_0_0_SEMICOLONTerminalRuleCall_1_0_1___or___SetKeyword_1_1_0_SEMICOLONTerminalRuleCall_1_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getInterfaceAccessorsAccess().getGetKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getInterfaceAccessorsAccess().getSEMICOLONTerminalRuleCall_1_0_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getInterfaceAccessorsAccess().getSetKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getInterfaceAccessorsAccess().getSEMICOLONTerminalRuleCall_1_1_1())));
		match_InterfaceDeclaration_SEMICOLONTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getInterfaceDeclarationAccess().getSEMICOLONTerminalRuleCall_4());
		match_InterfaceMemberDeclaration_NewKeyword_1_q = new TokenAlias(false, true, grammarAccess.getInterfaceMemberDeclarationAccess().getNewKeyword_1());
		match_MaybeEmptyBlock_SEMICOLONTerminalRuleCall_1_1_or___LeftCurlyBracketKeyword_1_0_0_RightCurlyBracketKeyword_1_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMaybeEmptyBlockAccess().getLeftCurlyBracketKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getMaybeEmptyBlockAccess().getRightCurlyBracketKeyword_1_0_2())), new TokenAlias(false, false, grammarAccess.getMaybeEmptyBlockAccess().getSEMICOLONTerminalRuleCall_1_1()));
		match_MethodHeader_MethodModifierParserRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getMethodHeaderAccess().getMethodModifierParserRuleCall_1());
		match_NamespaceDeclaration_SEMICOLONTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getNamespaceDeclarationAccess().getSEMICOLONTerminalRuleCall_3());
		match_PropertyDeclaration_PropertyModifierParserRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getPropertyDeclarationAccess().getPropertyModifierParserRuleCall_0());
		match_StructDeclaration_SEMICOLONTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getStructDeclarationAccess().getSEMICOLONTerminalRuleCall_4());
		match_Type_RANK_SPECIFIERTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getTypeAccess().getRANK_SPECIFIERTerminalRuleCall_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getAMPERSANDRule())
			return getAMPERSANDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getAttributeTargetRule())
			return getAttributeTargetToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getAvailableIdentifierRule())
			return getAvailableIdentifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBARRule())
			return getBARToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBuiltInClassTypeRule())
			return getBuiltInClassTypeToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getConstantModifierRule())
			return getConstantModifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getConversionKindRule())
			return getConversionKindToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEXPRESSION_EQUALITY_OPERATORRule())
			return getEXPRESSION_EQUALITY_OPERATORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEnumModifierRule())
			return getEnumModifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEventModifierRule())
			return getEventModifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getExpressionRelationalOperatorRule())
			return getExpressionRelationalOperatorToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getExpressionShiftOperatorRule())
			return getExpressionShiftOperatorToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFieldModifierRule())
			return getFieldModifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIDENTIFIER_START_CHARACTERRule())
			return getIDENTIFIER_START_CHARACTERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMethodModifierRule())
			return getMethodModifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOPERATOR_OR_SIGNRule())
			return getOPERATOR_OR_SIGNToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOverloadableUnaryOperatorRule())
			return getOverloadableUnaryOperatorToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getParameterModifierRule())
			return getParameterModifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPropertyModifierRule())
			return getPropertyModifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRANK_SPECIFIERRule())
			return getRANK_SPECIFIERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRefOrOutRule())
			return getRefOrOutToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSEMICOLONRule())
			return getSEMICOLONToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal AMPERSAND:
	 * 	'&';
	 */
	protected String getAMPERSANDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "&";
	}
	
	/**
	 * AttributeTarget:
	 * 	'field'
	 * 	| 'event'
	 * 	| 'method'
	 * 	| 'module'
	 * 	| 'param'
	 * 	| 'property'
	 * 	| 'return'
	 * 	| 'type';
	 */
	protected String getAttributeTargetToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "field";
	}
	
	/**
	 * AvailableIdentifier:
	 * 	IdentifierOrKeyword;
	 */
	protected String getAvailableIdentifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal BAR:
	 * 	'|';
	 */
	protected String getBARToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|";
	}
	
	/**
	 * BuiltInClassType:
	 * 	'object' | 'string';
	 */
	protected String getBuiltInClassTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "object";
	}
	
	/**
	 * ConstantModifier:
	 * 	'new'
	 * 	| 'public'
	 * 	| 'protected'
	 * 	| 'internal'
	 * 	| 'private';
	 */
	protected String getConstantModifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "new";
	}
	
	/**
	 * ConversionKind:
	 * 	'implicit'
	 * 	| 'explicit';
	 */
	protected String getConversionKindToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "implicit";
	}
	
	/**
	 * terminal EXPRESSION_EQUALITY_OPERATOR:
	 * 	'=='
	 * 	| '!=';
	 */
	protected String getEXPRESSION_EQUALITY_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "==";
	}
	
	/**
	 * EnumModifier:
	 * 	'new' | 'public' | 'protected' | 'internal' | 'private';
	 */
	protected String getEnumModifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "new";
	}
	
	/**
	 * EventModifier:
	 * 	'new'
	 * 	| 'public'
	 * 	| 'protected'
	 * 	| 'internal'
	 * 	| 'private'
	 * 	| 'static'
	 * 	| 'virtual'
	 * 	| 'sealed'
	 * 	| 'override'
	 * 	| 'abstract'
	 * 	| 'extern';
	 */
	protected String getEventModifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "new";
	}
	
	/**
	 * ExpressionRelationalOperator:
	 * 	LESS_THAN
	 * 	| GREATER_THAN
	 * 	| '<='
	 * 	| '>='
	 * 	| 'is'
	 * 	| 'as';
	 */
	protected String getExpressionRelationalOperatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	/**
	 * ExpressionShiftOperator:
	 * 	'<<'
	 * 	| '>>';
	 */
	protected String getExpressionShiftOperatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<<";
	}
	
	/**
	 * FieldModifier:
	 * 	'new'
	 * 	| 'public'
	 * 	| 'protected'
	 * 	| 'internal'
	 * 	| 'private'
	 * 	| 'static'
	 * 	| 'readonly'
	 * 	| 'volatile';
	 */
	protected String getFieldModifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "new";
	}
	
	/**
	 * terminal ID:
	 * 	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal IDENTIFIER_START_CHARACTER:
	 * 	LETTER | '_';
	 */
	protected String getIDENTIFIER_START_CHARACTERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * MethodModifier:
	 * 	'new'
	 * 	| 'public'
	 * 	| 'protected'
	 * 	| 'internal'
	 * 	| 'private'
	 * 	| 'static'
	 * 	| 'virtual'
	 * 	| 'sealed'
	 * 	| 'override'
	 * 	| 'abstract'
	 * 	| 'extern';
	 */
	protected String getMethodModifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "new";
	}
	
	/**
	 * terminal OPERATOR_OR_SIGN:
	 * 	'+' | '-';
	 */
	protected String getOPERATOR_OR_SIGNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * OverloadableUnaryOperator:
	 * 	OPERATOR_OR_SIGN
	 * 	| INCREMENT_DECREMENT
	 * 	| '!'
	 * 	| '~'
	 * 	| 'true'
	 * 	| 'false';
	 */
	protected String getOverloadableUnaryOperatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * ParameterModifier:
	 * 	'ref'
	 * 	| 'out';
	 */
	protected String getParameterModifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ref";
	}
	
	/**
	 * PropertyModifier:
	 * 	'new'
	 * 	| 'public'
	 * 	| 'protected'
	 * 	| 'internal'
	 * 	| 'private'
	 * 	| 'static'
	 * 	| 'virtual'
	 * 	| 'sealed'
	 * 	| 'override'
	 * 	| 'abstract'
	 * 	| 'extern';
	 */
	protected String getPropertyModifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "new";
	}
	
	/**
	 * terminal RANK_SPECIFIER:
	 * 	'[' ','* ']';
	 */
	protected String getRANK_SPECIFIERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[]";
	}
	
	/**
	 * RefOrOut:
	 * 	'ref'
	 * 	| 'out';
	 */
	protected String getRefOrOutToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ref";
	}
	
	/**
	 * terminal SEMICOLON:
	 * 	';';
	 */
	protected String getSEMICOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Argument_RefOrOutParserRuleCall_0_q.equals(syntax))
				emit_Argument_RefOrOutParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArrayInitializer_CommaKeyword_1_2_q.equals(syntax))
				emit_ArrayInitializer_CommaKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArrayType_RANK_SPECIFIERTerminalRuleCall_1_p.equals(syntax))
				emit_ArrayType_RANK_SPECIFIERTerminalRuleCall_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AttributeSection_CommaKeyword_3_q.equals(syntax))
				emit_AttributeSection_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AttributeSection___AttributeTargetParserRuleCall_1_0_ColonKeyword_1_1__q.equals(syntax))
				emit_AttributeSection___AttributeTargetParserRuleCall_1_0_ColonKeyword_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BuiltInType_BoolKeyword_1_or_DecimalKeyword_2_or_DoubleKeyword_4_or_FloatKeyword_3.equals(syntax))
				emit_BuiltInType_BoolKeyword_1_or_DecimalKeyword_2_or_DoubleKeyword_4_or_FloatKeyword_3(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClassBase___BuiltInClassTypeParserRuleCall_1_1_0_CommaKeyword_1_1_1_0__q.equals(syntax))
				emit_ClassBase___BuiltInClassTypeParserRuleCall_1_1_0_CommaKeyword_1_1_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClassDeclaration_SEMICOLONTerminalRuleCall_6_q.equals(syntax))
				emit_ClassDeclaration_SEMICOLONTerminalRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConstantDeclaration_ConstantModifierParserRuleCall_0_a.equals(syntax))
				emit_ConstantDeclaration_ConstantModifierParserRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConstantDeclaration_EventDeclaration_FieldDeclaration_PropertyDeclaration_FieldModifierParserRuleCall_0_a_or_PropertyModifierParserRuleCall_0_a_or___ConstantModifierParserRuleCall_0_a_ConstKeyword_1___or___EventModifierParserRuleCall_0_a_EventKeyword_1__.equals(syntax))
				emit_ConstantDeclaration_EventDeclaration_FieldDeclaration_PropertyDeclaration_FieldModifierParserRuleCall_0_a_or_PropertyModifierParserRuleCall_0_a_or___ConstantModifierParserRuleCall_0_a_ConstKeyword_1___or___EventModifierParserRuleCall_0_a_EventKeyword_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConstructorInitializer___ColonKeyword_0_0_BaseKeyword_0_1_LeftParenthesisKeyword_0_2___or___ColonKeyword_1_0_ThisKeyword_1_1_LeftParenthesisKeyword_1_2__.equals(syntax))
				emit_ConstructorInitializer___ColonKeyword_0_0_BaseKeyword_0_1_LeftParenthesisKeyword_0_2___or___ColonKeyword_1_0_ThisKeyword_1_1_LeftParenthesisKeyword_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DestructorDeclaration_ExternKeyword_0_q.equals(syntax))
				emit_DestructorDeclaration_ExternKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EmbeddedStatement_CheckedKeyword_1_6_0_0_or_UncheckedKeyword_1_6_0_1.equals(syntax))
				emit_EmbeddedStatement_CheckedKeyword_1_6_0_0_or_UncheckedKeyword_1_6_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EnumBody_CommaKeyword_1_2_q.equals(syntax))
				emit_EnumBody_CommaKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EnumDeclaration_SEMICOLONTerminalRuleCall_4_q.equals(syntax))
				emit_EnumDeclaration_SEMICOLONTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EnumType_EnumModifierParserRuleCall_1_a.equals(syntax))
				emit_EnumType_EnumModifierParserRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EnumType_SEMICOLONTerminalRuleCall_6_q.equals(syntax))
				emit_EnumType_SEMICOLONTerminalRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EventDeclaration_EventModifierParserRuleCall_0_a.equals(syntax))
				emit_EventDeclaration_EventModifierParserRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FieldDeclaration_FieldModifierParserRuleCall_0_a.equals(syntax))
				emit_FieldDeclaration_FieldModifierParserRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FixedParameter_ParameterModifierParserRuleCall_0_q.equals(syntax))
				emit_FixedParameter_ParameterModifierParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GlobalAttributeSection_CommaKeyword_4_q.equals(syntax))
				emit_GlobalAttributeSection_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Identifier_AvailableIdentifierParserRuleCall_0_1_or___CommercialAtKeyword_1_0_IDENTIFIER_START_CHARACTERTerminalRuleCall_1_1__.equals(syntax))
				emit_Identifier_AvailableIdentifierParserRuleCall_0_1_or___CommercialAtKeyword_1_0_IDENTIFIER_START_CHARACTERTerminalRuleCall_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IntegralType_ByteKeyword_1_or_CharKeyword_8_or_IntKeyword_4_or_LongKeyword_6_or_ShortKeyword_2_or_UintKeyword_5_or_UlongKeyword_7_or_UshortKeyword_3.equals(syntax))
				emit_IntegralType_ByteKeyword_1_or_CharKeyword_8_or_IntKeyword_4_or_LongKeyword_6_or_ShortKeyword_2_or_UintKeyword_5_or_UlongKeyword_7_or_UshortKeyword_3(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InterfaceAccessors___GetKeyword_1_0_0_SEMICOLONTerminalRuleCall_1_0_1___or___SetKeyword_1_1_0_SEMICOLONTerminalRuleCall_1_1_1__.equals(syntax))
				emit_InterfaceAccessors___GetKeyword_1_0_0_SEMICOLONTerminalRuleCall_1_0_1___or___SetKeyword_1_1_0_SEMICOLONTerminalRuleCall_1_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InterfaceDeclaration_SEMICOLONTerminalRuleCall_4_q.equals(syntax))
				emit_InterfaceDeclaration_SEMICOLONTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InterfaceMemberDeclaration_NewKeyword_1_q.equals(syntax))
				emit_InterfaceMemberDeclaration_NewKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MaybeEmptyBlock_SEMICOLONTerminalRuleCall_1_1_or___LeftCurlyBracketKeyword_1_0_0_RightCurlyBracketKeyword_1_0_2__.equals(syntax))
				emit_MaybeEmptyBlock_SEMICOLONTerminalRuleCall_1_1_or___LeftCurlyBracketKeyword_1_0_0_RightCurlyBracketKeyword_1_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MethodHeader_MethodModifierParserRuleCall_1_a.equals(syntax))
				emit_MethodHeader_MethodModifierParserRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NamespaceDeclaration_SEMICOLONTerminalRuleCall_3_q.equals(syntax))
				emit_NamespaceDeclaration_SEMICOLONTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PropertyDeclaration_PropertyModifierParserRuleCall_0_a.equals(syntax))
				emit_PropertyDeclaration_PropertyModifierParserRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StructDeclaration_SEMICOLONTerminalRuleCall_4_q.equals(syntax))
				emit_StructDeclaration_SEMICOLONTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Type_RANK_SPECIFIERTerminalRuleCall_2_a.equals(syntax))
				emit_Type_RANK_SPECIFIERTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     RefOrOut?
	 */
	protected void emit_Argument_RefOrOutParserRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ArrayInitializer_CommaKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RANK_SPECIFIER+
	 */
	protected void emit_ArrayType_RANK_SPECIFIERTerminalRuleCall_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_AttributeSection_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (AttributeTarget ':')?
	 */
	protected void emit_AttributeSection___AttributeTargetParserRuleCall_1_0_ColonKeyword_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'float' | 'double' | 'decimal' | 'bool'
	 */
	protected void emit_BuiltInType_BoolKeyword_1_or_DecimalKeyword_2_or_DoubleKeyword_4_or_FloatKeyword_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (BuiltInClassType ',')?
	 */
	protected void emit_ClassBase___BuiltInClassTypeParserRuleCall_1_1_0_CommaKeyword_1_1_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SEMICOLON?
	 */
	protected void emit_ClassDeclaration_SEMICOLONTerminalRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ConstantModifier*
	 */
	protected void emit_ConstantDeclaration_ConstantModifierParserRuleCall_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     PropertyModifier* | (EventModifier* 'event') | FieldModifier* | (ConstantModifier* 'const')
	 */
	protected void emit_ConstantDeclaration_EventDeclaration_FieldDeclaration_PropertyDeclaration_FieldModifierParserRuleCall_0_a_or_PropertyModifierParserRuleCall_0_a_or___ConstantModifierParserRuleCall_0_a_ConstKeyword_1___or___EventModifierParserRuleCall_0_a_EventKeyword_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (':' 'this' '(') | (':' 'base' '(')
	 */
	protected void emit_ConstructorInitializer___ColonKeyword_0_0_BaseKeyword_0_1_LeftParenthesisKeyword_0_2___or___ColonKeyword_1_0_ThisKeyword_1_1_LeftParenthesisKeyword_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'extern'?
	 */
	protected void emit_DestructorDeclaration_ExternKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'unchecked' | 'checked'
	 */
	protected void emit_EmbeddedStatement_CheckedKeyword_1_6_0_0_or_UncheckedKeyword_1_6_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_EnumBody_CommaKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SEMICOLON?
	 */
	protected void emit_EnumDeclaration_SEMICOLONTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     EnumModifier*
	 */
	protected void emit_EnumType_EnumModifierParserRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SEMICOLON?
	 */
	protected void emit_EnumType_SEMICOLONTerminalRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     EventModifier*
	 */
	protected void emit_EventDeclaration_EventModifierParserRuleCall_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     FieldModifier*
	 */
	protected void emit_FieldDeclaration_FieldModifierParserRuleCall_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ParameterModifier?
	 */
	protected void emit_FixedParameter_ParameterModifierParserRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_GlobalAttributeSection_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('@' IDENTIFIER_START_CHARACTER) | AvailableIdentifier
	 */
	protected void emit_Identifier_AvailableIdentifierParserRuleCall_0_1_or___CommercialAtKeyword_1_0_IDENTIFIER_START_CHARACTERTerminalRuleCall_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     'long' | 
	     'ushort' | 
	     'char' | 
	     'uint' | 
	     'byte' | 
	     'short' | 
	     'ulong' | 
	     'int'
	 )
	 */
	protected void emit_IntegralType_ByteKeyword_1_or_CharKeyword_8_or_IntKeyword_4_or_LongKeyword_6_or_ShortKeyword_2_or_UintKeyword_5_or_UlongKeyword_7_or_UshortKeyword_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('get' SEMICOLON) | ('set' SEMICOLON)
	 */
	protected void emit_InterfaceAccessors___GetKeyword_1_0_0_SEMICOLONTerminalRuleCall_1_0_1___or___SetKeyword_1_1_0_SEMICOLONTerminalRuleCall_1_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SEMICOLON?
	 */
	protected void emit_InterfaceDeclaration_SEMICOLONTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'new'?
	 */
	protected void emit_InterfaceMemberDeclaration_NewKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SEMICOLON | ('{' '}')
	 */
	protected void emit_MaybeEmptyBlock_SEMICOLONTerminalRuleCall_1_1_or___LeftCurlyBracketKeyword_1_0_0_RightCurlyBracketKeyword_1_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     MethodModifier*
	 */
	protected void emit_MethodHeader_MethodModifierParserRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SEMICOLON?
	 */
	protected void emit_NamespaceDeclaration_SEMICOLONTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     PropertyModifier*
	 */
	protected void emit_PropertyDeclaration_PropertyModifierParserRuleCall_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SEMICOLON?
	 */
	protected void emit_StructDeclaration_SEMICOLONTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RANK_SPECIFIER*
	 */
	protected void emit_Type_RANK_SPECIFIERTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
