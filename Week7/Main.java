package Week7;


/**
 * Write a description of class m here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class Main{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount(1, "Shimran Shrestha", 100000.0);
        BankAccount account2 = new BankAccount(1, "Himanshi Bhandari", 50000.0);
        
        account1.deposit(50000);
        account1.withdraw(100000);
        account1.displayBalance();
        
        account2.deposit(25000);
        account2.withdraw(50000);
        account2.displayBalance();
    }
}