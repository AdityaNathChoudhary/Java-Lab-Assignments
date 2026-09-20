import java.util.*;

class Student {
    static String name;
    static int rollno;
    static String course;

    static void courseChoice() {
        int ch;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name : ");
        name = sc.nextLine();

        System.out.print("Enter roll no : ");
        rollno = sc.nextInt();

        System.out.println("Course choice : \n" +
                "1. Java programming \n" +
                "2. C++ programming \n" +
                "3. C programming \n" +
                "4. Python programming");

        System.out.print("Enter your choice : ");
        ch = sc.nextInt();

        switch (ch) {
            case 1:
                course = "Java programming";
                break;

            case 2:
                course = "C++ programming";
                break;

            case 3:
                course = "C programming";
                break;

            case 4:
                course = "Python programming";
                break;

            default:
                System.out.println("Wrong choice");
        }
    }

    static void display() {
        System.out.println("Name : " + name);
        System.out.println("Rollno : " + rollno);
        System.out.println("Course selected : " + course);
    }

    public static void main(String args[]) {
        courseChoice();
        display();
    }
}
