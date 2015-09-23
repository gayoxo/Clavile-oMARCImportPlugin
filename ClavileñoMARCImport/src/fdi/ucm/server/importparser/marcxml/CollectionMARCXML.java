/**
 * 
 */
package fdi.ucm.server.importparser.marcxml;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import fdi.ucm.server.importparser.marcxml.structures.StructureControl;
import fdi.ucm.server.importparser.marcxml.structures.StructureData;
import fdi.ucm.server.importparser.marcxml.structures.StructureDirectory;
import fdi.ucm.server.importparser.marcxml.structures.StructureLeader;
import fdi.ucm.server.modelComplete.collection.CompleteCollection;
import fdi.ucm.server.modelComplete.collection.document.CompleteDocuments;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteGrammar;

/**
 * Clase que implementa la creacion de la base de datos per se
 * @author Joaquin Gayoso-Cabada
 *
 */
public class CollectionMARCXML implements InterfaceMARCXMLparser {

	private static final String COLECCION_A_APARTIR_DE_UN_MARCXML = "Coleccion a apartir de un MARCXML : ";
	private static final String MARCXML_COLLECTION = "MARCXML Collection";
	private HashMap<String, Integer> AmbitoAuthor;
	private CompleteCollection coleccionstatica;
	private String File;
	private CompleteGrammar Obra;
	private StructureLeader Leader;
	private LoadCollectionMARCXML LCole;
	private StructureDirectory Directory;
	private StructureControl Control;
	private StructureData Data;
	private HashMap<String, CompleteDocuments> ListaAutores;
	private CompleteGrammarAuthor AuthorClase;
	private CompleteGrammar Author;
	
 

	
	public CollectionMARCXML(LoadCollectionMARCXML lCole) {
		coleccionstatica=new CompleteCollection(MARCXML_COLLECTION, COLECCION_A_APARTIR_DE_UN_MARCXML+ new Timestamp(new Date().getTime()));
		LCole=lCole;
		ListaAutores=new HashMap<String, CompleteDocuments>();
		AmbitoAuthor=new HashMap<String, Integer>();
		
		
		
	}
	
	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.sql.SQLparserModel#ProcessAttributes()
	 */
	@Override
	public void ProcessAttributes() {
		AuthorClase = new CompleteGrammarAuthor(NameConstantsMARCXML.AUTOR, NameConstantsMARCXML.AUTORDESC, coleccionstatica);
		Author = AuthorClase.getGrammar();
		coleccionstatica.getMetamodelGrammar().add(Author);
		
		Obra = new CompleteGrammar(NameConstantsMARCXML.OBRA, NameConstantsMARCXML.OBRADESC, coleccionstatica);
		coleccionstatica.getMetamodelGrammar().add(Obra);
		
		atributosObra();
		
		atributosAuthor();
	}

	
	private void atributosAuthor() {
		AuthorClase.ProcessAttributes();
		
	}

	/**
	 * Procesa los atributos de una obra
	 */
	private void atributosObra() {
		Leader=new StructureLeader(Obra,LCole);
		Leader.ProcessAttributes();
		Leader.ProcessInstances();
		Obra.getSons().add(Leader.getStructure());
		
		Directory=new StructureDirectory(Obra,LCole);
		Directory.ProcessAttributes();
		Directory.ProcessInstances();
		Obra.getSons().add(Directory.getStructure());
		
		Control=new StructureControl(Obra,LCole);
		Control.ProcessAttributes();
		Control.ProcessInstances();
		Obra.getSons().add(Control.getStructure());
		
		Data=new StructureData(Obra,LCole);
		Data.ProcessAttributes();
		Data.ProcessInstances();
		Obra.getSons().add(Data.getStructure());
	}



