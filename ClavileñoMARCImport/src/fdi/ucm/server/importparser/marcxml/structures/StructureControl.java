/**
 * 
 */
package fdi.ucm.server.importparser.marcxml.structures;

import java.util.HashMap;

import org.w3c.dom.Node;
import fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser;
import fdi.ucm.server.importparser.marcxml.LoadCollectionMARCXML;
import fdi.ucm.server.modelComplete.collection.document.CompleteDocuments;
import fdi.ucm.server.modelComplete.collection.document.CompleteTextElement;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteElementType;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteGrammar;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteStructure;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteTextElementType;

/**
 * @author Joaquin Gayoso-Cabada
 *
 */
public class StructureControl implements InterfaceMARCXMLparser {

	private LoadCollectionMARCXML LColec;
	private CompleteElementType Control;
	private HashMap<String,CompleteTextElementType> MapaControl;
			
	public StructureControl(CompleteGrammar obra, LoadCollectionMARCXML lCole) {
		Control=new CompleteElementType("Control", obra);
		LColec=lCole;
		MapaControl=new HashMap<String,CompleteTextElementType>();
	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessAttributes()
	 */
	@Override
	public void ProcessAttributes() {
//		001 - Control Number Full | Concise
		CompleteTextElementType ControlNumberFull = new CompleteTextElementType("Control Number Full", Control);
		Control.getSons().add(ControlNumberFull);
		MapaControl.put("001", ControlNumberFull);
//		003 - Control Number Identifier Full | Concise
		CompleteTextElementType ControlNumberIdentifierFull = new CompleteTextElementType("Control Number Identifier Full", Control);
		Control.getSons().add(ControlNumberIdentifierFull);
		MapaControl.put("003", ControlNumberIdentifierFull);
//		005 - Date and Time of Latest Transaction Full | Concise
		CompleteTextElementType DateAndTimeOfLatestTransactionFull=new CompleteTextElementType("Date and Time of Latest Transaction Full", Control);
		Control.getSons().add(DateAndTimeOfLatestTransactionFull);
		MapaControl.put("005", DateAndTimeOfLatestTransactionFull);
//		006 - Fixed-Length Data Elements - Additional Material Characteristics Full | Concise
		CompleteTextElementType FixedLengthDataElements=new CompleteTextElementType("Fixed-Length Data Elements", Control);
		Control.getSons().add(FixedLengthDataElements);
		MapaControl.put("006", FixedLengthDataElements);
//		007 - Physical Description Fixed Field Full | Concise
		CompleteTextElementType PhysicalDescriptionFixedFieldFull=new CompleteTextElementType("Physical Description Fixed Field Full", Control);
		Control.getSons().add(PhysicalDescriptionFixedFieldFull);
		MapaControl.put("007", PhysicalDescriptionFixedFieldFull);
//		008 - Fixed-Length Data Elements Full | Concise
		CompleteTextElementType FixedLengthDataElementsFull=new CompleteTextElementType("Fixed-Length Data Elements Full", Control);
		Control.getSons().add(FixedLengthDataElementsFull);
		MapaControl.put("008", FixedLengthDataElementsFull);

	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessInstances()
	 */
	@Override
	public void ProcessInstances() {
		// 

	}

	public CompleteStructure getStructure() {
		return Control;
	}

	public void ProcessInstances(Node controled, String nodeValue,
			CompleteDocuments Doc, int RecorNumber) {
		Node ControlN=controled.getAttributes().getNamedItem("tag");
		if (ControlN!=null&&ControlN.getNodeValue()!=null)
			{
			String ControlValue=ControlN.getNodeValue();
			CompleteTextElementType TypeC=MapaControl.get(ControlValue);
			if (TypeC!=null)
				{
				
				CompleteTextElement Elem=new CompleteTextElement(TypeC, nodeValue);
				Doc.getDescription().add(Elem);
				
				}
			else
				LColec.getLog().add("(Record = "+RecorNumber+") Error, controled value not asociated a MARC: " + ControlValue);
			}
		
	}

	

}
