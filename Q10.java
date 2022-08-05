import java.util.*;
public class Q10{
    int num, reverse;

    public Q10(int x){
        num = x;
    }

    public int reverse(int n){
        int o = n;
        String rev = "";
        while(o >= 0){
            rev += Integer.toString(o % 10);
            o /= 10;
        }
        reverse = Integer.parseInt(rev);
        return reverse;
    }

    public void palindrome(){
        if(reverse == num)
            System.out.println(num + " is a palindrome!");
        else
            System.out.println(num + " is not a palindrome...");
    }

    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter number to check for palindrome : ");
        int num2 = scnr.nextInt();

        Q10 obj = new Q10(num2);

        int revnum = obj.reverse();
        obj.palindrome();
    }
}
