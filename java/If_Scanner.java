import java.util.Scanner;
public class If_Scanner {
    public static void main(String[] args){
        int a, b;
        int c = 3;
        Scanner leer = new Scanner(System.in);

        System.out.println("Dame el primer numero"); 
        a = leer.nextInt();

        System.out.println("Dame el primer numero"); 
        b = leer.nextInt();

        if (a < b) {
            System.out.println("a es menor que b");
        } else {
            System.out.println("b es mayor que a");
        } 
        if (a == b && b == c && a == c){
            System.out.println("Es un triangulo equilátero");
        }
       


    }
}
