import java.util.Scanner;
public class Ejercicio13 {
	public static void main(String[] args){
		/*
		Cada piesa de pan tiene un precio de $5, si el cliente compra más de 50 piesas le 			costará 4.5$ y si son más de 100 serán $4 por pieza
		*/
		Scanner leer = new Scanner(System.in);
		float p; int c;
		System.out.println("Cuántos piezas de pan compraste");
		c = leer.nextInt();
		if (c > 50){
			p = (float)(c * 4.5);
		} else if (c > 100){
			p = c * 4;
		} else {
			p = c * 5;
		}
		System.out.println("Su precio a pagar es de: " + p);
		leer.close();
	}
}
