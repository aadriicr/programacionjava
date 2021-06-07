package com.actividad2;

public class Ejecutar implements Imetodos{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejecutar ejecutar1= new Ejecutar();
		ejecutar1.transporte("andando");
		ejecutar1.comprar();
	}

	@Override
	public void comprar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy comprando");
		
	}

	@Override
	public void transporte(String texto) {
		// TODO Auto-generated method stub
		System.out.println("Estoy yendo a comprar "+texto);
		
		
	}

}
