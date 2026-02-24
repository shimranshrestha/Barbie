package Week16;


/**
 * Write a description of class xjbxb here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student {
    private String name;
    private int age;
    private String school;
    private int grade;
    private String citizenship;
    private String phone;

    public Student(String name, int age, String school, int grade, String citizenship, String phone) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.grade = grade;
        this.citizenship = citizenship;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }

    public int getGrade() {
        return grade;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public String getPhone() {
        return phone;
    }
    
    public String getNameInitials() {
    String[] splitSection = name.split(" ");
    String singleInitial = "";
    for (String ini : splitSection) {
        singleInitial += ini.charAt(0) + ".";
    }
    return singleInitial.toUpperCase();
}
    
     @Override
    public String toString() {
        return String.format("%s | %d | Grade %d | %s", name, age, grade, school);
    }
}