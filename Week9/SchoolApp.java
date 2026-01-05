package Week9;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SchoolApp {
    public static void main(String[] args) {

        // Create Teacher object
        Teacher t1 = new Teacher(1, "Alana", 40000, "Social", 5000);
        System.out.println("Teacher Annual Salary: " + t1.calculateAnnualSalary());

        // Create Staff object
        Staff s1 = new Staff(2, "Everleigh", 120, 300);
        System.out.println("Staff Salary: " + s1.calculateSalary());

        // Print static college name
        System.out.println("College Name: " + Person.collegeName);
    }
}