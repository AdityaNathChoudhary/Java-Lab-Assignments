import java.lang.*;

class BMI
{
    public static void main(String args[])
    {
        double wt = 5.0;
        double ht = 6.0;
        double BMI = wt / (ht * ht);

        System.out.println("BMI index of weight " + wt +
                           " and height " + ht + " is " + BMI);
    }
}