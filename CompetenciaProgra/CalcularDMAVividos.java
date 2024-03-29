import java.util.Scanner;
public class CalcularDMAVividos {
    public static int dia(int x, int y, int z){
        if (x < 0){
            y--;
            switch(y){
                case 1, 3, 5, 7, 8, 10, 12:
                    x += 31; break;
                case 2:
                    x = (z == 1)? (29 + x) : (28 + x); break;
                case 4, 6, 9, 0: 
                    x += 30; break;
                default:

                break;
            }
        }
        return x;
    }
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int a, m, d, da = 7, ma = 11, aa = 2023, ab, diaR = 0;
        System.out.println("Escribe el año en el que naciste");
        a = leer.nextInt();
        System.out.println("Escribe el mes en el que naciste");
        m = leer.nextInt();
        System.out.println("Escribe el sia en el que naciste");
        d = leer.nextInt();

        aa -= a; ma -= m; da -= d;
        ab = ((a % 4) == 0)? 1 : 0;
        if (ma < 0){
            aa--;
            ma += 11;
            diaR = dia(da, ma, ab);
            
        } else if((ma == 0) && (d > 7)){
            aa--;
            ma += 11;
            diaR = 30 - d;
        } else {
            diaR = dia(da, ma, ab);
        }
        System.out.println("" + aa + "años");
        System.out.println("" + ma + "meses");
        System.out.println("" + diaR + "dias");

        leer.close();
    
    }

}
