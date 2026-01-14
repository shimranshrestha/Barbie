package Week10;


/**
 * Write a description of class A here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp
{
   public static void main (String[] args)
   {
       Doctor d1 = new Doctor(101, "Catherine McBroom", "Physician", 5000);
       System.out.println(d1.toString());
       System.out.println("Salary: "+d1.calculatesalary());
        
       Nurse n1 = new Nurse(201, "Sally Fisher", "Morning", 2500);
        
       System.out.println(n1.toString());
       System.out.println("Salary: "+n1.calculatesalary());
   }
}