package com.gv.client.model;

import java.util.List;

public class Articulo {
	
	private int codigoArticulo;
	
	private String descripcionArticulo;
	
	private String descripcionCorta;
	
	private boolean anulado;
	
	private int unidadesXBulto;
	
	private int unidadMinimaFacturacion;
	
	private int factorFacturacion;
	
	private boolean fracciona;
	
	private float valorUMedida;
	
	private float valorUMedida2;
	
	private boolean contenidoAlcoholico;
	
	private boolean retornable;
	
	private boolean activoFijo;
	
	private boolean pasable;
	
	private int bultosXPalet;
	
	private int bultosXPiso;
	
	private int apilabilidad;
	
	private int cantidadPuertas;
	
	private String presentacionBulto;
	
	private String presentacionUnidad;
	
	private float impuestosInternosFijos;
	
	private float impuestosInternosPorc;
	
	private float percepcionIBrutos;
	
	private boolean exentoIVA;
	
	private float IVA;
	
	private String codigoEANBulto;
	
	private String codigoEANUnidad;
	
	private boolean materialPOP;
	
	private boolean paraMovilPreventa;
	
	private int aniosAmortizacion;
	
	private String codigoCompania;
	
	private String codigoFiscal;
	
	private boolean esCombo;
	
	private boolean destacado;
	
	private List<AgrupacionArticulo> formaDeAgrupar;
	
	private String fuerzasDeVenta;

	
	public Articulo() {
		super();
	}


	public int getCodigoArticulo() {
		return codigoArticulo;
	}


	public void setCodigoArticulo(int codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}


	public String getDescripcionArticulo() {
		return descripcionArticulo;
	}


	public void setDescripcionArticulo(String descripcionArticulo) {
		this.descripcionArticulo = descripcionArticulo;
	}


