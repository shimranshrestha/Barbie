package Week10;


/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    private int courseId;
    private String courseName;
    private double baseFee;
    
    public Course(int courseId, String courseName, double baseFee)
    {
        this.courseId= courseId;
        this.courseName= courseName;
        this.baseFee= baseFee;
    }
    
    //getter setter
    
    public void setCourseId(int newId)
    {
        this.courseId= newId;
    }
    
    public int getCourseId()
    {
        return this.courseId;
    }
    
    public void setCourseName(String courseName)
    {
        this.courseName= courseName;
    }
    
    public String getCourseName()
    {
        return this.courseName;
    }
    
        public void setBaseFee(double baseFee)
    {
        this.baseFee= baseFee;
    }
    
      public double getBaseFee()
    {
        return this.baseFee;
    }
    
    public double calculateFee()
    {
        return this.baseFee;
    }
    
    public void displayCourse()
    {
        System.out.println("Course ID: "+ this.courseId);
        System.out.println("Course Name: "+ this.courseName);
    }
    
    
}