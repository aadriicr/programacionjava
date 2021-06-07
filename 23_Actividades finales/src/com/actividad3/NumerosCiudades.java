package com.actividad3;
import java.util.ArrayList;

public class NumerosCiudades {

	public static void main(String[] args) {
		System.out.println("Las ciudades:");
		ArrayList<String> ciudad = new ArrayList<String>();
	    ciudad.add("Madrid");
	    ciudad.add("Sevilla");
	    ciudad.add("Madrid");
	    ciudad.add("Valencia");
	    
	    for (int i = 0; i < ciudad.size(); i++) {
	      System.out.println(ciudad.get(i));
	    }

	    System.out.println("----------------");
	    
	    System.out.println("Los numeros:");
	    ArrayList<Integer> numeros = new ArrayList<Integer>();
	    numeros.add(50);
	    numeros.add(40);
	    numeros.add(35);
	    numeros.add(81);
	    
	    for (int i : numeros) {
	      System.out.println(i);
	    }
	}

}
