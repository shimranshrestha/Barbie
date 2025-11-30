package Week4;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = input.nextDouble();

        System.out.println("Your Income is: NPR " + income);

        double tax = 0;
        double remaining = income;



        if (remaining > 500000) {
            tax = tax + (500000 * 0.01);
            remaining = remaining - 500000;
        } else {
            tax = tax + (remaining * 0.01);
            remaining = 0;
        }

        
        if (remaining > 0) {
            if (remaining > 200000) {
                tax = tax + (200000 * 0.10);
                remaining = remaining - 200000;
            } else {
                tax = tax + (remaining * 0.10);
                remaining = 0;
            }
        }


        if (remaining > 0) {
            if (remaining > 300000) {
                tax = tax + (300000 * 0.20);
                remaining = remaining - 300000;
            } else {
                tax = tax + (remaining * 0.20);
                remaining = 0;
            }
        }


        if (remaining > 0) {
            if (remaining > 1000000) {
                tax = tax + (1000000 * 0.30);
                remaining = remaining - 1000000;
            } else {
                tax = tax + (remaining * 0.30);
                remaining = 0;
            }
        }


        if (remaining > 0) {
            if (remaining > 3000000) {
                tax = tax + (3000000 * 0.36);
                remaining = remaining - 3000000;
            } else {
                tax = tax + (remaining * 0.36);
                remaining = 0;
            }
        }

       
        if (remaining > 0) {
            tax = tax + (remaining * 0.39);
        }

        System.out.println("Your Total Tax is: NPR " + tax);
    }
}
