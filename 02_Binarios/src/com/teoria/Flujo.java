package com.teoria;

public class Flujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Dime una letra");
		try {
		char letra=(char) System.in.read();
		if(letra=='b') {
			System.out.println("has elegido la letra b");
		}
		else {
			System.out.println("no has elegido la letra b");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}


