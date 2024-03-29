import java.util.Scanner;
public class Arreglos4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] c = new int[6]; 
        for (int i = 0; i < 6; i++) {
            System.out.println("Escribe la calificacion");
            c[i] = leer.nextInt();
            
        }
        System.out.println("Las calificaciones son:");
         for (int i = 0; i < 6; i++) {
            System.out.println(c[i]);
        }
        leer.close();
    }
}
