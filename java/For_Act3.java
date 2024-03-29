public class For_Act3 {
    public static void main (String[] args) {
        int a, b = 4;
        for (a = 1; a < b; a++) {
            System.out.println("a =" + a);
            System.out.println("b =" + b);
        }
        b--;
        /*
        prueba de escritorio
        a  b   a<b     ejecuta     a++      salida
        1  4   1<4     a=1 b=4     2            
        2  4   2<4     a=2 b=4     3 
        3  4   3<4     a=3 b=4     4
        */
    }
}
