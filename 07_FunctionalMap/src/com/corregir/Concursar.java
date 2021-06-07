package com.corregir;

import java.util.Scanner;

public class Concursar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Adivine el numero magico");
		System.out.println("Tienes 3 intentos");
		
		double numero=Math.round(10*Math.random());//debe ser entero entre 0-10
		//bucle de 3 intentos para adivinar el numeroMagico
		
		for (int i=0; i<3;i++) {
		Scanner sc=new Scanner(System.in);
		int numeroUsuario=sc.nextInt();
		if((int)numero==numeroUsuario) {
			System.out.println("Lo has adivinado");
		}
		else {
			System.out.println("No lo has adivinado");
		}
		}
		
		System.out.println("El numero a adivinar era "+numero);
		
		
		
		
		
	}//cierra main

}//cierra class
