package com.funcional;

import java.util.Arrays;

public class Mapear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unidades= {2,2,2,2,2,2,2,2};
		int totalUnidades=Arrays.stream(unidades)
				.sum();
				
		
		System.out.println(totalUnidades);
		}

}
