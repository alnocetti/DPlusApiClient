package com.gv.client.rest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.gv.client.app.App;
import com.gv.client.email.SendEmailSMTP;
import com.gv.client.model.Cliente;
import com.gv.client.model.ClienteEnRutaDeVenta;
import com.gv.client.model.EstadoLote;
import com.gv.client.model.PersonalComercial;
import com.gv.client.model.RutaDeVenta;

public class RestClient {
	
	public static RestClient instance;
	private Date date = new Date();
	private DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
	private SendEmailSMTP sender = new SendEmailSMTP();

	public static RestClient getInstance() {
		
		return instance == null ? new RestClient() : instance;
		
	}
	
	public RestClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// Metodo para obtener token
	public ResponseLogin getToken(String user, String password) {
		
		ResponseLogin rl = null;
		
		Gson gson = new Gson();
		
		try {

			URL url = new URL("http://dplusrc.chessdi.com.ar:8090/WSRest.svc/Interfaz_Login");//your url i.e fetch data from .
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setRequestMethod("POST");
			
			conn.setRequestProperty("Accept", "application/json");
						
			conn.setRequestProperty("user", user);
			
			conn.setRequestProperty("pass", password);
			
			conn.setFixedLengthStreamingMode(0);
			
			conn.setDoOutput(true);
			
			if (conn.getResponseCode() != 200) {
			
				throw new RuntimeException("Failed : HTTP Error code : "
						+ conn.getResponseCode() + "-" + conn.getResponseMessage());
			}
			
			InputStreamReader in = new InputStreamReader(conn.getInputStream());
			
			BufferedReader br = new BufferedReader(in);
			
			StringBuilder builder = new StringBuilder();
			
			String output;
			
			while ((output = br.readLine()) != null) {
				
				builder.append(output);
				
			}
						
			String aux = builder.toString();
			
			aux = aux.replaceAll("\\\"", "");
			
			aux = aux.replace("\\", "'");
			
			rl = gson.fromJson(aux, ResponseLogin.class);
			
			conn.disconnect();

		} catch (Exception e) {
		
			System.out.println("Exception in NetClientGet:- " + e);
		
		}
		
		return rl;
	}

	//metodo para enviar clientes
	public ResponseLote postClientes(String user, String password, ArrayList<Cliente> datos ) { 
		
		ResponseLote response = null;
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		try {

			
			URL url = new URL("http://dplusrc.chessdi.com.ar:8090/WSRest.svc/Interfaz_Clientes");//your url i.e fetch data from .
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setRequestMethod("POST");
			
		    conn.setRequestProperty("Accept", "application/json; charset=utf-8");
			
			conn.setRequestProperty("Accept-Charset", "UTF-8");
			
			conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
						
			conn.setRequestProperty("user", user);
			
			conn.setRequestProperty("pass", password);
						
			conn.setDoOutput(true);
			
			conn.setDoInput(true);
						
			String jsonString = "";
			
			jsonString = gson.toJson(datos);
			
			String data = "{ \"Datos\":{ \"Clientes\":" + jsonString + ", \"Empresa\" :" + App.empresa + "} }";
			
			Writer writer2 =  new FileWriter(App.dir_respuestas + "clientes.json");
			
			gson.toJson(datos, writer2);
			
			writer2.flush();
			
			writer2.close();
						
			//System.out.println("Json format: " + data);
			
			System.out.println("cantidad clientes: " + datos.size());
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream(), "UTF-8"));
			bw.write(data);
			bw.flush();
			bw.close();
			
//			OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
//			wr.write(data);
//			wr.flush();
			
			if (conn.getResponseCode() != 200) {
			
				throw new RuntimeException("Failed : HTTP Error code : "
						+ conn.getResponseCode() + "-" + conn.getResponseMessage());
			}
			
			InputStreamReader in = new InputStreamReader(conn.getInputStream());
			
			BufferedReader br = new BufferedReader(in);
			
			StringBuilder builder = new StringBuilder();
			
			String output;
			
