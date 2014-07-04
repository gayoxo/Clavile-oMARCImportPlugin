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
import fdi.ucm.server.modelComplete.collection.grammar.CompleteTextElementType;

/**
 * @author Joaquin Gayoso-Cabada
 *
 */
public class S7XXN7 implements InterfaceMARCXMLparser {

	CompleteTextElementType padre;
	ArrayList<HashMap<String, String>> TablaD=new ArrayList<HashMap<String, String>>();
	private CompleteTextElementType C2;
	private CompleteTextElementType C1;
	private CompleteTextElementType C3;
	private CompleteTextElementType C4;
	
	public S7XXN7(CompleteTextElementType n7) {
		padre=n7;
	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessAttributes()
	 */
	@Override
	public void ProcessAttributes() {
		
//		 0 - Type of main entry heading
//		    1 - Form of name
//		    2 - Type of record
//		    3 - Bibliographic level
		{
//			p - Personal name
//			c - Corporate name
//			m - Meeting name
//			u - Uniform title
//			n - Not applicable
			C1=new CompleteTextElementType("Type of main entry heading", padre);
			padre.getSons().add(C1);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("p", "Personal name");
			full1I.put("c", "Corporate name");
			full1I.put("m", "Meeting name");
			full1I.put("u", "Uniform title");
			full1I.put("n", "Not applicable");
			TablaD.add(full1I);
			
		}
		{
//			0 - Forename
//			1 - Single surname
//			2 - Multiple surname
//			3 - Family name
//			0 - Inverted name
//			1 - Jurisdiction name
//			2 - Name in direct order
//			n - Not applicable
			C2=new CompleteTextElementType("Form of name", padre);
			padre.getSons().add(C2);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Forename - Inverted name");
			full1I.put("1", "Single surname - Jurisdiction name");
			full1I.put("2", "Multiple surname - Name in direct order");
			full1I.put("3", "Family name");
			full1I.put("n", "Not applicable");

			TablaD.add(full1I);
			
		}
		{
//			a - Language material
//			c - Notated music
//			d - Manuscript notated music
//			e - Cartographic material
//			f - Manuscript cartographic material
//			g - Projected medium
//			i - Nonmusical sound recording
//			j - Musical sound recording
//			k - Two-dimensional nonprojectable graphic
//			m - Computer file
//			o - Kit
//			p - Mixed material
//			r - Three-dimensional artifact or naturally occurring object
//			t - Manuscript language material
			C3=new CompleteTextElementType("Type of record", padre);
			padre.getSons().add(C3);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("a", "Language material");
			full1I.put("c", "Notated music");
			full1I.put("d", "Manuscript notated music");
			full1I.put("e", "Cartographic material");
			full1I.put("f", "Manuscript cartographic material");
			full1I.put("g", "Projected medium");
			full1I.put("i", "Nonmusical sound recording");
			full1I.put("j", "Musical sound recording");
			full1I.put("k", "Two-dimensional nonprojectable graphic");
			full1I.put("m", "Computer file");
			full1I.put("o", "Kit");
			full1I.put("p", "Mixed material");
			full1I.put("r", "Three-dimensional artifact or naturally occurring object");
			full1I.put("t", "Manuscript language material");

			TablaD.add(full1I);
			
		}
		
		{
//			a - Monographic component part
//			b - Serial component part
//			c - Collection
//			d - Subunit
//			m - Monograph/item
//			s - Serial
//			i - Integrating resource
			C4=new CompleteTextElementType("Bibliographic level", padre);
			padre.getSons().add(C4);
			
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("a", "Monographic component part");
			full1I.put("b", "Serial component part");
			full1I.put("c", "Collection");
			full1I.put("d", "Subunit");
			full1I.put("m", "Monograph/item");
			full1I.put("s", "Serial");
			full1I.put("i", "Integrating resource");

			TablaD.add(full1I);
			
		}
	   

	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessInstances()
	 */
	@Override
	public void ProcessInstances() {

	}
	

	public void ProcessInstances(CompleteDocuments d,String Value,LoadCollectionMARCXML Lcole, int RecorNumber, int ambito) {
		if (Value.length()==4)
		{
			String n1=Value.substring(0, 1);
			String n2=Value.substring(1, 2);
			String n3=Value.substring(2, 3);
			String n4=Value.substring(3);
			
			{
				String ValueS=TablaD.get(0).get(n1);
				if(ValueS!=null)
				{
					CompleteTextElement nuevo=new CompleteTextElement(C1, ValueS);
					ArrayList<Integer> Ambitos=new ArrayList<Integer>();
					Ambitos.add(ambito);
					nuevo.setAmbitos(Ambitos);
					d.getDescription().add(nuevo);
					nuevo.setDocumentsFather(d);
				}
				else Lcole.getLog().add("(Record = "+RecorNumber+")  Warning: TAG: 760:"+Value+" value 1 asociado a: "+n1 + " no encontrado");
				
			}
			{
				String ValueS=TablaD.get(1).get(n2);
				if(ValueS!=null)
				{
					CompleteTextElement nuevo=new CompleteTextElement(C2, ValueS);
					ArrayList<Integer> Ambitos=new ArrayList<Integer>();
					Ambitos.add(ambito);
					nuevo.setAmbitos(Ambitos);
					d.getDescription().add(nuevo);
					nuevo.setDocumentsFather(d);
				}
				else Lcole.getLog().add("(Record = "+RecorNumber+")  Warning: TAG: 760:"+Value+" value 2 asociado a: "+n2 + " no encontrado");
				
			}
			{
				String ValueS=TablaD.get(2).get(n3);
				if(ValueS!=null)
				{
					CompleteTextElement nuevo=new CompleteTextElement(C3, ValueS);
					ArrayList<Integer> Ambitos=new ArrayList<Integer>();
					Ambitos.add(ambito);
					nuevo.setAmbitos(Ambitos);
					d.getDescription().add(nuevo);
					nuevo.setDocumentsFather(d);
				}
				else Lcole.getLog().add("(Record = "+RecorNumber+")  Warning: TAG: 760:"+Value+" value 3 asociado a: "+n3 + " no encontrado");
				
			}
			{
				String ValueS=TablaD.get(3).get(n4);
				if(ValueS!=null)
				{
					CompleteTextElement nuevo=new CompleteTextElement(C1, ValueS);
					ArrayList<Integer> Ambitos=new ArrayList<Integer>();
					Ambitos.add(ambito);
					nuevo.setAmbitos(Ambitos);
					d.getDescription().add(nuevo);
					nuevo.setDocumentsFather(d);
				}
				else Lcole.getLog().add("(Record = "+RecorNumber+")  Warning: TAG: 760:"+Value+" value 4 asociado a: "+n4 + " no encontrado");
				
			}
		}
		else
		{
			Lcole.getLog().add("(Record = "+RecorNumber+")  Warning: TAG: 760:"+Value+" longitud incorrecta, deberia ser 4 y es: "+Value.length());
			}
			

	}

}
