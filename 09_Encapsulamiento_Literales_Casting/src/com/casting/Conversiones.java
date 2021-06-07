package com.casting;

import javax.swing.JOptionPane;

public class Conversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float floatNumero=15.25f;
		double doubleNumero=floatNumero;//casting automatico
		
		double dato=15.25;
		float datoFloat=(float) dato;//casting manual
		
		String strEdad="15";
		int intEdad= Integer.valueOf(strEdad);//castear con valueof (es un metodo sobrecargado)	
		int intEdad1= Integer.parseInt(strEdad);
	
		String salario=JOptionPane.showInputDialog("Que salario quieres cobrar?");
		
		try {
		float salarioNeto= Float.valueOf(salario)*0.8f; //Float.parseFloat tambien funciona
		JOptionPane.showMessageDialog(null, "El salario a percibir es "+salarioNeto);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Numero no valido");
		}
	}

}
