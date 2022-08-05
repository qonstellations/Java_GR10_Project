import java.util.*;
public class Q7{
    int basic, gross, net;
    String name, empno;

    public Q7(b, n, e){
        basic = b;
        name = n;
        empno = e;
    }

    public void accept(){
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter name of employee : ");
        String name2 = scnr.nextLine();

        System.out.print("\nEnter employee number : ");
        String empno = scnr.nextLine();

        System.out.print("\nEnter basic salary of employee : ");
        int basic2 = scnr.nextInt();
    }

    public void compute(){
        double da = 0.3 * basic, hra = 0.15 * basic, pf = 0.12 * basic;
        gross = basic + (int) da + (int) hra;
        net = gross - (int) pf
    }

    public void display(){
        System.out.println("Name of Employee : " + name);
        System.out.println("Employee Number : " + empno);
        System.out.println("Gross Salary : " + gross);
        System.out.println("Net Salary : " + net);
    }

    public static void main(String args[]){
        Q7 obj = new Q7();

        obj.accept();
        obj.compute();
        obj.display();
    }
}
