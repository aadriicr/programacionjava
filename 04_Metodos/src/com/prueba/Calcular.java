package com.prueba;
//POJO
public class Calcular {

	private boolean descuento;
	private String descripcion;
	private int unidades;
	public Calcular(boolean descuento, String descripcion, int unidades) {
		super();
		this.descuento = descuento;
		this.descripcion = descripcion;
		this.unidades = unidades;
	}
	public boolean isDescuento() {
		return descuento;
	}
	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	@Override
	public String toString() {
		return "Calcular [descuento=" + descuento + ", descripcion=" + descripcion + ", unidades=" + unidades + "]";
	}
	
}
