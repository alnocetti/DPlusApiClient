package com.gv.client.model;

import java.util.Date;

public class RutaDeVenta {
	
	private int codigoSucursal;
	
	private int codigoFuerza;
	
	private String codigoModoAtencion;
	
	private int codigoRuta;
	
	private String descripcionRuta;
	
	private int codigoPersonal;
	
	private Date fechaDesde;
	
	private Date fechaHasta;
	
	private int periodicidad;
	
	private int semana;
	
	private boolean atiendeLunes;
	
	private boolean atiendeMartes;
	
	private boolean atiendeMiercoles;
	
	private boolean atiendeJueves;
	
	private boolean atiendeViernes;
	
	private boolean atiendeSabado;
	
	private boolean atiendeDomingo;

	public RutaDeVenta() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getCodigoModoAtencion() {
		return codigoModoAtencion;
	}

	public void setCodigoModoAtencion(String codigoModoAtencion) {
		this.codigoModoAtencion = codigoModoAtencion;
	}

	public int getCodigoRuta() {
		return codigoRuta;
	}

	public void setCodigoRuta(int codigoRuta) {
		this.codigoRuta = codigoRuta;
	}

	public String getDescripcionRuta() {
		return descripcionRuta;
	}

	public void setDescripcionRuta(String descripcionRuta) {
		this.descripcionRuta = descripcionRuta;
	}

	public int getCodigoPersonal() {
		return codigoPersonal;
	}

	public void setCodigoPersonal(int codigoPersonal) {
		this.codigoPersonal = codigoPersonal;
	}

	public Date getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public Date getFechaHasta() {
		return fechaHasta;
	}

	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	public int getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(int periodicidad) {
		this.periodicidad = periodicidad;
	}

	public int getSemana() {
		return semana;
	}

	public void setSemana(int semana) {
		this.semana = semana;
	}

	public boolean isAtiendeLunes() {
		return atiendeLunes;
	}

	public void setAtiendeLunes(boolean atiendeLunes) {
		this.atiendeLunes = atiendeLunes;
	}

	public boolean isAtiendeMartes() {
		return atiendeMartes;
	}

	public void setAtiendeMartes(boolean atiendeMartes) {
		this.atiendeMartes = atiendeMartes;
	}

	public boolean isAtiendeMiercoles() {
		return atiendeMiercoles;
	}

	public void setAtiendeMiercoles(boolean atiendeMiercoles) {
		this.atiendeMiercoles = atiendeMiercoles;
	}

	public boolean isAtiendeJueves() {
		return atiendeJueves;
	}

	public void setAtiendeJueves(boolean atiendeJueves) {
		this.atiendeJueves = atiendeJueves;
	}

	public boolean isAtiendeViernes() {
		return atiendeViernes;
	}

	public void setAtiendeViernes(boolean atiendeViernes) {
		this.atiendeViernes = atiendeViernes;
	}

	public boolean isAtiendeSabado() {
		return atiendeSabado;
	}

	public void setAtiendeSabado(boolean atiendeSabado) {
		this.atiendeSabado = atiendeSabado;
	}

	public boolean isAtiendeDomingo() {
		return atiendeDomingo;
	}

	public void setAtiendeDomingo(boolean atiendeDomingo) {
		this.atiendeDomingo = atiendeDomingo;
	}
	
	//private boolean atiendeBoludos;
	
	

}
