import java.util.Scanner;
public class CalculadoraArea {
    /**
     * @param args
     */
    public static void main(String[] args){
        //Adriel Xel Há Hernández Ortega 
        //ZS22015739
        int figura;
        float a, b, area;

        Scanner leer = new Scanner(System.in);
        System.out.println("1)Cuadrado, 2)Rectangulo, 3)Triangulo");
        System.out.println("Selecciona la figura usando el número que le corresponde");
        figura = leer.nextInt();

        switch (figura) {
            case 1:
                System.out.println("Escribe el lado");
                a = leer.nextFloat();
                area = (float) a * a;
                ++area;
                System.out.println("El area de tu cuadrado es: " + area);
                break;
            case 2:
                System.out.println("Escribe el primer lado");
                a = leer.nextFloat();
                System.out.println("Escribe la altura de tu triangulo");
                b = leer.nextFloat();
                area = (float) ((a * b) / 2);
                System.out.println("El area de tu triangulo es: " + area);
                break;
            case 3:
                System.out.println("Escribe el primer lado");
                a = leer.nextFloat();
                System.out.println("Escribe el segundo lado");
                b = leer.nextFloat();
                area = (float) a * b;
                System.out.println("El area de tu rectangulo es: " + area);
                break;
            default:
                System.out.println("Su elección no es valida");
                break;
        }
        leer.close();
    }
}
