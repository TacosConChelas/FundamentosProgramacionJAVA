import java.util.Scanner;
public class Modularidad5 {
    public static void m(){
        System.out.println("Debe pagar $15.00 pesos");
    }
    public static void au(){
        System.out.println("Debe pagar $15.00 pesos");
    }
    public static void t1(){
        System.out.println("Debe pagar $45.00 pesos");
    }
    public static void t2(){
        System.out.println("Debe pagar $60.00 pesos");
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int o;
        System.out.println("moto 1, auto 2, trailer 2 ejes 3, trailer 4 ejes 4");
        System.out.println("Escribe el numero dependiendo del vehiculo que traigas");
        o = leer.nextInt();
        switch (o) {
            case 1: m();
                break;
            case 2: au();
                break;
            case 3: t1();
                break;
            case 4: t2();
                break;
            default:
                System.out.println("opcion no valida");
                break;
        }
        leer.close();
    }
}
