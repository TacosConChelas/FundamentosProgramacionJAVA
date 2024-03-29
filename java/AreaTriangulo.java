import java.util.Scanner;
public class AreaTriangulo {
	public static void main (String[] args) {
		int a, b; float area; //Declaración de variables
		Scanner leer = new Scanner(System.in);

		System.out.println("Dame un lado del triangulo");
		a = leer.nextInt();
		
		System.out.println("Dame la altura del triangulo");
		b = leer.nextInt();

		area = (a * b) / 2;
		System.out.println("El area de tu triangulo es: " + area);
		
	}
}