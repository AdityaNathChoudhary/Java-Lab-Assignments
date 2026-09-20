import java.util.*;

class Avg
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int len = in.nextInt();
        int a[] = new int[len];

        for(int i = 0; i < len; i++)
        {
            a[i] = in.nextInt();
        }

        int sum = 0;

        for(int i = 0; i < len; i++)
        {
            sum = sum + a[i];
        }

        System.out.println("The average value of the array is " + (double)(sum / a.length));
    }
}