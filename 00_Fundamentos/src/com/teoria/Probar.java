package com.teoria;

public class Probar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente1=new Cliente("juan", 25, true);
		System.out.println(cliente1.getNombre());
		cliente1.setNombre("maria");
		System.out.println(cliente1.getNombre());
		
	}

}
