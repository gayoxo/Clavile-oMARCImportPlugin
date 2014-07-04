package fdi.ucm.server.importparser.marcxml.structures;

import fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser;
import fdi.ucm.server.importparser.marcxml.LoadCollectionMARCXML;
import fdi.ucm.server.modelComplete.collection.document.CompleteDocuments;
import fdi.ucm.server.modelComplete.collection.document.CompleteTextElement;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteElementType;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteGrammar;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteStructure;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteTextElementType;

public class StructureLeader implements InterfaceMARCXMLparser{

	private CompleteElementType Leader;
	private CompleteTextElementType RecordLength;
	private CompleteTextElementType RecordStatus;
	private CompleteTextElementType TypeOfRecord;
	private CompleteTextElementType BibliographicLevel;
	private CompleteTextElementType TypeOfControl;
	private CompleteTextElementType CharacterCodingScheme;
	private CompleteTextElementType IndicatorCount;
	private CompleteTextElementType SubfieldCodeCount;
	private CompleteTextElementType BaseAddressOfData;
	private CompleteTextElementType EncodingLevel;
	private CompleteTextElementType DescriptiveCatalogingForm;
	private CompleteTextElementType MultipartResourceRecordLevel;
	private CompleteTextElementType LengthOfTheLengthOfFieldPortion;
	private CompleteTextElementType LengthOfTheStartingCharacterPositionPortion;
	private CompleteTextElementType LengthOfTheImplementationDefinedPortion;
	private LoadCollectionMARCXML LColec;
	
	public StructureLeader(CompleteGrammar obra,LoadCollectionMARCXML L) {
		Leader=new CompleteElementType("Leader", obra);
		LColec=L;
	}

	@Override
	public void ProcessAttributes() {
		RecordLength=new CompleteTextElementType("Record length", Leader);
		Leader.getSons().add(RecordLength);
		//00-04 - Record length

		RecordStatus=new CompleteTextElementType("Record status", Leader);
		Leader.getSons().add(RecordStatus);
//		05 - Record status
//		a - Increase in encoding level
//		c - Corrected or revised
//		d - Deleted
//		n - New
//		p - Increase in encoding level from prepublication
		
		TypeOfRecord=new CompleteTextElementType("Type of record", Leader);
		Leader.getSons().add(TypeOfRecord);	
//		06 - Type of record
//		a - Language material
//		c - Notated music
//		d - Manuscript notated music
//		e - Cartographic material
//		f - Manuscript cartographic material
//		g - Projected medium
//		i - Nonmusical sound recording
//		j - Musical sound recording
//		k - Two-dimensional nonprojectable graphic
//		m - Computer file
//		o - Kit
//		p - Mixed materials
//		r - Three-dimensional artifact or naturally occurring object
//		t - Manuscript language material
		
		BibliographicLevel=new CompleteTextElementType("Bibliographic level", Leader);
		Leader.getSons().add(BibliographicLevel);
//		07 - Bibliographic level
//		a - Monographic component part
//		b - Serial component part
//		c - Collection
//		d - Subunit
//		i - Integrating resource
//		m - Monograph/Item
//		s - Serial
		
		TypeOfControl=new CompleteTextElementType("Type of control", Leader);
		Leader.getSons().add(TypeOfControl);
//		08 - Type of control
//		# - No specified type
//		a - Archival
		
		CharacterCodingScheme=new CompleteTextElementType("Character coding scheme", Leader);
		Leader.getSons().add(CharacterCodingScheme);
//		09 - Character coding scheme
//		# - MARC-8
//		a - UCS/Unicode
		
		IndicatorCount=new CompleteTextElementType("Indicator count", Leader);
		Leader.getSons().add(IndicatorCount);
//		10 - Indicator count
//		2 - Number of character positions used for indicators
		
		SubfieldCodeCount=new CompleteTextElementType("Subfield code count", Leader);
		Leader.getSons().add(SubfieldCodeCount);
//		11 - Subfield code count
//		2 - Number of character positions used for a subfield code
		
		BaseAddressOfData=new CompleteTextElementType("Base address of data", Leader);
		Leader.getSons().add(BaseAddressOfData);
//		12-16 - Base address of data
//		[number] - Length of Leader and Directory
		
		EncodingLevel=new CompleteTextElementType("Encoding level", Leader);
		Leader.getSons().add(EncodingLevel);
//		17 - Encoding level
//		# - Full level
//		1 - Full level, material not examined
//		2 - Less-than-full level, material not examined
//		3 - Abbreviated level
//		4 - Core level
//		5 - Partial (preliminary) level
//		7 - Minimal level
//		8 - Prepublication level
//		u - Unknown
//		z - Not applicable
		
		DescriptiveCatalogingForm=new CompleteTextElementType("Descriptive cataloging form", Leader);
		Leader.getSons().add(DescriptiveCatalogingForm);
//		18 - Descriptive cataloging form
//		# - Non-ISBD
//		a - AACR 2
//		c - ISBD punctuation omitted
//		i - ISBD punctuation included
//		u - Unknown
		
		MultipartResourceRecordLevel=new CompleteTextElementType("Multipart resource record level", Leader);
		Leader.getSons().add(MultipartResourceRecordLevel);
//		19 - Multipart resource record level
//		# - Not specified or not applicable
//		a - Set
//		b - Part with independent title
//		c - Part with dependent title
		
		LengthOfTheLengthOfFieldPortion=new CompleteTextElementType("Length of the length-of-field portion", Leader);
		Leader.getSons().add(LengthOfTheLengthOfFieldPortion);
//		20 - Length of the length-of-field portion
//		4 - Number of characters in the length-of-field portion of a Directory entry
		
		LengthOfTheStartingCharacterPositionPortion=new CompleteTextElementType("Length of the starting-character-position portion", Leader);
		Leader.getSons().add(LengthOfTheStartingCharacterPositionPortion);
//		21 - Length of the starting-character-position portion
//		5 - Number of characters in the starting-character-position portion of a Directory entry
		
		LengthOfTheImplementationDefinedPortion=new CompleteTextElementType("Length of the implementation-defined portion", Leader);
		Leader.getSons().add(LengthOfTheImplementationDefinedPortion);
//		22 - Length of the implementation-defined portion
//		0 - Number of characters in the implementation-defined portion of a Directory entry

//		23 - Undefined
//		0 - Undefined
		
	}

