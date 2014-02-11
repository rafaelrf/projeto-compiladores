/*
* generated by Xtext
*/
grammar InternalCSharp;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.example.myModel.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.myModel.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.myModel.services.CSharpGrammarAccess;

}

@parser::members {
 
 	private CSharpGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(CSharpGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getInputAssignment()); }
(rule__Model__InputAssignment)*
{ after(grammarAccess.getModelAccess().getInputAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleInput
entryRuleInput 
:
{ before(grammarAccess.getInputRule()); }
	 ruleInput
{ after(grammarAccess.getInputRule()); } 
	 EOF 
;

// Rule Input
ruleInput
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getInputAccess().getInputSectionPartParserRuleCall()); }
(	ruleInputSectionPart)*
{ after(grammarAccess.getInputAccess().getInputSectionPartParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleInputSectionPart
entryRuleInputSectionPart 
:
{ before(grammarAccess.getInputSectionPartRule()); }
	 ruleInputSectionPart
{ after(grammarAccess.getInputSectionPartRule()); } 
	 EOF 
;

// Rule InputSectionPart
ruleInputSectionPart
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getInputSectionPartAccess().getAlternatives()); }
(rule__InputSectionPart__Alternatives)
{ after(grammarAccess.getInputSectionPartAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleInputElement
entryRuleInputElement 
:
{ before(grammarAccess.getInputElementRule()); }
	 ruleInputElement
{ after(grammarAccess.getInputElementRule()); } 
	 EOF 
;

// Rule InputElement
ruleInputElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getInputElementAccess().getAlternatives()); }
(rule__InputElement__Alternatives)
{ after(grammarAccess.getInputElementAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleToken
entryRuleToken 
:
{ before(grammarAccess.getTokenRule()); }
	 ruleToken
{ after(grammarAccess.getTokenRule()); } 
	 EOF 
;

// Rule Token
ruleToken
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTokenAccess().getAlternatives()); }
(rule__Token__Alternatives)
{ after(grammarAccess.getTokenAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleKeywords
entryRuleKeywords 
:
{ before(grammarAccess.getKeywordsRule()); }
	 ruleKeywords
{ after(grammarAccess.getKeywordsRule()); } 
	 EOF 
;

// Rule Keywords
ruleKeywords
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getKeywordsAccess().getAlternatives()); }
(rule__Keywords__Alternatives)
{ after(grammarAccess.getKeywordsAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleIntegerLiteral
entryRuleIntegerLiteral 
:
{ before(grammarAccess.getIntegerLiteralRule()); }
	 ruleIntegerLiteral
{ after(grammarAccess.getIntegerLiteralRule()); } 
	 EOF 
;

// Rule IntegerLiteral
ruleIntegerLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIntegerLiteralAccess().getAlternatives()); }
(rule__IntegerLiteral__Alternatives)
{ after(grammarAccess.getIntegerLiteralAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleComment
entryRuleComment 
:
{ before(grammarAccess.getCommentRule()); }
	 ruleComment
{ after(grammarAccess.getCommentRule()); } 
	 EOF 
;

// Rule Comment
ruleComment
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCommentAccess().getAlternatives()); }
(rule__Comment__Alternatives)
{ after(grammarAccess.getCommentAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleIntegralType
entryRuleIntegralType 
:
{ before(grammarAccess.getIntegralTypeRule()); }
	 ruleIntegralType
{ after(grammarAccess.getIntegralTypeRule()); } 
	 EOF 
;

// Rule IntegralType
ruleIntegralType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIntegralTypeAccess().getAlternatives()); }
(rule__IntegralType__Alternatives)
{ after(grammarAccess.getIntegralTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}







// Entry rule entryRuleRANK_SPECIFIER
entryRuleRANK_SPECIFIER 
:
{ before(grammarAccess.getRANK_SPECIFIERRule()); }
	 ruleRANK_SPECIFIER
{ after(grammarAccess.getRANK_SPECIFIERRule()); } 
	 EOF 
;

// Rule RANK_SPECIFIER
ruleRANK_SPECIFIER
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRANK_SPECIFIERAccess().getGroup()); }
(rule__RANK_SPECIFIER__Group__0)
{ after(grammarAccess.getRANK_SPECIFIERAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNonArrayType
entryRuleNonArrayType 
:
{ before(grammarAccess.getNonArrayTypeRule()); }
	 ruleNonArrayType
{ after(grammarAccess.getNonArrayTypeRule()); } 
	 EOF 
;

// Rule NonArrayType
ruleNonArrayType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNonArrayTypeAccess().getBuiltInTypeParserRuleCall()); }
	rulebuiltInType
{ after(grammarAccess.getNonArrayTypeAccess().getBuiltInTypeParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulebuiltInType
entryRulebuiltInType 
:
{ before(grammarAccess.getBuiltInTypeRule()); }
	 rulebuiltInType
{ after(grammarAccess.getBuiltInTypeRule()); } 
	 EOF 
;

// Rule builtInType
rulebuiltInType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBuiltInTypeAccess().getAlternatives()); }
(rule__BuiltInType__Alternatives)
{ after(grammarAccess.getBuiltInTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBuiltInClassType
entryRuleBuiltInClassType 
:
{ before(grammarAccess.getBuiltInClassTypeRule()); }
	 ruleBuiltInClassType
{ after(grammarAccess.getBuiltInClassTypeRule()); } 
	 EOF 
;

// Rule BuiltInClassType
ruleBuiltInClassType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBuiltInClassTypeAccess().getAlternatives()); }
(rule__BuiltInClassType__Alternatives)
{ after(grammarAccess.getBuiltInClassTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEnumBody
entryRuleEnumBody 
:
{ before(grammarAccess.getEnumBodyRule()); }
	 ruleEnumBody
{ after(grammarAccess.getEnumBodyRule()); } 
	 EOF 
;

// Rule EnumBody
ruleEnumBody
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEnumBodyAccess().getGroup()); }
(rule__EnumBody__Group__0)
{ after(grammarAccess.getEnumBodyAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleidentifier
entryRuleidentifier 
:
{ before(grammarAccess.getIdentifierRule()); }
	 ruleidentifier
{ after(grammarAccess.getIdentifierRule()); } 
	 EOF 
;

// Rule identifier
ruleidentifier
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIdentifierAccess().getNullKeyword()); }

	'null' 

