import java.util.*;

class BinarySearch
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = in.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the sorted elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the element to search:");
        int target = in.nextInt();

        int left = 0;
        int right = n - 1;
        boolean found = false;

        while(left <= right)
        {
            int mid = (left + right) / 2;

            if(arr[mid] == target)
            {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }
            else if(arr[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        if(!found)
        {
            System.out.println("Element not found");
        }
    }
}