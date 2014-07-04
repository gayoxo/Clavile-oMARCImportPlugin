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
public class S3XX implements InterfaceMARCXMLparser {
	
	private CompleteElementType Datos;
	private HashMap<String, HashMap<String, CompleteTextElementType>> TablaD;
	private HashMap<String, HashMap<String, String>> TablaID1;
	private HashMap<String, CompleteTextElementType> TablaD1;
	private HashMap<String, HashMap<String, String>> TablaID2;
	private HashMap<String, CompleteTextElementType> TablaD2;

	public S3XX(CompleteElementType datos,
			HashMap<String, HashMap<String, CompleteTextElementType>> tablaD,
			HashMap<String, HashMap<String, String>> tablaID1,
			HashMap<String, HashMap<String, String>> tablaID2,
			HashMap<String, CompleteTextElementType> tablaD1,
			HashMap<String, CompleteTextElementType> tablaD2) {
		Datos=datos;
		TablaD=tablaD;
		TablaID1=tablaID1;
		TablaID2=tablaID2;
		TablaD1=tablaD1;
		TablaD2=tablaD2;
	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessAttributes()
	 */
	@Override
	public void ProcessAttributes() {
//		300 - Physical Description (R)  Full | Concise
//		$a - Extent (R)
//		$b - Other physical details (NR)
//		$c - Dimensions (R)
//		$e - Accompanying material (NR)
//		$f - Type of unit (R)
//		$g - Size of unit (R)
//		$3 - Materials specified (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);

						String Iden="300";
						Datos.getSons().add(I1);
						CompleteElementType CTET1=new CompleteElementType("Physical Description", I1);
						I1.getSons().add(CTET1);
						
						CompleteTextElementType a = new CompleteTextElementType("Extent", CTET1);
						CTET1.getSons().add(a);
						
						CompleteTextElementType b = new CompleteTextElementType("Other physical details", CTET1);
						CTET1.getSons().add(b);
						
						CompleteTextElementType c = new CompleteTextElementType("Dimensions", CTET1);
						CTET1.getSons().add(c);
						
						CompleteTextElementType e = new CompleteTextElementType("Accompanying material", CTET1);
						CTET1.getSons().add(e);
						
						CompleteTextElementType f = new CompleteTextElementType("Type of unit", CTET1);
						CTET1.getSons().add(f);
						
						CompleteTextElementType g = new CompleteTextElementType("Size of unit", CTET1);
						CTET1.getSons().add(g);
						
						CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
						CTET1.getSons().add(n3);
						
						CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
						CTET1.getSons().add(n6);
						
						CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
						CTET1.getSons().add(n8);
						
						HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
						full.put("a", a);
						full.put("b", b);
						full.put("c", c);
						full.put("e", e);
						full.put("f", f);
						full.put("g", g);
						full.put("3", n3);
						full.put("6", n6);
						full.put("8", n8);
						TablaD.put(Iden, full);
						
					}
//		306 - Playing Time (NR)  Full | Concise
//		$a - Playing time (R) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		
		{
			CompleteIterator I1 = new CompleteIterator(Datos);

			String Iden = "306";
			Datos.getSons().add(I1);
			CompleteElementType CTET1 = new CompleteElementType(
					"Playing Time", I1);
			I1.getSons().add(CTET1);

			CompleteTextElementType a = new CompleteTextElementType("Playing time",
					CTET1);
			CTET1.getSons().add(a);

			CompleteTextElementType n6 = new CompleteTextElementType("Linkage",
					CTET1);
			CTET1.getSons().add(n6);

			CompleteTextElementType n8 = new CompleteTextElementType(
					"Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);

			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			full.put("a", a);
			full.put("6", n6);
			full.put("8", n8);
			TablaD.put(Iden, full);

		}
//		307 - Hours, etc. (R)  Full | Concise
//		$a - Hours (NR) 
//		$b - Additional information (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);

						String Iden="307";
						Datos.getSons().add(I1);
						CompleteElementType CTET1=new CompleteElementType("Hours, etc.", I1);
						I1.getSons().add(CTET1);
						
						CompleteTextElementType a = new CompleteTextElementType("Hours", CTET1);
						CTET1.getSons().add(a);
						
						CompleteTextElementType b = new CompleteTextElementType("Additional information", CTET1);
						CTET1.getSons().add(b);
						
						CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
						CTET1.getSons().add(n6);
						
						CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
						CTET1.getSons().add(n8);
						
						HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
						full.put("a", a);
						full.put("b", b);
						full.put("6", n6);
						full.put("8", n8);
						TablaD.put(Iden, full);
						
					}
//		310 - Current Publication Frequency (NR)  Full | Concise
//		$a - Current publication frequency (NR) 
//		$b - Date of current publication frequency (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);

						String Iden="310";
						Datos.getSons().add(I1);
						CompleteElementType CTET1=new CompleteElementType("Current Publication Frequency", I1);
						I1.getSons().add(CTET1);
						
						CompleteTextElementType a = new CompleteTextElementType("Current publication frequency", CTET1);
						CTET1.getSons().add(a);
						
						CompleteTextElementType b = new CompleteTextElementType("Date of current publication frequency", CTET1);
						CTET1.getSons().add(b);
						
						CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
						CTET1.getSons().add(n6);
						
						CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
						CTET1.getSons().add(n8);
						
						HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
						full.put("a", a);
						full.put("b", b);
						full.put("6", n6);
						full.put("8", n8);
						TablaD.put(Iden, full);
						
					}
//		321 - Former Publication Frequency (R)  Full | Concise
//		$a - Former publication frequency (NR) 
//		$b - Dates of former publication frequency (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);

						String Iden="321";
						Datos.getSons().add(I1);
						CompleteElementType CTET1=new CompleteElementType("Former Publication Frequency", I1);
						I1.getSons().add(CTET1);
						
						CompleteTextElementType a = new CompleteTextElementType("Former publication frequency", CTET1);
						CTET1.getSons().add(a);
						
