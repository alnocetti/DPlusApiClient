package com.gv.client.model;

import java.util.Date;

public class Cliente {
	
	private int CodigoSucursal;
	
	private String CodigoCliente;
	
	private String Nombre;
	
	private String Domicilio;
	
	private String CodigoLocalidad;
	
	private int IdAgrupacion;
	
	private String DescAgrupacion;
	
//	private int IdAreaAgrupa;
//	
//	private String DescAreaAgrupa;
	
	private int IdCanalAgrupa;
	
	private String DescCanalAgrupa;
	
	private int IdSubcanalAgrupa;
	
	private String DescSubcanalAgrupa;
	
	private boolean VendeAlcohol;
	
	private String FechaAlta;
	
	private boolean Anulado;
	
	private String FechaAnulacion;
	
	private float LatitudCoord;
	
	private float LongitudCoord;
	
	private boolean Potencial;
	
	private String TipoContribuyente;
	
	private int CodListaPrecio;
	
	private int IdTipoDocumentoCliente;
	
	private String NumeroCuit;
	
	private String ProvinciasIBR;
	
	private String CodigoProvincia;
	
	private String DescProvincia;
	
	private boolean AgentePercepcion;
	
	private boolean ConvenioMultilateral;
	
	private boolean ExentoIngBrutos;
	
	private String TipoCompPorDefecto;
	
	private float SaldoDeudores;
	
	private boolean BocaQueCobra;
	
	private boolean AplicaIngresosBrutos;
	
	private String Telefonos;
	
	private String Email;
	
	private int IdSubcanalMKT;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigoSucursal() {
		return CodigoSucursal;
	}

	public void setCodigoSucursal(int codigoSucursal) {
		this.CodigoSucursal = codigoSucursal;
	}

