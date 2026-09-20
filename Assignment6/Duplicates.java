import java.util.*;

class Duplicates
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

        Arrays.sort(a);

        int i = a[0];
        boolean flag = true;

        for(int j = 1; j < n; j++)
        {
            if(a[i] == a[j] && (flag))
            {
                System.out.println("Duplicate element = " + a[j]);
                flag = false;
            }
        else
        {
            i = j;
            flag = true;
        }
    }
}
}