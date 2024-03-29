import java.util.Scanner;
public class Ejercicio18 {
 	public static void main(String[] args)   {
		/*
		Crear un código para gestionar las facturas de una empreza que se dedica a la venta de azucar x kg 
		en cada facura se ingresa el código del producto vendido, la cant de kg vendidos, y el total a 
		pagar por los quilos. El kg de zucar cuesta 100.
		De 5 facturas introducidas se pide:
		Facturación total, cant de kig vendidos, y cuantas facturas fueron emitidas por más de 1,000
		*/
		int f = 0, k, cf, p = 0;
		int[][] datos = new int[2][3];
		Scanner leer = new Scanner(System.in);
		
		for (int[] dato : datos) {
			System.out.println("Escriba la cantidad de KG de asucar que esta comprando");
			k = leer.nextInt(); //KG comprados
			p = (100 * k); //Precio a pagar
			System.out.println("Ingresa el codigo de 3 dígitos del producto");
			cf = leer.nextInt(); //Código de producto
			dato[0] = k; dato[1] = p; dato[2] = cf;
			
			f = (p >= 1000)? f + 1 : f + 0;
		}
		/*
		if (p >= 1000){
			f++;
		} 
		for (int i = 0; i < 2; i++){
			p += datos[i][1];
			k += datos[i][0];
		}
		for (int i = 0; i < 2; i++){
			System.out.println("Escriba la cantidad de KG de asucar que está comprando");
			k = leer.nextInt(); //KG comprados
			p = (100 * k); //Precio a pagar
			System.out.println("Ingresa el código de 3 dígitos del producto");
			cf = leer.nextInt(); //Código de producto
			datos[i][0] = k; datos[i][1] = p; datos[i][2] = cf;
			
			f = (p >= 1000)? f + 1 : f + 0;
		}
		*/
		p = 0;
		k = 0;
		for (int[] dato : datos) { 
			p += dato[1]; k += dato[0]; 
		}
		System.out.println("La facturacion total fue de: " + p + "\nLa cantidad de facturas emitidas por mas de $1,000 fuero: " + f + "\nLa cantidad de KG vendidos fueron");
		leer.close();
	}
}
