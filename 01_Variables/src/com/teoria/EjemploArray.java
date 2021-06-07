package com.teoria;

public class EjemploArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int[] datos = {15,20,0,17};
		int[] datos2=new int [10];
//		datos[0]=15;
//		datos[1]=20;
//		datos[3]=17;
		
		System.out.println(datos.length);
		System.out.println(datos2.length);
		}
		catch(Exception e) {
			System.out.println("algo falla "+e.getMessage());
		}
		
		

	}//cierra main

}//cierra class
