package Week10;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sciencestudent extends student
{
    public sciencestudent(int rollno, String name, double marks)
    {
        super(rollno, name, marks);
    }
    
    @Override
    public String calculateresult()
    {
        if(getmarks()<45)
        {
            return "Fail";
        }
        else
        {
            return "Pass";
        }
    }
    
    public String calculateresult(int gracemarks)
    {
        if((getmarks() + gracemarks)<45)
        {
            return "Fail";
        }
        else
        {
            return "Pass";
        }
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }    
}