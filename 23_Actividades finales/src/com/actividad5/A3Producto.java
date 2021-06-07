package com.actividad5;

public class A3Producto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numReal;
        int numRedondeado;
        
        //Introducimos el número decimal
        System.out.println("Dime el precio del producto y te lo redondeo ");
        numReal=A3Redondeo.real();
        numRedondeado= (int)(numReal + 0.5);
        
        System.out.println("El redondeo de " +numReal+ " es: "+numRedondeado);
		
		
	}

}
