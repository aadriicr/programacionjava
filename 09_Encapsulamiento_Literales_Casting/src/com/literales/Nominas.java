package com.literales;

public class Nominas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreEmpleado;
		float salarioBruto=42000f;
		float cotizacionCC=0.07f;
		float retencionIrpf=0.02f;
		
		float salarioNeto= salarioBruto-(salarioBruto*cotizacionCC)-(salarioBruto*retencionIrpf);
		
		System.out.println("Liquido a percibir "+salarioNeto);
		
		
		double salarioBruto1=42000f;
		double cotizacionCC1=0.07f;
		double retencionIrpf1=0.02f;
		
		double salarioNeto1= salarioBruto1-(salarioBruto1*cotizacionCC1)-(salarioBruto1*retencionIrpf1);
		
		System.out.println("Liquido a percibir "+salarioNeto1);
	}

}
