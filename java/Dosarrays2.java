import java.util.Scanner;
public class Dosarrays2 {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        Scanner leer = new Scanner(System.in);
        for (int[] d1 : a) {
            for (int i = 0; i < d1.length; i++) {
                System.out.println("Escribe el numero");
                d1[i] = leer.nextInt();
            }
        }
        for (int[] d1 : a) {
            for (int i = 0; i < d1.length; i++) {
                System.out.print(d1[i] + "");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 2; i >=0 ; i--) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + "");
            }
            System.out.println(" ");
        }
        leer.close();
    }
}
