import java.util.Scanner;
public class Arreglos3 {
    public static void main(String[] args) {
        String[] n = new String[4]; //Arreglo de los nombres
        Scanner leer = new Scanner(System.in);
        for(int x = 0; x < 4; x++){
            n[x] = leer.nextLine();
        } for(int i = 0; i < 4; i++){
            System.out.println(n[i]);
        }
        leer.close();
        /*
         for(int i = 0; i < 4; i++){
            System.out.println(n[i]);
         }
        */
    }
}
