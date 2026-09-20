import java.util.*;

class PositiveandNegative
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = in.nextInt();

        if(n > 0)
            System.out.println(n + " is a positive number");
        else if(n < 0)
            System.out.println("The number is negative");
        else
            System.out.println("It is a zero");
    }
}