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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'importing'", "'Class'", "'{'", "'}'", "'@'", "'string'", "'int'", "'boolean'", "'float'", "'char'", "'byte'", "'short'", "'lo\\u00A0ng'", "'double'", "'def'", "'Rename_Feature'", "'Refactoring_RenameClass'", "'classToBeRename'", "':'", "'newName'", "'Refactiong_RenameAttribute'", "'sourceClass'", "'attributeToBeRename'", "'Refactoring_RenameMethod'", "'methodToBeRename'", "'MovingFeaturesBetweenObjects'", "'Refactoring_MoveAttribute'", "'targetClass'", "'attributeToBeMoved'", "'Refactoring_MoveMethod'", "'methodToBeMoved'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
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

                if ( (LA2_0==13||LA2_0==27||LA2_0==37) ) {
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
            else if ( (LA3_0==27||LA3_0==37) ) {
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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:238:1: ruleClass returns [EObject current=null] : (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_methods_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:241:28: ( (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:242:1: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:242:1: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:242:3: otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}'
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
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:268:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:269:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:269:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:270:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleClass550);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_3_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:286:3: ( (lv_methods_4_0= ruleMethod ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:287:1: (lv_methods_4_0= ruleMethod )
            	    {
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:287:1: (lv_methods_4_0= ruleMethod )
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:288:3: lv_methods_4_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMethod_in_ruleClass572);
            	    lv_methods_4_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_4_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClass585); 

                	newLeafNode(otherlv_5, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleAttribute"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:316:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:317:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:318:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute621);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute631); 

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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:325:1: ruleAttribute returns [EObject current=null] : (otherlv_0= '@' ( (lv_elementType_1_0= ruleElementType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        EObject lv_elementType_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:328:28: ( (otherlv_0= '@' ( (lv_elementType_1_0= ruleElementType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:329:1: (otherlv_0= '@' ( (lv_elementType_1_0= ruleElementType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:329:1: (otherlv_0= '@' ( (lv_elementType_1_0= ruleElementType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:329:3: otherlv_0= '@' ( (lv_elementType_1_0= ruleElementType ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAttribute668); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getCommercialAtKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:333:1: ( (lv_elementType_1_0= ruleElementType ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:334:1: (lv_elementType_1_0= ruleElementType )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:334:1: (lv_elementType_1_0= ruleElementType )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:335:3: lv_elementType_1_0= ruleElementType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getElementTypeElementTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleElementType_in_ruleAttribute689);
            lv_elementType_1_0=ruleElementType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"elementType",
                    		lv_elementType_1_0, 
                    		"ElementType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:351:2: ( (lv_name_2_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:352:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:352:1: (lv_name_2_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:353:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttribute706); 

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


    // $ANTLR start "entryRuleElementType"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:377:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:378:2: (iv_ruleElementType= ruleElementType EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:379:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElementType_in_entryRuleElementType747);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElementType757); 

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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:386:1: ruleElementType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_ClassType_1 = null;


         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:389:28: ( (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:390:1: (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:390:1: (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=17 && LA6_0<=25)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:391:5: this_BasicType_0= ruleBasicType
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBasicType_in_ruleElementType804);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;

                     
                            current = this_BasicType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:401:5: this_ClassType_1= ruleClassType
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getClassTypeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClassType_in_ruleElementType831);
                    this_ClassType_1=ruleClassType();

                    state._fsp--;

                     
                            current = this_ClassType_1; 
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
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleBasicType"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:417:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:418:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:419:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBasicType_in_entryRuleBasicType866);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBasicType876); 

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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:426:1: ruleBasicType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'float' | lv_typeName_0_5= 'char' | lv_typeName_0_6= 'byte' | lv_typeName_0_7= 'short' | lv_typeName_0_8= 'lo\\u00A0ng' | lv_typeName_0_9= 'double' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;
        Token lv_typeName_0_5=null;
        Token lv_typeName_0_6=null;
        Token lv_typeName_0_7=null;
        Token lv_typeName_0_8=null;
        Token lv_typeName_0_9=null;

         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:429:28: ( ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'float' | lv_typeName_0_5= 'char' | lv_typeName_0_6= 'byte' | lv_typeName_0_7= 'short' | lv_typeName_0_8= 'lo\\u00A0ng' | lv_typeName_0_9= 'double' ) ) ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:430:1: ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'float' | lv_typeName_0_5= 'char' | lv_typeName_0_6= 'byte' | lv_typeName_0_7= 'short' | lv_typeName_0_8= 'lo\\u00A0ng' | lv_typeName_0_9= 'double' ) ) )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:430:1: ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'float' | lv_typeName_0_5= 'char' | lv_typeName_0_6= 'byte' | lv_typeName_0_7= 'short' | lv_typeName_0_8= 'lo\\u00A0ng' | lv_typeName_0_9= 'double' ) ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:431:1: ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'float' | lv_typeName_0_5= 'char' | lv_typeName_0_6= 'byte' | lv_typeName_0_7= 'short' | lv_typeName_0_8= 'lo\\u00A0ng' | lv_typeName_0_9= 'double' ) )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:431:1: ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'float' | lv_typeName_0_5= 'char' | lv_typeName_0_6= 'byte' | lv_typeName_0_7= 'short' | lv_typeName_0_8= 'lo\\u00A0ng' | lv_typeName_0_9= 'double' ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:432:1: (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'float' | lv_typeName_0_5= 'char' | lv_typeName_0_6= 'byte' | lv_typeName_0_7= 'short' | lv_typeName_0_8= 'lo\\u00A0ng' | lv_typeName_0_9= 'double' )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:432:1: (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'float' | lv_typeName_0_5= 'char' | lv_typeName_0_6= 'byte' | lv_typeName_0_7= 'short' | lv_typeName_0_8= 'lo\\u00A0ng' | lv_typeName_0_9= 'double' )
            int alt7=9;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            case 23:
                {
                alt7=7;
                }
                break;
            case 24:
                {
                alt7=8;
                }
                break;
            case 25:
                {
                alt7=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:433:3: lv_typeName_0_1= 'string'
                    {
                    lv_typeName_0_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBasicType920); 

                            newLeafNode(lv_typeName_0_1, grammarAccess.getBasicTypeAccess().getTypeNameStringKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:445:8: lv_typeName_0_2= 'int'
                    {
                    lv_typeName_0_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBasicType949); 

                            newLeafNode(lv_typeName_0_2, grammarAccess.getBasicTypeAccess().getTypeNameIntKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:457:8: lv_typeName_0_3= 'boolean'
                    {
                    lv_typeName_0_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBasicType978); 

                            newLeafNode(lv_typeName_0_3, grammarAccess.getBasicTypeAccess().getTypeNameBooleanKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:469:8: lv_typeName_0_4= 'float'
                    {
                    lv_typeName_0_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBasicType1007); 

                            newLeafNode(lv_typeName_0_4, grammarAccess.getBasicTypeAccess().getTypeNameFloatKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:481:8: lv_typeName_0_5= 'char'
                    {
                    lv_typeName_0_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBasicType1036); 

                            newLeafNode(lv_typeName_0_5, grammarAccess.getBasicTypeAccess().getTypeNameCharKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:493:8: lv_typeName_0_6= 'byte'
                    {
                    lv_typeName_0_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBasicType1065); 

                            newLeafNode(lv_typeName_0_6, grammarAccess.getBasicTypeAccess().getTypeNameByteKeyword_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:505:8: lv_typeName_0_7= 'short'
                    {
                    lv_typeName_0_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBasicType1094); 

                            newLeafNode(lv_typeName_0_7, grammarAccess.getBasicTypeAccess().getTypeNameShortKeyword_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:517:8: lv_typeName_0_8= 'lo\\u00A0ng'
                    {
                    lv_typeName_0_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBasicType1123); 

                            newLeafNode(lv_typeName_0_8, grammarAccess.getBasicTypeAccess().getTypeNameLoNgKeyword_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:529:8: lv_typeName_0_9= 'double'
                    {
                    lv_typeName_0_9=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBasicType1152); 

                            newLeafNode(lv_typeName_0_9, grammarAccess.getBasicTypeAccess().getTypeNameDoubleKeyword_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_9, null);
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleClassType"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:552:1: entryRuleClassType returns [EObject current=null] : iv_ruleClassType= ruleClassType EOF ;
    public final EObject entryRuleClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassType = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:553:2: (iv_ruleClassType= ruleClassType EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:554:2: iv_ruleClassType= ruleClassType EOF
            {
             newCompositeNode(grammarAccess.getClassTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClassType_in_entryRuleClassType1203);
            iv_ruleClassType=ruleClassType();

            state._fsp--;

             current =iv_ruleClassType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassType1213); 

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
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:561:1: ruleClassType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleClassType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:564:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:565:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:565:1: ( (otherlv_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:566:1: (otherlv_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:566:1: (otherlv_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:567:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getClassTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassType1257); 

            		newLeafNode(otherlv_0, grammarAccess.getClassTypeAccess().getClassTypeClassCrossReference_0()); 
            	

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
    // $ANTLR end "ruleClassType"


    // $ANTLR start "entryRuleMethod"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:586:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:587:2: (iv_ruleMethod= ruleMethod EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:588:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_entryRuleMethod1292);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethod1302); 

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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:595:1: ruleMethod returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:598:28: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:599:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:599:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:599:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMethod1339); 

                	newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getDefKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:603:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:604:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:604:1: (lv_name_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:605:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMethod1356); 

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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:629:1: entryRuleRefactoring returns [EObject current=null] : iv_ruleRefactoring= ruleRefactoring EOF ;
    public final EObject entryRuleRefactoring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefactoring = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:630:2: (iv_ruleRefactoring= ruleRefactoring EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:631:2: iv_ruleRefactoring= ruleRefactoring EOF
            {
             newCompositeNode(grammarAccess.getRefactoringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRefactoring_in_entryRuleRefactoring1397);
            iv_ruleRefactoring=ruleRefactoring();

            state._fsp--;

             current =iv_ruleRefactoring; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRefactoring1407); 

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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:638:1: ruleRefactoring returns [EObject current=null] : (this_RenameFeature_0= ruleRenameFeature | this_MovingFeaturesBetweenObjects_1= ruleMovingFeaturesBetweenObjects ) ;
    public final EObject ruleRefactoring() throws RecognitionException {
        EObject current = null;

        EObject this_RenameFeature_0 = null;

        EObject this_MovingFeaturesBetweenObjects_1 = null;


         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:641:28: ( (this_RenameFeature_0= ruleRenameFeature | this_MovingFeaturesBetweenObjects_1= ruleMovingFeaturesBetweenObjects ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:642:1: (this_RenameFeature_0= ruleRenameFeature | this_MovingFeaturesBetweenObjects_1= ruleMovingFeaturesBetweenObjects )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:642:1: (this_RenameFeature_0= ruleRenameFeature | this_MovingFeaturesBetweenObjects_1= ruleMovingFeaturesBetweenObjects )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==37) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:643:5: this_RenameFeature_0= ruleRenameFeature
                    {
                     
                            newCompositeNode(grammarAccess.getRefactoringAccess().getRenameFeatureParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRenameFeature_in_ruleRefactoring1454);
                    this_RenameFeature_0=ruleRenameFeature();

                    state._fsp--;

                     
                            current = this_RenameFeature_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:653:5: this_MovingFeaturesBetweenObjects_1= ruleMovingFeaturesBetweenObjects
                    {
                     
                            newCompositeNode(grammarAccess.getRefactoringAccess().getMovingFeaturesBetweenObjectsParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMovingFeaturesBetweenObjects_in_ruleRefactoring1481);
                    this_MovingFeaturesBetweenObjects_1=ruleMovingFeaturesBetweenObjects();

                    state._fsp--;

                     
                            current = this_MovingFeaturesBetweenObjects_1; 
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
    // $ANTLR end "ruleRefactoring"


    // $ANTLR start "entryRuleRenameFeature"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:669:1: entryRuleRenameFeature returns [EObject current=null] : iv_ruleRenameFeature= ruleRenameFeature EOF ;
    public final EObject entryRuleRenameFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameFeature = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:670:2: (iv_ruleRenameFeature= ruleRenameFeature EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:671:2: iv_ruleRenameFeature= ruleRenameFeature EOF
            {
             newCompositeNode(grammarAccess.getRenameFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameFeature_in_entryRuleRenameFeature1516);
            iv_ruleRenameFeature=ruleRenameFeature();

            state._fsp--;

             current =iv_ruleRenameFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameFeature1526); 

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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:678:1: ruleRenameFeature returns [EObject current=null] : (otherlv_0= 'Rename_Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleRenameClass ) )* ( (lv_allRefactorings_4_0= ruleRenameAttribute ) )* ( (lv_allRefactorings_5_0= ruleRenameMethod ) )* otherlv_6= '}' ) ;
    public final EObject ruleRenameFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_allRefactorings_3_0 = null;

        EObject lv_allRefactorings_4_0 = null;

        EObject lv_allRefactorings_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:681:28: ( (otherlv_0= 'Rename_Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleRenameClass ) )* ( (lv_allRefactorings_4_0= ruleRenameAttribute ) )* ( (lv_allRefactorings_5_0= ruleRenameMethod ) )* otherlv_6= '}' ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:682:1: (otherlv_0= 'Rename_Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleRenameClass ) )* ( (lv_allRefactorings_4_0= ruleRenameAttribute ) )* ( (lv_allRefactorings_5_0= ruleRenameMethod ) )* otherlv_6= '}' )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:682:1: (otherlv_0= 'Rename_Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleRenameClass ) )* ( (lv_allRefactorings_4_0= ruleRenameAttribute ) )* ( (lv_allRefactorings_5_0= ruleRenameMethod ) )* otherlv_6= '}' )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:682:3: otherlv_0= 'Rename_Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleRenameClass ) )* ( (lv_allRefactorings_4_0= ruleRenameAttribute ) )* ( (lv_allRefactorings_5_0= ruleRenameMethod ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRenameFeature1563); 

                	newLeafNode(otherlv_0, grammarAccess.getRenameFeatureAccess().getRename_FeatureKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:686:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:687:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:687:1: (lv_name_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:688:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameFeature1580); 

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

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRenameFeature1597); 

                	newLeafNode(otherlv_2, grammarAccess.getRenameFeatureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:708:1: ( (lv_allRefactorings_3_0= ruleRenameClass ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:709:1: (lv_allRefactorings_3_0= ruleRenameClass )
            	    {
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:709:1: (lv_allRefactorings_3_0= ruleRenameClass )
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:710:3: lv_allRefactorings_3_0= ruleRenameClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRenameFeatureAccess().getAllRefactoringsRenameClassParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRenameClass_in_ruleRenameFeature1618);
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
            	    break loop9;
                }
            } while (true);

            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:726:3: ( (lv_allRefactorings_4_0= ruleRenameAttribute ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:727:1: (lv_allRefactorings_4_0= ruleRenameAttribute )
            	    {
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:727:1: (lv_allRefactorings_4_0= ruleRenameAttribute )
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:728:3: lv_allRefactorings_4_0= ruleRenameAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRenameFeatureAccess().getAllRefactoringsRenameAttributeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRenameAttribute_in_ruleRenameFeature1640);
            	    lv_allRefactorings_4_0=ruleRenameAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRenameFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"allRefactorings",
            	            		lv_allRefactorings_4_0, 
            	            		"RenameAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:744:3: ( (lv_allRefactorings_5_0= ruleRenameMethod ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:745:1: (lv_allRefactorings_5_0= ruleRenameMethod )
            	    {
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:745:1: (lv_allRefactorings_5_0= ruleRenameMethod )
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:746:3: lv_allRefactorings_5_0= ruleRenameMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRenameFeatureAccess().getAllRefactoringsRenameMethodParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRenameMethod_in_ruleRenameFeature1662);
            	    lv_allRefactorings_5_0=ruleRenameMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRenameFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"allRefactorings",
            	            		lv_allRefactorings_5_0, 
            	            		"RenameMethod");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRenameFeature1675); 

                	newLeafNode(otherlv_6, grammarAccess.getRenameFeatureAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:774:1: entryRuleRenameClass returns [EObject current=null] : iv_ruleRenameClass= ruleRenameClass EOF ;
    public final EObject entryRuleRenameClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameClass = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:775:2: (iv_ruleRenameClass= ruleRenameClass EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:776:2: iv_ruleRenameClass= ruleRenameClass EOF
            {
             newCompositeNode(grammarAccess.getRenameClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameClass_in_entryRuleRenameClass1711);
            iv_ruleRenameClass=ruleRenameClass();

            state._fsp--;

             current =iv_ruleRenameClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameClass1721); 

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
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:783:1: ruleRenameClass returns [EObject current=null] : (otherlv_0= 'Refactoring_RenameClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'classToBeRename' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'newName' otherlv_7= ':' ( (lv_newName_8_0= RULE_ID ) ) otherlv_9= '}' ) ;
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
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:786:28: ( (otherlv_0= 'Refactoring_RenameClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'classToBeRename' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'newName' otherlv_7= ':' ( (lv_newName_8_0= RULE_ID ) ) otherlv_9= '}' ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:787:1: (otherlv_0= 'Refactoring_RenameClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'classToBeRename' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'newName' otherlv_7= ':' ( (lv_newName_8_0= RULE_ID ) ) otherlv_9= '}' )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:787:1: (otherlv_0= 'Refactoring_RenameClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'classToBeRename' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'newName' otherlv_7= ':' ( (lv_newName_8_0= RULE_ID ) ) otherlv_9= '}' )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:787:3: otherlv_0= 'Refactoring_RenameClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'classToBeRename' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'newName' otherlv_7= ':' ( (lv_newName_8_0= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRenameClass1758); 

                	newLeafNode(otherlv_0, grammarAccess.getRenameClassAccess().getRefactoring_RenameClassKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:791:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:792:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:792:1: (lv_name_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:793:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameClass1775); 

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

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRenameClass1792); 

                	newLeafNode(otherlv_2, grammarAccess.getRenameClassAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRenameClass1804); 

                	newLeafNode(otherlv_3, grammarAccess.getRenameClassAccess().getClassToBeRenameKeyword_3());
                
            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRenameClass1816); 

                	newLeafNode(otherlv_4, grammarAccess.getRenameClassAccess().getColonKeyword_4());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:821:1: ( (otherlv_5= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:822:1: (otherlv_5= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:822:1: (otherlv_5= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:823:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameClassRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameClass1836); 

            		newLeafNode(otherlv_5, grammarAccess.getRenameClassAccess().getClassToBeRenameClassCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRenameClass1848); 

                	newLeafNode(otherlv_6, grammarAccess.getRenameClassAccess().getNewNameKeyword_6());
                
            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRenameClass1860); 

                	newLeafNode(otherlv_7, grammarAccess.getRenameClassAccess().getColonKeyword_7());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:842:1: ( (lv_newName_8_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:843:1: (lv_newName_8_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:843:1: (lv_newName_8_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:844:3: lv_newName_8_0= RULE_ID
            {
            lv_newName_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameClass1877); 

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

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRenameClass1894); 

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


    // $ANTLR start "entryRuleRenameAttribute"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:872:1: entryRuleRenameAttribute returns [EObject current=null] : iv_ruleRenameAttribute= ruleRenameAttribute EOF ;
    public final EObject entryRuleRenameAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameAttribute = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:873:2: (iv_ruleRenameAttribute= ruleRenameAttribute EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:874:2: iv_ruleRenameAttribute= ruleRenameAttribute EOF
            {
             newCompositeNode(grammarAccess.getRenameAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameAttribute_in_entryRuleRenameAttribute1930);
            iv_ruleRenameAttribute=ruleRenameAttribute();

            state._fsp--;

             current =iv_ruleRenameAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameAttribute1940); 

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
    // $ANTLR end "entryRuleRenameAttribute"


    // $ANTLR start "ruleRenameAttribute"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:881:1: ruleRenameAttribute returns [EObject current=null] : (otherlv_0= 'Refactiong_RenameAttribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'attributeToBeRename' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'newName' otherlv_10= ':' ( (lv_newName_11_0= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleRenameAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_newName_11_0=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:884:28: ( (otherlv_0= 'Refactiong_RenameAttribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'attributeToBeRename' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'newName' otherlv_10= ':' ( (lv_newName_11_0= RULE_ID ) ) otherlv_12= '}' ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:885:1: (otherlv_0= 'Refactiong_RenameAttribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'attributeToBeRename' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'newName' otherlv_10= ':' ( (lv_newName_11_0= RULE_ID ) ) otherlv_12= '}' )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:885:1: (otherlv_0= 'Refactiong_RenameAttribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'attributeToBeRename' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'newName' otherlv_10= ':' ( (lv_newName_11_0= RULE_ID ) ) otherlv_12= '}' )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:885:3: otherlv_0= 'Refactiong_RenameAttribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'attributeToBeRename' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'newName' otherlv_10= ':' ( (lv_newName_11_0= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRenameAttribute1977); 

                	newLeafNode(otherlv_0, grammarAccess.getRenameAttributeAccess().getRefactiong_RenameAttributeKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:889:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:890:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:890:1: (lv_name_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:891:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameAttribute1994); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRenameAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRenameAttribute2011); 

                	newLeafNode(otherlv_2, grammarAccess.getRenameAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRenameAttribute2023); 

                	newLeafNode(otherlv_3, grammarAccess.getRenameAttributeAccess().getSourceClassKeyword_3());
                
            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRenameAttribute2035); 

                	newLeafNode(otherlv_4, grammarAccess.getRenameAttributeAccess().getColonKeyword_4());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:919:1: ( (otherlv_5= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:920:1: (otherlv_5= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:920:1: (otherlv_5= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:921:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameAttributeRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameAttribute2055); 

            		newLeafNode(otherlv_5, grammarAccess.getRenameAttributeAccess().getSourceClassClassCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRenameAttribute2067); 

                	newLeafNode(otherlv_6, grammarAccess.getRenameAttributeAccess().getAttributeToBeRenameKeyword_6());
                
            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRenameAttribute2079); 

                	newLeafNode(otherlv_7, grammarAccess.getRenameAttributeAccess().getColonKeyword_7());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:940:1: ( (otherlv_8= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:941:1: (otherlv_8= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:941:1: (otherlv_8= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:942:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameAttributeRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameAttribute2099); 

            		newLeafNode(otherlv_8, grammarAccess.getRenameAttributeAccess().getAttributeToBeRenameAttributeCrossReference_8_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRenameAttribute2111); 

                	newLeafNode(otherlv_9, grammarAccess.getRenameAttributeAccess().getNewNameKeyword_9());
                
            otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRenameAttribute2123); 

                	newLeafNode(otherlv_10, grammarAccess.getRenameAttributeAccess().getColonKeyword_10());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:961:1: ( (lv_newName_11_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:962:1: (lv_newName_11_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:962:1: (lv_newName_11_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:963:3: lv_newName_11_0= RULE_ID
            {
            lv_newName_11_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameAttribute2140); 

            			newLeafNode(lv_newName_11_0, grammarAccess.getRenameAttributeAccess().getNewNameIDTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"newName",
                    		lv_newName_11_0, 
                    		"ID");
            	    

            }


            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRenameAttribute2157); 

                	newLeafNode(otherlv_12, grammarAccess.getRenameAttributeAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleRenameAttribute"


    // $ANTLR start "entryRuleRenameMethod"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:991:1: entryRuleRenameMethod returns [EObject current=null] : iv_ruleRenameMethod= ruleRenameMethod EOF ;
    public final EObject entryRuleRenameMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameMethod = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:992:2: (iv_ruleRenameMethod= ruleRenameMethod EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:993:2: iv_ruleRenameMethod= ruleRenameMethod EOF
            {
             newCompositeNode(grammarAccess.getRenameMethodRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameMethod_in_entryRuleRenameMethod2193);
            iv_ruleRenameMethod=ruleRenameMethod();

            state._fsp--;

             current =iv_ruleRenameMethod; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameMethod2203); 

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
    // $ANTLR end "entryRuleRenameMethod"


    // $ANTLR start "ruleRenameMethod"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1000:1: ruleRenameMethod returns [EObject current=null] : (otherlv_0= 'Refactoring_RenameMethod' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'methodToBeRename' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'newName' otherlv_10= ':' ( (lv_newName_11_0= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleRenameMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_newName_11_0=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1003:28: ( (otherlv_0= 'Refactoring_RenameMethod' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'methodToBeRename' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'newName' otherlv_10= ':' ( (lv_newName_11_0= RULE_ID ) ) otherlv_12= '}' ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1004:1: (otherlv_0= 'Refactoring_RenameMethod' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'methodToBeRename' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'newName' otherlv_10= ':' ( (lv_newName_11_0= RULE_ID ) ) otherlv_12= '}' )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1004:1: (otherlv_0= 'Refactoring_RenameMethod' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'methodToBeRename' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'newName' otherlv_10= ':' ( (lv_newName_11_0= RULE_ID ) ) otherlv_12= '}' )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1004:3: otherlv_0= 'Refactoring_RenameMethod' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'methodToBeRename' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'newName' otherlv_10= ':' ( (lv_newName_11_0= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRenameMethod2240); 

                	newLeafNode(otherlv_0, grammarAccess.getRenameMethodAccess().getRefactoring_RenameMethodKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1008:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1009:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1009:1: (lv_name_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1010:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameMethod2257); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRenameMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRenameMethod2274); 

                	newLeafNode(otherlv_2, grammarAccess.getRenameMethodAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRenameMethod2286); 

                	newLeafNode(otherlv_3, grammarAccess.getRenameMethodAccess().getSourceClassKeyword_3());
                
            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRenameMethod2298); 

                	newLeafNode(otherlv_4, grammarAccess.getRenameMethodAccess().getColonKeyword_4());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1038:1: ( (otherlv_5= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1039:1: (otherlv_5= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1039:1: (otherlv_5= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1040:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameMethodRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameMethod2318); 

            		newLeafNode(otherlv_5, grammarAccess.getRenameMethodAccess().getSourceClassClassCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRenameMethod2330); 

                	newLeafNode(otherlv_6, grammarAccess.getRenameMethodAccess().getMethodToBeRenameKeyword_6());
                
            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRenameMethod2342); 

                	newLeafNode(otherlv_7, grammarAccess.getRenameMethodAccess().getColonKeyword_7());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1059:1: ( (otherlv_8= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1060:1: (otherlv_8= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1060:1: (otherlv_8= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1061:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameMethodRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameMethod2362); 

            		newLeafNode(otherlv_8, grammarAccess.getRenameMethodAccess().getMethodToBeRenameMethodCrossReference_8_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRenameMethod2374); 

                	newLeafNode(otherlv_9, grammarAccess.getRenameMethodAccess().getNewNameKeyword_9());
                
            otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRenameMethod2386); 

                	newLeafNode(otherlv_10, grammarAccess.getRenameMethodAccess().getColonKeyword_10());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1080:1: ( (lv_newName_11_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1081:1: (lv_newName_11_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1081:1: (lv_newName_11_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1082:3: lv_newName_11_0= RULE_ID
            {
            lv_newName_11_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameMethod2403); 

            			newLeafNode(lv_newName_11_0, grammarAccess.getRenameMethodAccess().getNewNameIDTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"newName",
                    		lv_newName_11_0, 
                    		"ID");
            	    

            }


            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRenameMethod2420); 

                	newLeafNode(otherlv_12, grammarAccess.getRenameMethodAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleRenameMethod"


    // $ANTLR start "entryRuleMovingFeaturesBetweenObjects"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1110:1: entryRuleMovingFeaturesBetweenObjects returns [EObject current=null] : iv_ruleMovingFeaturesBetweenObjects= ruleMovingFeaturesBetweenObjects EOF ;
    public final EObject entryRuleMovingFeaturesBetweenObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovingFeaturesBetweenObjects = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1111:2: (iv_ruleMovingFeaturesBetweenObjects= ruleMovingFeaturesBetweenObjects EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1112:2: iv_ruleMovingFeaturesBetweenObjects= ruleMovingFeaturesBetweenObjects EOF
            {
             newCompositeNode(grammarAccess.getMovingFeaturesBetweenObjectsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMovingFeaturesBetweenObjects_in_entryRuleMovingFeaturesBetweenObjects2456);
            iv_ruleMovingFeaturesBetweenObjects=ruleMovingFeaturesBetweenObjects();

            state._fsp--;

             current =iv_ruleMovingFeaturesBetweenObjects; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMovingFeaturesBetweenObjects2466); 

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
    // $ANTLR end "entryRuleMovingFeaturesBetweenObjects"


    // $ANTLR start "ruleMovingFeaturesBetweenObjects"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1119:1: ruleMovingFeaturesBetweenObjects returns [EObject current=null] : (otherlv_0= 'MovingFeaturesBetweenObjects' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleMoveAttribute ) )* ( (lv_allRefactorings_4_0= ruleMoveMethod ) )* otherlv_5= '}' ) ;
    public final EObject ruleMovingFeaturesBetweenObjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_allRefactorings_3_0 = null;

        EObject lv_allRefactorings_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1122:28: ( (otherlv_0= 'MovingFeaturesBetweenObjects' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleMoveAttribute ) )* ( (lv_allRefactorings_4_0= ruleMoveMethod ) )* otherlv_5= '}' ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1123:1: (otherlv_0= 'MovingFeaturesBetweenObjects' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleMoveAttribute ) )* ( (lv_allRefactorings_4_0= ruleMoveMethod ) )* otherlv_5= '}' )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1123:1: (otherlv_0= 'MovingFeaturesBetweenObjects' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleMoveAttribute ) )* ( (lv_allRefactorings_4_0= ruleMoveMethod ) )* otherlv_5= '}' )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1123:3: otherlv_0= 'MovingFeaturesBetweenObjects' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_allRefactorings_3_0= ruleMoveAttribute ) )* ( (lv_allRefactorings_4_0= ruleMoveMethod ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMovingFeaturesBetweenObjects2503); 

                	newLeafNode(otherlv_0, grammarAccess.getMovingFeaturesBetweenObjectsAccess().getMovingFeaturesBetweenObjectsKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1127:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1128:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1128:1: (lv_name_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1129:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMovingFeaturesBetweenObjects2520); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMovingFeaturesBetweenObjectsAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMovingFeaturesBetweenObjectsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMovingFeaturesBetweenObjects2537); 

                	newLeafNode(otherlv_2, grammarAccess.getMovingFeaturesBetweenObjectsAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1149:1: ( (lv_allRefactorings_3_0= ruleMoveAttribute ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1150:1: (lv_allRefactorings_3_0= ruleMoveAttribute )
            	    {
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1150:1: (lv_allRefactorings_3_0= ruleMoveAttribute )
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1151:3: lv_allRefactorings_3_0= ruleMoveAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getAllRefactoringsMoveAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMoveAttribute_in_ruleMovingFeaturesBetweenObjects2558);
            	    lv_allRefactorings_3_0=ruleMoveAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMovingFeaturesBetweenObjectsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"allRefactorings",
            	            		lv_allRefactorings_3_0, 
            	            		"MoveAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1167:3: ( (lv_allRefactorings_4_0= ruleMoveMethod ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1168:1: (lv_allRefactorings_4_0= ruleMoveMethod )
            	    {
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1168:1: (lv_allRefactorings_4_0= ruleMoveMethod )
            	    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1169:3: lv_allRefactorings_4_0= ruleMoveMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMovingFeaturesBetweenObjectsAccess().getAllRefactoringsMoveMethodParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMoveMethod_in_ruleMovingFeaturesBetweenObjects2580);
            	    lv_allRefactorings_4_0=ruleMoveMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMovingFeaturesBetweenObjectsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"allRefactorings",
            	            		lv_allRefactorings_4_0, 
            	            		"MoveMethod");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMovingFeaturesBetweenObjects2593); 

                	newLeafNode(otherlv_5, grammarAccess.getMovingFeaturesBetweenObjectsAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleMovingFeaturesBetweenObjects"


    // $ANTLR start "entryRuleMoveAttribute"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1197:1: entryRuleMoveAttribute returns [EObject current=null] : iv_ruleMoveAttribute= ruleMoveAttribute EOF ;
    public final EObject entryRuleMoveAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveAttribute = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1198:2: (iv_ruleMoveAttribute= ruleMoveAttribute EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1199:2: iv_ruleMoveAttribute= ruleMoveAttribute EOF
            {
             newCompositeNode(grammarAccess.getMoveAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMoveAttribute_in_entryRuleMoveAttribute2629);
            iv_ruleMoveAttribute=ruleMoveAttribute();

            state._fsp--;

             current =iv_ruleMoveAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMoveAttribute2639); 

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
    // $ANTLR end "entryRuleMoveAttribute"


    // $ANTLR start "ruleMoveAttribute"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1206:1: ruleMoveAttribute returns [EObject current=null] : (otherlv_0= 'Refactoring_MoveAttribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'targetClass' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'attributeToBeMoved' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleMoveAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1209:28: ( (otherlv_0= 'Refactoring_MoveAttribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'targetClass' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'attributeToBeMoved' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1210:1: (otherlv_0= 'Refactoring_MoveAttribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'targetClass' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'attributeToBeMoved' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1210:1: (otherlv_0= 'Refactoring_MoveAttribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'targetClass' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'attributeToBeMoved' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1210:3: otherlv_0= 'Refactoring_MoveAttribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'targetClass' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'attributeToBeMoved' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMoveAttribute2676); 

                	newLeafNode(otherlv_0, grammarAccess.getMoveAttributeAccess().getRefactoring_MoveAttributeKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1214:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1215:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1215:1: (lv_name_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1216:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMoveAttribute2693); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMoveAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMoveAttribute2710); 

                	newLeafNode(otherlv_2, grammarAccess.getMoveAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMoveAttribute2722); 

                	newLeafNode(otherlv_3, grammarAccess.getMoveAttributeAccess().getSourceClassKeyword_3());
                
            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMoveAttribute2734); 

                	newLeafNode(otherlv_4, grammarAccess.getMoveAttributeAccess().getColonKeyword_4());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1244:1: ( (otherlv_5= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1245:1: (otherlv_5= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1245:1: (otherlv_5= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1246:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveAttributeRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMoveAttribute2754); 

            		newLeafNode(otherlv_5, grammarAccess.getMoveAttributeAccess().getSourceClassClassCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMoveAttribute2766); 

                	newLeafNode(otherlv_6, grammarAccess.getMoveAttributeAccess().getTargetClassKeyword_6());
                
            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMoveAttribute2778); 

                	newLeafNode(otherlv_7, grammarAccess.getMoveAttributeAccess().getColonKeyword_7());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1265:1: ( (otherlv_8= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1266:1: (otherlv_8= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1266:1: (otherlv_8= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1267:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveAttributeRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMoveAttribute2798); 

            		newLeafNode(otherlv_8, grammarAccess.getMoveAttributeAccess().getTargetClassClassCrossReference_8_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMoveAttribute2810); 

                	newLeafNode(otherlv_9, grammarAccess.getMoveAttributeAccess().getAttributeToBeMovedKeyword_9());
                
            otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMoveAttribute2822); 

                	newLeafNode(otherlv_10, grammarAccess.getMoveAttributeAccess().getColonKeyword_10());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1286:1: ( (otherlv_11= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1287:1: (otherlv_11= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1287:1: (otherlv_11= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1288:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveAttributeRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMoveAttribute2842); 

            		newLeafNode(otherlv_11, grammarAccess.getMoveAttributeAccess().getAttributeToBeMovedAttributeCrossReference_11_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMoveAttribute2854); 

                	newLeafNode(otherlv_12, grammarAccess.getMoveAttributeAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleMoveAttribute"


    // $ANTLR start "entryRuleMoveMethod"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1311:1: entryRuleMoveMethod returns [EObject current=null] : iv_ruleMoveMethod= ruleMoveMethod EOF ;
    public final EObject entryRuleMoveMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveMethod = null;


        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1312:2: (iv_ruleMoveMethod= ruleMoveMethod EOF )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1313:2: iv_ruleMoveMethod= ruleMoveMethod EOF
            {
             newCompositeNode(grammarAccess.getMoveMethodRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMoveMethod_in_entryRuleMoveMethod2890);
            iv_ruleMoveMethod=ruleMoveMethod();

            state._fsp--;

             current =iv_ruleMoveMethod; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMoveMethod2900); 

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
    // $ANTLR end "entryRuleMoveMethod"


    // $ANTLR start "ruleMoveMethod"
    // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1320:1: ruleMoveMethod returns [EObject current=null] : (otherlv_0= 'Refactoring_MoveMethod' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'targetClass' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'methodToBeMoved' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleMoveMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1323:28: ( (otherlv_0= 'Refactoring_MoveMethod' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'targetClass' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'methodToBeMoved' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1324:1: (otherlv_0= 'Refactoring_MoveMethod' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'targetClass' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'methodToBeMoved' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1324:1: (otherlv_0= 'Refactoring_MoveMethod' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'targetClass' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'methodToBeMoved' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1324:3: otherlv_0= 'Refactoring_MoveMethod' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sourceClass' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'targetClass' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'methodToBeMoved' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMoveMethod2937); 

                	newLeafNode(otherlv_0, grammarAccess.getMoveMethodAccess().getRefactoring_MoveMethodKeyword_0());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1328:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1329:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1329:1: (lv_name_1_0= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1330:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMoveMethod2954); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMoveMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMoveMethod2971); 

                	newLeafNode(otherlv_2, grammarAccess.getMoveMethodAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMoveMethod2983); 

                	newLeafNode(otherlv_3, grammarAccess.getMoveMethodAccess().getSourceClassKeyword_3());
                
            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMoveMethod2995); 

                	newLeafNode(otherlv_4, grammarAccess.getMoveMethodAccess().getColonKeyword_4());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1358:1: ( (otherlv_5= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1359:1: (otherlv_5= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1359:1: (otherlv_5= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1360:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveMethodRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMoveMethod3015); 

            		newLeafNode(otherlv_5, grammarAccess.getMoveMethodAccess().getSourceClassClassCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMoveMethod3027); 

                	newLeafNode(otherlv_6, grammarAccess.getMoveMethodAccess().getTargetClassKeyword_6());
                
            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMoveMethod3039); 

                	newLeafNode(otherlv_7, grammarAccess.getMoveMethodAccess().getColonKeyword_7());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1379:1: ( (otherlv_8= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1380:1: (otherlv_8= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1380:1: (otherlv_8= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1381:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveMethodRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMoveMethod3059); 

            		newLeafNode(otherlv_8, grammarAccess.getMoveMethodAccess().getTargetClassClassCrossReference_8_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMoveMethod3071); 

                	newLeafNode(otherlv_9, grammarAccess.getMoveMethodAccess().getMethodToBeMovedKeyword_9());
                
            otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMoveMethod3083); 

                	newLeafNode(otherlv_10, grammarAccess.getMoveMethodAccess().getColonKeyword_10());
                
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1400:1: ( (otherlv_11= RULE_ID ) )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1401:1: (otherlv_11= RULE_ID )
            {
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1401:1: (otherlv_11= RULE_ID )
            // ../com.br.refactoring.xtext.dsl/src-gen/com/br/refactoring/xtext/parser/antlr/internal/InternalDsl.g:1402:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveMethodRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMoveMethod3103); 

            		newLeafNode(otherlv_11, grammarAccess.getMoveMethodAccess().getMethodToBeMovedMethodCrossReference_11_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMoveMethod3115); 

                	newLeafNode(otherlv_12, grammarAccess.getMoveMethodAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleMoveMethod"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModel139 = new BitSet(new long[]{0x0000002008003002L});
        public static final BitSet FOLLOW_ruleImport_in_ruleModel165 = new BitSet(new long[]{0x0000002008003002L});
        public static final BitSet FOLLOW_ruleType_in_ruleModel187 = new BitSet(new long[]{0x0000002008002002L});
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
        public static final BitSet FOLLOW_14_in_ruleClass529 = new BitSet(new long[]{0x0000000004018000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleClass550 = new BitSet(new long[]{0x0000000004018000L});
        public static final BitSet FOLLOW_ruleMethod_in_ruleClass572 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_15_in_ruleClass585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAttribute668 = new BitSet(new long[]{0x0000000003FE0010L});
        public static final BitSet FOLLOW_ruleElementType_in_ruleAttribute689 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElementType757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBasicType_in_ruleElementType804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassType_in_ruleElementType831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType866 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBasicType876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleBasicType920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleBasicType949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleBasicType978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleBasicType1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleBasicType1036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleBasicType1065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleBasicType1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleBasicType1123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBasicType1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassType_in_entryRuleClassType1203 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassType1213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassType1257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1292 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethod1302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleMethod1339 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMethod1356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRefactoring_in_entryRuleRefactoring1397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRefactoring1407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameFeature_in_ruleRefactoring1454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMovingFeaturesBetweenObjects_in_ruleRefactoring1481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameFeature_in_entryRuleRenameFeature1516 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameFeature1526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleRenameFeature1563 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameFeature1580 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRenameFeature1597 = new BitSet(new long[]{0x0000000910008000L});
        public static final BitSet FOLLOW_ruleRenameClass_in_ruleRenameFeature1618 = new BitSet(new long[]{0x0000000910008000L});
        public static final BitSet FOLLOW_ruleRenameAttribute_in_ruleRenameFeature1640 = new BitSet(new long[]{0x0000000900008000L});
        public static final BitSet FOLLOW_ruleRenameMethod_in_ruleRenameFeature1662 = new BitSet(new long[]{0x0000000800008000L});
        public static final BitSet FOLLOW_15_in_ruleRenameFeature1675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameClass_in_entryRuleRenameClass1711 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameClass1721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleRenameClass1758 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameClass1775 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRenameClass1792 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleRenameClass1804 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleRenameClass1816 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameClass1836 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRenameClass1848 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleRenameClass1860 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameClass1877 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRenameClass1894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameAttribute_in_entryRuleRenameAttribute1930 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameAttribute1940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleRenameAttribute1977 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameAttribute1994 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRenameAttribute2011 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleRenameAttribute2023 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleRenameAttribute2035 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameAttribute2055 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleRenameAttribute2067 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleRenameAttribute2079 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameAttribute2099 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRenameAttribute2111 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleRenameAttribute2123 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameAttribute2140 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRenameAttribute2157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameMethod_in_entryRuleRenameMethod2193 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameMethod2203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleRenameMethod2240 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameMethod2257 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRenameMethod2274 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleRenameMethod2286 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleRenameMethod2298 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameMethod2318 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleRenameMethod2330 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleRenameMethod2342 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameMethod2362 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRenameMethod2374 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleRenameMethod2386 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameMethod2403 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRenameMethod2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMovingFeaturesBetweenObjects_in_entryRuleMovingFeaturesBetweenObjects2456 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMovingFeaturesBetweenObjects2466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleMovingFeaturesBetweenObjects2503 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMovingFeaturesBetweenObjects2520 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMovingFeaturesBetweenObjects2537 = new BitSet(new long[]{0x0000024000008000L});
        public static final BitSet FOLLOW_ruleMoveAttribute_in_ruleMovingFeaturesBetweenObjects2558 = new BitSet(new long[]{0x0000024000008000L});
        public static final BitSet FOLLOW_ruleMoveMethod_in_ruleMovingFeaturesBetweenObjects2580 = new BitSet(new long[]{0x0000020000008000L});
        public static final BitSet FOLLOW_15_in_ruleMovingFeaturesBetweenObjects2593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMoveAttribute_in_entryRuleMoveAttribute2629 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMoveAttribute2639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleMoveAttribute2676 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMoveAttribute2693 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMoveAttribute2710 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMoveAttribute2722 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMoveAttribute2734 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMoveAttribute2754 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleMoveAttribute2766 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMoveAttribute2778 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMoveAttribute2798 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleMoveAttribute2810 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMoveAttribute2822 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMoveAttribute2842 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMoveAttribute2854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMoveMethod_in_entryRuleMoveMethod2890 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMoveMethod2900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleMoveMethod2937 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMoveMethod2954 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMoveMethod2971 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMoveMethod2983 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMoveMethod2995 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMoveMethod3015 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleMoveMethod3027 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMoveMethod3039 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMoveMethod3059 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleMoveMethod3071 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMoveMethod3083 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMoveMethod3103 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMoveMethod3115 = new BitSet(new long[]{0x0000000000000002L});
    }


}