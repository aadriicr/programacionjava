package com.actividad1;

import java.util.Date;

public class Lacteos extends Tienda implements ILacteos{

	public Lacteos(int unidadesenStock, int unidadesenPedido, Date fechaCaducidad) {
		super(unidadesenStock, unidadesenPedido, fechaCaducidad);
		// TODO Auto-generated constructor stub
	}
	
	protected String nombreProducto;
	protected float precioUnitario;
	
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public float getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public Lacteos(int unidadesenStock, int unidadesenPedido, Date fechaCaducidad, String nombreProducto,
			float precioUnitario) {
		super(unidadesenStock, unidadesenPedido, fechaCaducidad);
		this.nombreProducto = nombreProducto;
		this.precioUnitario = precioUnitario;
	}
	@Override
	public String toString() {
		return "\n Nombre del producto=" + nombreProducto + ",\n Precio/Unidad=" + precioUnitario + "€,\n Unidades en Stock="
				+ unidadesenStock + ",\n Pedido=" + unidadesenPedido + ",\n Caducidad=" + fechaCaducidad
				+ "]";
	}
	
public void total() {
		
		int total = (int) ((unidadesenStock-unidadesenPedido)*precioUnitario);
		System.out.println("\n El total es: "+total+"€");
		
	}
	
	
	

}
