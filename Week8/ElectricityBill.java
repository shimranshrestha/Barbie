package Week8;


/**
 * Write a description of class five here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill
{
    private String consumerName;
    private double unitsConsumed;
    double bill;
    double total;
    public ElectricityBill(String consumerName, double unitsConsumed){
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }
    public void setUnits(double unitsConsumed){
        this.unitsConsumed = unitsConsumed;
    }
    public double getUnits(){
        return this.unitsConsumed;
    }
    public double calculateBill(){
        if(unitsConsumed < 100){
        bill = unitsConsumed * 5;
        }
        else if(unitsConsumed > 100){
        bill = unitsConsumed * 5 + ((unitsConsumed - 100) * 8);
        }
        return bill;
    }
    public void display(){
        System.out.println("Name: "+this.consumerName);
        System.out.println("Units Consumed: "+this.unitsConsumed);
        System.out.println("Unit Bill: "+bill);
    }
}