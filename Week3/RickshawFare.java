package Week3;
import java.util.Scanner;

public class RickshawFare{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double baseFare = 50.0;
        double perKmRate = 20.0;
        double perMinRate = 15.0; 
        double totalFare;
        
        System.out.print("Enter distance in kilometers: ");
        double distance = input.nextDouble();
        System.out.println("Your total distance is: " + distance);

        System.out.print("Enter time in minutes: ");
        double time = input.nextDouble();
        System.out.println("Your total time is: " + time);
        
        System.out.print("Are you a local? (yes/no): ");
        String userLocal = input.next();
        double localDiscount = userLocal.equalsIgnoreCase("yes") ? 0.10 : 0.0;

        System.out.print("Is it night time? (yes/no): ");
        String userNight = input.next();
        double nightCharge = userNight.equalsIgnoreCase("yes") ? 100.0 : 0.0;
        
        totalFare = baseFare + (distance * perKmRate) + (time * perMinRate);
        totalFare = totalFare - (totalFare * localDiscount);
        totalFare = totalFare + nightCharge;
        
        System.out.println("===============================");
        System.out.println("||" + "Your Total Fare is: Rs." + totalFare + "||");
        System.out.println("===============================");
    }
}
    
        