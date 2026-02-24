package Week12;
import java.util.ArrayList;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Student> student= new ArrayList();
        
        student.add(new student("Anjali", 9876543210L, "L1N1"));
        student.add(new student("Rahul", 9876543211L, "L1M1"));
        student.add(new student("Tina", 9876543212L, "L1N2"));
    }
}
for(student std: students){
            System.out.println(std);
        }
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getname().equals("Rahul")){
            Students.get(i).setgroup("L1N2");
            break;
        }
        }
         for(student std: students){
            System.out.println(std);
        }
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getname().equals("Ayush")){
                students.get(i).setname("Aayush");
                break;
            }
            
        }
         for(student std: students){
            System.out.println(std);
        }
    }
}