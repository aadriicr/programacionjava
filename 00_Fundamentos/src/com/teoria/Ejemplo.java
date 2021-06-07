package com.teoria;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mensaje="hola que tal";
		System.out.println(mensaje);
		int unidades=15;
		float precio=7.5f;
		float total=0;
		
		if(precio>10) {
			total= unidades*precio;
		}
		else{
			System.out.println("El precio es muy barato");
		}
		
		
		System.out.println("el total es "+total+"€");
		
		
	}//cierra metodo main

}//cierra clase
