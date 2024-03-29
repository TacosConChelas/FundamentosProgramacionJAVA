import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] args){
		/*Dado tres numeros que correspondan a los coeficientes de A, B, C de la ecuación de segundo grad:
		A * X  ^ 2 + B * X + C = 0. Calcular y desplegar el valor de las raices reale. Se deberá desplegar, un mensaje
		de error para el caso de raices imaginarias y también si A = 0, indicando que la ecuación no es cuadrática. 
		*/

		Scanner leer = new Scanner(System.in);
		float a, b, c;
		double x1, x2;
		
		System.out.println("Escribe A");
		a = leer.nextFloat();
		System.out.println("Escribe B");
		b = leer.nextFloat();
		System.out.println("Escribe C");
		c = leer.nextFloat();
		
		if (a == 0){
			System.out.println("Error, va a dar una raiz imaginaria");
		} else if ((Math.pow(b, 2)) < (4 * a * c)){
			System.out.println("Error, va a dar una raiz imaginaria por el numero negativio");
		} else {
				x1 = (float) (Math.sqrt((Math.pow(b, 2)) - (4 * a * c)) - b) / (2 * a);
				x2 = (float) (- b - Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);
			
				System.out.println("El valor de X1 es: " + x1);
				System.out.println("El valor de X2 es: " + x2);

		}
		leer.close();

		
			
			
		
	}
}