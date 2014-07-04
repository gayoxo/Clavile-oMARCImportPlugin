/**
 * 
 */
package fdi.ucm.server.importparser.marcxml.structures;

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
public class StructureDirectory implements InterfaceMARCXMLparser {

	private CompleteElementType Directory;
	private LoadCollectionMARCXML LColec;
	private CompleteTextElementType Tag;
	private CompleteTextElementType FieldLength;
	private CompleteTextElementType StartingCharacterPosition;

	public StructureDirectory(CompleteGrammar obra, LoadCollectionMARCXML lCole) {
		Directory=new CompleteElementType("Directory", obra);
		LColec=lCole;
	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessAttributes()
	 */
	@Override
	public void ProcessAttributes() {
//		00-02 - Tag
//		Three ASCII numeric or ASCII alphabetic characters (upper case or lower case, but not both) that identify an associated variable field.
		Tag=new CompleteTextElementType("Tag", Directory);
		Directory.getSons().add(Tag);
		
//		03-06 - Field length
//		Four ASCII numeric characters that specify the length of the variable field, including indicators, subfield codes, data, and the field terminator. A Field length number of less than four digits is right justified and unused positions contain zeros.
		FieldLength=new CompleteTextElementType("Field length", Directory);
		Directory.getSons().add(FieldLength);
		
//		07-11 - Starting character position
//		Five ASCII numeric characters that specify the starting character position of the variable field relative to the Base address of data (Leader/12-16) of the record. A Starting character position number of less than five digits is right justified and unused positions contain zeros.
		StartingCharacterPosition=new CompleteTextElementType("Starting character position", Directory);
		Directory.getSons().add(StartingCharacterPosition);

	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessInstances()
	 */
	@Override
	public void ProcessInstances() {
		// 

	}

	public CompleteStructure getStructure() {
		return Directory;
	}

	public void ProcessInstances(String nodeValue, CompleteDocuments Doc,int RecorNumber) {
		if (nodeValue!=null&&nodeValue.length()==12)
		{
//			00-02 - Tag
		CompleteTextElement TagV=new CompleteTextElement(Tag, nodeValue.substring(0, 3));
		Doc.getDescription().add(TagV);
		
//		03-06 - Field length
		CompleteTextElement FieldLengthV=new CompleteTextElement(FieldLength,nodeValue.substring(3, 7));
		Doc.getDescription().add(FieldLengthV);
		
//		07-11 - Starting character position
		CompleteTextElement StartingCharacterPositionV=new CompleteTextElement(StartingCharacterPosition, nodeValue.substring(7));
		Doc.getDescription().add(StartingCharacterPositionV);

		}
	else
	{
		int value=0;
		if (nodeValue!=null)
			value=nodeValue.length();
		
		LColec.getLog().add("(Record = "+RecorNumber+") Error parsing Directory, lenght incorrect : " + value);
	}
		
	}

}
