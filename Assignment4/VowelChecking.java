import java.util.*;
import java.util.Scanner;

class VowelChecking
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = in.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'||ch == 'u')
        {
            System.out.println("It is a vowel");
        }
        else
        {
            System.out.println("It is a consonant");
        }
    }
}
