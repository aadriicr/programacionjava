package com.ejercicio1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea dos hijos con los siguientes datos
		//juan, madrid, 15, 123.456f, fechahoy
		//maria, sevilla 18, 321.654f, fechamañana
		
		//el padre NO se puede crear ¿como lo resuelves?
		
		//muestra en consola los datos de los dos hijos
		
		Date fecha1= new Date();
		Date fecha2 = new Date(fecha1.getTime() + TimeUnit.DAYS.toMillis( 1 ));
		
		
		
		Hijo hijo1= new Hijo("juan", 123.456f,fecha1 , "madrid", 15);
		
		Hijo hijo2= new Hijo("maria", 321.654f, fecha2,"sevilla", 18);
		
		System.out.println(hijo1.toString());
		System.out.println(hijo2.toString());
	}

}
