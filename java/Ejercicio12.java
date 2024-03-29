import java.util.Scanner;
public class Ejercicio12 {
	public static void main(String[] args){
		/*
		c1 = 20, c2 15 c3 10 c4 7.5
		a todos se les descuenta el 7.2% por salud
		si el salario es menor a 1000 se les da un subcidio del 15%
		
		*/
		int c, h;
		float s = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("CATEGORIAS: 1, 2, 3, 4");
		System.out.println("Escribe la categoria a la que perteneces");
		c = leer.nextInt();
		System.out.println("Escribe la cantidad de horas que trabajaste");
		h = leer.nextInt();
		switch (c) {
			case 1:
				s = 20 * h;
				s -= (s * 0.072);
				break;
			case 2:
				s = 15 * h;
				s -= (s * 0.072);
				break;
			case 3:
				s = 10 * h;
				s -= (s * 0.072);
				break;
			case 4:
				s = (float)(7.5 * h);
				s -= (s * 0.072);
				break;
			default:
				System.out.println("Categoria incorrecta");
				break;

		}
		if ((s < 1000) && (s > 0)){
			s += (s * 0.15);
			System.out.println("Tu salario es: " + s);
		} else {

			System.out.println("Tu salario es: " + s);
		}
		

		
		
	}
}