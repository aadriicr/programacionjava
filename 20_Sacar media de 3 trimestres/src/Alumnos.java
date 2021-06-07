
public class Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] nota1 = new float[]{5, (float) 6.2, 4, (float) 5.5, (float) 8.75,10};
		float total1 = 0;
		
		for (int n = 0; n < nota1.length; n++) {
			total1+=nota1[n];
		}
		
		System.out.println("La suma es igual a: "+total1);
		System.out.println("La media de la nota1 es: "+(total1/nota1.length));
		System.out.println("-----------------------");
		
		float[] nota2 = new float[]{3, (float) 7.2, 4, (float) 8.32, (float) 9.75,4};
		float total2 = 0;
		
		for (int n = 0; n < nota2.length; n++) {
			total2+=nota2[n];
		}
		
		System.out.println("La suma es igual a: "+total2);
		System.out.println("La media de las nota2 es: "+(total2/nota2.length));
		System.out.println("-----------------------");
		
		float[] nota3 = new float[]{5, (float) 8.5, 6, (float) 7.5, (float) 8.75,9};
		float total3 = 0;
		
		for (int n = 0; n < nota3.length; n++) {
			total3+=nota3[n];
		}
		
		System.out.println("La suma es igual a: "+total3);
		System.out.println("La media de las notas3 es: "+(total3/nota3.length));
		System.out.println("-----------------------");
		System.out.println("La suma de las medias de los tres trimestres es: "+((total3/nota3.length)+(total2/nota2.length)+(total1/nota1.length)));
		System.out.println("La media de los tres trimestres es: "+(((total3/nota3.length)+(total2/nota2.length)+(total1/nota1.length))/3));
	}

}
