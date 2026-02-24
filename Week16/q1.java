package Week16;
import java.util.Scanner;


/**
 * Write a description of class s here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q1
{
public static void main(String []args)
    {
      String first;
      String second;
      String third;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first word");
      first= sc.nextLine();
      System.out.println("Enter the second word");
      second= sc.nextLine();
      System.out.println("Enter the third word");
      third= sc.nextLine();
      String conc=first.concat(second);
      System.out.println(conc.equals(conc));
    }
}
    

