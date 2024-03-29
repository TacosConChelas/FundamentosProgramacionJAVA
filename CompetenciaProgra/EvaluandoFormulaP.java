import java.util.Scanner;
public class EvaluandoFormulaP {
	public static void main(String[] args){
		/*
		Caputar x y y, evaluarlo en una form
		*/
		Scanner leer = new Scanner(System.in);
		float  x, r, y, z;
		System.out.println("Escribe el numero x");
		x = leer.nextFloat();
		System.out.println("Escribe el numero y");
		y = leer.nextFloat();
		System.out.println("Escribe el numero z");
		z = leer.nextFloat();
		if ((-10 <= x) && (x <= 10) && (-10 <= y) && (y <= 10)){
			r = (float) (2 * x + y - z);
			r = (float) ((7 + Math.pow(r, r)) / r);
			System.out.println("el resultado es: " + r);
		} else {
			System.out.println("el numero que ingresaste es incorrecto");
		}
		leer.close();
	}
}