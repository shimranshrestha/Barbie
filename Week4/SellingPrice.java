package Week4;


/**
 * Write a description of class SellingPrice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SellingPrice
{
    public static void main(String[] args){
        float discount;
        float sellingP;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your category");
        char category= sc.next().charAt(0);
        System.out.println("Enter your marked price");
        float markP=sc.nextFloat();
        
        if(category == 'A'){
        discount= 0.6F;
        }
         
        else if(category == 'B'){
        discount= 0.4F;
        }
         
        else if(category == 'C'){
        discount= 0.2F;
        }
         
        else{
        discount= 0.1F;
        }
         sellingP=markP-(markP*discount);
         System.out.println("Seelling Price is: " + sellingP);
        
        }   
    }
