
import java.util.Scanner;
public class Modularidad3 {
    public static double s(double a, double b){
        return (a +b);
    }
  public static double res(double a, double b){
        return (a - b);
    }
    public static double m(double a, double b){
        return (a * b);
    }
    public static double d(double a, double b){
        return (a / b);
    }
    public static void main(String[] args) {
        double a = 0, b = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe a");
        a = leer.nextDouble();
        System.out.println("Escribe b");
        b = leer.nextDouble();
        double  r1 = s(a, b), r2 = res(a, b), r3 = m(a, b), r4 = d(a, b);
        System.out.println("los resultados son los siguentes:" + "\n" + r1 + "\n" + r2 + "\n" + r3 + "\n" + r4 );

        leer.close();
    }
}
 