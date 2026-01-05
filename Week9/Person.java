package Week9;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Person {
    int id;
    String name;
    double basicSalary;
    static String collegeName = "ABC College";

    // Constructor
    Person(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to calculate annual salary
    double calculateAnnualSalary() {
        return basicSalary * 12;
    }
}