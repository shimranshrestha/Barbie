package Week4;


/**
 * Write a description of class DivisibleSecond here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class DivisibleSecond
{
     public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        if (num%5==0 && num%3==0){
            System.out.println("It is divisible by both 3 and 5");
        }
        else{
            System.out.println("It is divisible by neither 3 nor 5");
        }
        }
}