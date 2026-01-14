package Week11;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class deliveryapp
{
    public static void main(String[] args)
    {
        //int  orderid, double distanceinkm, String pickup, String dropoff)
        //parent-child reference object-->dynamic method dispatch
        Delivery d1= new CarDelivery(101, 12,"rnac", "lagankhel");
        d1.display();
    }
}