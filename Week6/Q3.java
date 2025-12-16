package Week6;


/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Q3
{
    public static void main(String[] args){
        String[] name= {"Saroj", "Sushant", "Ujjwal", "Rabina", "Sandesh"};
        for (int i=0;  i< name.length; i++)
        {
            System.out.println(name[i]);
        }
        
        System.out.println(name[2]);
        
        name[4]="Barbie";
        System.out.println(name[4]);
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the index you wnt to update");
        int i= input.nextInt();
        System.out.println("Enter your name");
        String n= input.next();
        name[i]=n;
        System.out.println(name[i]);
        
    }
        
    }