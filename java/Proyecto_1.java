import java.util.Scanner;
public class Proyecto_1 {
    public static void mensajeB(){
        System.out.println("Bienvenido \nEscribe la accion que deces realizar:");
        System.out.println("0)Salir del menu y terminar las operaciones realizadas \n1)Añadir productos al inventario \n2)Vender producto \n3)Mostrar productos en existencia");
    }
    
    
    public static void main(String[] args) { 
        /*
        Integrantes: 
            Hernández Ortega Adriel Xel Há      zS22015739
            Tristan Argyle Vela Sánchez         zS22015791
            Maximiliano Hernández Sánchez       zS22021205
            Jesús Ignacio Jiménez Ojeda         zS22015865

        */
        Scanner leer = new Scanner(System.in);
        byte opcion = 0, a = 0, n = 0, c = 0, d; //Use byte para evitar mucho consumo de memoria ya que estas bariables no llegaran a mas de 100
        int productN = 0, b, b1; double precio = 0; 
        
        double[][] products = {{1, 10, 25.5}, {2, 15, 30}, {3, 20, 15.45}};
        /*
         se tienen 3 productos diferentes al principio, el precio de cada producto es el numero que se encuentra a la derecha,
         y la cantidad de de articulos que se cuentan de ese producto es el numero de la izquierda
        */
        double[][][] productsNew = new double[20][15][3];
        /*Este es un arreglo de productos nuevos por is se decean agregar más*/
        do {
            mensajeB();
            opcion = leer.nextByte();

            if (opcion >= 0 && opcion <= 3) {
                switch (opcion) {
                    case 1:
                        b = 3;
                        //Añadir productos al inventario
                        System.out.println("Escribe cuantos productos deceas añadir");
                        n = leer.nextByte();
                        if (n > 0) {
                            for (int i = 0; i < n; i++) {
                                System.out.println("Escribe el ID del producto");
                                productsNew[a][i][0] = leer.nextDouble();
                                for (double[][] pN1 : productsNew) {
                                    for (double[] pN2 : pN1) {
                                        if (pN2[0] == productsNew[a][i][0]){
                                            b = 0;
                                            break;
                                        } 
                                    }
                                }
                                switch (b) {
                                    case 1:
                                        System.out.println("Escribe la cantidad del producto que deces añadir");
                                        productsNew[a][i][1] = leer.nextDouble();
                                        if(productsNew[a][i][1] > 0){
                                            System.out.println("Escribe el precio del producto que deces añadir");
                                            productsNew[a][i][2] = leer.nextDouble();
                                        } else { 
                                            System.out.println("No puedes ingresar valores iguales o menores a 0");
                                        }
                                        break;
                                    default:
                                        System.out.println("Numero no valido, el ID ya existe");
                                        productsNew[a][i][0] = 0;
                                        break;
                                }
                            }                     
                        } else {
                            System.out.println("No puedes ingresar valores iguales o menores a 0");
                        }
                        break;
                    case 2:
                        
                        //Venta de productos
                        System.out.println("estos son los productos que tenemos disponibres para vender");
                        for (double[] ds : products) {
                            //Se muestran los productos ya existentes
                            b = (int) ds[0];
                            b1 = (int) ds[1];
                            System.out.println("ID del articulo: " + b  + "         En existencia: " + b1 + "            Precio: " + ds[2]); 
                             
                        }

                        for (double[][] dsN : productsNew) {
                            //Se muestran los productos que fueron añadidos posteriormente si es que ese añadieron más
                            for (double[] ds1 : dsN) {
                                if (ds1[0] > 0) {
                                    b = (int) ds1[0];
                                    b1 = (int) ds1[1];
                                    System.out.println("ID del articulo: " + b + "         En existencia: " + b1 + "            Precio: " + ds1[2]);
                                        
                                }
                            }
                        }
                        System.out.println("Escribe el ID del articulo que se decea vender");
                        d = leer.nextByte();
                        for (double[] p : products) {
                            if (p[0] == d) {
                                
                                //
                            }
                        }
                        if (d > 0) {
                            do {
                                if (productN == 1){
                                    System.out.println("Escribe el numero del articulo que se decea vender");
                                    d = leer.nextByte();
                                }
                                if (d < 3 && d >= 0) {

                                    System.out.println("Escribe cuantos decean vender");
                                    c = leer.nextByte();
                                    precio = (double)(products[d][1] * c);
                                } else if (d >= 3 && d < opcion) {

                                    
                                    d -= 3; //se le quita 3 a la variable ya que en la pantalla los numeros son diferentes a los indices de este arreglo

                                    System.out.println("Escribe cuantos decean vender");
                                    c = leer.nextByte();
                                    precio += (double)(productsNew[a][d][1] * c);
                                } else { System.out.println("Numero de producto inexistente"); }
                                System.out.println("Si deceas incluir mas articulos escribe 1 \nSi no deceas incluir mas articulos escribe 0");
                                productN = leer.nextInt();
                            
                            } while (productN != 0);
                            System.out.println("Precio a pagar: " + precio + " \n ");
                        } else {
                            System.out.println("No puedes ingresar valores iguales o menores a 0");
                        }
                        break;
                    case 3:
                        
                        //Mostar los productos con lo que se cuentan en el inventario
                        System.out.println("estos son los productos que tenemos disponibres para vender");
                        for (double[] ds : products) {
                            //Se muestran los productos ya existentes
                            b = (int) ds[0];
                            b1 = (int) ds[1];
                            System.out.println("ID del articulo: " + b  + "         En existencia: " + b1 + "            Precio: " + ds[2]); 
                                
                        }

                        for (double[][] dsN : productsNew) {
                            //Se muestran los productos que fueron añadidos posteriormente si es que ese añadieron más
                            for (double[] ds1 : dsN) {
                                if (ds1[0] > 0) {
                                    b = (int) ds1[0];
                                    b1 = (int) ds1[1];
                                    System.out.println("ID del articulo: " + b + "         En existencia: " + b1 + "            Precio: " + ds1[2]);
                                        
                                }
                            }
                        }
                        break;
                    default:
                        // no hace nada :I ... literal no hace nada >:D ... 
                        break;
                }
                a++;
            } else {
                System.out.println("Opcion no valida");
            }
        } while (opcion != 0);
        System.out.println("Gracias por su estancia :D <3");
        leer.close();
    }
}