			while ((output = br.readLine()) != null) {
				
				builder.append(output);
				
			}
						
			String aux = builder.toString();
			
			aux = aux.replaceAll("\\\"", "");
			
			aux = aux.replace("\\", "'");
			
			response = gson.fromJson(aux, ResponseLote.class);
			
			conn.disconnect();

			// guardo log de respuesta
			response.setFecha(hourdateFormat.format(date));
			String responseFileName = "Clientes.log";
			Writer writer =  new FileWriter(App.dir_respuestas + responseFileName, true);
			gson.toJson(response, writer);
			writer.flush();
			writer.close();
			
			// Envio mail
			String subject = "Envio info D+ - Clientes";
			String message = "Mensaje: " + response.getMensajes() + "\n";
			message += "\nID importacion: " + response.getIdImportacion();
			message += "\nError: " + response.getError();
			sender.setEMAIL_SUBJECT(subject);
			sender.setEMAIL_TEXT(message);
			sender.sendEmail();
			

		} catch (Exception e) {
		
			System.out.println("Exception in NetClientGet:- " + e);
		
		}
		
		return response;
	}
	
	
	//metodo para enviar personal comercial
	public ResponseLote postPersonalComercial(String user, String password, ArrayList<PersonalComercial> datos ) { 
		
		ResponseLote response = null;
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		try {

			
			URL url = new URL("http://dplusrc.chessdi.com.ar:8090/WSRest.svc/Interfaz_PersonalComercial");//your url i.e fetch data from .
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setRequestMethod("POST");
			
		    conn.setRequestProperty("Accept", "application/json; charset=utf-8");
			
			conn.setRequestProperty("Accept-Charset", "UTF-8");
			
			conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
						
			conn.setRequestProperty("user", user);
			
			conn.setRequestProperty("pass", password);
						
			conn.setDoOutput(true);
			
			conn.setDoInput(true);
						
			String jsonString = "";
			
			jsonString = gson.toJson(datos);
			
			String data = "{ \"Datos\":{ \"PersonalComercial\":" + jsonString + ", \"Empresa\" :" + App.empresa + "} }";
			
			Writer writer2 =  new FileWriter(App.dir_respuestas + "personalComercial.json");
			
			gson.toJson(datos, writer2);
			
			writer2.flush();
			
			writer2.close();
									
			//System.out.println("Json format: " + data);
			
			System.out.println("cantidad personal: " + datos.size());
			
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream(), "UTF-8"));
			bw.write(data);
			bw.flush();
			bw.close();
			
			if (conn.getResponseCode() != 200) {
			
				throw new RuntimeException("Failed : HTTP Error code : "
						+ conn.getResponseCode() + "-" + conn.getResponseMessage());
			}
			
			InputStreamReader in = new InputStreamReader(conn.getInputStream());
			
			BufferedReader br = new BufferedReader(in);
			
			StringBuilder builder = new StringBuilder();
			
			String output;
			
			while ((output = br.readLine()) != null) {
				
				builder.append(output);
				
			}
						
			String aux = builder.toString();
			
			aux = aux.replaceAll("\\\"", "");
			
			aux = aux.replace("\\", "'");
			
			response = gson.fromJson(aux, ResponseLote.class);
			
			conn.disconnect();
			
			// guardo log de respuesta
			response.setFecha(hourdateFormat.format(date));
			String responseFileName = "PersonalComercial.log";
			Writer writer =  new FileWriter(App.dir_respuestas + responseFileName, true);
			gson.toJson(response, writer);
			writer.flush();
			writer.close();
			
			// Envio mail
			String subject = "Envio info D+ - Personal comercial";
			String message = "Mensaje: " + response.getMensajes();
			message += "\nID importacion: " + response.getIdImportacion();
			message += "\nError: " + response.getError();
			sender.setEMAIL_SUBJECT(subject);
			sender.setEMAIL_TEXT(message);
			sender.sendEmail();
			

		} catch (Exception e) {
		
			System.out.println("Exception in NetClientGet:- " + e);
		
		}
		
		return response;
	}
	
	//metodo para enviar rutas de venta
	public ResponseLote postRutasDeVenta(String user, String password, ArrayList<RutaDeVenta> datos ) { 
		
		ResponseLote response = null;
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		try {

			
			URL url = new URL("http://dplusrc.chessdi.com.ar:8090/WSRest.svc/Interfaz_RutasDeVenta");//your url i.e fetch data from .
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setRequestMethod("POST");
			
		    conn.setRequestProperty("Accept", "application/json; charset=utf-8");
			
			conn.setRequestProperty("Accept-Charset", "UTF-8");
			
			conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
						
			conn.setRequestProperty("user", user);
			
			conn.setRequestProperty("pass", password);
						
			conn.setDoOutput(true);
			
			conn.setDoInput(true);
						
			String jsonString = "";
			
			jsonString = gson.toJson(datos);
			
			String data = "{ \"Datos\":{ \"RutasDeVenta\":" + jsonString + ", \"Empresa\" :" + App.empresa + "} }";
			
			Writer writer2 =  new FileWriter(App.dir_respuestas + "rutasDeVenta.json");
			
			gson.toJson(datos, writer2);
			
			writer2.flush();
			
			writer2.close();
						
//			System.out.println("Json format: " + data);
			
			System.out.println("cantidad rutas: " + datos.size());
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream(), "UTF-8"));
			bw.write(data);
			bw.flush();
			bw.close();
			
