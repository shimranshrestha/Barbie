package Week11;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends Delivery
{
    private static final double per_km_charge= 60;
    private static final double min_per_km= 5;
    public CarDelivery(int  orderId, double distanceInKm, String pickUp, String dropOff)
    {
        super(orderId, distanceInKm, pickUp, dropOff);
    }
    @Override
    public double calculatecharge()
    {
        return super.getDistance()+per_km_charge;
    }
    @Override
    public double estimatetime()
    {
      return super.getDistance()+min_per_km;    
    }
    
    public void display()
    {
        System.out.println("Charge:" + this.calculatecharge());
    }
}