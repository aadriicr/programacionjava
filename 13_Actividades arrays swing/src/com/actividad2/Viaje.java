package com.actividad2;

import javax.swing.JOptionPane;

public class Viaje {

	public static void main(String[] args) {
		
		Object [] ciudad ={"Sevilla","Madrid","M?laga","La Coru?a","Santander", "Oviedo", "Otra ciudad"}; 

		Object opcion = JOptionPane.showInputDialog(null,"?Q?e destino escoges?", "Enviar",JOptionPane.QUESTION_MESSAGE,null,ciudad, ciudad[0]);
		
		if ((ciudad.equals("Sevilla")) | (ciudad.equals("Madrid")) | (ciudad.equals("M?laga"))) {
			JOptionPane.showMessageDialog(null, "El precio del viaje es de 100 euros");
			
		}else if ((ciudad.equals("La Coru?a")) | (ciudad.equals("Oviedo")) | (ciudad.equals("Santander"))) {
			JOptionPane.showMessageDialog(null, "El precio del viaje es de 150 euros");
		}else
			JOptionPane.showMessageDialog(null, "El precio del viaje es de 200 euros");
	}

}

