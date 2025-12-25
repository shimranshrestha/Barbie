package Week7;


/**
 * Write a description of class Laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Laptop{

       String Brand;
       int RAM;
       int Price;
       
       //constructors--> used to initialize the objects
       
       public Laptop(String brand, int ram, int price)
       {
           this.Brand=brand;
           this.RAM=ram;
           this.Price=price;
       }
   
    
    void displaydetails(){
        if(this.RAM>8){
            System.out.println(this.Brand);
            System.out.println(this.RAM);
            System.out.println(this.Price);
        }
    }
}
