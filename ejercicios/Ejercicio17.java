import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args){
		/*
		Crear un código que capture 10 números enteros, mostrará el promedio de los números negativos y de los 			positivos impares
		*/
		Scanner leer = new Scanner(System.in);
		int n, c1 = 0, c2 = 1; float p1 = 1, p2 = 1;
		System.out.println("Escribe 10 numeros positivos y negativos");		
		for (int i = 0; 1 <= 10; i++){
			n = leer.nextInt();
			if (n > 0) {
				p1 *= n;
				c1++;
			} else if (n < 0){
				p2 *= n;
				c2++;
			}
		}
		p1 = (float) (p1 / c1);
		p2 = (float) (p2 / c2);
		System.out.println("el producto de los numeros positivos es: " + p1 + "\n Y el de los negativos es: " + p2);
		leer.close();
		
	}
}
