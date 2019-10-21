package com.gv.client.model;

public class PersonalComercial {
	
	private int CodigoSucursal;
	
	private int CodigoPersonal;
	
	private String Descripcion;
	
	private String CodigoModoAtencion;
	
	private String Cargo;
	
	private boolean Anulado;
	
	private int CodigoPersonalSuperior;
	
	private int CodigoFuerza;

	public PersonalComercial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigoSucursal() {
		return CodigoSucursal;
	}

	public void setCodigoSucursal(int codigoSucursal) {
		this.CodigoSucursal = codigoSucursal;
	}

	public int getCodigoPersonal() {
		return CodigoPersonal;
	}

	public void setCodigoPersonal(int codigoPersonal) {
		this.CodigoPersonal = codigoPersonal;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.Descripcion = descripcion;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		this.Cargo = cargo;
	}

	public boolean isAnulado() {
		return Anulado;
	}

	public void setAnulado(boolean anulado) {
		this.Anulado = anulado;
	}

	public int getCodigoPersonalSuperior() {
		return CodigoPersonalSuperior;
	}

	public void setCodigoPersonalSuperior(int codigoPersonalSuperior) {
		this.CodigoPersonalSuperior = codigoPersonalSuperior;
	}

	public int getCodigoFuerza() {
		return CodigoFuerza;
	}

	public void setCodigoFuerza(int codigoFuerza) {
		this.CodigoFuerza = codigoFuerza;
	}

	public String getCodigoModoAtencion() {
		return CodigoModoAtencion;
	}

	public void setCodigoModoAtencion(String codigoModoAtencion) {
		CodigoModoAtencion = codigoModoAtencion;
	}
	
	

}
