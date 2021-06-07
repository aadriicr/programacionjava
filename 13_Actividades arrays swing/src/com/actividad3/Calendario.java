package com.actividad3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calendario {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("JXPicker Example"); 
	     JPanel panel = new JPanel(); 

	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	     //frame.setBounds(200, 200, 150, 100); 

	     JXDatePicker picker = new JXDatePicker(); 
	     picker.setDate(Calendar.getInstance().getTime()); 
	     picker.setFormats(new SimpleDateFormat("dd.MM.yyyy")); 

	     panel.add(picker); 
	     frame.getContentPane().add(panel); 

	     frame.setVisible(true); 
	    } 


	}


