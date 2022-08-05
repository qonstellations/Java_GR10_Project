import java.util.*;
public class Q8{
    int year;
    String title;
    float rating;

    public Q8(){
        year = 0;
        title = "";
        rating = 0.0;
    }

    public void accept(){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter movie title : ");
        title = scnr.nextLine();

        System.out.print("\nEnter movie year : ");
        year = scnr.nextInt();
    }

    public void display(){
        String review;

        if(rating >= 0.0 && rating <= 2.0)
            review = "Flop";
        else if(rating >= 2.1 && rating <= 3.4)
            review = "Semi-Hit";
        else if(rating >= 3.5 && rating <= 4.5)
            review = "Hit";
        else if(rating >= 4.6 && rating <= 5.0)
            review = "Super-Hit";
        else
            review = "Null";

        System.out.println("Movie Title : " + title);
        System.out.println("Movie Review : " + review);
    }

    public static void main(String[] args) {
        Q8 obj = new Q8();

        obj.accept();
        obj.display();
    }
}
