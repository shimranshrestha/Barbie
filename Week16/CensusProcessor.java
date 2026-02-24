package Week16;


/**
 * Write a description of class xjx here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CensusProcessor {
    
    static String[] csvData = {"Name,Age,School,Grade,Citizenship,Phone",
                            "Ram Bahadur Thapa,18,Itahari Int. College,12,01-0012345,9841234567",
                            "Sita Kumari Rai,17,Itahari Int. College,11,01-0054321,9807654321",
                            "Hari Prasad Sharma,19,ICK College,12,02-0098765,9812345678",
                            "Gita Devi Tamang,16,ICP College,10,03-0011111,9800000000",
                            "Bikash Kumar Limbu,18,Itahari Int. College,12,01-0077777,9841111111",
                            "Anita Rai,17,ICK College,11,04-002222,981234",
                            "Deepak Shah,20,ICP College,12,01-00ABCDE,9867890123"};
                            
    public static Student[] parseCSV(String[] csvData) {

        Student[] students = new Student[csvData.length - 1]; 

        for (int i = 1; i < csvData.length; i++) {

            String[] data = csvData[i].split(",");

            String name = data[0].trim();
            int age = Integer.parseInt(data[1].trim());
            String school = data[2].trim();
            int grade = Integer.parseInt(data[3].trim());
            String citizenship = data[4].trim();
            String phone = data[5].trim();

            students[i - 1] = new Student(name, age, school, grade, citizenship, phone);
        }

        return students;
    }
    
    public static boolean isValidCitizenship(String cit) {

        if (cit.length() != 10) {
            return false;
        }
    
        if (cit.charAt(2) != '-') {
            return false;
        }
    
        for (int i = 0; i < 2; i++) {
            if (!Character.isDigit(cit.charAt(i))) {
                return false;
            }
        }
    
        for (int i = 3; i < 10; i++) {
            if (!Character.isDigit(cit.charAt(i))) {
                return false;
            }
        }
    
        return true;
    }
    
    public static Student[] findBySchool(Student[] students, String school) {
        int count = 0;
        for (Student s : students) {
            if (s.getSchool().equalsIgnoreCase(school)) {
                count++;
            }
        }

        Student[] result = new Student[count];
        int index = 0;
        for (Student s : students) {
            if (s.getSchool().equalsIgnoreCase(school)) {
                result[index++] = s;
            }
        }

        return result;
    }
    
    public static int countByGrade(Student[] students, int grade) {
        int count = 0;
        for (Student s : students) {
            if (s.getGrade() == grade) {
                count++;
            }
        }
        return count;
    }
    
    public static double averageAge(Student[] students) {
        int sum = 0;
        for (Student s : students) {
            sum += s.getAge();
        }
        return (double) sum / students.length;
    }
    
    public static Student findLongestName(Student[] students) {
        Student longestName = students[0];
        for (Student s : students) {
            if (s.getName().length() > longestName.getName().length()) {
                longestName = s;
            }
        }
        return longestName;
    }
    
    public static String generateCensusReport(Student[] students) {
        StringBuilder sb = new StringBuilder();

        int valid = 0, invalid = 0;
        for (Student s : students) {
            if (isValidCitizenship(s.getCitizenship())) valid++;
            else invalid++;
        }

        sb.append("===== Nepal School Census Report =====\n");
        sb.append("Total students: ").append(students.length).append("    Valid records: ").append(valid).append("    Invalid: ").append(invalid).append("\n\n");
        sb.append("=========== Student List =========\n");
        for (Student s : students) {
            String initials = s.getNameInitials();
            String status = isValidCitizenship(s.getCitizenship()) ? "VALID" : "INVALID";
            sb.append(String.format("%-5s %-20s | %2d | Grade %2d | %s\n",initials, s.getName(), s.getAge(), s.getGrade(), status));
        }
    
        sb.append("\n=========== Statistics =========\n");
        sb.append(String.format("Average age: %.1f\n", averageAge(students)));

        Student longest = findLongestName(students);
        sb.append("Longest name: ").append(longest.getName()).append(" (").append(longest.getName().length()).append(" chars)\n");
        sb.append("Itahari Int. College: ").append(findBySchool(students, "Itahari Int. College").length).append(" students\n");

        return sb.toString();
    }

    
    public static void main(String[] args) {

        Student[] students = parseCSV(csvData);
        System.out.println(generateCensusReport(students));
    }

}
    
                            