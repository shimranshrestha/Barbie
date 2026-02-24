package Week12;
import java.util.*;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TASK_2

{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        names.add("Shimran");
        names.add("Aditya");
        names.add("Sunibha");
        names.add("Himanshi");
        names.add("Ram");
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        for(String arr1 : names){
            System.out.println(arr1);
        }
        for(int arr2 : numbers){
            System.out.println(arr2);
        }
        
        Iterator<String> itr1 = names.iterator();
        Iterator<Integer> itr2 = numbers.iterator();
        
        while(itr1.hasNext()){
            String name = itr1.next();
            System.out.println(name);
        }
        
        while(itr2.hasNext()){
            int num = itr2.next();
            System.out.println(num);
        }
        System.out.println(names.size());
        System.out.println(numbers.size());
        
        numbers.clear();
        
        System.out.println(names.get(2));
        System.out.println(names.get(4));
    }
}
