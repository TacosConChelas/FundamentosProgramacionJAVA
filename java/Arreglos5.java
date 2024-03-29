import java.util.Scanner;
public class Arreglos5 {
    public static void main(String[] args) {
        float[] c = new float[6]; float p = 0, ma = 1, me = 0;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Escribe la calificacion"); c[i] = leer.nextFloat();
            p += c[i];
            ma = (i == 0)? c[i] : ma; me = (i == 0)? c[i] : me;
            if (ma <= c[i]) {
                ma = c[i];
            } else if(me >= c[i]){
                me = c[i];
            }
        }
        p /= (4);
        System.out.println("el promedio es: " + p + "\nLa calificacion mas baja es: " + me + "\nY la mas alta es: " + ma);
        leer.close();
    }
}
