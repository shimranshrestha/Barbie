package Week3;


/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

        import java.util.Scanner;

public class GradeEvaluator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        String isValid= (grade >= 40) ? "Pass" : "Fail";
        System.out.println(isValid);
    
    }
}