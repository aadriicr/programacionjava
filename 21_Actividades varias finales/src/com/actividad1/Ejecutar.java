package com.actividad1;

public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hija hija1= new Hija("Saludos", 55, false);
		hija1.numero(44);
		hija1.numero();
		hija1.viajar();
		System.out.println(hija1.toString());
	}
	
	/*En el segundo hija.numero(44) se usa la sobrecarga porque hay otro metodo sin valores en su interior
	 *En el primer hija.numero() se usa la sobreescritura porque usamos 2 metodos con un valor diferente */

}
