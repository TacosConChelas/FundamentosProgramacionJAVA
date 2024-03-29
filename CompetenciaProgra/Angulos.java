import java.util.Scanner;
public class Angulos {
	
	public static void main(String[] args){
		/*
		Captura el angulo y obten su coterminal
		*/
		Scanner leer = new Scanner(System.in);
		float a, b = 0;
		System.out.println("Escribe el angulo");
		a = leer.nextFloat();
		if ((0 <= a) && (a < 360)){

			System.out.println("su angulo coterminal es: " + a);
		} else if ((a % 360) < 360){
			b = (float)(a % 360);
			System.out.println("el angulo coterminal de " + a + " es: " + b);
		} else if ((a % 720) < 360){
			b = (float) a % 720;
			System.out.println("el angulo coterminal de " + a + " es: " + b);
		} else if ((a % 1080) < 360){
			b = (float) a % 1080;
			System.out.println("el angulo coterminal de " + a + " es: " + b);
		}else if ((a % 1440) < 360){
			b = (float) a % 1440;
			System.out.println("el angulo coterminal de " + a + " es: " + b);
		}
		leer.close();

	}

}

