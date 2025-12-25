
package Week4;


/**
 * Write a description of class AdditionalQuestion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AdditionalQuestion
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter paper size: " );
        String s= sc.next();
        
        switch (s){
            case "A0":
                System.out.println("A0: 841 x 1189 mm (33.1 x 46.8 inches");
                break;
            case "A1":
                System.out.println("A0: 594 x 841 mm (23.4 x 33.1 inches");
                break;
            case "A2":
                System.out.println("A0: 420 x 594 mm (16.5 x 23.4inches");
                break;
            case "A3":
                System.out.println("A0: 297 x 420 mm (11.7 x 16.5 inches");
                break;
            case "A4":
                System.out.println("A0: 210 x 297 mm (8.3)");
                break;
             case "A5":
                System.out.println("A0: 148 x 219 mm (5.8)");
                break;
                
            default:
                System.out.println("Invalid size");
        }
    }
}
