import java.util.Scanner;
public class FormulaGigante {
	public static void main(String[] args){
		/*
		Caputar un numero, evaluarlo en una formula  aun más grande que la anterior 
		*/
		Scanner leer = new Scanner(System.in);
		float  x, y1, y2, y3, y, z;
		System.out.println("Escribe el numero x");
		x = leer.nextFloat();
		System.out.println("Escribe el numero y");
		y = leer.nextFloat();
		System.out.println("Escribe el numero z");
		z = leer.nextFloat();
		if ((1 <= x) && (x <= 100) && (1 <= y) && (y <= 100) && (1 <= z) && (z <= 100)){
			y1 = (float) (((2 * x + y) / z) * (Math.pow(y, 3) - z));
			y2 = (float) (((x + 2 * y + 3 * z) / (z - 2 * y - 3 * x)) + (x * x) + (z * z));
			y3 = (float) (y1 / y2);
			System.out.println("el resultado es: " + y3);
		} else {
			System.out.println("el numero que ingresaste es incorrecto");
		}
		leer.close();
	}
}