package com.gv.client.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.gv.client.dbf.reader.DbfReader;
import com.gv.client.model.Cliente;
import com.gv.client.rest.ResponseClientes;
import com.gv.client.rest.RestClient;

public class Controller {
	
	public static Controller instance;
	
   public static Controller getInstance() throws RuntimeException {
	   
		return instance == null ? new Controller() : instance;	

    }
   
   public void enviarClientes() {
	   
		//test envio clientes
		
		ResponseClientes responseClientes = new ResponseClientes();
		
		ArrayList<Cliente> datos = null;
		try {
			datos = DbfReader.getInstance().readClientes();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
				
		responseClientes = RestClient.getInstance().postClientes("testveneroni", "testservicios", datos);
		
		System.out.println(">>> Test postClientes() <<<");
		System.out.println("Mensaje:" + responseClientes.getMensajes());
		System.out.println("Id importacion: " + responseClientes.getIdImportacion());
   }

   
   
}
