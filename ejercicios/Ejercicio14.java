import java.util.Scanner;
public class Ejercicio14 {
	public static void main(String[] args){
		/*
		Crear un código que capte números, si se inserta un 0, finalice y mande la suma de 
		los números obtenidos
		*/
		Scanner leer = new Scanner(System.in);
		int c = 1, s = 0;
		System.out.println("Escribe el número que quieras");
		while(c != 0){
			c = leer.nextInt();
			s += c;
		} 
		System.out.println("La suma de todos los numeros es: \n" + s);
		leer.close();
	}
}
