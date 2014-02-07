package org.myModel.ui.contentassist.antlr.internal; 

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
import org.myModel.services.CSharpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCSharpParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'char'", "'System.Char'", "'='", "'int'", "'System.Int32'"
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
    public String getGrammarFileName() { return "../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:61:1: ( ruleModel EOF )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:69:1: ruleModel : ( ( rule__Model__TypiesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:73:2: ( ( ( rule__Model__TypiesAssignment )* ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:74:1: ( ( rule__Model__TypiesAssignment )* )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:74:1: ( ( rule__Model__TypiesAssignment )* )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:75:1: ( rule__Model__TypiesAssignment )*
            {
             before(grammarAccess.getModelAccess().getTypiesAssignment()); 
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:76:1: ( rule__Model__TypiesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)||(LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:76:2: rule__Model__TypiesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__TypiesAssignment_in_ruleModel94);
            	    rule__Model__TypiesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypiesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:88:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:89:1: ( ruleType EOF )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:90:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType122);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:97:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:101:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:102:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:102:1: ( ( rule__Type__Alternatives ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:103:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:104:1: ( rule__Type__Alternatives )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:104:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType155);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulecharDefinitions"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:116:1: entryRulecharDefinitions : rulecharDefinitions EOF ;
    public final void entryRulecharDefinitions() throws RecognitionException {
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:117:1: ( rulecharDefinitions EOF )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:118:1: rulecharDefinitions EOF
            {
             before(grammarAccess.getCharDefinitionsRule()); 
            pushFollow(FOLLOW_rulecharDefinitions_in_entryRulecharDefinitions182);
            rulecharDefinitions();

            state._fsp--;

             after(grammarAccess.getCharDefinitionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecharDefinitions189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecharDefinitions"


    // $ANTLR start "rulecharDefinitions"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:125:1: rulecharDefinitions : ( ( rule__CharDefinitions__Group__0 ) ) ;
    public final void rulecharDefinitions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:129:2: ( ( ( rule__CharDefinitions__Group__0 ) ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:130:1: ( ( rule__CharDefinitions__Group__0 ) )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:130:1: ( ( rule__CharDefinitions__Group__0 ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:131:1: ( rule__CharDefinitions__Group__0 )
            {
             before(grammarAccess.getCharDefinitionsAccess().getGroup()); 
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:132:1: ( rule__CharDefinitions__Group__0 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:132:2: rule__CharDefinitions__Group__0
            {
            pushFollow(FOLLOW_rule__CharDefinitions__Group__0_in_rulecharDefinitions215);
            rule__CharDefinitions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharDefinitionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecharDefinitions"


    // $ANTLR start "entryRuleintDefinition"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:144:1: entryRuleintDefinition : ruleintDefinition EOF ;
    public final void entryRuleintDefinition() throws RecognitionException {
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:145:1: ( ruleintDefinition EOF )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:146:1: ruleintDefinition EOF
            {
             before(grammarAccess.getIntDefinitionRule()); 
            pushFollow(FOLLOW_ruleintDefinition_in_entryRuleintDefinition242);
            ruleintDefinition();

            state._fsp--;

             after(grammarAccess.getIntDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleintDefinition249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleintDefinition"


    // $ANTLR start "ruleintDefinition"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:153:1: ruleintDefinition : ( ( rule__IntDefinition__Group__0 ) ) ;
    public final void ruleintDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:157:2: ( ( ( rule__IntDefinition__Group__0 ) ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:158:1: ( ( rule__IntDefinition__Group__0 ) )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:158:1: ( ( rule__IntDefinition__Group__0 ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:159:1: ( rule__IntDefinition__Group__0 )
            {
             before(grammarAccess.getIntDefinitionAccess().getGroup()); 
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:160:1: ( rule__IntDefinition__Group__0 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:160:2: rule__IntDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__IntDefinition__Group__0_in_ruleintDefinition275);
            rule__IntDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleintDefinition"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:172:1: rule__Type__Alternatives : ( ( ruleintDefinition ) | ( rulecharDefinitions ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:176:1: ( ( ruleintDefinition ) | ( rulecharDefinitions ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=12 && LA2_0<=13)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:177:1: ( ruleintDefinition )
                    {
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:177:1: ( ruleintDefinition )
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:178:1: ruleintDefinition
                    {
                     before(grammarAccess.getTypeAccess().getIntDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleintDefinition_in_rule__Type__Alternatives311);
                    ruleintDefinition();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:183:6: ( rulecharDefinitions )
                    {
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:183:6: ( rulecharDefinitions )
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:184:1: rulecharDefinitions
                    {
                     before(grammarAccess.getTypeAccess().getCharDefinitionsParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulecharDefinitions_in_rule__Type__Alternatives328);
                    rulecharDefinitions();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getCharDefinitionsParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__CharDefinitions__Alternatives_0"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:194:1: rule__CharDefinitions__Alternatives_0 : ( ( ( rule__CharDefinitions__Group_0_0__0 ) ) | ( ( rule__CharDefinitions__Group_0_1__0 ) ) );
    public final void rule__CharDefinitions__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:198:1: ( ( ( rule__CharDefinitions__Group_0_0__0 ) ) | ( ( rule__CharDefinitions__Group_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:199:1: ( ( rule__CharDefinitions__Group_0_0__0 ) )
                    {
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:199:1: ( ( rule__CharDefinitions__Group_0_0__0 ) )
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:200:1: ( rule__CharDefinitions__Group_0_0__0 )
                    {
                     before(grammarAccess.getCharDefinitionsAccess().getGroup_0_0()); 
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:201:1: ( rule__CharDefinitions__Group_0_0__0 )
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:201:2: rule__CharDefinitions__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__CharDefinitions__Group_0_0__0_in_rule__CharDefinitions__Alternatives_0360);
                    rule__CharDefinitions__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharDefinitionsAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:205:6: ( ( rule__CharDefinitions__Group_0_1__0 ) )
                    {
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:205:6: ( ( rule__CharDefinitions__Group_0_1__0 ) )
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:206:1: ( rule__CharDefinitions__Group_0_1__0 )
                    {
                     before(grammarAccess.getCharDefinitionsAccess().getGroup_0_1()); 
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:207:1: ( rule__CharDefinitions__Group_0_1__0 )
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:207:2: rule__CharDefinitions__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__CharDefinitions__Group_0_1__0_in_rule__CharDefinitions__Alternatives_0378);
                    rule__CharDefinitions__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharDefinitionsAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Alternatives_0"


    // $ANTLR start "rule__IntDefinition__Alternatives_0"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:216:1: rule__IntDefinition__Alternatives_0 : ( ( ( rule__IntDefinition__Group_0_0__0 ) ) | ( ( rule__IntDefinition__Group_0_1__0 ) ) );
    public final void rule__IntDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:220:1: ( ( ( rule__IntDefinition__Group_0_0__0 ) ) | ( ( rule__IntDefinition__Group_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:221:1: ( ( rule__IntDefinition__Group_0_0__0 ) )
                    {
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:221:1: ( ( rule__IntDefinition__Group_0_0__0 ) )
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:222:1: ( rule__IntDefinition__Group_0_0__0 )
                    {
                     before(grammarAccess.getIntDefinitionAccess().getGroup_0_0()); 
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:223:1: ( rule__IntDefinition__Group_0_0__0 )
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:223:2: rule__IntDefinition__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__IntDefinition__Group_0_0__0_in_rule__IntDefinition__Alternatives_0411);
                    rule__IntDefinition__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntDefinitionAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:227:6: ( ( rule__IntDefinition__Group_0_1__0 ) )
                    {
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:227:6: ( ( rule__IntDefinition__Group_0_1__0 ) )
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:228:1: ( rule__IntDefinition__Group_0_1__0 )
                    {
                     before(grammarAccess.getIntDefinitionAccess().getGroup_0_1()); 
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:229:1: ( rule__IntDefinition__Group_0_1__0 )
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:229:2: rule__IntDefinition__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__IntDefinition__Group_0_1__0_in_rule__IntDefinition__Alternatives_0429);
                    rule__IntDefinition__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntDefinitionAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Alternatives_0"


    // $ANTLR start "rule__CharDefinitions__Group__0"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:240:1: rule__CharDefinitions__Group__0 : rule__CharDefinitions__Group__0__Impl rule__CharDefinitions__Group__1 ;
    public final void rule__CharDefinitions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:244:1: ( rule__CharDefinitions__Group__0__Impl rule__CharDefinitions__Group__1 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:245:2: rule__CharDefinitions__Group__0__Impl rule__CharDefinitions__Group__1
            {
            pushFollow(FOLLOW_rule__CharDefinitions__Group__0__Impl_in_rule__CharDefinitions__Group__0460);
            rule__CharDefinitions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharDefinitions__Group__1_in_rule__CharDefinitions__Group__0463);
            rule__CharDefinitions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group__0"


    // $ANTLR start "rule__CharDefinitions__Group__0__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:252:1: rule__CharDefinitions__Group__0__Impl : ( ( rule__CharDefinitions__Alternatives_0 ) ) ;
    public final void rule__CharDefinitions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:256:1: ( ( ( rule__CharDefinitions__Alternatives_0 ) ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:257:1: ( ( rule__CharDefinitions__Alternatives_0 ) )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:257:1: ( ( rule__CharDefinitions__Alternatives_0 ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:258:1: ( rule__CharDefinitions__Alternatives_0 )
            {
             before(grammarAccess.getCharDefinitionsAccess().getAlternatives_0()); 
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:259:1: ( rule__CharDefinitions__Alternatives_0 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:259:2: rule__CharDefinitions__Alternatives_0
            {
            pushFollow(FOLLOW_rule__CharDefinitions__Alternatives_0_in_rule__CharDefinitions__Group__0__Impl490);
            rule__CharDefinitions__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCharDefinitionsAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group__0__Impl"


    // $ANTLR start "rule__CharDefinitions__Group__1"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:269:1: rule__CharDefinitions__Group__1 : rule__CharDefinitions__Group__1__Impl rule__CharDefinitions__Group__2 ;
    public final void rule__CharDefinitions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:273:1: ( rule__CharDefinitions__Group__1__Impl rule__CharDefinitions__Group__2 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:274:2: rule__CharDefinitions__Group__1__Impl rule__CharDefinitions__Group__2
            {
            pushFollow(FOLLOW_rule__CharDefinitions__Group__1__Impl_in_rule__CharDefinitions__Group__1520);
            rule__CharDefinitions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharDefinitions__Group__2_in_rule__CharDefinitions__Group__1523);
            rule__CharDefinitions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group__1"


    // $ANTLR start "rule__CharDefinitions__Group__1__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:281:1: rule__CharDefinitions__Group__1__Impl : ( ( rule__CharDefinitions__Group_1__0 )? ) ;
    public final void rule__CharDefinitions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:285:1: ( ( ( rule__CharDefinitions__Group_1__0 )? ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:286:1: ( ( rule__CharDefinitions__Group_1__0 )? )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:286:1: ( ( rule__CharDefinitions__Group_1__0 )? )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:287:1: ( rule__CharDefinitions__Group_1__0 )?
            {
             before(grammarAccess.getCharDefinitionsAccess().getGroup_1()); 
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:288:1: ( rule__CharDefinitions__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:288:2: rule__CharDefinitions__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CharDefinitions__Group_1__0_in_rule__CharDefinitions__Group__1__Impl550);
                    rule__CharDefinitions__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharDefinitionsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group__1__Impl"


    // $ANTLR start "rule__CharDefinitions__Group__2"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:298:1: rule__CharDefinitions__Group__2 : rule__CharDefinitions__Group__2__Impl ;
    public final void rule__CharDefinitions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:302:1: ( rule__CharDefinitions__Group__2__Impl )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:303:2: rule__CharDefinitions__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CharDefinitions__Group__2__Impl_in_rule__CharDefinitions__Group__2581);
            rule__CharDefinitions__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group__2"


    // $ANTLR start "rule__CharDefinitions__Group__2__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:309:1: rule__CharDefinitions__Group__2__Impl : ( ';' ) ;
    public final void rule__CharDefinitions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:313:1: ( ( ';' ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:314:1: ( ';' )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:314:1: ( ';' )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:315:1: ';'
            {
             before(grammarAccess.getCharDefinitionsAccess().getSemicolonKeyword_2()); 
            match(input,11,FOLLOW_11_in_rule__CharDefinitions__Group__2__Impl609); 
             after(grammarAccess.getCharDefinitionsAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group__2__Impl"


    // $ANTLR start "rule__CharDefinitions__Group_0_0__0"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:334:1: rule__CharDefinitions__Group_0_0__0 : rule__CharDefinitions__Group_0_0__0__Impl rule__CharDefinitions__Group_0_0__1 ;
    public final void rule__CharDefinitions__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:338:1: ( rule__CharDefinitions__Group_0_0__0__Impl rule__CharDefinitions__Group_0_0__1 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:339:2: rule__CharDefinitions__Group_0_0__0__Impl rule__CharDefinitions__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__CharDefinitions__Group_0_0__0__Impl_in_rule__CharDefinitions__Group_0_0__0646);
            rule__CharDefinitions__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharDefinitions__Group_0_0__1_in_rule__CharDefinitions__Group_0_0__0649);
            rule__CharDefinitions__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group_0_0__0"


    // $ANTLR start "rule__CharDefinitions__Group_0_0__0__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:346:1: rule__CharDefinitions__Group_0_0__0__Impl : ( 'char' ) ;
    public final void rule__CharDefinitions__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:350:1: ( ( 'char' ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:351:1: ( 'char' )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:351:1: ( 'char' )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:352:1: 'char'
            {
             before(grammarAccess.getCharDefinitionsAccess().getCharKeyword_0_0_0()); 
            match(input,12,FOLLOW_12_in_rule__CharDefinitions__Group_0_0__0__Impl677); 
             after(grammarAccess.getCharDefinitionsAccess().getCharKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group_0_0__0__Impl"


    // $ANTLR start "rule__CharDefinitions__Group_0_0__1"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:365:1: rule__CharDefinitions__Group_0_0__1 : rule__CharDefinitions__Group_0_0__1__Impl ;
    public final void rule__CharDefinitions__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:369:1: ( rule__CharDefinitions__Group_0_0__1__Impl )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:370:2: rule__CharDefinitions__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CharDefinitions__Group_0_0__1__Impl_in_rule__CharDefinitions__Group_0_0__1708);
            rule__CharDefinitions__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group_0_0__1"


    // $ANTLR start "rule__CharDefinitions__Group_0_0__1__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:376:1: rule__CharDefinitions__Group_0_0__1__Impl : ( ( rule__CharDefinitions__NameAssignment_0_0_1 ) ) ;
    public final void rule__CharDefinitions__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:380:1: ( ( ( rule__CharDefinitions__NameAssignment_0_0_1 ) ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:381:1: ( ( rule__CharDefinitions__NameAssignment_0_0_1 ) )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:381:1: ( ( rule__CharDefinitions__NameAssignment_0_0_1 ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:382:1: ( rule__CharDefinitions__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getCharDefinitionsAccess().getNameAssignment_0_0_1()); 
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:383:1: ( rule__CharDefinitions__NameAssignment_0_0_1 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:383:2: rule__CharDefinitions__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__CharDefinitions__NameAssignment_0_0_1_in_rule__CharDefinitions__Group_0_0__1__Impl735);
            rule__CharDefinitions__NameAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCharDefinitionsAccess().getNameAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group_0_0__1__Impl"


    // $ANTLR start "rule__CharDefinitions__Group_0_1__0"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:397:1: rule__CharDefinitions__Group_0_1__0 : rule__CharDefinitions__Group_0_1__0__Impl rule__CharDefinitions__Group_0_1__1 ;
    public final void rule__CharDefinitions__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:401:1: ( rule__CharDefinitions__Group_0_1__0__Impl rule__CharDefinitions__Group_0_1__1 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:402:2: rule__CharDefinitions__Group_0_1__0__Impl rule__CharDefinitions__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__CharDefinitions__Group_0_1__0__Impl_in_rule__CharDefinitions__Group_0_1__0769);
            rule__CharDefinitions__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharDefinitions__Group_0_1__1_in_rule__CharDefinitions__Group_0_1__0772);
            rule__CharDefinitions__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group_0_1__0"


    // $ANTLR start "rule__CharDefinitions__Group_0_1__0__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:409:1: rule__CharDefinitions__Group_0_1__0__Impl : ( 'System.Char' ) ;
    public final void rule__CharDefinitions__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:413:1: ( ( 'System.Char' ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:414:1: ( 'System.Char' )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:414:1: ( 'System.Char' )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:415:1: 'System.Char'
            {
             before(grammarAccess.getCharDefinitionsAccess().getSystemCharKeyword_0_1_0()); 
            match(input,13,FOLLOW_13_in_rule__CharDefinitions__Group_0_1__0__Impl800); 
             after(grammarAccess.getCharDefinitionsAccess().getSystemCharKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group_0_1__0__Impl"


    // $ANTLR start "rule__CharDefinitions__Group_0_1__1"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:428:1: rule__CharDefinitions__Group_0_1__1 : rule__CharDefinitions__Group_0_1__1__Impl ;
    public final void rule__CharDefinitions__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:432:1: ( rule__CharDefinitions__Group_0_1__1__Impl )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:433:2: rule__CharDefinitions__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CharDefinitions__Group_0_1__1__Impl_in_rule__CharDefinitions__Group_0_1__1831);
            rule__CharDefinitions__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group_0_1__1"


    // $ANTLR start "rule__CharDefinitions__Group_0_1__1__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:439:1: rule__CharDefinitions__Group_0_1__1__Impl : ( ( rule__CharDefinitions__NameAssignment_0_1_1 ) ) ;
    public final void rule__CharDefinitions__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:443:1: ( ( ( rule__CharDefinitions__NameAssignment_0_1_1 ) ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:444:1: ( ( rule__CharDefinitions__NameAssignment_0_1_1 ) )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:444:1: ( ( rule__CharDefinitions__NameAssignment_0_1_1 ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:445:1: ( rule__CharDefinitions__NameAssignment_0_1_1 )
            {
             before(grammarAccess.getCharDefinitionsAccess().getNameAssignment_0_1_1()); 
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:446:1: ( rule__CharDefinitions__NameAssignment_0_1_1 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:446:2: rule__CharDefinitions__NameAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__CharDefinitions__NameAssignment_0_1_1_in_rule__CharDefinitions__Group_0_1__1__Impl858);
            rule__CharDefinitions__NameAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCharDefinitionsAccess().getNameAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group_0_1__1__Impl"


    // $ANTLR start "rule__CharDefinitions__Group_1__0"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:460:1: rule__CharDefinitions__Group_1__0 : rule__CharDefinitions__Group_1__0__Impl rule__CharDefinitions__Group_1__1 ;
    public final void rule__CharDefinitions__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:464:1: ( rule__CharDefinitions__Group_1__0__Impl rule__CharDefinitions__Group_1__1 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:465:2: rule__CharDefinitions__Group_1__0__Impl rule__CharDefinitions__Group_1__1
            {
            pushFollow(FOLLOW_rule__CharDefinitions__Group_1__0__Impl_in_rule__CharDefinitions__Group_1__0892);
            rule__CharDefinitions__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharDefinitions__Group_1__1_in_rule__CharDefinitions__Group_1__0895);
            rule__CharDefinitions__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group_1__0"


    // $ANTLR start "rule__CharDefinitions__Group_1__0__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:472:1: rule__CharDefinitions__Group_1__0__Impl : ( '=' ) ;
    public final void rule__CharDefinitions__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:476:1: ( ( '=' ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:477:1: ( '=' )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:477:1: ( '=' )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:478:1: '='
            {
             before(grammarAccess.getCharDefinitionsAccess().getEqualsSignKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__CharDefinitions__Group_1__0__Impl923); 
             after(grammarAccess.getCharDefinitionsAccess().getEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group_1__0__Impl"


    // $ANTLR start "rule__CharDefinitions__Group_1__1"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:491:1: rule__CharDefinitions__Group_1__1 : rule__CharDefinitions__Group_1__1__Impl ;
    public final void rule__CharDefinitions__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:495:1: ( rule__CharDefinitions__Group_1__1__Impl )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:496:2: rule__CharDefinitions__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CharDefinitions__Group_1__1__Impl_in_rule__CharDefinitions__Group_1__1954);
            rule__CharDefinitions__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group_1__1"


    // $ANTLR start "rule__CharDefinitions__Group_1__1__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:502:1: rule__CharDefinitions__Group_1__1__Impl : ( ( rule__CharDefinitions__ValueAssignment_1_1 ) ) ;
    public final void rule__CharDefinitions__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:506:1: ( ( ( rule__CharDefinitions__ValueAssignment_1_1 ) ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:507:1: ( ( rule__CharDefinitions__ValueAssignment_1_1 ) )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:507:1: ( ( rule__CharDefinitions__ValueAssignment_1_1 ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:508:1: ( rule__CharDefinitions__ValueAssignment_1_1 )
            {
             before(grammarAccess.getCharDefinitionsAccess().getValueAssignment_1_1()); 
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:509:1: ( rule__CharDefinitions__ValueAssignment_1_1 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:509:2: rule__CharDefinitions__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CharDefinitions__ValueAssignment_1_1_in_rule__CharDefinitions__Group_1__1__Impl981);
            rule__CharDefinitions__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCharDefinitionsAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__Group_1__1__Impl"


    // $ANTLR start "rule__IntDefinition__Group__0"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:523:1: rule__IntDefinition__Group__0 : rule__IntDefinition__Group__0__Impl rule__IntDefinition__Group__1 ;
    public final void rule__IntDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:527:1: ( rule__IntDefinition__Group__0__Impl rule__IntDefinition__Group__1 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:528:2: rule__IntDefinition__Group__0__Impl rule__IntDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__IntDefinition__Group__0__Impl_in_rule__IntDefinition__Group__01015);
            rule__IntDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntDefinition__Group__1_in_rule__IntDefinition__Group__01018);
            rule__IntDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group__0"


    // $ANTLR start "rule__IntDefinition__Group__0__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:535:1: rule__IntDefinition__Group__0__Impl : ( ( rule__IntDefinition__Alternatives_0 ) ) ;
    public final void rule__IntDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:539:1: ( ( ( rule__IntDefinition__Alternatives_0 ) ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:540:1: ( ( rule__IntDefinition__Alternatives_0 ) )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:540:1: ( ( rule__IntDefinition__Alternatives_0 ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:541:1: ( rule__IntDefinition__Alternatives_0 )
            {
             before(grammarAccess.getIntDefinitionAccess().getAlternatives_0()); 
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:542:1: ( rule__IntDefinition__Alternatives_0 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:542:2: rule__IntDefinition__Alternatives_0
            {
            pushFollow(FOLLOW_rule__IntDefinition__Alternatives_0_in_rule__IntDefinition__Group__0__Impl1045);
            rule__IntDefinition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getIntDefinitionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group__0__Impl"


    // $ANTLR start "rule__IntDefinition__Group__1"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:552:1: rule__IntDefinition__Group__1 : rule__IntDefinition__Group__1__Impl rule__IntDefinition__Group__2 ;
    public final void rule__IntDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:556:1: ( rule__IntDefinition__Group__1__Impl rule__IntDefinition__Group__2 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:557:2: rule__IntDefinition__Group__1__Impl rule__IntDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__IntDefinition__Group__1__Impl_in_rule__IntDefinition__Group__11075);
            rule__IntDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntDefinition__Group__2_in_rule__IntDefinition__Group__11078);
            rule__IntDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group__1"


    // $ANTLR start "rule__IntDefinition__Group__1__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:564:1: rule__IntDefinition__Group__1__Impl : ( ( rule__IntDefinition__Group_1__0 )? ) ;
    public final void rule__IntDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:568:1: ( ( ( rule__IntDefinition__Group_1__0 )? ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:569:1: ( ( rule__IntDefinition__Group_1__0 )? )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:569:1: ( ( rule__IntDefinition__Group_1__0 )? )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:570:1: ( rule__IntDefinition__Group_1__0 )?
            {
             before(grammarAccess.getIntDefinitionAccess().getGroup_1()); 
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:571:1: ( rule__IntDefinition__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:571:2: rule__IntDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__IntDefinition__Group_1__0_in_rule__IntDefinition__Group__1__Impl1105);
                    rule__IntDefinition__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntDefinitionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group__1__Impl"


    // $ANTLR start "rule__IntDefinition__Group__2"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:581:1: rule__IntDefinition__Group__2 : rule__IntDefinition__Group__2__Impl ;
    public final void rule__IntDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:585:1: ( rule__IntDefinition__Group__2__Impl )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:586:2: rule__IntDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IntDefinition__Group__2__Impl_in_rule__IntDefinition__Group__21136);
            rule__IntDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group__2"


    // $ANTLR start "rule__IntDefinition__Group__2__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:592:1: rule__IntDefinition__Group__2__Impl : ( ';' ) ;
    public final void rule__IntDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:596:1: ( ( ';' ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:597:1: ( ';' )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:597:1: ( ';' )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:598:1: ';'
            {
             before(grammarAccess.getIntDefinitionAccess().getSemicolonKeyword_2()); 
            match(input,11,FOLLOW_11_in_rule__IntDefinition__Group__2__Impl1164); 
             after(grammarAccess.getIntDefinitionAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group__2__Impl"


    // $ANTLR start "rule__IntDefinition__Group_0_0__0"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:617:1: rule__IntDefinition__Group_0_0__0 : rule__IntDefinition__Group_0_0__0__Impl rule__IntDefinition__Group_0_0__1 ;
    public final void rule__IntDefinition__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:621:1: ( rule__IntDefinition__Group_0_0__0__Impl rule__IntDefinition__Group_0_0__1 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:622:2: rule__IntDefinition__Group_0_0__0__Impl rule__IntDefinition__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__IntDefinition__Group_0_0__0__Impl_in_rule__IntDefinition__Group_0_0__01201);
            rule__IntDefinition__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntDefinition__Group_0_0__1_in_rule__IntDefinition__Group_0_0__01204);
            rule__IntDefinition__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group_0_0__0"


    // $ANTLR start "rule__IntDefinition__Group_0_0__0__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:629:1: rule__IntDefinition__Group_0_0__0__Impl : ( 'int' ) ;
    public final void rule__IntDefinition__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:633:1: ( ( 'int' ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:634:1: ( 'int' )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:634:1: ( 'int' )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:635:1: 'int'
            {
             before(grammarAccess.getIntDefinitionAccess().getIntKeyword_0_0_0()); 
            match(input,15,FOLLOW_15_in_rule__IntDefinition__Group_0_0__0__Impl1232); 
             after(grammarAccess.getIntDefinitionAccess().getIntKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group_0_0__0__Impl"


    // $ANTLR start "rule__IntDefinition__Group_0_0__1"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:648:1: rule__IntDefinition__Group_0_0__1 : rule__IntDefinition__Group_0_0__1__Impl ;
    public final void rule__IntDefinition__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:652:1: ( rule__IntDefinition__Group_0_0__1__Impl )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:653:2: rule__IntDefinition__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__IntDefinition__Group_0_0__1__Impl_in_rule__IntDefinition__Group_0_0__11263);
            rule__IntDefinition__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group_0_0__1"


    // $ANTLR start "rule__IntDefinition__Group_0_0__1__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:659:1: rule__IntDefinition__Group_0_0__1__Impl : ( ( rule__IntDefinition__NameAssignment_0_0_1 ) ) ;
    public final void rule__IntDefinition__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:663:1: ( ( ( rule__IntDefinition__NameAssignment_0_0_1 ) ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:664:1: ( ( rule__IntDefinition__NameAssignment_0_0_1 ) )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:664:1: ( ( rule__IntDefinition__NameAssignment_0_0_1 ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:665:1: ( rule__IntDefinition__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getIntDefinitionAccess().getNameAssignment_0_0_1()); 
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:666:1: ( rule__IntDefinition__NameAssignment_0_0_1 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:666:2: rule__IntDefinition__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__IntDefinition__NameAssignment_0_0_1_in_rule__IntDefinition__Group_0_0__1__Impl1290);
            rule__IntDefinition__NameAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getIntDefinitionAccess().getNameAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group_0_0__1__Impl"


    // $ANTLR start "rule__IntDefinition__Group_0_1__0"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:680:1: rule__IntDefinition__Group_0_1__0 : rule__IntDefinition__Group_0_1__0__Impl rule__IntDefinition__Group_0_1__1 ;
    public final void rule__IntDefinition__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:684:1: ( rule__IntDefinition__Group_0_1__0__Impl rule__IntDefinition__Group_0_1__1 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:685:2: rule__IntDefinition__Group_0_1__0__Impl rule__IntDefinition__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__IntDefinition__Group_0_1__0__Impl_in_rule__IntDefinition__Group_0_1__01324);
            rule__IntDefinition__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntDefinition__Group_0_1__1_in_rule__IntDefinition__Group_0_1__01327);
            rule__IntDefinition__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group_0_1__0"


    // $ANTLR start "rule__IntDefinition__Group_0_1__0__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:692:1: rule__IntDefinition__Group_0_1__0__Impl : ( 'System.Int32' ) ;
    public final void rule__IntDefinition__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:696:1: ( ( 'System.Int32' ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:697:1: ( 'System.Int32' )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:697:1: ( 'System.Int32' )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:698:1: 'System.Int32'
            {
             before(grammarAccess.getIntDefinitionAccess().getSystemInt32Keyword_0_1_0()); 
            match(input,16,FOLLOW_16_in_rule__IntDefinition__Group_0_1__0__Impl1355); 
             after(grammarAccess.getIntDefinitionAccess().getSystemInt32Keyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group_0_1__0__Impl"


    // $ANTLR start "rule__IntDefinition__Group_0_1__1"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:711:1: rule__IntDefinition__Group_0_1__1 : rule__IntDefinition__Group_0_1__1__Impl ;
    public final void rule__IntDefinition__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:715:1: ( rule__IntDefinition__Group_0_1__1__Impl )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:716:2: rule__IntDefinition__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__IntDefinition__Group_0_1__1__Impl_in_rule__IntDefinition__Group_0_1__11386);
            rule__IntDefinition__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group_0_1__1"


    // $ANTLR start "rule__IntDefinition__Group_0_1__1__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:722:1: rule__IntDefinition__Group_0_1__1__Impl : ( ( rule__IntDefinition__NameAssignment_0_1_1 ) ) ;
    public final void rule__IntDefinition__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:726:1: ( ( ( rule__IntDefinition__NameAssignment_0_1_1 ) ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:727:1: ( ( rule__IntDefinition__NameAssignment_0_1_1 ) )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:727:1: ( ( rule__IntDefinition__NameAssignment_0_1_1 ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:728:1: ( rule__IntDefinition__NameAssignment_0_1_1 )
            {
             before(grammarAccess.getIntDefinitionAccess().getNameAssignment_0_1_1()); 
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:729:1: ( rule__IntDefinition__NameAssignment_0_1_1 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:729:2: rule__IntDefinition__NameAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__IntDefinition__NameAssignment_0_1_1_in_rule__IntDefinition__Group_0_1__1__Impl1413);
            rule__IntDefinition__NameAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIntDefinitionAccess().getNameAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group_0_1__1__Impl"


    // $ANTLR start "rule__IntDefinition__Group_1__0"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:743:1: rule__IntDefinition__Group_1__0 : rule__IntDefinition__Group_1__0__Impl rule__IntDefinition__Group_1__1 ;
    public final void rule__IntDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:747:1: ( rule__IntDefinition__Group_1__0__Impl rule__IntDefinition__Group_1__1 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:748:2: rule__IntDefinition__Group_1__0__Impl rule__IntDefinition__Group_1__1
            {
            pushFollow(FOLLOW_rule__IntDefinition__Group_1__0__Impl_in_rule__IntDefinition__Group_1__01447);
            rule__IntDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntDefinition__Group_1__1_in_rule__IntDefinition__Group_1__01450);
            rule__IntDefinition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group_1__0"


    // $ANTLR start "rule__IntDefinition__Group_1__0__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:755:1: rule__IntDefinition__Group_1__0__Impl : ( '=' ) ;
    public final void rule__IntDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:759:1: ( ( '=' ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:760:1: ( '=' )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:760:1: ( '=' )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:761:1: '='
            {
             before(grammarAccess.getIntDefinitionAccess().getEqualsSignKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__IntDefinition__Group_1__0__Impl1478); 
             after(grammarAccess.getIntDefinitionAccess().getEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__IntDefinition__Group_1__1"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:774:1: rule__IntDefinition__Group_1__1 : rule__IntDefinition__Group_1__1__Impl ;
    public final void rule__IntDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:778:1: ( rule__IntDefinition__Group_1__1__Impl )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:779:2: rule__IntDefinition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__IntDefinition__Group_1__1__Impl_in_rule__IntDefinition__Group_1__11509);
            rule__IntDefinition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group_1__1"


    // $ANTLR start "rule__IntDefinition__Group_1__1__Impl"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:785:1: rule__IntDefinition__Group_1__1__Impl : ( ( rule__IntDefinition__ValueAssignment_1_1 ) ) ;
    public final void rule__IntDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:789:1: ( ( ( rule__IntDefinition__ValueAssignment_1_1 ) ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:790:1: ( ( rule__IntDefinition__ValueAssignment_1_1 ) )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:790:1: ( ( rule__IntDefinition__ValueAssignment_1_1 ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:791:1: ( rule__IntDefinition__ValueAssignment_1_1 )
            {
             before(grammarAccess.getIntDefinitionAccess().getValueAssignment_1_1()); 
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:792:1: ( rule__IntDefinition__ValueAssignment_1_1 )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:792:2: rule__IntDefinition__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__IntDefinition__ValueAssignment_1_1_in_rule__IntDefinition__Group_1__1__Impl1536);
            rule__IntDefinition__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIntDefinitionAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__Model__TypiesAssignment"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:807:1: rule__Model__TypiesAssignment : ( ruleType ) ;
    public final void rule__Model__TypiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:811:1: ( ( ruleType ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:812:1: ( ruleType )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:812:1: ( ruleType )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:813:1: ruleType
            {
             before(grammarAccess.getModelAccess().getTypiesTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Model__TypiesAssignment1575);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypiesTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TypiesAssignment"


    // $ANTLR start "rule__CharDefinitions__NameAssignment_0_0_1"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:822:1: rule__CharDefinitions__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__CharDefinitions__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:826:1: ( ( RULE_ID ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:827:1: ( RULE_ID )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:827:1: ( RULE_ID )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:828:1: RULE_ID
            {
             before(grammarAccess.getCharDefinitionsAccess().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CharDefinitions__NameAssignment_0_0_11606); 
             after(grammarAccess.getCharDefinitionsAccess().getNameIDTerminalRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__NameAssignment_0_0_1"


    // $ANTLR start "rule__CharDefinitions__NameAssignment_0_1_1"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:837:1: rule__CharDefinitions__NameAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__CharDefinitions__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:841:1: ( ( RULE_ID ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:842:1: ( RULE_ID )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:842:1: ( RULE_ID )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:843:1: RULE_ID
            {
             before(grammarAccess.getCharDefinitionsAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CharDefinitions__NameAssignment_0_1_11637); 
             after(grammarAccess.getCharDefinitionsAccess().getNameIDTerminalRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__NameAssignment_0_1_1"


    // $ANTLR start "rule__CharDefinitions__ValueAssignment_1_1"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:852:1: rule__CharDefinitions__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__CharDefinitions__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:856:1: ( ( RULE_INT ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:857:1: ( RULE_INT )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:857:1: ( RULE_INT )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:858:1: RULE_INT
            {
             before(grammarAccess.getCharDefinitionsAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CharDefinitions__ValueAssignment_1_11668); 
             after(grammarAccess.getCharDefinitionsAccess().getValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDefinitions__ValueAssignment_1_1"


    // $ANTLR start "rule__IntDefinition__NameAssignment_0_0_1"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:867:1: rule__IntDefinition__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__IntDefinition__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:871:1: ( ( RULE_ID ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:872:1: ( RULE_ID )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:872:1: ( RULE_ID )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:873:1: RULE_ID
            {
             before(grammarAccess.getIntDefinitionAccess().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntDefinition__NameAssignment_0_0_11699); 
             after(grammarAccess.getIntDefinitionAccess().getNameIDTerminalRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__NameAssignment_0_0_1"


    // $ANTLR start "rule__IntDefinition__NameAssignment_0_1_1"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:882:1: rule__IntDefinition__NameAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__IntDefinition__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:886:1: ( ( RULE_ID ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:887:1: ( RULE_ID )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:887:1: ( RULE_ID )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:888:1: RULE_ID
            {
             before(grammarAccess.getIntDefinitionAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntDefinition__NameAssignment_0_1_11730); 
             after(grammarAccess.getIntDefinitionAccess().getNameIDTerminalRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__NameAssignment_0_1_1"


    // $ANTLR start "rule__IntDefinition__ValueAssignment_1_1"
    // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:897:1: rule__IntDefinition__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__IntDefinition__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:901:1: ( ( RULE_INT ) )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:902:1: ( RULE_INT )
            {
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:902:1: ( RULE_INT )
            // ../org.myModel.ui/src-gen/org/myModel/ui/contentassist/antlr/internal/InternalCSharp.g:903:1: RULE_INT
            {
             before(grammarAccess.getIntDefinitionAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntDefinition__ValueAssignment_1_11761); 
             after(grammarAccess.getIntDefinitionAccess().getValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDefinition__ValueAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypiesAssignment_in_ruleModel94 = new BitSet(new long[]{0x000000000001B002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharDefinitions_in_entryRulecharDefinitions182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecharDefinitions189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group__0_in_rulecharDefinitions215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleintDefinition_in_entryRuleintDefinition242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleintDefinition249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group__0_in_ruleintDefinition275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleintDefinition_in_rule__Type__Alternatives311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharDefinitions_in_rule__Type__Alternatives328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group_0_0__0_in_rule__CharDefinitions__Alternatives_0360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group_0_1__0_in_rule__CharDefinitions__Alternatives_0378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group_0_0__0_in_rule__IntDefinition__Alternatives_0411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group_0_1__0_in_rule__IntDefinition__Alternatives_0429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group__0__Impl_in_rule__CharDefinitions__Group__0460 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group__1_in_rule__CharDefinitions__Group__0463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Alternatives_0_in_rule__CharDefinitions__Group__0__Impl490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group__1__Impl_in_rule__CharDefinitions__Group__1520 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group__2_in_rule__CharDefinitions__Group__1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group_1__0_in_rule__CharDefinitions__Group__1__Impl550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group__2__Impl_in_rule__CharDefinitions__Group__2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CharDefinitions__Group__2__Impl609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group_0_0__0__Impl_in_rule__CharDefinitions__Group_0_0__0646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group_0_0__1_in_rule__CharDefinitions__Group_0_0__0649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CharDefinitions__Group_0_0__0__Impl677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group_0_0__1__Impl_in_rule__CharDefinitions__Group_0_0__1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__NameAssignment_0_0_1_in_rule__CharDefinitions__Group_0_0__1__Impl735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group_0_1__0__Impl_in_rule__CharDefinitions__Group_0_1__0769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group_0_1__1_in_rule__CharDefinitions__Group_0_1__0772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CharDefinitions__Group_0_1__0__Impl800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group_0_1__1__Impl_in_rule__CharDefinitions__Group_0_1__1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__NameAssignment_0_1_1_in_rule__CharDefinitions__Group_0_1__1__Impl858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group_1__0__Impl_in_rule__CharDefinitions__Group_1__0892 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group_1__1_in_rule__CharDefinitions__Group_1__0895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CharDefinitions__Group_1__0__Impl923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__Group_1__1__Impl_in_rule__CharDefinitions__Group_1__1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharDefinitions__ValueAssignment_1_1_in_rule__CharDefinitions__Group_1__1__Impl981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group__0__Impl_in_rule__IntDefinition__Group__01015 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group__1_in_rule__IntDefinition__Group__01018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__Alternatives_0_in_rule__IntDefinition__Group__0__Impl1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group__1__Impl_in_rule__IntDefinition__Group__11075 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group__2_in_rule__IntDefinition__Group__11078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group_1__0_in_rule__IntDefinition__Group__1__Impl1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group__2__Impl_in_rule__IntDefinition__Group__21136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__IntDefinition__Group__2__Impl1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group_0_0__0__Impl_in_rule__IntDefinition__Group_0_0__01201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group_0_0__1_in_rule__IntDefinition__Group_0_0__01204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__IntDefinition__Group_0_0__0__Impl1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group_0_0__1__Impl_in_rule__IntDefinition__Group_0_0__11263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__NameAssignment_0_0_1_in_rule__IntDefinition__Group_0_0__1__Impl1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group_0_1__0__Impl_in_rule__IntDefinition__Group_0_1__01324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group_0_1__1_in_rule__IntDefinition__Group_0_1__01327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__IntDefinition__Group_0_1__0__Impl1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group_0_1__1__Impl_in_rule__IntDefinition__Group_0_1__11386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__NameAssignment_0_1_1_in_rule__IntDefinition__Group_0_1__1__Impl1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group_1__0__Impl_in_rule__IntDefinition__Group_1__01447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group_1__1_in_rule__IntDefinition__Group_1__01450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__IntDefinition__Group_1__0__Impl1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__Group_1__1__Impl_in_rule__IntDefinition__Group_1__11509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDefinition__ValueAssignment_1_1_in_rule__IntDefinition__Group_1__1__Impl1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__TypiesAssignment1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CharDefinitions__NameAssignment_0_0_11606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CharDefinitions__NameAssignment_0_1_11637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CharDefinitions__ValueAssignment_1_11668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntDefinition__NameAssignment_0_0_11699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntDefinition__NameAssignment_0_1_11730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntDefinition__ValueAssignment_1_11761 = new BitSet(new long[]{0x0000000000000002L});

}