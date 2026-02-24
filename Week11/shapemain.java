package Week11;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class shapemain
{
    public static void main (String[] args)
    {
        shape[] shapes = new shape[2];
        
        shapes[0] = new rectangle(3, 4);
        shapes[1] = new circle(4);
        
        for(int i = 0; i < 2 ; i++){
            shapes[i].displayShapeInfo();
        }
    }
}