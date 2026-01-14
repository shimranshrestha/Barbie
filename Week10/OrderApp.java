package Week10;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp {
    public static void main(String[] args) {

        NormalOrder order1 = new NormalOrder(001, "Sunibha", 4000);
        NormalOrder order2 = new NormalOrder(002, "Himanshi", 5500);

        PremiumOrder pOrder1 = new PremiumOrder(01, "Shimran", 7000);
        PremiumOrder pOrder2 = new PremiumOrder(02, "Yangdol", 9000);

        System.out.println(order1);
        System.out.println("Your Final Amount is: " + order1.calculateFinalAmount(300));

        System.out.println(order2);
        System.out.println("Your Final Amount is: " + order2.calculateFinalAmount(500));

        System.out.println(pOrder1);
        System.out.println("Your Final Amount is: " + pOrder1.calculateFinalAmount());

        System.out.println(pOrder2);
        System.out.println("Your Final Amount is: " + pOrder2.calculateFinalAmount());
    }
}