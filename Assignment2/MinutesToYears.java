import java.lang.*;

class MinutesToYears
{
    public static void main(String args[])
    {
        long min = 1440;

        long years = min / (60 * 24 * 365);
        long days = (min % (60 * 24 * 365)) / (60 * 24);

        System.out.println("Years = " + years + " Days = " + days);
    }
}