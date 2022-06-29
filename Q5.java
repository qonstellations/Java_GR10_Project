import java.util.*;
public class Q5 {
    public double area(double a, double b, double c){
        double s = (a + b + c) / 2;
        return Math.pow((s * (s - a) * (s - b) * (s - c)), 0.5);
    }

    public double area(int a, int b, int height){
        return ((1 / 2) * height * (a + b));
    }

    public double area(int diagonal1, int diagonal2){
        return ((1 / 2) * (diagonal1 * diagonal2));
    }

    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        Q5 obj = new Q5();

        System.out.println("\n1) Area of Triangle with Heron's formula");
        System.out.println("2) Area of Trapezium");
        System.out.println("3) Area of Rhombus with 2 diagonals");
        System.out.print("\nEnter your option : ");
        int choice = scnr.nextInt();

        switch (choice) {
            case 1:
                System.out.print("\nEnter value for side 1 : ");
                double s1 = scnr.nextDouble();
                System.out.print("Enter value for side 2 : ");
                double s2 = scnr.nextDouble();
                System.out.print("Enter value for side 3 : ");
                double s3 = scnr.nextDouble();

                double ans1 = obj.area(s1, s2, s3);
                System.out.print("\nArea of Triangle : " + ans1);
                break;

            case 2:
                System.out.print("\nEnter value for 1st parallel side : ");
                int a = scnr.nextInt();
                System.out.print("Enter value for 2nd parallel side : ");
                int b = scnr.nextInt();
                System.out.print("Enter value for height : ");
                int h = scnr.nextInt();

                double ans2 = obj.area(a, b, h);
                System.out.print("\nArea of Trapezium : " + ans2);
                break;
                

            case 3:
                System.out.print("\nEnter value for 1st diagonal : ");
                int x = scnr.nextInt();
                System.out.print("Enter value for 2nd diagonal : ");
                int y = scnr.nextInt();

                double ans3 = obj.area(x, y);
                System.out.print("\nArea of Rhombus : " + ans3);
                break;
        
            default:
                System.out.println("Invalid Input!");
        }
        scnr.close();
    }
}