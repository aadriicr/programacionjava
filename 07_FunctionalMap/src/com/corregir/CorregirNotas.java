package com.corregir;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class CorregirNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Boletín de notas");
			System.out.println("Introduzca las notas con números decimales con comas");
			double notaFinal=0;
			
			for(int j=0;j<3;j++) {
				System.out.println("Notas de trimestre "+j);
			double[]notas= new double[3];
			
			for (int i = 0; i < notas.length; i++) {
				System.out.println("Dime la nota "+(i+1));
				notas[i]=sc.nextDouble();
			}
			double media=Arrays.stream(notas).average().getAsDouble();//funcional
			System.out.println("Tu nota es "+Math.round(media*100.0)/100.0);
			System.out.println("Tu nota redondeada es "+Math.round(media));
			notaFinal+=media;
			}//cierra for de los trimestres
			System.out.println("NOTA FINAL sin redondear "+Math.round((notaFinal/3)*100.0)/100.0);
			System.out.println("NOTA FINAL FINAL "+Math.round(notaFinal/3));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error general. Llame a alguien");
		}
		finally {
			sc.close();
		}
		
	}//cierra main
	
	/*Mejoras
	1.Notas de cada trimestre salgan 
	con dos decimales y redondeadas a un número
	
	2.Controlar número que esté entre 0-10
	
	3.Nota en texto con switch .. case
	
	menos 5 : suspenso
	>5<7 . aprobado
	>7 <8 = notable
	>8 y <=10 : sobresaliente*/
	
	

}//cierra class
