import java.util.Scanner;
public class Ejercicio15 {
	public static void main(String[] args){
		/*
		Crear un código que capture números positivos, después calcular la media o el promedio de esos 				números  
		*/
		Scanner leer = new Scanner(System.in);
		int n = 1, c = 0; float s = 0;
		System.out.println("Se sacará la media y el promedio de los numeros que se ingresen");
		System.out.println("Escribe escribe el numero que gustes");
		while(n > 0){
			n = leer.nextInt();
			s += n;
			c++;
		} 
		s += (s/c);
		System.out.println("el promedio es: \n" + s);
		leer.close();
		
	}
}
