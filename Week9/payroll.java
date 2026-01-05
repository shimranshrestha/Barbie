package Week9;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class payroll
{
    public static void main (String[] args)
    {
        permanentemployee e1= new permanentemployee(123, "Sara", 15000, 4000, 3000);
        contractemployee ce1 = new contractemployee (201, "Jane", 250, 60);
        
        e1.displayemployee();
        System.out.println("Final Salary: "+e1.calculatetotalsalary());
        
        ce1.displayemployee();
        System.out.println("Final Salary: "+ce1.calculatetotalsalary());
    }
}