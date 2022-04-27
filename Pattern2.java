public class Pattern2 {
    public static void main(String args[]) {
        int basenum = 5, spacenum = 0;
        while(basenum >= 1){
            for(int i = 1; i <= basenum; i++){
                System.out.print(i + " ");
            }
            for(int j = 1; j <= spacenum; j++){
                System.out.print("  ");
            }
            for(int k = basenum; k >= 1; k--){
                System.out.print(k + " ");
            }
            System.out.println();
            basenum--;
            spacenum += 2;
        }
    }
}