						CompleteTextElementType b = new CompleteTextElementType("Dates of former publication frequency", CTET1);
						CTET1.getSons().add(b);
						
						CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
						CTET1.getSons().add(n6);
						
						CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
						CTET1.getSons().add(n8);
						
						HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
						full.put("a", a);
						full.put("b", b);
						full.put("6", n6);
						full.put("8", n8);
						TablaD.put(Iden, full);
						
					}		
		
//		336 - Content Type (R)  Full | Concise
//		$a - Content type term (R)
//		$b - Content type code (R)
//		$2 - Source (NR)
//		$3 - Materials specified (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);

						String Iden="336";
						Datos.getSons().add(I1);
						CompleteElementType CTET1=new CompleteElementType("Content Type", I1);
						I1.getSons().add(CTET1);
						
						CompleteTextElementType a = new CompleteTextElementType("Content type term", CTET1);
						CTET1.getSons().add(a);
						
						CompleteTextElementType b = new CompleteTextElementType("Content type code", CTET1);
						CTET1.getSons().add(b);
						
						CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
						CTET1.getSons().add(n2);
						
						CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
						CTET1.getSons().add(n3);
						
						CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
						CTET1.getSons().add(n6);
						
						CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
						CTET1.getSons().add(n8);
						
						HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
						full.put("a", a);
						full.put("b", b);
						full.put("2", n2);
						full.put("3", n3);
						full.put("6", n6);
						full.put("8", n8);
						TablaD.put(Iden, full);
						
					}		
		
		
//		337 - Media Type (R)  Full | Concise
//		$a - Media type term (R)
//		$b - Media type code (R)
//		$2 - Source (NR)
//		$3 - Materials specified (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);

						String Iden="337";
						Datos.getSons().add(I1);
						CompleteElementType CTET1=new CompleteElementType("Media Type", I1);
						I1.getSons().add(CTET1);
						
						CompleteTextElementType a = new CompleteTextElementType("Media type term", CTET1);
						CTET1.getSons().add(a);
						
						CompleteTextElementType b = new CompleteTextElementType("Media type code", CTET1);
						CTET1.getSons().add(b);
						
						CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
						CTET1.getSons().add(n2);
						
						CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
						CTET1.getSons().add(n3);
						
						CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
						CTET1.getSons().add(n6);
						
						CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
						CTET1.getSons().add(n8);
						
						HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
						full.put("a", a);
						full.put("b", b);
						full.put("2", n2);
						full.put("3", n3);
						full.put("6", n6);
						full.put("8", n8);
						TablaD.put(Iden, full);
						
					}	
		
//		338 - Carrier Type (R)  Full | Concise
//		$a - Carrier type term (R)
//		$b - Carrier type code (R)
//		$2 - Source (NR)
//		$3 - Materials specified (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);

						String Iden="338";
						Datos.getSons().add(I1);
						CompleteElementType CTET1=new CompleteElementType("Carrier Type", I1);
						I1.getSons().add(CTET1);
						
						CompleteTextElementType a = new CompleteTextElementType("Carrier type term", CTET1);
						CTET1.getSons().add(a);
						
						CompleteTextElementType b = new CompleteTextElementType("Carrier type code", CTET1);
						CTET1.getSons().add(b);
						
						CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
						CTET1.getSons().add(n2);
						
						CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
						CTET1.getSons().add(n3);
						
						CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
						CTET1.getSons().add(n6);
						
						CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
						CTET1.getSons().add(n8);
						
						HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
						full.put("a", a);
						full.put("b", b);
						full.put("2", n2);
						full.put("3", n3);
						full.put("6", n6);
						full.put("8", n8);
						TablaD.put(Iden, full);
						
					}
		
//		340 - Physical Medium (R)  Full | Concise
//		$a - Material base and configuration (R)
//		$b - Dimensions (R)
//		$c - Materials applied to surface (R)
//		$d - Information recording technique (R)
//		$e - Support (R)
//		$f - Production rate/ratio (R)
//		$h - Location within medium (R)
//		$i - Technical specifications of medium (R)
//		$j - Generation (R)
//		$k - Layout (R)
//		$m - Book format (R)
//		$n - Font size (R)
//		$o - Polarity (R)
//		$0 - Authority record control number or standard number (R)
//		$2 - Source (NR)
//		$3 - Materials specified (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);

						String Iden="340";
						Datos.getSons().add(I1);
						CompleteElementType CTET1=new CompleteElementType("Physical Medium", I1);
						I1.getSons().add(CTET1);

						CompleteTextElementType a = new CompleteTextElementType("Material base and configuration", CTET1);
						CTET1.getSons().add(a);
						
						CompleteTextElementType b = new CompleteTextElementType("Dimensions", CTET1);
						CTET1.getSons().add(b);
						
						CompleteTextElementType c = new CompleteTextElementType("Materials applied to surface", CTET1);
						CTET1.getSons().add(c);
						
						CompleteTextElementType d = new CompleteTextElementType("Information recording technique", CTET1);
						CTET1.getSons().add(d);
						
						CompleteTextElementType e = new CompleteTextElementType("Support", CTET1);
						CTET1.getSons().add(e);
						
						CompleteTextElementType f = new CompleteTextElementType("Production rate/ratio", CTET1);
						CTET1.getSons().add(f);
						
						CompleteTextElementType h = new CompleteTextElementType("Location within medium", CTET1);
						CTET1.getSons().add(h);
						
						CompleteTextElementType i = new CompleteTextElementType("Technical specifications of medium", CTET1);
						CTET1.getSons().add(i);
						
						CompleteTextElementType j = new CompleteTextElementType("Generation", CTET1);
						CTET1.getSons().add(j);
						
						CompleteTextElementType k = new CompleteTextElementType("Layout", CTET1);
						CTET1.getSons().add(k);
						
						CompleteTextElementType m = new CompleteTextElementType("Book format", CTET1);
						CTET1.getSons().add(m);
						
						CompleteTextElementType n = new CompleteTextElementType("Font size", CTET1);
						CTET1.getSons().add(n);
						
						CompleteTextElementType o = new CompleteTextElementType("Polarity", CTET1);
						CTET1.getSons().add(o);
						
						CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number or standard number", CTET1);
						CTET1.getSons().add(n0);
						
						CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
						CTET1.getSons().add(n2);
						
						CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
						CTET1.getSons().add(n3);
						
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
						full.put("h", h);
						full.put("i", i);
						full.put("j", j);
						full.put("k", k);
						full.put("m", m);
						full.put("n", n);
						full.put("o", o);
						full.put("0", n0);
						full.put("2", n2);
						full.put("3", n3);
						full.put("6", n6);
						full.put("8", n8);
						TablaD.put(Iden, full);
						
					}		
		
