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
public class S2XX implements InterfaceMARCXMLparser {
	
	private CompleteElementType Datos;
	private HashMap<String, HashMap<String, CompleteTextElementType>> TablaD;
	private HashMap<String, HashMap<String, String>> TablaID1;
	private HashMap<String, CompleteTextElementType> TablaD1;
	private HashMap<String, HashMap<String, String>> TablaID2;
	private HashMap<String, CompleteTextElementType> TablaD2;

	public S2XX(CompleteElementType datos,
			HashMap<String, HashMap<String, CompleteTextElementType>> tablaD,
			HashMap<String, HashMap<String, String>> tablaID1,
			HashMap<String, HashMap<String, String>> tablaID2,
			HashMap<String, CompleteTextElementType> tablaD1,
			HashMap<String, CompleteTextElementType> tablaD2) {
		Datos=datos;
		TablaD=tablaD;
		TablaID1=tablaID1;
		TablaID2=tablaID2;
		TablaD1=tablaD1;
		TablaD2=tablaD2;
	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessAttributes()
	 */
	@Override
	public void ProcessAttributes() {
		
//210  Abbreviated Title (R) Full | Concise
//ID1 	Title added entry
//		0 - No added entry 
//		1 - Added entry 
		
//ID2 	Type
//		# - Abbreviated key title 
//		0 - Other abbreviated title 
		
//		$a - Abbreviated title (NR) 
//		$b - Qualifying information (NR) 
//		$2 - Source (R)	
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Abbreviated Title", I1);
			I1.getSons().add(CTET1);	
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "No added entry");
			full1I.put("1", "Added entry");
			TablaID1.put("210", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("0", "Other abbreviated title");
			full2I.put("#", "Abbreviated key title");
			TablaID2.put("210", full2I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Title added entry", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("210", ID1);
			
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Type", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("210", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Abbreviated title", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Qualifying information", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
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
			TablaD.put("210", full);
		}
//222 - Key Title (R) Full | Concise		
//ID2 	Nonfiling characters
//		0 - No nonfiling characters 
//		1-9 - Number of nonfiling characters 
		
//		$a - Key title (NR) 
//		$b - Qualifying information (NR)	
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Key Title", I1);
			I1.getSons().add(CTET1);	
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("0", "No nonfiling characters");
			full2I.put("1", "1 nonfiling characters");
			full2I.put("2", "2 nonfiling characters");
			full2I.put("3", "3 nonfiling characters");
			full2I.put("4", "4 nonfiling characters");
			full2I.put("5", "5 nonfiling characters");
			full2I.put("6", "6 nonfiling characters");
			full2I.put("7", "7 nonfiling characters");
			full2I.put("8", "8 nonfiling characters");
			full2I.put("9", "9 nonfiling characters");
			TablaID2.put("222", full2I);
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Nonfiling characters", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("222", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Key title", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Qualifying information", CTET1);
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
			TablaD.put("222", full);
		}
//240 - Uniform Title (NR) Full | Concise
//ID1 	Uniform title printed or displayed
//		0 - Not printed or displayed 
//		1 - Printed or displayed 
		
//ID2 	Nonfiling characters
//		0-9 - Number of nonfiling characters 
		
//		$a - Uniform title (NR) 
//		$d - Date of treaty signing (R) 
//		$f - Date of a work (NR) 
//		$g - Miscellaneous information (NR) 
//		$h - Medium (NR) 
//		$k - Form subheading (R) 
//		$l - Language of a work (NR) 
//		$m - Medium of performance for music (R)	
//		$n - Number of part/section of a work (R) 
//		$o - Arranged statement for music (NR) 
//		$p - Name of part/section of a work (R) 
//		$r - Key for music (NR) 
//		$s - Version (NR) 
//		$0 - Authority record control number (R)
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Uniform Title", I1);
			I1.getSons().add(CTET1);	
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Source specified in Source");
			full1I.put("1", "Library and Archives Canada");
			TablaID1.put("240", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("0", "No nonfiling characters");
			full2I.put("1", "1 nonfiling characters");
			full2I.put("2", "2 nonfiling characters");
			full2I.put("3", "3 nonfiling characters");
			full2I.put("4", "4 nonfiling characters");
			full2I.put("5", "5 nonfiling characters");
			full2I.put("6", "6 nonfiling characters");
			full2I.put("7", "7 nonfiling characters");
			full2I.put("8", "8 nonfiling characters");
			full2I.put("9", "9 nonfiling characters");
			TablaID2.put("240", full2I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Uniform title printed or displayed", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("240", ID1);
			
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Nonfiling characters", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("240", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Uniform title", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType d = new CompleteTextElementType("Date of treaty signing", CTET1);
			CTET1.getSons().add(d);
		
			CompleteTextElementType f = new CompleteTextElementType("Date of a work", CTET1);
			CTET1.getSons().add(f);
			
			CompleteTextElementType g = new CompleteTextElementType("Miscellaneous information", CTET1);
			CTET1.getSons().add(g);
			
			CompleteTextElementType h = new CompleteTextElementType("Medium", CTET1);
			CTET1.getSons().add(h);
			
			CompleteTextElementType k = new CompleteTextElementType("Form subheading", CTET1);
			CTET1.getSons().add(k);
			
			CompleteTextElementType l = new CompleteTextElementType("Language of a work", CTET1);
			CTET1.getSons().add(l);
			
			CompleteTextElementType m = new CompleteTextElementType("Medium of performance for music", CTET1);
			CTET1.getSons().add(m);
			
			CompleteTextElementType n = new CompleteTextElementType("Number of part/section of a work", CTET1);
			CTET1.getSons().add(n);
			
			CompleteTextElementType o = new CompleteTextElementType("Arranged statement for music", CTET1);
			CTET1.getSons().add(o);
			
			CompleteTextElementType p = new CompleteTextElementType("Name of part/section of a work", CTET1);
			CTET1.getSons().add(p);
			
			CompleteTextElementType r = new CompleteTextElementType("Key for music", CTET1);
			CTET1.getSons().add(r);
			
			CompleteTextElementType s = new CompleteTextElementType("Version", CTET1);
			CTET1.getSons().add(s);
			
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number", CTET1);
			CTET1.getSons().add(n0);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("d", d);
			full.put("f", f);
			full.put("g", g);
			full.put("h", h);
			full.put("k", k);
			full.put("l", l);
			full.put("m", m);
			full.put("n", n);
			full.put("o", o);
			full.put("p", p);
			full.put("r", r);
			full.put("s", s);
			full.put("0", n0);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("240", full);
		}
//242 - Translation of Title by Cataloging Agency (R) Full | Concise
//ID1 	Title added entry
//		0 - No added entry 
//		1 - Added entry 
		
//ID2 	Nonfiling characters
//		0 - No nonfiling characters 
//		1-9 - Number of nonfiling characters  
		
//		$a - Uniform title (NR) 
//		$d - Date of treaty signing (R) 
//		$f - Date of a work (NR) 
//		$g - Miscellaneous information (NR) 
//		$h - Medium (NR) 
//		$k - Form subheading (R) 
//		$l - Language of a work (NR) 
//		$m - Medium of performance for music (R)	
//		$n - Number of part/section of a work (R) 
//		$o - Arranged statement for music (NR) 
//		$p - Name of part/section of a work (R) 
//		$r - Key for music (NR) 
//		$s - Version (NR) 
//		$0 - Authority record control number (R)
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Translation of Title by Cataloging Agency", I1);
			I1.getSons().add(CTET1);	
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "No added entry");
			full1I.put("1", "Added entry");
			TablaID1.put("242", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("0", "No nonfiling characters");
			full2I.put("1", "1 nonfiling characters");
			full2I.put("2", "2 nonfiling characters");
			full2I.put("3", "3 nonfiling characters");
			full2I.put("4", "4 nonfiling characters");
			full2I.put("5", "5 nonfiling characters");
			full2I.put("6", "6 nonfiling characters");
			full2I.put("7", "7 nonfiling characters");
			full2I.put("8", "8 nonfiling characters");
			full2I.put("9", "9 nonfiling characters");
			TablaID2.put("242", full2I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Title added entry", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("242", ID1);
			
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Nonfiling characters", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("242", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Uniform title", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType d = new CompleteTextElementType("Date of treaty signing", CTET1);
			CTET1.getSons().add(d);
			
			CompleteTextElementType f = new CompleteTextElementType("Date of a work", CTET1);
			CTET1.getSons().add(f);
			
			CompleteTextElementType g = new CompleteTextElementType("Miscellaneous information", CTET1);
			CTET1.getSons().add(g);
			
			CompleteTextElementType h = new CompleteTextElementType("Medium", CTET1);
			CTET1.getSons().add(h);
			
			CompleteTextElementType k = new CompleteTextElementType("Form subheading", CTET1);
			CTET1.getSons().add(k);
			
			CompleteTextElementType l = new CompleteTextElementType("Language of a work", CTET1);
			CTET1.getSons().add(l);
			
			CompleteTextElementType m = new CompleteTextElementType("Medium of performance for music", CTET1);
			CTET1.getSons().add(m);
			
			CompleteTextElementType n = new CompleteTextElementType("Number of part/section of a work", CTET1);
			CTET1.getSons().add(n);
			
			CompleteTextElementType o = new CompleteTextElementType("Arranged statement for music", CTET1);
			CTET1.getSons().add(o);
			
			CompleteTextElementType p = new CompleteTextElementType("Name of part/section of a work", CTET1);
			CTET1.getSons().add(p);
			
			CompleteTextElementType r = new CompleteTextElementType("Key for music", CTET1);
			CTET1.getSons().add(r);
			
			CompleteTextElementType s = new CompleteTextElementType("Version", CTET1);
			CTET1.getSons().add(s);
			
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number", CTET1);
			CTET1.getSons().add(n0);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("d", d);
			full.put("f", f);
			full.put("g", g);
			full.put("h", h);
			full.put("k", k);
			full.put("l", l);
			full.put("m", m);
			full.put("n", n);
			full.put("o", o);
			full.put("p", p);
			full.put("r", r);
			full.put("s", s);
			full.put("0", n0);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("242", full);
		}
//243 - Collective Uniform Title (NR) Full | Concise
//ID1 Uniform title printed or displayed
//		0 - Not printed or displayed 
//		1 - Printed or displayed 
//
//ID2	Second Indicator
//		Nonfiling characters
//		0-9 - Number of nonfiling characters
//
//		Subfield Codes
//		$a - Uniform title (NR) 
//		$d - Date of treaty signing (R) 
//		$f - Date of a work (NR) 
//		$g - Miscellaneous information (NR) 
//		$h - Medium (NR) 
//		$k - Form subheading (R) 
//		$l - Language of a work (NR) 
//		$m - Medium of performance for music (R) 
//		$n - Number of part/section of a work (R) 
//		$o - Arranged statement for music (NR) 
//		$p - Name of part/section of a work (R) 
//		$r - Key for music (NR) 
//		$s - Version (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Collective Uniform Title", I1);
			I1.getSons().add(CTET1);	
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Not printed or displayed");
			full1I.put("1", "Printed or displayed");
			TablaID1.put("243", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("0", "No nonfiling characters");
			full2I.put("1", "1 nonfiling characters");
			full2I.put("2", "2 nonfiling characters");
			full2I.put("3", "3 nonfiling characters");
			full2I.put("4", "4 nonfiling characters");
			full2I.put("5", "5 nonfiling characters");
			full2I.put("6", "6 nonfiling characters");
			full2I.put("7", "7 nonfiling characters");
			full2I.put("8", "8 nonfiling characters");
			full2I.put("9", "9 nonfiling characters");
			TablaID2.put("243", full2I);
			
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Uniform title printed or displayed", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("243", ID1);
			
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Nonfiling characters", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("243", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Uniform title", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType d = new CompleteTextElementType("Date of treaty signing", CTET1);
			CTET1.getSons().add(d);
			
			CompleteTextElementType f = new CompleteTextElementType("Date of a work", CTET1);
			CTET1.getSons().add(f);
			
			CompleteTextElementType g = new CompleteTextElementType("Miscellaneous information", CTET1);
			CTET1.getSons().add(g);
			
			CompleteTextElementType h = new CompleteTextElementType("Medium", CTET1);
			CTET1.getSons().add(h);
			
			CompleteTextElementType k = new CompleteTextElementType("Form subheading", CTET1);
			CTET1.getSons().add(k);
			
			CompleteTextElementType l = new CompleteTextElementType("Language of a work", CTET1);
			CTET1.getSons().add(l);
			
			CompleteTextElementType m = new CompleteTextElementType("Medium of performance for music", CTET1);
			CTET1.getSons().add(m);
			
			CompleteTextElementType n = new CompleteTextElementType("Number of part/section of a work", CTET1);
			CTET1.getSons().add(n);
			
			CompleteTextElementType o = new CompleteTextElementType("Arranged statement for music", CTET1);
			CTET1.getSons().add(o);
			
			CompleteTextElementType p = new CompleteTextElementType("Name of part/section of a work", CTET1);
			CTET1.getSons().add(p);
			
			CompleteTextElementType r = new CompleteTextElementType("Key for music", CTET1);
			CTET1.getSons().add(r);
			
			CompleteTextElementType s = new CompleteTextElementType("Version", CTET1);
			CTET1.getSons().add(s);
			
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number", CTET1);
			CTET1.getSons().add(n0);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("d", d);
			full.put("f", f);
			full.put("g", g);
			full.put("h", h);
			full.put("k", k);
			full.put("l", l);
			full.put("m", m);
			full.put("n", n);
			full.put("o", o);
			full.put("p", p);
			full.put("r", r);
			full.put("s", s);
			full.put("0", n0);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("243", full);
			
		}
//245 - Title Statement (NR) Full | Concise
//ID1 	Title added entry
//		0 - No added entry 
//		1 - Added entry 
//
//ID2	Nonfiling characters
//		0 - No nonfiling characters 
//		1-9 - Number of nonfiling characters 
//
//		Subfield Codes
//		$a - Title (NR) 
//		$b - Remainder of title (NR) 
//		$c - Statement of responsibility, etc. (NR) 
//		$f - Inclusive dates (NR) 
//		$g - Bulk dates (NR) 
//		$h - Medium (NR)
//		$k - Form (R) 
//		$n - Number of part/section of a work (R) 
//		$p - Name of part/section of a work (R) 
//		$s - Version (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Title Statement", I1);
			I1.getSons().add(CTET1);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "No added entry");
			full1I.put("1", "Added entry");
			TablaID1.put("245", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("0", "No nonfiling characters");
			full2I.put("1", "1 nonfiling characters");
			full2I.put("2", "2 nonfiling characters");
			full2I.put("3", "3 nonfiling characters");
			full2I.put("4", "4 nonfiling characters");
			full2I.put("5", "5 nonfiling characters");
			full2I.put("6", "6 nonfiling characters");
			full2I.put("7", "7 nonfiling characters");
			full2I.put("8", "8 nonfiling characters");
			full2I.put("9", "9 nonfiling characters");
			TablaID2.put("245", full2I);
			
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Title added entry", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("245", ID1);
			
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Nonfiling characters", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("245", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Title", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Remainder of title", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Remainder of titleStatement of responsibility, etc.", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType f = new CompleteTextElementType("Inclusive dates", CTET1);
			CTET1.getSons().add(f);
			
			CompleteTextElementType g = new CompleteTextElementType("Bulk dates", CTET1);
			CTET1.getSons().add(g);
			
			CompleteTextElementType h = new CompleteTextElementType("Medium", CTET1);
			CTET1.getSons().add(h);
			
			CompleteTextElementType k = new CompleteTextElementType("Form", CTET1);
			CTET1.getSons().add(k);
			
			CompleteTextElementType n = new CompleteTextElementType("Number of part/section of a work", CTET1);
			CTET1.getSons().add(n);
			
			CompleteTextElementType p = new CompleteTextElementType("Name of part/section of a work", CTET1);
			CTET1.getSons().add(p);
			
			CompleteTextElementType s = new CompleteTextElementType("Version", CTET1);
			CTET1.getSons().add(s);
			
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
			full.put("h", h);
			full.put("k", k);
			full.put("n", n);
			full.put("p", p);
			full.put("s", s);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("245", full);
		
		}
//246 - Varying Form of Title (R) Full | Concise
//ID1	Note/added entry controller
//		0 - Note, no added entry 
//		1 - Note, added entry 
//		2 - No note, no added entry 
//		3 - No note, added entry 
//
//ID2	Type of title
//		# - No type specified 
//		0 - Portion of title 
//		1 - Parallel title 
//		2 - Distinctive title 
//		3 - Other title 
//		4 - Cover title 
//		5 - Added title page title 
//		6 - Caption title 
//		7 - Running title 
//		8 - Spine title 
//
//	Subfield Codes
//	$a - Title proper/short title (NR) 
//	$b - Remainder of title (NR) 
//	$f - Date or sequential designation (NR) 
//	$g - Miscellaneous information (NR) 
//	$h - Medium (NR) 
//	$i - Display text (NR) 
//	$n - Number of part/section of a work (R) 
//	$p - Name of part/section of a work (R) 
//	$5 - Institution to which field applies (NR) 
//	$6 - Linkage (NR) 
//	$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Varying Form of Title", I1);
			I1.getSons().add(CTET1);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Note, no added entry ");
			full1I.put("1", "Note, added entry");
			full1I.put("2", "No note, no added entry");
			full1I.put("3", "No note, added entry");
			TablaID1.put("246", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("0", "Portion of title");
			full2I.put("1", "Parallel title");
			full2I.put("2", "Distinctive title");
			full2I.put("3", "Other title");
			full2I.put("4", "Cover title");
			full2I.put("5", "Added title page title");
			full2I.put("6", "Caption title");
			full2I.put("7", "Running title");
			full2I.put("8", "Spine title");
			full2I.put("#", "No type specified");
			TablaID2.put("246", full2I);
			
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Note/added entry controller", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("246", ID1);
			
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Type of title", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("246", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Title proper/short title", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Remainder of title", CTET1);
			CTET1.getSons().add(b);
		
			CompleteTextElementType f = new CompleteTextElementType("Date or sequential designation", CTET1);
			CTET1.getSons().add(f);
			
			CompleteTextElementType g = new CompleteTextElementType("Miscellaneous information", CTET1);
			CTET1.getSons().add(g);
			
			CompleteTextElementType h = new CompleteTextElementType("Medium", CTET1);
			CTET1.getSons().add(h);
			
			CompleteTextElementType i = new CompleteTextElementType("Display text", CTET1);
			CTET1.getSons().add(i);
			
			CompleteTextElementType n = new CompleteTextElementType("Number of part/section of a work", CTET1);
			CTET1.getSons().add(n);
			
			CompleteTextElementType p = new CompleteTextElementType("Name of part/section of a work", CTET1);
			CTET1.getSons().add(p);
			
			CompleteTextElementType n5 = new CompleteTextElementType("Version", CTET1);
			CTET1.getSons().add(n5);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("f", f);
			full.put("g", g);
			full.put("h", h);
			full.put("i", i);
			full.put("n", n);
			full.put("p", p);
			full.put("5", n5);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("246", full);
		}
//247 - Former Title (R) Full | Concise
//ID1 	Title added entry
//		0 - No added entry 
//		1 - Added entry 
//
//ID2	Note controller
//		0 - Display note 
//		1 - Do not display note 
//
//	Subfield Codes
//	$a - Title (NR) 
//	$b - Remainder of title (NR) 
//	$f - Date or sequential designation (NR) 
//	$g - Miscellaneous information (NR) 
//	$h - Medium (NR) 
//	$n - Number of part/section of a work (R) 
//	$p - Name of part/section of a work (R) 
//	$x - International Standard Serial Number (NR) 
//	$6 - Linkage (NR) 
//	$8 - Field link and sequence number (R)  
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Former Title", I1);
			I1.getSons().add(CTET1);	
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "No added entry");
			full1I.put("1", "Added entry");
			TablaID1.put("247", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("0", "Display note");
			full2I.put("1", "Do not display note");
			TablaID2.put("247", full2I);
			
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Title added entry", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("247", ID1);
			
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Note controller", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("247", ID2);

			CompleteTextElementType a = new CompleteTextElementType("Title", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Remainder of title", CTET1);
			CTET1.getSons().add(b);
		
			CompleteTextElementType f = new CompleteTextElementType("Date or sequential designation", CTET1);
			CTET1.getSons().add(f);
			
			CompleteTextElementType g = new CompleteTextElementType("Miscellaneous information", CTET1);
			CTET1.getSons().add(g);
			
			CompleteTextElementType h = new CompleteTextElementType("Medium", CTET1);
			CTET1.getSons().add(h);
			
			CompleteTextElementType n = new CompleteTextElementType("Number of part/section of a work", CTET1);
			CTET1.getSons().add(n);
			
			CompleteTextElementType p = new CompleteTextElementType("Name of part/section of a work", CTET1);
			CTET1.getSons().add(p);
			
			CompleteTextElementType x = new CompleteTextElementType("International Standard Serial Number", CTET1);
			CTET1.getSons().add(x);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("f", f);
			full.put("g", g);
			full.put("h", h);
			full.put("n", n);
			full.put("p", p);
			full.put("x", x);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("247", full);
		}
		
//250 - Edition Statement (R)  Full | Concise
//		$a - Edition statement (NR)
//		$b - Remainder of edition statement (NR)
//		$3 - Materials specified (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Edition Statement", I1);
			I1.getSons().add(CTET1);	
			
			CompleteTextElementType a = new CompleteTextElementType("Edition statement", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Remainder of edition statement", CTET1);
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
			TablaD.put("250", full);
		}
//254 - Musical Presentation Statement (NR)  Full | Concise
//		$a - Musical presentation statement (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Musical Presentation Statement", I1);
			I1.getSons().add(CTET1);	
			
			CompleteTextElementType a = new CompleteTextElementType("Musical presentation statement", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("254", full);
		}
//255 - Cartographic Mathematical Data (R)  Full | Concise
//		$a - Statement of scale (NR) 
//		$b - Statement of projection (NR) 
//		$c - Statement of coordinates (NR) 
//		$d - Statement of zone (NR) 
//		$e - Statement of equinox (NR) 
//		$f - Outer G-ring coordinate pairs (NR) 
//		$g - Exclusion G-ring coordinate pairs (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Cartographic Mathematical Data", I1);
			I1.getSons().add(CTET1);	
			
			
			CompleteTextElementType a = new CompleteTextElementType("Statement of scale", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Statement of projection", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Statement of coordinates", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType d = new CompleteTextElementType("Statement of zone", CTET1);
			CTET1.getSons().add(d);
			
			CompleteTextElementType e = new CompleteTextElementType("Statement of equinox", CTET1);
			CTET1.getSons().add(e);
			
			CompleteTextElementType f = new CompleteTextElementType("Outer G-ring coordinate pairs", CTET1);
			CTET1.getSons().add(f);
			
			CompleteTextElementType g = new CompleteTextElementType("Exclusion G-ring coordinate pairs", CTET1);
			CTET1.getSons().add(g);
			
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
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("255", full);
		}
//256 - Computer File Characteristics (NR)  Full | Concise
//		$a - Computer file characteristics (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteTextElementType CTET1=new CompleteTextElementType("Computer File Characteristics", I1);
			I1.getSons().add(CTET1);	
			
			CompleteTextElementType a = new CompleteTextElementType("Computer file characteristics", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("256", full);
		}
//		257 - Country of Producing Entity (R)  Full | Concise
//		$a - Country of producing entity (R)
//		$2 - Source (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Country of Producing Entity", I1);
			I1.getSons().add(CTET1);	
			
			CompleteTextElementType a = new CompleteTextElementType("Country of producing entity", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
			CTET1.getSons().add(n2);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("2", n2);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("256", full);
		}
//		258 - Philatelic Issue Data (R)  Full | Concise
//		$a - Issuing jurisdiction (NR) 
//		$b - Denomination (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Philatelic Issue Data", I1);
			I1.getSons().add(CTET1);	
			
			CompleteTextElementType a = new CompleteTextElementType("Issuing jurisdiction", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Denomination", CTET1);
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
			TablaD.put("258", full);
		}
//260 - Publication, Distribution, etc. (Imprint) (R)  Full | Concise
//ID1 Sequence of publishing statements
//		# - Not applicable/No information provided/Earliest available publisher
//		2 - Intervening publisher
//		3 - Current/latest publisher
//
//	Subfield Codes
//	$a - Place of publication, distribution, etc. (R)
//	$b - Name of publisher, distributor, etc. (R)
//	$c - Date of publication, distribution, etc. (R)
//	$e - Place of manufacture (R)
//	$f - Manufacturer (R)
//	$g - Date of manufacture (R)
//	$3 - Materials specified (NR)
//	$6 - Linkage (NR)
//	$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Publication, Distribution, etc.", I1);
			I1.getSons().add(CTET1);	
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "Not applicable/No information provided/Earliest available publisher");
			full1I.put("2", "Intervening publisher");
			full1I.put("3", "Current/latest publisher");
			TablaID1.put("260", full1I);
			
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Sequence of publishing statements", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("260", ID1);
	
			
			CompleteTextElementType a = new CompleteTextElementType("Place of publication, distribution, etc.", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Name of publisher, distributor, etc.", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Date of publication, distribution, etc.", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType e = new CompleteTextElementType("Place of manufacture", CTET1);
			CTET1.getSons().add(e);
			
			CompleteTextElementType f = new CompleteTextElementType("Manufacturer", CTET1);
			CTET1.getSons().add(f);
			
			CompleteTextElementType g = new CompleteTextElementType("Date of manufacture", CTET1);
			CTET1.getSons().add(g);
						
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
			full.put("e", e);
			full.put("f", f);
			full.put("g", g);
			full.put("3", n3);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("260", full);
		}
//		263 - Projected Publication Date (NR)  Full | Concise
//		$a - Projected publication date (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Projected Publication Date", I1);
			I1.getSons().add(CTET1);	
			
