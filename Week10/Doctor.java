package Week10;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends Person
{
    private String specialization;
    private double consultationfee;
    
    public Doctor(int id, String name, String specialization, double consultationfee)
    {
        super(id, name);
        this.specialization=specialization;
        this.consultationfee= consultationfee;
    }
    
    @Override
    public double calculatesalary()
    {
        return super.calculatesalary()+consultationfee;
    }
    
    public double calculatesalary(int emergencycases){
        return this.calculatesalary()+ (emergencycases * 500);
    }
    
     @Override
    public String toString()
    {
        return "Person details--> person Id:"+getid() + ", person name: "+ getname();
    }
}