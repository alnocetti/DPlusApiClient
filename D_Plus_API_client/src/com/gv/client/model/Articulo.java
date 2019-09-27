package com.gv.client.model;

import java.util.List;

public class Articulo {
	
	private int CodigoArticulo;
	
	private String DescripcionArticulo;
	
	private String DescripcionCorta;
	
	private boolean Anulado;
	
	private int UnidadesXBulto;
	
	private int UnidadMinimaFacturacion;
	
	private int FactorFacturacion;
	
	private boolean Fracciona;
	
	private float ValorUMedida;
	
	private float ValorUMedida2;
	
	private boolean ContenidoAlcoholico;
	
	private boolean Retornable;
	
	private boolean ActivoFijo;
	
	private boolean Pasable;
	
	private int BultosXPalet;
	
	private int BultosXPiso;
	
	private int Apilabilidad;
	
	private int CantidadPuertas;
	
	private String PresentacionBulto;
	
	private String PresentacionUnidad;
	
	private float ImpuestosInternosFijos;
	
	private float ImpuestosInternosPorc;
	
	private float PercepcionIBrutos;
	
	private boolean ExentoIVA;
	
	private float IVA;
	
	private String CodigoEANBulto;
	
	private String CodigoEANUnidad;
	
	private boolean MaterialPOP;
	
	private boolean ParaMovilPreventa;
	
	private int AniosAmortizacion;
	
	private String CodigoCompania;
	
	private String CodigoFiscal;
	
	private boolean EsCombo;
	
	private boolean Destacado;
	
	private List<AgrupacionArticulo> FormaDeAgrupar;
	
	private String FuerzasDeVenta;

	
	public Articulo() {
		super();
	}


	public int getCodigoArticulo() {
		return CodigoArticulo;
	}


	public void setCodigoArticulo(int codigoArticulo) {
		this.CodigoArticulo = codigoArticulo;
	}


	public String getDescripcionArticulo() {
		return DescripcionArticulo;
	}


	public void setDescripcionArticulo(String descripcionArticulo) {
		this.DescripcionArticulo = descripcionArticulo;
	}


	public String getDescripcionCorta() {
		return DescripcionCorta;
	}


	public void setDescripcionCorta(String descripcionCorta) {
		this.DescripcionCorta = descripcionCorta;
	}


	public boolean isAnulado() {
		return Anulado;
	}


	public void setAnulado(boolean anulado) {
		this.Anulado = anulado;
	}


	public int getUnidadesXBulto() {
		return UnidadesXBulto;
	}


	public void setUnidadesXBulto(int unidadesXBulto) {
		this.UnidadesXBulto = unidadesXBulto;
	}


	public int getUnidadMinimaFacturacion() {
		return UnidadMinimaFacturacion;
	}


	public void setUnidadMinimaFacturacion(int unidadMinimaFacturacion) {
		this.UnidadMinimaFacturacion = unidadMinimaFacturacion;
	}


	public int getFactorFacturacion() {
		return FactorFacturacion;
	}


	public void setFactorFacturacion(int factorFacturacion) {
		this.FactorFacturacion = factorFacturacion;
	}


	public boolean isFracciona() {
		return Fracciona;
	}


	public void setFracciona(boolean fracciona) {
		this.Fracciona = fracciona;
	}


	public float getValorUMedida() {
		return ValorUMedida;
	}


	public void setValorUMedida(float valorUMedida) {
		this.ValorUMedida = valorUMedida;
	}


	public float getValorUMedida2() {
		return ValorUMedida2;
	}


	public void setValorUMedida2(float valorUMedida2) {
		this.ValorUMedida2 = valorUMedida2;
	}


	public boolean isContenidoAlcoholico() {
		return ContenidoAlcoholico;
	}


	public void setContenidoAlcoholico(boolean contenidoAlcoholico) {
		this.ContenidoAlcoholico = contenidoAlcoholico;
	}


	public boolean isRetornable() {
		return Retornable;
	}


	public void setRetornable(boolean retornable) {
		this.Retornable = retornable;
	}


	public boolean isActivoFijo() {
		return ActivoFijo;
	}


	public void setActivoFijo(boolean activoFijo) {
		this.ActivoFijo = activoFijo;
	}


	public boolean isPasable() {
		return Pasable;
	}


	public void setPasable(boolean pasable) {
		this.Pasable = pasable;
	}


	public int getBultosXPalet() {
		return BultosXPalet;
	}


