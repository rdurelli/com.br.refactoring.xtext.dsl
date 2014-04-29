/*
* generated by Xtext
*/
package com.br.refactoring.xtext.parseTreeConstruction;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor;

import com.br.refactoring.xtext.services.DslGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class DslParsetreeConstructor extends AbstractParseTreeConstructor {
		
	@Inject
	private DslGrammarAccess grammarAccess;
	
	@Override
	protected AbstractToken getRootToken(IEObjectConsumer inst) {
		return new ThisRootNode(inst);	
	}
	
protected class ThisRootNode extends RootToken {
	public ThisRootNode(IEObjectConsumer inst) {
		super(inst);
	}
	
	@Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Model_Group(this, this, 0, inst);
			case 1: return new Import_Group(this, this, 1, inst);
			case 2: return new Type_Alternatives(this, this, 2, inst);
			case 3: return new Class_Group(this, this, 3, inst);
			case 4: return new Refactoring_RenameFeatureParserRuleCall(this, this, 4, inst);
			case 5: return new RenameFeature_Group(this, this, 5, inst);
			case 6: return new RenameClass_Group(this, this, 6, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule Model ****************
 *
 * Model:
 * 	"model" name=ID imports+=Import* contains+=Type*;
 *
 **/

// "model" name=ID imports+=Import* contains+=Type*
protected class Model_Group extends GroupToken {
	
	public Model_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getModelAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Model_ContainsAssignment_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Model_ImportsAssignment_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new Model_NameAssignment_1(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getModelRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "model"
protected class Model_ModelKeyword_0 extends KeywordToken  {
	
	public Model_ModelKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getModelAccess().getModelKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class Model_NameAssignment_1 extends AssignmentToken  {
	
	public Model_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getModelAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Model_ModelKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// imports+=Import*
protected class Model_ImportsAssignment_2 extends AssignmentToken  {
	
	public Model_ImportsAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getModelAccess().getImportsAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Import_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getImportRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Model_ImportsAssignment_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new Model_NameAssignment_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// contains+=Type*
protected class Model_ContainsAssignment_3 extends AssignmentToken  {
	
	public Model_ContainsAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getModelAccess().getContainsAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Type_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("contains",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("contains");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getModelAccess().getContainsTypeParserRuleCall_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Model_ContainsAssignment_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new Model_ImportsAssignment_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 2: return new Model_NameAssignment_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule Model ****************/


/************ begin Rule Import ****************
 *
 * Import:
 * 	"importing" importURI=STRING;
 *
 **/

// "importing" importURI=STRING
protected class Import_Group extends GroupToken {
	
	public Import_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getImportAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Import_ImportURIAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getImportRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "importing"
protected class Import_ImportingKeyword_0 extends KeywordToken  {
	
	public Import_ImportingKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getImportAccess().getImportingKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// importURI=STRING
protected class Import_ImportURIAssignment_1 extends AssignmentToken  {
	
	public Import_ImportURIAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getImportAccess().getImportURIAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Import_ImportingKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("importURI",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("importURI");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule Import ****************/


/************ begin Rule Type ****************
 *
 * Type:
 * 	Class | Refactoring;
 *
 **/

// Class | Refactoring
protected class Type_Alternatives extends AlternativesToken {

	public Type_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getTypeAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Type_ClassParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Type_RefactoringParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getClassRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getRenameFeatureRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// Class
protected class Type_ClassParserRuleCall_0 extends RuleCallToken {
	
	public Type_ClassParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTypeAccess().getClassParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Class_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getClassRule().getType().getClassifier())
			return null;
		if(checkForRecursion(Class_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// Refactoring
protected class Type_RefactoringParserRuleCall_1 extends RuleCallToken {
	
	public Type_RefactoringParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTypeAccess().getRefactoringParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Refactoring_RenameFeatureParserRuleCall(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getRenameFeatureRule().getType().getClassifier())
			return null;
		if(checkForRecursion(Refactoring_RenameFeatureParserRuleCall.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule Type ****************/


/************ begin Rule Class ****************
 *
 * Class:
 * 	"Class" name=ID;
 *
 **/

// "Class" name=ID
protected class Class_Group extends GroupToken {
	
	public Class_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getClassAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Class_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getClassRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "Class"
protected class Class_ClassKeyword_0 extends KeywordToken  {
	
	public Class_ClassKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getClassAccess().getClassKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class Class_NameAssignment_1 extends AssignmentToken  {
	
	public Class_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Class_ClassKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule Class ****************/


/************ begin Rule Refactoring ****************
 *
 * Refactoring:
 * 	RenameFeature;
 *
 **/

// RenameFeature
protected class Refactoring_RenameFeatureParserRuleCall extends RuleCallToken {
	
	public Refactoring_RenameFeatureParserRuleCall(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getRefactoringAccess().getRenameFeatureParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameFeature_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getRenameFeatureRule().getType().getClassifier())
			return null;
		if(checkForRecursion(RenameFeature_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule Refactoring ****************/


/************ begin Rule RenameFeature ****************
 *
 * RenameFeature:
 * 	"Rename_Feature" name=ID "{" allRefactorings+=RenameClass* "}";
 *
 **/

// "Rename_Feature" name=ID "{" allRefactorings+=RenameClass* "}"
protected class RenameFeature_Group extends GroupToken {
	
	public RenameFeature_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getRenameFeatureAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameFeature_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getRenameFeatureRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "Rename_Feature"
protected class RenameFeature_Rename_FeatureKeyword_0 extends KeywordToken  {
	
	public RenameFeature_Rename_FeatureKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getRenameFeatureAccess().getRename_FeatureKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class RenameFeature_NameAssignment_1 extends AssignmentToken  {
	
	public RenameFeature_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRenameFeatureAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameFeature_Rename_FeatureKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getRenameFeatureAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getRenameFeatureAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class RenameFeature_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public RenameFeature_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getRenameFeatureAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameFeature_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// allRefactorings+=RenameClass*
protected class RenameFeature_AllRefactoringsAssignment_3 extends AssignmentToken  {
	
	public RenameFeature_AllRefactoringsAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRenameFeatureAccess().getAllRefactoringsAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameClass_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("allRefactorings",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("allRefactorings");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getRenameClassRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getRenameFeatureAccess().getAllRefactoringsRenameClassParserRuleCall_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new RenameFeature_AllRefactoringsAssignment_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new RenameFeature_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class RenameFeature_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public RenameFeature_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getRenameFeatureAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameFeature_AllRefactoringsAssignment_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new RenameFeature_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule RenameFeature ****************/


/************ begin Rule RenameClass ****************
 *
 * RenameClass:
 * 	"Refactoring_RenameClass" name=ID "{" "classToBeRename" ":" classToBeRename=[Class] "newName" ":" newName=ID "}";
 *
 **/

// "Refactoring_RenameClass" name=ID "{" "classToBeRename" ":" classToBeRename=[Class] "newName" ":" newName=ID "}"
protected class RenameClass_Group extends GroupToken {
	
	public RenameClass_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getRenameClassAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameClass_RightCurlyBracketKeyword_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getRenameClassRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "Refactoring_RenameClass"
protected class RenameClass_Refactoring_RenameClassKeyword_0 extends KeywordToken  {
	
	public RenameClass_Refactoring_RenameClassKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getRenameClassAccess().getRefactoring_RenameClassKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class RenameClass_NameAssignment_1 extends AssignmentToken  {
	
	public RenameClass_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRenameClassAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameClass_Refactoring_RenameClassKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getRenameClassAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getRenameClassAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class RenameClass_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public RenameClass_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getRenameClassAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameClass_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "classToBeRename"
protected class RenameClass_ClassToBeRenameKeyword_3 extends KeywordToken  {
	
	public RenameClass_ClassToBeRenameKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getRenameClassAccess().getClassToBeRenameKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameClass_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":"
protected class RenameClass_ColonKeyword_4 extends KeywordToken  {
	
	public RenameClass_ColonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getRenameClassAccess().getColonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameClass_ClassToBeRenameKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// classToBeRename=[Class]
protected class RenameClass_ClassToBeRenameAssignment_5 extends AssignmentToken  {
	
	public RenameClass_ClassToBeRenameAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRenameClassAccess().getClassToBeRenameAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameClass_ColonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("classToBeRename",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("classToBeRename");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getRenameClassAccess().getClassToBeRenameClassCrossReference_5_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getRenameClassAccess().getClassToBeRenameClassCrossReference_5_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "newName"
protected class RenameClass_NewNameKeyword_6 extends KeywordToken  {
	
	public RenameClass_NewNameKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getRenameClassAccess().getNewNameKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameClass_ClassToBeRenameAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":"
protected class RenameClass_ColonKeyword_7 extends KeywordToken  {
	
	public RenameClass_ColonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getRenameClassAccess().getColonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameClass_NewNameKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// newName=ID
protected class RenameClass_NewNameAssignment_8 extends AssignmentToken  {
	
	public RenameClass_NewNameAssignment_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRenameClassAccess().getNewNameAssignment_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameClass_ColonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("newName",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("newName");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getRenameClassAccess().getNewNameIDTerminalRuleCall_8_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getRenameClassAccess().getNewNameIDTerminalRuleCall_8_0();
			return obj;
		}
		return null;
	}

}

// "}"
protected class RenameClass_RightCurlyBracketKeyword_9 extends KeywordToken  {
	
	public RenameClass_RightCurlyBracketKeyword_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getRenameClassAccess().getRightCurlyBracketKeyword_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RenameClass_NewNameAssignment_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule RenameClass ****************/

}
