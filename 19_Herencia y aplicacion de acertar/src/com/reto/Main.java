package com.reto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int a = (int) ((Math.random() * 100)+1);
			int b; 
			int i; 

			System.out.println("Adivina un numero del 1 al 100");

			System.out.print("Escribe un numero del 1 al 100. Tienes 5 intentos: ");
			b = sc.nextInt();

			for (i=0; i<=4; i++) { 
				if (a == b) {  
					System.out.println("Correcto"); 
					break; } 
    
				else if (i == 4) { 
					System.out.println("No has acertado. El numero era: " + a); 
					break; } 
				
				else if (a > b) 
					System.out.println("El número secreto es MAYOR que " + b);
				else if (a < b)
					System.out.println("El número secreto es MENOR que " + b);

				if (i <=1) { 
					System.out.print("Vuelve a intentarlo: "); 
					b = sc.nextInt(); } 
				else if (i ==2) { 
					int x = (int) (a/10);
					System.out.print("Inténtalo de nuevo: ");
					b = sc.nextInt(); } 
				else if (i >= 3) {
					System.out.print("Ultimo intento: ");
					b = sc.nextInt(); }
			}
	}
}