package com.gv.client.app;

import com.gv.client.rest.ResponseClientes;
import com.gv.client.rest.ResponseLogin;
import com.gv.client.rest.RestClient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.gv.client.model.Cliente;

public class App {

	public static void main(String[] args) throws ParseException {

		String user = "testveneroni";
		String password = "testservicios";
		
		RestClient rc = new RestClient();
		
		//test login
		
		ResponseLogin response = new ResponseLogin();
		
		response = rc.getToken(user, password);
		
		System.out.println(">>> Test getToken() <<<");
		System.out.println("Token obtenido: " + response.getToken());
		
		//test envio clientes
		
		ResponseClientes responseClientes = new ResponseClientes();
		
		ArrayList<Cliente> Datos = new ArrayList<Cliente>();
		
		Cliente cliente =  new Cliente();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		
		cliente.setCodigoSucursal(1);
		cliente.setCodigoCliente("2222");
		cliente.setNombre("Test alan");
		cliente.setDomicilio("Calle falsa 123");
		cliente.setFechaAlta(format.parse("2019/09/18"));
		cliente.setAnulado(false);
		cliente.setTipoContribuyente("RI");
		cliente.setCodListaPrecio(0);
		cliente.setIdTipoDocumentoCliente(99);
		
		Datos.add(cliente);
		
		responseClientes = rc.postClientes(user, password,Datos);
		
		System.out.println(">>> Test postClientes() <<<");
		System.out.println("Mensaje:" + responseClientes.getMensajes());
		System.out.println("Id importacion: " + responseClientes.getIdImportacion());
		

	}

}
