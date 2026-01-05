package Week9;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class savingaccount extends bankaccount
{
    private double interestrate;
    
    public savingaccount(int accno,String name,double balance, double interestrate )
    {
        super(accno,name,balance);
        this.interestrate= interestrate;
    }
    double calculateinterest()
    {
        double interest = super.getbalance() * interestrate / 100;
        return interest;
    }
    
}