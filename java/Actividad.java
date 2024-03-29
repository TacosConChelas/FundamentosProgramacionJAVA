import java.util.Scanner;
public class Actividad {
    public static void main(String[] args) {
        int num; //Declaracion de la variable de tipo entero
        
        Scanner leer = new Scanner(System.in); //se declara el objeto y se inicializa con el objeto de entrada estandar predefinido

        System.out.println("Dame un numero"); //se imprime el mensaje solicitando el valor entero

        num = leer.nextInt(); //Entrada de datos numericos y asignacion de la variable num

        System.out.println("El numero almacenado es: " + num); //Se imprime el valor introducido



        
    }
}