//		342 - Geospatial Reference Data (R)  Full | Concise
//ID1 Geospatial reference dimension
//		0 - Horizontal coordinate system 
//		1 - Vertical coordinate system 
//
//ID2	Geospatial reference method
//		0 - Geographic 
//		1 - Map projection 
//		2 - Grid coordinate system 
//		3 - Local planar 
//		4 - Local 
//		5 - Geodetic model 
//		6 - Altitude 
//		7 - Method specified in $2 
//		8 - Depth 
//
//	Subfield Codes
//	$a - Name (NR) 
//	$b - Coordinate units or distance units (NR) 
//	$c - Latitude resolution (NR) 
//	$d - Longitude resolution (NR) 
//	$e - Standard parallel or oblique line latitude (R) 
//	$f - Oblique line longitude (R) 
//	$g - Longitude of central meridian or projection center (NR) 
//	$h - Latitude of projection center or projection origin (NR) 
//	$i - False easting (NR) 
//	$j - False northing (NR) 
//	$k - Scale factor (NR) 
//	$l - Height of perspective point above surface (NR) 
//	$m - Azimuthal angle (NR) 
//	$n - Azimuth measure point longitude or straight vertical longitude from pole (NR) 
//	$o - Landsat number and path number (NR) 
//	$p - Zone identifier (NR) 
//	$q - Ellipsoid name (NR) 
//	$r - Semi-major axis (NR) 
//	$s - Denominator of flattening ratio (NR) 
//	$t - Vertical resolution (NR) 
//	$u - Vertical encoding method (NR) 
//	$v - Local planar, local, or other projection or grid description (NR) 
//	$w - Local planar or local georeference information (NR) 
//	$2 - Reference method used (NR) 
//	$6 - Linkage (NR) 
//	$8 - Field link and sequence number (R) 		
		{
			CompleteIterator I1=new CompleteIterator(Datos);

						String Iden="342";
						Datos.getSons().add(I1);
						CompleteElementType CTET1=new CompleteElementType("Geospatial Reference Data", I1);
						I1.getSons().add(CTET1);

			HashMap<String, String> full1I = new HashMap<String, String>();
						full1I.put("0", "Horizontal coordinate system ");
						full1I.put("1", "Vertical coordinate system");
						TablaID1.put(Iden, full1I);
						
						HashMap<String, String> full2I = new HashMap<String, String>();
						full2I.put("0", "Geographic");
						full2I.put("1", "Map projection");
						full2I.put("2", "Grid coordinate system");
						full2I.put("3", "Local planar");
						full2I.put("4", "Local");
						full2I.put("5", "Geodetic model");
						full2I.put("6", "Altitude");
						full2I.put("7", "Method specified in 'Reference method used'");
						full2I.put("8", "Depth");
						TablaID2.put(Iden, full2I);
						
						CompleteTextElementType ID1 = new CompleteTextElementType("Geospatial reference dimension", CTET1);
						CTET1.getSons().add(ID1);
						
						TablaD1.put(Iden, ID1);
						
						
						CompleteTextElementType ID2 = new CompleteTextElementType("Geospatial reference method", CTET1);
						CTET1.getSons().add(ID2);
						
						TablaD2.put(Iden, ID2);
						
						CompleteTextElementType a = new CompleteTextElementType("Name", CTET1);
						CTET1.getSons().add(a);
						
						CompleteTextElementType b = new CompleteTextElementType("Coordinate units or distance units", CTET1);
						CTET1.getSons().add(b);
						
						CompleteTextElementType c = new CompleteTextElementType("Latitude resolution", CTET1);
						CTET1.getSons().add(c);
						
						CompleteTextElementType d = new CompleteTextElementType("Longitude resolution", CTET1);
						CTET1.getSons().add(d);
						
						CompleteTextElementType e = new CompleteTextElementType("Standard parallel or oblique line latitude", CTET1);
						CTET1.getSons().add(e);
						
						CompleteTextElementType f = new CompleteTextElementType("Oblique line longitude", CTET1);
						CTET1.getSons().add(f);
						
						CompleteTextElementType g = new CompleteTextElementType("Longitude of central meridian or projection center", CTET1);
						CTET1.getSons().add(g);
						
						CompleteTextElementType h = new CompleteTextElementType("Latitude of projection center or projection origin", CTET1);
						CTET1.getSons().add(h);
						
						CompleteTextElementType i = new CompleteTextElementType("False easting", CTET1);
						CTET1.getSons().add(i);
						
						CompleteTextElementType j = new CompleteTextElementType("False northing", CTET1);
						CTET1.getSons().add(j);
						
						CompleteTextElementType k = new CompleteTextElementType("Scale factor", CTET1);
						CTET1.getSons().add(k);
						
						CompleteTextElementType l = new CompleteTextElementType("Height of perspective point above surface", CTET1);
						CTET1.getSons().add(l);
						
						CompleteTextElementType m = new CompleteTextElementType("Azimuthal angle", CTET1);
						CTET1.getSons().add(m);
						
						CompleteTextElementType n = new CompleteTextElementType("Azimuth measure point longitude or straight vertical longitude from pole", CTET1);
						CTET1.getSons().add(n);
						
						CompleteTextElementType o = new CompleteTextElementType("Landsat number and path number", CTET1);
						CTET1.getSons().add(o);
						
						CompleteTextElementType p = new CompleteTextElementType("Zone identifier", CTET1);
						CTET1.getSons().add(p);
						
						CompleteTextElementType q = new CompleteTextElementType("Ellipsoid name", CTET1);
						CTET1.getSons().add(q);
						
						CompleteTextElementType r = new CompleteTextElementType("Semi-major axis", CTET1);
						CTET1.getSons().add(r);
						
						CompleteTextElementType s = new CompleteTextElementType("Denominator of flattening ratio", CTET1);
						CTET1.getSons().add(s);
						
						CompleteTextElementType t = new CompleteTextElementType("Vertical resolution", CTET1);
						CTET1.getSons().add(t);
						
						CompleteTextElementType u = new CompleteTextElementType("Vertical encoding method", CTET1);
						CTET1.getSons().add(u);
						
						CompleteTextElementType v = new CompleteTextElementType("Local planar, local, or other projection or grid description", CTET1);
						CTET1.getSons().add(v);

						CompleteTextElementType w = new CompleteTextElementType("Local planar or local georeference information", CTET1);
						CTET1.getSons().add(w);
						
						CompleteTextElementType n2 = new CompleteTextElementType("Reference method used", CTET1);
						CTET1.getSons().add(n2);
						
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
						full.put("h", h);
						full.put("i", i);
						full.put("j", j);
						full.put("k", k);
						full.put("l", l);
						full.put("m", m);
						full.put("n", n);
						full.put("o", o);
						full.put("p", p);
						full.put("q", q);
						full.put("r", r);
						full.put("s", s);
						full.put("t", t);
						full.put("u", u);
						full.put("v", v);
						full.put("w", w);
						full.put("2", n2);
						full.put("6", n6);
						full.put("8", n8);
						TablaD.put(Iden, full);
						
					}
