public class For_Act4 {
    public static void main(String[] args) {
        int a, b;
        for (a = 1, b = 4; a < b;a++, b--) {
            System.out.println("a =" + a);
            System.out.println("b =" + b);
        }
        /*
        prueba de escritorio
            a  b   a<b     ejecuta     a++     b--     salida
            1  4   1<4     a=1 b=4     2       3       
            2  3   2<3     a=2 b=3     3       2    
            
        */
    }
    
}
