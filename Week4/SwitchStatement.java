package Week4;
import java.util.Scanner;
public class SwitchStatement
{

public static void main (String[] args){
    
Scanner input= new Scanner (System. in);
System.out.println("Enter your markprice: "); 
float mp= input.nextFloat();
System.out.println("Enter your category: "); 
char cat= input.next().charAt(0);
double sp;

switch (cat){
    
case 'A':
sp=mp-(mp * 0.6) ;
System.out.println("The selling price is:" +sp);
break;

case 'B':
    sp=mp-(mp * 0.4) ;
System.out.println("The selling price is:" +sp);
break;

case 'C':
    sp=mp-(mp * 0.2) ;
System.out.println("The selling price is:" +sp);
break;

case 'D':
    sp=mp-(mp * 0.1) ;
System.out.println("The selling price is:" +sp);
break;

default:
    System.out.println("Selling price:" +mp);
 }
 }
}

