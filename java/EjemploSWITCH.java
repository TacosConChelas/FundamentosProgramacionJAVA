import java.util.Scanner;
public class EjemploSWITCH {
    public static void main(String[] args){
        //Adriel Xel Há Hernández Ortega 
        //ZS22015739
        String color;
        Scanner leer = new Scanner(System.in);

        System.out.println("Escoge tu color favorito: rojo, azul, amarillo");
        color = leer.nextLine();

        switch (color) {
            case "rojo":
                System.out.println("Tu color favorito es: " + color);
                break;
            case "azul": 
                System.out.println("Tu color favorito es: " + color);
                break;
            case "amarillo":
                System.out.println("Tu color favorito es: " + color);
                break;
            default:
            System.out.println("Tu color no aparece aqui");
                break;
        }
        leer.close();
    }
}
