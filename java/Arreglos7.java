import java.util.Scanner; 
public class Arreglos7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] n = new int[10]; int ma = 0, me = 0, nm = 0, nme = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.println("escribe el numero");
            n[i] = leer.nextInt();

            ma = (i == 0)? n[i] : ma; me = (i == 0)? n[i] : me;
            if (ma <= n[i]) {
                ma = n[i];
                nm = i;
            } else if(me >= n[i]){
                me = n[i];
                nme = i;
            }
        }
        System.out.println("el numero mayor es " + ma + " y esta guardado en la  posicion " + nm + " el menor es " + me + " y esta guardado en la posicion " + nme);
        leer.close();
    }
}
