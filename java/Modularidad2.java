public class Modularidad2 {
    static int max(int a, int b){
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public void hola(){
        
    }

    public static void main(String[] args) {
       int a1 = 34, a2 = 21, a3 = max(a1, a2);
       System.out.println("el maximo entre " + a1 + " y " + a2 + " es " + a3);
    }
}
