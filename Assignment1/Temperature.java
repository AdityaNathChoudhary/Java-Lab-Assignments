import java.lang.*;

class Temperature
{
    public static void main(String args[])
    {
        double cel = 30.5;
        double fah = (cel * (9.0/5.0)) + 32;
        System.out.println("Temperature in fahrenheit: "
                           + fah);
    }
}