//			OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
//			wr.write(data);
//			wr.flush();
			
			if (conn.getResponseCode() != 200) {
			
				throw new RuntimeException("Failed : HTTP Error code : "
						+ conn.getResponseCode() + "-" + conn.getResponseMessage());
			}
			
			InputStreamReader in = new InputStreamReader(conn.getInputStream());
			
			BufferedReader br = new BufferedReader(in);
			
			StringBuilder builder = new StringBuilder();
			
			String output;
			
			while ((output = br.readLine()) != null) {
				
				builder.append(output);
				
			}
						
			String aux = builder.toString();
			
			aux = aux.replaceAll("\\\"", "");
			
			aux = aux.replace("\\", "'");
			
			response = gson.fromJson(aux, ResponseLote.class);
			
			conn.disconnect();
			
			// guardo log de respuesta
			response.setFecha(hourdateFormat.format(date));
			String responseFileName = "RutasDeVenta.log";
			Writer writer =  new FileWriter(App.dir_respuestas + responseFileName, true);
			gson.toJson(response, writer);
			writer.flush();
			writer.close();
			
			// Envio mail
			String subject = "Envio info D+ - Rutas de venta";
			String message = "Mensaje: " + response.getMensajes();
			message += "\nID importacion: " + response.getIdImportacion();
			message += "\nError: " + response.getError();
			sender.setEMAIL_SUBJECT(subject);
			sender.setEMAIL_TEXT(message);
			sender.sendEmail();
			

		} catch (Exception e) {
		
			System.out.println("Exception in NetClientGet:- " + e);
		
		}
		
		return response;
	}
	
	//metodo para enviar rutas de venta
	public ResponseLote postClientesEnRutasDeVenta(String user, String password, ArrayList<ClienteEnRutaDeVenta> datos ) { 
		
		ResponseLote response = null;
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		try {

			
			URL url = new URL("http://dplusrc.chessdi.com.ar:8090/WSRest.svc/Interfaz_ClientesRuta");//your url i.e fetch data from .
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setRequestMethod("POST");
			
		    conn.setRequestProperty("Accept", "application/json; charset=utf-8");
			
			conn.setRequestProperty("Accept-Charset", "UTF-8");
			
			conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
						
			conn.setRequestProperty("user", user);
			
			conn.setRequestProperty("pass", password);
						
			conn.setDoOutput(true);
			
			conn.setDoInput(true);
						
			String jsonString = "";
			
			jsonString = gson.toJson(datos);
			
			String data = "{ \"Datos\":{ \"ClientesRuta\":" + jsonString + ", \"Empresa\" :" + App.empresa + "} }";
			
			Writer writer2 =  new FileWriter(App.dir_respuestas + "ClientesEnRutasDeVenta.json");
			
			gson.toJson(datos, writer2);
			
			writer2.flush();
			
			writer2.close();
						
//			System.out.println("Json format: " + data);
			
			System.out.println("cantidad clientes en rutas: " + datos.size());
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream(), "UTF-8"));
			bw.write(data);
			bw.flush();
			bw.close();
			
