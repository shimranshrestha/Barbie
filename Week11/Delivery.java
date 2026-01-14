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
    private double  distanceInKm;
    private String pickUpLocation;
    private String dropOffLocation;
    
    public Delivery (int orderId, double distanceInKm, String pickUp, String dropOff)
    {
        this.orderId= orderId;
        this.distanceInKm= distanceInKm;
        this.pickUpLocation= pickUp;
        this.dropOffLocation= dropOff;
    }

    public int getOrderId()
        {
            return this.orderId;
        }
        
    public double getDistance()
        {
            return this.distanceInKm;
        }
    
    public String getpickUpLocation()
    {
        return this.pickUpLocation;
    }
        
    public String getdropOffLocation()
    {
        return this.dropOffLocation;
    }
    
    //CHARGE+TIME
    abstract  double calculatecharge();
    abstract double estimatetime();
    }
    
    