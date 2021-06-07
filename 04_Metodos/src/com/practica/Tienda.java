package com.practica;

/*qué significa pojo (en un comentario en tu clase)*/

/*POJO son las iniciales de "Plain Old Java Object", que puede interpretarse 
 * como "Un objeto Java Plano Antiguo". Un POJO es una instancia de una
 *  clase que no extiende ni implementa nada en especial.*/



public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1=new Cliente("pepito","getafe","mitiogitas@gmail.com");
		System.out.println(cliente1.toString());
		cliente1.setCiudad("coslada");
		cliente1.setEmail(null);
		
		System.out.println(cliente1.toString());
		
	}

	

}
