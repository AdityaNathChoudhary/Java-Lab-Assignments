import java.lang.*;
import java.util.*;

class Quadratic
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coefficient a :");
        double a = sc.nextDouble();

        System.out.println("Enter coefficient b:");
        double b = sc.nextDouble();

        System.out.println("Enter coefficient c:");
        double c = sc.nextDouble();

        if(a == 0)
        {
            System.out.println("It is not a quadratic equation");
        }
        else
        {
            double D = (b * b) - (4 * a * c);

            if(D > 0)
            {
                double r1 = (-b + Math.sqrt(D)) / (2 * a);
                double r2 = (-b - Math.sqrt(D)) / (2 * a);

                System.out.println("The equation have real and distinct roots");

                System.out.println("1st Root = " + r1);
                System.out.println("2nd Root = " + r2);
            }
            else if(D == 0)
            {
                double r = -b / (2 * a);

                System.out.println("The equation have real and equal roots");

                System.out.println("1st Root = 2nd Root " + r);
            }
            else
            {
                double realp = -b / (2 * a);
                double imgp = Math.sqrt(-D) / (2 * a);

                System.out.println("The equation have complex roots");

                System.out.println("1st Root = " + realp + "+" + imgp + "i");

                System.out.println("2nd Root = " + realp + "-" + imgp + "i");
            }
        }
    }
}