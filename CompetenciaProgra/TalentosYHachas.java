import java.util.Scanner;
public class TalentosYHachas {
	public static void main(String[] args){
		/*
		Capturar 2 cantidades diferentes de hachas y los talentos que tendran c/u, siendo los 2 talentos dif 
		y las 2 cant dif de hachas numeros enteros, la salida será el numero de talentos
		1 <= N, H, M, E <= 1000
		*/
		Scanner leer = new Scanner(System.in);
		int t1, t2, h1, h2, tt = 0;

		System.out.println("Esccribe la primera cantidad de hachas N");
		h1 = leer.nextInt();
		System.out.println("Esccribe la primera cantidad de talentos que tendra cada hacha");
		t1 = leer.nextInt();
		System.out.println("Esccribe la segunda cantidad de hachas N");
		h2 = leer.nextInt();
		System.out.println("Esccribe la segunda cantidad de talentos que tendra cada hacha");
		t2 = leer.nextInt();
		t1 *= h1;
		t2 *= h2;
		tt += (t1 + t2);
		System.out.println("La cantidad de talentos totales es: " + tt);
	}
}