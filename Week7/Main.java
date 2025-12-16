package Week7;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) 
    {
        Student s1= new Student();
        s1.collegeId= "np014sp10";
        s1.name= "Shimran";
        s1.age= 19;
        s1.study();
        
        System.out.println(s1.collegeId);
        System.out.println(s1.name);
        System.out.println(s1.age);
        
        Student s2= new Student();
        s1.collegeId= "np026sp20";
        s1.name= "Himanshi";
        s1.age= 19;
        s1.laugh();
        
        System.out.println(s1.collegeId);
        System.out.println(s1.name);
        System.out.println(s1.age);
        
        Car c1= new Car();
        c1.color= "Pink";
        c1.model= "Shimran";
        c1.brand= "Rolls Royce";
        c1.price=200000000;
        c1.drive();
        
        System.out.println(c1.color);
        System.out.println(c1.model);
        System.out.println(c1.brand);
        System.out.println(c1.price);
        
        
        Car c2= new Car();
        c2.color= "Black";
        c2.model= "Himanshi";
        c2.brand= "Ferrarri";
        c2.price=20000000;
        c1.breaking();
        
        System.out.println(c1.color);
        System.out.println(c1.model);
        System.out.println(c1.brand);
        System.out.println(c1.price);
        
        
    }
}
        
        