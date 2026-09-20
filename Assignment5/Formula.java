class Formula
{
    public static void main(String args[])
    {
        double e = 1;
        int fact = 1;

        for(int i = 1; i <= 5; i++)
        {
            fact = fact * i;
            e = e + (1.0 / fact);
        }

        System.out.println("Value of e = " + e);
    }
}