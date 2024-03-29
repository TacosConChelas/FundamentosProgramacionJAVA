import java.util.Scanner;
public class ComversionTemp {
	public static float grados(float a){

		return a;
	}
	public static void main(String[] args){
		/*
		Caturar una temperatura cualquiera en grados centigrados y despues confvertirla en grados:
		 K en Kelvin, F en grados Fahrenheit y R en grados Réaumur.
		*/
		Scanner leer = new Scanner(System.in);
		System.out.println("K en Kelvin \nF en grados Fahrenheit \nR en grados Réaumur.");
		System.out.println("Escribe a que temperatura quieres combertir");
		String temp = leer.nextLine();
		System.out.println("Escribe a que temperatura en grados C, solo entre -273 y 1000 C");
		float t = leer.nextFloat();
		switch(temp){
			case "K":
				if ((t >= -273) && (t <= 1000)){
					t += 273;
				} else {
					System.out.println("Temperatura invalida");
				}	
				break;
			case "F":
				if ((t >= -273) && (t <= 1000)){
					t += 32;
				} else {
					System.out.println("Temperatura invalida");
				}
				break;
			case "R":
				if ((t >= -273) && (t <= 1000)){
					t += 0;
				} else {
					System.out.println("Temperatura invalida");
				}
				break;
			default:
				System.out.println("El sistema que elegiste es incorrecto");
				break;
		}
		System.out.println("La temeratura es: " + t);
		leer.close();
		 
	}
}