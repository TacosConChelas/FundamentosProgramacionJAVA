import java.util.Scanner;
public class TiendaVentas {
    public static void main(String[] args){
        float descuento;
        Scanner leer = new Scanner(System.in);

        System.out.println("Indica el monto");
        float monto = leer.nextFloat();

        if (monto <= 500 && monto > 0) {
            System.out.println("No hay descuento");
            System.out.println("Su total a pagar es " + monto);

        } else if (monto > 500 && monto < 1000) {
            descuento = (float) (monto*0.05); monto -= descuento;
            System.out.println("Su descuento es de 5% y su precio a pagar es de " + monto);

        } else if (monto >= 7000) {
            descuento = (float) (monto*0.1); monto -= descuento;
            System.out.println("Tienes un descuento de 10% y tu precio a pagar es:  " + monto);
        }
    }
}
