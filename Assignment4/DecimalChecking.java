import java.lang.*;
import java.util.*;

class DecimalChecking
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Input 1st floating point number :");
        double n1 = in.nextDouble();

        System.out.println("Input 2nd floating point number :");
        double n2 = in.nextDouble();

        if(Math.round(n1 * 1000) == Math.round(n2 * 1000))
        {
            System.out.println("They are the same upto 3 decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}