	public void setBultosXPalet(int bultosXPalet) {
		this.BultosXPalet = bultosXPalet;
	}


	public int getBultosXPiso() {
		return BultosXPiso;
	}


	public void setBultosXPiso(int bultosXPiso) {
		this.BultosXPiso = bultosXPiso;
	}


	public int getApilabilidad() {
		return Apilabilidad;
	}


	public void setApilabilidad(int apilabilidad) {
		this.Apilabilidad = apilabilidad;
	}


	public int getCantidadPuertas() {
		return CantidadPuertas;
	}


	public void setCantidadPuertas(int cantidadPuertas) {
		this.CantidadPuertas = cantidadPuertas;
	}


	public String getPresentacionBulto() {
		return PresentacionBulto;
	}


	public void setPresentacionBulto(String presentacionBulto) {
		this.PresentacionBulto = presentacionBulto;
	}


	public String getPresentacionUnidad() {
		return PresentacionUnidad;
	}


	public void setPresentacionUnidad(String presentacionUnidad) {
		this.PresentacionUnidad = presentacionUnidad;
	}


	public float getImpuestosInternosFijos() {
		return ImpuestosInternosFijos;
	}


	public void setImpuestosInternosFijos(float impuestosInternosFijos) {
		this.ImpuestosInternosFijos = impuestosInternosFijos;
	}


	public float getImpuestosInternosPorc() {
		return ImpuestosInternosPorc;
	}


	public void setImpuestosInternosPorc(float impuestosInternosPorc) {
		this.ImpuestosInternosPorc = impuestosInternosPorc;
	}


	public float getPercepcionIBrutos() {
		return PercepcionIBrutos;
	}


	public void setPercepcionIBrutos(float percepcionIBrutos) {
		this.PercepcionIBrutos = percepcionIBrutos;
	}


	public boolean isExentoIVA() {
		return ExentoIVA;
	}


	public void setExentoIVA(boolean exentoIVA) {
		this.ExentoIVA = exentoIVA;
	}


	public float getIVA() {
		return IVA;
	}


	public void setIVA(float iVA) {
		IVA = iVA;
	}


	public String getCodigoEANBulto() {
		return CodigoEANBulto;
	}


	public void setCodigoEANBulto(String codigoEANBulto) {
		this.CodigoEANBulto = codigoEANBulto;
	}


	public String getCodigoEANUnidad() {
		return CodigoEANUnidad;
	}


	public void setCodigoEANUnidad(String codigoEANUnidad) {
		this.CodigoEANUnidad = codigoEANUnidad;
	}


	public boolean isMaterialPOP() {
		return MaterialPOP;
	}


	public void setMaterialPOP(boolean materialPOP) {
		this.MaterialPOP = materialPOP;
	}


	public boolean isParaMovilPreventa() {
		return ParaMovilPreventa;
	}


	public void setParaMovilPreventa(boolean paraMovilPreventa) {
		this.ParaMovilPreventa = paraMovilPreventa;
	}


	public int getAniosAmortizacion() {
		return AniosAmortizacion;
	}


	public void setAniosAmortizacion(int aniosAmortizacion) {
		this.AniosAmortizacion = aniosAmortizacion;
	}


	public String getCodigoCompania() {
		return CodigoCompania;
	}


	public void setCodigoCompania(String codigoCompania) {
		this.CodigoCompania = codigoCompania;
	}


	public String getCodigoFiscal() {
		return CodigoFiscal;
	}


	public void setCodigoFiscal(String codigoFiscal) {
		this.CodigoFiscal = codigoFiscal;
	}


	public boolean isEsCombo() {
		return EsCombo;
	}


	public void setEsCombo(boolean esCombo) {
		this.EsCombo = esCombo;
	}


	public boolean isDestacado() {
		return Destacado;
	}


	public void setDestacado(boolean destacado) {
		this.Destacado = destacado;
	}


	public List<AgrupacionArticulo> getFormaDeAgrupar() {
		return FormaDeAgrupar;
	}


	public void setFormaDeAgrupar(List<AgrupacionArticulo> formaDeAgrupar) {
		this.FormaDeAgrupar = formaDeAgrupar;
	}


	public String getFuerzasDeVenta() {
		return FuerzasDeVenta;
	}


	public void setFuerzasDeVenta(String fuerzasDeVenta) {
		this.FuerzasDeVenta = fuerzasDeVenta;
	}
	
	
	
	
	

}
