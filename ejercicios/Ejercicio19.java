import java.util.Scanner;
public class Ejercicio19 {
 	public static void main(String[] args)   {
		/*
		Crear un código para introducir 6 calificaciones, cada calificación va a ser de un alumno diferente 
		al final el programa nos va a lanzar cual es el número de alumnos que aprovaron, que reprovaron y los 
		alumnos excelentes (califiaciones entre 9 y 10)
		*/
		int a = 0, r = 0, e = 0, n; float c;
		Scanner leer = new Scanner(System.in);

		System.out.println("SI = 1, NO = 0");
		System.out.println("Tienes niños porr sacar su calificacion?");
		n = leer.nextInt();
		
		do {
			
			/*
			NOTA: al preguntar si aun seguimos teniendo niños lo mejor es preguntar y guardar la respuesta en
			una variable numerica y no en una variable de tipo String.
			*/

			System.out.println("Escribe la calificación de un niño");
			c = leer.nextFloat();
			
			if ((c < 6) && (c > 0)){
				r++;
			} else {
				a++;
				if ((c >= 9) && (c <=10)){
					e++;
				}
			}
			System.out.println("Tienes niños porr sacar su calificacion?");
			n = leer.nextInt();		
		} while (n == 1);
		System.out.println("El total de alumnos reprobados es de: " + r + "\nLos alumnos aprobados son: " + a + "\nY los alumnos excelentes son: " + e);

		
	}
}
