/**
 * 
 */
package fdi.ucm.server.importparser.marcxml.structures.control;

import java.util.HashMap;

import fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteElementType;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteIterator;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteLinkElementType;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteTextElementType;

/**
 * @author Joaquin Gayoso-Cabada
 *
 */
public class S1XX implements InterfaceMARCXMLparser {
	
	private CompleteElementType Datos;
	private HashMap<String, HashMap<String, CompleteTextElementType>> TablaD;
	private HashMap<String, HashMap<String, String>> TablaID1;
	private HashMap<String, CompleteTextElementType> TablaD1;
	private CompleteLinkElementType X100;

	public S1XX(CompleteElementType datos,
			HashMap<String, HashMap<String, CompleteTextElementType>> tablaD,
			HashMap<String, HashMap<String, String>> tablaID1,
			HashMap<String, HashMap<String, String>> tablaID2,
			HashMap<String, CompleteTextElementType> tablaD1,
			HashMap<String, CompleteTextElementType> tablaD2) {
		Datos=datos;
		TablaD=tablaD;
		TablaID1=tablaID1;
		TablaD1=tablaD1;
	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessAttributes()
	 */
	@Override
	public void ProcessAttributes() {
		
//100 - Main Entry - Personal Name (NR) Full | Concise
//ID1 Type of personal name entry element
//		0 - Forename 
//		1 - Surname 
//		3 - Family name 
		
//		$a - Personal name (NR) 
//		$b - Numeration (NR) 
//		$c - Titles and words associated with a name (R) 
//		$d - Dates associated with a name (NR) 
//		$e - Relator term (R) 
//		$f - Date of a work (NR) 
//		$g - Miscellaneous information (NR) 
//		$j - Attribution qualifier (R) 
//		$k - Form subheading (R) 
//		$l - Language of a work (NR)	
//		$n - Number of part/section of a work (R) 
//		$p - Name of part/section of a work (R) 
//		$q - Fuller form of name (NR) 
//		$t - Title of a work (NR) 
//		$u - Affiliation (NR) 
//		$0 - Authority record control number (R)
//		$4 - Relator code (R) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R)

		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			X100=new CompleteLinkElementType("Personal Name", I1);
			I1.getSons().add(X100);
			
			
			
			
			
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Forename");
			full1I.put("1", "Surname");
			full1I.put("3", "Family name");
			TablaID1.put("100", full1I);
			
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Type of personal name entry element", X100);
			X100.getSons().add(ID1);
			
			TablaD1.put("100", ID1);
			
			
			CompleteTextElementType a = new CompleteTextElementType("Personal name", X100);
			X100.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Numeration", X100);
			X100.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Titles and words associated with a name", X100);
			X100.getSons().add(c);
			
			CompleteTextElementType d = new CompleteTextElementType("Dates associated with a name", X100);
			X100.getSons().add(d);
			
			CompleteTextElementType e = new CompleteTextElementType("Relator term", X100);
			X100.getSons().add(e);
			
			CompleteTextElementType f = new CompleteTextElementType("Date of a work", X100);
			X100.getSons().add(f);
			
			CompleteTextElementType g = new CompleteTextElementType("Miscellaneous information", X100);
			X100.getSons().add(g);
			
			CompleteTextElementType j = new CompleteTextElementType("Attribution qualifier", X100);
			X100.getSons().add(j);
			
			CompleteTextElementType k = new CompleteTextElementType("Form subheading", X100);
			X100.getSons().add(k);
			
			CompleteTextElementType l = new CompleteTextElementType("Language of a work", X100);
			X100.getSons().add(l);
			
			CompleteTextElementType n = new CompleteTextElementType("Number of part/section of a work", X100);
			X100.getSons().add(n);
			
			CompleteTextElementType p = new CompleteTextElementType("Name of part/section of a work", X100);
			X100.getSons().add(p);
			
			CompleteTextElementType q = new CompleteTextElementType("Fuller form of name", X100);
			X100.getSons().add(q);
			
			CompleteTextElementType t = new CompleteTextElementType("Title of a work", X100);
			X100.getSons().add(t);
			
			CompleteTextElementType u = new CompleteTextElementType("Affiliation", X100);
			X100.getSons().add(u);
			
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number", X100);
			X100.getSons().add(n0);
			
			CompleteTextElementType n4 = new CompleteTextElementType("Relator code", X100);
			X100.getSons().add(n4);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", X100);
			X100.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", X100);
			X100.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("b", b);
			full.put("c", c);
			full.put("d", d);
			full.put("e", e);
			full.put("f", f);
			full.put("g", g);
			full.put("j", j);
			full.put("k", k);
			full.put("l", l);
			full.put("n", n);
			full.put("p", p);
			full.put("q", q);
			full.put("t", t);
			full.put("u", u);
			full.put("0", n0);
			full.put("4", n4);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("100", full);
			
		}
//110 - Main Entry - Corporate Name (NR) Full | Concise
//ID1	Type of corporate name entry element
//		0 - Inverted name
//		1 - Jurisdiction name
//		2 - Name in direct order
		
//		$a - Corporate name or jurisdiction name as entry element (NR)
//		$b - Subordinate unit (R)
//		$c - Location of meeting (R)
//		$d - Date of meeting or treaty signing (R)
//		$e - Relator term (R)
//		$f - Date of a work (NR)
//		$g - Miscellaneous information (NR)
//		$k - Form subheading (R)
//		$l - Language of a work (NR)
//		$n - Number of part/section/meeting (R)
//		$p - Name of part/section of a work (R)
//		$t - Title of a work (NR)
//		$u - Affiliation (NR)
//		$0 - Authority record control number or standard number (R)
//		$4 - Relator code (R)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Corporate Name", I1);
			I1.getSons().add(CTET1);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Inverted name");
			full1I.put("1", "Jurisdiction name");
			full1I.put("2", "Name in direct order");
			TablaID1.put("110", full1I);
			
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Type of corporate name entry element", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("110", ID1);
			
			
			CompleteTextElementType a = new CompleteTextElementType("Corporate name or jurisdiction name as entry element", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType b = new CompleteTextElementType("Subordinate unit", CTET1);
			CTET1.getSons().add(b);
			
			CompleteTextElementType c = new CompleteTextElementType("Location of meeting", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType d = new CompleteTextElementType("Date of meeting or treaty signing", CTET1);
			CTET1.getSons().add(d);
			
			CompleteTextElementType e = new CompleteTextElementType("Relator term", CTET1);
			CTET1.getSons().add(e);
			
			CompleteTextElementType f = new CompleteTextElementType("Date of a work", CTET1);
			CTET1.getSons().add(f);
			
			CompleteTextElementType g = new CompleteTextElementType("Miscellaneous information", CTET1);
			CTET1.getSons().add(g);
			
			CompleteTextElementType k = new CompleteTextElementType("Form subheading", CTET1);
			CTET1.getSons().add(k);
			
			CompleteTextElementType l = new CompleteTextElementType("Language of a work", CTET1);
			CTET1.getSons().add(l);
			
			CompleteTextElementType n = new CompleteTextElementType("Number of part/section/meeting", CTET1);
			CTET1.getSons().add(n);
			
			CompleteTextElementType p = new CompleteTextElementType("Name of part/section of a work", CTET1);
			CTET1.getSons().add(p);
			
			CompleteTextElementType t = new CompleteTextElementType("Title of a work", CTET1);
			CTET1.getSons().add(t);
			
			CompleteTextElementType u = new CompleteTextElementType("Affiliation", CTET1);
			CTET1.getSons().add(u);
			
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number or standard number ", CTET1);
			CTET1.getSons().add(n0);
			
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
			full.put("k", k);
			full.put("l", l);
			full.put("n", n);
			full.put("p", p);
			full.put("t", t);
			full.put("u", u);
			full.put("0", n0);
			full.put("4", n4);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("110", full);
			
		}
//111 - Main Entry - Meeting Name (NR) Full | Concise
//ID1	Type of meeting name entry element
//		0 - Inverted name
//		1 - Jurisdiction name
//		2 - Name in direct order
		
//		$a - Meeting name or jurisdiction name as entry element (NR)
//		$c - Location of meeting (R)
//		$d - Date of meeting (NR)
//		$e - Subordinate unit (R)
//		$f - Date of a work (NR)
//		$g - Miscellaneous information (NR)
//		$j - Relator term (R)
//		$k - Form subheading (R)
//		$l - Language of a work (NR)
//		$n - Number of part/section/meeting (R)
//		$p - Name of part/section of a work (R)
//		$q - Name of meeting following jurisdiction name entry element (NR)
//		$t - Title of a work (NR)
//		$u - Affiliation (NR)
//		$0 - Authority record control number or standard number (R)
//		$4 - Relator code (R)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Meeting Name", I1);
			I1.getSons().add(CTET1);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Inverted name");
			full1I.put("1", "Jurisdiction name");
			full1I.put("2", "Name in direct order");
			TablaID1.put("111", full1I);
			
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Type of meeting name entry element", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("111", ID1);
			
			CompleteTextElementType a = new CompleteTextElementType("Meeting name or jurisdiction name as entry element", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType c = new CompleteTextElementType("Location of meeting", CTET1);
			CTET1.getSons().add(c);
			
			CompleteTextElementType d = new CompleteTextElementType("Date of meeting", CTET1);
			CTET1.getSons().add(d);
			
			CompleteTextElementType e = new CompleteTextElementType("Subordinate unit", CTET1);
			CTET1.getSons().add(e);
			
			CompleteTextElementType f = new CompleteTextElementType("Date of a work", CTET1);
			CTET1.getSons().add(f);
			
			CompleteTextElementType g = new CompleteTextElementType("Miscellaneous information", CTET1);
			CTET1.getSons().add(g);
			
			CompleteTextElementType j = new CompleteTextElementType("Relator term", CTET1);
			CTET1.getSons().add(j);
			
			CompleteTextElementType k = new CompleteTextElementType("Form subheading", CTET1);
			CTET1.getSons().add(k);
			
			CompleteTextElementType l = new CompleteTextElementType("Language of a work", CTET1);
			CTET1.getSons().add(l);
			
			CompleteTextElementType n = new CompleteTextElementType("Number of part/section/meeting", CTET1);
			CTET1.getSons().add(n);
			
			CompleteTextElementType p = new CompleteTextElementType("Name of part/section of a work", CTET1);
			CTET1.getSons().add(p);
			
			CompleteTextElementType q = new CompleteTextElementType("Name of meeting following jurisdiction name entry element", CTET1);
			CTET1.getSons().add(q);
			
			CompleteTextElementType t = new CompleteTextElementType("Title of a work", CTET1);
			CTET1.getSons().add(t);
			
			CompleteTextElementType u = new CompleteTextElementType("Affiliation", CTET1);
			CTET1.getSons().add(u);
			
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number or standard number", CTET1);
			CTET1.getSons().add(n0);
			
			CompleteTextElementType n4 = new CompleteTextElementType("Relator code", CTET1);
			CTET1.getSons().add(n4);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("c", c);
			full.put("d", d);
			full.put("e", e);
			full.put("f", f);
			full.put("g", g);
			full.put("j", j);
			full.put("k", k);
			full.put("l", l);
			full.put("n", n);
			full.put("p", p);
			full.put("q", q);
			full.put("t", t);
			full.put("u", u);
			full.put("0", n0);
			full.put("4", n4);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("111", full);
			
		}
//130 - Main Entry - Uniform Title (NR) Full | Concise
//ID1	Nonfiling characters
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
//		$t - Title of a work (NR) 
//		$0 - Authority record control number (R)
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Uniform Title", I1);
			I1.getSons().add(CTET1);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("1", "1");
			full1I.put("2", "2");
			full1I.put("3", "3");
			full1I.put("4", "4");
			full1I.put("5", "5");
			full1I.put("6", "6");
			full1I.put("7", "7");
			full1I.put("8", "8");
			full1I.put("9", "9");
			TablaID1.put("130", full1I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Number of nonfiling characters", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("130", ID1);
			
			
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
			
			CompleteTextElementType t = new CompleteTextElementType("Title of a work", CTET1);
			CTET1.getSons().add(t);
			
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
			full.put("t", t);
		
			full.put("0", n0);

			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("130", full);
			
		}

		

	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessInstances()
	 */
	@Override
	public void ProcessInstances() {
		// se hace en otro metodo

	}

	/**
	 * @return the x100
	 */
	public CompleteLinkElementType getX100() {
		return X100;
	}

	/**
	 * @param x100 the x100 to set
	 */
	public void setX100(CompleteLinkElementType x100) {
		X100 = x100;
	}
	
	

}
