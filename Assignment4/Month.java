import java.lang.*;
import java.util.*;

class Month
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter month (1-12):");
        int month = in.nextInt();

        System.out.println("Enter year:");
        int year = in.nextInt();

        switch(month)
        {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                System.out.println("31 days");
                break;

            case 2:
                if(((year % 4 == 0) && (year % 100 != 0)) ||
                   (year % 400 == 0))
                {
                    System.out.println("29 days");
                }
                                else
                {
                    System.out.println("28 days");
                }
                break;

            case 4:case 6:case 9:case 11:
                System.out.println("30 Days");
                break;

            default:
                System.out.println("Invalid month input");
                break;
        }
    }
}