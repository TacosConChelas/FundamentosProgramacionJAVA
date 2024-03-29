import java.util.Scanner;
public class PodenciaD_AyB {
	public static void main(String[] args){
		/*
		Capturar 2 numeros (A y B), elebar A a la potencia de B
		*/
		Scanner leer = new Scanner(System.in);
		int a, b;
		System.out.println("Escribe el numero que quieres elebar a una potencia");
		a = leer.nextInt();
		System.out.println("Escribe la potencia");
		b = leer.nextInt();
		a = (int)(Math.pow(a, b));
		System.out.println("El resultado es:" + a);
		leer.close();
	}
}