	public String getDescripcionCorta() {
		return descripcionCorta;
	}


	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}


	public boolean isAnulado() {
		return anulado;
	}


	public void setAnulado(boolean anulado) {
		this.anulado = anulado;
	}


	public int getUnidadesXBulto() {
		return unidadesXBulto;
	}


	public void setUnidadesXBulto(int unidadesXBulto) {
		this.unidadesXBulto = unidadesXBulto;
	}


	public int getUnidadMinimaFacturacion() {
		return unidadMinimaFacturacion;
	}


	public void setUnidadMinimaFacturacion(int unidadMinimaFacturacion) {
		this.unidadMinimaFacturacion = unidadMinimaFacturacion;
	}


	public int getFactorFacturacion() {
		return factorFacturacion;
	}


	public void setFactorFacturacion(int factorFacturacion) {
		this.factorFacturacion = factorFacturacion;
	}


	public boolean isFracciona() {
		return fracciona;
	}


	public void setFracciona(boolean fracciona) {
		this.fracciona = fracciona;
	}


	public float getValorUMedida() {
		return valorUMedida;
	}


	public void setValorUMedida(float valorUMedida) {
		this.valorUMedida = valorUMedida;
	}


	public float getValorUMedida2() {
		return valorUMedida2;
	}


	public void setValorUMedida2(float valorUMedida2) {
		this.valorUMedida2 = valorUMedida2;
	}


	public boolean isContenidoAlcoholico() {
		return contenidoAlcoholico;
	}


	public void setContenidoAlcoholico(boolean contenidoAlcoholico) {
		this.contenidoAlcoholico = contenidoAlcoholico;
	}


	public boolean isRetornable() {
		return retornable;
	}


	public void setRetornable(boolean retornable) {
		this.retornable = retornable;
	}


	public boolean isActivoFijo() {
		return activoFijo;
	}


	public void setActivoFijo(boolean activoFijo) {
		this.activoFijo = activoFijo;
	}


	public boolean isPasable() {
		return pasable;
	}


	public void setPasable(boolean pasable) {
		this.pasable = pasable;
	}


	public int getBultosXPalet() {
		return bultosXPalet;
	}


	public void setBultosXPalet(int bultosXPalet) {
		this.bultosXPalet = bultosXPalet;
	}


	public int getBultosXPiso() {
		return bultosXPiso;
	}


	public void setBultosXPiso(int bultosXPiso) {
		this.bultosXPiso = bultosXPiso;
	}


	public int getApilabilidad() {
		return apilabilidad;
	}


	public void setApilabilidad(int apilabilidad) {
		this.apilabilidad = apilabilidad;
	}


	public int getCantidadPuertas() {
		return cantidadPuertas;
	}


	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}


	public String getPresentacionBulto() {
		return presentacionBulto;
	}


	public void setPresentacionBulto(String presentacionBulto) {
		this.presentacionBulto = presentacionBulto;
	}


	public String getPresentacionUnidad() {
		return presentacionUnidad;
	}


	public void setPresentacionUnidad(String presentacionUnidad) {
		this.presentacionUnidad = presentacionUnidad;
	}


	public float getImpuestosInternosFijos() {
		return impuestosInternosFijos;
	}


	public void setImpuestosInternosFijos(float impuestosInternosFijos) {
		this.impuestosInternosFijos = impuestosInternosFijos;
	}


	public float getImpuestosInternosPorc() {
		return impuestosInternosPorc;
	}


	public void setImpuestosInternosPorc(float impuestosInternosPorc) {
		this.impuestosInternosPorc = impuestosInternosPorc;
	}


	public float getPercepcionIBrutos() {
		return percepcionIBrutos;
	}


	public void setPercepcionIBrutos(float percepcionIBrutos) {
		this.percepcionIBrutos = percepcionIBrutos;
	}


	public boolean isExentoIVA() {
		return exentoIVA;
	}


	public void setExentoIVA(boolean exentoIVA) {
		this.exentoIVA = exentoIVA;
	}


	public float getIVA() {
		return IVA;
	}


	public void setIVA(float iVA) {
		IVA = iVA;
	}


	public String getCodigoEANBulto() {
		return codigoEANBulto;
	}


	public void setCodigoEANBulto(String codigoEANBulto) {
		this.codigoEANBulto = codigoEANBulto;
	}


	public String getCodigoEANUnidad() {
		return codigoEANUnidad;
	}


	public void setCodigoEANUnidad(String codigoEANUnidad) {
		this.codigoEANUnidad = codigoEANUnidad;
	}


	public boolean isMaterialPOP() {
		return materialPOP;
	}


	public void setMaterialPOP(boolean materialPOP) {
		this.materialPOP = materialPOP;
	}


	public boolean isParaMovilPreventa() {
		return paraMovilPreventa;
	}


	public void setParaMovilPreventa(boolean paraMovilPreventa) {
		this.paraMovilPreventa = paraMovilPreventa;
	}


	public int getAniosAmortizacion() {
		return aniosAmortizacion;
	}


	public void setAniosAmortizacion(int aniosAmortizacion) {
		this.aniosAmortizacion = aniosAmortizacion;
	}


	public String getCodigoCompania() {
		return codigoCompania;
	}


	public void setCodigoCompania(String codigoCompania) {
		this.codigoCompania = codigoCompania;
	}


	public String getCodigoFiscal() {
		return codigoFiscal;
	}


	public void setCodigoFiscal(String codigoFiscal) {
		this.codigoFiscal = codigoFiscal;
	}


	public boolean isEsCombo() {
		return esCombo;
	}


	public void setEsCombo(boolean esCombo) {
		this.esCombo = esCombo;
	}


	public boolean isDestacado() {
		return destacado;
	}


	public void setDestacado(boolean destacado) {
		this.destacado = destacado;
	}


	public List<AgrupacionArticulo> getFormaDeAgrupar() {
		return formaDeAgrupar;
	}


	public void setFormaDeAgrupar(List<AgrupacionArticulo> formaDeAgrupar) {
		this.formaDeAgrupar = formaDeAgrupar;
	}


	public String getFuerzasDeVenta() {
		return fuerzasDeVenta;
	}


	public void setFuerzasDeVenta(String fuerzasDeVenta) {
		this.fuerzasDeVenta = fuerzasDeVenta;
	}
	
	
	
	
	

}
