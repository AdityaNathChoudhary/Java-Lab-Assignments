import java.lang.*;
import java.util.*;

class GreatestNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the 3 numbers");

        int a = in.nextInt();
        int max =a;

        int b = in.nextInt();
        max = Math.max(max, b);

        int c = in.nextInt();
        max = Math.max(max, c);

        System.out.println("The greatest number = " + max);
    }
}