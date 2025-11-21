package Week2;

public class AusadhiPasal{
    public static void main(String[] args){
        
        String med1EnglishName = "Ibuprofen";
        String med1NepaliName = "आइबुप्रोफेन";
        double med1PricePerTablet = 15.0;
        int med1StockQuantity = 300;
        String med1Prescription = "N";

        String med2EnglishName = "Aspirin";
        String med2NepaliName = "एस्पिरिन";
        double med2PricePerTablet = 20.0;
        int med2StockQuantity = 400;
        String med2Prescription = "N";
        
        String med3EnglishName = "Metformin";
        String med3NepaliName = "मेटफोर्मिन";
        double med3PricePerTablet = 30.0;
        int med3StockQuantity = 400;
        String med3Prescription = "Y";
    
        String line = "====================================";

        System.out.println(line);
        System.out.println("             Aushadhi Pasal");
        System.out.println("                औषध पसल");
        System.out.println(line);
        System.out.println();

        System.out.println(line);
        System.out.println("            Inventory Report");
        System.out.println("              सूची प्रतिवेदन");
        System.out.println(line);
        System.out.println("- " + med1EnglishName + " (" + med1NepaliName + ") | Rs. " + med1PricePerTablet +
                           " | Stock: " + med1StockQuantity + " | Prescription Required: " + med1Prescription);
        System.out.println("- " + med2EnglishName + " (" + med2NepaliName + ") | Rs. " + med2PricePerTablet +
                           " | Stock: " + med2StockQuantity + " | Prescription Required: " + med2Prescription);
        System.out.println("- " + med3EnglishName + " (" + med3NepaliName + ") | Rs. " + med3PricePerTablet +
                           " | Stock: " + med3StockQuantity + " | Prescription Required: " + med3Prescription);
        System.out.println(line);
        System.out.println();

        System.out.println(line);
        System.out.println("          Medicine Information");
        System.out.println("              औषधि विवरण");
        System.out.println(line);
        System.out.println("- " + med1EnglishName + " (" + med1NepaliName + ") | " + med2EnglishName + " (" + med2NepaliName + ") | " + med3EnglishName + " (" + med3NepaliName + ") ");
        System.out.println("- Price: " + med1PricePerTablet + " | Price: " + med2PricePerTablet + " | Price: " + med3PricePerTablet);
        System.out.println("- Stock: " + med1StockQuantity + " | Stock: " + med2StockQuantity + " | Stock: " + med3StockQuantity);
        System.out.println("- Prescription: " + med1Prescription + " | Prescription: " + med2Prescription + " | Prescription: " + med3Prescription);
        System.out.println(line);
        System.out.println();

        System.out.println(line);
        System.out.println("          Location & Contact");
        System.out.println("              स्थान र सम्पर्क");
        System.out.println(line);
        System.out.println("- Location: Kathmandu, Nepal");
        System.out.println("- Contact: 98010089000");
        System.out.println(line);
        System.out.println();

        System.out.println(line);
        System.out.println("        Thank you for visiting!");
        System.out.println(line);
    }
}
