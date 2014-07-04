/**
 * 
 */
package fdi.ucm.server.importparser.marcxml.structures.control;

import java.util.HashMap;

import fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteElementType;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteIterator;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteTextElementType;

/**
 * @author Joaquin Gayoso-Cabada
 *
 */
public class S0XX implements InterfaceMARCXMLparser {

	private CompleteTextElementType Raro09X;
	private CompleteElementType Datos;
	private HashMap<String, HashMap<String, CompleteTextElementType>> TablaD;
	private HashMap<String, HashMap<String, String>> TablaID1;
	private HashMap<String, CompleteTextElementType> TablaD1;
	private HashMap<String, HashMap<String, String>> TablaID2;
	private HashMap<String, CompleteTextElementType> TablaD2;

	public S0XX(CompleteElementType datos,HashMap<String, HashMap<String, CompleteTextElementType>> tablaaD, HashMap<String, HashMap<String, String>> tablaaID1, HashMap<String, HashMap<String, String>> tablaaID2, HashMap<String, CompleteTextElementType> tablaD1, HashMap<String, CompleteTextElementType> tablaD2) {
		Datos=datos;
		TablaD=tablaaD;
		TablaID1=tablaaID1;
		TablaID2=tablaaID2;
		TablaD1=tablaD1;
		TablaD2=tablaD2;
	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessAttributes()
	 */
	@Override
	public void ProcessAttributes() {
		

//010 - Library of Congress Control Number (NR) Full | Concise
//		$a - LC control number (NR) 
//		$b - NUCMC control number (R) 
//		$z - Canceled/invalid LC control number (R) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Library of Congress Control Number", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("LC control number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("NUCMC control number", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType z = new CompleteTextElementType("Canceled/invalid LC control number", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("z", z);
			full.put("8", n8);
			TablaD.put("010", full);
			}
		
//013 - Patent Control Information (R) Full | Concise
//		$a - Number (NR) 
//		$b - Country (NR) 
//		$c - Type of number (NR) 
//		$d - Date (R) 
//		$e - Status (R) 
//		$f - Party to document (R) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 

		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Patent Control Information", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("Number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Country", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Type of number", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType d = new CompleteTextElementType("Date", CTET1);
			CTET1.getSons().add(d);
			
			CompleteTextElementType e = new CompleteTextElementType("Status", CTET1);
			CTET1.getSons().add(e);
			
			CompleteTextElementType f = new CompleteTextElementType("Party to document", CTET1);
			CTET1.getSons().add(f);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("c", c);
			full.put("d", d);
			full.put("e", e);
			full.put("f", f);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("013", full);
			}
		
		
//015 - National Bibliography Number (R) Full | Concise
//		$a - National bibliography number (R)
//		$q - Qualifying information (R)
//		$z - Canceled/invalid national bibliography number (R)
//		$2 - Source (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("National Bibliography Number", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("National bibliography number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType q = new CompleteTextElementType("Qualifying information", CTET1);
			CTET1.getSons().add(q);
			
