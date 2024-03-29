import java.util.Scanner;
public class TablaMultiplicar {
    public static void main(String[] args){
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el numero");
        n = leer.nextInt();
        System.out.println("Tabla del " + n);
        int i = 1;
        for (;i <= 10;){
            System.out.println(n + "*" + i + "=" + n*i);
            i++;
        }
        leer.close();
        /*
         prueba de escritorio
        n  i   i<=10      i++      salida
        2   1   1<=10       2       2*1 = 2
        2   2   2<=10       3       2*2 = 4
        2   3   3<=10       4       2*3 = 6
        2   4   4<=10       5       2*4 = 8
        2   5   5<=10       6       2*5 = 10
        2   6   6<=10       7       2*6 = 12
        2   7   7<=10       8       2*7 = 14
        2   8   8<=10       9       2*8 = 16
        2   9   9<=10       10       2*9 = 18
        2   10   10<=10      -       2*10 = 20
        */
    }
    
    

}
