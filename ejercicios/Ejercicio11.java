import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args){
        /*
            Se registrarán las 20 ventas de un mesdentro de un array, después 
            se guardarán las ventas que superaron los 2000, además de decirnos cuantos 
            fueron de estas
        */
        float ventas[] = new float[10]; 
        float ventasMayores[] = new float[10];
        int contador = 0;
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Escribe la venta de un dia");
            ventas[i] = leer.nextFloat();
            if (ventas[i] > 2000){
                ventasMayores[contador] = ventas[i];
                contador++;
            }
        }
        System.out.println("Ventas que superaron los 2000: ");
        for (int i = 0; i < ventasMayores.length; i++) {
            if (ventasMayores[i] > 0){
                System.out.println(ventasMayores[i]);
            }
        }
        System.out.println("Número de ventas que superaron los 2000: " + contador);
        leer.close();
    }
}
