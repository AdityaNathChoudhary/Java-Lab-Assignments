import java.util.*;

class MaxMin
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = in.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the elements");
        for(int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
        }

        int max = a[0];
        int min = max;

        for(int i = 1; i < n; i++)
        {
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }

        System.out.println("Maximum value of the above array : " + max);

        System.out.println("Minimum value of the above array : " + min);
    }
}