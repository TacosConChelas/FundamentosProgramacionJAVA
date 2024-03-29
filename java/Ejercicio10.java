import java.util.Scanner;
public class Ejercicio10 {
	public static void main(String[] args){
		int a, b;
		float r1, r2, r3, r4 = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Escribe el primer numero");
		a = leer.nextInt();
		System.out.println("Escribe el segundo numero");
		b = leer.nextInt();
		r1 = a + b;
		r2 = a - b;
		r3 = a * b;
		if (a == 0){
			System.out.println("La divicion no se puede realizar por que a es igual a 0");

		} else {
			r4 = (float) (b / a);
		}
		System.out.println("el resultado de tu suma: " + r1 + " de la resta: " + r2);
		System.out.println("el resultado de la multiplicacion: " + r3 + " y de la divicion: " + r4);
	

	}
}