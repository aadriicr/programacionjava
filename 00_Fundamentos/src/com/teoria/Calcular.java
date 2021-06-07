package com.teoria;

import java.text.DecimalFormat;
public class Calcular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora=new Calculadora();
		DecimalFormat formato=new DecimalFormat("#.##");
		System.out.println("sumar "+calculadora.sumar(7, 14, 6));
		System.out.println("dividir "+calculadora.dividir(20, 3));
		System.out.println(String.format("%.2f", calculadora.dividir(20,3)));
		
		//dividir tiene como maximo dos decimales
		//sumar tambien se pueden sumar tres numeros
	}

}
