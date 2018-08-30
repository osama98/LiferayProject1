/*package com.fihoca.bean;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class WriteXml {

	public static void add(List<Alumno> alumnoList) {
		try {
			 
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	 
			// elemento raiz
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("Alumnos");
			doc.appendChild(rootElement);
			
			for(Alumno al : alumnoList){
			// empleado
			Element empleado = doc.createElement("alumno");
			rootElement.appendChild(empleado);
			
				// nombre
				Element nombre = doc.createElement("idAlumno");
				nombre.appendChild(doc.createTextNode(Integer.toString(al.getIdAlumno())));
				empleado.appendChild(nombre);
		 
				// apellidos
				Element apellidos = doc.createElement("nombre");
				apellidos.appendChild(doc.createTextNode(al.getNombre()));
				empleado.appendChild(apellidos);
		 
				// seccion
				Element seccion = doc.createElement("apellidos");
				seccion.appendChild(doc.createTextNode(al.getApellidos()));
				empleado.appendChild(seccion);
		 
				// salario
				Element salario = doc.createElement("dni");
				salario.appendChild(doc.createTextNode(al.getDni()));
				empleado.appendChild(salario);
			}
			// escribimos el contenido en un archivo .xml
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			try {
	            // location and name of XML file you can change as per need
	            FileWriter fos = new FileWriter("C:\\alumnos.xml");
	            StreamResult result = new StreamResult(fos);
	            transformer.transform(source, result);

	        } catch (IOException e) {

	            e.printStackTrace();
	        }
			//StreamResult result = new StreamResult(new File("archivo.xml"));
	 
			// Si se quiere mostrar por la consola...
			// StreamResult result = new StreamResult(System.out);
	 
			
	 
			System.out.println("File saved!");
	 
			} catch (ParserConfigurationException pce) {
				pce.printStackTrace();
			} catch (TransformerException tfe) {
				tfe.printStackTrace();
			}
	}
		
		public static List<Alumno> readFile (){
			List<Alumno> alumnoList = new ArrayList<>();
			try {

	            File archivo = new File("C:\\alumnos.xml");
	            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
	            Document document = documentBuilder.parse(archivo);
	            document.getDocumentElement().normalize();
	            System.out.println("Elemento raiz:" + document.getDocumentElement().getNodeName());
	            NodeList listaEmpleados = document.getElementsByTagName("alumno");
	            for (int temp = 0; temp < listaEmpleados.getLength(); temp++) {
	                Node nodo = listaEmpleados.item(temp);
	                System.out.println("Elemento:" + nodo.getNodeName());
	                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
	                    Element element = (Element) nodo;
	                    alumnoList.add(new Alumno(Integer.parseInt(element.getElementsByTagName("idAlumno").item(0).getTextContent()),
	                    		element.getElementsByTagName("nombre").item(0).getTextContent(),
	                    		element.getElementsByTagName("apellidos").item(0).getTextContent(),
	                    		element.getElementsByTagName("dni").item(0).getTextContent()));
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			return alumnoList;
		}
		
}
*/
