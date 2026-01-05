package Week9;


/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class vehicle
{
    protected int vehicleID;
    protected String brandname;
    protected double baseprice;
    protected double tax;
    public vehicle(int vehicleID, String brandname, double baseprice)
    {
        this.vehicleID=vehicleID;
        this.brandname=brandname;
        this.baseprice=baseprice;
    }
    void displayvehicleinfo()
    {
        System.out.println("Vehicle ID:" +this.vehicleID);
        System.out.println("Brand name:" +this.brandname);
        System.out.println("Base price:" +this.baseprice);
    }
    double calculatetax()
    {
        double tax = 0.1*baseprice;
        return tax;
    }
    
}