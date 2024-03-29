import java.util.Scanner;
public class Calificaciones {
    public static void main(String[] args) {
       float calificacion1, calificacion2, promedio;
        Scanner leer = new Scanner(System.in); 

        System.out.println("Dime la primera calificacion"); 
        calificacion1 = leer.nextFloat();

        System.out.println("Dime la segunda calificacion"); 
        calificacion2 = leer.nextFloat();
        promedio = (calificacion1 + calificacion2) / 2;

        System.out.println("El prommedio de tu calificacion es: " + promedio); 

        
    }
}