	public String getCodigoCliente() {
		return CodigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.CodigoCliente = codigoCliente;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getDomicilio() {
		return Domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.Domicilio = domicilio;
	}

	public String getCodigoLocalidad() {
		return CodigoLocalidad;
	}

	public void setCodigoLocalidad(String codigoLocalidad) {
		this.CodigoLocalidad = codigoLocalidad;
	}

	public int getIdAgrupacion() {
		return IdAgrupacion;
	}

	public void setIdAgrupacion(int idAgrupacion) {
		this.IdAgrupacion = idAgrupacion;
	}

	public String getDescAgrupacion() {
		return DescAgrupacion;
	}

	public void setDescAgrupacion(String descAgrupacion) {
		this.DescAgrupacion = descAgrupacion;
	}

//	public int getIdAreaAgrupa() {
//		return IdAreaAgrupa;
//	}
//
//	public void setIdAreaAgrupa(int idAreaAgrupa) {
//		this.IdAreaAgrupa = idAreaAgrupa;
//	}
//
//	public String getDescAreaAgrupa() {
//		return DescAreaAgrupa;
//	}
//
//	public void setDescAreaAgrupa(String descAreaAgrupa) {
//		this.DescAreaAgrupa = descAreaAgrupa;
//	}

	public int getIdCanalAgrupa() {
		return IdCanalAgrupa;
	}

	public void setIdCanalAgrupa(int idCanalAgrupa) {
		this.IdCanalAgrupa = idCanalAgrupa;
	}

	public String getDescCanalAgrupa() {
		return DescCanalAgrupa;
	}

	public void setDescCanalAgrupa(String descCanalAgrupa) {
		this.DescCanalAgrupa = descCanalAgrupa;
	}

	public int getIdSubcanalAgrupa() {
		return IdSubcanalAgrupa;
	}

	public void setIdSubcanalAgrupa(int idSubcanalAgrupa) {
		this.IdSubcanalAgrupa = idSubcanalAgrupa;
	}

	public String getDescSubcanalAgrupa() {
		return DescSubcanalAgrupa;
	}

	public void setDescSubcanalAgrupa(String descSubcanalAgrupa) {
		this.DescSubcanalAgrupa = descSubcanalAgrupa;
	}

	public boolean isVendeAlcohol() {
		return VendeAlcohol;
	}

	public void setVendeAlcohol(boolean vendeAlcohol) {
		this.VendeAlcohol = vendeAlcohol;
	}

	public String getFechaAlta() {
		return FechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.FechaAlta = fechaAlta;
	}

	public boolean isAnulado() {
		return Anulado;
	}

	public void setAnulado(boolean anulado) {
		this.Anulado = anulado;
	}

	public String getFechaAnulacion() {
		return FechaAnulacion;
	}

	public void setFechaAnulacion(String fechaAnulacion) {
		this.FechaAnulacion = fechaAnulacion;
	}

	public float getLatitudCoord() {
		return LatitudCoord;
	}

	public void setLatitudCoord(float latitudCoord) {
		this.LatitudCoord = latitudCoord;
	}

	public float getLongitudCoord() {
		return LongitudCoord;
	}

	public void setLongitudCoord(float longitudCoord) {
		this.LongitudCoord = longitudCoord;
	}

	public boolean isPotencial() {
		return Potencial;
	}

	public void setPotencial(boolean potencial) {
		this.Potencial = potencial;
	}

	public String getTipoContribuyente() {
		return TipoContribuyente;
	}

	public void setTipoContribuyente(String tipoContribuyente) {
		this.TipoContribuyente = tipoContribuyente;
	}

	public int getCodListaPrecio() {
		return CodListaPrecio;
	}

	public void setCodListaPrecio(int codListaPrecio) {
		this.CodListaPrecio = codListaPrecio;
	}

	public int getIdTipoDocumentoCliente() {
		return IdTipoDocumentoCliente;
	}

	public void setIdTipoDocumentoCliente(int idTipoDocumentoCliente) {
		this.IdTipoDocumentoCliente = idTipoDocumentoCliente;
	}

	public String getNumeroCuit() {
		return NumeroCuit;
	}

	public void setNumeroCuit(String numeroCuit) {
		this.NumeroCuit = numeroCuit;
	}

	public String getProvinciasIBR() {
		return ProvinciasIBR;
	}

	public void setProvinciasIBR(String provinciasIBR) {
		this.ProvinciasIBR = provinciasIBR;
	}

	public String getCodigoProvincia() {
		return CodigoProvincia;
	}

	public void setCodigoProvincia(String codigoProvincia) {
		this.CodigoProvincia = codigoProvincia;
	}

	public String getDescProvincia() {
		return DescProvincia;
	}

	public void setDescProvincia(String descProvincia) {
		this.DescProvincia = descProvincia;
	}

	public boolean isAgentePercepcion() {
		return AgentePercepcion;
	}

	public void setAgentePercepcion(boolean agentePercepcion) {
		this.AgentePercepcion = agentePercepcion;
	}

	public boolean isConvenioMultilateral() {
		return ConvenioMultilateral;
	}

	public void setConvenioMultilateral(boolean convenioMultilateral) {
		this.ConvenioMultilateral = convenioMultilateral;
	}

	public boolean isExentoIngBrutos() {
		return ExentoIngBrutos;
	}

	public void setExentoIngBrutos(boolean exentoIngBrutos) {
		this.ExentoIngBrutos = exentoIngBrutos;
	}

	public String getTipoCompPorDefecto() {
		return TipoCompPorDefecto;
	}

	public void setTipoCompPorDefecto(String tipoCompPorDefecto) {
		this.TipoCompPorDefecto = tipoCompPorDefecto;
	}

	public float getSaldoDeudores() {
		return SaldoDeudores;
	}

	public void setSaldoDeudores(float saldoDeudores) {
		this.SaldoDeudores = saldoDeudores;
	}

	public boolean isBocaQueCobra() {
		return BocaQueCobra;
	}

	public void setBocaQueCobra(boolean bocaQueCobra) {
		this.BocaQueCobra = bocaQueCobra;
	}

	public boolean isAplicaIngresosBrutos() {
		return AplicaIngresosBrutos;
	}

	public void setAplicaIngresosBrutos(boolean aplicaIngresosBrutos) {
		this.AplicaIngresosBrutos = aplicaIngresosBrutos;
	}

	public String getTelefonos() {
		return Telefonos;
	}

	public void setTelefonos(String telefonos) {
		this.Telefonos = telefonos;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public int getIdSubcanalMKT() {
		return IdSubcanalMKT;
	}

	public void setIdSubcanalMKT(int idSubcanalMKT) {
		this.IdSubcanalMKT = idSubcanalMKT;
	}
	
	
	
	

}
