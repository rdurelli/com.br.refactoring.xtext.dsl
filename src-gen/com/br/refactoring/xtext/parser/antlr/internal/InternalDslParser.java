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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'importing'", "'Class'", "'{'", "'}'", "'@'", "'def'", "'Rename_Feature'", "'Refactoring_RenameClass'", "'classToBeRename'", "':'", "'newName'"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
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

                if ( (LA2_0==13||LA2_0==18) ) {
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
            else if ( (LA3_0==18) ) {
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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:238:1: ruleClass returns [EObject current=null] : (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_codeElements_3_0= ruleCodeItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_codeElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:241:28: ( (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_codeElements_3_0= ruleCodeItem ) )* otherlv_4= '}' ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:242:1: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_codeElements_3_0= ruleCodeItem ) )* otherlv_4= '}' )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:242:1: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_codeElements_3_0= ruleCodeItem ) )* otherlv_4= '}' )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:242:3: otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_codeElements_3_0= ruleCodeItem ) )* otherlv_4= '}'
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

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleClass529); 

                	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:268:1: ( (lv_codeElements_3_0= ruleCodeItem ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=16 && LA4_0<=17)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:269:1: (lv_codeElements_3_0= ruleCodeItem )
            	    {
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:269:1: (lv_codeElements_3_0= ruleCodeItem )
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:270:3: lv_codeElements_3_0= ruleCodeItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getCodeElementsCodeItemParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCodeItem_in_ruleClass550);
            	    lv_codeElements_3_0=ruleCodeItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"codeElements",
            	            		lv_codeElements_3_0, 
            	            		"CodeItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClass563); 

                	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleCodeItem"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:298:1: entryRuleCodeItem returns [EObject current=null] : iv_ruleCodeItem= ruleCodeItem EOF ;
    public final EObject entryRuleCodeItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeItem = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:299:2: (iv_ruleCodeItem= ruleCodeItem EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:300:2: iv_ruleCodeItem= ruleCodeItem EOF
            {
             newCompositeNode(grammarAccess.getCodeItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCodeItem_in_entryRuleCodeItem599);
            iv_ruleCodeItem=ruleCodeItem();

            state._fsp--;

             current =iv_ruleCodeItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCodeItem609); 

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
    // $ANTLR end "entryRuleCodeItem"


    // $ANTLR start "ruleCodeItem"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:307:1: ruleCodeItem returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod ) ;
    public final EObject ruleCodeItem() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Method_1 = null;


         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:310:28: ( (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:311:1: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:311:1: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:312:5: this_Attribute_0= ruleAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getCodeItemAccess().getAttributeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleCodeItem656);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;

                     
                            current = this_Attribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:322:5: this_Method_1= ruleMethod
                    {
                     
                            newCompositeNode(grammarAccess.getCodeItemAccess().getMethodParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMethod_in_ruleCodeItem683);
                    this_Method_1=ruleMethod();

                    state._fsp--;

                     
                            current = this_Method_1; 
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
    // $ANTLR end "ruleCodeItem"


    // $ANTLR start "entryRuleAttribute"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:338:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:339:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:340:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute718);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute728); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:347:1: ruleAttribute returns [EObject current=null] : (otherlv_0= '@' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:350:28: ( (otherlv_0= '@' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:351:1: (otherlv_0= '@' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:351:1: (otherlv_0= '@' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:351:3: otherlv_0= '@' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAttribute765); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getCommercialAtKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:355:1: ( (lv_type_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:356:1: (lv_type_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:356:1: (lv_type_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:357:3: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttribute782); 

            			newLeafNode(lv_type_1_0, grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:373:2: ( (lv_name_2_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:374:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:374:1: (lv_name_2_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:375:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttribute804); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleMethod"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:399:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:400:2: (iv_ruleMethod= ruleMethod EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:401:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_entryRuleMethod845);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethod855); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:408:1: ruleMethod returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:411:28: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:412:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:412:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:412:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMethod892); 

                	newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getDefKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:416:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:417:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:417:1: (lv_name_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:418:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMethod909); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleRefactoring"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:442:1: entryRuleRefactoring returns [EObject current=null] : iv_ruleRefactoring= ruleRefactoring EOF ;
    public final EObject entryRuleRefactoring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefactoring = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:443:2: (iv_ruleRefactoring= ruleRefactoring EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:444:2: iv_ruleRefactoring= ruleRefactoring EOF
            {
             newCompositeNode(grammarAccess.getRefactoringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRefactoring_in_entryRuleRefactoring950);
            iv_ruleRefactoring=ruleRefactoring();

            state._fsp--;

             current =iv_ruleRefactoring; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRefactoring960); 

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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:451:1: ruleRefactoring returns [EObject current=null] : this_RenameFeature_0= ruleRenameFeature ;
    public final EObject ruleRefactoring() throws RecognitionException {
        EObject current = null;

        EObject this_RenameFeature_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:454:28: (this_RenameFeature_0= ruleRenameFeature )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:456:5: this_RenameFeature_0= ruleRenameFeature
            {
             
                    newCompositeNode(grammarAccess.getRefactoringAccess().getRenameFeatureParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleRenameFeature_in_ruleRefactoring1006);
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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:472:1: entryRuleRenameFeature returns [EObject current=null] : iv_ruleRenameFeature= ruleRenameFeature EOF ;
    public final EObject entryRuleRenameFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameFeature = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:473:2: (iv_ruleRenameFeature= ruleRenameFeature EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:474:2: iv_ruleRenameFeature= ruleRenameFeature EOF
            {
             newCompositeNode(grammarAccess.getRenameFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameFeature_in_entryRuleRenameFeature1040);
            iv_ruleRenameFeature=ruleRenameFeature();

            state._fsp--;

             current =iv_ruleRenameFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameFeature1050); 

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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:481:1: ruleRenameFeature returns [EObject current=null] : (otherlv_0= 'Rename_Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleRenameClass ) )* otherlv_4= '}' ) ;
    public final EObject ruleRenameFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_allRefactorings_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:484:28: ( (otherlv_0= 'Rename_Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleRenameClass ) )* otherlv_4= '}' ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:485:1: (otherlv_0= 'Rename_Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleRenameClass ) )* otherlv_4= '}' )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:485:1: (otherlv_0= 'Rename_Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleRenameClass ) )* otherlv_4= '}' )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:485:3: otherlv_0= 'Rename_Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleRenameClass ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRenameFeature1087); 

                	newLeafNode(otherlv_0, grammarAccess.getRenameFeatureAccess().getRename_FeatureKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:489:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:490:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:490:1: (lv_name_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:491:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameFeature1104); 

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

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRenameFeature1121); 

                	newLeafNode(otherlv_2, grammarAccess.getRenameFeatureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:511:1: ( (lv_allRefactorings_3_0= ruleRenameClass ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:512:1: (lv_allRefactorings_3_0= ruleRenameClass )
            	    {
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:512:1: (lv_allRefactorings_3_0= ruleRenameClass )
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:513:3: lv_allRefactorings_3_0= ruleRenameClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRenameFeatureAccess().getAllRefactoringsRenameClassParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRenameClass_in_ruleRenameFeature1142);
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
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRenameFeature1155); 

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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:541:1: entryRuleRenameClass returns [EObject current=null] : iv_ruleRenameClass= ruleRenameClass EOF ;
    public final EObject entryRuleRenameClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameClass = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:542:2: (iv_ruleRenameClass= ruleRenameClass EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:543:2: iv_ruleRenameClass= ruleRenameClass EOF
            {
             newCompositeNode(grammarAccess.getRenameClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameClass_in_entryRuleRenameClass1191);
            iv_ruleRenameClass=ruleRenameClass();

            state._fsp--;

             current =iv_ruleRenameClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameClass1201); 

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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:550:1: ruleRenameClass returns [EObject current=null] : (otherlv_0= 'Refactoring_RenameClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'classToBeRename' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'newName' otherlv_7= ':' ( (lv_newName_8_0= RULE_ID ) ) otherlv_9= '}' ) ;
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
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:553:28: ( (otherlv_0= 'Refactoring_RenameClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'classToBeRename' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'newName' otherlv_7= ':' ( (lv_newName_8_0= RULE_ID ) ) otherlv_9= '}' ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:554:1: (otherlv_0= 'Refactoring_RenameClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'classToBeRename' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'newName' otherlv_7= ':' ( (lv_newName_8_0= RULE_ID ) ) otherlv_9= '}' )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:554:1: (otherlv_0= 'Refactoring_RenameClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'classToBeRename' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'newName' otherlv_7= ':' ( (lv_newName_8_0= RULE_ID ) ) otherlv_9= '}' )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:554:3: otherlv_0= 'Refactoring_RenameClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'classToBeRename' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'newName' otherlv_7= ':' ( (lv_newName_8_0= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRenameClass1238); 

                	newLeafNode(otherlv_0, grammarAccess.getRenameClassAccess().getRefactoring_RenameClassKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:558:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:559:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:559:1: (lv_name_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:560:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameClass1255); 

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

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRenameClass1272); 

                	newLeafNode(otherlv_2, grammarAccess.getRenameClassAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRenameClass1284); 

                	newLeafNode(otherlv_3, grammarAccess.getRenameClassAccess().getClassToBeRenameKeyword_3());
                
            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRenameClass1296); 

                	newLeafNode(otherlv_4, grammarAccess.getRenameClassAccess().getColonKeyword_4());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:588:1: ( (otherlv_5= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:589:1: (otherlv_5= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:589:1: (otherlv_5= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:590:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameClassRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameClass1316); 

            		newLeafNode(otherlv_5, grammarAccess.getRenameClassAccess().getClassToBeRenameClassCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRenameClass1328); 

                	newLeafNode(otherlv_6, grammarAccess.getRenameClassAccess().getNewNameKeyword_6());
                
            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRenameClass1340); 

                	newLeafNode(otherlv_7, grammarAccess.getRenameClassAccess().getColonKeyword_7());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:609:1: ( (lv_newName_8_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:610:1: (lv_newName_8_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:610:1: (lv_newName_8_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:611:3: lv_newName_8_0= RULE_ID
            {
            lv_newName_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameClass1357); 

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

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRenameClass1374); 

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
        public static final BitSet FOLLOW_RULE_ID_in_ruleModel139 = new BitSet(new long[]{0x0000000000043002L});
        public static final BitSet FOLLOW_ruleImport_in_ruleModel165 = new BitSet(new long[]{0x0000000000043002L});
        public static final BitSet FOLLOW_ruleType_in_ruleModel187 = new BitSet(new long[]{0x0000000000042002L});
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
        public static final BitSet FOLLOW_RULE_ID_in_ruleClass512 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleClass529 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_ruleCodeItem_in_ruleClass550 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_15_in_ruleClass563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCodeItem_in_entryRuleCodeItem599 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCodeItem609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleCodeItem656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_ruleCodeItem683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute718 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAttribute765 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute782 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethod855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleMethod892 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMethod909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRefactoring_in_entryRuleRefactoring950 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRefactoring960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameFeature_in_ruleRefactoring1006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameFeature_in_entryRuleRenameFeature1040 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameFeature1050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleRenameFeature1087 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameFeature1104 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRenameFeature1121 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_ruleRenameClass_in_ruleRenameFeature1142 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_15_in_ruleRenameFeature1155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameClass_in_entryRuleRenameClass1191 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameClass1201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleRenameClass1238 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameClass1255 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRenameClass1272 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleRenameClass1284 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleRenameClass1296 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameClass1316 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleRenameClass1328 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleRenameClass1340 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameClass1357 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRenameClass1374 = new BitSet(new long[]{0x0000000000000002L});
    }


}