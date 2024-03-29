import java.util.Scanner;
public class CalificacionesIF {
    public static void main(String[] args){
        int cali1, cali2, tot;
        String nombre;
        Scanner leer = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        nombre = leer.nextLine();
        System.out.println("Escribe tu primera calificación");
        cali1 = leer.nextInt();
        System.out.println("Escribe tu segunda calificación");
        cali2 = leer.nextInt();

        tot = (cali1 + cali2) / 2;
        

        if (tot >= 6) {
            System.out.println("No presentas examen");
        } else {
            System.out.println("Presenta examen");
        }



    }
   


}
