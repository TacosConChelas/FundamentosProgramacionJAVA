public class Arreglos2 {
    public static void main(String[] args){
        int dosD[][] = new int[4][5];
        int i, j, k = 0;
        for(i=0; i<4; i++)
        for(j=0; j<5; j++){
        dosD[i][j] = k;
        k++;
        }
        
        for(i=0; i<4; i++) {
            for(j=0; j<5; j++){
                System.out.println(dosD[i][j] + " ");
            System.out.println("&&");
            }
                                                        
        }

    }
           

    
}
