package com.actividad1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejecutar {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		Date fecha1 = sdf2.parse("15-03-2021");
		Date fecha2 = sdf2.parse("21-03-2021");
		Date fecha3 = sdf2.parse("20-03-2021");

			Lacteos producto1= new Lacteos(100, 80, fecha1, "Leche", 9.95f);
			Lacteos producto2= new Lacteos(150, 95, fecha2, "Yogur", 15.95f);
			Lacteos producto3= new Lacteos(100, 75, fecha3, "Huevos", 7.95f);
			
			
			System.out.println(producto1.toString());
			producto1.total();
			
			System.out.println(producto2.toString());
			producto2.total();
			
			System.out.println(producto3.toString());
			producto3.total();
	}
	

}
