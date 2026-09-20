import java.util.*;

class Area
{
    static int rectangleArea(int length, int breadth)
    {
        return length * breadth;
    }

    int squareArea(int side)
    {
        return side * side;
    }

    public static void main(String[] args)
    {
        int length, breadth, side;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length");
        length = sc.nextInt();

        System.out.println("Enter breadth:");
        breadth = sc.nextInt();

        System.out.println("Enter side :");
        side = sc.nextInt();

        Area obj = new Area();

        int rectangle = Area.rectangleArea(length, breadth);
        int square = obj.squareArea(side);

        System.out.println("Area of rectangle = " + rectangle);
        System.out.println("Area of square = " + square);
    }
}
