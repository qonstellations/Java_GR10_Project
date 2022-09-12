import java.util.*;
public class Q17{

    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        int nums[] = new int[10], flag = 0;
        
        System.out.println("Enter values : ");
        for(int i = 0; i < 10; i++)
            nums[i] = scnr.nextInt();
            
        System.out.println("Enter term to search for : ");
        int res = scnr.nextInt();
        
        for(int j = 0; j < nums.length; j++){
        
            if(res == nums[j]){
                System.out.println("Number is there in array");
                flag = 1;
                break;
            }
            
        }
        if(flag != 1)
            System.out.println("Number is not there in array");
    }
}