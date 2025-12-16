package Week6;


/**
 * Write a description of class jvgh here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week6Tutorial
{

    public static void main(String[] args){
        int[] age; //declariing an array
        age= new int [5]; //constructing an array
        System.out.println(age.length); // finding length of arrray
        
        //firstIndex=0, LastIndex= agee.length-1= 5-1=4
        
        age[0]=10;
        age[1]=20;
        age[2]=30;
        age[3]=40;
        age[4]=50;
        
        int[] agr ={5,10,15,20,25}; //all in one
        System.out.println(agr.length); //5
        System.out.println(agr[0]); //5
        
         for( int i=0; i< agr.length; i++)
    {
            System.out.println(agr[i]);
        }
        
        
    for( int i=agr.length-1; i>=0; i--)
    {
            System.out.println(agr[i]);
        }
        
        
    int sum=0;
    
    for( int i=0; i< agr.lengtth; i++)
    {
            sum=sum+agr[i];
        }
            System.out.println(sum);
         
         
         
         //2D Array
         
         int[][] matrix= {  {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}  };
         System.out.println(matric.length); //length=4, index= length-1
         
        for(int i=0; i< matrix.length; i++)
         {
             System.ou.println(matrix[i]);
         }
         
         
        for(int i=0; i< matrix.length; i++)
         {
              for(int j=0; j< matrix[i].length; j++)
              {
                  System.out.print(matrix[i][j]);
              }
             
             System.ou.println();
         }
         
         
         
         
        
        
        
}