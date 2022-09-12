import java.util.*;
public class Q19{

    public static void main(String args[]){
    
        Scanner scnr = new Scanner(System.in);
        int nums[] = new int[20], even = 0, odd = 0, multiples = 0;
        System.out.println("Enter 20 numbers : ");
        
        for(int i = 0; i < 20; i++){
            nums[i] = scnr.nextInt();
            if(nums[i] % 2 == 0)
                even++;
            else if(nums[i] % 2 != 0)
                odd++;
            if(nums[i] % 4 == 0)
                multiples++;
        }
        
        System.out.println("Even numbers : " + even);
        System.out.println("Odd numbers : " + odd);
        System.out.println("Multiples of 4 : " + multiples);
    }
}