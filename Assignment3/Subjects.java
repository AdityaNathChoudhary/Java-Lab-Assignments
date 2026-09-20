import java.util.*;

class Subjects
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        double s1, s2, s3, s4, s5, t, per;

        System.out.println("Enter Subject-1 Marks");
        s1 = in.nextDouble();

        System.out.println("Enter Subject-2 Marks");
        s2 = in.nextDouble();

        System.out.println("Enter Subject-3 Marks");
        s3 = in.nextDouble();

        System.out.println("Enter Subject-4 Marks");
        s4 = in.nextDouble();

        System.out.println("Enter Subject-5 Marks");
        s5 = in.nextDouble();

        t = s1 + s2 + s3 + s4 + s5;
        per = (t / 500) * 100;

        System.out.println("Total Marks : " + t);
        System.out.println("Percentage : " + per);
    }
}