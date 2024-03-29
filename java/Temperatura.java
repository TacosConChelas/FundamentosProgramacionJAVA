import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args){
        int temp;
        Scanner leer = new Scanner(System.in);

        System.out.println("Escribe tu temperaruta");
        temp = leer.nextInt();

        if (temp >= 36 && temp <= 37) {
            System.out.println("Temperatura normal");
        
        } else {
            if (temp >= 38) {
                  System.out.println("tienes fiebre");
            } else {
                if(temp < 35){
                    System.out.println("Tienes hipotermia");
                }
            }
        }

    }
}
