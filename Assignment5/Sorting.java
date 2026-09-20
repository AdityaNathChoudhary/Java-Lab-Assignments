import java.util.*;

class Sorting
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements");
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array :");
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}