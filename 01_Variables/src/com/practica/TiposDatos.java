package com.practica;

import java.util.Date;

public class TiposDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tienes 20 unidades y el precio es 8,75
		//Si hay descuento, el total es unidades*precio*0.8
		//es decir, hay un descuento del 20%
		//Muestra en consola el total con iva incluido(21%)
		//muestra tambien la fecha y hora actuales
		
		
		int unidades=20;
		float precio=8.75f;
		boolean descuento=true;
		float total=0;
		
		
		
		if (descuento) {
			total=unidades*precio*0.8F;
		}
		else {
			total=unidades*precio;
		}
		
		System.out.println(total*1.21f);
		
		 Date fecha = new Date();
		System.out.println (fecha);
		
	}//cierra main

}//cierra class
