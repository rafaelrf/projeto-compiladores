/*
* generated by Xtext
*/
package org.myModel.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class CSharpGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cTypiesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTypiesTypeParserRuleCall_0 = (RuleCall)cTypiesAssignment.eContents().get(0);
		
		//Model:
		//	typies+=Type*;
		public ParserRule getRule() { return rule; }

		//typies+=Type*
		public Assignment getTypiesAssignment() { return cTypiesAssignment; }

		//Type
		public RuleCall getTypiesTypeParserRuleCall_0() { return cTypiesTypeParserRuleCall_0; }
	}

	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIntDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCharDefinitionsParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type:
		//	intDefinition | charDefinitions;
		public ParserRule getRule() { return rule; }

		//intDefinition | charDefinitions
		public Alternatives getAlternatives() { return cAlternatives; }

		//intDefinition
		public RuleCall getIntDefinitionParserRuleCall_0() { return cIntDefinitionParserRuleCall_0; }

		//charDefinitions
		public RuleCall getCharDefinitionsParserRuleCall_1() { return cCharDefinitionsParserRuleCall_1; }
	}

	public class CharDefinitionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "charDefinitions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cAlternatives_0.eContents().get(0);
		private final Keyword cCharKeyword_0_0_0 = (Keyword)cGroup_0_0.eContents().get(0);
		private final Assignment cNameAssignment_0_0_1 = (Assignment)cGroup_0_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_0_1_0 = (RuleCall)cNameAssignment_0_0_1.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final Keyword cSystemCharKeyword_0_1_0 = (Keyword)cGroup_0_1.eContents().get(0);
		private final Assignment cNameAssignment_0_1_1 = (Assignment)cGroup_0_1.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_1_0 = (RuleCall)cNameAssignment_0_1_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//charDefinitions:
		//	("char" name=ID | "System.Char" name=ID) ("=" value=INT)? ";";
		public ParserRule getRule() { return rule; }

		//("char" name=ID | "System.Char" name=ID) ("=" value=INT)? ";"
		public Group getGroup() { return cGroup; }

		//"char" name=ID | "System.Char" name=ID
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//"char" name=ID
		public Group getGroup_0_0() { return cGroup_0_0; }

		//"char"
		public Keyword getCharKeyword_0_0_0() { return cCharKeyword_0_0_0; }

		//name=ID
		public Assignment getNameAssignment_0_0_1() { return cNameAssignment_0_0_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0_1_0() { return cNameIDTerminalRuleCall_0_0_1_0; }

		//"System.Char" name=ID
		public Group getGroup_0_1() { return cGroup_0_1; }

		//"System.Char"
		public Keyword getSystemCharKeyword_0_1_0() { return cSystemCharKeyword_0_1_0; }

		//name=ID
		public Assignment getNameAssignment_0_1_1() { return cNameAssignment_0_1_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_1_0() { return cNameIDTerminalRuleCall_0_1_1_0; }

		//("=" value=INT)?
		public Group getGroup_1() { return cGroup_1; }

		//"="
		public Keyword getEqualsSignKeyword_1_0() { return cEqualsSignKeyword_1_0; }

		//value=INT
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }

		//INT
		public RuleCall getValueINTTerminalRuleCall_1_1_0() { return cValueINTTerminalRuleCall_1_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class IntDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "intDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cAlternatives_0.eContents().get(0);
		private final Keyword cIntKeyword_0_0_0 = (Keyword)cGroup_0_0.eContents().get(0);
		private final Assignment cNameAssignment_0_0_1 = (Assignment)cGroup_0_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_0_1_0 = (RuleCall)cNameAssignment_0_0_1.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final Keyword cSystemInt32Keyword_0_1_0 = (Keyword)cGroup_0_1.eContents().get(0);
		private final Assignment cNameAssignment_0_1_1 = (Assignment)cGroup_0_1.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_1_0 = (RuleCall)cNameAssignment_0_1_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//intDefinition:
		//	("int" name=ID | "System.Int32" name=ID) ("=" value=INT)? ";";
		public ParserRule getRule() { return rule; }

		//("int" name=ID | "System.Int32" name=ID) ("=" value=INT)? ";"
		public Group getGroup() { return cGroup; }

		//"int" name=ID | "System.Int32" name=ID
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//"int" name=ID
		public Group getGroup_0_0() { return cGroup_0_0; }

		//"int"
		public Keyword getIntKeyword_0_0_0() { return cIntKeyword_0_0_0; }

		//name=ID
		public Assignment getNameAssignment_0_0_1() { return cNameAssignment_0_0_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0_1_0() { return cNameIDTerminalRuleCall_0_0_1_0; }

		//"System.Int32" name=ID
		public Group getGroup_0_1() { return cGroup_0_1; }

		//"System.Int32"
		public Keyword getSystemInt32Keyword_0_1_0() { return cSystemInt32Keyword_0_1_0; }

		//name=ID
		public Assignment getNameAssignment_0_1_1() { return cNameAssignment_0_1_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_1_0() { return cNameIDTerminalRuleCall_0_1_1_0; }

		//("=" value=INT)?
		public Group getGroup_1() { return cGroup_1; }

		//"="
		public Keyword getEqualsSignKeyword_1_0() { return cEqualsSignKeyword_1_0; }

		//value=INT
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }

		//INT
		public RuleCall getValueINTTerminalRuleCall_1_1_0() { return cValueINTTerminalRuleCall_1_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	
	
	private ModelElements pModel;
	private TypeElements pType;
	private CharDefinitionsElements pCharDefinitions;
	private IntDefinitionElements pIntDefinition;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public CSharpGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.myModel.CSharp".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	typies+=Type*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Type:
	//	intDefinition | charDefinitions;
	public TypeElements getTypeAccess() {
		return (pType != null) ? pType : (pType = new TypeElements());
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}

	//charDefinitions:
	//	("char" name=ID | "System.Char" name=ID) ("=" value=INT)? ";";
	public CharDefinitionsElements getCharDefinitionsAccess() {
		return (pCharDefinitions != null) ? pCharDefinitions : (pCharDefinitions = new CharDefinitionsElements());
	}
	
	public ParserRule getCharDefinitionsRule() {
		return getCharDefinitionsAccess().getRule();
	}

	//intDefinition:
	//	("int" name=ID | "System.Int32" name=ID) ("=" value=INT)? ";";
	public IntDefinitionElements getIntDefinitionAccess() {
		return (pIntDefinition != null) ? pIntDefinition : (pIntDefinition = new IntDefinitionElements());
	}
	
	public ParserRule getIntDefinitionRule() {
		return getIntDefinitionAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}