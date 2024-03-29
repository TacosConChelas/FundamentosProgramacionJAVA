import java.util.Scanner;
public class Suma2Num_Scanner {
    public static void main(String[] args) {
        int num1, num2; //Declaracion de la variable de tipo entero
        
        Scanner leer = new Scanner(System.in); //se declara el objeto y se inicializa con el objeto de entrada estandar predefinido

        System.out.println("Dame el primer numero"); //se imprime el mensaje solicitando el valor entero
        num1 = leer.nextInt(); //Entrada de datos numericos y asignacion de la variable num

        System.out.println("Dame el segundo numero"); //se imprime el mensaje solicitando el valor entero
        num2 = leer.nextInt();

        //suma = num1 + num2; //Suma de las 2 variables 
        

        System.out.println("La suma de los 2 numeros es: " + num1 + num2); //suma de los números



        
    }
}