//			OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
//			wr.write(data);
//			wr.flush();
			
			if (conn.getResponseCode() != 200) {
			
				throw new RuntimeException("Failed : HTTP Error code : "
						+ conn.getResponseCode() + "-" + conn.getResponseMessage());
			}
			
			InputStreamReader in = new InputStreamReader(conn.getInputStream());
			
			BufferedReader br = new BufferedReader(in);
			
			StringBuilder builder = new StringBuilder();
			
			String output;
			
			while ((output = br.readLine()) != null) {
				
				builder.append(output);
				
			}
						
			String aux = builder.toString();
			
			aux = aux.replaceAll("\\\"", "");
			
			aux = aux.replace("\\", "'");
			
			response = gson.fromJson(aux, ResponseLote.class);
			
			conn.disconnect();
			
			// guardo log de respuesta
			response.setFecha(hourdateFormat.format(date));
			String responseFileName = "ClientesEnRuta.log";
			Writer writer =  new FileWriter(App.dir_respuestas + responseFileName, true);
			gson.toJson(response, writer);
			writer.flush();
			writer.close();
			
			// Envio mail
			String subject = "Envio info D+ - Clientes en ruta";
			String message = "Mensaje: " + response.getMensajes();
			message += "\nID importacion: " + response.getIdImportacion();
			message += "\nError: " + response.getError();
			sender.setEMAIL_SUBJECT(subject);
			sender.setEMAIL_TEXT(message);
			sender.sendEmail();

		} catch (Exception e) {
		
			System.out.println("Exception in NetClientGet:- " + e);
		
		}
		
		return response;
	}
	
	//metodo para consultar estado de un lote
		public EstadoLote consultaLote(String user, String password, String lote ) { 
			
			ResponseEstadoLote response = new ResponseEstadoLote();
			
			Gson gson = new Gson();
			
			try {

				
				URL url = new URL("http://dplusrc.chessdi.com.ar:8090/WSRest.svc/Interfaz_EstadoLote/IdLote/" + lote);//your url i.e fetch data from .
				
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				
				conn.setRequestMethod("GET");
				
			    conn.setRequestProperty("Accept", "application/json; charset=utf-8");
				
				conn.setRequestProperty("Accept-Charset", "UTF-8");
				
				conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
							
				conn.setRequestProperty("user", user);
				
				conn.setRequestProperty("pass", password);
							
				conn.setDoOutput(true);
				
				conn.setDoInput(true);
				
				if (conn.getResponseCode() != 200) {
				
					throw new RuntimeException("Failed : HTTP Error code : "
							+ conn.getResponseCode() + "-" + conn.getResponseMessage());
				}
				
				InputStreamReader in = new InputStreamReader(conn.getInputStream());
				
				BufferedReader br = new BufferedReader(in);
				
				StringBuilder builder = new StringBuilder();
				
				String output;
				
				while ((output = br.readLine()) != null) {
					
					builder.append(output);
					
				}
							
				String aux = builder.toString();
				
				aux = aux.replaceAll("\\\\/", "-");

				aux = aux.replaceAll("\\\"", "");
				
				aux = aux.replace("\\", "'");
							
				response = gson.fromJson(aux, ResponseEstadoLote.class);
				
				conn.disconnect();

			} catch (Exception e) {
			
				System.out.println("Exception in NetClientGet:- " + e);
			
			}
			
			return (response.getEstadoLote() != null ? response.getEstadoLote().get(0) : null);
		}


}
