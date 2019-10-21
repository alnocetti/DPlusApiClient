package com.gv.client.model;

public class RutaDeVenta {
	
	private int CodigoSucursal;
	
	private int CodigoFuerza;
	
	private String CodigoModoAtencion;
	
	private int CodigoRuta;
	
	private String DescripcionRuta;
	
	private int CodigoPersonal;
	
	private String FechaDesde;
	
	private String FechaHasta;
	
	private int Periodicidad;
	
	private int Semana;
	
	private boolean AtiendeLunes;
	
	private boolean AtiendeMartes;
	
	private boolean AtiendeMiercoles;
	
	private boolean AtiendeJueves;
	
	private boolean AtiendeViernes;
	
	private boolean AtiendeSabado;
	
	private boolean AtiendeDomingo;
	
	private boolean Anulado;
	
	private int CodigoPersonalSuperior;

	public boolean isAnulado() {
		return Anulado;
	}

	public void setAnulado(boolean anulado) {
		Anulado = anulado;
	}

	public int getCodigoPersonalSuperior() {
		return CodigoPersonalSuperior;
	}

	public void setCodigoPersonalSuperior(int codigoPersonalSuperior) {
		CodigoPersonalSuperior = codigoPersonalSuperior;
	}

	public RutaDeVenta() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getCodigoModoAtencion() {
		return CodigoModoAtencion;
	}

	public void setCodigoModoAtencion(String codigoModoAtencion) {
		this.CodigoModoAtencion = codigoModoAtencion;
	}

	public int getCodigoRuta() {
		return CodigoRuta;
	}

	public void setCodigoRuta(int codigoRuta) {
		this.CodigoRuta = codigoRuta;
	}

	public String getDescripcionRuta() {
		return DescripcionRuta;
	}

	public void setDescripcionRuta(String descripcionRuta) {
		this.DescripcionRuta = descripcionRuta;
	}

	public int getCodigoPersonal() {
		return CodigoPersonal;
	}

	public void setCodigoPersonal(int codigoPersonal) {
		this.CodigoPersonal = codigoPersonal;
	}

	public String getFechaDesde() {
		return FechaDesde;
	}

	public void setFechaDesde(String fechaDesde) {
		this.FechaDesde = fechaDesde;
	}

	public String getFechaHasta() {
		return FechaHasta;
	}

	public void setFechaHasta(String fechaHasta) {
		this.FechaHasta = fechaHasta;
	}

	public int getPeriodicidad() {
		return Periodicidad;
	}

	public void setPeriodicidad(int periodicidad) {
		this.Periodicidad = periodicidad;
	}

	public int getSemana() {
		return Semana;
	}

	public void setSemana(int semana) {
		this.Semana = semana;
	}

	public boolean isAtiendeLunes() {
		return AtiendeLunes;
	}

	public void setAtiendeLunes(boolean atiendeLunes) {
		this.AtiendeLunes = atiendeLunes;
	}

	public boolean isAtiendeMartes() {
		return AtiendeMartes;
	}

	public void setAtiendeMartes(boolean atiendeMartes) {
		this.AtiendeMartes = atiendeMartes;
	}

	public boolean isAtiendeMiercoles() {
		return AtiendeMiercoles;
	}

	public void setAtiendeMiercoles(boolean atiendeMiercoles) {
		this.AtiendeMiercoles = atiendeMiercoles;
	}

	public boolean isAtiendeJueves() {
		return AtiendeJueves;
	}

	public void setAtiendeJueves(boolean atiendeJueves) {
		this.AtiendeJueves = atiendeJueves;
	}

	public boolean isAtiendeViernes() {
		return AtiendeViernes;
	}

	public void setAtiendeViernes(boolean atiendeViernes) {
		this.AtiendeViernes = atiendeViernes;
	}

	public boolean isAtiendeSabado() {
		return AtiendeSabado;
	}

	public void setAtiendeSabado(boolean atiendeSabado) {
		this.AtiendeSabado = atiendeSabado;
	}

	public boolean isAtiendeDomingo() {
		return AtiendeDomingo;
	}

	public void setAtiendeDomingo(boolean atiendeDomingo) {
		this.AtiendeDomingo = atiendeDomingo;
	}
	
	//private boolean atiendeBoludos;
	
	

}
