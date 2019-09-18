package com.gv.client.model;

public class DetallePedido {
	
	private int idPedido;
	
	private int numeroLinea;
	
	private String tipoLinea;
	
	private String codigoPromocion;
	
	private int codigoArticulo;
	
	private int cantidad;
	
	private int unidades;
	
	private float precioUnitarioBruto;
	
	private int bonificacion;
	
	private int numeroLineaPadre;
	
	private String estado;
	
	private boolean error;
	
	private String errorPedido;

	public DetallePedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getNumeroLinea() {
		return numeroLinea;
	}

	public void setNumeroLinea(int numeroLinea) {
		this.numeroLinea = numeroLinea;
	}

	public String getTipoLinea() {
		return tipoLinea;
	}

	public void setTipoLinea(String tipoLinea) {
		this.tipoLinea = tipoLinea;
	}

	public String getCodigoPromocion() {
		return codigoPromocion;
	}

	public void setCodigoPromocion(String codigoPromocion) {
		this.codigoPromocion = codigoPromocion;
	}

	public int getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(int codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public float getPrecioUnitarioBruto() {
		return precioUnitarioBruto;
	}

	public void setPrecioUnitarioBruto(float precioUnitarioBruto) {
		this.precioUnitarioBruto = precioUnitarioBruto;
	}

	public int getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(int bonificacion) {
		this.bonificacion = bonificacion;
	}

	public int getNumeroLineaPadre() {
		return numeroLineaPadre;
	}

	public void setNumeroLineaPadre(int numeroLineaPadre) {
		this.numeroLineaPadre = numeroLineaPadre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getErrorPedido() {
		return errorPedido;
	}

	public void setErrorPedido(String errorPedido) {
		this.errorPedido = errorPedido;
	}
	
	

}
