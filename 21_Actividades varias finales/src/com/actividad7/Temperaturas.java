package com.actividad7;

public class Temperaturas {

	String dias="";
	double min=0;
	double max=0;
	
	
	public Temperaturas(String dias, double min, double max) {
		super();
		this.dias = dias;
		this.min = min;
		this.max = max;
	}


	@Override
	public String toString() {
		return "Temperaturas [dias=" + dias + ", min=" + min + ", max=" + max + "]";
	}
	
	
	
	
}
