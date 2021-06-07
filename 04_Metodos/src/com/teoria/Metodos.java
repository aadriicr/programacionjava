package com.teoria;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		llamar();
		calcular(5,6.5F);
		
		Calcular calcular=new Calcular(10,20,"mensaje global");//crear un objeto basado
		//en una clase
		int sumaTotal=calcular.sumar(5, 9);
		System.out.println("la suma es "+sumaTotal);
		calcular.setMensaje("En un lugar de la mancha");
		String mensajePersonalizado=calcular.getMensaje();
		System.out.println(mensajePersonalizado);
		
		
		//CRUD create read update delete
		
		//insertar,create
		com.prueba.Calcular calcular2=new com.prueba.Calcular(false, "camisa", 5);
		
		
		//read,select
		System.out.println(calcular2.toString());
		
		//update: actualizar las unidades
		calcular2.setUnidades(7);
		System.out.println(calcular2.toString());
		
		
		
		
	}//cierra main
	
	public static void llamar(){
		System.out.println("usando metodo llamar");
	}
	public static float calcular(int x, float y) {
		System.out.println("El resultado es "+(x*y));
		return x*y;
	}

}//cierra clase
