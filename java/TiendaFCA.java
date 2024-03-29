import java.util.Scanner;
public class TiendaFCA {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        float p, t = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa el monto a pagar");
            p = leer.nextFloat();
            t += p;
        }

       System.out.println("El total a pagar es: " + t);
       leer.close();

    }
}
