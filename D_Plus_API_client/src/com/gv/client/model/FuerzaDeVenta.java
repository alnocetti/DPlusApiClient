package com.gv.client.model;

import java.util.Date;

public class FuerzaDeVenta {
	
	private int codigoSucursal;
	
	private int codigoFuerza;
	
	private String descripcion;
	
	private int codigoDeposito;
	
	private Date fechaPrimerSemana;
	
	private int codigoJornada;

	public FuerzaDeVenta(int codigoSucursal, int codigoFuerza, String descripcion, int codigoDeposito,
			Date fechaPrimerSemana, int codigoJornada) {
		super();
		this.codigoSucursal = codigoSucursal;
		this.codigoFuerza = codigoFuerza;
		this.descripcion = descripcion;
		this.codigoDeposito = codigoDeposito;
		this.fechaPrimerSemana = fechaPrimerSemana;
		this.codigoJornada = codigoJornada;
	}
	
	public FuerzaDeVenta() {
	}

	public int getCodigoSucursal() {
		return codigoSucursal;
	}

	public void setCodigoSucursal(int codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public int getCodigoFuerza() {
		return codigoFuerza;
	}

	public void setCodigoFuerza(int codigoFuerza) {
		this.codigoFuerza = codigoFuerza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCodigoDeposito() {
		return codigoDeposito;
	}

	public void setCodigoDeposito(int codigoDeposito) {
		this.codigoDeposito = codigoDeposito;
	}

	public Date getFechaPrimerSemana() {
		return fechaPrimerSemana;
	}

	public void setFechaPrimerSemana(Date fechaPrimerSemana) {
		this.fechaPrimerSemana = fechaPrimerSemana;
	}

	public int getCodigoJornada() {
		return codigoJornada;
	}

	public void setCodigoJornada(int codigoJornada) {
		this.codigoJornada = codigoJornada;
	}
	
}
