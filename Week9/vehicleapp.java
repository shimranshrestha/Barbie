package Week9;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class vehicleapp
{
    public static void main (String[] args)
    {
       car c1= new car(101, "Ford", 3500000, 4, "Diesel"); 
       c1.displaycardetails();
       System.out.println("Tax:" +c1.calculatetax());
       System.out.println("Final price:" +c1.calculatefinalprice());
       
       bike b1= new bike (203, "Honda", 1300000, 200);
       b1.displayvehicleinfo();
       System.out.println("Tax:"+b1.calculatetax());
       System.out.println("Final price:" +b1.calculatefinalprice());
    }
}