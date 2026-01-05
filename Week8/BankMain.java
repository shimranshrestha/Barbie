package Week8;


/**
 * Write a description of class BankAccMaiin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class BankMain
{
    public static void main(String[] args){
    BankAccount2 b1 = new BankAccount2(101, 20000, "Himanshi");
    b1.deposit(3000);
    boolean success = b1.withdraw(2000);
    if(success)
    {
    System.out.println("Withdrawl successful");
    }
    else{
    System.out.println("withdrawl failed");
    }
    }
}