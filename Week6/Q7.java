package Week6;


/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{

    public static void main (String[]agrs){
        String [][] seats= {{"Shimran", "Saru", "Sara"}, {"","",""} };
        for (int i=0; i< seats.length; i++){
            for(int j=0;j< seats[i].length; j++){
                if(seats [i][j]==""){
                    System.out.println("[empty}\t");
                }
                else{
                    System.out.print(seats[i][j]+"\t");}
                    
                }
                System.out.println();
                }
            }
        }