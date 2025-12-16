package Week6;


/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Worrshop6
{
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);
        System.out.println("Pass me the length for an array");
        int len= input.nextInt();
        
        int[] arr1=new int[len];
        
        for(int i=0; i< arr1.length; i++)
        {
            System.out.println("Value at index:" +i);
            arr1[i]= input.nextInt();
        }
        
}
}