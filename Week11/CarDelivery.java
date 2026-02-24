package Week11;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends Delivery implements Notifications
{
    private static final double PER_KM_CHARGE = 10;
    private static final double MIN_PER_KM = 5;
    
    public CarDelivery(int orderId, double distanceInKm, String pickUp, String dropOff){
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
    
    @Override
    public void notify(String message)
    {
        System.out.println("Order placed");
    }
    
    public void display(){
        System.out.println("Charge: "+this.calculateCharge());
    }
}