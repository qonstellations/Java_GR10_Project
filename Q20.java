import java.util.*;
public class Q20{

    public static void main(String args[]){
    
        Scanner scnr = new Scanner(System.in);
        String states[] = new String[5], capitals[] = new String[5];
        
        for(int i = 0; i < 5; i++){
        
            System.out.println("Enter state name : ");
            states[i] = scnr.nextLine();
            System.out.println("Enter capital : ");
            capitals[i] = scnr.nextLine();
        }
        
        System.out.println("Enter state whose capital is to be searched : ");
        String res = scnr.nextLine();
        
        for(int j = 0; j < 5; j++){
        
            if(res.equals(states[j]))
                System.out.println("The capital is " + capitals[j]);
        }
    }
}