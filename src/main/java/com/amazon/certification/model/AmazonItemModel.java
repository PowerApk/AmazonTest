package com.amazon.certification.model;

public class AmazonItemModel {
	
	String busqueda;
	String indice;
	String contenido;
	
	public AmazonItemModel(String busqueda, String indice) {
		this.busqueda = busqueda;
		this.indice = indice;
		this.contenido = "Vacio";
	}
	
	public String getBusqueda() {
		return busqueda;
	}

	public void setBusqueda(String busqueda) {
		this.busqueda = busqueda;
	}

	public String getIndice() {
		return indice;
	}

	public void setIndice(String indice) {
		this.indice = indice;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

}
