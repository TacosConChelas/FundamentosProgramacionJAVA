import java.util.Scanner;
public class PracticandoFormulas {
	public static void main(String[] args){
		/*
		Caputar un numero, evaluarlo en una formula para que el resultado sea evaluado en otra y asi sucesibamente  
		*/
		Scanner leer = new Scanner(System.in);
		float a, x, y, z;
		System.out.println("Escribe el numero x");
		a = leer.nextFloat();
		if ((1 <= a) && (a <= 100)){
			x = (3 * a) + 15;
			y = (float) ((3 + x) / (x + 1));
			z = (float) ((5 * x + 7 * y) / (a * x * y));

			System.out.println("el resultado es: " + z);

		} else {
			System.out.println("el numero que ingresaste es incorrecto");
		}
		leer.close();
	}
}