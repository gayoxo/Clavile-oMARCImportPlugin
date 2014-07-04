/**
 * 
 */
package fdi.ucm.server.importparser.marcxml;

import java.util.HashMap;

import fdi.ucm.server.modelComplete.collection.CompleteCollection;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteGrammar;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteIterator;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteLinkElementType;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteTextElementType;

/**
 * @author Joaquin Gayoso-Cabada
 *
 */
public class CompleteGrammarAuthor implements InterfaceMARCXMLparser {

	private CompleteGrammar CG;
//	private HashMap<String, String> ID1Values;
//	private CompleteTextElementType ID1Type;
	private HashMap<String, CompleteTextElementType> X100Values;
	private CompleteLinkElementType Obras;


	public CompleteGrammarAuthor(String autor, String autordesc,
			CompleteCollection coleccionstatica) {
		CG=new CompleteGrammar(autor, autordesc, coleccionstatica);

	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessAttributes()
	 */
	@Override
	public void ProcessAttributes() {

//		ID1Values = new HashMap<String, String>();
//		ID1Values.put("0", "Forename");
//		ID1Values.put("1", "Surname");
//		ID1Values.put("3", "Family name");
//		
//		
//		ID1Type = new CompleteTextElementType("Type of personal name entry element", CG);
//		CG.getSons().add(ID1Type);

		
		
		CompleteTextElementType a = new CompleteTextElementType("Personal name", CG);
		CG.getSons().add(a);
		
		CompleteTextElementType b = new CompleteTextElementType("Numeration", CG);
		CG.getSons().add(b);
		
		CompleteTextElementType c = new CompleteTextElementType("Titles and words associated with a name", CG);
		CG.getSons().add(c);
		
		CompleteTextElementType d = new CompleteTextElementType("Dates associated with a name", CG);
		CG.getSons().add(d);
		
		CompleteTextElementType e = new CompleteTextElementType("Relator term", CG);
		CG.getSons().add(e);
		
		CompleteTextElementType f = new CompleteTextElementType("Date of a work", CG);
		CG.getSons().add(f);
		
		CompleteTextElementType g = new CompleteTextElementType("Miscellaneous information", CG);
		CG.getSons().add(g);
		
		CompleteTextElementType j = new CompleteTextElementType("Attribution qualifier", CG);
		CG.getSons().add(j);
		
		CompleteTextElementType k = new CompleteTextElementType("Form subheading", CG);
		CG.getSons().add(k);
		
		CompleteTextElementType l = new CompleteTextElementType("Language of a work", CG);
		CG.getSons().add(l);
		
		CompleteTextElementType n = new CompleteTextElementType("Number of part/section of a work", CG);
		CG.getSons().add(n);
		
		CompleteTextElementType p = new CompleteTextElementType("Name of part/section of a work", CG);
		CG.getSons().add(p);
		
		CompleteTextElementType q = new CompleteTextElementType("Fuller form of name", CG);
		CG.getSons().add(q);
		
		CompleteTextElementType t = new CompleteTextElementType("Title of a work", CG);
		CG.getSons().add(t);
		
		CompleteTextElementType u = new CompleteTextElementType("Affiliation", CG);
		CG.getSons().add(u);
		
		CompleteIterator CI=new CompleteIterator(CG);
		CG.getSons().add(CI);
		
		Obras = new CompleteLinkElementType("Obras", CI);
		CI.getSons().add(Obras);
//		
//		CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number", CG);
//		CG.getSons().add(n0);
//		
//		CompleteTextElementType n4 = new CompleteTextElementType("Relator code", CG);
//		CG.getSons().add(n4);
//		
//		CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CG);
//		CG.getSons().add(n6);
//		
//		CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CG);
//		CG.getSons().add(n8);
		
		X100Values = new HashMap<String, CompleteTextElementType>();
		X100Values.put("a", a);
		X100Values.put("b", b);
		X100Values.put("c", c);
		X100Values.put("d", d);
		X100Values.put("e", e);
		X100Values.put("f", f);
		X100Values.put("g", g);
		X100Values.put("j", j);
		X100Values.put("k", k);
		X100Values.put("l", l);
		X100Values.put("n", n);
		X100Values.put("p", p);
		X100Values.put("q", q);
		X100Values.put("t", t);
		X100Values.put("u", u);
//		X100Values.put("0", n0);
//		X100Values.put("4", n4);
//		X100Values.put("6", n6);
//		X100Values.put("8", n8);

	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessInstances()
	 */
	@Override
	public void ProcessInstances() {


	}

	public CompleteGrammar getGrammar() {
		return CG;
	}

	/**
	 * @return the cG
	 */
	public CompleteGrammar getCG() {
		return CG;
	}

	/**
	 * @param cG the cG to set
	 */
	public void setCG(CompleteGrammar cG) {
		CG = cG;
	}

//	/**
//	 * @return the iD1Values
//	 */
//	public HashMap<String, String> getID1Values() {
//		return ID1Values;
//	}
//
//	/**
//	 * @param iD1Values the iD1Values to set
//	 */
//	public void setID1Values(HashMap<String, String> iD1Values) {
//		ID1Values = iD1Values;
//	}
//
//	/**
//	 * @return the iD1Type
//	 */
//	public CompleteTextElementType getID1Type() {
//		return ID1Type;
//	}
//
//	/**
//	 * @param iD1Type the iD1Type to set
//	 */
//	public void setID1Type(CompleteTextElementType iD1Type) {
//		ID1Type = iD1Type;
//	}

	/**
	 * @return the x100Values
	 */
	public HashMap<String, CompleteTextElementType> getX100Values() {
		return X100Values;
	}

	/**
	 * @param x100Values the x100Values to set
	 */
	public void setX100Values(HashMap<String, CompleteTextElementType> x100Values) {
		X100Values = x100Values;
	}

	/**
	 * @return the obras
	 */
	public CompleteLinkElementType getObras() {
		return Obras;
	}

	/**
	 * @param obras the obras to set
	 */
	public void setObras(CompleteLinkElementType obras) {
		Obras = obras;
	}


	
	
}
