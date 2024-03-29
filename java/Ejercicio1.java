import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args){
		/*
		 Dado el valor de un numero 
		 que corresponde al radio de una circuferencia, calcule y despliegue
		 la longitud de la misma y el área del circulo correspondiente.
		 */
		float r, c, area;
		Scanner leer = new Scanner(System.in);
		System.out.println("escribe la longitud de lradio de tu circunferencia");
		r = leer.nextFloat();

		c = (float) (r * 2 * Math.PI); //Longitud de la circunferencia
		area = (float) (Math.pow(r, 2) * Math.PI);
		System.out.println("El la longitud de tu circunferencia es: " + c + " el are area de tu circunferencia es " + area);


		leer.close();
	}
}
	