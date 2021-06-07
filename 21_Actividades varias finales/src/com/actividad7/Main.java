package com.actividad7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dias= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		
		for (int i = 0; i < dias.length; i++) {
			Temperaturas diarias= new Temperaturas(dias[i],Math.round((long)(Math.random()*10)), Math.round((long)(Math.random()*20+10)));
		System.out.println(diarias.toString());
		
		}
	}

}
