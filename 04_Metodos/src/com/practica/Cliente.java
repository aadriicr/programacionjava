package com.practica;

public class Cliente {
	
	private String nombre;
	private String ciudad;
	private String email;
	public Cliente(String nombre, String ciudad, String email) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", ciudad=" + ciudad + ", email=" + email + "]";
	}
	
	
	
}
