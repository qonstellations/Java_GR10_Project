import java.util.*;
public class Q13{

    public static void main(String args[]){
    
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scnr.nextLine().toUpperCase();
        int counter = 0;
        System.out.print("Pair of Vowels : ");
        
        for(int i = 0; i < str.length() - 2; i++){
        
            char ch1 = str.charAt(i), ch2 = str.charAt(i + 1);
            
            
            if((ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U' )
                && (ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U' )){
                
                    System.out.print(ch1);
                    System.out.print(ch2 + " ");
                    counter++;
                }
        }
        
        System.out.println("\nNo of pair of Vowels : " + counter);
    }
}