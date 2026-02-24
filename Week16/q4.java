package Week16;


/**
 * Write a description of class q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q4
{
    public static void main(String[] args){
 String name= " sAndesh pAUDel "; // Sandesh Paudel 
 String trimmedString= name.trim(); // sAndesh pAUDel
 
String[] words= trimmedString.split("\\s+"); // [”sAndesh”, “pAUDel”]
StringBuilder sb= new StringBuilder () ;

for (String word: words)
{
 String first= word. substring(0,1). toUpperCase(); //s
 String rest= word. substring(1). toLowerCase(); // andesh
 sb. append (first). append (rest). append (" ");
}
 System.out.println(sb);
}
}