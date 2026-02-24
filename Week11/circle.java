package Week11;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class circle extends shape implements drawable
{
    private int radius;
    
    public circle(int radius)
    {
        this.radius=radius;
    }
    
    public int getradius()
    {
        return this.radius;
    }
    
    public void setradius()
    {
        this.radius=radius;
    }
    
    @Override
    public double calculateArea()
    {
        return 2 * 3.14 * (radius*radius);
    }
    
    @Override
    public double calculatePerimeter()
    {
        return 2 * 3.14 * radius;
    }
    
    @Override
    public void draw()
    {
        System.out.println("Circle");
    }

}
