package com.teoria;

public class Bucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=15;
		int i;
		for(i=0;i<=numero;i+=2){
			System.out.println(i);
		}//cierra for
		
		System.out.println("----------");
		System.out.println("Ejemplo con while");
		i=0;
		while(i<numero){
			System.out.println(i);
			i++;
		}
	}

}