	@Override
	public void ProcessInstances() {
		// Se hace en otro metodo
		
	}

	public CompleteStructure getStructure() {
		return Leader;
	}

	public void ProcessInstances(String nodeValue,CompleteDocuments Doc, int RecorNumber) {
		if (nodeValue!=null&&nodeValue.length()==24)
			{
			//00-04 - Record length
			CompleteTextElement RecordLengthV=new CompleteTextElement(RecordLength, nodeValue.substring(0, 5));
			Doc.getDescription().add(RecordLengthV);
			
//			05 - Record status
			String RS=getRecordStatusV(nodeValue.charAt(5));
			if (!RS.isEmpty())
			{
			CompleteTextElement RecordStatusV=new CompleteTextElement(RecordStatus,RS);
			Doc.getDescription().add(RecordStatusV);
			}
			
			
//			06 - Type of record
			String TOR=getTypeOfRecord(nodeValue.charAt(6));
			if (!TOR.isEmpty())
			{
			CompleteTextElement TypeOfRecordV=new CompleteTextElement(TypeOfRecord, TOR);
			Doc.getDescription().add(TypeOfRecordV);
			}
			
//			07 - Bibliographic level
			String BL=getBibliographicLevel(nodeValue.charAt(7));
			if (!BL.isEmpty())
			{
			CompleteTextElement BibliographicLevelV=new CompleteTextElement(BibliographicLevel, BL);
			Doc.getDescription().add(BibliographicLevelV);
			}
			
//			08 - Type of control
			String TC=getTypeOfControlV(nodeValue.charAt(8));
			if (!TC.isEmpty())
			{
			CompleteTextElement TypeOfControlV=new CompleteTextElement(TypeOfControl, TC);
			Doc.getDescription().add(TypeOfControlV);
			}
			
//			09 - Character coding scheme
			String CCS=getCharacterCodingSchemeV(nodeValue.charAt(9));
			if (!CCS.isEmpty())
			{
			CompleteTextElement CharacterCodingSchemeV=new CompleteTextElement(CharacterCodingScheme, CCS);
			Doc.getDescription().add(CharacterCodingSchemeV);
			}
			
//			10 - Indicator count
//			2 - Number of character positions used for indicators
			if (nodeValue.charAt(10)=='2')
			{
			CompleteTextElement IndicatorCountV=new CompleteTextElement(IndicatorCount, "2");
			Doc.getDescription().add(IndicatorCountV);
			}
			else 
				LColec.getLog().add("(Record = "+RecorNumber+") Error parsing 'Indicator Count' from leader, it should be 2");
				
//			11 - Subfield code count
//			2 - Number of character positions used for a subfield code
			if (nodeValue.charAt(11)=='2')
			{
			CompleteTextElement SubfieldCodeCountV=new CompleteTextElement(SubfieldCodeCount, "2");
			Doc.getDescription().add(SubfieldCodeCountV);
			}
			else 
				LColec.getLog().add("(Record = "+RecorNumber+") Error parsing 'Subfield Code Count' from leader, it should be 2");
			
//			12-16 - Base address of data
//			[number] - Length of Leader and Directory
			CompleteTextElement BaseAddressOfDataV=new CompleteTextElement(BaseAddressOfData, nodeValue.substring(12, 17));
			Doc.getDescription().add(BaseAddressOfDataV);
			
//			17 - Encoding level
			String EL=getEncodingLevelV(nodeValue.charAt(17));
			if (!EL.isEmpty())
			{
			CompleteTextElement EncodingLevelV=new CompleteTextElement(EncodingLevel, EL);
			Doc.getDescription().add(EncodingLevelV);
			}
			
//			18 - Descriptive cataloging form
			String DCF=getDescriptiveCatalogingFormV(nodeValue.charAt(18));
			if (!DCF.isEmpty())
			{
			CompleteTextElement DescriptiveCatalogingFormV=new CompleteTextElement(DescriptiveCatalogingForm, DCF);
			Doc.getDescription().add(DescriptiveCatalogingFormV);
			}
			
//			19 - Multipart resource record level
			String MRRL=getMultipartResourceRecordLevelV(nodeValue.charAt(19));
			if (!MRRL.isEmpty())
			{
			CompleteTextElement MultipartResourceRecordLevelV=new CompleteTextElement(MultipartResourceRecordLevel, MRRL);
			Doc.getDescription().add(MultipartResourceRecordLevelV);
			}
			
//			20 - Length of the length-of-field portion
//			4 - Number of characters in the length-of-field portion of a Directory entry
			if (nodeValue.charAt(20)=='4')
			{
			CompleteTextElement LengthOfTheLengthOfFieldPortionV=new CompleteTextElement(LengthOfTheLengthOfFieldPortion, "4");
			Doc.getDescription().add(LengthOfTheLengthOfFieldPortionV);
			}
			else 
				LColec.getLog().add("(Record = "+RecorNumber+") Error parsing 'Length Of The Length Of Field Portion' from leader, it should be 4");

//			21 - Length of the starting-character-position portion
//			5 - Number of characters in the starting-character-position portion of a Directory entry
			if (nodeValue.charAt(21)=='5')
			{
			CompleteTextElement LengthOfTheStartingCharacterPositionPortionV=new CompleteTextElement(LengthOfTheStartingCharacterPositionPortion, "5");
			Doc.getDescription().add(LengthOfTheStartingCharacterPositionPortionV);
			}
			else 
				LColec.getLog().add("(Record = "+RecorNumber+") Error parsing 'Length Of The Starting Character Position Portion' from leader, it should be 5");
			
//			22 - Length of the implementation-defined portion
//			0 - Number of characters in the implementation-defined portion of a Directory entry
			if (nodeValue.charAt(22)=='0')
			{
			CompleteTextElement LengthOfTheImplementationDefinedPortionV=new CompleteTextElement(LengthOfTheImplementationDefinedPortion, "0");
			Doc.getDescription().add(LengthOfTheImplementationDefinedPortionV);
			}
			else 
				LColec.getLog().add("(Record = "+RecorNumber+") Error parsing 'Length Of The Implementation Defined Portion' from leader, it should be 0");

//			23 - Undefined
//			0 - Undefined
			if (nodeValue.charAt(23)!='0')
				LColec.getLog().add("(Record = "+RecorNumber+") Error parsing '23 - Undefined' from leader, it should be 0");

			}
		else{
			int value=0;
			if (nodeValue!=null)
				value=nodeValue.length();
			
			LColec.getLog().add("(Record = "+RecorNumber+") Error parsing leader, lenght incorrect : " + value);
		}
	}

