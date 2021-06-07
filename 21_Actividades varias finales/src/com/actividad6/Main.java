package com.actividad6;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CiudadesMalaga fuengirola= CiudadesMalaga.Fuengirola;
		CiudadesMalaga malaga= CiudadesMalaga.Malaga;
		CiudadesMalaga benalmadena= CiudadesMalaga.Benalmadena;
		CiudadesMalaga mijas= CiudadesMalaga.Mijas;
		CiudadesMalaga marbella= CiudadesMalaga.Marbella;
		CiudadesMalaga ronda = CiudadesMalaga.Ronda;
		CiudadesMalaga torremolinos= CiudadesMalaga.Torremolinos;
		CiudadesMalaga estepona = CiudadesMalaga.Estepona;
		CiudadesMalaga antequera= CiudadesMalaga.Antequera;
		CiudadesMalaga nerja = CiudadesMalaga.Nerja;
		
		
		JOptionPane.showMessageDialog(null, "Las mejores ciudades de Malaga son: "+fuengirola.name()+ " - "+malaga.name()+ " - "+benalmadena.name()+ " - "+mijas.name()+ " - "+marbella.name()+ " - "+ronda.name()+ " - "+torremolinos.name()+ " - "+estepona.name()+ " - "+antequera.name()+ " - "+nerja.name());
	}

}
