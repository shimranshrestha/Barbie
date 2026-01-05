package Week9;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Staff extends Person {
    int workingHours;
    double ratePerHour;

    // Constructor
    Staff(int id, String name, int workingHours, double ratePerHour) {
        super(id, name, 0); // basicSalary not needed
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    // Staff salary method
    double calculateSalary() {
        return workingHours * ratePerHour;
    }
}