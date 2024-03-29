import java.util.Scanner;
public class CalcularDias {
    public static void main(String[] args){
        /*
         obtener la edad, calcular los dias que la persona ha vivido y poner is es mayor de edad o menor
        */
        float c, p = 0, cont = 0;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("escribe tu calificacion");
            c = leer.nextFloat();
            p += c;
            cont++;
        }
        p /= (float)(cont);
        System.out.println("el promedio es: " + p);
        leer.close();
    }
}