{ after(grammarAccess.getIdentifierAccess().getNullKeyword()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEnumModifier
entryRuleEnumModifier 
:
{ before(grammarAccess.getEnumModifierRule()); }
	 ruleEnumModifier
{ after(grammarAccess.getEnumModifierRule()); } 
	 EOF 
;

// Rule EnumModifier
ruleEnumModifier
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEnumModifierAccess().getAlternatives()); }
(rule__EnumModifier__Alternatives)
{ after(grammarAccess.getEnumModifierAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAttributes
entryRuleAttributes 
:
{ before(grammarAccess.getAttributesRule()); }
	 ruleAttributes
{ after(grammarAccess.getAttributesRule()); } 
	 EOF 
;

// Rule Attributes
ruleAttributes
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAttributesAccess().getNullKeyword()); }

	'null' 

{ after(grammarAccess.getAttributesAccess().getNullKeyword()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__InputSectionPart__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputSectionPartAccess().getGroup_0()); }
(rule__InputSectionPart__Group_0__0)
{ after(grammarAccess.getInputSectionPartAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getInputSectionPartAccess().getSINGLE_LINE_COMMENTTerminalRuleCall_1()); }
	RULE_SINGLE_LINE_COMMENT
{ after(grammarAccess.getInputSectionPartAccess().getSINGLE_LINE_COMMENTTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__InputElement__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputElementAccess().getWHITE_SPACETerminalRuleCall_0()); }
	RULE_WHITE_SPACE
{ after(grammarAccess.getInputElementAccess().getWHITE_SPACETerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getInputElementAccess().getCommentParserRuleCall_1()); }
	ruleComment
{ after(grammarAccess.getInputElementAccess().getCommentParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getInputElementAccess().getTokenParserRuleCall_2()); }
	ruleToken
{ after(grammarAccess.getInputElementAccess().getTokenParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Token__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTokenAccess().getIdentifierParserRuleCall_0()); }
	ruleidentifier
{ after(grammarAccess.getTokenAccess().getIdentifierParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getTokenAccess().getKeywordsParserRuleCall_1()); }
	ruleKeywords
{ after(grammarAccess.getTokenAccess().getKeywordsParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getTokenAccess().getIntegerLiteralParserRuleCall_2()); }
	ruleIntegerLiteral
{ after(grammarAccess.getTokenAccess().getIntegerLiteralParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Keywords__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getKeywordsAccess().getAbstractKeyword_0()); }

	'abstract' 