			CompleteTextElementType z = new CompleteTextElementType("Canceled/invalid national bibliography number", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
			CTET1.getSons().add(n2);
						
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("q", q);
			full.put("z", z);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("015", full);
		}
		
//016 - National Bibliographic Agency Control Number (R) Full | Concise
		
//ID1	National bibliographic agency	
//		# - Library and Archives Canada 
//		7 - Source specified in subfield $2
		
//		$a - Record control number (NR) 
//		$z - Canceled/invalid control number (R) 
//		$2 - Source (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Record control number", I1);
			I1.getSons().add(CTET1);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("7", "Source specified in Source");
			full1I.put("#", "Library and Archives Canada");
			TablaID1.put("016", full1I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("National bibliographic agency", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("016", ID1);
			
			CompleteTextElementType a = new CompleteTextElementType("National bibliography number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType z = new CompleteTextElementType("Canceled/invalid control number", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
			CTET1.getSons().add(n2);
						
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("z", z);
			full.put("2", n2);
			full.put("8", n8);
			TablaD.put("016", full);
		}
		
//017 - Copyright or Legal Deposit Number (R) Full | Concise
		
//ID2 Display constant controller
//		# - Copyright or legal deposit number
//		8 - No display constant generated
		
//		$a - Copyright or legal deposit number (R)
//		$b - Assigning agency (NR)
//		$d - Date (NR)
//		$i - Display text (NR)
//		$z - Canceled/invalid copyright or legal deposit number (R)
//		$2 - Source (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Copyright or Legal Deposit Number", I1);
			I1.getSons().add(CTET1);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("8", "No display constant generated");
			full2I.put("#", "Copyright or legal deposit number");
			TablaID2.put("017", full2I);
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Display constant controller", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("017", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Copyright or legal deposit number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Assigning agency", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType d = new CompleteTextElementType("Date", CTET1);
			CTET1.getSons().add(d);
			
			CompleteTextElementType i = new CompleteTextElementType("Display text", CTET1);
			CTET1.getSons().add(i);
			
			CompleteTextElementType z = new CompleteTextElementType("Canceled/invalid copyright or legal deposit number ", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("d", d);
			full.put("i", i);
			full.put("z", z);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("017", full);
			}
		
//018 - Copyright Article-Fee Code (NR) Full | Concise
//		$a - Copyright article-fee code (NR
//				$6 - Linkage (NR) 
//				$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Copyright Article-Fee Code", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("Copyright article-fee code", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
						
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("018", full);
		}
		
//020 - International Standard Book Number (R) Full | Concise
//		$a - International Standard Book Number (NR)
//		$c - Terms of availability (NR)
//		$q - Qualifying information (R)
//		$z - Canceled/invalid ISBN (R)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("International Standard Book Number", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("International Standard Book Number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType c = new CompleteTextElementType("Terms of availability", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType q = new CompleteTextElementType("Qualifying information", CTET1);
			CTET1.getSons().add(q);
			
			CompleteTextElementType z = new CompleteTextElementType("Canceled/invalid ISBN", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("c", c);
			full.put("q", q);
			full.put("z", z);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("020", full);
		}
		
//022 - International Standard Serial Number (R) Full | Concise

//ID1	Level of international interest
//		# - No level specified 
//		0 - Continuing resource of international interest 
//		1 - Continuing resource not of international interest
		
//		$a - International Standard Serial Number (NR) 
//		$l - ISSN-L (NR) 
//		$m - Canceled ISSN-L (R) 
//		$y - Incorrect ISSN (R) 
//		$z - Canceled ISSN (R) 
//		$2 - Source (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("International Standard Serial Number", I1);
			I1.getSons().add(CTET1);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Continuing resource of international interest");
			full1I.put("1", "Continuing resource not of international interest");
			full1I.put("#", "No level specified");
			TablaID1.put("022", full1I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Level of international interest", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("022", ID1);
			
			CompleteTextElementType a = new CompleteTextElementType("International Standard Serial Number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType l = new CompleteTextElementType("ISSN-L", CTET1);
			CTET1.getSons().add(l);
			
			CompleteTextElementType m = new CompleteTextElementType("Canceled ISSN-L", CTET1);
			CTET1.getSons().add(m);
			
			CompleteTextElementType y = new CompleteTextElementType("Incorrect ISSN", CTET1);
			CTET1.getSons().add(y);
			
			CompleteTextElementType z = new CompleteTextElementType("Canceled ISSN ", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("l", l);
			full.put("m", m);
			full.put("y", y);
			full.put("z", z);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("022", full);
			}
		
//024 - Other Standard Identifier (R) Full | Concise
//ID1 Type of standard number or code
//		0 - International Standard Recording Code
//		1 - Universal Product Code
//		2 - International Standard Music Number
//		3 - International Article Number
//		4 - Serial Item and Contribution Identifier
//		7 - Source specified in subfield $2
//		8 - Unspecified type of standard number or code
		
//ID2
//		# - No information provided
//		0 - No difference
//		1 - Difference
		
//		$a - Standard number or code (NR)
//		$c - Terms of availability (NR)
//		$d - Additional codes following the standard number or code (NR)
//		$q - Qualifying information (R)
//		$z - Canceled/invalid standard number or code (R)
//		$2 - Source of number or code (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Other Standard Identifier", I1);
			I1.getSons().add(CTET1);

			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "International Standard Recording Code");
			full1I.put("1", "Universal Product Code");
			full1I.put("2", "International Standard Music Number");
			full1I.put("3", "International Article Number");
			full1I.put("4", "Serial Item and Contribution Identifier");
			full1I.put("7", "Source specified in subfield");
			full1I.put("8", "Unspecified type of standard number or code");
			TablaID1.put("024", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("0", "No difference");
			full2I.put("1", "Difference");
			full2I.put("#", "No information provided");
			TablaID2.put("024", full2I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Type of standard number or code", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("024", ID1);
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Difference indicator", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("024", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Standard number or code", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType c = new CompleteTextElementType("Terms of availability", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType d = new CompleteTextElementType("Additional codes following the standard number or code", CTET1);
			CTET1.getSons().add(d);
			
			CompleteTextElementType q = new CompleteTextElementType("Qualifying information", CTET1);
			CTET1.getSons().add(q);
			
			CompleteTextElementType z = new CompleteTextElementType("Canceled/invalid standard number or code", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("c", c);
			full.put("d", d);
			full.put("q", q);
			full.put("z", z);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("024", full);
			}
		
//025 - Overseas Acquisition Number (R) Full | Concise
//		$a - Overseas acquisition number (R) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Overseas Acquisition Number", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("Overseas acquisition number", CTET1);
			CTET1.getSons().add(a);
						
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("8", n8);
			TablaD.put("025", full);
			}
		
//026 - Fingerprint Identifier (R) Full | Concise
//		$a - First and second groups of characters (NR) 
//		$b - Third and fourth groups of characters (NR) 
//		$c - Date (NR) 
//		$d - Number of volume or part (R)
//		$e - Unparsed fingerprint (NR)
//		$2 - Source (NR) 
//		$5 - Institution to which field applies (R) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Fingerprint Identifier", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("First and second groups of characters", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Third and fourth groups of characters", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Date", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType d = new CompleteTextElementType("Number of volume or part", CTET1);
			CTET1.getSons().add(d);
			
			CompleteTextElementType e = new CompleteTextElementType("Unparsed fingerprint", CTET1);
			CTET1.getSons().add(e);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
			CTET1.getSons().add(n5);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("c", c);
			full.put("d", d);
			full.put("e", e);
			full.put("5", n5);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("026", full);
			}
		
//027 - Standard Technical Report Number (R) Full | Concise
//		$a - Standard technical report number (NR)
//		$q - Qualifying information (R)
//		$z - Canceled/invalid number (R)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Standard Technical Report Number", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("Standard technical report number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType q = new CompleteTextElementType("Qualifying information", CTET1);
			CTET1.getSons().add(q);
			
			CompleteTextElementType z = new CompleteTextElementType("Canceled/invalid number", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("q", q);
			full.put("z", z);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("027", full);
			}
		
//028 - Publisher Number (R) Full | Concise
//ID1 Type of publisher number
//		0 - Issue number
//		1 - Matrix number
//		2 - Plate number
//		3 - Other music number
//		4 - Videorecording number
//		5 - Other publisher number

//ID2 Note/added entry controller
//		0 - No note, no added entry
//		1 - Note, added entry
//		2 - Note, no added entry
//		3 - No note, added entry
		
		
//		$a - Publisher number (NR)
//		$b - Source (NR)
//		$q - Qualifying information (R)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		
		{
			
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Publisher Number", I1);
			I1.getSons().add(CTET1);
		

			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Issue number");
			full1I.put("1", "Matrix number");
			full1I.put("2", "Plate number");
			full1I.put("3", "Other music number");
			full1I.put("4", "Videorecording number");
			full1I.put("5", "Other publisher number");
			TablaID1.put("028", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("0", "No note, no added entry");
			full2I.put("1", "Note, added entry");
			full2I.put("2", "Note, no added entry");
			full2I.put("3", "No note, added entry");
			TablaID2.put("028", full2I);

			CompleteTextElementType ID1 = new CompleteTextElementType("Type of publisher number", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("028", ID1);
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Note/added entry controller", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("028", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Publisher number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType q = new CompleteTextElementType("Qualifying information", CTET1);
			CTET1.getSons().add(q);
			
			CompleteTextElementType b = new CompleteTextElementType("Source", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("q", q);
			full.put("b", b);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("028", full);
			}
		
//030 - CODEN Designation (R) Full | Concise
//		$a - CODEN (NR) 
//		$z - Canceled/invalid CODEN (R) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("CODEN Designation", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("CODEN", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType z = new CompleteTextElementType("Canceled/invalid CODEN", CTET1);
			CTET1.getSons().add(z);

			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("z", z);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("030", full);
			}
		
//031 - Musical Incipits Information (R) Full | Concise
//		$a - Number of work (NR) 
//		$b - Number of movement (NR) 
//		$c - Number of excerpt (NR) 
//		$d - Caption or heading (R) 
//		$e - Role (NR) 
//		$g - Clef (NR) 
//		$m - Voice/instrument (NR) 
//		$n - Key signature (NR) 
//		$o - Time signature (NR) 
//		$p - Musical notation (NR) 
//		$q - General note (R) 
//		$r - Key or mode (NR) 
//		$s - Coded validity note (R) 
//		$t - Text incipit (R) 
//		$u - Uniform Resource Identifier (R) 
//		$y - Link text (R) 
//		$z - Public note (R) 
//		$2 - System code (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Musical Incipits Information", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("Number of work", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Number of movement", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Number of excerpt", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType d = new CompleteTextElementType("Caption or heading", CTET1);
			CTET1.getSons().add(d);
			
			CompleteTextElementType e = new CompleteTextElementType("Role", CTET1);
			CTET1.getSons().add(e);
			
			CompleteTextElementType g = new CompleteTextElementType("Clef", CTET1);
			CTET1.getSons().add(g);
			
			CompleteTextElementType m = new CompleteTextElementType("Voice/instrument", CTET1);
			CTET1.getSons().add(m);
			
			CompleteTextElementType n = new CompleteTextElementType("Key signature", CTET1);
			CTET1.getSons().add(n);
			
			CompleteTextElementType o = new CompleteTextElementType("Time signature", CTET1);
			CTET1.getSons().add(o);
			
			CompleteTextElementType p = new CompleteTextElementType("Musical notation", CTET1);
			CTET1.getSons().add(p);
			
			CompleteTextElementType q = new CompleteTextElementType("General note", CTET1);
			CTET1.getSons().add(q);
			
			CompleteTextElementType r = new CompleteTextElementType("Key or mode", CTET1);
			CTET1.getSons().add(r);
			
			CompleteTextElementType s = new CompleteTextElementType("Coded validity note", CTET1);
			CTET1.getSons().add(s);
			
			CompleteTextElementType t = new CompleteTextElementType("Text incipit", CTET1);
			CTET1.getSons().add(t);
			
			CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
			CTET1.getSons().add(u);
			
			CompleteTextElementType y = new CompleteTextElementType("Link text", CTET1);
			CTET1.getSons().add(y);
			
			CompleteTextElementType z = new CompleteTextElementType("Public note", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Canceled/invalid CODEN", CTET1);
			CTET1.getSons().add(n2);

			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("c", c);
			full.put("d", d);
			full.put("e", e);
			full.put("g", g);
			full.put("m", m);
			full.put("n", n);
			full.put("o", o);
			full.put("p", p);
			full.put("q", q);
			full.put("r", r);
			full.put("s", s);
			full.put("t", t);
			full.put("u", u);
			full.put("y", y);
			full.put("z", z);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("031", full);
			}
		
//032 - Postal Registration Number (R) Full | Concise
//		$a - Postal registration number (NR) 
//		$b - Source agency assigning number (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Postal Registration Number", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("Postal registration number", CTET1);
			a.getSons().add(CTET1);
			
			CompleteTextElementType b = new CompleteTextElementType("Source agency assigning number", CTET1);
			b.getSons().add(CTET1);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			n6.getSons().add(CTET1);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			n8.getSons().add(CTET1);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("032", full);
			}
		
//033 - Date/Time and Place of an Event (R) Full | Concise
//ID1 Type of date in subfield $a
//		# - No date information 
//		0 - Single date 
//		1 - Multiple single dates 
//		2 - Range of dates 
		
//ID2 Type of event
//		# - No information provided 
//		0 - Capture 
//		1 - Broadcast 
//		2 - Finding 
		
//		$a - Formatted date/time (R)
//		$b - Geographic classification area code (R)
//		$c - Geographic classification subarea code (R)
//		$p - Place of event (R)
//		$0 - Authority record control number (R)
//		$2 - Source of term (R)
//		$3 - Materials specified (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Date/Time and Place of an Event", I1);
			I1.getSons().add(CTET1);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "No date information ");
			full1I.put("0", "Matrix number");
			full1I.put("1", "Single date");
			full1I.put("2", "Range of dates");
			TablaID1.put("033", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("#", "No information provided ");
			full2I.put("0", "Capture");
			full2I.put("1", "Broadcast");
			full2I.put("2", "Finding");
			TablaID2.put("033", full2I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Type of date in subfield 'Formatted date/time'", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("033", ID1);
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Type of event", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("033", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Formatted date/time", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Geographic classification area code", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Geographic classification subarea code", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType p = new CompleteTextElementType("Place of event", CTET1);
			CTET1.getSons().add(p);
			
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number", CTET1);
			CTET1.getSons().add(n0);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Source of term", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
			CTET1.getSons().add(n3);

			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("c", c);
			full.put("p", p);
			full.put("0", n0);
			full.put("2", n2);
			full.put("3", n3);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("033", full);	
			}
		
//034 - Coded Cartographic Mathematical Data (R) Full | Concise
//ID1 Type of scale
//		0 - Scale indeterminable/No scale recorded
//		1 - Single scale
//		3 - Range of scales
		
//ID2 Type of ring
//		# - Not applicable
//		0 - Outer ring
//		1 - Exclusion ring
		
//		$a - Category of scale (NR)
//		$b - Constant ratio linear horizontal scale (R)
//		$c - Constant ratio linear vertical scale (R)
//		$d - Coordinates - westernmost longitude (NR)
//		$e - Coordinates - easternmost longitude (NR)
//		$f - Coordinates - northernmost latitude (NR)
//		$g - Coordinates - southernmost latitude (NR)
//		$h - Angular scale (R)
//		$j - Declination - northern limit (NR)
//		$k - Declination - southern limit (NR)
//		$m - Right ascension - eastern limit (NR)
//		$n - Right ascension - western limit (NR)
//		$p - Equinox (NR)
//		$r - Distance from earth (NR)
//		$s - G-ring latitude (R)
//		$t - G-ring longitude (R)
//		$x - Beginning date (NR)
//		$y - Ending date (NR)
//		$z - Name of extraterrestrial body (NR)
//		$0 - Authority record control number or standard number (R)
//		$2 - Source (NR)
//		$3 - Materials specified (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Coded Cartographic Mathematical Data", I1);
			I1.getSons().add(CTET1);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Scale indeterminable/No scale recorded");
			full1I.put("1", "Single scale");
			full1I.put("3", "Range of scales");
			TablaID1.put("034", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("#", "Not applicable ");
			full2I.put("0", "Outer ring");
			full2I.put("1", "Exclusion ring");
			TablaID2.put("034", full2I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Type of scale", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("034", ID1);
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Type of ring", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("034", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Category of scale", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Constant ratio linear horizontal scale", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Constant ratio linear vertical scale", CTET1);
			CTET1.getSons().add(c);
			


			
			CompleteTextElementType d = new CompleteTextElementType("Coordinates - westernmost longitude", CTET1);
			CTET1.getSons().add(d);
			
			CompleteTextElementType e = new CompleteTextElementType("Coordinates - easternmost longitude", CTET1);
			CTET1.getSons().add(e);
			
			CompleteTextElementType f = new CompleteTextElementType("Coordinates - northernmost latitude", CTET1);
			CTET1.getSons().add(f);
			
			CompleteTextElementType g = new CompleteTextElementType("Coordinates - southernmost latitude", CTET1);
			CTET1.getSons().add(g);
			

			
			CompleteTextElementType h = new CompleteTextElementType("Angular scale", CTET1);
			CTET1.getSons().add(h);
			
			CompleteTextElementType j = new CompleteTextElementType("Declination - northern limit", CTET1);
			CTET1.getSons().add(j);
			
			CompleteTextElementType k = new CompleteTextElementType("Declination - southern limit", CTET1);
			CTET1.getSons().add(k);
			
			CompleteTextElementType m = new CompleteTextElementType("Right ascension - eastern limit", CTET1);
			CTET1.getSons().add(m);
			
			CompleteTextElementType n = new CompleteTextElementType("Right ascension - western limit", CTET1);
			CTET1.getSons().add(n);
			
			CompleteTextElementType p = new CompleteTextElementType("Equinox", CTET1);
			CTET1.getSons().add(p);
			
			CompleteTextElementType r = new CompleteTextElementType("Distance from earth", CTET1);
			CTET1.getSons().add(r);
			
			
			CompleteTextElementType s = new CompleteTextElementType("G-ring latitude", CTET1);
			CTET1.getSons().add(s);
			
			CompleteTextElementType t = new CompleteTextElementType("G-ring longitude", CTET1);
			CTET1.getSons().add(t);
			
			CompleteTextElementType x = new CompleteTextElementType("Beginning date", CTET1);
			CTET1.getSons().add(x);
			
			CompleteTextElementType y = new CompleteTextElementType("Ending date", CTET1);
			CTET1.getSons().add(y);
			
			CompleteTextElementType z = new CompleteTextElementType("Name of extraterrestrial body", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number or standard number", CTET1);
			CTET1.getSons().add(n0);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
			CTET1.getSons().add(n3);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("c", c);
			full.put("d", d);
			full.put("e", e);
			full.put("f", f);
			full.put("g", g);
			full.put("h", h);
			full.put("j", j);
			full.put("k", k);
			full.put("m", m);
			full.put("n", n);
			full.put("p", p);
			full.put("r", r);
			full.put("s", s);
			full.put("t", t);
			full.put("x", x);
			full.put("y", y);
			full.put("z", z);
			full.put("0", n0);
			full.put("2", n2);
			full.put("3", n3);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("034", full);
			}
		
//035 - System Control Number (R) Full | Concise
		{
//
//			$a - System control number (NR) 
//			$z - Canceled/invalid control number (R) 
//			$6 - Linkage (NR) 
//			$8 - Field link and sequence number (R) 
			
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("System Control Number", I1);
			I1.getSons().add(CTET1);


			CompleteTextElementType a = new CompleteTextElementType("System control number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType z = new CompleteTextElementType("Canceled/invalid control number", CTET1);
			CTET1.getSons().add(z);

			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("z", z);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("035", full);
			}
		
//036 - Original Study Number for Computer Data Files (NR) Full | Concise
		{
//
//			$a - Original study number (NR) 
//			$b - Source agency assigning number (NR) 
//			$6 - Linkage (NR) 
//			$8 - Field link and sequence number (R) 

			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Original Study Number for Computer Data Files", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType a = new CompleteTextElementType("Original study number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Source agency assigning number", CTET1);
			CTET1.getSons().add(b);

			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("036", full);
			}
		
//037 - Source of Acquisition (R) Full | Concise
		{
//			$a - Stock number (NR) 
//			$b - Source of stock number/acquisition (NR) 
//			$c - Terms of availability (R) 
//			$f - Form of issue (R) 
//			$g - Additional format characteristics (R) 
//			$n - Note (R) 
//			$6 - Linkage (NR) 
//			$8 - Field link and sequence number (R)
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Source of Acquisition", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("Stock number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Source of stock number/acquisition", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Terms of availability", CTET1);
			CTET1.getSons().add(c);

			CompleteTextElementType f = new CompleteTextElementType("Form of issue", CTET1);
			CTET1.getSons().add(f);
			
			CompleteTextElementType g = new CompleteTextElementType("Additional format characteristics", CTET1);
			CTET1.getSons().add(g);
			
			CompleteTextElementType n = new CompleteTextElementType("Note", CTET1);
			CTET1.getSons().add(n);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("c", c);
			full.put("f", f);
			full.put("g", g);
			full.put("n", n);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("037", full);
			}
		
//038 - Record Content Licensor (NR) Full | Concise
		{
//			$a - Record content licensor (NR)
//			$6 - Linkage (NR) 
//			$8 - Field link and sequence number (R) 
			
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Record Content Licensor", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("Record content licensor", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("038", full);
			}
		
//040 - Cataloging Source (NR) Full | Concise
		{
// 			$a - Original cataloging agency (NR)
//			$b - Language of cataloging (NR)
//			$c - Transcribing agency (NR)
//			$d - Modifying agency (R)
//			$e - Description conventions (R)
//			$6 - Linkage (NR)
//			$8 - Field link and sequence number (R)
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Cataloging Source", I1);
			I1.getSons().add(CTET1);


			CompleteTextElementType a = new CompleteTextElementType("Original cataloging agency", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Language of cataloging", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Transcribing agency", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType d = new CompleteTextElementType("Modifying agency", CTET1);
			CTET1.getSons().add(d);
			
			CompleteTextElementType e = new CompleteTextElementType("Description conventions", CTET1);
			CTET1.getSons().add(e);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("c", c);
			full.put("d", d);
			full.put("e", e);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("040", full);
			}
		
//041 - Language Code (R) Full | Concise
//ID1	Translation indication
//		# - No information provided
//		0 - Item not a translation/does not include a translation
//		1 - Item is or includes a translation
		
//ID2 Source of code
//		# - MARC language code
//		7 - Source specified in subfield Source
		
//		$a - Language code of text/sound track or separate title (R)
//		$b - Language code of summary or abstract (R)
//		$d - Language code of sung or spoken text (R)
//		$e - Language code of librettos (R)
//		$f - Language code of table of contents (R)
//		$g - Language code of accompanying material other than librettos (R)
//		$h - Language code of original (R)
//		$j - Language code of subtitles or captions (R)
//		$k - Language code of intermediate translations (R)
//		$m - Language code of original accompanying materials other than librettos (R)
//		$n - Language code of original libretto (R)
//		$2 - Source of code (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Language Code", I1);
			I1.getSons().add(CTET1);

			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "No information provided");
			full1I.put("0", "Item not a translation/does not include a translation");
			full1I.put("1", "Item is or includes a translation");
			TablaID1.put("041", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("#", "MARC language code");
			full2I.put("7", "Source specified in subfield Source");
			TablaID2.put("041", full2I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Translation indication", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("041", ID1);
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Source of code", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("041", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Language code of text/sound track or separate title", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Language code of summary or abstract", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType d = new CompleteTextElementType("Language code of sung or spoken text", CTET1);
			CTET1.getSons().add(d);
			
			CompleteTextElementType e = new CompleteTextElementType("Language code of librettos", CTET1);
			CTET1.getSons().add(e);
			
			CompleteTextElementType f = new CompleteTextElementType("Language code of table of contents", CTET1);
			CTET1.getSons().add(f);
			
			CompleteTextElementType g = new CompleteTextElementType("Language code of accompanying material other than librettos", CTET1);
			CTET1.getSons().add(g);
			
			CompleteTextElementType h = new CompleteTextElementType("Language code of original", CTET1);
			CTET1.getSons().add(h);
				
			CompleteTextElementType j = new CompleteTextElementType("Language code of subtitles or captions", CTET1);
			CTET1.getSons().add(j);
			
			CompleteTextElementType k = new CompleteTextElementType("Language code of intermediate translations", CTET1);
			CTET1.getSons().add(k);
			
			CompleteTextElementType m = new CompleteTextElementType("Language code of original accompanying materials other than librettos", CTET1);
			CTET1.getSons().add(m);
			
			CompleteTextElementType n = new CompleteTextElementType("Language code of original libretto", CTET1);
			CTET1.getSons().add(n);

			CompleteTextElementType n2 = new CompleteTextElementType("Source of code", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("d", d);
			full.put("e", e);
			full.put("f", f);
			full.put("g", g);
			full.put("h", h);
			full.put("j", j);
			full.put("k", k);
			full.put("m", m);
			full.put("n", n);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("041", full);
			}
		
//042 - Authentication Code (NR) Full | Concise
//$a - Authentication code (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Authentication Code", I1);
			I1.getSons().add(CTET1);

			CompleteTextElementType a = new CompleteTextElementType("Authentication code", CTET1);
			CTET1.getSons().add(a);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			TablaD.put("042", full);
			}
		
//043 - Geographic Area Code (NR) Full | Concise
//		$a - Geographic area code (R)
//		$b - Local GAC code (R)
//		$c - ISO code (R)
//		$0 - Authority record control number or standard number (R)
//		$2 - Source of local code (R)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Geographic Area Code", I1);
			I1.getSons().add(CTET1);


			CompleteTextElementType a = new CompleteTextElementType("Geographic area code", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Local GAC code", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("ISO code", CTET1);
			CTET1.getSons().add(c);		
			
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number or standard number", CTET1);
			CTET1.getSons().add(n0);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Source of local code", CTET1);
			CTET1.getSons().add(n2);

			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("c", c);
			full.put("0", n0);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("043", full);
			}
		
//044 - Country of Publishing/Producing Entity Code (NR) Full | Concise
//		$a - MARC country code (R) 
//		$b - Local subentity code (R) 
//		$c - ISO country code (R) 
//		$2 - Source of local subentity code (R) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Country of Publishing/Producing Entity Code", I1);
			I1.getSons().add(CTET1);

			CompleteTextElementType a = new CompleteTextElementType("MARC country code", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Local subentity code", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("ISO country code", CTET1);
			CTET1.getSons().add(c);		
			
			CompleteTextElementType n2 = new CompleteTextElementType("Source of local subentity code", CTET1);
			CTET1.getSons().add(n2);

			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("c", c);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("044", full);
			}
		
//045 - Time Period of Content (NR) Full | Concise
//ID1	Type of time period in subfield $b or $c
//		# - Subfield $b or $c not present 
//		0 - Single date/time 
//		1 - Multiple single dates/times 
//		2 - Range of dates/times 

//     $a - Time period code (R) 
//		$b - Formatted 9999 B.C. through C.E. time period (R) 
//		$c - Formatted pre-9999 B.C. time period (R) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Time Period of Content", I1);
			I1.getSons().add(CTET1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "Subfield 'Formatted 9999 B.C. through C.E. time period' or 'Formatted pre-9999 B.C. time period' not present ");
			full1I.put("0", "Single date/time ");
			full1I.put("1", "Multiple single dates/times ");
			full1I.put("2", "Range of dates/times");
			TablaID1.put("045", full1I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Type of time period in subfield 'Formatted 9999 B.C. through C.E. time period' or 'Formatted pre-9999 B.C. time period'", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("045", ID1);
			
			CompleteTextElementType a = new CompleteTextElementType("Time period code", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Formatted 9999 B.C. through C.E. time period", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Formatted pre-9999 B.C. time period", CTET1);
			CTET1.getSons().add(c);
			
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("c", c);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("045", full);
			}
		
//046 - Special Coded Dates (R) Full | Concise
//		$a - Type of date code (NR)
//		$b - Date 1, B.C. date (NR)
//		$c - Date 1, C.E. date (NR)
//		$d - Date 2, B.C. date (NR)
//		$e - Date 2, C.E. date (NR)
//		$j - Date resource modified (NR)
//		$k - Beginning or single date created (NR)
//		$l - Ending date created (NR)
//		$m - Beginning of date valid (NR)
//		$n - End of date valid (NR)
//		$o - Single or starting date for aggregated content (NR)
//		$p - Ending date for aggregated content (NR)
//		$2 - Source of date (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Special Coded Dates", I1);
			I1.getSons().add(CTET1);
			
			
			CompleteTextElementType a = new CompleteTextElementType("Type of date code", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Date 1, B.C. date", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Date 1, C.E. date", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType d = new CompleteTextElementType("Date 2, B.C. date", CTET1);
			CTET1.getSons().add(d);
			
			CompleteTextElementType e = new CompleteTextElementType("Date 2, C.E. date", CTET1);
			CTET1.getSons().add(e);
			
			CompleteTextElementType j = new CompleteTextElementType("Date resource modified", CTET1);
			CTET1.getSons().add(j);
			
			CompleteTextElementType k = new CompleteTextElementType("Beginning or single date created", CTET1);
			CTET1.getSons().add(k);
			
			CompleteTextElementType l = new CompleteTextElementType("Ending date created", CTET1);
			CTET1.getSons().add(l);
			
			CompleteTextElementType m = new CompleteTextElementType("Beginning of date valid", CTET1);
			CTET1.getSons().add(m);
			
			CompleteTextElementType n = new CompleteTextElementType("End of date valid", CTET1);
			CTET1.getSons().add(n);
			
			CompleteTextElementType o = new CompleteTextElementType("Single or starting date for aggregated content", CTET1);
			CTET1.getSons().add(o);
			
			CompleteTextElementType p = new CompleteTextElementType("Ending date for aggregated content", CTET1);
			CTET1.getSons().add(p);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Source of date", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("c", c);
			full.put("d", d);
			full.put("e", e);
			full.put("j", j);
			full.put("k", k);
			full.put("l", l);
			full.put("m", m);
			full.put("n", n);
			full.put("o", o);
			full.put("p", p);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("046", full);
			}
		
//047 - Form of Musical Composition Code (NR) Full | Concise
//ID2	Source of code
//		# - MARC musical composition code 
//		7 - Source specified in subfield $2 ç

//		$a - Form of musical composition code (R)
//		$2 - Source of code (NR)
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Form of Musical Composition Code", I1);
			I1.getSons().add(CTET1);

			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("7", "Source specified in subfield 'Source of code'");
			full2I.put("#", "MARC musical composition code ");
			TablaID2.put("047", full2I);
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Source of code", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("048", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Form of musical composition code", CTET1);
			CTET1.getSons().add(a);	
					
			CompleteTextElementType n2 = new CompleteTextElementType("Source of code", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("2", n2);
			full.put("8", n8);
			TablaD.put("047", full);
			}
		
//048 - Number of Musical Instruments or Voices Codes (R) Full | Concise
//ID2	Source of code
//		# - MARC musical composition code 
//		7 - Source specified in subfield $2 ç

//		$a - Performer or ensemble (R) 
//		$b - Soloist (R) 
//		$2 - Source of code (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Number of Musical Instruments or Voices Codes", I1);
			I1.getSons().add(CTET1);
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("7", "Source specified in subfield 'Source of code'");
			full2I.put("#", "MARC musical composition code ");
			TablaID2.put("048", full2I);
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Source of code", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("048", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Form of musical composition code", CTET1);
			CTET1.getSons().add(a);	
			
			CompleteTextElementType b = new CompleteTextElementType("Soloist", CTET1);
			CTET1.getSons().add(b);	
					
			CompleteTextElementType n2 = new CompleteTextElementType("Source of code", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("2", n2);
			full.put("8", n8);
			TablaD.put("048", full);
			}
		
//050 - Library of Congress Call Number (R) Full | Concise
//ID1 Existence in LC collection
//		# - No information provided 
//		0 - Item is in LC 
//		1 - Item is not in LC	
		
//ID2 Source of call number
//		0 - Assigned by LC 
//		4 - Assigned by agency other than LC 

//		$a - Classification number (R) 
//		$b - Item number (NR)
//		$3 - Materials specified (NR)
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Library of Congress Call Number", I1);
			I1.getSons().add(CTET1);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "No information provided ");
			full1I.put("0", "Item is in LC ");
			full1I.put("1", "Item is not in LC");
			TablaID1.put("050", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("0", "Assigned by LC ");
			full2I.put("4", "Assigned by agency other than LC ");
			TablaID2.put("050", full2I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Existence in LC collection", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("050", ID1);
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Source of call number", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("050", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Classification number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Item number", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
			CTET1.getSons().add(n3);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("3", n3);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("050", full);
			}
		
//051 - Library of Congress Copy, Issue, Offprint Statement (R) Full | Concise
//		$a - Classification number (NR) 
//		$b - Item number (NR) 
//		$c - Copy information (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Library of Congress Copy, Issue, Offprint Statement", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("Classification number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Item number", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Copy information", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("c", c);
			full.put("8", n8);
			TablaD.put("051", full);
			}
		
//052 - Geographic Classification (R) Full | Concise
//ID1 Code source
//		# - Library of Congress Classification 
//		1 - U.S. Dept. of Defense Classification 
//		7 - Source specified in subfield $2

//		$a - Geographic classification area code (NR) 
//		$b - Geographic classification subarea code (R) 
//		$d - Populated place name (R) 
//		$2 - Code source (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Geographic Classification", I1);
			I1.getSons().add(CTET1);
			
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("7", "Source specified in subfield 'Code source'");
			full1I.put("1", "U.S. Dept. of Defense Classification ");
			full1I.put("#", "Library of Congress Classification ");
			TablaID1.put("052", full1I);

			CompleteTextElementType ID1 = new CompleteTextElementType("Code source", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("052", ID1);
			
			CompleteTextElementType a = new CompleteTextElementType("Geographic classification area code", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Geographic classification subarea code", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType d = new CompleteTextElementType("opulated place name", CTET1);
			CTET1.getSons().add(d);

			CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("d", d);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("052", full);
			}
		
//055 - Classification Numbers Assigned in Canada (R) Full | Concise
//ID1 Existence in LAC collection
//		# - Information not provided 
//		0 - Work held by LAC 
//		1 - Work not held by LAC 
		
//ID2 Type, completeness, source of class/call number
//		0 - LC-based call number assigned by LAC 
//		1 - Complete LC class number assigned by LAC 
//		2 - Incomplete LC class number assigned by LAC 
//		3 - LC-based call number assigned by the contributing library 
//		4 - Complete LC class number assigned by the contributing library 
//		5 - Incomplete LC class number assigned by the contributing library 
//		6 - Other call number assigned by LAC 
//		7 - Other class number assigned by LAC 
//		8 - Other call number assigned by the contributing library 
//		9 - Other class number assigned by the contributing library 

//		$a - Classification number (NR) 
//		$b - Item number (NR)
//		$2 - Source of call/class number (NR)
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 

		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Classification Numbers Assigned in Canada", I1);
			I1.getSons().add(CTET1);


			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "Information not provided");
			full1I.put("0", "Work held by LAC");
			full1I.put("1", "Work not held by LAC");
			TablaID1.put("055", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("0", "LC-based call number assigned by LAC");
			full2I.put("1", "Complete LC class number assigned by LAC");
			full2I.put("2", "Incomplete LC class number assigned by LAC ");
			full2I.put("3", "LC-based call number assigned by the contributing library");
			full2I.put("4", "Complete LC class number assigned by the contributing library");
			full2I.put("5", "Incomplete LC class number assigned by the contributing librar");
			full2I.put("6", "Other call number assigned by LAC");
			full2I.put("7", "Other class number assigned by LAC");
			full2I.put("8", "Other call number assigned by the contributing library");
			full2I.put("9", "Other class number assigned by the contributing library");
			TablaID2.put("055", full2I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Existence in LAC collection", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("055", ID1);
			
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Type, completeness, source of class/call number", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("055", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Classification number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Item number", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Source of call/class number", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);	
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("055", full);
			}
		
//060 - National Library of Medicine Call Number (R) Full | Concise
//ID1 Existence in NLM collection
//		# - No information provided 
//		0 - Item is in NLM 
//		1 - Item is not in NLM 
		
//ID2 Source of call number
//		0 - Assigned by NLM 
//		4 - Assigned by agency other than NLM 

//		$a - Classification number (R
//		$b - Item number (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("National Library of Medicine Call Number", I1);
			I1.getSons().add(CTET1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "No information provided");
			full1I.put("0", "Item is in NLM");
			full1I.put("1", "Item is not in NLM");
			TablaID1.put("060", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("0", "Assigned by NLM");
			full2I.put("4", "Assigned by agency other than NLM");
			TablaID2.put("060", full2I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Existence in NLM collectio", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("060", ID1);
			
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Source of call number", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("060", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Classification number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Item number", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);	
			full.put("8", n8);
			TablaD.put("060", full);
			}
		
//061 - National Library of Medicine Copy Statement (R) Full | Concise
//
//		$a - Classification number (R) 
//		$b - Item number (NR) 
//		$c - Copy information (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("National Library of Medicine Copy Statement", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("Classification number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Item number", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Copy information", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);	
			full.put("c", c);
			full.put("8", n8);
			TablaD.put("061", full);
			}
		
//066 - Character Sets Present (NR) Full | Concise
//		$a - Primary G0 character set (NR)
//		$b - Primary G1 character set (NR)
//		$c - Alternate G0 or G1 character set (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Character Sets Present", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("Primary G0 character set", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Primary G1 character set", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Alternate G0 or G1 character set", CTET1);
			CTET1.getSons().add(c);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);	
			full.put("c", c);
			TablaD.put("066", full);
			}
		
//070 - National Agricultural Library Call Number (R) Full | Concise
//ID1 Existence in NAL collection
//		0 - Item is in NAL 
//		1 - Item is not in NAL 
		
//		$a - Classification number (R)
//		$b - Item number (NR)
//		$8 - Field link and sequence number (R

		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("National Agricultural Library Call Number", I1);
			I1.getSons().add(CTET1);

			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Item is in NAL");
			full1I.put("1", "Item is not in NAL");
			TablaID1.put("070", full1I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Existence in NAL collection", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("070", ID1);
			
			CompleteTextElementType a = new CompleteTextElementType("Classification number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Item number", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);	
			full.put("8", n8);
			TablaD.put("070", full);
			}
		
//071 - National Agricultural Library Copy Statement (R) Full | Concise
//
//		$a - Classification number (R) 
//		$b - Item number (NR) 
//		$c - Copy information (R) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("National Agricultural Library Copy Statement", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("Classification number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Item number", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Copy information", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);	
			full.put("c", c);
			full.put("8", n8);
			TablaD.put("071", full);
			}
		
//072 - Subject Category Code (R) Full | Concise
//ID2 Code source
//		0 - NAL subject category code list 
//		7 - Source specified in subfield $2 

//		$a - Subject category code (NR) 
//		$x - Subject category code subdivision (R)
//		$2 - Source (NR)
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 

		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Subject Category Code", I1);
			I1.getSons().add(CTET1);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("0", "NAL subject category code list");
			full2I.put("7", "Source specified in subfield 'Source' ");
			TablaID2.put("072", full2I);
			
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Code source", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("072", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Subject category code ", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType x = new CompleteTextElementType("Subject category code subdivision", CTET1);
			CTET1.getSons().add(x);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("x", x);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("072", full);
			}
		
