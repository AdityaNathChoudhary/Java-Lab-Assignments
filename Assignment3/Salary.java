import java.util.*;

class Salary
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        double gs, basic, hra, da;

        System.out.println("Enter the basic salary:");
        basic = in.nextInt();

        hra = basic * 0.1;
        da = basic * 0.6;
        gs = basic + da + hra;

        System.out.println("Gross Salary = " + gs);
    }
}