{ after(grammarAccess.getKeywordsAccess().getAbstractKeyword_0()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getAsKeyword_1()); }

	'as' 

{ after(grammarAccess.getKeywordsAccess().getAsKeyword_1()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getBaseKeyword_2()); }

	'base' 

{ after(grammarAccess.getKeywordsAccess().getBaseKeyword_2()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getBoolKeyword_3()); }

	'bool' 

{ after(grammarAccess.getKeywordsAccess().getBoolKeyword_3()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getBreakKeyword_4()); }

	'break' 

{ after(grammarAccess.getKeywordsAccess().getBreakKeyword_4()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getByteKeyword_5()); }

	'byte' 

{ after(grammarAccess.getKeywordsAccess().getByteKeyword_5()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getCaseKeyword_6()); }

	'case' 

{ after(grammarAccess.getKeywordsAccess().getCaseKeyword_6()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getCatchKeyword_7()); }

	'catch' 

{ after(grammarAccess.getKeywordsAccess().getCatchKeyword_7()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getCharKeyword_8()); }

	'char' 

{ after(grammarAccess.getKeywordsAccess().getCharKeyword_8()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getCheckedKeyword_9()); }

	'checked' 

{ after(grammarAccess.getKeywordsAccess().getCheckedKeyword_9()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getClassKeyword_10()); }

	'class' 

{ after(grammarAccess.getKeywordsAccess().getClassKeyword_10()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getConstKeyword_11()); }

	'const' 

{ after(grammarAccess.getKeywordsAccess().getConstKeyword_11()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getContinueKeyword_12()); }

	'continue' 

{ after(grammarAccess.getKeywordsAccess().getContinueKeyword_12()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getDecimalKeyword_13()); }

	'decimal' 

{ after(grammarAccess.getKeywordsAccess().getDecimalKeyword_13()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getDefaultKeyword_14()); }

	'default' 

{ after(grammarAccess.getKeywordsAccess().getDefaultKeyword_14()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getDelegateKeyword_15()); }

	'delegate' 

{ after(grammarAccess.getKeywordsAccess().getDelegateKeyword_15()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getDoKeyword_16()); }

	'do' 

{ after(grammarAccess.getKeywordsAccess().getDoKeyword_16()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getDoubleKeyword_17()); }

	'double' 

{ after(grammarAccess.getKeywordsAccess().getDoubleKeyword_17()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getElseKeyword_18()); }

	'else' 

{ after(grammarAccess.getKeywordsAccess().getElseKeyword_18()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getEnumKeyword_19()); }

	'enum' 

{ after(grammarAccess.getKeywordsAccess().getEnumKeyword_19()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getEventKeyword_20()); }

	'event' 

{ after(grammarAccess.getKeywordsAccess().getEventKeyword_20()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getExplicitKeyword_21()); }

	'explicit' 

{ after(grammarAccess.getKeywordsAccess().getExplicitKeyword_21()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getExternKeyword_22()); }

	'extern' 

