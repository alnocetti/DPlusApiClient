package com.gv.client.model;

import java.util.Date;

public class FuerzaDeVenta {
	
	private int CodigoSucursal;
	
	private int CodigoFuerza;
	
	private String Descripcion;
	
	private int CodigoDeposito;
	
	private Date FechaPrimerSemana;
	
	private int CodigoJornada;

	public FuerzaDeVenta(int codigoSucursal, int codigoFuerza, String descripcion, int codigoDeposito,
			Date fechaPrimerSemana, int codigoJornada) {
		super();
		this.CodigoSucursal = codigoSucursal;
		this.CodigoFuerza = codigoFuerza;
		this.Descripcion = descripcion;
		this.CodigoDeposito = codigoDeposito;
		this.FechaPrimerSemana = fechaPrimerSemana;
		this.CodigoJornada = codigoJornada;
	}
	
	public FuerzaDeVenta() {
	}

	public int getCodigoSucursal() {
		return CodigoSucursal;
	}

	public void setCodigoSucursal(int codigoSucursal) {
		this.CodigoSucursal = codigoSucursal;
	}

	public int getCodigoFuerza() {
		return CodigoFuerza;
	}

	public void setCodigoFuerza(int codigoFuerza) {
		this.CodigoFuerza = codigoFuerza;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.Descripcion = descripcion;
	}

	public int getCodigoDeposito() {
		return CodigoDeposito;
	}

	public void setCodigoDeposito(int codigoDeposito) {
		this.CodigoDeposito = codigoDeposito;
	}

	public Date getFechaPrimerSemana() {
		return FechaPrimerSemana;
	}

	public void setFechaPrimerSemana(Date fechaPrimerSemana) {
		this.FechaPrimerSemana = fechaPrimerSemana;
	}

	public int getCodigoJornada() {
		return CodigoJornada;
	}

	public void setCodigoJornada(int codigoJornada) {
		this.CodigoJornada = codigoJornada;
	}
	
}
