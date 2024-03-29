import java.util.Scanner;
public class MuchasDiviciones {
	public static void main(String[] args){
		/*
		Caputar x y y, evaluarlo en una form
		*/
		Scanner leer = new Scanner(System.in);
		float  x, r, y;
		System.out.println("Escribe el numero x");
		x = leer.nextFloat();
		System.out.println("Escribe el numero y");
		y = leer.nextFloat();
		
		if ((-10 <= x) && (x <= 10) && (-10 <= y) && (y <= 10)){
			r = (float) ((((Math.pow(x, 3) + x * x) / (y * y -y)) - (x / y + 5)) / (2 * x));
			System.out.println("el resultado es: " + r);
		} else {
			System.out.println("el numero que ingresaste es incorrecto");
		}
		leer.close();
	}
}