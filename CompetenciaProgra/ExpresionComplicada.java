import java.util.Scanner;
public class ExpresionComplicada {
	public static void main(String[] args){
		/*
		Caputar x y y, evaluarlo en una form complicada
		*/
		Scanner leer = new Scanner(System.in);
		float  x, y, z; double r;
		System.out.println("Escribe el numero x"); x = leer.nextFloat();
		System.out.println("Escribe el numero y"); y = leer.nextFloat();
		System.out.println("Escribe el numero z"); z = leer.nextFloat();
		if ((0 <= x) && (x <= 100) && (0 <= y) && (y <= 100) && (0 <= z) && (z <= 100)){
			r = (double) ((Math.pow((2 * y + z), 14/5) - z) / (x + y - (x / y)));
			System.out.println("el resultado es: " + r);
		} else {
			System.out.println("el numero que ingresaste es incorrecto");
		}
		leer.close();
	}
}