//074 - GPO Item Number (R) Full | Concise
//		$a - GPO item number (NR) 
//		$z - Canceled/invalid GPO item number (R) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("GPO Item Number", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("GPO item number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType z = new CompleteTextElementType("Canceled/invalid GPO item number", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("z", z);	
			full.put("8", n8);
			TablaD.put("074", full);
			}
		
//080 - Universal Decimal Classification Number (R) Full | Concise
//ID1 Type of edition
//		# - No information provided
//		0 - Full
//		1 - Abridged
		
//		$a - Universal Decimal Classification number (NR)
//		$b - Item number (NR)
//		$x - Common auxiliary subdivision (R)
//		$2 - Edition identifier (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Universal Decimal Classification Number", I1);
			I1.getSons().add(CTET1);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", " No information provided");
			full1I.put("0", "Full");
			full1I.put("1", "Abridged");
			TablaID1.put("080", full1I);
		
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Type of edition", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("080", ID1);
			

			CompleteTextElementType a = new CompleteTextElementType("Universal Decimal Classification number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Item number", CTET1);
			CTET1.getSons().add(b);
				
			CompleteTextElementType x = new CompleteTextElementType("Common auxiliary subdivision", CTET1);
			CTET1.getSons().add(x);
	
			CompleteTextElementType n2 = new CompleteTextElementType("Edition identifier", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("x", x);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("080", full);
			}
		
