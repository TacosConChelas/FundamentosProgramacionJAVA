import java.util.Scanner;
public class EjempSwitch1 {
    public static void main(String[] args){
        //Adriel Xel Há Hernández Ortega 
        //ZS22015739
        int count;
        Scanner leer = new Scanner(System.in);

        System.out.println("1)quesadilla, 2)taco, 3)torta");
        System.out.println("Escribe el numero del platillo que quieras elegir");
        count = leer.nextInt();

        switch (count) {
            case 1:
                {
                    System.out.println("tu platilo es una quesadilla");
                    System.out.println("Su costo es de 10 pesos");
                }
                break;
            case 2:
                {
                    System.out.println("tu platilo es un taco");
                    System.out.println("Su costo es de 8 pesos");
                }
                break;
            case 3:
                {
                    System.out.println("tu platilo es una torta");
                    System.out.println("Su costo es de 20 pesos");
                }
                break;
            default:
                {
                    System.out.println("Tu platillo no aparece aqui");
                    System.out.println("Prueba con otro platillo");
                }
                break;
        }
    }
}