{ after(grammarAccess.getKeywordsAccess().getExternKeyword_22()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getFalseKeyword_23()); }

	'false' 

{ after(grammarAccess.getKeywordsAccess().getFalseKeyword_23()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getFinallyKeyword_24()); }

	'finally' 

{ after(grammarAccess.getKeywordsAccess().getFinallyKeyword_24()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getFixedKeyword_25()); }

	'fixed' 

{ after(grammarAccess.getKeywordsAccess().getFixedKeyword_25()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getFloatKeyword_26()); }

	'float' 

{ after(grammarAccess.getKeywordsAccess().getFloatKeyword_26()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getForKeyword_27()); }

	'for' 

{ after(grammarAccess.getKeywordsAccess().getForKeyword_27()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getForeachKeyword_28()); }

	'foreach' 

{ after(grammarAccess.getKeywordsAccess().getForeachKeyword_28()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getGotoKeyword_29()); }

	'goto' 

{ after(grammarAccess.getKeywordsAccess().getGotoKeyword_29()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getIfKeyword_30()); }

	'if' 

{ after(grammarAccess.getKeywordsAccess().getIfKeyword_30()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getImplicitKeyword_31()); }

	'implicit' 

{ after(grammarAccess.getKeywordsAccess().getImplicitKeyword_31()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getInKeyword_32()); }

	'in' 

{ after(grammarAccess.getKeywordsAccess().getInKeyword_32()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getIntKeyword_33()); }

	'int' 

{ after(grammarAccess.getKeywordsAccess().getIntKeyword_33()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getInterfaceKeyword_34()); }

	'interface' 

{ after(grammarAccess.getKeywordsAccess().getInterfaceKeyword_34()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getInternalKeyword_35()); }

	'internal' 

{ after(grammarAccess.getKeywordsAccess().getInternalKeyword_35()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getIsKeyword_36()); }

	'is' 

{ after(grammarAccess.getKeywordsAccess().getIsKeyword_36()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getLockKeyword_37()); }

	'lock' 

{ after(grammarAccess.getKeywordsAccess().getLockKeyword_37()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getLongKeyword_38()); }

	'long' 

{ after(grammarAccess.getKeywordsAccess().getLongKeyword_38()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getNamespaceKeyword_39()); }

	'namespace' 

{ after(grammarAccess.getKeywordsAccess().getNamespaceKeyword_39()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getNewKeyword_40()); }

	'new' 

{ after(grammarAccess.getKeywordsAccess().getNewKeyword_40()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getNullKeyword_41()); }

	'null' 

{ after(grammarAccess.getKeywordsAccess().getNullKeyword_41()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getObjectKeyword_42()); }

	'object' 

{ after(grammarAccess.getKeywordsAccess().getObjectKeyword_42()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getOperatorKeyword_43()); }

	'operator' 

{ after(grammarAccess.getKeywordsAccess().getOperatorKeyword_43()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getOutKeyword_44()); }

	'out' 

{ after(grammarAccess.getKeywordsAccess().getOutKeyword_44()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getOverrideKeyword_45()); }

	'override' 

{ after(grammarAccess.getKeywordsAccess().getOverrideKeyword_45()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getParamsKeyword_46()); }

	'params' 

{ after(grammarAccess.getKeywordsAccess().getParamsKeyword_46()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getPrivateKeyword_47()); }

	'private' 

{ after(grammarAccess.getKeywordsAccess().getPrivateKeyword_47()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getProtectedKeyword_48()); }

	'protected' 

{ after(grammarAccess.getKeywordsAccess().getProtectedKeyword_48()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getPublicKeyword_49()); }

	'public' 

{ after(grammarAccess.getKeywordsAccess().getPublicKeyword_49()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getReadonlyKeyword_50()); }

	'readonly' 

{ after(grammarAccess.getKeywordsAccess().getReadonlyKeyword_50()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getRefKeyword_51()); }

	'ref' 

