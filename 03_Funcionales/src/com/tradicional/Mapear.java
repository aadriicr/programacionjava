package com.tradicional;

public class Mapear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crear un array con un numero de unidades
		int[] unidades= {6,7,8,9,65,5};
		int totalUnidades=0;
		for (int i = 0; i < unidades.length; i++) {
			totalUnidades+=unidades[i];
		}//cierra for
		System.out.println("La suma de las unidades es "+totalUnidades );
		
	}//cierra main

}//cierra class
