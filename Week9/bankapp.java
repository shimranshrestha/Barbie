package Week9;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bankapp
{
    public static void main (String[] args)
    {
        savingaccount  sa = new savingaccount(101, "John", 50000, 5);
        currentaccount ca = new currentaccount(201, "Jane", 40000, 10000);
        
        sa.deposit(5000);
        System.out.println("Balance: "+sa.getbalance());
        System.out.println("Interest: "+sa.calculateinterest());
        
        ca.deposit(4000);
        ca.withdraw(35000);
        System.out.println("Balance: "+ca.getbalance());
    }
}
