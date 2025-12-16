package Week6;


/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Q4
{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] grades = {10, 20, 30, 40, 50};
        for (int i = 0; i < grades.length; i++) {
        
        System.out.println(grades[i]);
    }
        int sum = 0;
         for (int i = 0; i < grades.length; i++) {
             sum=  sum+ grades[i];
            }
            
            System.out.println(sum);
            double avg= sum/5;
            int high=grades[0];
            int low=grades[0];
             for (int j= 1; j < grades.length; j++) {
             if(grades[j]>high){
                high=grades[j];
            }
            if(grades[j]<low){
                low=grades[j];
            }
        }
        
        System.out.println("Highest="+high);
        System.out.println("Lowest="+low);
        
        System.out.println("Enteer your index length");
        int len= input.nextInt();
        
        int[] arr1= new int[len];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter yourr score");
            arr1[i]= input.nextInt();
        }
    }
}
        
        
        
            
            
            
            
            
            
            
          
        

        