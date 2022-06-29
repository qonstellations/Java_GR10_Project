import java.util.*;
public class Q1 {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("\nEnter a number to check whether it is a Disarium Number or not : ");
        int num = scnr.nextInt();

        int x = num, length = 0, sum = 0, digit;

        while(x > 0){
            x /= 10;
            length++;
        }

        x = num;

        while(x > 0){
            digit = x % 10;
            x /= 10;
            sum += Math.pow(digit, length);
            length--;
        }

        if(sum == num)
        System.out.println("\n" + num + " is a Disarium Number...");
        else
        System.out.println("\n" + num + " is not a Disarium Number...");
        
        scnr.close();
    }
}