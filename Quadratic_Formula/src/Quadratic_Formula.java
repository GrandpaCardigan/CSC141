import java.util.Scanner;

public class Quadratic_Formula
{
    /**
     *  @param args
      */
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        //Declare Variables
        double a = 1;
        double b = 5;
        double c = 6;

        double disc = 0; //Stores a temporary value to check
        double x1 = 0;
        double x2 = 0;

        //Take Inputs
        System.out.println("Input the values a, b, and c for ax^2+bx+c = 0");
        System.out.print("Input a: ");
        a = s.nextDouble();
        System.out.print("Input b: ");
        b = s.nextDouble();
        System.out.print("Input c: ");
        c = s.nextDouble();

        //Process Inputs
        disc = Math.pow(b,2)-4*a*c; //Discriminate to find a check

        if (disc > 0) //if discriminate > 0, execute code
        {
            x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            //Output Results
            System.out.println("x1 = " + x1);
            System.out.println("x2 =" + x2);
        }
        else if (disc == 0) //Check if equivalent to 0
        {
            x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.println("There is one real root at x = "+x1);
        }
        else {
            System.out.println("There are no real roots");
        }
    }
}