			CompleteTextElementType a = new CompleteTextElementType("Projected publication date", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("263", full);
		}
//		264 - Production, Publication, Distribution, Manufacture, and Copyright Notice (R)  Full | Concise
//ID1 	Sequence of statements
//		# - Not applicable/No information provided/Earliest
//		2 - Intervening
//		3 - Current/latest
//
//ID2	Function of entity
//		0 - Production
//		1 - Publication
//		2 - Distribution
//		3 - Manufacture
//		4 - Copyright notice date
//
//	Subfield Codes
//	$a - Place of production, publication, distribution, manufacture (R)
//	$b - Name of producer, publisher, distributor, manufacturer (R)
//	$c - Date of production, publication, distribution, manufacture, or copyright notice (R)
//	$3 - Materials specified (NR)
//	$6 - Linkage (NR)
//	$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Production, Publication, Distribution, Manufacture, and Copyright Notice", I1);
			I1.getSons().add(CTET1);	
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "Not applicable/No information provided/Earliest");
			full1I.put("2", "Intervening");
			full1I.put("3", "Current/latest");
			TablaID1.put("264", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("0", "Production");
			full2I.put("1", "Publication");
			full2I.put("2", "Distribution");
			full2I.put("3", "Manufacture");
			full2I.put("4", "Copyright notice date");
			TablaID2.put("264", full2I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Sequence of statements", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("264", ID1);
			
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Function of entity", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("264", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Place of production, publication, distribution, manufacture", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Name of producer, publisher, distributor, manufacturer", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Date of production, publication, distribution, manufacture, or copyright notice", CTET1);
			CTET1.getSons().add(c);
			
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
			full.put("3", n3);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("264", full);
		}
