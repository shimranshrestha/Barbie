package Week3;


/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[] args){
    int a=10;
    int b =8;
    //Arthematic operator
    
    int sum= a+b;
    int sub= a-b;
    int mul= a*b;
    int div= a/b;
    
    System.out.println("Addition= "+sum);
    System.out.println("Difference= "+sub);
    System.out.println("Prooduct= "+mul);
    System.out.println("Division= "+div);
    
    //Unary operator
    
    System.out.println(a++);
    System.out.println(++a);
    
    //Relational operator
    
    int s=20;
    int r=25;
    
    System.out.println(s==r);
    System.out.println(s!=r);
    System.out.println(s>r);
    System.out.println(s<r);
    
    //Ternary operator
    
    String isValid =(a>b) ? "A is greater than B" : "B is greater than A";
    System.out.println(isValid);
    
    //Logical operator
    System.out.println(a>b && a !=b);
    
    
    
    
    
    
    
    
    
    
    
    
}}