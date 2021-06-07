package com.teoria;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Polimorfismo en Java - POO");
		Perro perro= new Perro();
		perro.probar();
		perro.comer();
		perro.comunicarse();//viene de la implementacion de 
		//una interfaz de la clase padre
		
		//clase abstracta
		//Animal anima=new Animal();
		//clase abstracta NO se puede instanciar
		
		
		//polimorfismo
		Animal animal=new Perro();//unicamente se pueden usar 
		//metodos de Animal, no de Perro
		animal.comunicarse();
		//perro=(Perro)animal;
		//perro.comer();
		((Perro)animal).comer();//casting
		
		
	}//cierra main

}//cierra class
