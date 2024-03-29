import java.util.Scanner;
public class EvaFraccionR {
	public static void main(String[] args){
		/*
		Caputar x, y y z evaluandolos con una funsion 
		*/
		Scanner leer = new Scanner(System.in);
		float  x, y, z; double r;
		System.out.println("Escribe el numero x"); x = leer.nextFloat();
		System.out.println("Escribe el numero y"); y = leer.nextFloat();
		System.out.println("Escribe el numero z"); z = leer.nextFloat();
		
		if ((1 <= x) && (x <= 8) && (1 <= y) && (y <= 8) && (1 <= z) && (z <= 8)){
			r = (double) (1.2 * y);
			r = (double) ((Math.pow(x,(double) (r)) - z + 5.7) / ((x + 2 * y + 3 + z) / (x * y)));
			System.out.println("el resultado es: " + r);
		} else {
			System.out.println("el numero que ingresaste es incorrecto");
		}
		
		
		leer.close();
	}
}