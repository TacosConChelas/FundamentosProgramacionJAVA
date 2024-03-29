import java.util.Scanner;
public class NumerosAlReves {
	public static void main(String[] args){
		/*
		Capturar 3 numeros enteros, y luego regresar los al reves
		*/
		Scanner leer = new Scanner(System.in);
		int[] n = new int[3];
		for (int i = 0; i < 3; i++){
			System.out.println("Escribe un número");
			n[i] = leer.nextInt();
		}
		for (int i = 2; i > -1; i--){
			System.out.println(n[i]);
		}

	}
}