//		343 - Planar Coordinate Data (R)  Full | Concise
//		$a - Planar coordinate encoding method (NR) 
//		$b - Planar distance units (NR) 
//		$c - Abscissa resolution (NR) 
//		$d - Ordinate resolution (NR) 
//		$e - Distance resolution (NR) 
//		$f - Bearing resolution (NR) 
//		$g - Bearing units (NR) 
//		$h - Bearing reference direction (NR) 
//		$i - Bearing reference meridian (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);

						String Iden="343";
						Datos.getSons().add(I1);
						CompleteElementType CTET1=new CompleteElementType("Planar Coordinate Data", I1);
						I1.getSons().add(CTET1);
						
						CompleteTextElementType a = new CompleteTextElementType("Planar coordinate encoding method", CTET1);
						CTET1.getSons().add(a);
						
						CompleteTextElementType b = new CompleteTextElementType("Planar distance units", CTET1);
						CTET1.getSons().add(b);
						
						CompleteTextElementType c = new CompleteTextElementType("Abscissa resolution", CTET1);
						CTET1.getSons().add(c);
						
						CompleteTextElementType d = new CompleteTextElementType("Ordinate resolution", CTET1);
						CTET1.getSons().add(d);
						
						CompleteTextElementType e = new CompleteTextElementType("Distance resolution", CTET1);
						CTET1.getSons().add(e);
						
						CompleteTextElementType f = new CompleteTextElementType("Bearing resolution", CTET1);
						CTET1.getSons().add(f);
						
						CompleteTextElementType g = new CompleteTextElementType("Bearing units", CTET1);
						CTET1.getSons().add(g);
						
						CompleteTextElementType h = new CompleteTextElementType("Bearing reference direction", CTET1);
						CTET1.getSons().add(h);
						
						CompleteTextElementType i = new CompleteTextElementType("Bearing reference meridian", CTET1);
						CTET1.getSons().add(i);
						
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
						full.put("h", h);
						full.put("i", i);
						full.put("6", n6);
						full.put("8", n8);
						TablaD.put(Iden, full);
						
					}		
		
//		344 - Sound Characteristics (R)  Full | Concise
//		$a - Type of recording (R)
//		$b - Recording medium (R)
//		$c - Playing speed (R)
//		$d - Groove characteristic (R)
//		$e - Track configuration (R)
//		$f - Tape configuration (R)
//		$g - Configuration of playback channels (R)
//		$h - Special playback characteristics (R)
//		$0 - Authority record control number or standard number (R)
//		$2 - Source (NR)
//		$3 - Materials specified (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);

						String Iden="344";
						Datos.getSons().add(I1);
						CompleteElementType CTET1=new CompleteElementType("Sound Characteristics", I1);
						I1.getSons().add(CTET1);
						
						CompleteTextElementType a = new CompleteTextElementType("Type of recording", CTET1);
						CTET1.getSons().add(a);
						
						CompleteTextElementType b = new CompleteTextElementType("Recording medium", CTET1);
						CTET1.getSons().add(b);
						
						CompleteTextElementType c = new CompleteTextElementType("Playing speed", CTET1);
						CTET1.getSons().add(c);
						
						CompleteTextElementType d = new CompleteTextElementType("Groove characteristic", CTET1);
						CTET1.getSons().add(d);
						
						CompleteTextElementType e = new CompleteTextElementType("Track configuration", CTET1);
						CTET1.getSons().add(e);
						
						CompleteTextElementType f = new CompleteTextElementType("Tape configuration", CTET1);
						CTET1.getSons().add(f);
						
						CompleteTextElementType g = new CompleteTextElementType("Configuration of playback channels", CTET1);
						CTET1.getSons().add(g);
						
						CompleteTextElementType h = new CompleteTextElementType("Special playback characteristics", CTET1);
						CTET1.getSons().add(h);
						
						CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number or standard number", CTET1);
						CTET1.getSons().add(n0);
						
						CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
						CTET1.getSons().add(n2);
						
						CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
						CTET1.getSons().add(n3);
						
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
						full.put("h", h);
						full.put("0", n0);
						full.put("2", n2);
						full.put("3", n3);
						full.put("6", n6);
						full.put("8", n8);
						TablaD.put(Iden, full);
						
					}
		
