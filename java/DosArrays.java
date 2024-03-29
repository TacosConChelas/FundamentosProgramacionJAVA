public class DosArrays {
    public static void main(String[] args) {
        int[][] dD = new int[2][2]; int k = 0;
        for (int[] d1 : dD) {
            for (int i = 0; i < d1.length; i++, k++) {d1[i] = k;}
        }
        for (int[] d1 : dD) {
            for (int i = 0; i < d1.length; i++) {
                System.out.println(d1[i] + "");
            }
            System.out.println("&&");
        }
    }
}
