package com.actividad1;

import java.time.LocalDate;


public class Hotel {
	
	public static LocalDate fechaEntrada;
	public static LocalDate fechaSalida;
	public static String nombreCliente;
	public static String tipoHabitacion;
	
	
	
	public Hotel(LocalDate fechaEntrada, LocalDate fechaSalida, String nombreCliente, String tipoHabitacion) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.nombreCliente = nombreCliente;
		this.tipoHabitacion = tipoHabitacion;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	
	
}