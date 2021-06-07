package com.teoria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;




public class Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("¿Cual es la capital de Italia?");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String respuesta=br.readLine();
			System.out.println(respuesta);
			if(respuesta.equals("roma")) {
				System.out.println("has acertado");
			}
			else {
				System.out.println("error, vuelve a ejecutar");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//cierra main

}//cierra class
