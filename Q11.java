import java.util.*;
public class Q11{

    public static void main(String ars[]){
    
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scnr.nextLine();
        int upper = 0, lower = 0, digits = 0, special = 0;
        
        for(int i = 0; i < str.length(); i++){
        
            if(Character.isUpperCase(str.charAt(i)))
                upper++;
            else if(Character.isLowerCase(str.charAt(i)))
                lower++;
            else if(Character.isDigit(str.charAt(i)))
                digits++;
            else if(Character.isWhitespace(str.charAt(i)) != false)
                special++;
                
        }
        
        System.out.println("Upper case characters : " + upper);
        System.out.println("Lower case characters : " + lower);
        System.out.println("Special characters : " + special);
        System.out.println("Digits : " + digits);
    }
}