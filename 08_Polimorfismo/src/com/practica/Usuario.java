package com.practica;

import java.util.Date;

public abstract class Usuario {//no puedo crear usuarios
	
	//propiedades del usuario
	private String nombre;
	private String email;
	private boolean alta;
	private Date fecha;
	
	
	//constructor
	public Usuario(String nombre, String email, boolean alta, Date fecha) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.alta = alta;
		this.fecha = fecha;
	}
	
	//getters y setters: consultar o modificar datos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAlta() {
		return alta;
	}

	public void setAlta(boolean alta) {
		this.alta = alta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	//to string: sacar mensajes en pantalla
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", email=" + email + ", alta=" + alta + ", fecha=" + fecha + "]";
	}
		
}