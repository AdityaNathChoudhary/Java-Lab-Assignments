import java.util.*;

class Electricity
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        double current, old, cost = 0.0;

        System.out.println("Enter the current electricity unit");
        current = in.nextDouble();

        System.out.println("Enter the previous electricity unit");
        old = in.nextDouble();

        double unit = current - old;

        if(unit <= 100)
            cost = 3 * unit;
        else if(unit <= 500)
            cost = (100 * 3) + (unit - 100) * 4;
        else
            cost = (100 * 3) + (400 * 4) + (unit - 500) * 6;

        System.out.println("Total electricity bill cost = " + cost);
    }
}