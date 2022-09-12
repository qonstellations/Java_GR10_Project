import java.util.*;
public class Q12{

    public static void main(String args[]){
    
        Scanner scnr = new Scanner(System.in);
        String str = "STUDENT";
        
        for(int i = str.length() - 1; i >= 0; i--){
        
            for(int j = 0; j <= i; j++){
            
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
        for(int i = 1; i < str.length(); i++){
        
            for(int j = 0; j <= i; j++){
            
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}