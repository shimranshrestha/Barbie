package Week4;


/**
 * Write a description of class GradeConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GradeConversion
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your GPA");
        float gpa = sc.nextFloat();
        if( gpa>=0.0 && gpa<=4.0){
            System.out.println(" The GPA is valid ");
            if( gpa>=0.0 && gpa<2.0){
                System.out.println(" FAIL ");
                
            }
            else if(gpa>=2.0 && gpa<2.4){
                System.out.println(" Your answer is C ");
            }
             else if(gpa>=2.4 && gpa<2.8){
                System.out.println(" Your answer is B");
            }
               else if(gpa>=2.0 && gpa<3.2){
                System.out.println(" Your answer is B+");
            }
               else if(gpa>=3.2 && gpa<3.6){
                System.out.println(" Your answer is A");
            }
               else if(gpa>=3.6 && gpa<4.0){
                System.out.println(" Your answer is A+");
            }
            
            }
            else{
                System.out.print(" The GPA is not valid ");
            }
        
    }
}