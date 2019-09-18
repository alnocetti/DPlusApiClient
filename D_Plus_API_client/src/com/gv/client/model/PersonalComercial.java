package com.gv.client.model;

public class PersonalComercial {
	
	private int codigoSucursal;
	
	private int codigoPersonal;
	
	private String descripcion;
	
	private char cargo;
	
	private boolean anulado;
	
	private int codigoPersonalSuperior;
	
	private int codigoFuerza;

	public PersonalComercial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigoSucursal() {
		return codigoSucursal;
	}

	public void setCodigoSucursal(int codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public int getCodigoPersonal() {
		return codigoPersonal;
	}

	public void setCodigoPersonal(int codigoPersonal) {
		this.codigoPersonal = codigoPersonal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public char getCargo() {
		return cargo;
	}

	public void setCargo(char cargo) {
		this.cargo = cargo;
	}

	public boolean isAnulado() {
		return anulado;
	}

	public void setAnulado(boolean anulado) {
		this.anulado = anulado;
	}

	public int getCodigoPersonalSuperior() {
		return codigoPersonalSuperior;
	}

	public void setCodigoPersonalSuperior(int codigoPersonalSuperior) {
		this.codigoPersonalSuperior = codigoPersonalSuperior;
	}

	public int getCodigoFuerza() {
		return codigoFuerza;
	}

	public void setCodigoFuerza(int codigoFuerza) {
		this.codigoFuerza = codigoFuerza;
	}
	
	

}
