package com.gv.client.rest;

public class ResponseLogin {

	private String Resultado;

	private String Token;
	
	public ResponseLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseLogin(String resultado, String token) {
		super();
		this.Resultado = resultado;
		this.Token = token;
	}

	public String getResultado() {
		return Resultado;
	}

	public void setResultado(String resultado) {
		this.Resultado = resultado;
	}

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		this.Token = token;
	}
	
	
	

}
