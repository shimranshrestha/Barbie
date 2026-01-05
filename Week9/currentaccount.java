package Week9;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class currentaccount extends bankaccount
{
    private double overdraftlimit;
    public currentaccount(int accno, String name, double balance, double overdraftlimit){
        super(accno, name, balance);
        this.overdraftlimit = overdraftlimit;
    }
    
    boolean withdraw(double amount){
        if (amount <= balance + overdraftlimit){
            balance = balance - amount;
            System.out.println("Withdrawn Amount: "+amount);
            return true;
        }
        else{
            System.out.println("Withdrawl failed");
            return false;
        }
    }

}