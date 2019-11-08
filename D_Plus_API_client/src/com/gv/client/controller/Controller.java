package com.gv.client.controller;

import java.text.ParseException;
import java.util.ArrayList;

import com.gv.client.app.App;
import com.gv.client.dbf.reader.DbfReader;
import com.gv.client.model.Cliente;
import com.gv.client.model.ClienteEnRutaDeVenta;
import com.gv.client.model.EstadoLote;
import com.gv.client.model.PersonalComercial;
import com.gv.client.model.RutaDeVenta;
import com.gv.client.rest.ResponseLogin;
import com.gv.client.rest.ResponseLote;
import com.gv.client.rest.RestClient;
import com.gv.client.view.MainWindow;

public class Controller {
	
	public static Controller instance;
	
   public static Controller getInstance() throws RuntimeException {
	   
		return instance == null ? new Controller() : instance;	

    }
   
   public void obtenerToken() {
		System.out.println(">>> Test getToken() <<<");

		ResponseLogin response = RestClient.getInstance().getToken(App.user, App.password);
	   
		System.out.println(">>> Test getToken() <<<");
		System.out.println("Token obtenido: " + response.getToken());
	   
   }
   
   public ResponseLote enviarClientes() throws ParseException {
	   
		//test envio clientes
		System.out.println(">>> Test postClientes() <<<");
		
		ArrayList<Cliente> datos = DbfReader.getInstance().readClientes();
						
		ResponseLote response = RestClient.getInstance().postClientes(App.user, App.password, datos);
		
		System.out.println("Mensaje:" + response.getMensajes());
		System.out.println("Id importacion: " + response.getIdImportacion());
		
		return response;

   }
   
   public ResponseLote enviarPersonal() {
	   
		//test envio clientes
		System.out.println(">>> Test postPersonalComercial() <<<");
		
		ArrayList<PersonalComercial> datos = DbfReader.getInstance().readPersonalComercial();
						
		ResponseLote response = RestClient.getInstance().postPersonalComercial(App.user, App.password, datos);
		
		System.out.println("Mensaje:" + response.getMensajes());
		System.out.println("Id importacion: " + response.getIdImportacion());
		
		
		return response;

   }
   
   public ResponseLote enviarRutasDeVenta() {
	   
		//test envio clientes
		System.out.println(">>> Test postRutasDeVenta() <<<");
		
		ArrayList<RutaDeVenta> datos = DbfReader.getInstance().readRutasDeVenta();
						
		ResponseLote response = RestClient.getInstance().postRutasDeVenta(App.user, App.password, datos);
		
		System.out.println("Mensaje:" + response.getMensajes());
		System.out.println("Id importacion: " + response.getIdImportacion());
		
		return response;

   }
   
   public ResponseLote enviarClientesEnRutasDeVenta() {
	   
		//test envio clientes
		System.out.println(">>> Test postClientesEnRutasDeVenta() <<<");
		
		ArrayList<ClienteEnRutaDeVenta> datos = DbfReader.getInstance().readClientesEnRutasDeVenta();
						
		ResponseLote response = RestClient.getInstance().postClientesEnRutasDeVenta(App.user, App.password, datos);
		
		System.out.println("Mensaje:" + response.getMensajes());
		System.out.println("Id importacion: " + response.getIdImportacion());
		
		return response;
		
   }
   
   public EstadoLote consultarLote(String lote) {
	   System.out.println(">>> test consultaLote() <<<");
	   
	   EstadoLote response = RestClient.getInstance().consultaLote(App.user, App.password, lote);
	   if (response != null) {
			System.out.println("Id lote: " + response.getIdLote());
			System.out.println("Empresa: " + Integer.toString(response.getEmpresa()));
			System.out.println("Id usuario: " + Integer.toString(response.getIdUsuario()));
			System.out.println("Entidad: " + response.getEntidad());
			System.out.println("Fecha carga: " + response.getFechaHoraCarga());
			System.out.println("Fecha fin: " + response.getFechaHoraFin());
			System.out.println("Estado: " + response.getEstado() + "-" + response.getDescEstado());
			System.out.println("Error: " + response.getLineaError() + "-" + response.getDescError());
	   }
	   return response;
   }
   
   public void startApp() {
	   MainWindow window = new MainWindow();
   }


   
}
