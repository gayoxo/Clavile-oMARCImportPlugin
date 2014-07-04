/**
 * 
 */
package fdi.ucm.server.importparser.marcxml.structures.control;

import java.util.ArrayList;
import java.util.HashMap;

import fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser;
import fdi.ucm.server.importparser.marcxml.LoadCollectionMARCXML;
import fdi.ucm.server.modelComplete.collection.document.CompleteDocuments;
import fdi.ucm.server.modelComplete.collection.document.CompleteTextElement;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteElementType;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteIterator;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteTextElementType;

/**
 * @author Joaquin Gayoso-Cabada
 *
 */
public class S5XX implements InterfaceMARCXMLparser {
	
	private CompleteElementType Datos;
	private HashMap<String, HashMap<String, CompleteTextElementType>> TablaD;
	private HashMap<String, HashMap<String, String>> TablaID1;
	private HashMap<String, CompleteTextElementType> TablaD1;
	private CompleteTextElementType Raro59X;
	private HashMap<String, HashMap<String, String>> TablaID2;
	private HashMap<String, CompleteTextElementType> TablaD2;
	private CompleteTextElementType n533n7n0;
	private CompleteTextElementType n533n7n1_4;
	private CompleteTextElementType n533n7n5_8;
	private CompleteTextElementType n533n7n9_11;
	private CompleteTextElementType n533n7n12;
	private CompleteTextElementType n533n7n13;
	private CompleteTextElementType n533n7n14;

