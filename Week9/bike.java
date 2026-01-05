package Week9;


/**
 * Write a description of class Bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bike extends vehicle
{
    private int enginecapacity;
    
    public bike(int vehicleID, String brandname, double baseprice, int enginecapacity)
    {
        super(vehicleID, brandname,baseprice);
        this.enginecapacity=enginecapacity;
    }

    double calculatefinalprice()
    {
        return baseprice + calculatetax();
    }
}