{ after(grammarAccess.getKeywordsAccess().getRefKeyword_51()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getReturnKeyword_52()); }

	'return' 

{ after(grammarAccess.getKeywordsAccess().getReturnKeyword_52()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getSbyteKeyword_53()); }

	'sbyte' 

{ after(grammarAccess.getKeywordsAccess().getSbyteKeyword_53()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getSealedKeyword_54()); }

	'sealed' 

{ after(grammarAccess.getKeywordsAccess().getSealedKeyword_54()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getShortKeyword_55()); }

	'short' 

{ after(grammarAccess.getKeywordsAccess().getShortKeyword_55()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getSizeofKeyword_56()); }

	'sizeof' 

{ after(grammarAccess.getKeywordsAccess().getSizeofKeyword_56()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getStackallocKeyword_57()); }

	'stackalloc' 

{ after(grammarAccess.getKeywordsAccess().getStackallocKeyword_57()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getStaticKeyword_58()); }

	'static' 

{ after(grammarAccess.getKeywordsAccess().getStaticKeyword_58()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getStringKeyword_59()); }

	'string' 

{ after(grammarAccess.getKeywordsAccess().getStringKeyword_59()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getStructKeyword_60()); }

	'struct' 

{ after(grammarAccess.getKeywordsAccess().getStructKeyword_60()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getSwitchKeyword_61()); }

	'switch' 

{ after(grammarAccess.getKeywordsAccess().getSwitchKeyword_61()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getThisKeyword_62()); }

	'this' 

{ after(grammarAccess.getKeywordsAccess().getThisKeyword_62()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getThrowKeyword_63()); }

	'throw' 

{ after(grammarAccess.getKeywordsAccess().getThrowKeyword_63()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getTrueKeyword_64()); }

	'true' 

{ after(grammarAccess.getKeywordsAccess().getTrueKeyword_64()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getTryKeyword_65()); }

	'try' 

{ after(grammarAccess.getKeywordsAccess().getTryKeyword_65()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getTypeofKeyword_66()); }

	'typeof' 

{ after(grammarAccess.getKeywordsAccess().getTypeofKeyword_66()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getUintKeyword_67()); }

	'uint' 

{ after(grammarAccess.getKeywordsAccess().getUintKeyword_67()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getUlongKeyword_68()); }

	'ulong' 

{ after(grammarAccess.getKeywordsAccess().getUlongKeyword_68()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getUncheckedKeyword_69()); }

	'unchecked' 

{ after(grammarAccess.getKeywordsAccess().getUncheckedKeyword_69()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getUnsafeKeyword_70()); }

	'unsafe' 

{ after(grammarAccess.getKeywordsAccess().getUnsafeKeyword_70()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getUshortKeyword_71()); }

	'ushort' 

{ after(grammarAccess.getKeywordsAccess().getUshortKeyword_71()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getUsingKeyword_72()); }

	'using' 

{ after(grammarAccess.getKeywordsAccess().getUsingKeyword_72()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getVirtualKeyword_73()); }

	'virtual' 

{ after(grammarAccess.getKeywordsAccess().getVirtualKeyword_73()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getVoidKeyword_74()); }

	'void' 

{ after(grammarAccess.getKeywordsAccess().getVoidKeyword_74()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getVolatileKeyword_75()); }

	'volatile' 

