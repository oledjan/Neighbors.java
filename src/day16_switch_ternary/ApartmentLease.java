package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        System.out.println("######## Welcome to ADAIRE APARTMENTS ###########");
        int numberOfBedrooms = 2;
        double startingPrice = 0;


        switch (numberOfBedrooms) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454.0;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725.0;
                break;
            case 2:
                System.out.println("Two bedroom apt selected");
                startingPrice = 1725.0;
                break;
            default:
                System.out.println(numberOfBedrooms + " Bedrooms currently unavailable ");
        }
        System.out.println("Starting price: $" + startingPrice);

    }
}