	private String getMultipartResourceRecordLevelV(char charAt) {
//		# - Not specified or not applicable
//		a - Set
//		b - Part with independent title
//		c - Part with dependent title
		switch (charAt) {
		case 'a':
			return "Set";
		case 'b':
			return "Part with independent title";
		case 'c':
			return "Part with dependent title";
		default:
			return "Not specified or not applicable";
			
		}
	}

	private String getDescriptiveCatalogingFormV(char charAt) {
//		# - Non-ISBD
//		a - AACR 2
//		c - ISBD punctuation omitted
//		i - ISBD punctuation included
//		u - Unknown
		switch (charAt) {
		case 'a':
			return "AACR 2";
		case 'c':
			return "ISBD punctuation omitted";
		case 'i':
			return "ISBD punctuation included";
		case 'u':
			return "Unknown";
		default:
			return "Non-ISBD";
			
		}
	}

	private String getEncodingLevelV(char charAt) {
//		# - Full level
//		1 - Full level, material not examined
//		2 - Less-than-full level, material not examined
//		3 - Abbreviated level
//		4 - Core level
//		5 - Partial (preliminary) level
//		7 - Minimal level
//		8 - Prepublication level
//		u - Unknown
//		z - Not applicable
		switch (charAt) {
		case '1':
			return "Full level, material not examined";
		case '2':
			return "Less-than-full level, material not examined";
		case '3':
			return "Abbreviated level";
		case '4':
			return "Core level";
		case '5':
			return "Partial (preliminary) level";
		case '7':
			return "Minimal level";
		case '8':
			return "Prepublication level";
		case 'u':
			return "Unknown";
		case 'z':
			return "Not applicable";
		default:
			return "Full level";
			
		}
	}