//		345 - Projection Characteristics of Moving Image (R)  Full | Concise
//		$a - Presentation format (R)
//		$b - Projection speed (R)
//		$0 - Authority record control number or standard number (R)
//		$2 - Source (NR)
//		$3 - Materials specified (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);

						String Iden="345";
						Datos.getSons().add(I1);
						CompleteElementType CTET1=new CompleteElementType("Projection Characteristics of Moving Image", I1);
						I1.getSons().add(CTET1);
						
						CompleteTextElementType a = new CompleteTextElementType("Presentation format", CTET1);
						CTET1.getSons().add(a);
						
						CompleteTextElementType b = new CompleteTextElementType("Projection speed", CTET1);
						CTET1.getSons().add(b);
						
						CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number or standard number", CTET1);
						CTET1.getSons().add(n0);
						
						CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
						CTET1.getSons().add(n2);
						
						CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
						CTET1.getSons().add(n3);
						
						CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
						CTET1.getSons().add(n6);
						
						CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
						CTET1.getSons().add(n8);
						
						HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
						full.put("a", a);
						full.put("b", b);
						full.put("0", n0);
						full.put("2", n2);
						full.put("3", n3);
						full.put("6", n6);
						full.put("8", n8);
						TablaD.put(Iden, full);
						
					}		

//		346 - Video Characteristics (R)  Full | Concise
//		$a - Video format (R)
//		$b - Broadcast standard (R)
//		$0 - Authority record control number or standard number (R)
//		$2 - Source (NR)
//		$3 - Materials specified (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);

						String Iden="346";
						Datos.getSons().add(I1);
						CompleteElementType CTET1=new CompleteElementType("Video Characteristics", I1);
						I1.getSons().add(CTET1);
						
						CompleteTextElementType a = new CompleteTextElementType("Video format", CTET1);
						CTET1.getSons().add(a);
						
						CompleteTextElementType b = new CompleteTextElementType("Broadcast standard", CTET1);
						CTET1.getSons().add(b);
						
						CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number or standard number", CTET1);
						CTET1.getSons().add(n0);
						
						CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
						CTET1.getSons().add(n2);
						
						CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
						CTET1.getSons().add(n3);
						
						CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
						CTET1.getSons().add(n6);
						
						CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
						CTET1.getSons().add(n8);
						
						HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
						full.put("a", a);
						full.put("b", b);
						full.put("0", n0);
						full.put("2", n2);
						full.put("3", n3);
						full.put("6", n6);
						full.put("8", n8);
						TablaD.put(Iden, full);
						
					}				
//		347 - Digital File Characteristics (R)  Full | Concise
//		$a - File type (R)
//		$b - Encoding format (R)
//		$c - File size (R)
//		$d - Resolution (R)
//		$e - Regional encoding (R)
//		$f - Encoded bitrate (R)
//		$0 - Authority record control number or standard number (R)
//		$2 - Source (NR)
//		$3 - Materials specified (NR)
//		$6 - Linkage (NR)
//		$8 - Field link and sequence number (R)
		{
			CompleteIterator I1=new CompleteIterator(Datos);

						String Iden="017";
						Datos.getSons().add(I1);
						CompleteElementType CTET1=new CompleteElementType("Digital File Characteristics", I1);
						I1.getSons().add(CTET1);
						
						CompleteTextElementType a = new CompleteTextElementType("File type", CTET1);
						CTET1.getSons().add(a);
						
						CompleteTextElementType b = new CompleteTextElementType("Encoding format", CTET1);
						CTET1.getSons().add(b);
						
						CompleteTextElementType c = new CompleteTextElementType("File size", CTET1);
						CTET1.getSons().add(c);
						
						CompleteTextElementType d = new CompleteTextElementType("Resolution", CTET1);
						CTET1.getSons().add(d);
						
						CompleteTextElementType e = new CompleteTextElementType("Regional encoding", CTET1);
						CTET1.getSons().add(e);
						
						CompleteTextElementType f = new CompleteTextElementType("Encoded bitrate", CTET1);
						CTET1.getSons().add(f);

						CompleteTextElementType n0 = new CompleteTextElementType("AuthorCountryer", CTET1);
						CTET1.getSons().add(n0);
						
						CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
						CTET1.getSons().add(n2);
						
						CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
						CTET1.getSons().add(n3);
						
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
						full.put("0", n0);
						full.put("2", n2);
						full.put("3", n3);
						full.put("6", n6);
						full.put("8", n8);
						TablaD.put(Iden, full);
						
					}		
		
//		351 - Organization and Arrangement of Materials (R)  Full | Concise
//		$a - Organization (R) 
//		$b - Arrangement (R) 
//		$c - Hierarchical level (NR) 
//		$3 - Materials specified (NR) 
//		$6 - Linkage (NR) 
//		$8 - Field link and sequence number (R) 
		{
			CompleteIterator I1=new CompleteIterator(Datos);

						String Iden="017";
						Datos.getSons().add(I1);
						CompleteElementType CTET1=new CompleteElementType("Digital File Characteristics", I1);
						I1.getSons().add(CTET1);
						
						CompleteTextElementType a = new CompleteTextElementType("Organization", CTET1);
						CTET1.getSons().add(a);
						
						CompleteTextElementType b = new CompleteTextElementType("Arrangement", CTET1);
						CTET1.getSons().add(b);
						
						CompleteTextElementType c = new CompleteTextElementType("Hierarchical level", CTET1);
						CTET1.getSons().add(c);
						
						CompleteTextElementType n3 = new CompleteTextElementType("Materials specified", CTET1);
						CTET1.getSons().add(n3);
						
						CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
						CTET1.getSons().add(n6);
						
						CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
						CTET1.getSons().add(n8);
						
						HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
						full.put("a", a);
						full.put("b", b);
						full.put("c", c);
						full.put("3", n3);
						full.put("6", n6);
						full.put("8", n8);
						TablaD.put(Iden, full);
						
					}		
		
