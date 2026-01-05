package Week8;


/**
 * Write a description of class m here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class shoppingapp
{
    public static void main(String[] args)
    {
    shoppingcart s1 = new shoppingcart("Tablet", 50000, 2);
    s1.displaycart();
    System.out.println("Discounted Price: "+s1.calculateDiscountedTotal(10));
    }
}