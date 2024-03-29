/**
 * CuantDulcesMTocaran
 */
import java.util.Scanner;
public class CuantDulcesMTocaran {

    public static void main(String[] args) {
        int n, nn, m, yo, dr;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe la cantidad de dulces paa la fiesta");
        n = leer.nextInt();
        System.out.println("Escribe la cantidad de amigos que asistieron a la fiesta");
        m = leer.nextInt();
        
        if ((n / 2) > m){
            nn = (n / 2); n -= nn; 
            dr = (int) (Math.ceil(n / m)); yo = n % m;
            System.out.println("Tu mama le dara " + nn + " a tu tia y repartira " + dr + " a tus " + m + " amigos ");
            System.out.println("sobrando " + yo + " dulces para ti");
        } else {
            System.out.println("Numeros equibocados");
        }
        leer.close();



    }
}