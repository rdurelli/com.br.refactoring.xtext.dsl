/*
* generated by Xtext
*/

package com.br.refactoring.xtext.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class DslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cImportsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportsImportParserRuleCall_2_0 = (RuleCall)cImportsAssignment_2.eContents().get(0);
		private final Assignment cContainsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cContainsTypeParserRuleCall_3_0 = (RuleCall)cContainsAssignment_3.eContents().get(0);
		
		//Model:
		//	"model" name=ID imports+=Import* contains+=Type*;
		public ParserRule getRule() { return rule; }

		//"model" name=ID imports+=Import* contains+=Type*
		public Group getGroup() { return cGroup; }

		//"model"
		public Keyword getModelKeyword_0() { return cModelKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//imports+=Import*
		public Assignment getImportsAssignment_2() { return cImportsAssignment_2; }

		//Import
		public RuleCall getImportsImportParserRuleCall_2_0() { return cImportsImportParserRuleCall_2_0; }

		//contains+=Type*
		public Assignment getContainsAssignment_3() { return cContainsAssignment_3; }

		//Type
		public RuleCall getContainsTypeParserRuleCall_3_0() { return cContainsTypeParserRuleCall_3_0; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportURIAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportURISTRINGTerminalRuleCall_1_0 = (RuleCall)cImportURIAssignment_1.eContents().get(0);
		
		//Import:
		//	"importing" importURI=STRING;
		public ParserRule getRule() { return rule; }

		//"importing" importURI=STRING
		public Group getGroup() { return cGroup; }

		//"importing"
		public Keyword getImportingKeyword_0() { return cImportingKeyword_0; }

		//importURI=STRING
		public Assignment getImportURIAssignment_1() { return cImportURIAssignment_1; }

		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_1_0() { return cImportURISTRINGTerminalRuleCall_1_0; }
	}

	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cClassParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRefactoringParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type:
		//	Class | Refactoring;
		public ParserRule getRule() { return rule; }

		//Class | Refactoring
		public Alternatives getAlternatives() { return cAlternatives; }

		//Class
		public RuleCall getClassParserRuleCall_0() { return cClassParserRuleCall_0; }

		//Refactoring
		public RuleCall getRefactoringParserRuleCall_1() { return cRefactoringParserRuleCall_1; }
	}

	public class ClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Class");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClassKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Class:
		//	"Class" name=ID;
		public ParserRule getRule() { return rule; }

		//"Class" name=ID
		public Group getGroup() { return cGroup; }

		//"Class"
		public Keyword getClassKeyword_0() { return cClassKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class RefactoringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Refactoring");
		private final RuleCall cRenameFeatureParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Refactoring:
		//	RenameFeature;
		public ParserRule getRule() { return rule; }

		//RenameFeature
		public RuleCall getRenameFeatureParserRuleCall() { return cRenameFeatureParserRuleCall; }
	}

	public class RenameFeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RenameFeature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRename_FeatureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAllRefactoringsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAllRefactoringsRenameClassParserRuleCall_3_0 = (RuleCall)cAllRefactoringsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//RenameFeature:
		//	"Rename_Feature" name=ID "{" allRefactorings+=RenameClass* "}";
		public ParserRule getRule() { return rule; }

		//"Rename_Feature" name=ID "{" allRefactorings+=RenameClass* "}"
		public Group getGroup() { return cGroup; }

		//"Rename_Feature"
		public Keyword getRename_FeatureKeyword_0() { return cRename_FeatureKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//allRefactorings+=RenameClass*
		public Assignment getAllRefactoringsAssignment_3() { return cAllRefactoringsAssignment_3; }

		//RenameClass
		public RuleCall getAllRefactoringsRenameClassParserRuleCall_3_0() { return cAllRefactoringsRenameClassParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class RenameClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RenameClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRefactoring_RenameClassKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cClassToBeRenameKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cClassToBeRenameAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cClassToBeRenameClassCrossReference_5_0 = (CrossReference)cClassToBeRenameAssignment_5.eContents().get(0);
		private final RuleCall cClassToBeRenameClassIDTerminalRuleCall_5_0_1 = (RuleCall)cClassToBeRenameClassCrossReference_5_0.eContents().get(1);
		private final Keyword cNewNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNewNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNewNameIDTerminalRuleCall_8_0 = (RuleCall)cNewNameAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//RenameClass:
		//	"Refactoring_RenameClass" name=ID "{" "classToBeRename" ":" classToBeRename=[Class] "newName" ":" newName=ID "}";
		public ParserRule getRule() { return rule; }

		//"Refactoring_RenameClass" name=ID "{" "classToBeRename" ":" classToBeRename=[Class] "newName" ":" newName=ID "}"
		public Group getGroup() { return cGroup; }

		//"Refactoring_RenameClass"
		public Keyword getRefactoring_RenameClassKeyword_0() { return cRefactoring_RenameClassKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"classToBeRename"
		public Keyword getClassToBeRenameKeyword_3() { return cClassToBeRenameKeyword_3; }

		//":"
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }

		//classToBeRename=[Class]
		public Assignment getClassToBeRenameAssignment_5() { return cClassToBeRenameAssignment_5; }

		//[Class]
		public CrossReference getClassToBeRenameClassCrossReference_5_0() { return cClassToBeRenameClassCrossReference_5_0; }

		//ID
		public RuleCall getClassToBeRenameClassIDTerminalRuleCall_5_0_1() { return cClassToBeRenameClassIDTerminalRuleCall_5_0_1; }

		//"newName"
		public Keyword getNewNameKeyword_6() { return cNewNameKeyword_6; }

		//":"
		public Keyword getColonKeyword_7() { return cColonKeyword_7; }

		//newName=ID
		public Assignment getNewNameAssignment_8() { return cNewNameAssignment_8; }

		//ID
		public RuleCall getNewNameIDTerminalRuleCall_8_0() { return cNewNameIDTerminalRuleCall_8_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	
	
	private ModelElements pModel;
	private ImportElements pImport;
	private TypeElements pType;
	private ClassElements pClass;
	private RefactoringElements pRefactoring;
	private RenameFeatureElements pRenameFeature;
	private RenameClassElements pRenameClass;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public DslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	"model" name=ID imports+=Import* contains+=Type*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Import:
	//	"importing" importURI=STRING;
	public ImportElements getImportAccess() {
		return (pImport != null) ? pImport : (pImport = new ImportElements());
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//Type:
	//	Class | Refactoring;
	public TypeElements getTypeAccess() {
		return (pType != null) ? pType : (pType = new TypeElements());
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}

	//Class:
	//	"Class" name=ID;
	public ClassElements getClassAccess() {
		return (pClass != null) ? pClass : (pClass = new ClassElements());
	}
	
	public ParserRule getClassRule() {
		return getClassAccess().getRule();
	}

	//Refactoring:
	//	RenameFeature;
	public RefactoringElements getRefactoringAccess() {
		return (pRefactoring != null) ? pRefactoring : (pRefactoring = new RefactoringElements());
	}
	
	public ParserRule getRefactoringRule() {
		return getRefactoringAccess().getRule();
	}

	//RenameFeature:
	//	"Rename_Feature" name=ID "{" allRefactorings+=RenameClass* "}";
	public RenameFeatureElements getRenameFeatureAccess() {
		return (pRenameFeature != null) ? pRenameFeature : (pRenameFeature = new RenameFeatureElements());
	}
	
	public ParserRule getRenameFeatureRule() {
		return getRenameFeatureAccess().getRule();
	}

	//RenameClass:
	//	"Refactoring_RenameClass" name=ID "{" "classToBeRename" ":" classToBeRename=[Class] "newName" ":" newName=ID "}";
	public RenameClassElements getRenameClassAccess() {
		return (pRenameClass != null) ? pRenameClass : (pRenameClass = new RenameClassElements());
	}
	
	public ParserRule getRenameClassRule() {
		return getRenameClassAccess().getRule();
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
