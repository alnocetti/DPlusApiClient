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

public class AppInterface {
	

	public static void main(String[] args) throws ParseException, ParserConfigurationException, SAXException, IOException {
		
		//leer configuracion local
		File fXmlFile = new File("Configuration.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		
		App.empresa = doc.getElementsByTagName("codigo").item(0).getTextContent();
		App.user = doc.getElementsByTagName("user").item(0).getTextContent();		
		App.password = doc.getElementsByTagName("password").item(0).getTextContent();
		App.dir_respuestas = doc.getElementsByTagName("dir_respuestas").item(0).getTextContent();
		
		Controller.getInstance().startApp();
	}

}
