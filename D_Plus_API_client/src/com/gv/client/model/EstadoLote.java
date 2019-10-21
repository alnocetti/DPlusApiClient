package com.gv.client.model;

public class EstadoLote {
	
	private String idLote;
	
	private int Empresa;
	
	private int IdUsuario;
	
	private String Entidad;
	
	private String FechaHoraCarga;
	
	private String FechaHoraFin;
	
	private String Estado;
	
	private String DescEstado;
	
	private String LineaError;
	
	private String DescError;

	public EstadoLote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdLote() {
		return idLote;
	}

	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}

	public int getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(int empresa) {
		Empresa = empresa;
	}

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getEntidad() {
		return Entidad;
	}

	public void setEntidad(String entidad) {
		Entidad = entidad;
	}

	public String getFechaHoraCarga() {
		return FechaHoraCarga;
	}

	public void setFechaHoraCarga(String fechaHoraCarga) {
		FechaHoraCarga = fechaHoraCarga;
	}

	public String getFechaHoraFin() {
		return FechaHoraFin;
	}

	public void setFechaHoraFin(String fechaHoraFin) {
		FechaHoraFin = fechaHoraFin;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getDescEstado() {
		return DescEstado;
	}

	public void setDescEstado(String descEstado) {
		DescEstado = descEstado;
	}

	public String getLineaError() {
		return LineaError;
	}

	public void setLineaError(String lineaError) {
		LineaError = lineaError;
	}

	public String getDescError() {
		return DescError;
	}

	public void setDescError(String descError) {
		DescError = descError;
	}
	
	

}
