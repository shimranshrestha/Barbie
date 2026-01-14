package Week10;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class deliverypartner
{
    private int partnerid;
    private String name;
    private int basepay;
    
    public deliverypartner(int partnerid, String name, int basepay){
        this.partnerid = partnerid;
        this.name = name;
        this.basepay = basepay;
    }
    
    public void setpartnerid(int partnerid){
        this.partnerid = partnerid;
    }
    
    public int getpartnerid(){
        return this.partnerid;
    }
    
    public void setname(String name){
        this.name = name;
    }
    
    public String getname(){
        return this.name;
    }
    
    public void setbasepay(int basepay){
        this.basepay = basepay;
    }
    
    public int getbasepay(){
        return this.basepay;
    }
    public double calculatepayment()
    {
        return basepay;
    }
    
    @Override
    public String toString()
    {
        return "Partner details--> PartnerId:"+getpartnerid() + ", Partner name: "+ getname() + "Base Pay:" +getbasepay();
    }
}