	/**
	 * Procesa el documento
	 * @param dom
	 */
	private void process(Document dom) {
		org.w3c.dom.Element rootElement = dom.getDocumentElement();
		
//		System.out.println("//MIO//");
//		
//		NodeList nodeListXML = rootElement.getChildNodes();
//		processNode(nodeListXML);
		
		System.out.println("//MARC//");
		NodeList nodeListMARC = rootElement.getElementsByTagName("record");
		if(nodeListMARC != null)
			for (int i = 0; i < nodeListMARC.getLength(); i++) {
				CompleteDocuments D=new CompleteDocuments(coleccionstatica,  "", "");
				coleccionstatica.getEstructuras().add(D);
//				System.out.println("R"+i);
				Node Record = nodeListMARC.item(i);
				processLeader(Record,D,i);
				processDirectory(Record,D,i);
				processControl(Record,D,i);
				processData(Record,D,i);
//				processNode(Record);
			}
		
//		System.out.println("//DEMO//");
//		org.w3c.dom.NodeList nodeList = rootElement.getElementsByTagName("persona");
//		if(nodeList != null && nodeList.getLength()>0)
//				{
//				  for(int i=0;i<nodeList.getLength();i++)
//				  {
//				    org.w3c.dom.Element element = (org.w3c.dom.Element)nodeList.item(i);
//				    if(element.hasAttribute("sexo")) System.out.println(element.getAttribute("sexo"));
//				    org.w3c.dom.NodeList nodeList2 = element.getElementsByTagName("nombre");
//				    if(nodeList2 != null && nodeList2.getLength()>0)
//				    {
//				      org.w3c.dom.Element el = (org.w3c.dom.Element)nodeList2.item(0);
//				      System.out.println("Nombre: " + el.getFirstChild().getNodeValue());
//				    }
//				  }
//				}
		
	}

	private void processData(Node record, CompleteDocuments d, int RecorNumber) {
		if (record instanceof Element)
		{
		org.w3c.dom.NodeList nodeList=((Element) record).getElementsByTagName("datafield");
		if(nodeList != null)
			Data.ProcessInstances(nodeList, d,RecorNumber);

		}
		else 
		{
			NodeList nodeListXMLson = record.getChildNodes();
			if(nodeListXMLson != null)
				for (int i = 0; i < nodeListXMLson.getLength(); i++) {
					processData(nodeListXMLson.item(i), d,RecorNumber);
				}
		}
		
	}

	private void processControl(Node record, CompleteDocuments d, int RecorNumber) {
		if (record instanceof Element)
		{
		org.w3c.dom.NodeList nodeList=((Element) record).getElementsByTagName("controlfield");
		if(nodeList != null)
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node value = nodeList.item(i).getFirstChild();
				Node controled = nodeList.item(i);
				if (value!=null)
					Control.ProcessInstances(controled,value.getNodeValue(),d,RecorNumber);
			}
		}
		else 
		{
			NodeList nodeListXMLson = record.getChildNodes();
			if(nodeListXMLson != null)
				for (int i = 0; i < nodeListXMLson.getLength(); i++) {
					processControl(nodeListXMLson.item(i), d,RecorNumber);
				}
		}
		
	}

	private void processDirectory(Node record, CompleteDocuments d, int RecorNumber) {
		if (record instanceof Element)
		{
		org.w3c.dom.NodeList nodeList=((Element) record).getElementsByTagName("directory");
		if(nodeList != null)
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node elemmm = nodeList.item(i).getFirstChild();
				if (elemmm!=null)
					Directory.ProcessInstances(elemmm.getNodeValue(),d,RecorNumber);
			}
		}
		else 
		{
			NodeList nodeListXMLson = record.getChildNodes();
			if(nodeListXMLson != null)
				for (int i = 0; i < nodeListXMLson.getLength(); i++) {
					processDirectory(nodeListXMLson.item(i), d,RecorNumber);
				}
		}
		
	}

	private void processLeader(Node record, CompleteDocuments d, int RecorNumber) {
		if (record instanceof Element)
		{
		org.w3c.dom.NodeList nodeList=((Element) record).getElementsByTagName("leader");
		if(nodeList != null)
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node elemmm = nodeList.item(i).getFirstChild();
				if (elemmm!=null)
					Leader.ProcessInstances(elemmm.getNodeValue(),d,RecorNumber);
			}
		}
		else 
		{
			NodeList nodeListXMLson = record.getChildNodes();
			if(nodeListXMLson != null)
				for (int i = 0; i < nodeListXMLson.getLength(); i++) {
					processLeader(nodeListXMLson.item(i), d,RecorNumber);
				}
		}
		
	}

