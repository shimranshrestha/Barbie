package Week5;


/**
 * Write a description of class nkn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class FixedDepositNIB{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int annualRate;
        double feeRate = 0.005;
        double P;
        double monthlyRate;
        int years;
        int months;
        double A;
        double fee;
        double finalAmount;
        String wish;
        
        while (true) {
            
            System.out.print("Please enter the Annual Interest Rate Required (Minimum: 8% / Maximum: 12%): ");
            annualRate = input.nextInt();
            
            if (annualRate < 8 || annualRate > 12){
                System.out.println("Invalid Interest Rate. Please, Try again!");
                continue;
            }
            
            System.out.print("Please enter your deposit amount (Minimum: Rs.5000): ");
            P = input.nextDouble();
            
            if (P < 5000){
                System.out.println("Invalid deposit amount. Please, Try again!");
                continue;
            }
            
            System.out.print("Please enter your FD duration (Minimum: 1 Year / Maximum: 5 Years): ");
            years = input.nextInt();
            
            if (years > 5 || years < 1){
                System.out.println("Invalid duration. Please, Try again!");
                continue;
            }
            
            monthlyRate = (annualRate / 100.0) / 12;
            months = years * 12;
            
            A = P;
            for (int i = 1; i <= months; i++) {
                A = A + (A * monthlyRate);
            }

            fee = A * feeRate;
            finalAmount = A - fee;
            
            System.out.println("FD CALCULATION FOR ANNUAL INTEREST RATE: " + annualRate + "%");
            System.out.println("Monthly Rate: " + monthlyRate);
            System.out.println("Months: " + months);
            System.out.println("Your Maturity Amount before fee is: Rs. " + A);
            System.out.println("Processing Fee (0.5%): Rs. " + fee);
            System.out.println("Your Final Amount Received is: Rs. " + finalAmount);
            
            System.out.print("Do you wish to calculate again (Y/N)? :");
            input.nextLine();          
            wish = input.nextLine();
            
            if (wish.equalsIgnoreCase("N")){
                break;
            }
            
            System.out.println();
    
        }
        
    
    }
}