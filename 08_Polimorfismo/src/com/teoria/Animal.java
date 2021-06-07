package com.teoria;

public class Animal implements IAnimal {

	@Override
	public void comunicarse() {
		// TODO Auto-generated method stub
		System.out.println("Me estoy comunicando");

	}
	public void probar() {
		System.out.println("Estoy probando");
	}
	public void probar(String comida) {
		System.out.println("Estoy probando "+comida);
	}
}
