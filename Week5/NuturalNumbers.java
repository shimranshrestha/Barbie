package Week5;


/**
 * Write a description of class ghl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NuturalNumbers
{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Ask for n number: ");
        int n = input.nextInt();
        
        int sum=0;
        for (int i=1; i <= n; i++)
         {
             sum= sum+i;
             System.out.println(sum);
         }
         System.out.println("TTotal sum: "+ sum);
    }
    
}