//270 - Address (R)  Full | Concise
//ID1 Level
//		# - No level specified 
//		1 - Primary 
//		2 - Secondary 
//
//ID2	Type of address
//		# - No type specified 
//		0 - Mailing 
//		7 - Type specified in subfield $i 
//
//	Subfield Codes
//	$a - Address (R) 
//	$b - City (NR) 
//	$c - State or province (NR) 
//	$d - Country (NR) 
//	$e - Postal code (NR) 
//	$f - Terms preceding attention name (NR) 
//	$g - Attention name (NR) 
//	$h - Attention position (NR) 
//	$i - Type of address (NR) 
//	$j - Specialized telephone number (R) 
//	$k - Telephone number (R) 
//	$l - Fax number (R) 
//	$m - Electronic mail address (R) 
//	$n - TDD or TTY number (R) 
//	$p - Contact person (R) 
//	$q - Title of contact person (R) 
//	$r - Hours (R) 
//	$z - Public note (R) 
//	$4 - Relator code (R) 
//	$6 - Linkage (NR) 
//	$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Address", I1);
			I1.getSons().add(CTET1);	
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "No level specified");
			full1I.put("1", "Primary");
			full1I.put("2", "Secondary");
			TablaID1.put("270", full1I);
			
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("#", "No type specified");
			full2I.put("0", "Mailing");
			full2I.put("7", "Type specified in subfield 'Type of address' ");
			TablaID2.put("270", full2I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Level", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("270", ID1);
			
			
			CompleteTextElementType ID2 = new CompleteTextElementType("Type of address", CTET1);
			CTET1.getSons().add(ID2);
			
			TablaD2.put("270", ID2);
			
			CompleteTextElementType a = new CompleteTextElementType("Address", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("City", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("State or province", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType d = new CompleteTextElementType("Country", CTET1);
			CTET1.getSons().add(d);
			
			CompleteTextElementType e = new CompleteTextElementType("Postal code", CTET1);
			CTET1.getSons().add(e);
			
			CompleteTextElementType f = new CompleteTextElementType("Terms preceding attention name", CTET1);
			CTET1.getSons().add(f);
			
			CompleteTextElementType g = new CompleteTextElementType("Attention name", CTET1);
			CTET1.getSons().add(g);
			
			CompleteTextElementType h = new CompleteTextElementType("Attention position", CTET1);
			CTET1.getSons().add(h);
			
			CompleteTextElementType i = new CompleteTextElementType("Type of address", CTET1);
			CTET1.getSons().add(i);
			
			CompleteTextElementType j = new CompleteTextElementType("Specialized telephone number", CTET1);
			CTET1.getSons().add(j);
			
			CompleteTextElementType k = new CompleteTextElementType("Telephone number", CTET1);
			CTET1.getSons().add(k);
			
			CompleteTextElementType l = new CompleteTextElementType("Fax number", CTET1);
			CTET1.getSons().add(l);
			
			CompleteTextElementType m = new CompleteTextElementType("Electronic mail address", CTET1);
			CTET1.getSons().add(m);
			
			CompleteTextElementType n = new CompleteTextElementType("TDD or TTY number", CTET1);
			CTET1.getSons().add(n);
			
			CompleteTextElementType p = new CompleteTextElementType("Contact person", CTET1);
			CTET1.getSons().add(p);
			
			CompleteTextElementType q = new CompleteTextElementType("Title of contact person", CTET1);
			CTET1.getSons().add(q);
			
			CompleteTextElementType r = new CompleteTextElementType("Hours", CTET1);
			CTET1.getSons().add(r);
				
			CompleteTextElementType z = new CompleteTextElementType("Public note ", CTET1);
			CTET1.getSons().add(z);
			
			CompleteTextElementType n4 = new CompleteTextElementType("Relator code", CTET1);
			CTET1.getSons().add(n4);
			
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
			full.put("i", i);
			full.put("j", j);
			full.put("k", k);
			full.put("l", l);
			full.put("m", m);
			full.put("n", n);
			full.put("p", p);
			full.put("q", q);
			full.put("r", r);
			full.put("z", z);
			full.put("4", n4);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("270", full);
		}
	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessInstances()
	 */
	@Override
	public void ProcessInstances() {
		// Auto-generated method stub

	}

}
