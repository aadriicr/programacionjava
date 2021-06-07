package com.actividad5;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long TiempoI, TiempoF, tiempo1;
		  TiempoI = System.currentTimeMillis();
		  
		int[] nums = {7,2,9,4,7,19,6};
		
		int sumaT = 0;
		int sumaF = 0;
		
		//Metodo tradicional
		for(int i = 0; i < nums.length; i++) {
			sumaT += nums[i];
		}
		
		TiempoF = System.currentTimeMillis(); 
		  tiempo1 = TiempoF - TiempoI; 
		  System.out.println("El programa tarda " + tiempo1+" milisegundos en ejecutarse"); 
		
		  
		  
		  Long TiempoIN, TiempoFI, tiempo;
		  TiempoIN = System.currentTimeMillis();
		
		//Metodo funcional
		sumaF = Arrays.stream(nums).sum();
		
		
		  TiempoFI = System.currentTimeMillis(); 
		  tiempo = TiempoFI - TiempoIN; 
		  System.out.println("El programa tarda " + tiempo+" milisegundos en ejecutarse"); 
	}
	

}
