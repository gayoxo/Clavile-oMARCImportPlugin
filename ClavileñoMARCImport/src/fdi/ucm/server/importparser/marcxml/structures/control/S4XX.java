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
public class S4XX implements InterfaceMARCXMLparser {
	
	private CompleteElementType Datos;
	private HashMap<String, HashMap<String, CompleteTextElementType>> TablaD;
	private HashMap<String, HashMap<String, String>> TablaID1;
	private HashMap<String, CompleteTextElementType> TablaD1;

	public S4XX(CompleteElementType datos,
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
		
//490 - Series Statement (R) Full | Concise
//ID1	Series tracing policy
//		0 - Series not traced
//		1 - Series traced 
		
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
			full1I.put("0", "Series not traced");
			full1I.put("1", "Series traced");
			TablaID1.put("490", full1I);
			
			CompleteTextElementType ID1 = new CompleteTextElementType("Series tracing policy", CTET1);
			CTET1.getSons().add(ID1);
			
			TablaD1.put("490", ID1);
			
			
			CompleteTextElementType a = new CompleteTextElementType("Series statement", CTET1);
			CTET1.getSons().add(a);
			
			CompleteTextElementType l = new CompleteTextElementType("Library of Congress call number", CTET1);
			CTET1.getSons().add(l);
			
			CompleteTextElementType v = new CompleteTextElementType("Volume/sequential designation", CTET1);
			CTET1.getSons().add(v);
			
			CompleteTextElementType x = new CompleteTextElementType("International Standard Serial Number", CTET1);
			CTET1.getSons().add(x);

			CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
			CTET1.getSons().add(n3);
			
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("l", l);
			full.put("v", v);
			full.put("x", x);
		
			full.put("3", n3);

			full.put("6", n6);
			full.put("8", n8);
			TablaD.put("490", full);
			
		}

		

	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessInstances()
	 */
	@Override
	public void ProcessInstances() {
		// se hace en otro metodo

	}

}
