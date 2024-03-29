import java.io.*;

class EntradaConRead {
    public static void main(String args[]) throws IOException {
    String cd;
    InputStreamReader en =  new InputStreamReader(System.in);
    BufferedReader entrada =  new BufferedReader(en);
    System.out.println("introdusca una entrada de teclado ");
    System.out.flush();
    cd = entrada.readLine();
    System.out.println("Linea de entrada: " + cd);

    }
}   


