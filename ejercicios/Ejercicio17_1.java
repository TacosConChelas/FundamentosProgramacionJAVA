import java.util.Scanner;
public class Ejercicio17_1 {
	public static void main(String[] args){
		/*
		Crear un código que capture 10 números enteros, mostrará el promedio de los números negativos y de los positivos impares
		*/
		Scanner leer = new Scanner(System.in);
        int n, c = 0, c1 = 0; float p1 = 0, p2 = 0; 
        System.out.println("Escribe elnumero");
		for (int i = 0; i < 11; i++) {
            n = leer.nextInt();
            if (n < 0) {
                c++;
                p1 += n;
            } else if (n > 0) {
                c1++;
                p2 += n;
            }
        }
        // SI FUNCIONA --> n = (p1 > p2)? 30 : 20;
        //No hay problema si se decea hacer un casteo entre tipos de variable y además se decea simplificar la forma "a = a / b"
        p1 /= (float) (c); 
        p2 /= (float) (c1);
        System.out.println("El promedio de los positivos es: " + p2 + "\ny el de los negativos es: " + p1);
        leer.close();
	}
}