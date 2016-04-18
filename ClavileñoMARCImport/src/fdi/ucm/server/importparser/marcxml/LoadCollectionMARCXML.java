/**
 * 
 */
package fdi.ucm.server.importparser.marcxml;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import fdi.ucm.server.modelComplete.ImportExportDataEnum;
import fdi.ucm.server.modelComplete.ImportExportPair;
import fdi.ucm.server.modelComplete.LoadCollection;
import fdi.ucm.server.modelComplete.collection.CompleteCollection;
import fdi.ucm.server.modelComplete.collection.CompleteCollectionAndLog;
import fdi.ucm.server.modelComplete.collection.document.CompleteDocuments;
import fdi.ucm.server.modelComplete.collection.document.CompleteElement;
import fdi.ucm.server.modelComplete.collection.document.CompleteTextElement;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteElementType;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteGrammar;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteOperationalValueType;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteOperationalView;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteStructure;

/**
 * Clase que implementa la creacion de una coleccion basandonos en una BBDD MySQL
 * @author Joaquin Gayoso-Cabada
 *
 */
public class LoadCollectionMARCXML extends LoadCollection {

	private HashSet<String> HashValuesControl;
	private static ArrayList<ImportExportPair> Parametros;
	private ArrayList<String> Log;
	private CollectionMARCXML CollectionXMLparser;

	
	
	public LoadCollectionMARCXML() {
		super();
	}
	
	

	/* (non-Javadoc)
	 * @see fdi.ucm.server.LoadCollection#processCollecccion()
	 */
	@Override
	public CompleteCollectionAndLog processCollecccion(ArrayList<String> DateEntrada) {
		
		Log=new ArrayList<String>();
		CollectionXMLparser = new CollectionMARCXML(this);
		if (DateEntrada!=null)	
		{
			CollectionXMLparser.setFilename(DateEntrada.get(0));
			
			if (HashValuesControl==null)
				HashValuesControl=new HashSet<String>();
			CollectionXMLparser.setValuesControl(HashValuesControl,Log);
			
			CollectionXMLparser.ProcessAttributes();
			CollectionXMLparser.ProcessInstances();
			
			CollectionXMLparser.deleteFile();
		}
		
		return new CompleteCollectionAndLog(CollectionXMLparser.getColeccion(),Log);
	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.LoadCollection#getConfiguracion()
	 */
	@Override
	public ArrayList<ImportExportPair> getConfiguracion() {
		if (Parametros==null)
		{
			ArrayList<ImportExportPair> ListaCampos=new ArrayList<ImportExportPair>();
			ListaCampos.add(new ImportExportPair(ImportExportDataEnum.File, "Upload XML File :"));
			Parametros=ListaCampos;
			return ListaCampos;
		}
		else return Parametros;
	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.LoadCollection#getName()
	 */
	@Override
	public String getName() {
		return "MARCXML";
	}
	
	/**
	 * QUitar caracteres especiales.
	 * @param str texto de entrada.
	 * @return texto sin caracteres especiales.
	 */
	public String RemoveSpecialCharacters(String str) {
		   StringBuilder sb = new StringBuilder();
		   for (int i = 0; i < str.length(); i++) {
			   char c = str.charAt(i);
			   if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == '_') {
			         sb.append(c);
			      }
		}
		   return sb.toString();
		}


	@Override
	public boolean getCloneLocalFiles() {
		return false;
	}



	/**
	 * @return the log
	 */
	public ArrayList<String> getLog() {
		return Log;
	}



	/**
	 * @param log the log to set
	 */
	public void setLog(ArrayList<String> log) {
		Log = log;
	}



	/**
	 * @return the xMLparser
	 */
	public CollectionMARCXML getCollectionXMLparser() {
		return CollectionXMLparser;
	}



	/**
	 * @param xMLparser the xMLparser to set
	 */
	public void setCollectionXMLparser(CollectionMARCXML xMLparser) {
		CollectionXMLparser = xMLparser;
	}

@Override
public boolean needComplete() {
	return true;
}

@Override
public void setcompleteCollectionPre(CompleteCollection pre) {
	
	HashValuesControl=new HashSet<String>();
	ArrayList<CompleteStructure> VOO1=new ArrayList<CompleteStructure>();
	for (CompleteGrammar gram1 : pre.getMetamodelGrammar()) {
		CompleteStructure found = find001(gram1.getSons());
		if (found!=null)
			VOO1.add(found);

	}
	
	for (CompleteDocuments doc : pre.getEstructuras()) 
		for (CompleteElement elem : doc.getDescription())
			if (VOO1.contains(elem.getHastype())&&elem instanceof CompleteTextElement)
			{
				HashValuesControl.add(((CompleteTextElement)elem).getValue());
			}

	
}



private CompleteStructure find001(List<CompleteStructure> sons) {
	for (CompleteStructure completeStructure : sons) {
		if (is001(completeStructure))
			return completeStructure;
		else
			{
			CompleteStructure VOO1t=find001(completeStructure.getSons());
			if (VOO1t!=null)
				return VOO1t;
			}
		
	}
	return null;
}



private boolean is001(CompleteStructure completeStructure) {
	if (completeStructure instanceof CompleteElementType)
		for (CompleteOperationalView view : ((CompleteElementType)completeStructure).getShows())
			for (CompleteOperationalValueType typeValue : view.getValues())
				if (view.getName().toLowerCase().equals("marc")
						&&typeValue.getName().toLowerCase().equals("field")
						&&typeValue.getDefault().toLowerCase().equals("001"))
							return true;

	
	//EOC
	return false;
}

}
