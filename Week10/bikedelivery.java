package Week10;


/**
 * Write a description of class b here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bikedelivery extends deliverypartner
{
    public bikedelivery(int partnerid, String name, int basepay){
        super(partnerid, name, basepay);
    }
    
    @Override
    public double calculatepayment()
    {
        return super.calculatepayment() +3000;
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