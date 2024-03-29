import java.util.Scanner;
public class PQPodemosProgramar {
	public static void main(String[] args){
		/*
		Caputar un numero, evaluarlo en una formula  
		*/
		Scanner leer = new Scanner(System.in);
		float  x, y1, y2, y;
		System.out.println("Escribe el numero x");
		x = leer.nextFloat();
		if ((1 <= x) && (x <= 100)){
			
			y1 = (float) (((x + Math.pow(x, 2)) / (5 * x + 3)) + x);
			y2 = (float) (((x + x * x) / (5 * x + 3) / (((x + x * x) / (5 * x + 3)) + 2 * x)));
			y = y1 * y2;
			System.out.println("el resultado es: " + y);

		} else {
			System.out.println("el numero que ingresaste es incorrecto");
		}
		leer.close();
	}
}