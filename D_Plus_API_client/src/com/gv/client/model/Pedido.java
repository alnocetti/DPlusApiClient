package com.gv.client.model;

import java.util.Date;

public class Pedido {
	
	private int idPedido;
	
	private int codigoCliente;
	
	private Date fechaPedido;
	
	private Date fechaEntrega;
	
	private int tipoComprobante;
	
	private int codigoSucursal;
	
	private int numeroPedido;
	
	private int tipoPago;
	
	private String origenPedido;
	
	private int codigoPersonal;
	
	private String nota;
	
	private boolean eliminado;
	
	private String errorPedido;

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public int getTipoComprobante() {
		return tipoComprobante;
	}

	public void setTipoComprobante(int tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	public int getCodigoSucursal() {
		return codigoSucursal;
	}

	public void setCodigoSucursal(int codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public int getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(int tipoPago) {
		this.tipoPago = tipoPago;
	}

	public String getOrigenPedido() {
		return origenPedido;
	}

	public void setOrigenPedido(String origenPedido) {
		this.origenPedido = origenPedido;
	}

	public int getCodigoPersonal() {
		return codigoPersonal;
	}

	public void setCodigoPersonal(int codigoPersonal) {
		this.codigoPersonal = codigoPersonal;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public boolean isEliminado() {
		return eliminado;
	}

	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}

	public String getErrorPedido() {
		return errorPedido;
	}

	public void setErrorPedido(String errorPedido) {
		this.errorPedido = errorPedido;
	}
	
	

}
