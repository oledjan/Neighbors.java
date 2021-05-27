package day04_variables_intro;

public class AmazonItem {
    public static void main (String [] args){
        // EXAMPLE FROM AMAZON WOODEN SPOON
       String description = "HIC wooden spoon"; // product name
       int ratingsCount =  181;
        // data typy review 181counts
       double price = 5.99;      // product's price
        String seller = "amazon.com";
        boolean prime = true;     // String prime = "yes";


        System.out.println ("--- PRODUCT INFORMATION ---");
        System.out.println (description);
        System.out.println("* * * * *");
        System.out.println (ratingsCount);
        System.out.println (price);


    }
}