//082 - Dewey Decimal Classification Number (R) Full | Concise
//ID1 Type of edition
//		0 - Full edition
//		1 - Abridged edition
//		7 - Other edition specified in subfield $2
		
//ID2 Source of classification number
//		# - No information provided
//		0 - Assigned by LC
//		4 - Assigned by agency other than LC

//		$a - Classification number (R)
//		$b - Item number (NR)
//		$m - Standard or optional designation (NR)
//		$q - Assigning agency (NR)
//		$2 - Edition number (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Dewey Decimal Classification Number", I1);
			I1.getSons().add(CTET1);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Full edition");
			full1I.put("1", "Abridged edition");
			full1I.put("7", "Other edition specified in subfield 'Edition number'");
			TablaID1.put("082", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("#", "No information provided");
			full2I.put("0", "Assigned by LC");
			full2I.put("4", "Assigned by agency other than LC");
			TablaID2.put("082", full2I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Type of edition", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("082", ID1);
			
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Source of classification number", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("082", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Classification number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Item number", CTET1);
			CTET1.getSons().add(b);
					
			CompleteTextElementType m = new CompleteTextElementType("Standard or optional designation", CTET1);
			CTET1.getSons().add(m);
			
			CompleteTextElementType q = new CompleteTextElementType("Assigning agency", CTET1);
			CTET1.getSons().add(q);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Edition number", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("m", m);
			full.put("q", q);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("082", full);
			}
		
