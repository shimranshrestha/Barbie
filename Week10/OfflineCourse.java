package Week10;


/**
 * Write a description of class OfflineCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OfflineCourse extends Course
{
    private double labbFee;
    
    public OfflineCourse(int courseId, String courseName, double baseFee, double labFee)
    {
        super(courseId, courseName, baseFee);
        this.labbFee=labbFee;
    }
    
    @Override
    public double calculateFee()
    {
        return super.getBaseFee()+ this.labFee;
    }
}