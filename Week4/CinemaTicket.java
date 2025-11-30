package Week4;


import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price = 0;

        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        if (age < 17) {
            price = 150;
        } 
        else if (age < 29)  {
            price = 250;
        } 
        else {
            price = 200;
        } 
        System.out.println("Please enter movie language (NEPALI/HINDI/ENGLISH) : ");
        String language = input.nextLine();

        if (language.equals("hindi")) {
            price = price + 50;
        } 
        else if (language.equals("english")) {
            price = price + 100;
        }


        
        System.out.println("Are you a student? (Y/N): ");
        String student = input.nextLine();

        if (student.equals("y")) {
            price = price - (price * 0.20);  
        }


        System.out.println("Is today a festival day? (Y/N): ");
        String festival = input.nextLine();
          if (festival.equals("y")) {
            price = price - (price * 0.15);  
        }


        System.out.println("------------------------------------");
        System.out.println("Your Ticket Price is: Rs. " + price);
        System.out.println("------------------------------------");
    }
}
