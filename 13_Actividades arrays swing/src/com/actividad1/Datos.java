package com.actividad1;


import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Datos extends Hotel{

	public Datos(LocalDate fechaEntrada, LocalDate fechaSalida, String nombreCliente, String tipoHabitacion) {
		super(fechaEntrada, fechaSalida, nombreCliente, tipoHabitacion);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hotel cliente1= new Hotel(LocalDate.of(2021, 5, 15), LocalDate.of(2021, 5, 21), "Juan López", "Doble Estandar");
		
		
    
		long dias= DAYS.between(fechaEntrada, fechaSalida);
		
		
		
		int costo=0;
		
		if(tipoHabitacion=="Simple"){
			costo=40;
			System.out.println("La noche son: "+costo);
			
		}
		else if(tipoHabitacion=="Doble Estandar") {
			costo=50;
			
		}
		else if(tipoHabitacion=="Doble Superior") {
			costo=20;
			
		}
		else {
			System.out.println("El tipo de habitacion no existe");
			
		}
		double precio=dias*costo;
		
		System.out.println("INFORMACION DE LA RESERVA\n\nFecha de Entrada: "+cliente1.fechaEntrada+"\nFecha de salida: "+cliente1.fechaSalida+"\nDias solicitados: "+dias+"\nTu nombre: "+cliente1.nombreCliente+"\nTipo de habitacion: "+cliente1.tipoHabitacion+"\nEl precio total es: "+precio);
		
	}
}