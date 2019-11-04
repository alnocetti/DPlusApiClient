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
		//Controller.getInstance().consultarLote("e7773086-40fe-48c6-b80a-709cc95b3699"); //clientes
		Controller.getInstance().consultarLote("247f99a2-6a63-4688-92ff-4def7e75d278");
		//0f1e9c52-be08-4bf5-874b-9eef1d90159d
		//20b54039-66d8-433d-965e-9026209c9e04
		//4432d291-adb0-4d6d-9f15-3f7a3696c15b
		//247f99a2-6a63-4688-92ff-4def7e75d278
		//Controller.getInstance().consultarLote("f0644770-b4aa-4fbb-b41a-de3b5d433000"); //personal comercial
		//Controller.getInstance().consultarLote("bac428af-61c2-4b98-8a57-07bae9ec2f21"); //rutas de venta
		//Controller.getInstance().consultarLote("0c2acb56-0a8d-41ae-aeec-bebb6d8b52e7"); //clientes en ruta

	}

}
