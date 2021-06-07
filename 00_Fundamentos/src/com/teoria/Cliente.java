package com.teoria;

public class Cliente {

	
	private String nombre;
	private int edad;
	private boolean alta;
	
	public Cliente(String nombre, int edad, boolean alta) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.alta = alta;
	}//cierra constructor

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isAlta() {
		return alta;
	}

	public void setAlta(boolean alta) {
		this.alta = alta;
	}
	
}//cierra cliente
