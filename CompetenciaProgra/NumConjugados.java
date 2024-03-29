import java.util.Scanner;
public class NumConjugados {
	public static void main(String[] args){
		/*
		capturar 2 numeros conjugados, dividir el primero entre el segundo 
		*/
		Scanner leer = new Scanner(System.in);
		int r1, r2, i1, i2; int[] i = new int[10]; double a, b, c;

		System.out.println("Escribe la parte real del primero numero");
		r1 = leer.nextInt();
		System.out.println("Escribe la parte real del segundo numero");
		r2 = leer.nextInt();
		System.out.println("Escribe la parte imaginaria del primer numero");
		i1 = leer.nextInt();
		System.out.println("Escribe la parte imaginaria del segundo numero");
		i2 = leer.nextInt();
		
		i[0] = r1 * r2; i[1] = r1 * (-i2);
		i[2] = i1 * r2; i[3] = i1 * (-i2);

		i[4] = i[1] + i[2]; i[3] = - (i[3]); i[3] += i[0];
		//nuevo terminos en el numerador es i4 y i3

		i[5] = r2 * r2; i[6] = - (i2 * i2); i[6] = - (i[6]);
		i[6] += i[5];
		//nuevo denominador es i6
		
		a = (double) (i[3] / i[6]);
		b = (double) (i[4] / i[6]); 
		c = 0.0003;
 
		System.out.println("numero real: " + a);
		System.out.println("numero imaginario: " + b); 
		System.out.println(i[9]); 
		
		leer.close();
	}
}