
package Week4;


/**
 * Write a description of class EvenOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        
        
    }
}
