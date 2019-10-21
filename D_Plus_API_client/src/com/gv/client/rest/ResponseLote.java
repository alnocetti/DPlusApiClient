package com.gv.client.rest;

import java.util.ArrayList;

public class ResponseLote {
	
	private String IdImportacion;
	
	private String Error;
	
	private ArrayList<String> Mensajes;

	public ResponseLote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseLote(String idImportacion, String error, ArrayList<String> mensajes) {
		super();
		IdImportacion = idImportacion;
		Error = error;
		Mensajes = mensajes;
	}

	public String getIdImportacion() {
		return IdImportacion;
	}

	public void setIdImportacion(String idImportacion) {
		IdImportacion = idImportacion;
	}

	public String getError() {
		return Error;
	}

	public void setError(String error) {
		Error = error;
	}

	public ArrayList<String> getMensajes() {
		return Mensajes;
	}

	public void setMensajes(ArrayList<String> mensajes) {
		Mensajes = mensajes;
	}

	
	
}
