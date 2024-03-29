//Dado un numero entre 1 y 999, convertirlo en numero romano, dado la siguente nomenclatura.
import java.util.Scanner;

public class Nromanos{
    public static void main(String args[]){
		int u, d,c;
		String n1 = ".", n2= ".", n3= ".";
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingresa un numero ");
		int num = leer.nextInt();

		c = num/100;
		d = (num%100)/10;
		u = num%10;
	
		switch (c){
			case 1:
				n1 = "C";
				break;
			case 2:
				n1 = "CC";
				break;
			case 3:
				n1 = "CCC";
				break;
			case 4:
				n1 ="CD";
				break;
			case 5:
				n1 ="D";
				break;
			case 6:
				n1 = "DC";
				break;
			case 7:
				n1 = "DCC";
				break;
			case 8:
				n1 = "DCCC";
				break;
			case 9:
				n1 = "CM";
				break;
			default:
				System.out.print("-");
				break;
		}
		switch (d){
			case 1:
				n2 = "X";
				break;
			case 2:
				n2 = "XX";
				break;
			case 3:
				n2 = "XXX";
				break;
			case 4:
				n2 = "XL";
				break;
			case 5:
				n2 = "L";
				break;
			case 6:
				n2 = "LX";
				break;
			case 7:
				n2 = "LXX";
				break;
			case 8:
				n2 = "LXXX";
				break;
			case 9:
				n2 = "XC";
				break;
			default:
				System.out.print("-");
				break;
		}
		switch (u){
			case 1:
				n3 = "I";
				break;
			case 2:
				n3 = "II";
				break;
			case 3:
				n3 = "III";
				break;
			case 4:
				n3 = "IV";
				break;
			case 5:
				n3 = "V";
				break;
			case 6:
				n3 = "VI";
				break;
			case 7:
				n3 = "VII";
				break;
			case 8:
				n3 = "VIII";
				break;
			case 9:
				n3 = "IX";
				break;
			default:
				System.out.print("-");
				break;
		}
		System.out.println("Tu número es: " + n1 + n2 + n3);
	}
}
