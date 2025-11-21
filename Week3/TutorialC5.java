package Week3;


/**
 * Write a description of class HYFK here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TutorialC5
{
    int qty; //instance variable
    static int rrt; // static variable
    
    public static void main(String[] args){
        int age=19; //local variable
        System.out.println(age);
        System.out.println(TutorialC5.rrt);
        
        //Implicit Typecasting
        double dtr=age;
        System.out.println(dtr);
        
        //Explicit Typecasting
        double db=10.09;
        int itr=(int)db;
        System.out.println(itr);
        
        //Exeptions in arthmetic
        byte b1=10;
        byte b2=11;
        byte sum=(byte)(b1+b2);
        
        //short,char
        
        
        //Minimum,maximum,size,bytes
        System.out.println(Byte.MAX_VALUE);//maximum value
        System.out.println(Byte.MIN_VALUE);//minimum value
        System.out.println(Byte.SIZE);//bits
        System.out.println(Byte.BYTES);//bytes
        
        //Escape Sequence
        System.out.println("Hello\nWorld");
        System.out.println("Hamro\tNepal");
        System.out.println("She said\"Hi \" ");
        
        //Unicode Escape Sequence
        System.out.println("\u2764");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}