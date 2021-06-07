package com.actividad1;

import java.util.Date;

public class Tienda {
	protected int unidadesenStock;
	protected int unidadesenPedido;
	protected Date fechaCaducidad;
	
	public Tienda(int unidadesenStock, int unidadesenPedido, Date fechaCaducidad) {
		super();
		this.unidadesenStock = unidadesenStock;
		this.unidadesenPedido = unidadesenPedido;
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getUnidadesenStock() {
		return unidadesenStock;
	}
	public void setUnidadesenStock(int unidadesenStock) {
		this.unidadesenStock = unidadesenStock;
	}
	public int getUnidadesenPedido() {
		return unidadesenPedido;
	}
	public void setUnidadesenPedido(int unidadesenPedido) {
		this.unidadesenPedido = unidadesenPedido;
	}
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	@Override
	public String toString() {
		return "Tienda [unidadesenStock=" + unidadesenStock + ", unidadesenPedido=" + unidadesenPedido
				+ ", fechaCaducidad=" + fechaCaducidad + "]";
	}

}
