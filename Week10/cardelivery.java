package Week10;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cardelivery extends deliverypartner
{
    public cardelivery(int partnerid, String name, int basepay){
        super(partnerid, name, basepay);
    }
    
    @Override
    public double calculatepayment()
    {
        return super.calculatepayment() +7000;
    }
    public double calculatepayment(int extraorders)
    {
        return super.calculatepayment() + (extraorders *300);
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }    
}