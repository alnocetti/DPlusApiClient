package com.gv.client.model;

public class StockActual {
	
	private int codigoDeposito;
	
	private int codigoArticulo;
	
	private String descripcionArticulo;
	
	private int unidadesXBulto;
	
	private float cantidadDecimal;

	public StockActual() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigoDeposito() {
		return codigoDeposito;
	}

	public void setCodigoDeposito(int codigoDeposito) {
		this.codigoDeposito = codigoDeposito;
	}

	public int getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(int codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public String getDescripcionArticulo() {
		return descripcionArticulo;
	}

	public void setDescripcionArticulo(String descripcionArticulo) {
		this.descripcionArticulo = descripcionArticulo;
	}

	public int getUnidadesXBulto() {
		return unidadesXBulto;
	}

	public void setUnidadesXBulto(int unidadesXBulto) {
		this.unidadesXBulto = unidadesXBulto;
	}

	public float getCantidadDecimal() {
		return cantidadDecimal;
	}

	public void setCantidadDecimal(float cantidadDecimal) {
		this.cantidadDecimal = cantidadDecimal;
	}
	
	

}
