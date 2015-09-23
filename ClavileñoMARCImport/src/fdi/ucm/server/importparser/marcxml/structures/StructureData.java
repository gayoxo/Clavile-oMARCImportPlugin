/**
 * 
 */
package fdi.ucm.server.importparser.marcxml.structures;

import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser;
import fdi.ucm.server.importparser.marcxml.LoadCollectionMARCXML;
import fdi.ucm.server.importparser.marcxml.structures.control.S0XX;
import fdi.ucm.server.importparser.marcxml.structures.control.S1XX;
import fdi.ucm.server.importparser.marcxml.structures.control.S2XX;
import fdi.ucm.server.importparser.marcxml.structures.control.S3XX;
import fdi.ucm.server.importparser.marcxml.structures.control.S4XX;
import fdi.ucm.server.importparser.marcxml.structures.control.S5XX;
import fdi.ucm.server.importparser.marcxml.structures.control.S6XX;
import fdi.ucm.server.importparser.marcxml.structures.control.S7XX;
import fdi.ucm.server.importparser.marcxml.structures.control.S8XX;
import fdi.ucm.server.modelComplete.collection.document.CompleteDocuments;
import fdi.ucm.server.modelComplete.collection.document.CompleteElement;
import fdi.ucm.server.modelComplete.collection.document.CompleteLinkElement;
import fdi.ucm.server.modelComplete.collection.document.CompleteTextElement;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteElementType;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteGrammar;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteStructure;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteTextElementType;

/**
 * @author Joaquin Gayoso-Cabada
 *
 */
public class StructureData implements InterfaceMARCXMLparser {

	private LoadCollectionMARCXML LColec;
	private CompleteElementType Datos;
	private HashMap<String, HashMap<String, CompleteTextElementType>> TablaD;
	private HashMap<String, HashMap<String, String>> TablaID1;
	private HashMap<String, HashMap<String, String>> TablaID2;
	private HashMap<String, CompleteTextElementType> TablaD1;
	private HashMap<String, CompleteTextElementType> TablaD2;
	private HashMap<String, Integer> TablaRep;
	private S0XX CS0XX;
	private S5XX CS5XX;
	private S6XX CS6XX;
	private S7XX CS7XX;
	private S8XX CS8XX;
	private S1XX CS1XX;

