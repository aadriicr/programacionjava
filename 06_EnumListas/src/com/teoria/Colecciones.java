package com.teoria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//usamos libreria java collection framework (JFC)
		
		//crear listas: soporta duplicados y en orden de introduccion
		List<String> clientes =new ArrayList<String>();//interfaces y polimorfismo
		clientes.add("Juan Lopez");
		clientes.add("Maria Perez");
		
		System.out.println("Total capacidad "+clientes.size());
		System.out.println("Total elementos "+clientes);
		System.out.println("Primer cliente "+clientes.get(0));
		System.out.println("¿Hay clientes? "+!clientes.isEmpty());
		
		//comprobar si esta maria perez entre mis clientes
		System.out.println("¿Esta Maria Perez? "+clientes.contains("Maria Perez"));
		System.out.println("Maria perez esta en la posicion "+(clientes.indexOf("Maria Perez")+1));

		//recorrer elementos de la lista con Iterator
		Iterator<String> iterador= clientes.iterator();
		while (iterador.hasNext()) {
			String cliente = iterador.next();
			System.out.println(cliente);
			
		}
		
		//porque usar list -Array list   en lugar de array normal
		
		//crear conjuntos - set
		
		Set<Integer> notas = new HashSet<Integer>();
		notas.add(100);
		notas.add(150);
		
		//conjunto no tiene get y index of
		
		System.out.println("Total elementos "+notas.size());
		System.out.println("Total elementos "+notas);
		
		//opcion1
		for (Integer nota : notas) {
			System.out.println(nota);
		}
		
		//opcion2
		Iterator<Integer> itset= notas.iterator();
		while (itset.hasNext()) {
			int numero = itset.next();
			System.out.println(numero);
			
		}
		//crear map
		
		Map<String, Float> ventas =new HashMap<String, Float>();
		ventas.put("Telefonica", 147.7f);
		ventas.put("Indra", 932.25f);
		System.out.println("Total elementos "+ventas.size());
		System.out.println(ventas);
		System.out.println(ventas.get("Indra"));
		System.out.println("¿Esta telefonica? "+ventas.containsKey("Telefonica"));
		
		
		//como puedo utilizar Iterator con un map
		Iterator<Float> ventas2021= ((List<Float>) ventas).iterator();
		while (ventas2021.hasNext()) {
			Float venta = ventas2021.next();
			System.out.println(venta);
			
		}
	
	}
	
	

}
