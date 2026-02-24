package Week16;


/**
 * Write a description of class q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class q6
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string");
        String str = input.next();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = str.length(); i >= 0; i--){
            sb.append(str.charAt(i));
        }
        
        System.out.println("Reversed String: "+sb.toString());
        
        if(str.equals(sb.toString())){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}