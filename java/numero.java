import java.util.Scanner;
public class numero 
{
public static void main(String[] args)
{
int num; //declaracion de la variable de tipo entero

	 Scanner leer=new Scanner(System.in); //Declarar el objeto e inicializando con el objeto de entrada con el objeto

	System.out.println("Dame un numero"); //Imprimir mensaje solicitando el valor entero 

	num= leer.nextInt(); //Entrada de datos numericos y asignacion a la variable num
	
	System.out.println("El numero almacenado es: " +num); //Imprima el valor introducido 
	}
}
