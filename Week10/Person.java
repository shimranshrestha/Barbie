package Week10;


/**
 * Write a description of class Peerson here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Person
{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    // getters setters
    
    public void setid(int id){
        this.id = id;
    }
    
    public int getid(){
        return this.id;
    }
    
    public void setname(String name){
        this.name = name;
    }
    
    public String getname(){
        return this.name;
    }
    
    public double calculatesalary(){
        double baseSalary = 30000;
        return baseSalary;
    }
    
    @Override
    public String toString()
    {
        return "Person details--> person Id:"+getid() + ", person name: "+ getname();
    }
}