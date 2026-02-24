package Week16;


/**
 * Write a description of class q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Q5
{
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string");
        String str1 = sc.nextLine();
        System.out.println("Enter another string");
        String str2 = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        
        System.out.println(sb.append(str1).append(" ").append(str2).append(" #1"));
    }
}