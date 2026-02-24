package Week11;


/**
 * Write a description of class Delivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Delivery
{
    private int orderId;
    private double distanceInKm;
    private String pickUpLocation;
    private String dropOffLocation;
    
    public Delivery(int orderId, double distanceInKm, String pickUp, String dropOff)
    {
        this.orderId = orderId;
        this.distanceInKm = distanceInKm;
        this.pickUpLocation = pickUp;
        this.dropOffLocation = dropOff;
    }
    
    public int getOrderId(){
        return this.orderId;
    }
    
    public void setOrderId(){
        this.orderId = orderId;
    }
    
    public double getDistance(){
        return this.distanceInKm;
    }
    
    public void setDistance(){
        this.distanceInKm = distanceInKm;
    }
    
    public String getPickUp(){
        return this.pickUpLocation;
    }
    
    public void setPickUp(String pickUp){
        this.pickUpLocation = pickUp;
    }
    
    public String getDropOff(){
        return this.dropOffLocation;
    }
     
   public void setDropOff(String dropOff){
        this.dropOffLocation = dropOff;
    }
    
    //charge + itme
    //abstract methods
    
    abstract double calculateCharge();
    abstract double estimateTime();
}