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
public class S8XX implements InterfaceMARCXMLparser {
	
	private CompleteElementType Datos;
	private HashMap<String, HashMap<String, CompleteTextElementType>> TablaD;
	private HashMap<String, HashMap<String, String>> TablaID1;
	private HashMap<String, CompleteTextElementType> TablaD1;
	private HashMap<String, HashMap<String, String>> TablaID2;
	private HashMap<String, CompleteTextElementType> TablaD2;
	private HashMap<String, String> full1I;
	private HashMap<String, CompleteTextElementType> TablaDR;


	public S8XX(CompleteElementType datos,
			HashMap<String, HashMap<String, CompleteTextElementType>> tablaD,
			HashMap<String, HashMap<String, String>> tablaID1,
			HashMap<String, HashMap<String, String>> tablaID2,
			HashMap<String, CompleteTextElementType> tablaD1,
			HashMap<String, CompleteTextElementType> tablaD2) {
		Datos=datos;
		TablaD=tablaD;
		TablaID1=tablaID1;
		TablaD1=tablaD1;
		TablaID2=tablaID2;
		TablaD2=tablaD2;
		full1I = new HashMap<String, String>();
		full1I.put("0", "Personal name");
		full1I.put("1", "Corporate name");
		TablaDR=new HashMap<String, CompleteTextElementType>();
	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessAttributes()
	 */
	@Override
	public void ProcessAttributes() {
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			String Iden="800";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Series Added Entry - Personal Name", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Type of personal name entry element", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Forename");
			full1I.put("1", "Surname");
			full1I.put("3", "Family name");
			TablaID1.put(Iden, full1I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Personal name", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Numeration", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType c = new CompleteTextElementType("Titles and other words associated with a name", CTET1);
			CTET1.getSons().add(c);
			full.put("c", c);
			CompleteTextElementType d = new CompleteTextElementType("Dates associated with a name", CTET1);
			CTET1.getSons().add(d);
			full.put("d", d);
			CompleteTextElementType e = new CompleteTextElementType("Relator term", CTET1);
			CTET1.getSons().add(e);
			full.put("e", e);
			CompleteTextElementType f = new CompleteTextElementType("Date of a work", CTET1);
			CTET1.getSons().add(f);
			full.put("f", f);
			CompleteTextElementType g = new CompleteTextElementType("Miscellaneous information", CTET1);
			CTET1.getSons().add(g);
			full.put("g", g);
			CompleteTextElementType h = new CompleteTextElementType("Medium", CTET1);
			CTET1.getSons().add(h);
			full.put("h", h);
			CompleteTextElementType j = new CompleteTextElementType("Attribution qualifier", CTET1);
			CTET1.getSons().add(j);
			full.put("j", j);
			CompleteTextElementType k = new CompleteTextElementType("Form subheading", CTET1);
			CTET1.getSons().add(k);
			full.put("k", k);
			CompleteTextElementType l = new CompleteTextElementType("Language of a work", CTET1);
			CTET1.getSons().add(l);
			full.put("l", l);
			CompleteTextElementType m = new CompleteTextElementType("Medium of performance for music", CTET1);
			CTET1.getSons().add(m);
			full.put("m", m);
			CompleteTextElementType n = new CompleteTextElementType("Number of part/section of a work", CTET1);
			CTET1.getSons().add(n);
			full.put("n", n);
			CompleteTextElementType o = new CompleteTextElementType("Arranged statement for music", CTET1);
			CTET1.getSons().add(o);
			full.put("o", o);
			CompleteTextElementType p = new CompleteTextElementType("Name of part/section of a work", CTET1);
			CTET1.getSons().add(p);
			full.put("p", p);
			CompleteTextElementType q = new CompleteTextElementType("Fuller form of name", CTET1);
			CTET1.getSons().add(q);
			full.put("q", q);
			CompleteTextElementType r = new CompleteTextElementType("Key for music", CTET1);
			CTET1.getSons().add(r);
			full.put("r", r);
			CompleteTextElementType s = new CompleteTextElementType("Version", CTET1);
			CTET1.getSons().add(s);
			full.put("s", s);
			CompleteTextElementType t = new CompleteTextElementType("Title of a work", CTET1);
			CTET1.getSons().add(t);
			full.put("t", t);
			CompleteTextElementType u = new CompleteTextElementType("Affiliation", CTET1);
			CTET1.getSons().add(u);
			full.put("u", u);
			CompleteTextElementType v = new CompleteTextElementType("Volume/sequential designation", CTET1);
			CTET1.getSons().add(v);
			full.put("v", v);
			CompleteTextElementType w = new CompleteTextElementType("Bibliographic record control number", CTET1);
			CTET1.getSons().add(w);
			full.put("w", w);
			CompleteTextElementType x = new CompleteTextElementType("International Standard Serial Number", CTET1);
			CTET1.getSons().add(x);
			full.put("x", x);
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number", CTET1);
			CTET1.getSons().add(n0);
			full.put("0", n0);
			CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
			CTET1.getSons().add(n3);
			full.put("3", n3);
			CompleteTextElementType n4 = new CompleteTextElementType("Relator code", CTET1);
			CTET1.getSons().add(n4);
			full.put("4", n4);
			CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
			CTET1.getSons().add(n5);
			full.put("5", n5);
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			full.put("6", n6);
			CompleteTextElementType n7 = new CompleteTextElementType("Control subfield", CTET1);
			CTET1.getSons().add(n7);
			full.put("7", n7);
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			full.put("8", n8);
			TablaD.put(Iden, full);
			}
			{
			CompleteIterator I1=new CompleteIterator(Datos);
			String Iden="810";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Series Added Entry - Corporate Name", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Type of corporate name entry element", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Inverted name");
			full1I.put("1", "Jurisdiction name");
			full1I.put("2", "Name in direct order");
			TablaID1.put(Iden, full1I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Corporate name or jurisdiction name as entry element", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Subordinate unit", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType c = new CompleteTextElementType("Location of meeting", CTET1);
			CTET1.getSons().add(c);
			full.put("c", c);
			CompleteTextElementType d = new CompleteTextElementType("Date of meeting or treaty signing", CTET1);
			CTET1.getSons().add(d);
			full.put("d", d);
			CompleteTextElementType e = new CompleteTextElementType("Relator term", CTET1);
			CTET1.getSons().add(e);
			full.put("e", e);
			CompleteTextElementType f = new CompleteTextElementType("Date of a work", CTET1);
			CTET1.getSons().add(f);
			full.put("f", f);
			CompleteTextElementType g = new CompleteTextElementType("Miscellaneous information", CTET1);
			CTET1.getSons().add(g);
			full.put("g", g);
			CompleteTextElementType h = new CompleteTextElementType("Medium", CTET1);
			CTET1.getSons().add(h);
			full.put("h", h);
			CompleteTextElementType k = new CompleteTextElementType("Form subheading", CTET1);
			CTET1.getSons().add(k);
			full.put("k", k);
			CompleteTextElementType l = new CompleteTextElementType("Language of a work", CTET1);
			CTET1.getSons().add(l);
			full.put("l", l);
			CompleteTextElementType m = new CompleteTextElementType("Medium of performance for music", CTET1);
			CTET1.getSons().add(m);
			full.put("m", m);
			CompleteTextElementType n = new CompleteTextElementType("Number of part/section/meeting", CTET1);
			CTET1.getSons().add(n);
			full.put("n", n);
			CompleteTextElementType o = new CompleteTextElementType("Arranged statement for music", CTET1);
			CTET1.getSons().add(o);
			full.put("o", o);
			CompleteTextElementType p = new CompleteTextElementType("Name of part/section of a work", CTET1);
			CTET1.getSons().add(p);
			full.put("p", p);
			CompleteTextElementType r = new CompleteTextElementType("Key for music", CTET1);
			CTET1.getSons().add(r);
			full.put("r", r);
			CompleteTextElementType s = new CompleteTextElementType("Version", CTET1);
			CTET1.getSons().add(s);
			full.put("s", s);
			CompleteTextElementType t = new CompleteTextElementType("Title of a work", CTET1);
			CTET1.getSons().add(t);
			full.put("t", t);
			CompleteTextElementType u = new CompleteTextElementType("Affiliation", CTET1);
			CTET1.getSons().add(u);
			full.put("u", u);
			CompleteTextElementType v = new CompleteTextElementType("Volume/sequential designation", CTET1);
			CTET1.getSons().add(v);
			full.put("v", v);
			CompleteTextElementType w = new CompleteTextElementType("Bibliographic record control number", CTET1);
			CTET1.getSons().add(w);
			full.put("w", w);
			CompleteTextElementType x = new CompleteTextElementType("International Standard Serial Number", CTET1);
			CTET1.getSons().add(x);
			full.put("x", x);
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number or standard number", CTET1);
			CTET1.getSons().add(n0);
			full.put("0", n0);
			CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
			CTET1.getSons().add(n3);
			full.put("3", n3);
			CompleteTextElementType n4 = new CompleteTextElementType("Relator code", CTET1);
			CTET1.getSons().add(n4);
			full.put("4", n4);
			CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
			CTET1.getSons().add(n5);
			full.put("5", n5);
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			full.put("6", n6);
			CompleteTextElementType n7 = new CompleteTextElementType("Control subfield", CTET1);
			CTET1.getSons().add(n7);
			full.put("7", n7);
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			full.put("8", n8);
			TablaD.put(Iden, full);
			}
			{
			CompleteIterator I1=new CompleteIterator(Datos);
			String Iden="811";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Series Added Entry - Meeting Name", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Type of meeting name entry element", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Inverted name");
			full1I.put("1", "Jurisdiction name");
			full1I.put("2", "Name in direct order");
			TablaID1.put(Iden, full1I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Meeting name or jurisdiction name as entry element", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType c = new CompleteTextElementType("Location of meeting", CTET1);
			CTET1.getSons().add(c);
			full.put("c", c);
			CompleteTextElementType d = new CompleteTextElementType("Date of meeting", CTET1);
			CTET1.getSons().add(d);
			full.put("d", d);
			CompleteTextElementType e = new CompleteTextElementType("Subordinate unit", CTET1);
			CTET1.getSons().add(e);
			full.put("e", e);
			CompleteTextElementType f = new CompleteTextElementType("Date of a work", CTET1);
			CTET1.getSons().add(f);
			full.put("f", f);
			CompleteTextElementType g = new CompleteTextElementType("Miscellaneous information", CTET1);
			CTET1.getSons().add(g);
			full.put("g", g);
			CompleteTextElementType h = new CompleteTextElementType("Medium", CTET1);
			CTET1.getSons().add(h);
			full.put("h", h);
			CompleteTextElementType j = new CompleteTextElementType("Relator term", CTET1);
			CTET1.getSons().add(j);
			full.put("j", j);
			CompleteTextElementType k = new CompleteTextElementType("Form subheading", CTET1);
			CTET1.getSons().add(k);
			full.put("k", k);
			CompleteTextElementType l = new CompleteTextElementType("Language of a work", CTET1);
			CTET1.getSons().add(l);
			full.put("l", l);
			CompleteTextElementType n = new CompleteTextElementType("Number of part/section/meeting", CTET1);
			CTET1.getSons().add(n);
			full.put("n", n);
			CompleteTextElementType p = new CompleteTextElementType("Name of part/section of a work", CTET1);
			CTET1.getSons().add(p);
			full.put("p", p);
			CompleteTextElementType q = new CompleteTextElementType("Name of meeting following jurisdiction name entry element", CTET1);
			CTET1.getSons().add(q);
			full.put("q", q);
			CompleteTextElementType s = new CompleteTextElementType("Version", CTET1);
			CTET1.getSons().add(s);
			full.put("s", s);
			CompleteTextElementType t = new CompleteTextElementType("Title of a work", CTET1);
			CTET1.getSons().add(t);
			full.put("t", t);
			CompleteTextElementType u = new CompleteTextElementType("Affiliation", CTET1);
			CTET1.getSons().add(u);
			full.put("u", u);
			CompleteTextElementType v = new CompleteTextElementType("Volume/sequential designation", CTET1);
			CTET1.getSons().add(v);
			full.put("v", v);
			CompleteTextElementType w = new CompleteTextElementType("Bibliographic record control number", CTET1);
			CTET1.getSons().add(w);
			full.put("w", w);
			CompleteTextElementType x = new CompleteTextElementType("International Standard Serial Number", CTET1);
			CTET1.getSons().add(x);
			full.put("x", x);
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number or standard number", CTET1);
			CTET1.getSons().add(n0);
			full.put("0", n0);
			CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
			CTET1.getSons().add(n3);
			full.put("3", n3);
			CompleteTextElementType n4 = new CompleteTextElementType("Relator code", CTET1);
			CTET1.getSons().add(n4);
			full.put("4", n4);
			CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
			CTET1.getSons().add(n5);
			full.put("5", n5);
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			full.put("6", n6);
			CompleteTextElementType n7 = new CompleteTextElementType("Control subfield", CTET1);
			CTET1.getSons().add(n7);
			full.put("7", n7);
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			full.put("8", n8);
			TablaD.put(Iden, full);
			}
			{
			CompleteIterator I1=new CompleteIterator(Datos);
			String Iden="830";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Series Added Entry - Uniform Title", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID2 = new CompleteTextElementType("Nonfiling characters", CTET1);
			CTET1.getSons().add(ID2);
			TablaD2.put(Iden, ID2);
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
			TablaID2.put(Iden, full2I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Uniform title", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType d = new CompleteTextElementType("Date of treaty signing", CTET1);
			CTET1.getSons().add(d);
			full.put("d", d);
			CompleteTextElementType f = new CompleteTextElementType("Date of a work", CTET1);
			CTET1.getSons().add(f);
			full.put("f", f);
			CompleteTextElementType g = new CompleteTextElementType("Miscellaneous information", CTET1);
			CTET1.getSons().add(g);
			full.put("g", g);
			CompleteTextElementType h = new CompleteTextElementType("Medium", CTET1);
			CTET1.getSons().add(h);
			full.put("h", h);
			CompleteTextElementType k = new CompleteTextElementType("Form subheading", CTET1);
			CTET1.getSons().add(k);
			full.put("k", k);
			CompleteTextElementType l = new CompleteTextElementType("Language of a work", CTET1);
			CTET1.getSons().add(l);
			full.put("l", l);
			CompleteTextElementType m = new CompleteTextElementType("Medium of performance for music", CTET1);
			CTET1.getSons().add(m);
			full.put("m", m);
			CompleteTextElementType n = new CompleteTextElementType("Number of part/section of a work", CTET1);
			CTET1.getSons().add(n);
			full.put("n", n);
			CompleteTextElementType o = new CompleteTextElementType("Arranged statement for music", CTET1);
			CTET1.getSons().add(o);
			full.put("o", o);
			CompleteTextElementType p = new CompleteTextElementType("Name of part/section of a work", CTET1);
			CTET1.getSons().add(p);
			full.put("p", p);
			CompleteTextElementType r = new CompleteTextElementType("Key for music", CTET1);
			CTET1.getSons().add(r);
			full.put("r", r);
			CompleteTextElementType s = new CompleteTextElementType("Version", CTET1);
			CTET1.getSons().add(s);
			full.put("s", s);
			CompleteTextElementType t = new CompleteTextElementType("Title of a work", CTET1);
			CTET1.getSons().add(t);
			full.put("t", t);
			CompleteTextElementType v = new CompleteTextElementType("Volume/sequential designation", CTET1);
			CTET1.getSons().add(v);
			full.put("v", v);
			CompleteTextElementType w = new CompleteTextElementType("Bibliographic record control number", CTET1);
			CTET1.getSons().add(w);
			full.put("w", w);
			CompleteTextElementType x = new CompleteTextElementType("International Standard Serial Number", CTET1);
			CTET1.getSons().add(x);
			full.put("x", x);
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number", CTET1);
			CTET1.getSons().add(n0);
			full.put("0", n0);
			CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
			CTET1.getSons().add(n3);
			full.put("3", n3);
			CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
			CTET1.getSons().add(n5);
			full.put("5", n5);
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			full.put("6", n6);
			CompleteTextElementType n7 = new CompleteTextElementType("Control subfield", CTET1);
			CTET1.getSons().add(n7);
			full.put("7", n7);
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			full.put("8", n8);
			TablaD.put(Iden, full);
			}
			
			
//			841 - Holdings Coded Data Values (NR)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="841";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Holdings Coded Data Values", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			842 - Textual Physical Form Designator (NR)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="842";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Textual Physical Form Designator", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			843 - Reproduction Note (R)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="843";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Reproduction Note", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			844 - Name of Unit (NR)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="844";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Name of Unit", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			845 - Terms Governing Use and Reproduction (R)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="845";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Terms Governing Use and Reproduction", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			853 - Captions and Pattern - Basic Bibliographic Unit (R)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="853";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Captions and Pattern - Basic Bibliographic Unit", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			854 - Captions and Pattern - Supplementary Material (R)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="854";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Captions and Pattern - Supplementary Material", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			855 - Captions and Pattern - Indexes (R)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="855";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Captions and Pattern - Indexes", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			863 - Enumeration and Chronology - Basic Bibliographic Unit (R)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="863";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Enumeration and Chronology - Basic Bibliographic Unit", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			864 - Enumeration and Chronology - Supplementary Material (R)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="864";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Enumeration and Chronology - Supplementary Material", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			865 - Enumeration and Chronology - Indexes (R)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="865";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Enumeration and Chronology - Indexes", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			866 - Textual Holdings - Basic Bibliographic Unit (R)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="866";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Textual Holdings - Basic Bibliographic Unit", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			867 - Textual Holdings - Supplementary Material (R)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="867";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Textual Holdings - Supplementary Material", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			868 - Textual Holdings - Indexes (R)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="868";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Textual Holdings - Indexes", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			876 - Item Information - Basic Bibliographic Unit (R)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="876";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Item Information - Basic Bibliographic Unit", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			877 - Item Information - Supplementary Material (R)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="877";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Item Information - Supplementary Material", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
//			878 - Item Information - Indexes (R)
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="878";
				Datos.getSons().add(I1);
				CompleteTextElementType CTET1=new CompleteTextElementType("Indexes", I1);
				I1.getSons().add(CTET1);
				TablaDR.put(Iden, CTET1);
			}
			
			//Resto
			
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="850";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Holding Institution", I1);
				I1.getSons().add(CTET1);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Holding institution", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
				CTET1.getSons().add(n8);
				full.put("8", n8);
				TablaD.put(Iden, full);
				}
				{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="852";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Location", I1);
				I1.getSons().add(CTET1);
				CompleteTextElementType ID1 = new CompleteTextElementType("Shelving scheme", CTET1);
				CTET1.getSons().add(ID1);
				TablaD1.put(Iden, ID1);
				HashMap<String, String> full1I = new HashMap<String, String>();
				full1I.put("#", "No information provided");
				full1I.put("0", "Library of Congress classification");
				full1I.put("1", "Dewey Decimal classification");
				full1I.put("2", "National Library of Medicine classification");
				full1I.put("3", "Superintendent of Documents classification");
				full1I.put("4", "Shelving control number");
				full1I.put("5", "Title");
				full1I.put("6", "Shelved separately");
				full1I.put("7", "Source specified in subfield $2");
				full1I.put("8", "Other scheme");
				TablaID1.put(Iden, full1I);
				CompleteTextElementType ID2 = new CompleteTextElementType("Shelving order", CTET1);
				CTET1.getSons().add(ID2);
				TablaD2.put(Iden, ID2);
				HashMap<String, String> full2I = new HashMap<String, String>();
				full2I.put("#", "No information provided");
				full2I.put("0", "Not enumeration");
				full2I.put("1", "Primary enumeration");
				full2I.put("2", "Alternative enumeration");
				TablaID2.put(Iden, full2I);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Location", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType b = new CompleteTextElementType("Sublocation or collection", CTET1);
				CTET1.getSons().add(b);
				full.put("b", b);
				CompleteTextElementType c = new CompleteTextElementType("Shelving location", CTET1);
				CTET1.getSons().add(c);
				full.put("c", c);
				CompleteTextElementType d = new CompleteTextElementType("Former shelving location", CTET1);
				CTET1.getSons().add(d);
				full.put("d", d);
				CompleteTextElementType e = new CompleteTextElementType("Address", CTET1);
				CTET1.getSons().add(e);
				full.put("e", e);
				CompleteTextElementType f = new CompleteTextElementType("Coded location qualifier", CTET1);
				CTET1.getSons().add(f);
				full.put("f", f);
				CompleteTextElementType g = new CompleteTextElementType("Non-coded location qualifier", CTET1);
				CTET1.getSons().add(g);
				full.put("g", g);
				CompleteTextElementType h = new CompleteTextElementType("Classification part", CTET1);
				CTET1.getSons().add(h);
				full.put("h", h);
				CompleteTextElementType i = new CompleteTextElementType("Item part", CTET1);
				CTET1.getSons().add(i);
				full.put("i", i);
				CompleteTextElementType j = new CompleteTextElementType("Shelving control number", CTET1);
				CTET1.getSons().add(j);
				full.put("j", j);
				CompleteTextElementType k = new CompleteTextElementType("Call number prefix", CTET1);
				CTET1.getSons().add(k);
				full.put("k", k);
				CompleteTextElementType l = new CompleteTextElementType("Shelving form of title", CTET1);
				CTET1.getSons().add(l);
				full.put("l", l);
				CompleteTextElementType m = new CompleteTextElementType("Call number suffix", CTET1);
				CTET1.getSons().add(m);
				full.put("m", m);
				CompleteTextElementType n = new CompleteTextElementType("Country code", CTET1);
				CTET1.getSons().add(n);
				full.put("n", n);
				CompleteTextElementType p = new CompleteTextElementType("Piece designation", CTET1);
				CTET1.getSons().add(p);
				full.put("p", p);
				CompleteTextElementType q = new CompleteTextElementType("Piece physical condition", CTET1);
				CTET1.getSons().add(q);
				full.put("q", q);
				CompleteTextElementType s = new CompleteTextElementType("Copyright article-fee code", CTET1);
				CTET1.getSons().add(s);
				full.put("s", s);
				CompleteTextElementType t = new CompleteTextElementType("Copy number", CTET1);
				CTET1.getSons().add(t);
				full.put("t", t);
				CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
				CTET1.getSons().add(u);
				full.put("u", u);
				CompleteTextElementType x = new CompleteTextElementType("Nonpublic note", CTET1);
				CTET1.getSons().add(x);
				full.put("x", x);
				CompleteTextElementType z = new CompleteTextElementType("Public note", CTET1);
				CTET1.getSons().add(z);
				full.put("z", z);
				CompleteTextElementType n2 = new CompleteTextElementType("Source of classification or shelving scheme", CTET1);
				CTET1.getSons().add(n2);
				full.put("2", n2);
				CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
				CTET1.getSons().add(n3);
				full.put("3", n3);
				CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
				CTET1.getSons().add(n6);
				full.put("6", n6);
				CompleteTextElementType n8 = new CompleteTextElementType("Sequence number", CTET1);
				CTET1.getSons().add(n8);
				full.put("8", n8);
				TablaD.put(Iden, full);
				}
				{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="856";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Electronic Location and Access", I1);
				I1.getSons().add(CTET1);
				CompleteTextElementType ID1 = new CompleteTextElementType("Access method", CTET1);
				CTET1.getSons().add(ID1);
				TablaD1.put(Iden, ID1);
				HashMap<String, String> full1I = new HashMap<String, String>();
				full1I.put("#", "No information provided");
				full1I.put("0", "Email");
				full1I.put("1", "FTP");
				full1I.put("2", "Remote login (Telnet)");
				full1I.put("3", "Dial-up");
				full1I.put("4", "HTTP");
				full1I.put("7", "Method specified in subfield $2");
				TablaID1.put(Iden, full1I);
				CompleteTextElementType ID2 = new CompleteTextElementType("Relationship", CTET1);
				CTET1.getSons().add(ID2);
				TablaD2.put(Iden, ID2);
				HashMap<String, String> full2I = new HashMap<String, String>();
				full2I.put("#", "No information provided");
				full2I.put("0", "Resource");
				full2I.put("1", "Version of resource");
				full2I.put("2", "Related resource");
				full2I.put("8", "No display constant generated");
				TablaID2.put(Iden, full2I);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Host name", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType b = new CompleteTextElementType("Access number", CTET1);
				CTET1.getSons().add(b);
				full.put("b", b);
				CompleteTextElementType c = new CompleteTextElementType("Compression information", CTET1);
				CTET1.getSons().add(c);
				full.put("c", c);
				CompleteTextElementType d = new CompleteTextElementType("Path", CTET1);
				CTET1.getSons().add(d);
				full.put("d", d);
				CompleteTextElementType f = new CompleteTextElementType("Electronic name", CTET1);
				CTET1.getSons().add(f);
				full.put("f", f);
				CompleteTextElementType h = new CompleteTextElementType("Processor of request", CTET1);
				CTET1.getSons().add(h);
				full.put("h", h);
				CompleteTextElementType i = new CompleteTextElementType("Instruction", CTET1);
				CTET1.getSons().add(i);
				full.put("i", i);
				CompleteTextElementType j = new CompleteTextElementType("Bits per second", CTET1);
				CTET1.getSons().add(j);
				full.put("j", j);
				CompleteTextElementType k = new CompleteTextElementType("Password", CTET1);
				CTET1.getSons().add(k);
				full.put("k", k);
				CompleteTextElementType l = new CompleteTextElementType("Logon", CTET1);
				CTET1.getSons().add(l);
				full.put("l", l);
				CompleteTextElementType m = new CompleteTextElementType("Contact for access assistance", CTET1);
				CTET1.getSons().add(m);
				full.put("m", m);
				CompleteTextElementType n = new CompleteTextElementType("Name of location of host", CTET1);
				CTET1.getSons().add(n);
				full.put("n", n);
				CompleteTextElementType o = new CompleteTextElementType("Operating system", CTET1);
				CTET1.getSons().add(o);
				full.put("o", o);
				CompleteTextElementType p = new CompleteTextElementType("Port", CTET1);
				CTET1.getSons().add(p);
				full.put("p", p);
				CompleteTextElementType q = new CompleteTextElementType("Electronic format type", CTET1);
				CTET1.getSons().add(q);
				full.put("q", q);
				CompleteTextElementType r = new CompleteTextElementType("Settings", CTET1);
				CTET1.getSons().add(r);
				full.put("r", r);
				CompleteTextElementType s = new CompleteTextElementType("File size", CTET1);
				CTET1.getSons().add(s);
				full.put("s", s);
				CompleteTextElementType t = new CompleteTextElementType("Terminal emulation", CTET1);
				CTET1.getSons().add(t);
				full.put("t", t);
				CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
				CTET1.getSons().add(u);
				full.put("u", u);
				CompleteTextElementType v = new CompleteTextElementType("Hours access method available", CTET1);
				CTET1.getSons().add(v);
				full.put("v", v);
				CompleteTextElementType w = new CompleteTextElementType("Record control number", CTET1);
				CTET1.getSons().add(w);
				full.put("w", w);
				CompleteTextElementType x = new CompleteTextElementType("Nonpublic note", CTET1);
				CTET1.getSons().add(x);
				full.put("x", x);
				CompleteTextElementType y = new CompleteTextElementType("Link text", CTET1);
				CTET1.getSons().add(y);
				full.put("y", y);
				CompleteTextElementType z = new CompleteTextElementType("Public note", CTET1);
				CTET1.getSons().add(z);
				full.put("z", z);
				CompleteTextElementType n2 = new CompleteTextElementType("Access method", CTET1);
				CTET1.getSons().add(n2);
				full.put("2", n2);
				CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
				CTET1.getSons().add(n3);
				full.put("3", n3);
				CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
				CTET1.getSons().add(n6);
				full.put("6", n6);
				CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
				CTET1.getSons().add(n8);
				full.put("8", n8);
				TablaD.put(Iden, full);
				}
				{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="882";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Replacement Record Information", I1);
				I1.getSons().add(CTET1);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Replacement title", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType i = new CompleteTextElementType("Explanatory text", CTET1);
				CTET1.getSons().add(i);
				full.put("i", i);
				CompleteTextElementType w = new CompleteTextElementType("Replacement bibliographic record control number", CTET1);
				CTET1.getSons().add(w);
				full.put("w", w);
				CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
				CTET1.getSons().add(n6);
				full.put("6", n6);
				CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
				CTET1.getSons().add(n8);
				full.put("8", n8);
				TablaD.put(Iden, full);
				}
				{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="883";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Machine-generated Metadata Provenance", I1);
				I1.getSons().add(CTET1);
				CompleteTextElementType ID1 = new CompleteTextElementType("Method of machine assignment", CTET1);
				CTET1.getSons().add(ID1);
				TablaD1.put(Iden, ID1);
				HashMap<String, String> full1I = new HashMap<String, String>();
				full1I.put("#", "No information provided/not applicable");
				full1I.put("0", "Fully machine-generated");
				full1I.put("1", "Partially machine-generated");
				TablaID1.put(Iden, full1I);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Generation process", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType c = new CompleteTextElementType("Confidence value", CTET1);
				CTET1.getSons().add(c);
				full.put("c", c);
				CompleteTextElementType d = new CompleteTextElementType("Generation date", CTET1);
				CTET1.getSons().add(d);
				full.put("d", d);
				CompleteTextElementType q = new CompleteTextElementType("Generation agency", CTET1);
				CTET1.getSons().add(q);
				full.put("q", q);
				CompleteTextElementType x = new CompleteTextElementType("Validity end date", CTET1);
				CTET1.getSons().add(x);
				full.put("x", x);
				CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
				CTET1.getSons().add(u);
				full.put("u", u);
				CompleteTextElementType w = new CompleteTextElementType("Bibliographic record control number", CTET1);
				CTET1.getSons().add(w);
				full.put("w", w);
				CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number or standard number", CTET1);
				CTET1.getSons().add(n0);
				full.put("0", n0);
				CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
				CTET1.getSons().add(n8);
				full.put("8", n8);
				TablaD.put(Iden, full);
				}
				{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="887";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Non-MARC Information Field", I1);
				I1.getSons().add(CTET1);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Content of non-MARC field", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType n2 = new CompleteTextElementType("Source of data", CTET1);
				CTET1.getSons().add(n2);
				full.put("2", n2);
				TablaD.put(Iden, full);
				}

	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessInstances()
	 */
	@Override
	public void ProcessInstances() {
		// se hace en otro metodo

	}

	
	public String getValueN7(String Valor)
	{
	return full1I.get(Valor);	
	}

	public boolean raroValor8(String tagS) {
		switch (tagS) {
		case "800":
			return true;
		case "810":
			return true;
		case "811":
			return true;
		case "830":
			return true;
		default:
			return false;
		}
	}
	
	public boolean raroT8(String tagS) {
		switch (tagS) {
		case "841":
			return true;
		case "842":
			return true;
		case "843":
			return true;
		case "844":
			return true;
		case "845":
			return true;
		case "853":
			return true;
		case "854":
			return true;
		case "855":
			return true;
		case "863":
			return true;
		case "864":
			return true;
		case "865":
			return true;
		case "866":
			return true;
		case "867":
			return true;
		case "868":
			return true;
		case "876":
			return true;
		case "877":
			return true;
		case "878":
			return true;
		default:
			return false;
		}
	}

	public CompleteTextElementType getRaroT8(String tagS) {
		return TablaDR.get(tagS);
	}

	public boolean is880(String tag)
	{
		if (tag.equals("880"))
			return true;
		else return false;
	}
	
	public boolean is886(String tag)
	{
		if (tag.equals("886"))
			return true;
		else return false;
	}

}
