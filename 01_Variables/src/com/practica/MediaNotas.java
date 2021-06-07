package com.practica;

public class MediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] notas = {4,7,9,5,3,8};
		double media = 0;
		for (int i=0; i < notas.length; i++) {
			 media = media + notas[i];
			};
		media=media/notas.length;
		System.out.println("la media es "+media);
		
		if(media<5) {
			System.out.println("Suspenso");
		}
		else if(media>=5 && media<7){
			System.out.println("Bien");
		}
		else if (media>=7 && media<9) {
			System.out.println("Notable");
		}
		else if (media>=9 && media<=10) {
			System.out.println("Sobresaliente");
		}
		
		else {
			System.out.println("Numero no valido");
		}
		
	}

}
