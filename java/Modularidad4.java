public class Modularidad4 {
    public static double s(double x, double y){
        return (x + y);
    }
    public static void main(String[] args) {
        double a = 10, b = 20, r = s(a, b);
        System.out.println("el resultado es " + r);
    }
}
