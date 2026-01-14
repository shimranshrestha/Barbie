package Week10;


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
        savingaccount sv1 = new savingaccount(12300, "Shimran", 20000);
        System.out.println(sv1.toString());
        System.out.println("Interest "+sv1.calculateinterest());
        
        currentaccount cu1 = new currentaccount(23455, "Himanshi", 10000);
        System.out.println(cu1.toString());
        System.out.println("Interest "+cu1.calculateinterest());
    }
}