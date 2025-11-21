package Week2;


import java.util.Scanner;
public class WaterLevel{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter tthe watter level in liters");
        int level=input.nextInt();
        String isValid=(level>=1000) ? "WARNING: Water level has reached 1000l or more!" : "Status: Normal";
        System.out.println(isValid);
        
    }
}
    