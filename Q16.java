import java.util.*;
public class Q16{

    public static void main(String args[]){
    
        Scanner scnr = new Scanner(System.in);
        int grads[] = {1992, 1997, 2003, 2006, 2009, 2013, 2016, 2017, 2019, 2020};
        
        int low = 0, high = grads.length - 1, mid = (high + low) / 2, flag = 0;
        
        
        System.out.println("Enter record to search :");
        int res = scnr.nextInt();
        while(low <= high){
            mid = (low + high) / 2;
            if(res > grads[mid])
                low = mid;
            else if(res < grads[mid])
                high = mid;
            else{
                flag = 1;
                break;
            }
        }
        
        if(flag == 1)
            System.out.println("Record Exists");
        else 
            System.out.println("Record doesnt exist");
    }
}