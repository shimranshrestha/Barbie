package Week16;


/**
 * Write a description of class q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question7

{ public static boolean isValidPhone(String phone) {
        return phone.matches("^(98|97)[0-9]{8}$");
    }

    public static void main(String[] args) {

        System.out.println(isValidPhone("9841234567")); // true
        System.out.println(isValidPhone("1234567890")); // false
        System.out.println(isValidPhone("98412345"));   // false
        System.out.println(isValidPhone("98-412-345")); // false
    }
}