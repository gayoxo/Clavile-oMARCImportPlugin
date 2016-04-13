/**
 * 
 */
package fdi.ucm.server.importparser.marcxml;

import java.util.ArrayList;

import fdi.ucm.server.modelComplete.ImportExportDataEnum;
import fdi.ucm.server.modelComplete.ImportExportPair;
import fdi.ucm.server.modelComplete.LoadCollection;
import fdi.ucm.server.modelComplete.collection.CompleteCollection;
import fdi.ucm.server.modelComplete.collection.CompleteCollectionAndLog;

/**
 * Clase que implementa la creacion de una coleccion basandonos en una BBDD MySQL
 * @author Joaquin Gayoso-Cabada
 *
 */
public class LoadCollectionMARCXML extends LoadCollection {

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
		//TODO Crear la tabla hash con lo que necesitamos.
	}

}
