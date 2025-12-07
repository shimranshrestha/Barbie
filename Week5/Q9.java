package Week5;


/**
 * Write a description of class nxj here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Q9 {
    
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        int n=0;
        int r= 0;
        
        System.out.print("Enter a number:");
        n = sc.nextInt();

        while(n> 0) {
            
            
            int digit = n % 10;
            r = (r*10) +digit;
            n = n/10;
            
        }

        System.out.println("Reversed number = " + r);
    }
}