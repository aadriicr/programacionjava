package com.teoria;

public class Calcular {

	//atributos
		private int n1;
		private int n2;
		private String mensaje;
		
		
		//métodos
		public int sumar(int x, int y) {
			return x+y;
		}


		public String getMensaje() {
			return mensaje;
		}


		public void setMensaje(String mensaje) {
			this.mensaje = mensaje;
		}

		//constructor
		public Calcular(int n1, int n2, String mensaje) {
			super();
			this.n1 = n1;
			this.n2 = n2;
			this.mensaje = mensaje;
		}


		 
}//cierra class
