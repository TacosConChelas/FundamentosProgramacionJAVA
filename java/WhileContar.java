public class WhileContar {
    public static void main(String[] args){
        int n = 10;
        while (n > 0) {
            System.out.println("tic " + n);
            n--;
        }
        /* 
        prueba de escritorio
            n     n < 0    n--     salida
            10      v       9       tic 10
            9       v       8       tic 9
            8       v       7       tic 8
            7       v        6      tic 7
            6       v       5      tic 6
            5       v       4       tic 5
            4       v       3       tic 4
            3       v       2       tic 3
            2       v       1       tic 2
            1       v       0       tic 1
            0      f              


        */
        
    }
}
