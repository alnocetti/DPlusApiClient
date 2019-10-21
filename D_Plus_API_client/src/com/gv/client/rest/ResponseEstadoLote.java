package com.gv.client.rest;

import java.util.List;
import com.gv.client.model.EstadoLote;

public class ResponseEstadoLote {
	
	private List<EstadoLote> EstadoLote;

	public ResponseEstadoLote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<EstadoLote> getEstadoLote() {
		return EstadoLote;
	}

	public void setEstadoLote(List<EstadoLote> estadoLote) {
		EstadoLote = estadoLote;
	}

	
}
