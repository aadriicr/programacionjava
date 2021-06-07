package com.practica;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1. Explica con un ejemplo en Java
		 *  la diferencia entre & y && 
		 *  (operador con cortocircuito)*/
		
		
		
		/* El & es un operador lógico operador, mientras
		 * que los && es una operación lógica, es decir, porque si 
		 * no se cumple la condición de un término no se evalúa 
		 * el resto de la operación.
		 */
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		int e=5;
		int f=6;
		
		if (a == b || c == d || e == f) { 
		    System.out.println("se cumple");
		} 
		else {
			System.out.print("no se cumple");
		}
		
	}

}
