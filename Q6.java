import java.util.*;
public class Q6{
    int acc_num, days_late;
    String title, author;

    public void input(){
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter accession number : ");
        acc_num = scnr.nextInt();

        System.out.print("\nEnter book title : ");
        title = scnr.nextLine();

        System.out.print("\nEnter book author : ");
        author = scnr.nextLine();
    }

    public void compute(){
        Scanner scnr = new SCanner(System.in);

        System.out.print("\nEnter number of days late : ");
        days_late = scnr.nextInt();

        System.out.println("Total Fine = ₹2 * " + days_late + " = ₹" + (days_late * 2));
    }

    public void display(){
        System.out.println("Accession Number\tTitle\tAuthor");
        System.out.println(acc_num + "\t" + title + "\t" + author);
    }

    public static void main(String args[]){
        Q6 obj = new Q6();

        obj.input();
        obj.compute();
        obj.display();
    }
}
