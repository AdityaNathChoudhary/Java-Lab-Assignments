import java.lang.*;

class VolumeOfFigures
{
    public static void main(String args[])
    {
        double len = 4.0, br = 3.0, ht = 2.0;

        double rectangle = len * br * ht;
        double cube = len * len * len;
        double square = len * len;

        System.out.println("Volume of rectangle : " + rectangle);
        System.out.println("Volume of cube : " + cube);
        System.out.println("Area of a square : " + square);
    }
}