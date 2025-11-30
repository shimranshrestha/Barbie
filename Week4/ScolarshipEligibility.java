package Week4;


/**
 * Write a description of class ScolarshipEligibility here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ScolarshipEligibility
{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your GPA: " );
        float gpa = sc.nextFloat();
        System.out.println("Enter your atttendance: ");
        int a = sc.nextInt();
        System.out.println("Enter your attitude score: ");
        int att = sc.nextInt();
        
         if( gpa>=3.2 && gpa<=4.0){
             if(a>80){
              if(att<5){
                  System.out.println("The student is eligible for scolarship");
                }
                else{
                    System.out.println("The student is not eligible for scolarship");
                }
            }
            else{
                System.out.println("The student is eligible for scolarship");
            }
        }
        else{
            System.out.println("The student is eligible for scolarship");
        }
    }
        
}