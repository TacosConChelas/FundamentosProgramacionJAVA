import java.util.Scanner;
public class FormulasEnSucesion {
	public static void main(String[] args){
		/*
		Caputar un numero, evaluarlo en una formulap ara despues evaluar el resultado en otra formula y mostrar 
		el nuevo resultado 
		*/
		Scanner leer = new Scanner(System.in);
		float x, y, z;
		System.out.println("Escribe el numero x");
		x = leer.nextFloat();
		if ((1 <= x) && (x <= 100)){
			y = (float) ((x + 5) / (2 * (x++)));
			z = (float) ((Math.pow(y, 2) + x * (x - 2 * y)) / (x * y));

			System.out.println("el resultado es: " + z);

		} else {
			System.out.println("el numero que ingresaste es incorrecto");
		}
		leer.close();
	}
}