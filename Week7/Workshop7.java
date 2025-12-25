package Week7;


/**
 * Write a description of class WorkshopMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop7
{
     public static void main(String[] args) {
         Book b1= new Book();
         b1.Title= "Veriy";
         b1.Author= "Colleen Hoover";
         b1.Price= 1250;
         
        System.out.println(b1.Title);
        System.out.println(b1.Author);
        System.out.println(b1.Price);
        
        Book b2= new Book();
        b1.Title= "Harry Potter";
        b1.Author= "J. K. Rowling";
        b1.Price= 1400;
        
        System.out.println(b1.Title);
        System.out.println(b1.Author);
        System.out.println(b1.Price);
    
        
        //Q2
        
        
        Rectangle r1= new Rectangle();
        r1.length=6;
        r1.breadth=8;
        
        System.out.println(r1.length);
        System.out.println(r1.breadth);
        r1.area();
        
        Rectangle r2= new Rectangle();
        r2.length=10;
        r2.breadth=12;
        r2.area();
        
        System.out.println(r2.length);
        System.out.println(r2.breadth);

        
        //Q3
        
        
        Employee e1= new Employee();
        e1.id= "np014sp10";
        e1.name= "Shimran";
        e1.salary= 82000000;
        
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.salary);
        
        Employee e2= new Employee();
        e2.id= "np012sp80";
        e2.name= "Aditya";
        e2.salary= 96000000;
        
        System.out.println(e2.id);
        System.out.println(e2.name);
        System.out.println(e2.salary);
        
        Employee e3= new Employee();
        e3.id= "np010sp80";
        e3.name= "Himanshi";
        e3.salary= 54000000;
        
        System.out.println(e3.id);
        System.out.println(e3.name);
        System.out.println(e3.salary);
        
        if(e1.salary>e2.salary && e1.salary>e2.salary)
       {
       System.out.println("Shimran's salary is highest");
       }
       else if(e2.salary>e1.salary && e2.salary>e3.salary)
       {
           System.out.println("Aditya's salary is highest");
       }
       else
       {
           System.out.println("Himanshi's salary is highest");
       }
       
       
       //Q4
       
       Laptop l1= new Laptop("Apple", 16, 264999 );
       Laptop l2= new Laptop("Dell", 8, 54000 );
       Laptop l3= new Laptop("ASUS", 4, 45000 );
       
       l1.displaydetails();
       l2.displaydetails();
       l3.displaydetails();
       
       Mobile m1= new Mobile("Apple", 264999 );
       Mobile m2= new Mobile("Samsung" , 54000 );
       Mobile m3= new Mobile("Xiomi", 45000 );
       
       m1.isAffordable();
       m2.isAffordable();
       m3.isAffordable();
       
       
       result o1 = new result(30,85,60);
       result o2 = new result(85,70,57);
        
        o1.total();
        o2.total();
       
       
       
       
       
       
       
       
        
        
        
        
        
    
        
        
       
        
        
        
     }
}