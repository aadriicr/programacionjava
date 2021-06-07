package com.ejercicio1;

import java.util.Date;

public class Padre {
	private String nombre;
	protected float facturacion;
	protected Date fechaEntrada;
	
	
	public Padre(String nombre, float facturacion, Date fechaEntrada) {
		super();
		this.nombre = nombre;
		this.facturacion = facturacion;
		this.fechaEntrada = fechaEntrada;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getFacturacion() {
		return facturacion;
	}


	public void setFacturacion(float facturacion) {
		this.facturacion = facturacion;
	}


	public Date getFechaEntrada() {
		return fechaEntrada;
	}


	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}


	@Override
	public String toString() {
		return "Padre [nombre=" + nombre + ", facturacion=" + facturacion + ", fechaEntrada=" + fechaEntrada + "]";
	}
	
	
	//Sobreescritura o sobrecarga?
	public void mensaje() {
		System.out.println("un mensaje");
	}
	public void mensaje(String texto) {
		System.out.println(texto);
	}
	
	
}