	public S5XX(CompleteElementType datos,
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
	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessAttributes()
	 */
	@Override
	public void ProcessAttributes() {
		
		//primer macro
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			String Iden="500";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("General Note", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("General note", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
			CTET1.getSons().add(n3);
			full.put("3", n3);
			CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
			CTET1.getSons().add(n5);
			full.put("5", n5);
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
			String Iden="501";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("With Note", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("With note", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
			CTET1.getSons().add(n5);
			full.put("5", n5);
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
			String Iden="502";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Dissertation Note", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Dissertation note", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Degree type", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType c = new CompleteTextElementType("Name of granting institution", CTET1);
			CTET1.getSons().add(c);
			full.put("c", c);
			CompleteTextElementType d = new CompleteTextElementType("Year degree granted", CTET1);
			CTET1.getSons().add(d);
			full.put("d", d);
			CompleteTextElementType g = new CompleteTextElementType("Miscellaneous information", CTET1);
			CTET1.getSons().add(g);
			full.put("g", g);
			CompleteTextElementType o = new CompleteTextElementType("Dissertation identifier", CTET1);
			CTET1.getSons().add(o);
			full.put("o", o);
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
			String Iden="504";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Bibliography, etc. Note", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Bibliography, etc. note", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Number of references", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
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
			String Iden="505";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Formatted Contents Note", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Contents");
			full1I.put("1", "Incomplete contents");
			full1I.put("2", "Partial contents");
			full1I.put("8", "No display constant generated");
			TablaID1.put(Iden, full1I);
			CompleteTextElementType ID2 = new CompleteTextElementType("Level of content designation", CTET1);
			CTET1.getSons().add(ID2);
			TablaD2.put(Iden, ID2);
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("#", "Basic");
			full2I.put("0", "Enhanced");
			TablaID2.put(Iden, full2I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Formatted contents note", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType g = new CompleteTextElementType("Miscellaneous information", CTET1);
			CTET1.getSons().add(g);
			full.put("g", g);
			CompleteTextElementType r = new CompleteTextElementType("Statement of responsibility", CTET1);
			CTET1.getSons().add(r);
			full.put("r", r);
			CompleteTextElementType t = new CompleteTextElementType("Title", CTET1);
			CTET1.getSons().add(t);
			full.put("t", t);
			CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
			CTET1.getSons().add(u);
			full.put("u", u);
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
			String Iden="506";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Restrictions on Access Note", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Restriction", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "No information provided");
			full1I.put("0", "No restrictions");
			full1I.put("1", "Restrictions apply");
			TablaID1.put(Iden, full1I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Terms governing access", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Jurisdiction", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType c = new CompleteTextElementType("Physical access provisions", CTET1);
			CTET1.getSons().add(c);
			full.put("c", c);
			CompleteTextElementType d = new CompleteTextElementType("Authorized users", CTET1);
			CTET1.getSons().add(d);
			full.put("d", d);
			CompleteTextElementType e = new CompleteTextElementType("Authorization", CTET1);
			CTET1.getSons().add(e);
			full.put("e", e);
			CompleteTextElementType f = new CompleteTextElementType("Standardized terminology for access restriction", CTET1);
			CTET1.getSons().add(f);
			full.put("f", f);
			CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
			CTET1.getSons().add(u);
			full.put("u", u);
			CompleteTextElementType n2 = new CompleteTextElementType("Source of term", CTET1);
			CTET1.getSons().add(n2);
			full.put("2", n2);
			CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
			CTET1.getSons().add(n3);
			full.put("3", n3);
			CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
			CTET1.getSons().add(n5);
			full.put("5", n5);
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
			String Iden="507";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Scale Note for Graphic Material", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Representative fraction of scale note", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Remainder of scale note", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
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
			String Iden="508";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Creation/Production Credits Note", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Creation/production credits note", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
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
			String Iden="510";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Citation/References Note", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Coverage/location in source", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Coverage unknown");
			full1I.put("1", "Coverage complete");
			full1I.put("2", "Coverage is selective");
			full1I.put("3", "Location in source not given");
			full1I.put("4", "Location in source given");
			TablaID1.put(Iden, full1I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Name of source", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Coverage of source", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType c = new CompleteTextElementType("Location within source", CTET1);
			CTET1.getSons().add(c);
			full.put("c", c);
			CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
			CTET1.getSons().add(u);
			full.put("u", u);
			CompleteTextElementType x = new CompleteTextElementType("International Standard Serial Number", CTET1);
			CTET1.getSons().add(x);
			full.put("x", x);
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
			String Iden="511";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Participant or Performer Note", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "No display constant generated");
			full1I.put("1", "Cast");
			TablaID1.put(Iden, full1I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Participant or performer note", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
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
			String Iden="513";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Type of Report and Period Covered Note", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Type of report", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Period covered", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
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
			String Iden="514";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Data Quality Note", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Attribute accuracy report", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Attribute accuracy value", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType c = new CompleteTextElementType("Attribute accuracy explanation", CTET1);
			CTET1.getSons().add(c);
			full.put("c", c);
			CompleteTextElementType d = new CompleteTextElementType("Logical consistency report", CTET1);
			CTET1.getSons().add(d);
			full.put("d", d);
			CompleteTextElementType e = new CompleteTextElementType("Completeness report", CTET1);
			CTET1.getSons().add(e);
			full.put("e", e);
			CompleteTextElementType f = new CompleteTextElementType("Horizontal position accuracy report", CTET1);
			CTET1.getSons().add(f);
			full.put("f", f);
			CompleteTextElementType g = new CompleteTextElementType("Horizontal position accuracy value", CTET1);
			CTET1.getSons().add(g);
			full.put("g", g);
			CompleteTextElementType h = new CompleteTextElementType("Horizontal position accuracy explanation", CTET1);
			CTET1.getSons().add(h);
			full.put("h", h);
			CompleteTextElementType i = new CompleteTextElementType("Vertical positional accuracy report", CTET1);
			CTET1.getSons().add(i);
			full.put("i", i);
			CompleteTextElementType j = new CompleteTextElementType("Vertical positional accuracy value", CTET1);
			CTET1.getSons().add(j);
			full.put("j", j);
			CompleteTextElementType k = new CompleteTextElementType("Vertical positional accuracy explanation", CTET1);
			CTET1.getSons().add(k);
			full.put("k", k);
			CompleteTextElementType m = new CompleteTextElementType("Cloud cover", CTET1);
			CTET1.getSons().add(m);
			full.put("m", m);
			CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
			CTET1.getSons().add(u);
			full.put("u", u);
			CompleteTextElementType z = new CompleteTextElementType("Display note", CTET1);
			CTET1.getSons().add(z);
			full.put("z", z);
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
			String Iden="515";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Numbering Peculiarities Note", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Numbering peculiarities note", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
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
			String Iden="516";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Type of Computer File or Data Note", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "Type of file");
			full1I.put("8", "No display constant generated");
			TablaID1.put(Iden, full1I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Type of computer file or data note", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
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
			String Iden="518";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Date/Time and Place of an Event Note", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Date/time and place of an event note", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType d = new CompleteTextElementType("Date of event", CTET1);
			CTET1.getSons().add(d);
			full.put("d", d);
			CompleteTextElementType o = new CompleteTextElementType("Other event information", CTET1);
			CTET1.getSons().add(o);
			full.put("o", o);
			CompleteTextElementType p = new CompleteTextElementType("Place of event", CTET1);
			CTET1.getSons().add(p);
			full.put("p", p);
			CompleteTextElementType n0 = new CompleteTextElementType("Record control number", CTET1);
			CTET1.getSons().add(n0);
			full.put("0", n0);
			CompleteTextElementType n2 = new CompleteTextElementType("Source of term", CTET1);
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
			String Iden="520";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Summary, etc.", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "Summary");
			full1I.put("0", "Subject");
			full1I.put("1", "Review");
			full1I.put("2", "Scope and content");
			full1I.put("3", "Abstract");
			full1I.put("4", "Content advice");
			full1I.put("8", "No display constant generated");
			TablaID1.put(Iden, full1I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Summary, etc.", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Expansion of summary note", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType c = new CompleteTextElementType("Assigning source", CTET1);
			CTET1.getSons().add(c);
			full.put("c", c);
			CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
			CTET1.getSons().add(u);
			full.put("u", u);
			CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
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
			String Iden="521";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Target Audience Note", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "Audience");
			full1I.put("0", "Reading grade level");
			full1I.put("1", "Interest age level");
			full1I.put("2", "Interest grade level");
			full1I.put("3", "Special audience characteristics");
			full1I.put("4", "Motivation/interest level");
			full1I.put("8", "No display constant generated");
			TablaID1.put(Iden, full1I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Target audience note", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Source", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
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
			String Iden="522";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Geographic Coverage Note", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "Geographic coverage");
			full1I.put("8", "No display constant generated");
			TablaID1.put(Iden, full1I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Geographic coverage note", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
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
			String Iden="524";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Preferred Citation of Described Materials Note", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "Cite as");
			full1I.put("8", "No display constant generated");
			TablaID1.put(Iden, full1I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Preferred citation of described materials note", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType n2 = new CompleteTextElementType("Source of schema used", CTET1);
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
			String Iden="525";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Supplement Note", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Supplement note", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			full.put("6", n6);
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			full.put("8", n8);
			TablaD.put(Iden, full);
			}
	
			//Caso Raro 533
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="533";
				Datos.getSons().add(I1);
				CompleteElementType Raro533 = new CompleteElementType("Reproduction Note", I1);
				I1.getSons().add(Raro533);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Type of reproduction", Raro533);
				Raro533.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType b = new CompleteTextElementType("Place of reproduction", Raro533);
				Raro533.getSons().add(b);
				full.put("b", b);
				CompleteTextElementType c = new CompleteTextElementType("Agency responsible for reproduction", Raro533);
				Raro533.getSons().add(c);
				full.put("c", c);
				CompleteTextElementType d = new CompleteTextElementType("Date of reproduction", Raro533);
				Raro533.getSons().add(d);
				full.put("d", d);
				CompleteTextElementType e = new CompleteTextElementType("Physical description of reproduction", Raro533);
				Raro533.getSons().add(e);
				full.put("e", e);
				CompleteTextElementType f = new CompleteTextElementType("Series statement of reproduction", Raro533);
				Raro533.getSons().add(f);
				full.put("f", f);
				CompleteTextElementType m = new CompleteTextElementType("Dates and/or sequential designation of issues reproduced", Raro533);
				Raro533.getSons().add(m);
				full.put("m", m);
				CompleteTextElementType n = new CompleteTextElementType("Note about reproduction", Raro533);
				Raro533.getSons().add(n);
				full.put("n", n);
				CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", Raro533);
				Raro533.getSons().add(n3);
				full.put("3", n3);
				CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", Raro533);
				Raro533.getSons().add(n5);
				full.put("5", n5);
				CompleteTextElementType n7 = new CompleteTextElementType("Fixed-length data elements of reproduction", Raro533);
				Raro533.getSons().add(n7);
				full.put("7", n7);
				
				//Macro propio
				//Cosa Rara
///				0 - Type of date/Publication status 
//			    /1-4 - Date 1 
//			    /5-8 - Date 2 
//			    /9-11 - Place of publication, production, or execution 
//			    /12 - Frequency 
//			    /13 - Regularity 
//			    /14 - Form of item 
				n533n7n0 = new CompleteTextElementType("Type of date/Publication status ", n7);
				n7.getSons().add(n533n7n0);
				n533n7n1_4 = new CompleteTextElementType("Date 1", n7);
				n7.getSons().add(n533n7n1_4);
				n533n7n5_8 = new CompleteTextElementType("Date 2", n7);
				n7.getSons().add(n533n7n5_8);
				n533n7n9_11 = new CompleteTextElementType("Place of publication, production, or execution", n7);
				n7.getSons().add(n533n7n9_11);
				n533n7n12 = new CompleteTextElementType("Frequency", n7);
				n7.getSons().add(n533n7n12);
				n533n7n13 = new CompleteTextElementType("Regularity", n7);
				n7.getSons().add(n533n7n13);
				n533n7n14 = new CompleteTextElementType("Form of item", n7);
				n7.getSons().add(n533n7n14);
				
				
				CompleteTextElementType n6 = new CompleteTextElementType("Linkage", Raro533);
				Raro533.getSons().add(n6);
				full.put("6", n6);
				CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", Raro533);
				Raro533.getSons().add(n8);
				full.put("8", n8);
				TablaD.put(Iden, full);	
				}
			
			
			//Segundo macro
			{
				CompleteIterator I1=new CompleteIterator(Datos);
				String Iden="526";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Study Program Information Note", I1);
				I1.getSons().add(CTET1);
				CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
				CTET1.getSons().add(ID1);
				TablaD1.put(Iden, ID1);
				HashMap<String, String> full1I = new HashMap<String, String>();
				full1I.put("0", "Reading program");
				full1I.put("8", "No display constant generated");
				TablaID1.put(Iden, full1I);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Program name", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType b = new CompleteTextElementType("Interest level", CTET1);
				CTET1.getSons().add(b);
				full.put("b", b);
				CompleteTextElementType c = new CompleteTextElementType("Reading level", CTET1);
				CTET1.getSons().add(c);
				full.put("c", c);
				CompleteTextElementType d = new CompleteTextElementType("Title point value", CTET1);
				CTET1.getSons().add(d);
				full.put("d", d);
				CompleteTextElementType i = new CompleteTextElementType("Display text", CTET1);
				CTET1.getSons().add(i);
				full.put("i", i);
				CompleteTextElementType x = new CompleteTextElementType("Nonpublic note", CTET1);
				CTET1.getSons().add(x);
				full.put("x", x);
				CompleteTextElementType z = new CompleteTextElementType("Public note", CTET1);
				CTET1.getSons().add(z);
				full.put("z", z);
				CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
				CTET1.getSons().add(n5);
				full.put("5", n5);
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
				String Iden="530";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Additional Physical Form available Note", I1);
				I1.getSons().add(CTET1);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Additional physical form available note", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType b = new CompleteTextElementType("Availability source", CTET1);
				CTET1.getSons().add(b);
				full.put("b", b);
				CompleteTextElementType c = new CompleteTextElementType("Availability conditions", CTET1);
				CTET1.getSons().add(c);
				full.put("c", c);
				CompleteTextElementType d = new CompleteTextElementType("Order number", CTET1);
				CTET1.getSons().add(d);
				full.put("d", d);
				CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
				CTET1.getSons().add(u);
				full.put("u", u);
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
				String Iden="534";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Original Version Note", I1);
				I1.getSons().add(CTET1);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Main entry of original", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType b = new CompleteTextElementType("Edition statement of original", CTET1);
				CTET1.getSons().add(b);
				full.put("b", b);
				CompleteTextElementType c = new CompleteTextElementType("Publication, distribution, etc. of original", CTET1);
				CTET1.getSons().add(c);
				full.put("c", c);
				CompleteTextElementType e = new CompleteTextElementType("Physical description, etc. of original", CTET1);
				CTET1.getSons().add(e);
				full.put("e", e);
				CompleteTextElementType f = new CompleteTextElementType("Series statement of original", CTET1);
				CTET1.getSons().add(f);
				full.put("f", f);
				CompleteTextElementType k = new CompleteTextElementType("Key title of original", CTET1);
				CTET1.getSons().add(k);
				full.put("k", k);
				CompleteTextElementType l = new CompleteTextElementType("Location of original", CTET1);
				CTET1.getSons().add(l);
				full.put("l", l);
				CompleteTextElementType m = new CompleteTextElementType("Material specific details", CTET1);
				CTET1.getSons().add(m);
				full.put("m", m);
				CompleteTextElementType n = new CompleteTextElementType("Note about original", CTET1);
				CTET1.getSons().add(n);
				full.put("n", n);
				CompleteTextElementType o = new CompleteTextElementType("Other resource identifier", CTET1);
				CTET1.getSons().add(o);
				full.put("o", o);
				CompleteTextElementType p = new CompleteTextElementType("Introductory phrase", CTET1);
				CTET1.getSons().add(p);
				full.put("p", p);
				CompleteTextElementType t = new CompleteTextElementType("Title statement of original", CTET1);
				CTET1.getSons().add(t);
				full.put("t", t);
				CompleteTextElementType x = new CompleteTextElementType("International Standard Serial Number", CTET1);
				CTET1.getSons().add(x);
				full.put("x", x);
				CompleteTextElementType z = new CompleteTextElementType("International Standard Book Number", CTET1);
				CTET1.getSons().add(z);
				full.put("z", z);
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
				String Iden="535";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Location of Originals/Duplicates Note", I1);
				I1.getSons().add(CTET1);
				CompleteTextElementType ID1 = new CompleteTextElementType("Custodial role", CTET1);
				CTET1.getSons().add(ID1);
				TablaD1.put(Iden, ID1);
				HashMap<String, String> full1I = new HashMap<String, String>();
				full1I.put("1", "Holder of originals");
				full1I.put("2", "Holder of duplicates");
				TablaID1.put(Iden, full1I);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Custodian", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType b = new CompleteTextElementType("Postal address", CTET1);
				CTET1.getSons().add(b);
				full.put("b", b);
				CompleteTextElementType c = new CompleteTextElementType("Country", CTET1);
				CTET1.getSons().add(c);
				full.put("c", c);
				CompleteTextElementType d = new CompleteTextElementType("Telecommunications address", CTET1);
				CTET1.getSons().add(d);
				full.put("d", d);
				CompleteTextElementType g = new CompleteTextElementType("Repository location code", CTET1);
				CTET1.getSons().add(g);
				full.put("g", g);
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
				String Iden="536";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Funding Information Note", I1);
				I1.getSons().add(CTET1);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Text of note", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType b = new CompleteTextElementType("Contract number", CTET1);
				CTET1.getSons().add(b);
				full.put("b", b);
				CompleteTextElementType c = new CompleteTextElementType("Grant number", CTET1);
				CTET1.getSons().add(c);
				full.put("c", c);
				CompleteTextElementType d = new CompleteTextElementType("Undifferentiated number", CTET1);
				CTET1.getSons().add(d);
				full.put("d", d);
				CompleteTextElementType e = new CompleteTextElementType("Program element number", CTET1);
				CTET1.getSons().add(e);
				full.put("e", e);
				CompleteTextElementType f = new CompleteTextElementType("Project number", CTET1);
				CTET1.getSons().add(f);
				full.put("f", f);
				CompleteTextElementType g = new CompleteTextElementType("Task number", CTET1);
				CTET1.getSons().add(g);
				full.put("g", g);
				CompleteTextElementType h = new CompleteTextElementType("Work unit number", CTET1);
				CTET1.getSons().add(h);
				full.put("h", h);
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
				String Iden="538";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("System Details Note", I1);
				I1.getSons().add(CTET1);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("System details note", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType i = new CompleteTextElementType("Display text", CTET1);
				CTET1.getSons().add(i);
				full.put("i", i);
				CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
				CTET1.getSons().add(u);
				full.put("u", u);
				CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
				CTET1.getSons().add(n3);
				full.put("3", n3);
				CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
				CTET1.getSons().add(n5);
				full.put("5", n5);
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
				String Iden="540";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Terms Governing Use and Reproduction Note", I1);
				I1.getSons().add(CTET1);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Terms governing use and reproduction", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType b = new CompleteTextElementType("Jurisdiction", CTET1);
				CTET1.getSons().add(b);
				full.put("b", b);
				CompleteTextElementType c = new CompleteTextElementType("Authorization", CTET1);
				CTET1.getSons().add(c);
				full.put("c", c);
				CompleteTextElementType d = new CompleteTextElementType("Authorized users", CTET1);
				CTET1.getSons().add(d);
				full.put("d", d);
				CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
				CTET1.getSons().add(u);
				full.put("u", u);
				CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
				CTET1.getSons().add(n3);
				full.put("3", n3);
				CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
				CTET1.getSons().add(n5);
				full.put("5", n5);
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
				String Iden="541";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Immediate Source of Acquisition Note", I1);
				I1.getSons().add(CTET1);
				CompleteTextElementType ID1 = new CompleteTextElementType("Privacy", CTET1);
				CTET1.getSons().add(ID1);
				TablaD1.put(Iden, ID1);
				HashMap<String, String> full1I = new HashMap<String, String>();
				full1I.put("#", "No information provided");
				full1I.put("0", "Private");
				full1I.put("1", "Not private");
				TablaID1.put(Iden, full1I);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Source of acquisition", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType b = new CompleteTextElementType("Address", CTET1);
				CTET1.getSons().add(b);
				full.put("b", b);
				CompleteTextElementType c = new CompleteTextElementType("Method of acquisition", CTET1);
				CTET1.getSons().add(c);
				full.put("c", c);
				CompleteTextElementType d = new CompleteTextElementType("Date of acquisition", CTET1);
				CTET1.getSons().add(d);
				full.put("d", d);
				CompleteTextElementType e = new CompleteTextElementType("Accession number", CTET1);
				CTET1.getSons().add(e);
				full.put("e", e);
				CompleteTextElementType f = new CompleteTextElementType("Owner", CTET1);
				CTET1.getSons().add(f);
				full.put("f", f);
				CompleteTextElementType h = new CompleteTextElementType("Purchase price", CTET1);
				CTET1.getSons().add(h);
				full.put("h", h);
				CompleteTextElementType n = new CompleteTextElementType("Extent", CTET1);
				CTET1.getSons().add(n);
				full.put("n", n);
				CompleteTextElementType o = new CompleteTextElementType("Type of unit", CTET1);
				CTET1.getSons().add(o);
				full.put("o", o);
				CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
				CTET1.getSons().add(n3);
				full.put("3", n3);
				CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
				CTET1.getSons().add(n5);
				full.put("5", n5);
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
				String Iden="542";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Information Relating to Copyright Status", I1);
				I1.getSons().add(CTET1);
				CompleteTextElementType ID1 = new CompleteTextElementType("Privacy", CTET1);
				CTET1.getSons().add(ID1);
				TablaD1.put(Iden, ID1);
				HashMap<String, String> full1I = new HashMap<String, String>();
				full1I.put("#", "No information provided");
				full1I.put("0", "Private");
				full1I.put("1", "Not private");
				TablaID1.put(Iden, full1I);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Personal creator", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType b = new CompleteTextElementType("Personal creator death date", CTET1);
				CTET1.getSons().add(b);
				full.put("b", b);
				CompleteTextElementType c = new CompleteTextElementType("Corporate creator", CTET1);
				CTET1.getSons().add(c);
				full.put("c", c);
				CompleteTextElementType d = new CompleteTextElementType("Copyright holder", CTET1);
				CTET1.getSons().add(d);
				full.put("d", d);
				CompleteTextElementType e = new CompleteTextElementType("Copyright holder contact information", CTET1);
				CTET1.getSons().add(e);
				full.put("e", e);
				CompleteTextElementType f = new CompleteTextElementType("Copyright statement", CTET1);
				CTET1.getSons().add(f);
				full.put("f", f);
				CompleteTextElementType g = new CompleteTextElementType("Copyright date", CTET1);
				CTET1.getSons().add(g);
				full.put("g", g);
				CompleteTextElementType h = new CompleteTextElementType("Copyright renewal date", CTET1);
				CTET1.getSons().add(h);
				full.put("h", h);
				CompleteTextElementType i = new CompleteTextElementType("Publication date", CTET1);
				CTET1.getSons().add(i);
				full.put("i", i);
				CompleteTextElementType j = new CompleteTextElementType("Creation date", CTET1);
				CTET1.getSons().add(j);
				full.put("j", j);
				CompleteTextElementType k = new CompleteTextElementType("Publisher", CTET1);
				CTET1.getSons().add(k);
				full.put("k", k);
				CompleteTextElementType l = new CompleteTextElementType("Copyright status", CTET1);
				CTET1.getSons().add(l);
				full.put("l", l);
				CompleteTextElementType m = new CompleteTextElementType("Publication status", CTET1);
				CTET1.getSons().add(m);
				full.put("m", m);
				CompleteTextElementType n = new CompleteTextElementType("Note", CTET1);
				CTET1.getSons().add(n);
				full.put("n", n);
				CompleteTextElementType o = new CompleteTextElementType("Research date", CTET1);
				CTET1.getSons().add(o);
				full.put("o", o);
				CompleteTextElementType p = new CompleteTextElementType("Country of publication or creation", CTET1);
				CTET1.getSons().add(p);
				full.put("p", p);
				CompleteTextElementType q = new CompleteTextElementType("Supplying agency", CTET1);
				CTET1.getSons().add(q);
				full.put("q", q);
				CompleteTextElementType r = new CompleteTextElementType("Jurisdiction of copyright assessment", CTET1);
				CTET1.getSons().add(r);
				full.put("r", r);
				CompleteTextElementType s = new CompleteTextElementType("Source of information", CTET1);
				CTET1.getSons().add(s);
				full.put("s", s);
				CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
				CTET1.getSons().add(u);
				full.put("u", u);
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
				String Iden="544";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Location of Other Archival Materials Note", I1);
				I1.getSons().add(CTET1);
				CompleteTextElementType ID1 = new CompleteTextElementType("Relationship", CTET1);
				CTET1.getSons().add(ID1);
				TablaD1.put(Iden, ID1);
				HashMap<String, String> full1I = new HashMap<String, String>();
				full1I.put("#", "No information provided");
				full1I.put("0", "Associated materials");
				full1I.put("1", "Related materials");
				TablaID1.put(Iden, full1I);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Custodian", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType b = new CompleteTextElementType("Address", CTET1);
				CTET1.getSons().add(b);
				full.put("b", b);
				CompleteTextElementType c = new CompleteTextElementType("Country", CTET1);
				CTET1.getSons().add(c);
				full.put("c", c);
				CompleteTextElementType d = new CompleteTextElementType("Title", CTET1);
				CTET1.getSons().add(d);
				full.put("d", d);
				CompleteTextElementType e = new CompleteTextElementType("Provenance", CTET1);
				CTET1.getSons().add(e);
				full.put("e", e);
				CompleteTextElementType n = new CompleteTextElementType("Note", CTET1);
				CTET1.getSons().add(n);
				full.put("n", n);
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
				String Iden="545";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Biographical or Historical Data", I1);
				I1.getSons().add(CTET1);
				CompleteTextElementType ID1 = new CompleteTextElementType("Type of data", CTET1);
				CTET1.getSons().add(ID1);
				TablaD1.put(Iden, ID1);
				HashMap<String, String> full1I = new HashMap<String, String>();
				full1I.put("#", "No information provided");
				full1I.put("0", "Biographical sketch");
				full1I.put("1", "Administrative history");
				TablaID1.put(Iden, full1I);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Biographical or historical data", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType b = new CompleteTextElementType("Expansion", CTET1);
				CTET1.getSons().add(b);
				full.put("b", b);
				CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
				CTET1.getSons().add(u);
				full.put("u", u);
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
				String Iden="546";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Language Note", I1);
				I1.getSons().add(CTET1);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Language note", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType b = new CompleteTextElementType("Information code or alphabet", CTET1);
				CTET1.getSons().add(b);
				full.put("b", b);
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
				String Iden="547";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Former Title Complexity Note", I1);
				I1.getSons().add(CTET1);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Former title complexity note", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
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
				String Iden="550";
				Datos.getSons().add(I1);
				CompleteElementType CTET1=new CompleteElementType("Issuing Body Note", I1);
				I1.getSons().add(CTET1);
				HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
				CompleteTextElementType a = new CompleteTextElementType("Issuing body note", CTET1);
				CTET1.getSons().add(a);
				full.put("a", a);
				CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
				CTET1.getSons().add(n6);
				full.put("6", n6);
				CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
				CTET1.getSons().add(n8);
				full.put("8", n8);
				TablaD.put(Iden, full);
				}

				
				//TercerMacro
				{
					CompleteIterator I1=new CompleteIterator(Datos);
					String Iden="552";
					Datos.getSons().add(I1);
					CompleteElementType CTET1=new CompleteElementType("Entity and Attribute Information Note", I1);
					I1.getSons().add(CTET1);
					HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
					CompleteTextElementType a = new CompleteTextElementType("Entity type label", CTET1);
					CTET1.getSons().add(a);
					full.put("a", a);
					CompleteTextElementType b = new CompleteTextElementType("Entity type definition and source", CTET1);
					CTET1.getSons().add(b);
					full.put("b", b);
					CompleteTextElementType c = new CompleteTextElementType("Attribute label", CTET1);
					CTET1.getSons().add(c);
					full.put("c", c);
					CompleteTextElementType d = new CompleteTextElementType("Attribute definition and source", CTET1);
					CTET1.getSons().add(d);
					full.put("d", d);
					CompleteTextElementType e = new CompleteTextElementType("Enumerated domain value", CTET1);
					CTET1.getSons().add(e);
					full.put("e", e);
					CompleteTextElementType f = new CompleteTextElementType("Enumerated domain value definition and source", CTET1);
					CTET1.getSons().add(f);
					full.put("f", f);
					CompleteTextElementType g = new CompleteTextElementType("Range domain minimum and maximum", CTET1);
					CTET1.getSons().add(g);
					full.put("g", g);
					CompleteTextElementType h = new CompleteTextElementType("Codeset name and source", CTET1);
					CTET1.getSons().add(h);
					full.put("h", h);
					CompleteTextElementType i = new CompleteTextElementType("Unrepresentable domain", CTET1);
					CTET1.getSons().add(i);
					full.put("i", i);
					CompleteTextElementType j = new CompleteTextElementType("Attribute units of measurement and resolution", CTET1);
					CTET1.getSons().add(j);
					full.put("j", j);
					CompleteTextElementType k = new CompleteTextElementType("Beginning and ending date of attribute values", CTET1);
					CTET1.getSons().add(k);
					full.put("k", k);
					CompleteTextElementType l = new CompleteTextElementType("Attribute value accuracy", CTET1);
					CTET1.getSons().add(l);
					full.put("l", l);
					CompleteTextElementType m = new CompleteTextElementType("Attribute value accuracy explanation", CTET1);
					CTET1.getSons().add(m);
					full.put("m", m);
					CompleteTextElementType n = new CompleteTextElementType("Attribute measurement frequency", CTET1);
					CTET1.getSons().add(n);
					full.put("n", n);
					CompleteTextElementType o = new CompleteTextElementType("Entity and attribute overview", CTET1);
					CTET1.getSons().add(o);
					full.put("o", o);
					CompleteTextElementType p = new CompleteTextElementType("Entity and attribute detail citation", CTET1);
					CTET1.getSons().add(p);
					full.put("p", p);
					CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
					CTET1.getSons().add(u);
					full.put("u", u);
					CompleteTextElementType z = new CompleteTextElementType("Display note", CTET1);
					CTET1.getSons().add(z);
					full.put("z", z);
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
					String Iden="555";
					Datos.getSons().add(I1);
					CompleteElementType CTET1=new CompleteElementType("Cumulative Index/Finding Aids Note", I1);
					I1.getSons().add(CTET1);
					CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
					CTET1.getSons().add(ID1);
					TablaD1.put(Iden, ID1);
					HashMap<String, String> full1I = new HashMap<String, String>();
					full1I.put("#", "Indexes");
					full1I.put("0", "Finding aids");
					full1I.put("8", "No display constant generated");
					TablaID1.put(Iden, full1I);
					HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
					CompleteTextElementType a = new CompleteTextElementType("Cumulative index/finding aids note", CTET1);
					CTET1.getSons().add(a);
					full.put("a", a);
					CompleteTextElementType b = new CompleteTextElementType("Availability source", CTET1);
					CTET1.getSons().add(b);
					full.put("b", b);
					CompleteTextElementType c = new CompleteTextElementType("Degree of control", CTET1);
					CTET1.getSons().add(c);
					full.put("c", c);
					CompleteTextElementType d = new CompleteTextElementType("Bibliographic reference", CTET1);
					CTET1.getSons().add(d);
					full.put("d", d);
					CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
					CTET1.getSons().add(u);
					full.put("u", u);
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
					String Iden="556";
					Datos.getSons().add(I1);
					CompleteElementType CTET1=new CompleteElementType("Information About Documentation Note", I1);
					I1.getSons().add(CTET1);
					CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
					CTET1.getSons().add(ID1);
					TablaD1.put(Iden, ID1);
					HashMap<String, String> full1I = new HashMap<String, String>();
					full1I.put("#", "Documentation");
					full1I.put("8", "No display constant generated");
					TablaID1.put(Iden, full1I);
					HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
					CompleteTextElementType a = new CompleteTextElementType("Information about documentation note", CTET1);
					CTET1.getSons().add(a);
					full.put("a", a);
					CompleteTextElementType z = new CompleteTextElementType("International Standard Book Number", CTET1);
					CTET1.getSons().add(z);
					full.put("z", z);
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
					String Iden="561";
					Datos.getSons().add(I1);
					CompleteElementType CTET1=new CompleteElementType("Ownership and Custodial History", I1);
					I1.getSons().add(CTET1);
					CompleteTextElementType ID1 = new CompleteTextElementType("Privacy", CTET1);
					CTET1.getSons().add(ID1);
					TablaD1.put(Iden, ID1);
					HashMap<String, String> full1I = new HashMap<String, String>();
					full1I.put("#", "No information provided");
					full1I.put("0", "Private");
					full1I.put("1", "Not private");
					TablaID1.put(Iden, full1I);
					HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
					CompleteTextElementType a = new CompleteTextElementType("History", CTET1);
					CTET1.getSons().add(a);
					full.put("a", a);
					CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
					CTET1.getSons().add(u);
					full.put("u", u);
					CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
					CTET1.getSons().add(n3);
					full.put("3", n3);
					CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
					CTET1.getSons().add(n5);
					full.put("5", n5);
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
					String Iden="562";
					Datos.getSons().add(I1);
					CompleteElementType CTET1=new CompleteElementType("Copy and Version Identification Note", I1);
					I1.getSons().add(CTET1);
					HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
					CompleteTextElementType a = new CompleteTextElementType("Identifying markings", CTET1);
					CTET1.getSons().add(a);
					full.put("a", a);
					CompleteTextElementType b = new CompleteTextElementType("Copy identification", CTET1);
					CTET1.getSons().add(b);
					full.put("b", b);
					CompleteTextElementType c = new CompleteTextElementType("Version identification", CTET1);
					CTET1.getSons().add(c);
					full.put("c", c);
					CompleteTextElementType d = new CompleteTextElementType("Presentation format", CTET1);
					CTET1.getSons().add(d);
					full.put("d", d);
					CompleteTextElementType e = new CompleteTextElementType("Number of copies", CTET1);
					CTET1.getSons().add(e);
					full.put("e", e);
					CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
					CTET1.getSons().add(n3);
					full.put("3", n3);
					CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
					CTET1.getSons().add(n5);
					full.put("5", n5);
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
					String Iden="563";
					Datos.getSons().add(I1);
					CompleteElementType CTET1=new CompleteElementType("Binding Information", I1);
					I1.getSons().add(CTET1);
					HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
					CompleteTextElementType a = new CompleteTextElementType("Binding note", CTET1);
					CTET1.getSons().add(a);
					full.put("a", a);
					CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
					CTET1.getSons().add(u);
					full.put("u", u);
					CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
					CTET1.getSons().add(n3);
					full.put("3", n3);
					CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
					CTET1.getSons().add(n5);
					full.put("5", n5);
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
					String Iden="565";
					Datos.getSons().add(I1);
					CompleteElementType CTET1=new CompleteElementType("Case File Characteristics Note", I1);
					I1.getSons().add(CTET1);
					CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
					CTET1.getSons().add(ID1);
					TablaD1.put(Iden, ID1);
					HashMap<String, String> full1I = new HashMap<String, String>();
					full1I.put("#", "File size");
					full1I.put("0", "Case file characteristics");
					full1I.put("8", "No display constant generated");
					TablaID1.put(Iden, full1I);
					HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
					CompleteTextElementType a = new CompleteTextElementType("Number of cases/variables", CTET1);
					CTET1.getSons().add(a);
					full.put("a", a);
					CompleteTextElementType b = new CompleteTextElementType("Name of variable", CTET1);
					CTET1.getSons().add(b);
					full.put("b", b);
					CompleteTextElementType c = new CompleteTextElementType("Unit of analysis", CTET1);
					CTET1.getSons().add(c);
					full.put("c", c);
					CompleteTextElementType d = new CompleteTextElementType("Universe of data", CTET1);
					CTET1.getSons().add(d);
					full.put("d", d);
					CompleteTextElementType e = new CompleteTextElementType("Filing scheme or code", CTET1);
					CTET1.getSons().add(e);
					full.put("e", e);
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
					String Iden="567";
					Datos.getSons().add(I1);
					CompleteElementType CTET1=new CompleteElementType("Methodology Note", I1);
					I1.getSons().add(CTET1);
					CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
					CTET1.getSons().add(ID1);
					TablaD1.put(Iden, ID1);
					HashMap<String, String> full1I = new HashMap<String, String>();
					full1I.put("#", "Methodology");
					full1I.put("8", "No display constant generated");
					TablaID1.put(Iden, full1I);
					HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
					CompleteTextElementType a = new CompleteTextElementType("Methodology note", CTET1);
					CTET1.getSons().add(a);
					full.put("a", a);
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
					String Iden="580";
					Datos.getSons().add(I1);
					CompleteElementType CTET1=new CompleteElementType("Linking Entry Complexity Note", I1);
					I1.getSons().add(CTET1);
					HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
					CompleteTextElementType a = new CompleteTextElementType("Linking entry complexity note", CTET1);
					CTET1.getSons().add(a);
					full.put("a", a);
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
					String Iden="581";
					Datos.getSons().add(I1);
					CompleteElementType CTET1=new CompleteElementType("Publications About Described Materials Note", I1);
					I1.getSons().add(CTET1);
					CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
					CTET1.getSons().add(ID1);
					TablaD1.put(Iden, ID1);
					HashMap<String, String> full1I = new HashMap<String, String>();
					full1I.put("#", "Publications");
					full1I.put("8", "No display constant generated");
					TablaID1.put(Iden, full1I);
					HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
					CompleteTextElementType a = new CompleteTextElementType("Publications about described materials note", CTET1);
					CTET1.getSons().add(a);
					full.put("a", a);
					CompleteTextElementType z = new CompleteTextElementType("International Standard Book Number", CTET1);
					CTET1.getSons().add(z);
					full.put("z", z);
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
					String Iden="583";
					Datos.getSons().add(I1);
					CompleteElementType CTET1=new CompleteElementType("Action Note", I1);
					I1.getSons().add(CTET1);
					CompleteTextElementType ID1 = new CompleteTextElementType("Privacy", CTET1);
					CTET1.getSons().add(ID1);
					TablaD1.put(Iden, ID1);
					HashMap<String, String> full1I = new HashMap<String, String>();
					full1I.put("#", "No information provided");
					full1I.put("0", "Private");
					full1I.put("1", "Not private");
					TablaID1.put(Iden, full1I);
					HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
					CompleteTextElementType a = new CompleteTextElementType("Action", CTET1);
					CTET1.getSons().add(a);
					full.put("a", a);
					CompleteTextElementType b = new CompleteTextElementType("Action identification", CTET1);
					CTET1.getSons().add(b);
					full.put("b", b);
					CompleteTextElementType c = new CompleteTextElementType("Time/date of action", CTET1);
					CTET1.getSons().add(c);
					full.put("c", c);
					CompleteTextElementType d = new CompleteTextElementType("Action interval", CTET1);
					CTET1.getSons().add(d);
					full.put("d", d);
					CompleteTextElementType e = new CompleteTextElementType("Contingency for action", CTET1);
					CTET1.getSons().add(e);
					full.put("e", e);
					CompleteTextElementType f = new CompleteTextElementType("Authorization", CTET1);
					CTET1.getSons().add(f);
					full.put("f", f);
					CompleteTextElementType h = new CompleteTextElementType("Jurisdiction", CTET1);
					CTET1.getSons().add(h);
					full.put("h", h);
					CompleteTextElementType i = new CompleteTextElementType("Method of action", CTET1);
					CTET1.getSons().add(i);
					full.put("i", i);
					CompleteTextElementType j = new CompleteTextElementType("Site of action", CTET1);
					CTET1.getSons().add(j);
					full.put("j", j);
					CompleteTextElementType k = new CompleteTextElementType("Action agent", CTET1);
					CTET1.getSons().add(k);
					full.put("k", k);
					CompleteTextElementType l = new CompleteTextElementType("Status", CTET1);
					CTET1.getSons().add(l);
					full.put("l", l);
					CompleteTextElementType n = new CompleteTextElementType("Extent", CTET1);
					CTET1.getSons().add(n);
					full.put("n", n);
					CompleteTextElementType o = new CompleteTextElementType("Type of unit", CTET1);
					CTET1.getSons().add(o);
					full.put("o", o);
					CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
					CTET1.getSons().add(u);
					full.put("u", u);
					CompleteTextElementType x = new CompleteTextElementType("Nonpublic note", CTET1);
					CTET1.getSons().add(x);
					full.put("x", x);
					CompleteTextElementType z = new CompleteTextElementType("Public note", CTET1);
					CTET1.getSons().add(z);
					full.put("z", z);
					CompleteTextElementType n2 = new CompleteTextElementType("Source of term", CTET1);
					CTET1.getSons().add(n2);
					full.put("2", n2);
					CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
					CTET1.getSons().add(n3);
					full.put("3", n3);
					CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
					CTET1.getSons().add(n5);
					full.put("5", n5);
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
					String Iden="584";
					Datos.getSons().add(I1);
					CompleteElementType CTET1=new CompleteElementType("Accumulation and Frequency of Use Note", I1);
					I1.getSons().add(CTET1);
					HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
					CompleteTextElementType a = new CompleteTextElementType("Accumulation", CTET1);
					CTET1.getSons().add(a);
					full.put("a", a);
					CompleteTextElementType b = new CompleteTextElementType("Frequency of use", CTET1);
					CTET1.getSons().add(b);
					full.put("b", b);
					CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
					CTET1.getSons().add(n3);
					full.put("3", n3);
					CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
					CTET1.getSons().add(n5);
					full.put("5", n5);
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
					String Iden="585";
					Datos.getSons().add(I1);
					CompleteElementType CTET1=new CompleteElementType("Exhibitions Note", I1);
					I1.getSons().add(CTET1);
					HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
					CompleteTextElementType a = new CompleteTextElementType("Exhibitions note", CTET1);
					CTET1.getSons().add(a);
					full.put("a", a);
					CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
					CTET1.getSons().add(n3);
					full.put("3", n3);
					CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
					CTET1.getSons().add(n5);
					full.put("5", n5);
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
					String Iden="586";
					Datos.getSons().add(I1);
					CompleteElementType CTET1=new CompleteElementType("Awards Note", I1);
					I1.getSons().add(CTET1);
					CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
					CTET1.getSons().add(ID1);
					TablaD1.put(Iden, ID1);
					HashMap<String, String> full1I = new HashMap<String, String>();
					full1I.put("#", "Awards");
					full1I.put("8", "No display constant generated");
					TablaID1.put(Iden, full1I);
					HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
					CompleteTextElementType a = new CompleteTextElementType("Awards note", CTET1);
					CTET1.getSons().add(a);
					full.put("a", a);
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
					String Iden="588";
					Datos.getSons().add(I1);
					CompleteElementType CTET1=new CompleteElementType("Source of Description Note", I1);
					I1.getSons().add(CTET1);
					CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
					CTET1.getSons().add(ID1);
					TablaD1.put(Iden, ID1);
					HashMap<String, String> full1I = new HashMap<String, String>();
					full1I.put("#", "No information provided");
					full1I.put("0", "Source of description");
					full1I.put("1", "Latest issue consulted");
					TablaID1.put(Iden, full1I);
					HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
					CompleteTextElementType a = new CompleteTextElementType("Source of description note", CTET1);
					CTET1.getSons().add(a);
					full.put("a", a);
					CompleteTextElementType n5 = new CompleteTextElementType("Institution to which field applies", CTET1);
					CTET1.getSons().add(n5);
					full.put("5", n5);
					CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
					CTET1.getSons().add(n6);
					full.put("6", n6);
					CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
					CTET1.getSons().add(n8);
					full.put("8", n8);
					TablaD.put(Iden, full);
					}
			
			
			
			
			{
			//Caso Raro 59X
			CompleteIterator I1=new CompleteIterator(Datos);
			Datos.getSons().add(I1);
			Raro59X=new CompleteTextElementType("Local Notes", I1);
			I1.getSons().add(Raro59X);
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
		case "590":
			return true;
		case "591":
			return true;
		case "592":
			return true;
		case "593":
			return true;
		case "594":
			return true;
		case "595":
			return true;
		case "596":
			return true;
		case "597":
			return true;
		case "598":
			return true;
		case "599":
			return true;
		default:
			return false;
		}
	}
	
	public void processCadena(String Cadena, CompleteDocuments d, LoadCollectionMARCXML lCole,int RecordNumber,int ambito)
	{
		if (Cadena.length()==15)
			{
///				0 - Type of date/Publication status 
//		    /1-4 - Date 1 
//		    /5-8 - Date 2 
//		    /9-11 - Place of publication, production, or execution 
//		    /12 - Frequency 
//		    /13 - Regularity 
//		    /14 - Form of item 
			{
			String Valor=Cadena.substring(0, 1);
			CompleteTextElement nuevo=new CompleteTextElement(n533n7n0, Valor);
			ArrayList<Integer> Ambitos=new ArrayList<Integer>();
			Ambitos.add(ambito);
			nuevo.setAmbitos(Ambitos);
			d.getDescription().add(nuevo);
			nuevo.setDocumentsFather(d);
			}
			
			{
				String Valor=Cadena.substring(1, 5);
				CompleteTextElement nuevo=new CompleteTextElement(n533n7n1_4, Valor);
				ArrayList<Integer> Ambitos=new ArrayList<Integer>();
				Ambitos.add(ambito);
				nuevo.setAmbitos(Ambitos);
				d.getDescription().add(nuevo);
				nuevo.setDocumentsFather(d);
				}
			
			{
				String Valor=Cadena.substring(5, 9);
				CompleteTextElement nuevo=new CompleteTextElement(n533n7n5_8, Valor);
				ArrayList<Integer> Ambitos=new ArrayList<Integer>();
				Ambitos.add(ambito);
				nuevo.setAmbitos(Ambitos);
				d.getDescription().add(nuevo);
				nuevo.setDocumentsFather(d);
				}
			
			{
				String Valor=Cadena.substring(9, 12);
				CompleteTextElement nuevo=new CompleteTextElement(n533n7n9_11, Valor);
				ArrayList<Integer> Ambitos=new ArrayList<Integer>();
				Ambitos.add(ambito);
				nuevo.setAmbitos(Ambitos);
				d.getDescription().add(nuevo);
				nuevo.setDocumentsFather(d);
				}
			
			{
				String Valor=Cadena.substring(12, 13);
				CompleteTextElement nuevo=new CompleteTextElement(n533n7n12, Valor);
				ArrayList<Integer> Ambitos=new ArrayList<Integer>();
				Ambitos.add(ambito);
				nuevo.setAmbitos(Ambitos);
				d.getDescription().add(nuevo);
				nuevo.setDocumentsFather(d);
				}
			
			{
				String Valor=Cadena.substring(13, 14);
				CompleteTextElement nuevo=new CompleteTextElement(n533n7n13, Valor);
				ArrayList<Integer> Ambitos=new ArrayList<Integer>();
				Ambitos.add(ambito);
				nuevo.setAmbitos(Ambitos);
				d.getDescription().add(nuevo);
				nuevo.setDocumentsFather(d);
				}
			
			{
				String Valor=Cadena.substring(14);
				CompleteTextElement nuevo=new CompleteTextElement(n533n7n14, Valor);
				ArrayList<Integer> Ambitos=new ArrayList<Integer>();
				Ambitos.add(ambito);
				nuevo.setAmbitos(Ambitos);
				d.getDescription().add(nuevo);
				nuevo.setDocumentsFather(d);
				}
			}
		else
			lCole.getLog().add("(Record = "+RecordNumber+") Warning: Reproduction Note with value 'Fixed-length data elements of reproduction'=  "+Cadena+" hasdiferent sice than expected (5) actual= "+Cadena.length());
	}

	public CompleteTextElementType getRaro59X() {
		return Raro59X;
	}

}
