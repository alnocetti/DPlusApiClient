package com.gv.client.rest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.gv.client.model.Cliente;

public class RestClient {
	
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
	public ResponseClientes postClientes(String user, String password, ArrayList<Cliente> Datos ) { 
		
		ResponseClientes response = null;
		
		Gson gson = new Gson();
		
		try {

			
			URL url = new URL("http://dplusrc.chessdi.com.ar:8090/WSRest.svc/Interfaz_Clientes");//your url i.e fetch data from .
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setRequestMethod("POST");
			
			conn.setRequestProperty("Accept", "application/json");
			
			conn.setRequestProperty("Content-Type", "application/json");
						
			conn.setRequestProperty("user", user);
			
			conn.setRequestProperty("pass", password);
						
			conn.setDoOutput(true);
			
			conn.setDoInput(true);
			
			String jsonString = gson.toJson(Datos);
			
			System.out.println("Json format: " + jsonString);
			
			String data = "{ \"Datos\":{ \"Clientes\":" + jsonString + ", \"Empresa\" : 530 } }";
			
			OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
			wr.write(data);
			wr.flush();
			
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
			
			response = gson.fromJson(aux, ResponseClientes.class);
			
			conn.disconnect();

		} catch (Exception e) {
		
			System.out.println("Exception in NetClientGet:- " + e);
		
		}
		
		return response;
	}
	


}
