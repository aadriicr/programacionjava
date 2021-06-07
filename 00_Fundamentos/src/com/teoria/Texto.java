package com.teoria;

public class Texto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto="En un lugar de la Mancha";
		System.out.println("Letra en posición 5 "+texto.charAt(6));
		System.out.println("Texto en Mayusculas "+texto.toUpperCase());
		System.out.println("Trozo de 6-10 "+texto.substring(6,10));
		System.out.println("Posicion del @ "+texto.indexOf("@"));
		
	}

}
