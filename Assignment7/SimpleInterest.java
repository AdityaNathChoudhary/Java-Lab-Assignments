import java.util.*;

class SimpleInterest
{
    double SI(double principal, int time)
    {
        double rate = 5;
        return (principal * rate * time) / 100;
    }

    double SI(int time, double rate)
    {
        double principal = 10000;
        return (principal * rate * time) / 100;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        SimpleInterest obj = new SimpleInterest();

        System.out.println("Enter principal amount :");
        double principal = sc.nextDouble();

        System.out.println("Enter Time :");
        int time = sc.nextInt();

        double si1 = obj.SI(principal, time);

        System.out.println("Simple Interest with default rate (5%), time = " + si1);

        System.out.println("\nEnter Time :");
        time = sc.nextInt();

        System.out.println("Enter Rate :");
        double rate = sc.nextDouble();

        double si2 = obj.SI(time, rate);

        System.out.println("Simple Interest with default principal (10000) = " + si2);

        sc.close();
    }
}
