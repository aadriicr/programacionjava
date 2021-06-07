package com.practica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2.La nota media en cada centro para grados superior fue:
		Paradas centro=Paradas.Atocha;
		System.out.println("La ciudad de entrega es: "+centro);
		
		Map<String, Float> centros=new HashMap<String, Float>();
		centros.put("Atocha", 7.5f);
		centros.put("Alcala_de_Henares", 6.5f);
		centros.put("Humanes", 9.5f);
		centros.put("Getafe", 4.5f);
		centros.put("Arganda", 6.7f);
		
		
		//3. Muestra las notas medias obtenidas en cada centro
		System.out.println(centros);
		
		
		//4. Muestra la nota media total de todos los centros
		
		
		//5. Añade un nuevo centro: Leganés-->Su nota media fue 5.8
		centros.put("Leganés", 5.8f);
		
		
	}

}
