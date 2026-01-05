package Week8;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student

{
    //Attributes
    private String name;
    private int id;
    private String add;
    private long phno;
    private String collegename;
    
    //constructor
    public Student(String name, int id, String add, long phno, String college)
    {
        this.name=name;
        this.id=id;
        this.add=add;
        this.phno=phno;
        this.collegename=college;
    }
    
    //Setters and Getters method
    public void setName (String name)
    {
        this.name=name;
    }
    
    public String getname()
    {
        return this.name;
    }
    //Getters amd Setters for ID aswell
    public void  setId (int id)
    {
        this.id=id;
    
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setadd(String add)
    {
        this.add = add;
    }
    
    public String getadd(){
        return this.add;
    }
    public void setphno(long phno){
    
        this.phno = phno;
    }
    
    public long getphno()
    {
    
        return this.phno;
    }
    public void setcollegename(String collegename){
    
        this.collegename = collegename;
    }
    
    public String getcollegename()
    {
    
        return this.collegename;
    }
    
    public void display(){
    System.out.println("Name: "+this.name);
    System.out.println("ID: "+this.id);
    System.out.println("Address: "+this.add);
    System.out.println("Phone no.: "+this.phno);
    System.out.println("College:" +this.collegename);
    
    }
}
