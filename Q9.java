import java.util.*;
public class Q9{
    double sale, com;

    public Q9(double s, double c){
        sale = s;
        com = c;
    }

    public void commission(){
        if(sale <= 1000)
            com = 0.05 * sale;
        else if(sale >= 1001 && sale <= 2000)
            com = 0.1 * sale;
        else if(sale >= 2001)
            com = 0.15 * sale;
    }

    public void display(){
        System.out.println("Sale : " + sale);
        System.out.println("Commission : " + com);
    }

    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter sale : ");
        sale2 = scnr.nextInt();

        Q9 obj = new Q9(sale2, 0);

        obj.commission();
        obj.display();
    }
}
