package com.practica;

import java.util.Date;

public class Probar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//alta de un cliente
		Cliente cliente=new Cliente("Adrian", "adriancalvorico1@gmail.com", false, new Date());
		System.out.println(cliente.toString());
		cliente.vender();
		cliente.vender(new Agente("Perico", "perico@gmail.com", true, new Date()));
		
		cliente.cobrar();//por transferencia
		cliente.cobrar();//por tarjeta de credito
		//como implementas este caso?
	}

}
//cuando pagas o cobras a cualquiera de ellos, puedes hacer por transferencia o por talon
//hay que crear un metodo para indicar como se instrumenta ese pago/cobro