package Week6;


/**
 * Write a description of class A here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniBookCorner {
    public static void main(String[] args) {
        String[] bookCategories = {"Fiction", "Nepali"};
        String[][] bookTitles = {{"Asahamati - 5", "Verity"},{"Seto Dharti", "Aama"}};
        double[][] bookPrices = {{750.0, 500.0},{620.0, 450.0}};

        for (int i = 0; i < bookCategories.length; i++) {
            System.out.println(bookCategories[i] + ":");
            for (int j = 0; j < bookTitles[i].length; j++) {
                System.out.println(bookTitles[i][j] + " - Rs " + bookPrices[i][j]);
            }
            System.out.println();
        }
    }
}