	private String getCharacterCodingSchemeV(char charAt) {
//		# - MARC-8
//		a - UCS/Unicode
		switch (charAt) {
		case 'a':
			return "UCS/Unicode";
		default:
			return "MARC-8";
			
		}
	}

	private String getTypeOfControlV(char charAt) {
//		# - No specified type
//		a - Archival
		switch (charAt) {
		case 'a':
			return "Archival";
		default:
			return "No specified type";
			
		}
	}

	private String getBibliographicLevel(char charAt) {
//		a - Monographic component part
//		b - Serial component part
//		c - Collection
//		d - Subunit
//		i - Integrating resource
//		m - Monograph/Item
//		s - Serial
		switch (charAt) {
		case 'a':
			return "Monographic component part";
		case 'b':
			return "Serial component part";
		case 'c':
			return "Collection";
		case 'd':
			return "Integrating resource";
		case 'i':
			return "Subunit";
		case 'm':
			return "Monograph/Item";
		case 's':
			return "Serial";
		default:
			LColec.getLog().add("Error parsing 'Bibliographic Level' from leader: " + charAt);
			return "";
			
		}
	}

	private String getTypeOfRecord(char charAt) {
//		a - Language material
//		c - Notated music
//		d - Manuscript notated music
//		e - Cartographic material
//		f - Manuscript cartographic material
//		g - Projected medium
//		i - Nonmusical sound recording
//		j - Musical sound recording
//		k - Two-dimensional nonprojectable graphic
//		m - Computer file
//		o - Kit
//		p - Mixed materials
//		r - Three-dimensional artifact or naturally occurring object
//		t - Manuscript language material
		switch (charAt) {
		case 'a':
			return "Language material";
		case 'c':
			return "Notated music";
		case 'd':
			return "Manuscript notated music";
		case 'e':
			return "Cartographic material";
		case 'f':
			return "Manuscript cartographic material";
		case 'g':
			return "Projected medium";
		case 'i':
			return "Nonmusical sound recording";
		case 'j':
			return "Musical sound recording";
		case 'k':
			return "Two-dimensional nonprojectable graphic";
		case 'm':
			return "Computer file";
		case 'o':
			return "Kit";
		case 'p':
			return "Mixed materials";
		case 'r':
			return "Three-dimensional artifact or naturally occurring object";
		case 't':
			return "Manuscript language material";
		default:
			LColec.getLog().add("Error parsing 'Type of Record' from leader: " + charAt);
			return "";
			
		}
	}

	private String getRecordStatusV(char charAt) {
//		a - Increase in encoding level
//		c - Corrected or revised
//		d - Deleted
//		n - New
//		p - Increase in encoding level from prepublication
		switch (charAt) {
		case 'a':
			return "Increase in encoding level";
		case 'c':
			return "Corrected or revised";
		case 'd':
			return "Deleted";
		case 'n':
			return "New";
		case 'p':
			return "Increase in encoding level from prepublication";
		default:
			LColec.getLog().add("Warning parsing 'Record Status' from leader: " + charAt);
			return "";
			
		}
	}
	
	
	
}
