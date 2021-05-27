package day18_conditions_pracrice_string_intro;

public class CarLeasingTest {
    public static void main(String[] args) {

        String make = "Mercedes";
        String model = "E";
        double LeasePrice = 0.0;

//        if (make.equals("Mercedes") && model.equals("E")) {
  //          LeasePrice = 500.0;
    //    } else if (make.equals("Mercedes") && model.equals("A")) {
      //      LeasePrice = 400.0;
    //   }

        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                LeasePrice = 500.0;
            } else if (model.equals("A")) {
                LeasePrice = 400.0;
            }
        } else {
            System.out.println("Invalid make");
            return; // exit program / exit main method
        }
        System.out.println("Make:  " + make);
        System.out.println("Model: " + model);
        System.out.println("Lease Price is: " + LeasePrice);


    }
}
