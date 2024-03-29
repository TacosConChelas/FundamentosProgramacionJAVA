import java.util.Scanner;
public class Ejercicio12 {
   
    public static void main(String[] args){
        /*
         Almacenar en un array 5 números y después mostrar el número más grande y el 
         más pequeño 
        */
        Scanner leer = new Scanner(System.in);
        int mayor = 0, menor = 1;
        int numeros[] = new int[5];
        System.out.println("Escribe los números");
        for (int i = 0; i < numeros.length; i++) {
            //el ".length" se refiere al tamaño del arreglo, evitandonos escribir el tamaño total de este 
            numeros[i] = leer.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            } 
        }
        System.out.println("El numero mayor es: " + mayor + " el numero menor es: " + menor );
        leer.close();
        
    }
}
   

