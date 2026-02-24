package Week12;
import java.util.ArrayList;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class student
{
    private String name;
    private long phone;
    private String group;
    
    public student(String name, long phone, String group)
    {
        this.name=name;
        this.phone=phone;
        this.group=group;
    }
    
    public void setname()
    {
        this.name=name;
    }
    
    public String getname()
    {
        return this.name;
    }
    
    public void setphone()
    {
        this.phone=phone;
    }
    
    public long getphone()
    {
        return this.phone;
    }
    
    public void setgroup()
    {
        this.group=group;
    }
    
    public String getgroup()
    {
        return this.group;
    }
}
