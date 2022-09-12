import java.util.*;
public class Q15{

    public static void main(String args[]){
    
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = scnr.nextInt();
        String names[] = new String[n];
        int pops[] = new int[n];
        
        for(int i = 0; i < n; i++){
        
            System.out.println("Enter name of country : ");
            names[i] = scnr.next();
            
            System.out.println("Enter population : ");
            pops[i] = scnr.nextInt();
            
        }
        
        for(int j = 0; j < names.length; j++){
        
            for(int k = 0; k < j; k++){
                
                if(pops[j] > pops[k]){
                    int temp = pops[j];
                    pops[j] = pops[k];
                    pops[k] = temp;
                    
                    String temp2 = names[j];
                    names[j] = names[k];
                    names[k] = temp2;
                }
            }
        }
        
        System.out.println("\nDescending order : ");
        for(int l = 0; l < pops.length; l++)
            System.out.println(names[l] + " : " + pops[l]);
    }
}