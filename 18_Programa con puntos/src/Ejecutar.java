import java.util.Scanner;

public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime quien es el ganador de la liga 2021");
		
		Scanner sc = new Scanner(System.in);
		
		String ganador1= sc.nextLine();
		int puntos = 0;
		
		if(ganador1.equals("Getafe")) {
			puntos++;
			System.out.println("Has acertado y obtenido 1 punto");
			System.out.println("Dime quien es el ganador de la champions 2021");
			String ganador2= sc.nextLine();
			if(ganador2.equals("Madrid")) {
				puntos++;
				System.out.println("Has acertado y obtenido 1 punto");
				System.out.println("Tu total de puntos es "+puntos);
				System.out.println("Has terminado el programa");
			}
			else {
				System.out.println("Estas fuera del programa");
				System.out.println("¿Deseas reiniciar el programa?");
			}
			
			
			
			
		}
		else {
			System.out.println("Estas fuera del programa");
			System.out.println("¿Deseas reiniciar el programa?");
			

		}
		

	}

}
