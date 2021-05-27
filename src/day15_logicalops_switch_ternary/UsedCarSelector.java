package day15_logicalops_switch_ternary;

/**
 * add new java class UsedCarSelector
 * add main method
 *
 * Car dealership:
 *
 * budget = 5000
 * model -> "Toyota" , "Honda" ,"Tesla"
 * carPrice = 4500
 * using If condition with logical operators, decide if you would like
 * to purchase the car.
 *
 * 1 - needs to be within budget
 *     AND
 * 2 - needs to be "Toyota" OR "Honda" OR "Tesla"
 */
public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5000.0;
        String model = "Honda";
        double carPrice = 7999.0;

        if (carPrice <= budget && (model.equals("Toyota") || model.equals("Honda") || (model.equals ("Saab")))) {
            System.out.println("Ready to purchase model = " + model + " price = " + carPrice);
        } else {
            System.out.println("Not interested in model = " + model + ", for this OVER price = " + carPrice);
        }
    }
}
