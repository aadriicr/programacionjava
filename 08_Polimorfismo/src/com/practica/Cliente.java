package com.practica;

import java.util.Date;

public class Cliente extends Usuario {

	public Cliente(String nombre, String email, boolean alta, Date fecha) {
		super(nombre, email, alta, fecha);
		// TODO Auto-generated constructor stub
	}
	
	public void elaborarPresupuesto() {}
	public void vender() {}
	public void vender(Agente agente) {}//¿sobrescritura o sobrecarga? sobrecarga
	public void cobrar() {}

}
