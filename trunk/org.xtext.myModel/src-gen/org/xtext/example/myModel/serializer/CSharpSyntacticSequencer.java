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
	protected AbstractElementAlias match_ArrayType_RANK_SPECIFIERTerminalRuleCall_1_p;
	protected AbstractElementAlias match_AttributeSection___AttributeTargetParserRuleCall_1_0_DOISPONTOSTerminalRuleCall_1_1__q;
	protected AbstractElementAlias match_ClassMemberDeclaration_ModifierParserRuleCall_0_0_a;
	protected AbstractElementAlias match_ConstantDeclaration_ConstantModifierParserRuleCall_0_a;
	protected AbstractElementAlias match_ConstructorInitializer___DOISPONTOSTerminalRuleCall_0_0_BaseKeyword_0_1_PARENTESQTerminalRuleCall_0_2___or___DOISPONTOSTerminalRuleCall_1_0_ThisKeyword_1_1_PARENTESQTerminalRuleCall_1_2__;
	protected AbstractElementAlias match_DestructorDeclaration_ExternKeyword_0_q;
	protected AbstractElementAlias match_DestructorDeclaration_WSTerminalRuleCall_4_a;
	protected AbstractElementAlias match_EmbeddedStatement_CheckedKeyword_1_6_0_0_or_UncheckedKeyword_1_6_0_1;
	protected AbstractElementAlias match_EnumDeclaration_SEMICOLONTerminalRuleCall_4_q;
	protected AbstractElementAlias match_EventDeclaration_EventModifierParserRuleCall_0_a;
	protected AbstractElementAlias match_Expression2_HyphenMinusKeyword_1_10_0_0_or_PlusSignKeyword_1_10_0_1;
	protected AbstractElementAlias match_FieldDeclaration_FieldModifierParserRuleCall_0_a;
	protected AbstractElementAlias match_FixedParameter_RefOrOutParserRuleCall_1_q;
	protected AbstractElementAlias match_Identifier_IDTerminalRuleCall_0_1_or___CommercialAtKeyword_1_1_IDTerminalRuleCall_1_2__;
	protected AbstractElementAlias match_InterfaceAccessors___GetKeyword_1_0_0_SEMICOLONTerminalRuleCall_1_0_1___or___SetKeyword_1_1_0_SEMICOLONTerminalRuleCall_1_1_1__;
	protected AbstractElementAlias match_InterfaceDeclaration_SEMICOLONTerminalRuleCall_4_q;
	protected AbstractElementAlias match_InterfaceMemberDeclaration_NewKeyword_1_q;
	protected AbstractElementAlias match_NamespaceDeclaration_SEMICOLONTerminalRuleCall_3_q;
	protected AbstractElementAlias match_PrimaryExpression_CheckedKeyword_1_0_8_0_0_or_UncheckedKeyword_1_0_8_0_1;
	protected AbstractElementAlias match_PropertyDeclaration_PropertyModifierParserRuleCall_0_a;
	protected AbstractElementAlias match_Type_RANK_SPECIFIERTerminalRuleCall_1_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CSharpGrammarAccess) access;
		match_Argument_RefOrOutParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getArgumentAccess().getRefOrOutParserRuleCall_0());
		match_ArrayType_RANK_SPECIFIERTerminalRuleCall_1_p = new TokenAlias(true, false, grammarAccess.getArrayTypeAccess().getRANK_SPECIFIERTerminalRuleCall_1());
		match_AttributeSection___AttributeTargetParserRuleCall_1_0_DOISPONTOSTerminalRuleCall_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeSectionAccess().getAttributeTargetParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getAttributeSectionAccess().getDOISPONTOSTerminalRuleCall_1_1()));
		match_ClassMemberDeclaration_ModifierParserRuleCall_0_0_a = new TokenAlias(true, true, grammarAccess.getClassMemberDeclarationAccess().getModifierParserRuleCall_0_0());
		match_ConstantDeclaration_ConstantModifierParserRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getConstantDeclarationAccess().getConstantModifierParserRuleCall_0());
		match_ConstructorInitializer___DOISPONTOSTerminalRuleCall_0_0_BaseKeyword_0_1_PARENTESQTerminalRuleCall_0_2___or___DOISPONTOSTerminalRuleCall_1_0_ThisKeyword_1_1_PARENTESQTerminalRuleCall_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getConstructorInitializerAccess().getDOISPONTOSTerminalRuleCall_0_0()), new TokenAlias(false, false, grammarAccess.getConstructorInitializerAccess().getBaseKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getConstructorInitializerAccess().getPARENTESQTerminalRuleCall_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getConstructorInitializerAccess().getDOISPONTOSTerminalRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getConstructorInitializerAccess().getThisKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getConstructorInitializerAccess().getPARENTESQTerminalRuleCall_1_2())));
		match_DestructorDeclaration_ExternKeyword_0_q = new TokenAlias(false, true, grammarAccess.getDestructorDeclarationAccess().getExternKeyword_0());
		match_DestructorDeclaration_WSTerminalRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getDestructorDeclarationAccess().getWSTerminalRuleCall_4());
		match_EmbeddedStatement_CheckedKeyword_1_6_0_0_or_UncheckedKeyword_1_6_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getEmbeddedStatementAccess().getCheckedKeyword_1_6_0_0()), new TokenAlias(false, false, grammarAccess.getEmbeddedStatementAccess().getUncheckedKeyword_1_6_0_1()));
		match_EnumDeclaration_SEMICOLONTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getEnumDeclarationAccess().getSEMICOLONTerminalRuleCall_4());
		match_EventDeclaration_EventModifierParserRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getEventDeclarationAccess().getEventModifierParserRuleCall_0());
		match_Expression2_HyphenMinusKeyword_1_10_0_0_or_PlusSignKeyword_1_10_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpression2Access().getHyphenMinusKeyword_1_10_0_0()), new TokenAlias(false, false, grammarAccess.getExpression2Access().getPlusSignKeyword_1_10_0_1()));
		match_FieldDeclaration_FieldModifierParserRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getFieldDeclarationAccess().getFieldModifierParserRuleCall_0());
		match_FixedParameter_RefOrOutParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getFixedParameterAccess().getRefOrOutParserRuleCall_1());
		match_Identifier_IDTerminalRuleCall_0_1_or___CommercialAtKeyword_1_1_IDTerminalRuleCall_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getIdentifierAccess().getCommercialAtKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_1_2())), new TokenAlias(false, false, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0_1()));
		match_InterfaceAccessors___GetKeyword_1_0_0_SEMICOLONTerminalRuleCall_1_0_1___or___SetKeyword_1_1_0_SEMICOLONTerminalRuleCall_1_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getInterfaceAccessorsAccess().getGetKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getInterfaceAccessorsAccess().getSEMICOLONTerminalRuleCall_1_0_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getInterfaceAccessorsAccess().getSetKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getInterfaceAccessorsAccess().getSEMICOLONTerminalRuleCall_1_1_1())));
		match_InterfaceDeclaration_SEMICOLONTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getInterfaceDeclarationAccess().getSEMICOLONTerminalRuleCall_4());
		match_InterfaceMemberDeclaration_NewKeyword_1_q = new TokenAlias(false, true, grammarAccess.getInterfaceMemberDeclarationAccess().getNewKeyword_1());
		match_NamespaceDeclaration_SEMICOLONTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getNamespaceDeclarationAccess().getSEMICOLONTerminalRuleCall_3());
		match_PrimaryExpression_CheckedKeyword_1_0_8_0_0_or_UncheckedKeyword_1_0_8_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPrimaryExpressionAccess().getCheckedKeyword_1_0_8_0_0()), new TokenAlias(false, false, grammarAccess.getPrimaryExpressionAccess().getUncheckedKeyword_1_0_8_0_1()));
		match_PropertyDeclaration_PropertyModifierParserRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getPropertyDeclarationAccess().getPropertyModifierParserRuleCall_0());
		match_Type_RANK_SPECIFIERTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getTypeAccess().getRANK_SPECIFIERTerminalRuleCall_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getAMPERSANDRule())
			return getAMPERSANDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getASSIGNEMENT_OPERATORRule())
			return getASSIGNEMENT_OPERATORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getAttributeTargetRule())
			return getAttributeTargetToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBARRule())
			return getBARToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCHAPEURule())
			return getCHAPEUToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOLCHETEDIRRule())
			return getCOLCHETEDIRToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOLCHETEESQRule())
			return getCOLCHETEESQToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getConstantModifierRule())
			return getConstantModifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getConversionKindRule())
			return getConversionKindToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDIVISAORule())
			return getDIVISAOToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDOISPONTOSRule())
			return getDOISPONTOSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEXPRESSION_EQUALITY_OPERATORRule())
			return getEXPRESSION_EQUALITY_OPERATORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEXPRESSION_SHIFT_OPERATORRule())
			return getEXPRESSION_SHIFT_OPERATORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEventModifierRule())
			return getEventModifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getExpressionRelationalOperatorRule())
			return getExpressionRelationalOperatorToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFieldModifierRule())
			return getFieldModifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLEFT_CURLY_BRACKETSRule())
			return getLEFT_CURLY_BRACKETSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMODRule())
			return getMODToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMULTIPRule())
			return getMULTIPToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getModifierRule())
			return getModifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOverloadableUnaryOperatorRule())
			return getOverloadableUnaryOperatorToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPARENTDIRRule())
			return getPARENTDIRToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPARENTESQRule())
			return getPARENTESQToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPONTORule())
			return getPONTOToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPropertyModifierRule())
			return getPropertyModifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRANK_SPECIFIERRule())
			return getRANK_SPECIFIERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRIGHT_CURLY_BRACKETSRule())
			return getRIGHT_CURLY_BRACKETSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRefOrOutRule())
			return getRefOrOutToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSEMICOLONRule())
			return getSEMICOLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal AMPERSAND: '&';
	 */
	protected String getAMPERSANDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "&";
	}
	
	/**
	 * terminal ASSIGNEMENT_OPERATOR:
	 * 	SIMPLE_ASSIGNEMT 
	 * 	|ADDTIVE_ASSIGNEMT 
	 * 	|SUBTRACTIVE_ASSIGNMENT 
	 * 	|ATTRIBUTION_MULTIPLICATIVE 
	 * 	|DIVISION_ASSIGNMENT
	 * 	|ASSIGNMENT_MODULE
	 * 	|AND_ASSIGNEMENT 
	 * 	|OR_ASSIGNEMENT
	 * 	|LEFT_SHIFT_ASSIGNMENT 
	 * 	|RIGHT_SHIFT_ASSIGNMENT;
	 */
	protected String getASSIGNEMENT_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
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
	 * terminal BAR: '|';
	 */
	protected String getBARToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|";
	}
	
	/**
	 * terminal CHAPEU : '^';
	 */
	protected String getCHAPEUToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "^";
	}
	
	/**
	 * terminal COLCHETEDIR : ']';
	 */
	protected String getCOLCHETEDIRToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
	}
	
	/**
	 * terminal COLCHETEESQ : "[";
	 */
	protected String getCOLCHETEESQToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[";
	}
	
	/**
	 * terminal COMMA : ",";
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * ConstantModifier:
	 * 	Modifier;
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
	 * terminal  DIVISAO : "/";
	 */
	protected String getDIVISAOToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/";
	}
	
	/**
	 * terminal DOISPONTOS : ":";
	 */
	protected String getDOISPONTOSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal EXPRESSION_EQUALITY_OPERATOR:'=='|'!=';
	 */
	protected String getEXPRESSION_EQUALITY_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "==";
	}
	
	/**
	 * terminal EXPRESSION_SHIFT_OPERATOR:	"<<"|">>";
	 */
	protected String getEXPRESSION_SHIFT_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<<";
	}
	
	/**
	 * EventModifier:
	 * 	 'static'
	 * 	| 'virtual'
	 * 	| 'sealed'
	 * 	| 'override'
	 * 	| 'abstract'
	 * 	| 'extern';
	 */
	protected String getEventModifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "static";
	}
	
	/**
	 * ExpressionRelationalOperator:
	 * 	LESS_THAN
	 *     |GREATER_THAN
	 *     |MENORIGUAL
	 *     |MAIORIGUAL
	 *     |'is'
	 *     |'as'
	 * ;
	 */
	protected String getExpressionRelationalOperatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	/**
	 * FieldModifier:
	 * 	 'static'
	 * 	| 'readonly'
	 * 	| 'volatile';
	 */
	protected String getFieldModifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "static";
	}
	
	/**
	 * terminal ID: LETTER (LETTER | DIGIT)*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal LEFT_CURLY_BRACKETS:'{';
	 */
	protected String getLEFT_CURLY_BRACKETSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal MOD: '%';
	 */
	protected String getMODToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%";
	}
	
	/**
	 * terminal MULTIP : "*";
	 */
	protected String getMULTIPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*";
	}
	
	/**
	 * Modifier:
	 * 	'new'
	 * 	| 'public'
	 * 	| 'protected'
	 * 	| 'internal'
	 * 	| 'private';
	 */
	protected String getModifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "new";
	}
	
	/**
	 * OverloadableUnaryOperator:
	 * 	('-'|'+')
	 * 	| INCREMENT_DECREMENT
	 * 	| '!'
	 * 	| '~'
	 * 	| 'true'
	 * 	| 'false';
	 */
	protected String getOverloadableUnaryOperatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-";
	}
	
	/**
	 * terminal PARENTDIR : ")";
	 */
	protected String getPARENTDIRToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal PARENTESQ : "(";
	 */
	protected String getPARENTESQToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal PONTO : ".";
	 */
	protected String getPONTOToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * PropertyModifier:
	 * 	'static'
	 * 	| 'virtual'
	 * 	| 'sealed'
	 * 	| 'override'
	 * 	| 'abstract'
	 * 	| 'extern';
	 */
	protected String getPropertyModifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "static";
	}
	
	/**
	 * terminal RANK_SPECIFIER: COLCHETEESQ COMMA* COLCHETEDIR;
	 */
	protected String getRANK_SPECIFIERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[]";
	}
	
	/**
	 * terminal RIGHT_CURLY_BRACKETS:'}';
	 */
	protected String getRIGHT_CURLY_BRACKETSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
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
	 * terminal SEMICOLON : ";";
	 */
	protected String getSEMICOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * terminal WS:(' '|'\t'|'\r'|'\n')+;
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Argument_RefOrOutParserRuleCall_0_q.equals(syntax))
				emit_Argument_RefOrOutParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArrayType_RANK_SPECIFIERTerminalRuleCall_1_p.equals(syntax))
				emit_ArrayType_RANK_SPECIFIERTerminalRuleCall_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AttributeSection___AttributeTargetParserRuleCall_1_0_DOISPONTOSTerminalRuleCall_1_1__q.equals(syntax))
				emit_AttributeSection___AttributeTargetParserRuleCall_1_0_DOISPONTOSTerminalRuleCall_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClassMemberDeclaration_ModifierParserRuleCall_0_0_a.equals(syntax))
				emit_ClassMemberDeclaration_ModifierParserRuleCall_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConstantDeclaration_ConstantModifierParserRuleCall_0_a.equals(syntax))
				emit_ConstantDeclaration_ConstantModifierParserRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConstructorInitializer___DOISPONTOSTerminalRuleCall_0_0_BaseKeyword_0_1_PARENTESQTerminalRuleCall_0_2___or___DOISPONTOSTerminalRuleCall_1_0_ThisKeyword_1_1_PARENTESQTerminalRuleCall_1_2__.equals(syntax))
				emit_ConstructorInitializer___DOISPONTOSTerminalRuleCall_0_0_BaseKeyword_0_1_PARENTESQTerminalRuleCall_0_2___or___DOISPONTOSTerminalRuleCall_1_0_ThisKeyword_1_1_PARENTESQTerminalRuleCall_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DestructorDeclaration_ExternKeyword_0_q.equals(syntax))
				emit_DestructorDeclaration_ExternKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DestructorDeclaration_WSTerminalRuleCall_4_a.equals(syntax))
				emit_DestructorDeclaration_WSTerminalRuleCall_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EmbeddedStatement_CheckedKeyword_1_6_0_0_or_UncheckedKeyword_1_6_0_1.equals(syntax))
				emit_EmbeddedStatement_CheckedKeyword_1_6_0_0_or_UncheckedKeyword_1_6_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EnumDeclaration_SEMICOLONTerminalRuleCall_4_q.equals(syntax))
				emit_EnumDeclaration_SEMICOLONTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EventDeclaration_EventModifierParserRuleCall_0_a.equals(syntax))
				emit_EventDeclaration_EventModifierParserRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression2_HyphenMinusKeyword_1_10_0_0_or_PlusSignKeyword_1_10_0_1.equals(syntax))
				emit_Expression2_HyphenMinusKeyword_1_10_0_0_or_PlusSignKeyword_1_10_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FieldDeclaration_FieldModifierParserRuleCall_0_a.equals(syntax))
				emit_FieldDeclaration_FieldModifierParserRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FixedParameter_RefOrOutParserRuleCall_1_q.equals(syntax))
				emit_FixedParameter_RefOrOutParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Identifier_IDTerminalRuleCall_0_1_or___CommercialAtKeyword_1_1_IDTerminalRuleCall_1_2__.equals(syntax))
				emit_Identifier_IDTerminalRuleCall_0_1_or___CommercialAtKeyword_1_1_IDTerminalRuleCall_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InterfaceAccessors___GetKeyword_1_0_0_SEMICOLONTerminalRuleCall_1_0_1___or___SetKeyword_1_1_0_SEMICOLONTerminalRuleCall_1_1_1__.equals(syntax))
				emit_InterfaceAccessors___GetKeyword_1_0_0_SEMICOLONTerminalRuleCall_1_0_1___or___SetKeyword_1_1_0_SEMICOLONTerminalRuleCall_1_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InterfaceDeclaration_SEMICOLONTerminalRuleCall_4_q.equals(syntax))
				emit_InterfaceDeclaration_SEMICOLONTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InterfaceMemberDeclaration_NewKeyword_1_q.equals(syntax))
				emit_InterfaceMemberDeclaration_NewKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NamespaceDeclaration_SEMICOLONTerminalRuleCall_3_q.equals(syntax))
				emit_NamespaceDeclaration_SEMICOLONTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PrimaryExpression_CheckedKeyword_1_0_8_0_0_or_UncheckedKeyword_1_0_8_0_1.equals(syntax))
				emit_PrimaryExpression_CheckedKeyword_1_0_8_0_0_or_UncheckedKeyword_1_0_8_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PropertyDeclaration_PropertyModifierParserRuleCall_0_a.equals(syntax))
				emit_PropertyDeclaration_PropertyModifierParserRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Type_RANK_SPECIFIERTerminalRuleCall_1_a.equals(syntax))
				emit_Type_RANK_SPECIFIERTerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     RANK_SPECIFIER+
	 */
	protected void emit_ArrayType_RANK_SPECIFIERTerminalRuleCall_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (AttributeTarget DOISPONTOS)?
	 */
	protected void emit_AttributeSection___AttributeTargetParserRuleCall_1_0_DOISPONTOSTerminalRuleCall_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Modifier*
	 */
	protected void emit_ClassMemberDeclaration_ModifierParserRuleCall_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     (DOISPONTOS 'this' PARENTESQ) | (DOISPONTOS 'base' PARENTESQ)
	 */
	protected void emit_ConstructorInitializer___DOISPONTOSTerminalRuleCall_0_0_BaseKeyword_0_1_PARENTESQTerminalRuleCall_0_2___or___DOISPONTOSTerminalRuleCall_1_0_ThisKeyword_1_1_PARENTESQTerminalRuleCall_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     WS*
	 */
	protected void emit_DestructorDeclaration_WSTerminalRuleCall_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'checked' | 'unchecked'
	 */
	protected void emit_EmbeddedStatement_CheckedKeyword_1_6_0_0_or_UncheckedKeyword_1_6_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     EventModifier*
	 */
	protected void emit_EventDeclaration_EventModifierParserRuleCall_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '+' | '-'
	 */
	protected void emit_Expression2_HyphenMinusKeyword_1_10_0_0_or_PlusSignKeyword_1_10_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     RefOrOut?
	 */
	protected void emit_FixedParameter_RefOrOutParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ID | ('@' ID)
	 */
	protected void emit_Identifier_IDTerminalRuleCall_0_1_or___CommercialAtKeyword_1_1_IDTerminalRuleCall_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     SEMICOLON?
	 */
	protected void emit_NamespaceDeclaration_SEMICOLONTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'unchecked' | 'checked'
	 */
	protected void emit_PrimaryExpression_CheckedKeyword_1_0_8_0_0_or_UncheckedKeyword_1_0_8_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     RANK_SPECIFIER*
	 */
	protected void emit_Type_RANK_SPECIFIERTerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
