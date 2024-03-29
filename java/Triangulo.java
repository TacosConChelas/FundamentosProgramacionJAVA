import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args){
        int a, b, c;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe el lado 1");
        a = leer.nextInt();
        System.out.println("Escribe el lado 2");
        b = leer.nextInt();
        System.out.println("Escribe el lado 3");
        c = leer.nextInt();

        if (a == b && b == c && c == a) {
            System.out.println("Es un triangulo equilatero");
        } else {
            if (a != b && b != c && c != a) {
                System.out.println("Es un triangulo escaleno");
            } else {
                System.out.println("Es un triangulo isoceles");
            }
                

        }
        



    }
}
