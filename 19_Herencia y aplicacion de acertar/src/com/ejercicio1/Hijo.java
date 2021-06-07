package com.ejercicio1;

import java.util.Date;

public class Hijo extends Padre {
	
	
	private String ciudad;
	private int numero;
	public Hijo(String nombre, float facturacion, Date fechaEntrada, String ciudad, int numero) {
		super(nombre, facturacion, fechaEntrada);
		this.ciudad = ciudad;
		this.numero = numero;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Hijo [ciudad=" + ciudad + ", numero=" + numero + ", fecha "+ fechaEntrada+", facturacion "+facturacion+ "]";
	}
	
	}

