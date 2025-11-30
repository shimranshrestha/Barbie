package Week4;


/**
 * Write a description of class Divisile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Divisible
{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        if (num%5==0){
            if(num%3==0){
            System.out.println( "Divisible by both");
            }
            else{
                System.out.println("Disvisible by 5");
            }
        }
            else if(num%3==0){
                System.out.println("Divisible by 3");
            }
            
else{
System.out.println("Not divisible by both");
} 

}

}