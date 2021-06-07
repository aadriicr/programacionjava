package com.teoria;

public class Ambito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero=4;
		String mensaje;//=null se pone cuando no tenemos else  
		//declarar una variable
		
		//diferencia entre inizializar y asignar
		
		if (numero>5) {
			mensaje="tienes muchas unidades";
		}
		else {
			mensaje="no tienes unidades suficientes";
		}
		
		System.out.println(mensaje);
		
		
	}//cierra main

}//cierra clase
