package Week8;


/**
 * Write a description of class three here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount2
{
    private int accountNumber;
    private double balance;
    private String name;
    
    public BankAccount2(int accountNumber, double balance, String name)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
    }
    
    public void setbalance (double balance)
    {
        this.balance=balance;
    }
    
     public double getbalance()
    {
        return this.balance;
    }
    
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("You have sucessfully deposited Rs: "+ amount + " for account " + accountNumber);
    
    }
    
    public boolean withdraw(double amount){
        if(balance>=amount){
            System.out.println("Withdraw successful");
            balance = balance - amount;
            return true;
        }
         return false;
        
    }
    
}