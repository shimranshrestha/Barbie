package Week9;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bankaccount
{
    protected int accno;
    protected String name;
    protected double balance;
    
    public bankaccount(int accno, String name, double balance)
    {
       this.accno= accno;
       this.name= name;
       this.balance= balance;
    }
    
    void deposit(double amount)
    {
        if(amount>0)
        {
            balance=balance+amount;
            System.out.println("Deposit Amount:"+amount);
        }
    }
    double getbalance()
    {
        return balance;
    }
}