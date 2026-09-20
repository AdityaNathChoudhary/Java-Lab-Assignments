import java.util.*;

class DuplicateString
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of 1st array");
        int m = in.nextInt();

        System.out.println("Enter the size of 2nd array");
        int n = in.nextInt();

        String arr1[] = new String[m];
        String arr2[] = new String[n];

        in.nextLine();

        System.out.println("Enter the elements in 1st array");
        for(int i = 0; i < m; i++)
        {
            arr1[i] = in.nextLine();
        }

        System.out.println("Enter the elements in 2nd array");
        for(int i = 0; i < n; i++)
        {
            arr2[i] = in.nextLine();
        }

        int c = 0;

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(arr1[i].equals(arr2[j]))
                {
                    c++;
                }
            }
        }

        String arr3[] = new String[c];

        c = 0;

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(arr1[i].equals(arr2[j]))
                {
                    arr3[c] = arr1[i];
                    c++;
                }
            }
        }

        System.out.println("Common elements :");

        for(int i = 0; i < arr3.length; i++)
        {
            System.out.println(arr3[i]);
        }
    }
}