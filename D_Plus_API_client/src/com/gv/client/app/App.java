package com.gv.client.app;

import com.gv.client.rest.ResponseClientes;
import com.gv.client.rest.ResponseLogin;
import com.gv.client.rest.RestClient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.gv.client.controller.Controller;
import com.gv.client.model.Articulo;
import com.gv.client.model.Cliente;

public class App {

	public static void main(String[] args) throws ParseException {

//		String user = "testveneroni";
//		String password = "testservicios";
//		
//		RestClient rc = RestClient.getInstance();
//		
//		//test login
//		
//		ResponseLogin response = new ResponseLogin();
//		
//		response = rc.getToken(user, password);
//		
//		System.out.println(">>> Test getToken() <<<");
//		System.out.println("Token obtenido: " + response.getToken());
//		
		
		// test clientes
		Controller.getInstance().enviarClientes();
		
		
		

	}

}
