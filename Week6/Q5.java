package Week6;


/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Q5
{
    public static void main(String[] args){
        String[] dis= {"Morrang", "Kathamndu", "Kaski", "Sinddhuli"};
        for(int i=0; i<dis.length; i++){
            
            System.out.println(i+1 + "." +dis[i]);
        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("Entr your index length");
        int len= input.nextInt();
        
        String[] arr1= new String[len];
         for(int i=0; i<arr1.length; i++){
             System.out.println("Entr your districts");
             arr1[i]= input.next();
             
            }
            
            System.out.print("New values");
            for (int l=0; l < arr1.length; l++)
            {
                System.out.println(arr1[l]);
            }
        
        
}

}