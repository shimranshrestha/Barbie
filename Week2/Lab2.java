package Week2;

import java.util.Scanner;
public class Lab2{
    public static void main(String[] args){
        //int age;// declaring the variable
        //age=10// assigning the variale
         // declaring and assigning
        // Scanner class
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int firstNum=input.nextInt();
        System.out.println("Enter second Number: ");
        double secondNum=input.nextDouble();
        System.out.println("My first number is:"+ firstNum);
        System.out.println("My second number is:"+ secondNum);
        
        //Post and Pre increament operator
        
        int h=1;
        int j= ++h;
        int k= h++;
        
        System.out.println(h + j + k);
        
        // Ternery 0perattor
        
        int age= 18;
        String isValid=(age>=18) ?"Driving is allowed" : "Driving is not allowed";
        System.out.println(isValid);
        
        
        
        
    }
}