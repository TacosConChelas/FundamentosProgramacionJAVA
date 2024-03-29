import java.util.Scanner;
public class Arreglos6 {
    public static void main(String[] args) {
        // dia, gasto, 
        float[] gs = new float[7]; float ma = 0, me = 0, p = 0; int dm = 0;
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < gs.length; i++) {
            System.out.println("dia: " + (i + 1));
            System.out.println("escribe los gastos del dia");
            gs[i] = leer.nextFloat();
            p += gs[i];

            ma = (i == 0)? gs[i] : ma; me = (i == 0)? gs[i] : me;
            if (ma <= gs[i]) {
                ma = gs[i];
                dm = i + 1;
            } else if(me >= gs[i]){
                me = gs[i];
            
            }
        }
        System.out.println("El dia en el que mas se gasto fue " + dm + ", la cantidad gastada fue de " + ma + " la suma total de los gastas de la semana es de " + p);
        System.out.println("El promedio de los gastos de la semana es de " + (p / 7));
        leer.close();
    }
}
