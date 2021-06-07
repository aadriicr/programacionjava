package com.actividad1;

public class Hija extends Padre{
	public Hija(String saludo, int numero, boolean descuento) {
		super(saludo, numero, descuento);
		// TODO Auto-generated constructor stub
	}

		//SOBREESCRITURA
	public void numero(int numero) {
		System.out.println("Tengo "+numero+" € en la cuenta del banco de la hija");
		
	}
	
	
	//SOBRECARGA
	public void numero() {
		System.out.println("Mi dinero");
	}
	
	public void viajar() {
		System.out.println("Estoy viajando de la hija");
	}
}
