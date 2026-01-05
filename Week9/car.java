package Week9;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

 public class car extends vehicle
{
   private int numberofdoors;
   private String fueltype;
   public car(int vehicleID,String brandname,double baseprice, int numberofdoors,String fueltype )
    {
        super(vehicleID,brandname,baseprice);
        this.numberofdoors=numberofdoors;
    }
    
   public void displaycardetails()
   {
       System.out.println("Car ID:" +super.vehicleID);
       System.out.println("Car brand name:" +super.brandname);
       System.out.println("Car base price:" +super.baseprice);
       System.out.println("No of doors:" +this.numberofdoors);
       System.out.println("Car fuel type:" +this.fueltype);
   }
   public void setnumberofdoor(){
        this.numberofdoors = numberofdoors;
    }
    
    public int getnumberofdoor(){
        return this.numberofdoors;
   }
   public void setfueltype(){
        this.fueltype = fueltype;
    }
    
   public String getfueltype(){
        return this.fueltype;
   }
   
   double calculatefinalprice()
   {
       double tax= calculatetax();
       double luxurycharge=0.05 * baseprice;
       return baseprice + tax + luxurycharge;
   }
}