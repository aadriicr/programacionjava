package com.teoria;

public class TiposDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Probando tipos de datos");
		//java es un lenguaje compilado
		
		//al ejecutar, eclipse compila el fichero java en 
		//un fichero class y lo ejecuta(run)
		
		String mensaje="un mensaje de prueba";
		int unidades=20;
		float precio=7.5f;
		boolean descuento=true;
		
		float total= unidades*precio;
		
		System.out.println("el total es "+total);
		System.out.println(mensaje);
		
		
		
	}//cierra metodo main

}//cierra class
