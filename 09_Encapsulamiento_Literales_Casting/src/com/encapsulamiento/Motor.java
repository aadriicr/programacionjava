package com.encapsulamiento;

public class Motor {

	private String combustible;
	private int horas;
	private boolean electrico;
	
	public Motor(String combustible, int horas, boolean electrico) {
		super();
		this.combustible = combustible;
		this.horas = horas;
		this.electrico = electrico;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public boolean isElectrico() {
		return electrico;
	}

	public void setElectrico(boolean electrico) {
		this.electrico = electrico;
	}
	
	
	
	
}//cierra motor
