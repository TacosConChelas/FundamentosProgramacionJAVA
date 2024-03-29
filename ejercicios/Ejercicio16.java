import java.util.Scanner;
public class Ejercicio16 {
	public static void main(String[] args){
		/*
		Crear un código que capture números, Y después muestre el producto de los primeros 10 primeros numeros
		impares
		*/
		Scanner leer = new Scanner(System.in);
		int n = 0, c = 0, p = 1;
		System.out.println("Se sacará el producto de todos los numeros impares");		
		System.out.println("Escribe escribe el numero que gustes");
		do {
			n = leer.nextInt();
			if ((n%2) != 0){
				p *= n;
				c++;
			}
		} while(c < 10);
		
		System.out.println("El producto de todos los números impares es " + p);
		leer.close();
		
	}
}
