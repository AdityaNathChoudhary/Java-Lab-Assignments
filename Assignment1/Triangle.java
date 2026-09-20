import java.lang.*;

class Triangle
{
    public static void main(String args[])
    {
        double a = 4.0, b = 5.0, c = 6.0;
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of the triangle = " + area);
    }
}