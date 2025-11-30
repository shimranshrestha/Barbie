package Week4;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade");
        int grade = sc.nextInt();
        if(grade>=40)
        {
            System.out.println("Student has passed.");
        }
        else
        {
            System.out.println("Student has failed.");
            
        }
            
        
    
    }
}