package com.practica;

import java.time.LocalDateTime;

public class FechaPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String asignatura="programacion";
		LocalDateTime hoy=LocalDateTime.now(); 
		
		if(asignatura=="programacion") {
			System.out.println(hoy.plusDays(60));
		}
		else {
			System.out.println(hoy.plusDays(90));
		}

}
}
