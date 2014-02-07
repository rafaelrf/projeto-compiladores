package org.myModel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.myModel.cSharp.CSharpPackage;
import org.myModel.cSharp.Model;
import org.myModel.cSharp.charDefinitions;
import org.myModel.cSharp.intDefinition;
import org.myModel.services.CSharpGrammarAccess;

@SuppressWarnings("all")
public class CSharpSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CSharpGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CSharpPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CSharpPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.CHAR_DEFINITIONS:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getCharDefinitionsRule()) {
					sequence_charDefinitions(context, (charDefinitions) semanticObject); 
					return; 
				}
				else break;
			case CSharpPackage.INT_DEFINITION:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getIntDefinitionRule()) {
					sequence_intDefinition(context, (intDefinition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     typies+=Type*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID | name=ID) value=INT?)
	 */
	protected void sequence_charDefinitions(EObject context, charDefinitions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID | name=ID) value=INT?)
	 */
	protected void sequence_intDefinition(EObject context, intDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
