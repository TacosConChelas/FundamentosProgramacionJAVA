import java.util.Scanner;
public class CasetaXalapaVeracruz {
    public static void main(String[] args){
        //Adriel Xel Há Hernández Ortega 
        //ZS22015739
        int count;
        Scanner leer = new Scanner(System.in);

        System.out.println("1)Auto, 2)Camioneta, 3)Moto, 4)Trailer");
        System.out.println("Escribe el número correspondiente al vehiculo que manejas");
        count = leer.nextInt();

        switch (count) {
            case 1:
                System.out.println("Debe pagar $36.00 pesos");
                break;
            case 2:
                System.out.println("Debe pagar $50.00 pesos");
                break;
            case 3:
                System.out.println("Debe pagar $25.00 pesos");
                break;
            case 4:
                System.out.println("Debe pagar $220.00 pesos");
                break;
            default:
                System.out.println("Su elección no es valida");
                break;
        }
        leer.close();  
    }
}
