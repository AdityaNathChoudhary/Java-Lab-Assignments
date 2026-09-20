import java.util.*;

class Sorting
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int len = in.nextInt();
        int a[] = new int[len];

        System.out.println("Enter the elements");
        for(int i = 0; i < len; i++)
        {
            a[i] = in.nextInt();
        }

        for(int i = 0; i < len - 1; i++)
        {
            for(int j = 0; j < len - i - 1; j++)
            {
                if(a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < len; i++)
        {
            System.out.println(a[i]);
        }
    }
}