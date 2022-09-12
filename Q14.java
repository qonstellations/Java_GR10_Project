import java.util.*;
public class Q14{

    public static void main(String args[]){
    
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = " " + scnr.nextLine();
        
        for(int i = 0; i < str.length() - 1; i++){
            
            if(i == str.lastIndexOf(' '))
                break;
            if(Character.isWhitespace(str.charAt(i)))
                System.out.print(str.charAt(i + 1) + ". ");
        }
        
        for(int j = str.lastIndexOf(' '); j < str.length(); j++)
            System.out.print(str.charAt(j));
    }
}