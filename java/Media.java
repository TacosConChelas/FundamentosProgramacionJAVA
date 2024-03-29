public class Media {
    public static void main(String[] args) {
        double[] n = {10.1, 12.2, 12.3, 13.4, 14.5};
        double r = 0;
        for (int i = 0; i < n.length; i++) {
            r += n[i];
        }
        r /= 5;
        System.out.println("La media es " + r);
    }
}
