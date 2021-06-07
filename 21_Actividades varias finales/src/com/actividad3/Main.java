package com.actividad3;

public class Main {
	
	public void miTienda(int unidades, double precio, boolean descuento) {
		double total=0;
		
		if (descuento== true) {
			total= (unidades*precio)-(unidades*precio*0.15);
		}
		else {
			total=(unidades*precio);
		}
		System.out.println("Hay "+unidades+"\nCuestan "+precio+"€"+"\nEl total es "+total+"€");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ejecutar= new Main();
		ejecutar.miTienda(5, 20, false);
	}

}
