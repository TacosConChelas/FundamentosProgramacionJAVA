import java.util.Scanner;
public class CapturarNumR {
	public static void main(String[] args){
		/*
		Capturar un numero r, sumarle 5, al resultado elevarlo al cuadrado, dividirlo entre un tercio
		 del numero original R y el resultado elevarlo al cubo
		*/
		Scanner leer = new Scanner(System.in);
		double r, r1;
		System.out.println("Escribe el numero R");
		r1 = leer.nextDouble();
		System.out.println(r1);
		r = r1 + 5; 
		System.out.println(r);
		r = (double)(Math.pow(r, 2));
		System.out.println(r);
		r = (double) (r / (r1 / 3));
		System.out.println(r);
		r = (double)(Math.pow(r, 3));
		System.out.println(r);
		leer.close();
	}
}