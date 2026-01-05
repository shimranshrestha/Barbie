package Week8;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class employee
{
    private double basicsalary;
    private double grosssal;
    public employee (double basicsalary){
        this.basicsalary=basicsalary;
    }
    public void setbasicsalary(double basicsalary){
    
        this.basicsalary = basicsalary;
    }
    
    public double getbasicsalary()
    {
    
        return this.basicsalary;
    }
    public double grosssalary(){
        grosssal= basicsalary + 0.2 * basicsalary;
        
        return grosssal;
    }
    public void display(){
    System.out.println("Salary: "+this.basicsalary);
    System.out.println("Gross salary: "+this.grosssal);
    }
}