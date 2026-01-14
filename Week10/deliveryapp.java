package Week10;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class deliveryapp
{
    public static void main(String[] args){
        bikedelivery b1 = new bikedelivery(101, "Holly Fisher", 8000);
        System.out.println(b1.toString());
        System.out.println("Salary: "+b1.calculatepayment());
        
        cardelivery c1 = new cardelivery(201, "Millie brown", 10000);
        System.out.println(c1.toString());
        System.out.println("Salary: "+c1.calculatepayment());
        
    }

}