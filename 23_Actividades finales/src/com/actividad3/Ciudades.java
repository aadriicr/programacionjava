package com.actividad3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ciudades { 
  public static void main(String[] args) { 
	  
    ArrayList<String> ciudad = new ArrayList<String>();
    ciudad.add("Madrid");
    ciudad.add("Sevilla");
    ciudad.add("Madrid");
    ciudad.add("Valencia");
    ciudad.add("Sevilla");
    ciudad.add("Madrid");
    
    Iterator<String> iterador = ciudad.iterator();
	while (iterador.hasNext()) {
		String ciudad1 = iterador.next();
		System.out.println(ciudad);
		
System.out.println("---------3.2---------");
		
		List<String> lugares = new ArrayList<String>();
		lugares.add("Madrid");
		lugares.add("Sevilla");
		lugares.add("Madrid");
		lugares.add("Valencia");
		
		Iterator<String> it = lugares.iterator();
		while (it.hasNext()) {
			String lugar = it.next();
			System.out.println(lugar);
					
		}
		
		System.out.println("Listado de números:");
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
}
