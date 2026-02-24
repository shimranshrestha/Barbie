package Week11;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rice extends crop implements transportable
{
    public rice(String cropName, String season, int landArea){
        super(cropName, season, landArea);
    }
        
        @Override 
        public double calculateYield(){
            return getlandArea() * 4000;
        }
        @Override
        public double calculateWaterRequirement(){
            return getlandArea() * 120000;
        }
        @Override
        public double calculateTransportCost(){
            return calculateYield() *  3;
        }
        @Override
        public String getTransportMethod(){
            return "Tractor";
        }
}