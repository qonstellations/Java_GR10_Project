import java.util.*;
public class Series {
    public void series(int n, int a){
        double sum = 0, power = 1;
        boolean add = false;
        int fact = 1, denom = 2;
        for(int i = 1; i <= n; i++){
            for(int j = denom; j >= 1; j--){    
                fact = fact * j;  
            }
            if(add == false){
                sum -= ((double) Math.pow(a, power)) / ((double) fact);
                add = true;
            }
            else{
                sum += ((double) Math.pow(a, power)) / ((double) fact);
                add = false;
            }
            denom += 2;
            fact = 1;
            power += 3;
        }
        System.out.println("\nSum of Series 1 : " + sum);
    }

    public void series(){
        System.out.println("\nSeries : ");
        for(int i = 1; i <= 9; i++){
            int cube = (int) Math.pow((double)i, (double)3);
            System.out.println(cube - i);
        }
    }
    
    public static void main(String args[]) {
        Series obj = new Series();
        Scanner scnr = new Scanner(System.in);

        System.out.println("\n1) Display Sum of Series : (a / 2!) - (a^4 / 4!) + (a^7) / 6! - ...... upto n terms");
        System.out.println("2) Display Series from : 0, 6, 24 ....... 720");
        System.out.print("\nEnter your choice : ");
        int choice = scnr.nextInt();

        if(choice == 1){
            System.out.print("\nEnter value for n : ");
            int n1 = scnr.nextInt();
            System.out.print("Enter value for a : ");
            int a1 = scnr.nextInt();
            obj.series(n1, a1);
        }
        else if(choice == 2)
            obj.series();
        else
            System.out.println("\nInvalid Input!");

        scnr.close();
    }
}