	public StructureData(CompleteGrammar obra, LoadCollectionMARCXML lCole) {
		Datos=new CompleteElementType("Datos", obra);
		LColec=lCole;
		TablaD=new HashMap<String, HashMap<String, CompleteTextElementType>>();
		TablaID1=new HashMap<String, HashMap<String,String>>();
		TablaID2=new HashMap<String, HashMap<String,String>>();
		TablaD1=new HashMap<String, CompleteTextElementType>();
		TablaD2=new HashMap<String, CompleteTextElementType>();
	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessAttributes()
	 */
	@Override
	public void ProcessAttributes() {
		CS0XX= new S0XX(Datos,TablaD,TablaID1,TablaID2,TablaD1,TablaD2);
		CS0XX.ProcessAttributes();
		
		CS1XX = new S1XX(Datos,TablaD,TablaID1,TablaID2,TablaD1,TablaD2);
		CS1XX.ProcessAttributes();
		
		S2XX CS2XX = new S2XX(Datos,TablaD,TablaID1,TablaID2,TablaD1,TablaD2);
		CS2XX.ProcessAttributes();
		
		S3XX CS3XX = new S3XX(Datos,TablaD,TablaID1,TablaID2,TablaD1,TablaD2);
		CS3XX.ProcessAttributes();
		
		S4XX CS4XX = new S4XX(Datos,TablaD,TablaID1,TablaID2,TablaD1,TablaD2);
		CS4XX.ProcessAttributes();
		
		CS5XX = new S5XX(Datos,TablaD,TablaID1,TablaID2,TablaD1,TablaD2);
		CS5XX.ProcessAttributes();

		CS6XX = new S6XX(Datos,TablaD,TablaID1,TablaID2,TablaD1,TablaD2);
		CS6XX.ProcessAttributes();
		
		CS7XX = new S7XX(Datos,TablaD,TablaID1,TablaID2,TablaD1,TablaD2);
		CS7XX.ProcessAttributes();
		
		CS8XX = new S8XX(Datos,TablaD,TablaID1,TablaID2,TablaD1,TablaD2);
		CS8XX.ProcessAttributes();
	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessInstances()
	 */
	@Override
	public void ProcessInstances() {
		// Se hace en otro proceso

	}

	public CompleteStructure getStructure() {
		return Datos;
	}


	public void ProcessInstances(NodeList nodeList, CompleteDocuments d, int RecorNumber) {
		TablaRep=new HashMap<String, Integer>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node controled = nodeList.item(i);
			if (controled!=null)
				{
				Node TAG = controled.getAttributes().getNamedItem("tag");
				Node Id1 = controled.getAttributes().getNamedItem("ind1");
				Node Id2 = controled.getAttributes().getNamedItem("ind2");
				if (TAG!=null&&
					Id1!=null&&
					Id2!=null&&
					TAG.getNodeValue()!=null&&
					!TAG.getNodeValue().isEmpty()&&
					Id1.getNodeValue()!=null&&
					Id2.getNodeValue()!=null)
				{
					Integer I = TablaRep.get(TAG.getNodeValue());
					int Ambito=0;
					if (I==null)
						{
						TablaRep.put(TAG.getNodeValue(), new Integer(Ambito));
						}
					else {
						Ambito=I.intValue();
						Ambito++;
						TablaRep.put(TAG.getNodeValue(), new Integer(Ambito));
					}
					
					ProcesaNodo(controled,TAG.getNodeValue(),Id1.getNodeValue(),Id2.getNodeValue(),d,Ambito,RecorNumber);
				}
				else
					{
					String ValueError = null;
					if (TAG!=null)
						ValueError=TAG.getNodeValue();
					String ValueInd1 = null;
					if (Id1!=null)
						ValueInd1=Id1.getNodeValue();
					String ValueInd2 = null;
					if (Id2!=null)
						ValueInd2=Id2.getNodeValue();
					LColec.getLog().add("(Record = "+RecorNumber+")  Warning: TAG: "+TAG+":"+ValueError+" Indice1: "+Id1+":"+ValueInd1+" Indice2: "+Id2+":"+ValueInd2);
					}
					
					
				}
		}
		
	}

	private void ProcesaNodo(Node controled, String tagS,
			String ind1s, String ind2s, CompleteDocuments d, int ambito,int RecorNumber) {
		
//		Procesa los incices
		 CompleteTextElementType tablaD1 = TablaD1.get(tagS);
		 HashMap<String, String> tablaID1 = TablaID1.get(tagS);
		 if (tablaD1!=null&&tablaID1!=null)
		 	{
			 if (ind1s.trim().isEmpty())
				 ind1s="#";
			 String ValorD1 = tablaID1.get(ind1s);
			 
			 //Si el valor falla pruebo con #
			 if (ValorD1==null)
				 ValorD1 = tablaID1.get("#");
			 
			 if (ValorD1!=null)
			 {
			 CompleteTextElement nuevo=new CompleteTextElement(tablaD1, ValorD1);
				ArrayList<Integer> Ambitos=new ArrayList<Integer>();
				Ambitos.add(ambito);
				nuevo.setAmbitos(Ambitos);
				d.getDescription().add(nuevo);
				nuevo.setDocumentsFather(d);
			 }
			 else LColec.getLog().add("(Record = "+RecorNumber+") Warning, valor no encontrado o no se admite valor vacio TAG: "+tagS+" valor1:"+ind1s);
				 
		 	}
		 
		 CompleteTextElementType tablaD2 = TablaD2.get(tagS);
		 HashMap<String, String> tablaID2 = TablaID2.get(tagS);
		 if (tablaD2!=null&&tablaID2!=null)
		 	{
			 if (ind2s.trim().isEmpty())
				 ind2s="#";
			 String ValorD2 = tablaID2.get(ind2s);
			 
			//Si el valor falla pruebo con #
			 if (ValorD2==null)
				 ValorD2 = tablaID2.get("#");
			 
			 if (ValorD2!=null)
			 {
			 CompleteTextElement nuevo=new CompleteTextElement(tablaD2, ValorD2);
				ArrayList<Integer> Ambitos=new ArrayList<Integer>();
				Ambitos.add(ambito);
				nuevo.setAmbitos(Ambitos);
				d.getDescription().add(nuevo);
				nuevo.setDocumentsFather(d);
			 }
			 else LColec.getLog().add("(Record = "+RecorNumber+") Warning, valor no encontrado o no se admite valor vacio TAG: "+tagS+" valor2:"+ind2s);
				 
			 }
		 
//		Procesa subdfiels
		
		if (CS0XX.isRaro(tagS))
		{
			//Numeros de telefono no importa el indice 1 ni el 2
			Node Valor = controled.getFirstChild();
			if (Valor!=null&&Valor.getNodeValue()!=null&&!Valor.getNodeValue().isEmpty())
				{
				CompleteTextElement nuevo=new CompleteTextElement(CS0XX.getRaro09X(), Valor.getNodeValue());
				ArrayList<Integer> Ambitos=new ArrayList<Integer>();
				Ambitos.add(ambito);
				nuevo.setAmbitos(Ambitos);
				d.getDescription().add(nuevo);
				nuevo.setDocumentsFather(d);
				}
			else
			{
				LColec.getLog().add("(Record = "+RecorNumber+") Warning: value nulo o vacio TAG: "+tagS+" Indice1: "+ind1s+" Indice2: "+ind2s);
			}
		}
		else if (CS5XX.isRaro(tagS))
		{
			//Local Notes no importa el indice 1 ni el 2
			Node Valor = controled.getFirstChild();
			if (Valor!=null&&Valor.getNodeValue()!=null&&!Valor.getNodeValue().isEmpty())
				{
				CompleteTextElement nuevo=new CompleteTextElement(CS5XX.getRaro59X(), Valor.getNodeValue());
				ArrayList<Integer> Ambitos=new ArrayList<Integer>();
				Ambitos.add(ambito);
				nuevo.setAmbitos(Ambitos);
				d.getDescription().add(nuevo);
				nuevo.setDocumentsFather(d);
				}
			else
			{
				LColec.getLog().add("(Record = "+RecorNumber+") Warning: value nulo o vacio TAG: "+tagS+" Indice1: "+ind1s+" Indice2: "+ind2s);
			}
		}else if (CS6XX.isRaro(tagS))
		{
			//Local Notes no importa el indice 1 ni el 2
			Node Valor = controled.getFirstChild();
			if (Valor!=null&&Valor.getNodeValue()!=null&&!Valor.getNodeValue().isEmpty())
				{
				CompleteTextElement nuevo=new CompleteTextElement(CS6XX.getRaro69X(), Valor.getNodeValue());
				ArrayList<Integer> Ambitos=new ArrayList<Integer>();
				Ambitos.add(ambito);
				nuevo.setAmbitos(Ambitos);
				d.getDescription().add(nuevo);
				nuevo.setDocumentsFather(d);
				}
			else
			{
				LColec.getLog().add("(Record = "+RecorNumber+") Warning: value nulo o vacio TAG: "+tagS+" Indice1: "+ind1s+" Indice2: "+ind2s);
			}
		}else if (CS8XX.raroT8(tagS))
		{
			//Local Notes no importa el indice 1 ni el 2
			Node Valor = controled.getFirstChild();
			if (Valor!=null&&Valor.getNodeValue()!=null&&!Valor.getNodeValue().isEmpty())
				{
				CompleteTextElementType Raro8=CS8XX.getRaroT8(tagS);
				if (Raro8!=null)
				{
				CompleteTextElement nuevo=new CompleteTextElement(Raro8, Valor.getNodeValue());
				ArrayList<Integer> Ambitos=new ArrayList<Integer>();
				Ambitos.add(ambito);
				nuevo.setAmbitos(Ambitos);
				d.getDescription().add(nuevo);
				nuevo.setDocumentsFather(d);
				}
				else
					{
					LColec.getLog().add("(Record = "+RecorNumber+") Warning: value TAG no encontrado para TAG: "+tagS+" en la seleccion 8XX");
					}
				}
			else
			{
				LColec.getLog().add("(Record = "+RecorNumber+") Warning: value nulo o vacio TAG: "+tagS+" Indice1: "+ind1s+" Indice2: "+ind2s);
			}
		}else if (CS8XX.is880(tagS))
		{
			
				LColec.getLog().add("(Record = "+RecorNumber+") Warning: Alternate Graphic Representation is too complex to parse");
			
		}else if (CS8XX.is886(tagS))
		{
			
			LColec.getLog().add("(Record = "+RecorNumber+") Warning: Foreign MARC Information Field is too complex to parse");
		
	}else
		{
		
		
		
		if (tagS.equals("100"))
		{
		CompleteDocuments AutorTemporal=new CompleteDocuments(LColec.getCollectionXMLparser().getColeccion(), "TemporalName", "");
		if (controled instanceof Element)
		{
		NodeList nodelistadata = ((Element)controled).getElementsByTagName("subfield");
		if(nodelistadata != null)
			for (int i = 0; i < nodelistadata.getLength(); i++) {
				Procesasubfield(nodelistadata.item(i),AutorTemporal,RecorNumber);
			}
		}
		if (!AutorTemporal.getDescriptionText().isEmpty())
			{
			CompleteDocuments Autor = LColec.getCollectionXMLparser().getListaAutores().get(AutorTemporal.getDescriptionText());
			
			Integer A=0;
			
			if(Autor==null)
			{
			LColec.getCollectionXMLparser().getColeccion().getEstructuras().add(AutorTemporal);
			LColec.getCollectionXMLparser().getListaAutores().put(AutorTemporal.getDescriptionText(), AutorTemporal);
			
			Autor=AutorTemporal;
			
			}
			else
			{
			combineDocs(AutorTemporal,Autor);	
			A=LColec.getCollectionXMLparser().getAmbitoAuthor().get(AutorTemporal.getDescriptionText());
			}
			
			int tem=A.intValue();
			tem++;
			LColec.getCollectionXMLparser().getAmbitoAuthor().put(AutorTemporal.getDescriptionText(), new Integer(tem));
			
			CompleteLinkElement nuevo=new CompleteLinkElement(LColec.getCollectionXMLparser().getAuthorClase().getObras(), d);
			ArrayList<Integer> Ambitos=new ArrayList<Integer>();
			Ambitos.add(A);
			nuevo.setAmbitos(Ambitos);
			AutorTemporal.getDescription().add(nuevo);
			nuevo.setDocumentsFather(AutorTemporal);
			
			}
		}
		
		if (tagS.equals("700"))
		{
		CompleteDocuments AutorTemporal=new CompleteDocuments(LColec.getCollectionXMLparser().getColeccion(), "TemporalName", "");
		if (controled instanceof Element)
		{
		NodeList nodelistadata = ((Element)controled).getElementsByTagName("subfield");
		if(nodelistadata != null)
			for (int i = 0; i < nodelistadata.getLength(); i++) {
				Procesasubfield(nodelistadata.item(i),AutorTemporal,RecorNumber);
			}
		}
		if (!AutorTemporal.getDescriptionText().isEmpty())
			{
			CompleteDocuments Autor = LColec.getCollectionXMLparser().getListaAutores().get(AutorTemporal.getDescriptionText());
			
			Integer A=0;
			
			if(Autor==null)
			{
			LColec.getCollectionXMLparser().getColeccion().getEstructuras().add(AutorTemporal);
			LColec.getCollectionXMLparser().getListaAutores().put(AutorTemporal.getDescriptionText(), AutorTemporal);
			
			Autor=AutorTemporal;
			
			}
			else
			{
			combineDocs(AutorTemporal,Autor);	
			A=LColec.getCollectionXMLparser().getAmbitoAuthor().get(AutorTemporal.getDescriptionText());
			}
			
			int tem=A.intValue();
			tem++;
			LColec.getCollectionXMLparser().getAmbitoAuthor().put(AutorTemporal.getDescriptionText(), new Integer(tem));
			
			CompleteLinkElement nuevo=new CompleteLinkElement(LColec.getCollectionXMLparser().getAuthorClase().getObras(), d);
			ArrayList<Integer> Ambitos=new ArrayList<Integer>();
			Ambitos.add(A);
			nuevo.setAmbitos(Ambitos);
			AutorTemporal.getDescription().add(nuevo);
			nuevo.setDocumentsFather(AutorTemporal);
			
			}
		}
		
		
		HashMap<String, CompleteTextElementType> tablaID = TablaD.get(tagS);
		
		if (tablaID!=null)
		{
			if (controled instanceof Element)
				{
				NodeList nodelistadata = ((Element)controled).getElementsByTagName("subfield");
				if(nodelistadata != null)
					for (int i = 0; i < nodelistadata.getLength(); i++) {
						Procesasubfield(tablaID,nodelistadata.item(i),d,ambito,tagS,RecorNumber);
					}
				}
			else
			{
				
				//Problemas si pasa
				System.out.println("Problemas al procesar nodo");
				NodeList nodeListXMLson = controled.getChildNodes();
				if(nodeListXMLson != null)
					for (int i = 0; i < nodeListXMLson.getLength(); i++) {
						ProcesaNodo(nodeListXMLson.item(i),tagS,ind1s,ind2s,d,ambito,RecorNumber);
					}
			}
		}
		else
		{
			LColec.getLog().add("(Record = "+RecorNumber+") Warning: Tag deconocido TAG: "+tagS+" Indice1: "+ind1s+" Indice2: "+ind2s);
		}
		}
		
	}

	private void combineDocs(CompleteDocuments enddoc, CompleteDocuments adddder) {
		for (CompleteElement elementsource : adddder.getDescription()) {
			for (CompleteElement elementDestino : enddoc.getDescription()) {
				if (
					elementDestino.getHastype().equals(elementsource.getHastype())&&
					elementDestino instanceof CompleteTextElement && elementsource instanceof CompleteTextElement &&
					!((CompleteTextElement)elementDestino).getValue().equals(((CompleteTextElement)elementsource).getValue())
						)
				{
					((CompleteTextElement)elementDestino).setValue(((CompleteTextElement)elementDestino).getValue()+((CompleteTextElement)elementsource).getValue());
				}
					
			}
		} 
		
	}

	private void Procesasubfield(Node node, CompleteDocuments d,int RecorNumber) {
		if (node instanceof Element)
		{
			Node code = node.getAttributes().getNamedItem("code");
			if (code!=null&&!code.getNodeValue().isEmpty())
			{
				CompleteTextElementType valor = LColec.getCollectionXMLparser().getAuthorClase().getX100Values().get(code.getNodeValue());
				
				if (valor!=null)
				{
					Node valorNode = node.getFirstChild();
					if (valorNode!=null)
						{
						String ValorSNodo=valorNode.getNodeValue();
						if (ValorSNodo!=null)
						{

							String ValueClean= ValorSNodo;
//							ValueClean = new String(ValorSNodo.getBytes());
							
							if (ValueClean.contains("?"))
								ValueClean=CleanUnicode(ValueClean);
							
							//Caso 100 Especial
							if (code.getNodeValue().equals("a"))
							{

									d.setDescriptionText(ValueClean);
									
							} 
	
							CompleteTextElement nuevo=new CompleteTextElement(valor, ValueClean);
							ArrayList<Integer> Ambitos=new ArrayList<Integer>();
							nuevo.setAmbitos(Ambitos);
							d.getDescription().add(nuevo);
							nuevo.setDocumentsFather(d);
							
							
						}else
							{
							LColec.getLog().add("(Record = "+RecorNumber+") Warning: Valor en subfield vacio, TAG: 100, Code: "+code.getNodeValue()+", Nodevalue: "+ValorSNodo);
							}
						}
					else
						{
						LColec.getLog().add("(Record = "+RecorNumber+") Warning: Valor en subfield con valor nulo desconocidoo, TAG: 100, Code: null");
						}
				}
//				else
//				{
//					LColec.getLog().add("(Record = "+RecorNumber+") Warning: Code en subfield desconocidoo, TAG: 100, Code: "+code.getNodeValue());
//				}
			}
			else
			{
				LColec.getLog().add("(Record = "+RecorNumber+") Warning: Code en subfield nulo o vacio, TAG: 100");
			}
			
		}
		else
		{
			NodeList nodeListXMLson = node.getChildNodes();
			if(nodeListXMLson != null)
				for (int i = 0; i < nodeListXMLson.getLength(); i++) {
					Procesasubfield(nodeListXMLson.item(i),d,RecorNumber);
				}
		}
		
	}

	private void Procesasubfield(
			HashMap<String, CompleteTextElementType> tablaID,
			Node node, CompleteDocuments d, int ambito, String tagS,int RecorNumber) {
		if (node instanceof Element)
		{
			Node code = node.getAttributes().getNamedItem("code");
			if (code!=null&&!code.getNodeValue().isEmpty())
			{
				CompleteTextElementType valor = tablaID.get(code.getNodeValue());
				
				if (valor!=null)
				{
					Node valorNode = node.getFirstChild();
					if (valorNode!=null)
						{
						String ValorSNodo=valorNode.getNodeValue();
						if (ValorSNodo!=null)
						{

							String ValueClean= ValorSNodo;
							ValueClean = new String(ValorSNodo.getBytes());
							
							
							//Caso Raro 800
							if (CS8XX.raroValor8(tagS)&&code.getNodeValue().equals("7"))							
								{
								ValueClean=CS8XX.getValueN7(ValueClean);
								if (ValueClean==null)
									{
									LColec.getLog().add("(Record = "+RecorNumber+") Warning: Valor en 8XX en campo 7 desconocido, TAG: "+tagS+", Code: "+code.getNodeValue()+", Nodevalue: "+ValorSNodo);
									ValueClean=ValorSNodo;
									}
								}
							
							
							if (ValueClean.contains("?"))
								ValueClean=CleanUnicode(ValueClean);
							
							
							
							//Caso 100 Especial
							if (tagS.equals("100")&&code.getNodeValue().equals("a"))
							{
								CompleteDocuments Autor = LColec.getCollectionXMLparser().getListaAutores().get(ValueClean);
								if (Autor!=null)
								{
									CompleteLinkElement nuevo=new CompleteLinkElement(CS1XX.getX100(), Autor);
									ArrayList<Integer> Ambitos=new ArrayList<Integer>();
									Ambitos.add(ambito);
									nuevo.setAmbitos(Ambitos);
									d.getDescription().add(nuevo);
									nuevo.setDocumentsFather(d);
								}
									
								
							} 
							
							
							if (tagS.equals("700")&&code.getNodeValue().equals("a"))
							{
								CompleteDocuments Autor = LColec.getCollectionXMLparser().getListaAutores().get(ValueClean);
								if (Autor!=null)
								{
									CompleteLinkElement nuevo=new CompleteLinkElement(CS1XX.getX100(), Autor);
									ArrayList<Integer> Ambitos=new ArrayList<Integer>();
									Ambitos.add(ambito);
									nuevo.setAmbitos(Ambitos);
									d.getDescription().add(nuevo);
									nuevo.setDocumentsFather(d);
								}
									
								
							} 
	
								
								
								CompleteTextElement nuevo=new CompleteTextElement(valor, ValueClean);
								ArrayList<Integer> Ambitos=new ArrayList<Integer>();
								Ambitos.add(ambito);
								nuevo.setAmbitos(Ambitos);
								d.getDescription().add(nuevo);
								nuevo.setDocumentsFather(d);
								
								//Caso raro del 533
								if (tagS.equals("533")&&code.getNodeValue().equals("7"))
									CS5XX.processCadena(ValueClean, d, LColec, RecorNumber, ambito);
								
								//Caso raro del 7XX
								if (CS7XX.raro7(tagS)&&code.getNodeValue().equals("7"))
									CS7XX.processCadena(tagS,ValueClean, d, LColec, RecorNumber, ambito);
								
								
								//Caso Descripccion
								if (tagS.equals("245")&&(code.getNodeValue().equals("a")||code.getNodeValue().equals("b")))
									d.setDescriptionText(d.getDescriptionText()+ValueClean);
								
							
						}else
							{
							LColec.getLog().add("(Record = "+RecorNumber+") Warning: Valor en subfield vacio, TAG: "+tagS+", Code: "+code.getNodeValue()+", Nodevalue: "+ValorSNodo);
							}
						}
					else
						{
						LColec.getLog().add("(Record = "+RecorNumber+") Warning: Valor en subfield con valor nulo desconocidoo, TAG: "+tagS+", Code: null");
						}
				}
				else
				{
					LColec.getLog().add("(Record = "+RecorNumber+") Warning: Code en subfield desconocidoo, TAG: "+tagS+", Code: "+code.getNodeValue());
				}
			}
			else
			{
				LColec.getLog().add("(Record = "+RecorNumber+") Warning: Code en subfield nulo o vacio, TAG: "+tagS);
			}
			
		}
		else
		{
			NodeList nodeListXMLson = node.getChildNodes();
			if(nodeListXMLson != null)
				for (int i = 0; i < nodeListXMLson.getLength(); i++) {
					Procesasubfield(tablaID,nodeListXMLson.item(i),d,ambito,tagS,RecorNumber);
				}
		}
		
	}

	private String CleanUnicode(String valueClean) {
		valueClean=valueClean.replace("a?","á");
		valueClean=valueClean.replace("e?","é");
		valueClean=valueClean.replace("i?","í");
		valueClean=valueClean.replace("o?","ó");
		valueClean=valueClean.replace("u?","ú");
		valueClean=valueClean.replace("n?","ñ");
		valueClean=valueClean.replace("A?","á");
		valueClean=valueClean.replace("E?","é");
		valueClean=valueClean.replace("I?","í");
		valueClean=valueClean.replace("O?","ó");
		valueClean=valueClean.replace("U?","ú");
		valueClean=valueClean.replace("N?","ñ");
		return valueClean;
	}

}
