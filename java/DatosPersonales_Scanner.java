import java.util.Scanner;
public class DatosPersonales_Scanner {
    public static void main(String[] args) {
        String nombre; int edad; float peso;
        Scanner leer = new Scanner(System.in); //se declara el objeto y se inicializa con el objeto de entrada estandar predefinido

        System.out.println("Hola, Dame tu nombre"); 
        nombre = leer.nextLine();

        System.out.println("Dame tu edad"); 
        edad = leer.nextInt();

        System.out.println("Dime tu peso en KG"); 
        peso = leer.nextFloat();

        System.out.println("te llamad " + nombre + ", tu edad es " + edad + ", y tu peso es " + peso); //suma de los numeros

      


        
    }
}