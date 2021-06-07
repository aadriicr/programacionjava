package com.teoria;

import java.util.Calendar;
import java.util.Date;

public class Fecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date fecha=new Date();
		Calendar calendario=Calendar.getInstance();
		
		System.out.println(fecha.getDate());
		System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
	}

}
