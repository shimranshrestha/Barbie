package Week7;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double accountBalance;
    
    BankAccount(int accountNumber, String accountHolderName, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }
    
    void deposit(double amount){
        accountBalance = accountBalance + amount;
        System.out.println("You have sucessfully deposited Rs: "+ amount + " for account " + accountHolderName);
    }
    
    void withdraw(double amount){
        if (amount <= accountBalance){
            accountBalance = accountBalance - amount;
            System.out.println("You have sucessfully withdrew Rs: "+ amount + " from account " + accountHolderName);
        }
    }
    
    void displayBalance(){
        System.out.println("The Balance for your account " + accountHolderName + " is: " + accountBalance);
    }
}
    
    