package com.gv.client.model;

public class AgrupacionArticulo {
	
	private int CodigoArticulo;
	
	private int FormaAgrupar;
	
	private String Agrupacion;

	public AgrupacionArticulo() {
		super();
	}

	public int getCodigoArticulo() {
		return CodigoArticulo;
	}

	public void setCodigoArticulo(int codigoArticulo) {
		this.CodigoArticulo = codigoArticulo;
	}

	public int getFormaAgrupar() {
		return FormaAgrupar;
	}

	public void setFormaAgrupar(int formaAgrupar) {
		this.FormaAgrupar = formaAgrupar;
	}

	public String getAgrupacion() {
		return Agrupacion;
	}

	public void setAgrupacion(String agrupacion) {
		this.Agrupacion = agrupacion;
	}
	
	

}
