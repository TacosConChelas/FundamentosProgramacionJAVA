public class For_Act2 {
    public static void main(String[] args){
        int num = 14;
        boolean isTrue = true;
        for (int i = 2; i < num/2; i++) {
            if ((num % i) == 0) {
                isTrue = false;
                break;
            }
        }
        if (isTrue){
            System.out.println("primo");
        } else {
            System.out.println(" No primo");
        }
    }
}