{ after(grammarAccess.getKeywordsAccess().getVolatileKeyword_75()); }
)

    |(
{ before(grammarAccess.getKeywordsAccess().getWhileKeyword_76()); }

	'while' 

{ after(grammarAccess.getKeywordsAccess().getWhileKeyword_76()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIntegerLiteralAccess().getGroup_0()); }
(rule__IntegerLiteral__Group_0__0)
{ after(grammarAccess.getIntegerLiteralAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getIntegerLiteralAccess().getGroup_1()); }
(rule__IntegerLiteral__Group_1__0)
{ after(grammarAccess.getIntegerLiteralAccess().getGroup_1()); }
)

    |(
{ before(grammarAccess.getIntegerLiteralAccess().getGroup_2()); }
(rule__IntegerLiteral__Group_2__0)
{ after(grammarAccess.getIntegerLiteralAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Comment__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommentAccess().getSINGLE_LINE_COMMENTTerminalRuleCall_0()); }
	RULE_SINGLE_LINE_COMMENT
{ after(grammarAccess.getCommentAccess().getSINGLE_LINE_COMMENTTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getCommentAccess().getDELIMITED_COMMENTTerminalRuleCall_1()); }
	RULE_DELIMITED_COMMENT
{ after(grammarAccess.getCommentAccess().getDELIMITED_COMMENTTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IntegralType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIntegralTypeAccess().getSbyteKeyword_0()); }

	'sbyte' 

{ after(grammarAccess.getIntegralTypeAccess().getSbyteKeyword_0()); }
)

    |(
{ before(grammarAccess.getIntegralTypeAccess().getByteKeyword_1()); }

	'byte' 

{ after(grammarAccess.getIntegralTypeAccess().getByteKeyword_1()); }
)

    |(
{ before(grammarAccess.getIntegralTypeAccess().getShortKeyword_2()); }

	'short' 

{ after(grammarAccess.getIntegralTypeAccess().getShortKeyword_2()); }
)

    |(
{ before(grammarAccess.getIntegralTypeAccess().getUshortKeyword_3()); }

	'ushort' 

{ after(grammarAccess.getIntegralTypeAccess().getUshortKeyword_3()); }
)

    |(
{ before(grammarAccess.getIntegralTypeAccess().getIntKeyword_4()); }

	'int' 

{ after(grammarAccess.getIntegralTypeAccess().getIntKeyword_4()); }
)

    |(
{ before(grammarAccess.getIntegralTypeAccess().getUintKeyword_5()); }

	'uint' 

{ after(grammarAccess.getIntegralTypeAccess().getUintKeyword_5()); }
)

    |(
{ before(grammarAccess.getIntegralTypeAccess().getLongKeyword_6()); }

	'long' 

{ after(grammarAccess.getIntegralTypeAccess().getLongKeyword_6()); }
)

    |(
{ before(grammarAccess.getIntegralTypeAccess().getUlongKeyword_7()); }

	'ulong' 

{ after(grammarAccess.getIntegralTypeAccess().getUlongKeyword_7()); }
)

    |(
{ before(grammarAccess.getIntegralTypeAccess().getCharKeyword_8()); }

	'char' 

{ after(grammarAccess.getIntegralTypeAccess().getCharKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BuiltInType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuiltInTypeAccess().getIntegralTypeParserRuleCall_0()); }
	ruleIntegralType
{ after(grammarAccess.getBuiltInTypeAccess().getIntegralTypeParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getBuiltInTypeAccess().getBuiltInClassTypeParserRuleCall_1()); }
	ruleBuiltInClassType
{ after(grammarAccess.getBuiltInTypeAccess().getBuiltInClassTypeParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getBuiltInTypeAccess().getBoolKeyword_2()); }

	'bool' 

{ after(grammarAccess.getBuiltInTypeAccess().getBoolKeyword_2()); }
)

    |(
{ before(grammarAccess.getBuiltInTypeAccess().getDecimalKeyword_3()); }

	'decimal' 

{ after(grammarAccess.getBuiltInTypeAccess().getDecimalKeyword_3()); }
)

    |(
{ before(grammarAccess.getBuiltInTypeAccess().getFloatKeyword_4()); }

	'float' 

{ after(grammarAccess.getBuiltInTypeAccess().getFloatKeyword_4()); }
)

    |(
{ before(grammarAccess.getBuiltInTypeAccess().getDoubleKeyword_5()); }

	'double' 

{ after(grammarAccess.getBuiltInTypeAccess().getDoubleKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BuiltInClassType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuiltInClassTypeAccess().getObjectKeyword_0()); }

	'object' 

{ after(grammarAccess.getBuiltInClassTypeAccess().getObjectKeyword_0()); }
)

    |(
{ before(grammarAccess.getBuiltInClassTypeAccess().getStringKeyword_1()); }

	'string' 

{ after(grammarAccess.getBuiltInClassTypeAccess().getStringKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EnumModifier__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumModifierAccess().getNewKeyword_0()); }

	'new' 

{ after(grammarAccess.getEnumModifierAccess().getNewKeyword_0()); }
)

    |(
{ before(grammarAccess.getEnumModifierAccess().getPublicKeyword_1()); }

	'public' 

{ after(grammarAccess.getEnumModifierAccess().getPublicKeyword_1()); }
)

    |(
{ before(grammarAccess.getEnumModifierAccess().getProtectedKeyword_2()); }

	'protected' 

{ after(grammarAccess.getEnumModifierAccess().getProtectedKeyword_2()); }
)

    |(
{ before(grammarAccess.getEnumModifierAccess().getInternalKeyword_3()); }

	'internal' 

{ after(grammarAccess.getEnumModifierAccess().getInternalKeyword_3()); }
)

    |(
{ before(grammarAccess.getEnumModifierAccess().getPrivateKeyword_4()); }

	'private' 

{ after(grammarAccess.getEnumModifierAccess().getPrivateKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__InputSectionPart__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__InputSectionPart__Group_0__0__Impl
	rule__InputSectionPart__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InputSectionPart__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputSectionPartAccess().getInputElementParserRuleCall_0_0()); }
(	ruleInputElement)*
{ after(grammarAccess.getInputSectionPartAccess().getInputElementParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__InputSectionPart__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__InputSectionPart__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InputSectionPart__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputSectionPartAccess().getNEW_LINETerminalRuleCall_0_1()); }
	RULE_NEW_LINE
{ after(grammarAccess.getInputSectionPartAccess().getNEW_LINETerminalRuleCall_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__IntegerLiteral__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IntegerLiteral__Group_0__0__Impl
	rule__IntegerLiteral__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getIntegerLiteralAccess().getDECIMAL_DIGITTerminalRuleCall_0_0()); }
(	RULE_DECIMAL_DIGIT)
{ after(grammarAccess.getIntegerLiteralAccess().getDECIMAL_DIGITTerminalRuleCall_0_0()); }
)
(
{ before(grammarAccess.getIntegerLiteralAccess().getDECIMAL_DIGITTerminalRuleCall_0_0()); }
(	RULE_DECIMAL_DIGIT)*
{ after(grammarAccess.getIntegerLiteralAccess().getDECIMAL_DIGITTerminalRuleCall_0_0()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerLiteral__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IntegerLiteral__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIntegerLiteralAccess().getINTEGER_TYPE_SUFFIXTerminalRuleCall_0_1()); }
(	RULE_INTEGER_TYPE_SUFFIX)?
{ after(grammarAccess.getIntegerLiteralAccess().getINTEGER_TYPE_SUFFIXTerminalRuleCall_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__IntegerLiteral__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IntegerLiteral__Group_1__0__Impl
	rule__IntegerLiteral__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIntegerLiteralAccess().getXKeyword_1_0()); }

	'0x' 

{ after(grammarAccess.getIntegerLiteralAccess().getXKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerLiteral__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IntegerLiteral__Group_1__1__Impl
	rule__IntegerLiteral__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getIntegerLiteralAccess().getHEX_DIGITTerminalRuleCall_1_1()); }
(	RULE_HEX_DIGIT)
{ after(grammarAccess.getIntegerLiteralAccess().getHEX_DIGITTerminalRuleCall_1_1()); }
)
(
{ before(grammarAccess.getIntegerLiteralAccess().getHEX_DIGITTerminalRuleCall_1_1()); }
(	RULE_HEX_DIGIT)*
{ after(grammarAccess.getIntegerLiteralAccess().getHEX_DIGITTerminalRuleCall_1_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerLiteral__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IntegerLiteral__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIntegerLiteralAccess().getINTEGER_TYPE_SUFFIXTerminalRuleCall_1_2()); }
	RULE_INTEGER_TYPE_SUFFIX
{ after(grammarAccess.getIntegerLiteralAccess().getINTEGER_TYPE_SUFFIXTerminalRuleCall_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__IntegerLiteral__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IntegerLiteral__Group_2__0__Impl
	rule__IntegerLiteral__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIntegerLiteralAccess().getXKeyword_2_0()); }

	'0X' 

{ after(grammarAccess.getIntegerLiteralAccess().getXKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerLiteral__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IntegerLiteral__Group_2__1__Impl
	rule__IntegerLiteral__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getIntegerLiteralAccess().getHEX_DIGITTerminalRuleCall_2_1()); }
(	RULE_HEX_DIGIT)
{ after(grammarAccess.getIntegerLiteralAccess().getHEX_DIGITTerminalRuleCall_2_1()); }
)
(
{ before(grammarAccess.getIntegerLiteralAccess().getHEX_DIGITTerminalRuleCall_2_1()); }
(	RULE_HEX_DIGIT)*
{ after(grammarAccess.getIntegerLiteralAccess().getHEX_DIGITTerminalRuleCall_2_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerLiteral__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IntegerLiteral__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIntegerLiteralAccess().getINTEGER_TYPE_SUFFIXTerminalRuleCall_2_2()); }
(	RULE_INTEGER_TYPE_SUFFIX)?
{ after(grammarAccess.getIntegerLiteralAccess().getINTEGER_TYPE_SUFFIXTerminalRuleCall_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__RANK_SPECIFIER__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RANK_SPECIFIER__Group__0__Impl
	rule__RANK_SPECIFIER__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RANK_SPECIFIER__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRANK_SPECIFIERAccess().getLeftSquareBracketKeyword_0()); }

	'[' 

{ after(grammarAccess.getRANK_SPECIFIERAccess().getLeftSquareBracketKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RANK_SPECIFIER__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RANK_SPECIFIER__Group__1__Impl
	rule__RANK_SPECIFIER__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RANK_SPECIFIER__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRANK_SPECIFIERAccess().getCommaKeyword_1()); }
(
	',' 
)*
{ after(grammarAccess.getRANK_SPECIFIERAccess().getCommaKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RANK_SPECIFIER__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RANK_SPECIFIER__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RANK_SPECIFIER__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRANK_SPECIFIERAccess().getRightSquareBracketKeyword_2()); }

	']' 

{ after(grammarAccess.getRANK_SPECIFIERAccess().getRightSquareBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__EnumBody__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EnumBody__Group__0__Impl
	rule__EnumBody__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumBody__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumBodyAccess().getLeftCurlyBracketKeyword_0()); }

	'{' 

{ after(grammarAccess.getEnumBodyAccess().getLeftCurlyBracketKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EnumBody__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EnumBody__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumBody__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumBodyAccess().getRightCurlyBracketKeyword_1()); }

	'}' 

{ after(grammarAccess.getEnumBodyAccess().getRightCurlyBracketKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__InputAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getInputInputParserRuleCall_0()); }
	ruleInput{ after(grammarAccess.getModelAccess().getInputInputParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_NEW_LINE : ('\n'|'\r');

RULE_WHITE_SPACE : (' '|'\t'|RULE_NEW_LINE)+;

RULE_SINGLE_LINE_COMMENT : '//' '/S'*;

RULE_DELIMITED_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_DECIMAL_DIGIT : '0'..'9';

RULE_INTEGER_TYPE_SUFFIX : ('U'|'u'|'L'|'l'|'UL'|'Ul'|'uL'|'ul'|'LU'|'Lu'|'lU'|'lu');

RULE_HEX_DIGIT : (RULE_DECIMAL_DIGIT|RULE_LETTER);

RULE_LETTER : ('A'..'F'|'a'..'f');


