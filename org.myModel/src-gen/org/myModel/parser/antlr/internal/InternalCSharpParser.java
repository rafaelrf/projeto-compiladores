package org.myModel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.myModel.services.CSharpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCSharpParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'char'", "'System.Char'", "'='", "';'", "'int'", "'System.Int32'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalCSharpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCSharpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCSharpParser.tokenNames; }
    public String getGrammarFileName() { return "../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g"; }



     	private CSharpGrammarAccess grammarAccess;
     	
        public InternalCSharpParser(TokenStream input, CSharpGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected CSharpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:76:1: ruleModel returns [EObject current=null] : ( (lv_typies_0_0= ruleType ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_typies_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:79:28: ( ( (lv_typies_0_0= ruleType ) )* )
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:80:1: ( (lv_typies_0_0= ruleType ) )*
            {
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:80:1: ( (lv_typies_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:81:1: (lv_typies_0_0= ruleType )
            	    {
            	    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:81:1: (lv_typies_0_0= ruleType )
            	    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:82:3: lv_typies_0_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getTypiesTypeParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleModel130);
            	    lv_typies_0_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"typies",
            	            		lv_typies_0_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:106:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:107:2: (iv_ruleType= ruleType EOF )
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:108:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType166);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:115:1: ruleType returns [EObject current=null] : (this_intDefinition_0= ruleintDefinition | this_charDefinitions_1= rulecharDefinitions ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_intDefinition_0 = null;

        EObject this_charDefinitions_1 = null;


         enterRule(); 
            
        try {
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:118:28: ( (this_intDefinition_0= ruleintDefinition | this_charDefinitions_1= rulecharDefinitions ) )
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:119:1: (this_intDefinition_0= ruleintDefinition | this_charDefinitions_1= rulecharDefinitions )
            {
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:119:1: (this_intDefinition_0= ruleintDefinition | this_charDefinitions_1= rulecharDefinitions )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=11 && LA2_0<=12)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:120:5: this_intDefinition_0= ruleintDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleintDefinition_in_ruleType223);
                    this_intDefinition_0=ruleintDefinition();

                    state._fsp--;

                     
                            current = this_intDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:130:5: this_charDefinitions_1= rulecharDefinitions
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getCharDefinitionsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecharDefinitions_in_ruleType250);
                    this_charDefinitions_1=rulecharDefinitions();

                    state._fsp--;

                     
                            current = this_charDefinitions_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulecharDefinitions"
    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:146:1: entryRulecharDefinitions returns [EObject current=null] : iv_rulecharDefinitions= rulecharDefinitions EOF ;
    public final EObject entryRulecharDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecharDefinitions = null;


        try {
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:147:2: (iv_rulecharDefinitions= rulecharDefinitions EOF )
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:148:2: iv_rulecharDefinitions= rulecharDefinitions EOF
            {
             newCompositeNode(grammarAccess.getCharDefinitionsRule()); 
            pushFollow(FOLLOW_rulecharDefinitions_in_entryRulecharDefinitions285);
            iv_rulecharDefinitions=rulecharDefinitions();

            state._fsp--;

             current =iv_rulecharDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecharDefinitions295); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecharDefinitions"


    // $ANTLR start "rulecharDefinitions"
    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:155:1: rulecharDefinitions returns [EObject current=null] : ( ( (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'System.Char' ( (lv_name_3_0= RULE_ID ) ) ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) )? otherlv_6= ';' ) ;
    public final EObject rulecharDefinitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:158:28: ( ( ( (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'System.Char' ( (lv_name_3_0= RULE_ID ) ) ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) )? otherlv_6= ';' ) )
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:159:1: ( ( (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'System.Char' ( (lv_name_3_0= RULE_ID ) ) ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) )? otherlv_6= ';' )
            {
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:159:1: ( ( (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'System.Char' ( (lv_name_3_0= RULE_ID ) ) ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) )? otherlv_6= ';' )
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:159:2: ( (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'System.Char' ( (lv_name_3_0= RULE_ID ) ) ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) )? otherlv_6= ';'
            {
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:159:2: ( (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'System.Char' ( (lv_name_3_0= RULE_ID ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:159:3: (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:159:3: (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:159:5: otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulecharDefinitions334); 

                        	newLeafNode(otherlv_0, grammarAccess.getCharDefinitionsAccess().getCharKeyword_0_0_0());
                        
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:163:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:164:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:164:1: (lv_name_1_0= RULE_ID )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:165:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulecharDefinitions351); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getCharDefinitionsAccess().getNameIDTerminalRuleCall_0_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCharDefinitionsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:182:6: (otherlv_2= 'System.Char' ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:182:6: (otherlv_2= 'System.Char' ( (lv_name_3_0= RULE_ID ) ) )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:182:8: otherlv_2= 'System.Char' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulecharDefinitions376); 

                        	newLeafNode(otherlv_2, grammarAccess.getCharDefinitionsAccess().getSystemCharKeyword_0_1_0());
                        
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:186:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:187:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:187:1: (lv_name_3_0= RULE_ID )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:188:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulecharDefinitions393); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getCharDefinitionsAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCharDefinitionsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:204:4: (otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:204:6: otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulecharDefinitions413); 

                        	newLeafNode(otherlv_4, grammarAccess.getCharDefinitionsAccess().getEqualsSignKeyword_1_0());
                        
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:208:1: ( (lv_value_5_0= RULE_INT ) )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:209:1: (lv_value_5_0= RULE_INT )
                    {
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:209:1: (lv_value_5_0= RULE_INT )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:210:3: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulecharDefinitions430); 

                    			newLeafNode(lv_value_5_0, grammarAccess.getCharDefinitionsAccess().getValueINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCharDefinitionsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_rulecharDefinitions449); 

                	newLeafNode(otherlv_6, grammarAccess.getCharDefinitionsAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecharDefinitions"


    // $ANTLR start "entryRuleintDefinition"
    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:238:1: entryRuleintDefinition returns [EObject current=null] : iv_ruleintDefinition= ruleintDefinition EOF ;
    public final EObject entryRuleintDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleintDefinition = null;


        try {
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:239:2: (iv_ruleintDefinition= ruleintDefinition EOF )
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:240:2: iv_ruleintDefinition= ruleintDefinition EOF
            {
             newCompositeNode(grammarAccess.getIntDefinitionRule()); 
            pushFollow(FOLLOW_ruleintDefinition_in_entryRuleintDefinition485);
            iv_ruleintDefinition=ruleintDefinition();

            state._fsp--;

             current =iv_ruleintDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleintDefinition495); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleintDefinition"


    // $ANTLR start "ruleintDefinition"
    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:247:1: ruleintDefinition returns [EObject current=null] : ( ( (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'System.Int32' ( (lv_name_3_0= RULE_ID ) ) ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleintDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:250:28: ( ( ( (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'System.Int32' ( (lv_name_3_0= RULE_ID ) ) ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) )? otherlv_6= ';' ) )
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:251:1: ( ( (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'System.Int32' ( (lv_name_3_0= RULE_ID ) ) ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) )? otherlv_6= ';' )
            {
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:251:1: ( ( (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'System.Int32' ( (lv_name_3_0= RULE_ID ) ) ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) )? otherlv_6= ';' )
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:251:2: ( (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'System.Int32' ( (lv_name_3_0= RULE_ID ) ) ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) )? otherlv_6= ';'
            {
            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:251:2: ( (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'System.Int32' ( (lv_name_3_0= RULE_ID ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:251:3: (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:251:3: (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:251:5: otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleintDefinition534); 

                        	newLeafNode(otherlv_0, grammarAccess.getIntDefinitionAccess().getIntKeyword_0_0_0());
                        
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:255:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:256:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:256:1: (lv_name_1_0= RULE_ID )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:257:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleintDefinition551); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getIntDefinitionAccess().getNameIDTerminalRuleCall_0_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:274:6: (otherlv_2= 'System.Int32' ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:274:6: (otherlv_2= 'System.Int32' ( (lv_name_3_0= RULE_ID ) ) )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:274:8: otherlv_2= 'System.Int32' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleintDefinition576); 

                        	newLeafNode(otherlv_2, grammarAccess.getIntDefinitionAccess().getSystemInt32Keyword_0_1_0());
                        
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:278:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:279:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:279:1: (lv_name_3_0= RULE_ID )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:280:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleintDefinition593); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getIntDefinitionAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:296:4: (otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:296:6: otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleintDefinition613); 

                        	newLeafNode(otherlv_4, grammarAccess.getIntDefinitionAccess().getEqualsSignKeyword_1_0());
                        
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:300:1: ( (lv_value_5_0= RULE_INT ) )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:301:1: (lv_value_5_0= RULE_INT )
                    {
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:301:1: (lv_value_5_0= RULE_INT )
                    // ../org.myModel/src-gen/org/myModel/parser/antlr/internal/InternalCSharp.g:302:3: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleintDefinition630); 

                    			newLeafNode(lv_value_5_0, grammarAccess.getIntDefinitionAccess().getValueINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleintDefinition649); 

                	newLeafNode(otherlv_6, grammarAccess.getIntDefinitionAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleintDefinition"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModel130 = new BitSet(new long[]{0x0000000000019802L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleintDefinition_in_ruleType223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharDefinitions_in_ruleType250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharDefinitions_in_entryRulecharDefinitions285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecharDefinitions295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulecharDefinitions334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulecharDefinitions351 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_12_in_rulecharDefinitions376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulecharDefinitions393 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_rulecharDefinitions413 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulecharDefinitions430 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulecharDefinitions449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleintDefinition_in_entryRuleintDefinition485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleintDefinition495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleintDefinition534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleintDefinition551 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_16_in_ruleintDefinition576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleintDefinition593 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleintDefinition613 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleintDefinition630 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleintDefinition649 = new BitSet(new long[]{0x0000000000000002L});

}