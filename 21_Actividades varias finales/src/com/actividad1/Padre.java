package com.actividad1;

public class Padre {

	private String saludo ="Hola";
	private int numero = 9;
	private boolean descuento = false;
	
	public Padre(String saludo, int numero, boolean descuento) {
		super();
		this.saludo = saludo;
		this.numero = numero;
		this.descuento = descuento;
	}

	public String getSaludo() {
		return saludo;
	}
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isDescuento() {
		return descuento;
	}
	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}
	
	@Override
	public String toString() {
		return saludo;
	}
	
	public void numero(int numero) {
		System.out.println("Tengo "+numero+" € en la cuenta del banco del padre");
		
	}
	
	
	
	

}
