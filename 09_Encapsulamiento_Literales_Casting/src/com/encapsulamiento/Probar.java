package com.encapsulamiento;

public class Probar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche coche= new Coche("seat", 18000, new Motor("diesel", 15000, false));
		System.out.println(coche.getPrecio());
		System.out.println(coche.getMotor().getCombustible());
		
		Motor motorGasolina= new Motor("gasolina", 2000, false);
		
		Coche coche1 = new Coche("audi", 2000, motorGasolina);
		System.out.println(coche1.getMotor().getCombustible());
		
		
	}

}
