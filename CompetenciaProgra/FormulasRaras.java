import java.util.Scanner;
public class FormulasRaras {
	public static void main(String[] args){
		/*
		Capturar 3 numeros: x, y, z para calcular la formula: {(x+x)()y+z2}/{(x+pi)(y+pi)}
		*/
		Scanner leer = new Scanner(System.in);
		double x, y, z, r = 0;
		System.out.println("Escribe el numero x");
		x = leer.nextDouble();
		System.out.println("Escribe el numero y");
		y = leer.nextDouble();
		System.out.println("Escribe el numero z");
		z = leer.nextDouble();
		r = (double)((x + x * (y + z * z)) / ((x + 3.1416) * (y + 3.1416)));
		System.out.println("El resultdo es: " + r);
		leer.close();
	}
}