//083 - Additional Dewey Decimal Classification Number (R) Full | Concise
//ID1 Type of edition
//		0 - Full edition
//		1 - Abridged edition
//		7 - Other edition specified in subfield $2
		
//		$a - Classification number (R)
//		$c - Classification number--Ending number of span (R)
//		$m - Standard or optional designation (NR)
//		$q - Assigning agency (NR)
//		$y - Table sequence number for internal subarrangement or add table (R)
//		$z - Table identification (R)
//		$2 - Edition number (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Additional Dewey Decimal Classification Number", I1);
			I1.getSons().add(CTET1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Full edition");
			full1I.put("1", "Abridged edition");
			full1I.put("7", "Other edition specified in subfield 'Edition number'");
			TablaID1.put("083", full1I);
			
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Type of edition", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("083", ID1);
			
			
			CompleteTextElementType a = new CompleteTextElementType("Classification number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType c = new CompleteTextElementType("Classification number--Ending number of span", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType m = new CompleteTextElementType("Standard or optional designation", CTET1);
			CTET1.getSons().add(m);
			
			CompleteTextElementType q = new CompleteTextElementType("Assigning agency", CTET1);
			CTET1.getSons().add(q);
			
			CompleteTextElementType y = new CompleteTextElementType("Table sequence number for internal subarrangement or add table", CTET1);
			CTET1.getSons().add(y);
			
			CompleteTextElementType z = new CompleteTextElementType("Table identification", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Edition number", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("c", c);
			full.put("m", m);
			full.put("q", q);
			full.put("y", y);
			full.put("z", z);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("083", full);
			}
		
//084 - Other Classification Number (R) Full | Concise
//		$a - Classification number (R)
//		$b - Item number (NR)
//		$q - Assigning agency (NR)
//		$2 - Number source (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Other Classification Number", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("Classification number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Item number", CTET1);
			CTET1.getSons().add(b);

			CompleteTextElementType q = new CompleteTextElementType("Assigning agency", CTET1);
			CTET1.getSons().add(q);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Number source", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("q", q);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("084", full);
			}
		
//085 - Synthesized Classification Number Components (R) Full | Concise
//		$a - Number where instructions are found-single number or beginning number of span (R)
//		$b - Base number (R)
//		$c - Classification number-ending number of span (R)
//		$f - Facet designator (R)
//		$r - Root number (R)
//		$s - Digits added from classification number in schedule or external table (R)
//		$t - Digits added from internal subarrangement or add table (R)
//		$u - Number being analyzed (R)
//		$v - Number in internal subarrangement or add table where instructions are found (R)
//		$w - Table identification-Internal subarrangement or add table (R)
//		$y - Table sequence number for internal subarrangement or add table (R)
//		$z - Table identification (R)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Synthesized Classification Number Components", I1);
			I1.getSons().add(CTET1);
			
			CompleteTextElementType a = new CompleteTextElementType("Number where instructions are found-single number or beginning number of span", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Base number", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Classification number-ending number of span", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType f = new CompleteTextElementType("Facet designator", CTET1);
			CTET1.getSons().add(f);		
			
			CompleteTextElementType r = new CompleteTextElementType("Root number", CTET1);
			CTET1.getSons().add(r);
			
			CompleteTextElementType s = new CompleteTextElementType("Digits added from classification number in schedule or external table", CTET1);
			CTET1.getSons().add(s);
			
			CompleteTextElementType t = new CompleteTextElementType("Digits added from internal subarrangement or add table ", CTET1);
			CTET1.getSons().add(t);
			
			CompleteTextElementType u = new CompleteTextElementType("Number being analyzed", CTET1);
			CTET1.getSons().add(u);
			
			CompleteTextElementType v = new CompleteTextElementType("Number in internal subarrangement or add table where instructions are found", CTET1);
			CTET1.getSons().add(v);
			
			CompleteTextElementType w = new CompleteTextElementType("Table identification-Internal subarrangement or add table", CTET1);
			CTET1.getSons().add(w);

			CompleteTextElementType y = new CompleteTextElementType("Table sequence number for internal subarrangement or add table", CTET1);
			CTET1.getSons().add(y);
			
			CompleteTextElementType z = new CompleteTextElementType("Table identification", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("c", c);
			full.put("f", f);
			full.put("r", r);
			full.put("s", s);
			full.put("t", t);
			full.put("u", u);
			full.put("v", v);
			full.put("w", w);
			full.put("y", y);
			full.put("z", z);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("085", full);
			}
		
//086 - Government Document Classification Number (R) Full | Concise
//ID1	Number source
//		# - Source specified in subfield $2 
//		0 - Superintendent of Documents Classification System 
//		1 - Government of Canada Publications: Outline of Classification 
		
//		$a - Classification number (NR) 
//		$z - Canceled/invalid classification number (R) 
//		$2 - Number source (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 		
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Government Document Classification Number", I1);
			I1.getSons().add(CTET1);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "Source specified in subfield 'Number source'");
			full1I.put("0", "Superintendent of Documents Classification System ");
			full1I.put("1", "Government of Canada Publications: Outline of Classification");
			TablaID1.put("086", full1I);
			
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Number source", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("086", ID1);
			
			
			CompleteTextElementType a = new CompleteTextElementType("Classification number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType z = new CompleteTextElementType("Canceled/invalid classification number", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Number source", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("z", z);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("086", full);
			}
		
//088 - Report Number (R) Full | Concise
//		$a - Report number (NR) 
//		$z - Canceled/invalid report number (R) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Report Number", I1);
			I1.getSons().add(CTET1);


			CompleteTextElementType a = new CompleteTextElementType("Report number", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType z = new CompleteTextElementType("Canceled/invalid report number", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("z", z);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("088", full);
			}
		
//09X - Local Call Numbers Full | Concise
		{
			
			//Caso Raro
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			Raro09X=new CompleteTextElementType("Local Call Numbers Full", I1);
			I1.getSons().add(Raro09X);
			}
		
}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessInstances()
	 */
	@Override
	public void ProcessInstances() {
		// se hace en otro metodo

	}

	public boolean isRaro(String tagS) {
		switch (tagS) {
		case "090":
			return true;
		case "091":
			return true;
		case "092":
			return true;
		case "093":
			return true;
		case "094":
			return true;
		case "095":
			return true;
		case "096":
			return true;
		case "097":
			return true;
		case "098":
			return true;
		case "099":
			return true;
		default:
			return false;
		}

	}

	/**
	 * @return the raro09X
	 */
	public CompleteTextElementType getRaro09X() {
		return Raro09X;
	}

	/**
	 * @param raro09x the raro09X to set
	 */
	public void setRaro09X(CompleteTextElementType raro09x) {
		Raro09X = raro09x;
	}
	
	

}
