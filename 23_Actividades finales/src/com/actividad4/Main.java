package com.actividad4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] asignaturas;
		
		asignaturas = new String[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Dime la asignatura numero "+i);
			String hola = sc.nextLine();
			if (hola.toUpperCase().equals("Q")) {
				i = 5;
			} else {
				asignaturas[i] = hola;
			}
					
		}
		System.out.println("El resultado es:");
		for (int i = 0; i < asignaturas.length; i++) {
			System.out.println(asignaturas[i]);
		}
	}

}