//	private void processNode(Node item) {
//		if (item instanceof Element)
//		{
//		Element element = (Element)item;
//		StringBuffer SB=new StringBuffer();
//		SB.append(element.getNodeName());
//		NamedNodeMap Atributes = element.getAttributes();
//		if (Atributes!=null&&Atributes.getLength()>0)
//		{
//			SB.append("{");
//		for (int j = 0; j < Atributes.getLength(); j++) {
//			Node Nodo = Atributes.item(j);
//			if (j!=0)
//				SB.append(",");
//			String value = "null";
//			if (Nodo.getNodeValue()!=null)
//				value=Nodo.getNodeValue().trim();
//
//			SB.append(Nodo.getNodeName().trim()+":"+value);
//		}
//			SB.append("}");
//		}
//		SB.append(":");
//		Node elemmm = element.getFirstChild();
//		if (elemmm!=null)
//			if (elemmm.getNodeValue()!=null)
//				SB.append(elemmm.getNodeValue().trim());
//			else
//				SB.append("null");
////		System.out.println(element.getNodeName().trim()+":"+element.getFirstChild().getNodeValue().trim());
//		System.out.println(SB.toString());
//		}
//		
//		NodeList nodeListXMLson = item.getChildNodes();
////		processNode(nodeListXMLson);
//		
//		if(nodeListXMLson != null)
//			for (int i = 0; i < nodeListXMLson.getLength(); i++) {
//				processNode(nodeListXMLson.item(i));
//			}
//		
//	}

//	private void processNode(NodeList nodeListXML) {
//		if(nodeListXML != null)
//			for (int i = 0; i < nodeListXML.getLength(); i++) {
//				if (nodeListXML.item(i) instanceof Element)
//				{
//				Element element = (Element)nodeListXML.item(i);
//				StringBuffer SB=new StringBuffer();
//				SB.append(element.getNodeName());
//				NamedNodeMap Atributes = element.getAttributes();
//				if (Atributes!=null&&Atributes.getLength()>0)
//				{
//					SB.append("{");
//				for (int j = 0; j < Atributes.getLength(); j++) {
//					Node Nodo = Atributes.item(j);
//					if (j!=0)
//						SB.append(",");
//					String value = "null";
//					if (Nodo.getNodeValue()!=null)
//						value=Nodo.getNodeValue().trim();
//
//					SB.append(Nodo.getNodeName().trim()+":"+value);
//				}
//					SB.append("}");
//				}
//				SB.append(":");
//				Node elemmm = element.getFirstChild();
//				if (elemmm!=null)
//					if (elemmm.getNodeValue()!=null)
//						SB.append(elemmm.getNodeValue().trim());
//					else
//						SB.append("null");
//		//		System.out.println(element.getNodeName().trim()+":"+element.getFirstChild().getNodeValue().trim());
//				System.out.println(SB.toString());
//				NodeList nodeListXMLson = element.getChildNodes();
//				processNode(nodeListXMLson);
//				}
//				else
//				{
////					System.out.println(nodeListXML.item(i).getNodeName()+":"+nodeListXML.item(i).getNodeValue());
//					NodeList nodeListXMLson = nodeListXML.item(i).getChildNodes();
//					processNode(nodeListXMLson);
//				}
//			}
//		
//	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.sql.SQLparserModel#ProcessInstances()
	 */
	@Override
	public void ProcessInstances() {
		org.w3c.dom.Document dom;
		javax.xml.parsers.DocumentBuilderFactory dbf;
		javax.xml.parsers.DocumentBuilder db;

		dbf = javax.xml.parsers.DocumentBuilderFactory.newInstance();

		try
		{
		  db = dbf.newDocumentBuilder();
		  dom = db.parse(File);
		  process(dom);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException("Error procesing XML");
		}


	}

	public void setFilename(String filename) {
		File=filename;
		
	}

	/**
	 * @return the coleccionstatica
	 */
	public CompleteCollection getColeccion() {
		return coleccionstatica;
	}

	

public void deleteFile()
{
	try {
		java.io.File fichero = new java.io.File(File);
		fichero.delete();
	} catch (Exception e) {
		
	}
	}

/**
 * @return the listaAutores
 */
public HashMap<String, CompleteDocuments> getListaAutores() {
	return ListaAutores;
}

/**
 * @param listaAutores the listaAutores to set
 */
public void setListaAutores(HashMap<String, CompleteDocuments> listaAutores) {
	ListaAutores = listaAutores;
}

/**
 * @return the authorClase
 */
public CompleteGrammarAuthor getAuthorClase() {
	return AuthorClase;
}

/**
 * @param authorClase the authorClase to set
 */
public void setAuthorClase(CompleteGrammarAuthor authorClase) {
	AuthorClase = authorClase;
}

/**
 * @return the author
 */
public CompleteGrammar getAuthor() {
	return Author;
}

/**
 * @param author the author to set
 */
public void setAuthor(CompleteGrammar author) {
	Author = author;
}

public HashMap<String, Integer> getAmbitoAuthor() {
	return AmbitoAuthor;
}
	
	
}
