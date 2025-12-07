package Week5;


/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5
{
     public static void main(String[] args){
        int i;
        int j;
        int k;
        
        for(i=1; i<=5; i++)
        {
            for( j=5; j>=i;j--)
            {
                System.out.print(" ");
        }
        for(k=1; k<=i; k++)
        {
        System.out.print(k);
    }
    System.out.println( );
}

}
}
