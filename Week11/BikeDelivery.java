package Week11;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BikeDelivery extends Delivery
{
    private static final double PER_KM_CHARGE = 50;
    private static final double MIN_PER_KM = 5;
    
    public BikeDelivery(int orderId, double distanceInKm, String pickUp, String dropOff){
        super(orderId, distanceInKm, pickUp, dropOff);
    }
    
    @Override 
    public double calculateCharge()
    {
        return super.getDistance() * PER_KM_CHARGE;
    }
    
    @Override
    public double estimateTime(){
        return super.getDistance() * MIN_PER_KM;
    }
}