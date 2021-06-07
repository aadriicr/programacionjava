package com.actividad5;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class A2Fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault());
		Calendar hoy = Calendar.getInstance();
		System.out.println("Hoy es "+df.format(hoy.getTime()));
		hoy.add(Calendar.MONTH, 3);
		System.out.println("Dentro de 3 meses es "+df.format(hoy.getTime()));

		int dia = 25;
        int mes = 6;
        int anio = 2021;
        System.out.println("Faltan "+calcularDias(dia,mes,anio, false)+" hasta el 25/06/2021");
	}
	
	 public static int calcularDias(int dia, int mes, int anio, boolean incluirFin) {
	        
	        Calendar inicio = Calendar.getInstance();
	        inicio.set(anio, mes - 1, dia);
	        inicio.set(Calendar.HOUR, 0);
	        inicio.set(Calendar.HOUR_OF_DAY, 0);
	        inicio.set(Calendar.MINUTE, 0);
	        inicio.set(Calendar.SECOND, 0);
	        
	        Calendar actual = Calendar.getInstance();
	        actual.set(Calendar.HOUR, 0);
	        actual.set(Calendar.HOUR_OF_DAY, 0);
	        actual.set(Calendar.MINUTE, 0);
	        actual.set(Calendar.SECOND, 0);
	        
	        long finMS = actual.getTimeInMillis();
	        long inicioMS = inicio.getTimeInMillis();
	        
	        int dias = (int) ((Math.abs(finMS - inicioMS)) / (86400000) ); //86400000
	        
	        if(incluirFin){
	            dias++;
	        }
	        return dias;
	        		

	    }

}
