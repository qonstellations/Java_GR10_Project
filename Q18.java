import java.util.*;
public class Q18{

    public static void main(String args[]){
    
        Scanner scnr = new Scanner(System.in);
        int nums[] = new int[10];
        System.out.println("Enter 10 numbers : ");
        for(int i = 0; i < nums.length; i++)
            nums[i] = scnr.nextInt();
        
        int low = 0, high = nums.length - 1, mid = (high + low) / 2, flag = 0;
        
        
        System.out.println("Enter record to search :");
        int res = scnr.nextInt();
        while(low <= high){
            mid = (low + high) / 2;
            if(res > nums[mid])
                low = mid;
            else if(res < nums[mid])
                high = mid;
            else{
                flag = 1;
                break;
            }
        }
        
        if(flag == 1)
            System.out.println("Search Successful");
        else 
            System.out.println("Search Unsuccessful");
    }
}