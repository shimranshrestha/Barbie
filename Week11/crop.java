package Week11;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class crop
{
    private String cropName;
    private String season;
    private int landArea;
    
    public crop(String cropName, String season, int landArea)
    {
        this.cropName= cropName;
        this.season=season;
        this.landArea= landArea;
    }
    
    public String getcropName()
    {
        return this.cropName;
    }
    
    public void setcropName()
    {
        this.cropName=cropName;
    }
    
    public String getseason()
    {
        return this.season;
    }
    
    public void setseason()
    {
        this.season=season;
    }
    
    public int getlandArea()
    {
        return this.landArea;
    }
    
    public void setbreadth()
    {
        this.landArea=landArea;
    }
    
    public abstract double calculateYield();
    public abstract double calculateWaterRequirement();
    
    public void displayCropInfo(){
        System.out.println("Yield"+calculateYield());
        System.out.println("Water Requirement:"+calculateWaterRequirement());
    }
}