package com.br.refactoring.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.br.refactoring.xtext.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'importing'", "'Class'", "'Rename_Feature'", "'{'", "'}'", "'Refactoring_RenameClass'", "'classToBeRename'", "':'", "'newName'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;
     	
        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_contains_3_0= ruleType ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_imports_2_0 = null;

        EObject lv_contains_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:79:28: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_contains_3_0= ruleType ) )* ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_contains_3_0= ruleType ) )* )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_contains_3_0= ruleType ) )* )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:80:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_contains_3_0= ruleType ) )*
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:85:1: (lv_name_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModel139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:102:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:104:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleImport_in_ruleModel165);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_2_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:120:3: ( (lv_contains_3_0= ruleType ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=14)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:121:1: (lv_contains_3_0= ruleType )
            	    {
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:121:1: (lv_contains_3_0= ruleType )
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:122:3: lv_contains_3_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getContainsTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleModel187);
            	    lv_contains_3_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contains",
            	            		lv_contains_3_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:146:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:147:2: (iv_ruleImport= ruleImport EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:148:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_entryRuleImport224);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImport234); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:155:1: ruleImport returns [EObject current=null] : (otherlv_0= 'importing' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:158:28: ( (otherlv_0= 'importing' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:159:1: (otherlv_0= 'importing' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:159:1: (otherlv_0= 'importing' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:159:3: otherlv_0= 'importing' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleImport271); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportingKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:163:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:164:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:164:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:165:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImport288); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }


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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleType"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:189:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:190:2: (iv_ruleType= ruleType EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:191:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType329);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType339); 

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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:198:1: ruleType returns [EObject current=null] : (this_Class_0= ruleClass | this_Refactoring_1= ruleRefactoring ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Refactoring_1 = null;


         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:201:28: ( (this_Class_0= ruleClass | this_Refactoring_1= ruleRefactoring ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:202:1: (this_Class_0= ruleClass | this_Refactoring_1= ruleRefactoring )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:202:1: (this_Class_0= ruleClass | this_Refactoring_1= ruleRefactoring )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:203:5: this_Class_0= ruleClass
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getClassParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClass_in_ruleType386);
                    this_Class_0=ruleClass();

                    state._fsp--;

                     
                            current = this_Class_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:213:5: this_Refactoring_1= ruleRefactoring
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRefactoringParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRefactoring_in_ruleType413);
                    this_Refactoring_1=ruleRefactoring();

                    state._fsp--;

                     
                            current = this_Refactoring_1; 
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


    // $ANTLR start "entryRuleClass"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:229:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:230:2: (iv_ruleClass= ruleClass EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:231:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClass_in_entryRuleClass448);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClass458); 

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:238:1: ruleClass returns [EObject current=null] : (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:241:28: ( (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:242:1: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:242:1: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:242:3: otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClass495); 

                	newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:246:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:247:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:247:1: (lv_name_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:248:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClass512); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassRule());
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleRefactoring"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:272:1: entryRuleRefactoring returns [EObject current=null] : iv_ruleRefactoring= ruleRefactoring EOF ;
    public final EObject entryRuleRefactoring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefactoring = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:273:2: (iv_ruleRefactoring= ruleRefactoring EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:274:2: iv_ruleRefactoring= ruleRefactoring EOF
            {
             newCompositeNode(grammarAccess.getRefactoringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRefactoring_in_entryRuleRefactoring553);
            iv_ruleRefactoring=ruleRefactoring();

            state._fsp--;

             current =iv_ruleRefactoring; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRefactoring563); 

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
    // $ANTLR end "entryRuleRefactoring"


    // $ANTLR start "ruleRefactoring"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:281:1: ruleRefactoring returns [EObject current=null] : this_RenameFeature_0= ruleRenameFeature ;
    public final EObject ruleRefactoring() throws RecognitionException {
        EObject current = null;

        EObject this_RenameFeature_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:284:28: (this_RenameFeature_0= ruleRenameFeature )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:286:5: this_RenameFeature_0= ruleRenameFeature
            {
             
                    newCompositeNode(grammarAccess.getRefactoringAccess().getRenameFeatureParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleRenameFeature_in_ruleRefactoring609);
            this_RenameFeature_0=ruleRenameFeature();

            state._fsp--;

             
                    current = this_RenameFeature_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleRefactoring"


    // $ANTLR start "entryRuleRenameFeature"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:302:1: entryRuleRenameFeature returns [EObject current=null] : iv_ruleRenameFeature= ruleRenameFeature EOF ;
    public final EObject entryRuleRenameFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameFeature = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:303:2: (iv_ruleRenameFeature= ruleRenameFeature EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:304:2: iv_ruleRenameFeature= ruleRenameFeature EOF
            {
             newCompositeNode(grammarAccess.getRenameFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameFeature_in_entryRuleRenameFeature643);
            iv_ruleRenameFeature=ruleRenameFeature();

            state._fsp--;

             current =iv_ruleRenameFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameFeature653); 

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
    // $ANTLR end "entryRuleRenameFeature"


    // $ANTLR start "ruleRenameFeature"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:311:1: ruleRenameFeature returns [EObject current=null] : (otherlv_0= 'Rename_Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleRenameClass ) )* otherlv_4= '}' ) ;
    public final EObject ruleRenameFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_allRefactorings_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:314:28: ( (otherlv_0= 'Rename_Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleRenameClass ) )* otherlv_4= '}' ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:315:1: (otherlv_0= 'Rename_Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleRenameClass ) )* otherlv_4= '}' )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:315:1: (otherlv_0= 'Rename_Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleRenameClass ) )* otherlv_4= '}' )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:315:3: otherlv_0= 'Rename_Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleRenameClass ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRenameFeature690); 

                	newLeafNode(otherlv_0, grammarAccess.getRenameFeatureAccess().getRename_FeatureKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:319:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:320:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:320:1: (lv_name_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:321:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameFeature707); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRenameFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRenameFeature724); 

                	newLeafNode(otherlv_2, grammarAccess.getRenameFeatureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:341:1: ( (lv_allRefactorings_3_0= ruleRenameClass ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:342:1: (lv_allRefactorings_3_0= ruleRenameClass )
            	    {
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:342:1: (lv_allRefactorings_3_0= ruleRenameClass )
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:343:3: lv_allRefactorings_3_0= ruleRenameClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRenameFeatureAccess().getAllRefactoringsRenameClassParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRenameClass_in_ruleRenameFeature745);
            	    lv_allRefactorings_3_0=ruleRenameClass();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRenameFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"allRefactorings",
            	            		lv_allRefactorings_3_0, 
            	            		"RenameClass");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRenameFeature758); 

                	newLeafNode(otherlv_4, grammarAccess.getRenameFeatureAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleRenameFeature"


    // $ANTLR start "entryRuleRenameClass"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:371:1: entryRuleRenameClass returns [EObject current=null] : iv_ruleRenameClass= ruleRenameClass EOF ;
    public final EObject entryRuleRenameClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameClass = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:372:2: (iv_ruleRenameClass= ruleRenameClass EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:373:2: iv_ruleRenameClass= ruleRenameClass EOF
            {
             newCompositeNode(grammarAccess.getRenameClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameClass_in_entryRuleRenameClass794);
            iv_ruleRenameClass=ruleRenameClass();

            state._fsp--;

             current =iv_ruleRenameClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameClass804); 

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
    // $ANTLR end "entryRuleRenameClass"


    // $ANTLR start "ruleRenameClass"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:380:1: ruleRenameClass returns [EObject current=null] : (otherlv_0= 'Refactoring_RenameClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'classToBeRename' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'newName' otherlv_7= ':' ( (lv_newName_8_0= RULE_ID ) ) otherlv_9= '}' ) ;
    public final EObject ruleRenameClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_newName_8_0=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:383:28: ( (otherlv_0= 'Refactoring_RenameClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'classToBeRename' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'newName' otherlv_7= ':' ( (lv_newName_8_0= RULE_ID ) ) otherlv_9= '}' ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:384:1: (otherlv_0= 'Refactoring_RenameClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'classToBeRename' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'newName' otherlv_7= ':' ( (lv_newName_8_0= RULE_ID ) ) otherlv_9= '}' )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:384:1: (otherlv_0= 'Refactoring_RenameClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'classToBeRename' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'newName' otherlv_7= ':' ( (lv_newName_8_0= RULE_ID ) ) otherlv_9= '}' )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:384:3: otherlv_0= 'Refactoring_RenameClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'classToBeRename' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'newName' otherlv_7= ':' ( (lv_newName_8_0= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRenameClass841); 

                	newLeafNode(otherlv_0, grammarAccess.getRenameClassAccess().getRefactoring_RenameClassKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:388:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:389:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:389:1: (lv_name_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:390:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameClass858); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRenameClassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRenameClass875); 

                	newLeafNode(otherlv_2, grammarAccess.getRenameClassAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRenameClass887); 

                	newLeafNode(otherlv_3, grammarAccess.getRenameClassAccess().getClassToBeRenameKeyword_3());
                
            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRenameClass899); 

                	newLeafNode(otherlv_4, grammarAccess.getRenameClassAccess().getColonKeyword_4());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:418:1: ( (otherlv_5= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:419:1: (otherlv_5= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:419:1: (otherlv_5= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:420:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameClassRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameClass919); 

            		newLeafNode(otherlv_5, grammarAccess.getRenameClassAccess().getClassToBeRenameClassCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRenameClass931); 

                	newLeafNode(otherlv_6, grammarAccess.getRenameClassAccess().getNewNameKeyword_6());
                
            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRenameClass943); 

                	newLeafNode(otherlv_7, grammarAccess.getRenameClassAccess().getColonKeyword_7());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:439:1: ( (lv_newName_8_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:440:1: (lv_newName_8_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:440:1: (lv_newName_8_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:441:3: lv_newName_8_0= RULE_ID
            {
            lv_newName_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameClass960); 

            			newLeafNode(lv_newName_8_0, grammarAccess.getRenameClassAccess().getNewNameIDTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"newName",
                    		lv_newName_8_0, 
                    		"ID");
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRenameClass977); 

                	newLeafNode(otherlv_9, grammarAccess.getRenameClassAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleRenameClass"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModel139 = new BitSet(new long[]{0x0000000000007002L});
        public static final BitSet FOLLOW_ruleImport_in_ruleModel165 = new BitSet(new long[]{0x0000000000007002L});
        public static final BitSet FOLLOW_ruleType_in_ruleModel187 = new BitSet(new long[]{0x0000000000006002L});
        public static final BitSet FOLLOW_ruleImport_in_entryRuleImport224 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImport234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleImport271 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImport288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType329 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_in_ruleType386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRefactoring_in_ruleType413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_in_entryRuleClass448 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClass458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleClass495 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClass512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRefactoring_in_entryRuleRefactoring553 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRefactoring563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameFeature_in_ruleRefactoring609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameFeature_in_entryRuleRenameFeature643 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameFeature653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleRenameFeature690 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameFeature707 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRenameFeature724 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_ruleRenameClass_in_ruleRenameFeature745 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleRenameFeature758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameClass_in_entryRuleRenameClass794 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameClass804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleRenameClass841 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameClass858 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRenameClass875 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRenameClass887 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleRenameClass899 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameClass919 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleRenameClass931 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleRenameClass943 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameClass960 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRenameClass977 = new BitSet(new long[]{0x0000000000000002L});
    }


}