//		352 - Digital Graphic Representation (R)  Full | Concise
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			String Iden="352";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Digital Graphic Representation", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Direct reference method", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Object type", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType c = new CompleteTextElementType("Object count", CTET1);
			CTET1.getSons().add(c);
			full.put("c", c);
			CompleteTextElementType d = new CompleteTextElementType("Row count", CTET1);
			CTET1.getSons().add(d);
			full.put("d", d);
			CompleteTextElementType e = new CompleteTextElementType("Column count", CTET1);
			CTET1.getSons().add(e);
			full.put("e", e);
			CompleteTextElementType f = new CompleteTextElementType("Vertical count", CTET1);
			CTET1.getSons().add(f);
			full.put("f", f);
			CompleteTextElementType g = new CompleteTextElementType("VPF topology level", CTET1);
			CTET1.getSons().add(g);
			full.put("g", g);
			CompleteTextElementType i = new CompleteTextElementType("Indirect reference description", CTET1);
			CTET1.getSons().add(i);
			full.put("i", i);
			CompleteTextElementType q = new CompleteTextElementType("Format of the digital image", CTET1);
			CTET1.getSons().add(q);
			full.put("q", q);
			CompleteTextElementType n6 = new CompleteTextElementType("Linkage", CTET1);
			CTET1.getSons().add(n6);
			full.put("6", n6);
			CompleteTextElementType n8 = new CompleteTextElementType("Field link and sequence number", CTET1);
			CTET1.getSons().add(n8);
			full.put("8", n8);
			TablaD.put(Iden, full);
			}
		
		
		//////
		{
			CompleteIterator I1=new CompleteIterator(Datos);
			String Iden="355";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Security Classification Control", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Controlled element", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Document");
			full1I.put("1", "Title");
			full1I.put("2", "Abstract");
			full1I.put("3", "Contents note");
			full1I.put("4", "Author");
			full1I.put("5", "Record");
			full1I.put("8", "None of the above");
			TablaID1.put(Iden, full1I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Security classification", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Handling instructions", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType c = new CompleteTextElementType("External dissemination information", CTET1);
			CTET1.getSons().add(c);
			full.put("c", c);
			CompleteTextElementType d = new CompleteTextElementType("Downgrading or declassification event", CTET1);
			CTET1.getSons().add(d);
			full.put("d", d);
			CompleteTextElementType e = new CompleteTextElementType("Classification system", CTET1);
			CTET1.getSons().add(e);
			full.put("e", e);
			CompleteTextElementType f = new CompleteTextElementType("Country of origin code", CTET1);
			CTET1.getSons().add(f);
			full.put("f", f);
			CompleteTextElementType g = new CompleteTextElementType("Downgrading date", CTET1);
			CTET1.getSons().add(g);
			full.put("g", g);
			CompleteTextElementType h = new CompleteTextElementType("Declassification date", CTET1);
			CTET1.getSons().add(h);
			full.put("h", h);
			CompleteTextElementType j = new CompleteTextElementType("Authorization", CTET1);
			CTET1.getSons().add(j);
			full.put("j", j);
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
			String Iden="357";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Originator Dissemination Control", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Originator control term", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Originating agency", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType c = new CompleteTextElementType("Authorized recipients of material", CTET1);
			CTET1.getSons().add(c);
			full.put("c", c);
			CompleteTextElementType g = new CompleteTextElementType("Other restrictions", CTET1);
			CTET1.getSons().add(g);
			full.put("g", g);
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
			String Iden="362";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Dates of PublicationAnd/or Sequential Designation", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Format of date", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("0", "Formatted style");
			full1I.put("1", "Unformatted note");
			TablaID1.put(Iden, full1I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Dates of publication and/or sequential designation", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType z = new CompleteTextElementType("Source of information", CTET1);
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
			String Iden="363";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Normalized DateAnd Sequential Designation", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Start/End designator", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "No information provided");
			full1I.put("0", "Starting information");
			full1I.put("1", "Ending information");
			TablaID1.put(Iden, full1I);
			CompleteTextElementType ID2 = new CompleteTextElementType("State of issuance", CTET1);
			CTET1.getSons().add(ID2);
			TablaD2.put(Iden, ID2);
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("#", "Not specified");
			full2I.put("0", "Closed");
			full2I.put("1", "Open");
			TablaID2.put(Iden, full2I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("First level of enumeration", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Second level of enumeration", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType c = new CompleteTextElementType("Third level of enumeration", CTET1);
			CTET1.getSons().add(c);
			full.put("c", c);
			CompleteTextElementType d = new CompleteTextElementType("Fourth level of enumeration", CTET1);
			CTET1.getSons().add(d);
			full.put("d", d);
			CompleteTextElementType e = new CompleteTextElementType("Fifth level of enumeration", CTET1);
			CTET1.getSons().add(e);
			full.put("e", e);
			CompleteTextElementType f = new CompleteTextElementType("Sixth level of enumeration", CTET1);
			CTET1.getSons().add(f);
			full.put("f", f);
			CompleteTextElementType g = new CompleteTextElementType("Alternative numbering scheme, first level of enumeration", CTET1);
			CTET1.getSons().add(g);
			full.put("g", g);
			CompleteTextElementType h = new CompleteTextElementType("Alternative numbering scheme, second level of enumeration", CTET1);
			CTET1.getSons().add(h);
			full.put("h", h);
			CompleteTextElementType i = new CompleteTextElementType("First level of chronology", CTET1);
			CTET1.getSons().add(i);
			full.put("i", i);
			CompleteTextElementType j = new CompleteTextElementType("Second level of chronology", CTET1);
			CTET1.getSons().add(j);
			full.put("j", j);
			CompleteTextElementType k = new CompleteTextElementType("Third level of chronology", CTET1);
			CTET1.getSons().add(k);
			full.put("k", k);
			CompleteTextElementType l = new CompleteTextElementType("Fourth level of chronology", CTET1);
			CTET1.getSons().add(l);
			full.put("l", l);
			CompleteTextElementType m = new CompleteTextElementType("Alternative numbering scheme, chronology", CTET1);
			CTET1.getSons().add(m);
			full.put("m", m);
			CompleteTextElementType u = new CompleteTextElementType("First level textual designation", CTET1);
			CTET1.getSons().add(u);
			full.put("u", u);
			CompleteTextElementType v = new CompleteTextElementType("First level of chronology, issuance", CTET1);
			CTET1.getSons().add(v);
			full.put("v", v);
			CompleteTextElementType x = new CompleteTextElementType("Nonpublic note", CTET1);
			CTET1.getSons().add(x);
			full.put("x", x);
			CompleteTextElementType z = new CompleteTextElementType("Public note", CTET1);
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
			String Iden="365";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Trade Price", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Price type code", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Price amount", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType c = new CompleteTextElementType("Currency code", CTET1);
			CTET1.getSons().add(c);
			full.put("c", c);
			CompleteTextElementType d = new CompleteTextElementType("Unit of pricing", CTET1);
			CTET1.getSons().add(d);
			full.put("d", d);
			CompleteTextElementType e = new CompleteTextElementType("Price note", CTET1);
			CTET1.getSons().add(e);
			full.put("e", e);
			CompleteTextElementType f = new CompleteTextElementType("Price effective from", CTET1);
			CTET1.getSons().add(f);
			full.put("f", f);
			CompleteTextElementType g = new CompleteTextElementType("Price effective until", CTET1);
			CTET1.getSons().add(g);
			full.put("g", g);
			CompleteTextElementType h = new CompleteTextElementType("Tax rate 1", CTET1);
			CTET1.getSons().add(h);
			full.put("h", h);
			CompleteTextElementType i = new CompleteTextElementType("Tax rate 2", CTET1);
			CTET1.getSons().add(i);
			full.put("i", i);
			CompleteTextElementType j = new CompleteTextElementType("ISO country code", CTET1);
			CTET1.getSons().add(j);
			full.put("j", j);
			CompleteTextElementType k = new CompleteTextElementType("MARC country code", CTET1);
			CTET1.getSons().add(k);
			full.put("k", k);
			CompleteTextElementType m = new CompleteTextElementType("Identification of pricing entity", CTET1);
			CTET1.getSons().add(m);
			full.put("m", m);
			CompleteTextElementType n2 = new CompleteTextElementType("Source of price type code", CTET1);
			CTET1.getSons().add(n2);
			full.put("2", n2);
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
			String Iden="366";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("TradeAvailability Information", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Publishers' compressed title identification", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Detailed date of publication", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType c = new CompleteTextElementType("Availability status code", CTET1);
			CTET1.getSons().add(c);
			full.put("c", c);
			CompleteTextElementType d = new CompleteTextElementType("Expected next availability date", CTET1);
			CTET1.getSons().add(d);
			full.put("d", d);
			CompleteTextElementType e = new CompleteTextElementType("Note", CTET1);
			CTET1.getSons().add(e);
			full.put("e", e);
			CompleteTextElementType f = new CompleteTextElementType("Publisher's discount category", CTET1);
			CTET1.getSons().add(f);
			full.put("f", f);
			CompleteTextElementType g = new CompleteTextElementType("Date made out of print", CTET1);
			CTET1.getSons().add(g);
			full.put("g", g);
			CompleteTextElementType j = new CompleteTextElementType("ISO country code", CTET1);
			CTET1.getSons().add(j);
			full.put("j", j);
			CompleteTextElementType k = new CompleteTextElementType("MARC country code", CTET1);
			CTET1.getSons().add(k);
			full.put("k", k);
			CompleteTextElementType m = new CompleteTextElementType("Identification of agency", CTET1);
			CTET1.getSons().add(m);
			full.put("m", m);
			CompleteTextElementType n2 = new CompleteTextElementType("Source of availability status code", CTET1);
			CTET1.getSons().add(n2);
			full.put("2", n2);
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
			String Iden="377";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Associated Language", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID2 = new CompleteTextElementType("Source of code", CTET1);
			CTET1.getSons().add(ID2);
			TablaD2.put(Iden, ID2);
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("#", "MARC language code");
			full2I.put("7", "Source specified in subfield 'Source'");
			TablaID2.put(Iden, full2I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Language code", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType l = new CompleteTextElementType("Language term", CTET1);
			CTET1.getSons().add(l);
			full.put("l", l);
			CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
			CTET1.getSons().add(n2);
			full.put("2", n2);
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
			String Iden="380";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Form of Work", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Form of work", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType n0 = new CompleteTextElementType("Record control number", CTET1);
			CTET1.getSons().add(n0);
			full.put("0", n0);
			CompleteTextElementType n2 = new CompleteTextElementType("Source of term", CTET1);
			CTET1.getSons().add(n2);
			full.put("2", n2);
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
			String Iden="381";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Other Distinguishing Characteristics of Work or Expression", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Other distinguishing characteristic", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType u = new CompleteTextElementType("Uniform Resource Identifier", CTET1);
			CTET1.getSons().add(u);
			full.put("u", u);
			CompleteTextElementType v = new CompleteTextElementType("Source of information", CTET1);
			CTET1.getSons().add(v);
			full.put("v", v);
			CompleteTextElementType n0 = new CompleteTextElementType("Record control number", CTET1);
			CTET1.getSons().add(n0);
			full.put("0", n0);
			CompleteTextElementType n2 = new CompleteTextElementType("Source of term", CTET1);
			CTET1.getSons().add(n2);
			full.put("2", n2);
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
			String Iden="382";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Medium of Performance", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Display constant controller", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "No information provided");
			full1I.put("0", "Medium of performance");
			full1I.put("1", "Partial medium of performance");
			TablaID1.put(Iden, full1I);
			CompleteTextElementType ID2 = new CompleteTextElementType("Access control", CTET1);
			CTET1.getSons().add(ID2);
			TablaD2.put(Iden, ID2);
			HashMap<String, String> full2I = new HashMap<String, String>();
			full2I.put("#", "No information provided");
			full2I.put("0", "Not intended for access");
			full2I.put("1", "Intended for access");
			TablaID2.put(Iden, full2I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Medium of performance", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Soloist", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType d = new CompleteTextElementType("Doubling instrument", CTET1);
			CTET1.getSons().add(d);
			full.put("d", d);
			CompleteTextElementType n = new CompleteTextElementType("Number of performers of the same medium", CTET1);
			CTET1.getSons().add(n);
			full.put("n", n);
			CompleteTextElementType p = new CompleteTextElementType("Alternative medium of performance", CTET1);
			CTET1.getSons().add(p);
			full.put("p", p);
			CompleteTextElementType s = new CompleteTextElementType("Total number of performers", CTET1);
			CTET1.getSons().add(s);
			full.put("s", s);
			CompleteTextElementType v = new CompleteTextElementType("Note", CTET1);
			CTET1.getSons().add(v);
			full.put("v", v);
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number or standard number", CTET1);
			CTET1.getSons().add(n0);
			full.put("0", n0);
			CompleteTextElementType n2 = new CompleteTextElementType("Source of term", CTET1);
			CTET1.getSons().add(n2);
			full.put("2", n2);
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
			String Iden="383";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Numeric Designation of Musical Work", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Serial number", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Opus number", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType c = new CompleteTextElementType("Thematic index number", CTET1);
			CTET1.getSons().add(c);
			full.put("c", c);
			CompleteTextElementType d = new CompleteTextElementType("Thematic index code", CTET1);
			CTET1.getSons().add(d);
			full.put("d", d);
			CompleteTextElementType e = new CompleteTextElementType("Publisher associated with opus number", CTET1);
			CTET1.getSons().add(e);
			full.put("e", e);
			CompleteTextElementType n2 = new CompleteTextElementType("Source", CTET1);
			CTET1.getSons().add(n2);
			full.put("2", n2);
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
			String Iden="384";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Key", I1);
			I1.getSons().add(CTET1);
			CompleteTextElementType ID1 = new CompleteTextElementType("Key type", CTET1);
			CTET1.getSons().add(ID1);
			TablaD1.put(Iden, ID1);
			HashMap<String, String> full1I = new HashMap<String, String>();
			full1I.put("#", "Relationship to original unknown");
			full1I.put("0", "Original key");
			full1I.put("1", "Transposed key");
			TablaID1.put(Iden, full1I);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Key", CTET1);
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
			String Iden="385";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Audience Characteristics", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Audience term", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Audience code", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType m = new CompleteTextElementType("Demographic group term", CTET1);
			CTET1.getSons().add(m);
			full.put("m", m);
			CompleteTextElementType n = new CompleteTextElementType("Demographic group code", CTET1);
			CTET1.getSons().add(n);
			full.put("n", n);
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number or standard number", CTET1);
			CTET1.getSons().add(n0);
			full.put("0", n0);
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
			String Iden="386";
			Datos.getSons().add(I1);
			CompleteElementType CTET1=new CompleteElementType("Creator/Contributor Characteristics", I1);
			I1.getSons().add(CTET1);
			HashMap<String, CompleteTextElementType> full = new HashMap<String, CompleteTextElementType>();
			CompleteTextElementType a = new CompleteTextElementType("Creator/contributor term", CTET1);
			CTET1.getSons().add(a);
			full.put("a", a);
			CompleteTextElementType b = new CompleteTextElementType("Creator/contributor code", CTET1);
			CTET1.getSons().add(b);
			full.put("b", b);
			CompleteTextElementType m = new CompleteTextElementType("Demographic group term", CTET1);
			CTET1.getSons().add(m);
			full.put("m", m);
			CompleteTextElementType n = new CompleteTextElementType("Demographic group code", CTET1);
			CTET1.getSons().add(n);
			full.put("n", n);
			CompleteTextElementType n0 = new CompleteTextElementType("Authority record control number or standard number", CTET1);
			CTET1.getSons().add(n0);
			full.put("0", n0);
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

			//
			
//		355 - Security Classification Control (R)  Full | Concise
//		357 - Originator Dissemination Control (NR)  Full | Concise
//		362 - Dates of Publication and/or Sequential Designation (R)  Full | Concise
//		363 - Normalized Date and Sequential Designation (R)  Full | Concise
//		365 - Trade Price (R)  Full | Concise
//		366 - Trade Availability Information (R)  Full | Concise
//		377 - Associated Language (R)  Full | Concise
//		380 - Form of Work (R)  Full | Concise
//		381 - Other Distinguishing Characteristics of Work or Expression (R)  Full | Concise
//		382 - Medium of Performance (R)  Full | Concise
//		383 - Numeric Designation of Musical Work (R)  Full | Concise
//		384 - Key (NR)  Full | Concise
//		385 - Audience Characteristics (R)  Full | Concise
//		386 - Creator/Contributor Characteristics (R)  Full | Concise
	}

	/* (non-Javadoc)
	 * @see fdi.ucm.server.importparser.marcxml.InterfaceMARCXMLparser#ProcessInstances()
	 */
	@Override
	public void ProcessInstances() {
		// Auto-generated method stub

	}

}
