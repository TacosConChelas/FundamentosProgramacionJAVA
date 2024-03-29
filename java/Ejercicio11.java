import java.util.Scanner;
public class Ejercicio11 {
	public static void main(String[] args){
		//Dado el tiempo total de una llamda telefonica, determinar la cantidad total a pagar 
		//a) toda llamada de tres minutos cuesta $10
		//b) el minuto adicional cuesta $1
		float r1, r2 = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Escribe el tiempo de tu llamada");
		r1 = leer.nextFloat();
		
		if ((r1 <= 3) && (r1 > 0)){
			r2 = 10;
			System.out.println("El precio a pagar es de $" + r2);
			
		} else if (r1 > 3){
			r1 -= 3;
			r2 += 10 + r1;
			System.out.println("El precio a pagar es de $" + r2);
		}
		
	}
}