import java.util.Scanner;
public class TresLineasOperaciones {
	public static void main(String[] args){
		/*
		Capturar 3 cantidades de 3 números, opara cada cantidad de los 3 numeros se hara:
		1) a +b, a +c y b+c
		2) a-b, a-c y b-c
		3) a*b, a*c y b*c
		*/
		Scanner leer = new Scanner(System.in);
		int i = 1, a, b, c, d, e, f;
		
		for (int j2 = 0; j2 < 3; j2++) {
				System.out.println("Escribe la linea " + (j2++) + " de numeros");
				System.out.println("Escribe el primer numero de la linea " + (j2++));
				a = leer.nextInt();
				System.out.println("Escribe el segundo umero de la linea " + i);
				b = leer.nextInt();
				System.out.println("Escribe el tercer umero de la linea " + i);
				c = leer.nextInt();
				System.out.println("los resultados fueron: ");
				for (int x = 0; x < 3; x++) {
					switch (x) {
						case 0:
							d = a + b; e = a + c; f = b + c;
							System.out.println(d + " " + e + " " + f);
							break;
						case 1:
							d = a - b; e = a - c; f = b - c;
							System.out.println(d + " " + e + " " + f);
							break;
						case 2:
							d = a * b; e = a * c; f = b * c;
							System.out.println(d + " " + e + " " + f);
							break;
					}
				}
			}
		leer.close();
	}
}