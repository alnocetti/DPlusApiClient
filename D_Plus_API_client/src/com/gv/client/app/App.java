package com.gv.client.app;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.gv.client.controller.Controller;

public class App {
	
	public static String user;
	public static String password;
	public static String empresa;

	public static void main(String[] args) throws ParseException, ParserConfigurationException, SAXException, IOException {
		
		//leer configuracion local
		File fXmlFile = new File("src/Configuration.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		
		empresa = doc.getElementsByTagName("codigo").item(0).getTextContent();
		user = doc.getElementsByTagName("user").item(0).getTextContent();		
		password = doc.getElementsByTagName("password").item(0).getTextContent();
		
		//test token
		//Controller.getInstance().obtenerToken();
		
		//test envio clientes
		//Controller.getInstance().enviarClientes();
		
		//test envio fuerza de venta
		//Controller.getInstance().enviarPersonal();
		
		//test envio rutas de venta
		//Controller.getInstance().enviarRutasDeVenta();

		//test envio de clientes en ruta de venta
		//Controller.getInstance().enviarClientesEnRutasDeVenta();
		
		//test consulta estado lote
		Controller.getInstance().consultarLote("1bcb2cea-f212-4939-920b-93a6bf7cab87"); //clientes
		Controller.getInstance().consultarLote("a5fe6768-27f9-4908-b143-744662043f8a"); //personal comercial
		Controller.getInstance().consultarLote("440e65e2-fd75-4a8d-85b6-f86194e5ffc4"); //rutas de venta
		Controller.getInstance().consultarLote("562b8ed2-4192-43c6-8eb6-a846d104cf02"); //clientes en ruta

	}

}
