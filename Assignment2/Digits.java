import java.lang.*;

class Digits
{
    public static void main(String args[])
    {
        int a = 560, sum = 0;

        if (a > 100 && a < 999)
        {
            while (a > 0)
            {
                sum = sum + a % 10;
                a /= 10;
            }

            System.out.println("The Sum of the digits is = " + sum);
        }
        else
            System.out.println("Invalid number");
    }
}