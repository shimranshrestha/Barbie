package Week11;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rectangle extends shape implements drawable
{
    private int length;
    private int breadth;
    
    public rectangle(int length, int breadth)
    {
        this.length= length;
        this.breadth=breadth;
    }
    
    public int gethlength()
    {
        return this.length;
    }
    
    public void setlength()
    {
        this.length=length;
    }
    
    public int getbreadth()
    {
        return this.breadth;
    }
    
    public void setbreadth()
    {
        this.breadth=breadth;
    }
    
    @Override
    public double calculateArea()
    {
        return length * breadth;
    }
    @Override
    public double calculatePerimeter()
    {
        return 2 * (length * breadth);
    }
    
    @Override
    public void draw()
    {
        System.out.println("Rectangle");
    }
}