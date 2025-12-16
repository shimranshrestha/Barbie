package Week6;


/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6
{
    public static void main (String[] args){
    
       int[][] m= {{80,75}, {90,50}};
       String[] sub= {"Nepali","English"};
       System.out.println("Student\t"+"Nepali\t"+"English\t");
       for(int i=0; i< m.length; i++){
        System.out.print( "S"+ (i+1) + "\t");
        for (int j=0; j<m[i].length; j++){
        System.out.print(m[i][j] +"\t");
        }
        System.out.println();
        }
        
       System.out.println("\nTotal Marks of Each Student:");
        for (int i = 0; i < m.length; i++) {
            int total = 0;
            for (int j = 0; j < m[i].length; j++) {
                total = total+ m[i][j];
            }
            System.out.println("Student " + (i + 1) + " Total = " + total); 
    }
}
}