package com.encapsulamiento;

public class Coche {
	
	private String marca;
	private float precio;
	private Motor motor;  //delegacion de clases/coge MOTOR sin importarlo ya que pertenece al mismo paquete
	
	
	public Coche(String marca, float precio, Motor motor) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.motor = motor;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", precio=" + precio + ", motor=" + motor + "]";
	}
	
	
	
	
	
	
	
}//cierra coche
