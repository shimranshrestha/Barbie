package Week10;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumOrder extends Order {

    public PremiumOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateFinalAmount() {
        return super.calculateFinalAmount() * 0.5;
    }

    public double calculateFinalAmount(double discountAmount) {
        return super.calculateFinalAmount() - discountAmount;
    }
}

