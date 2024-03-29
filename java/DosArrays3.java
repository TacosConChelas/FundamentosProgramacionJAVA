import java.util.Scanner;
public class DosArrays3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float[][] cs = new float[2][3]; float p = 0;
        System.out.println("Ingresa las calificaciones");
        for (float[] c : cs) {
            for (int i = 0; i < c.length; i++) {
                c[i] = leer.nextFloat();
                p += c[i];
            }
        }
        p /= 6;
        System.out.println("el promedio es: " + p);
        leer.close();
    }
}
