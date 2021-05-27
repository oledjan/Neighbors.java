package day34_void_method;

public class StartCheapCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();

    }
    // seatInCar
    public static void seatInCar() {
        System.out.println("1. Open the door and seat in driver seat");
    }
    public static void startTheCar() {
        System.out.println("2. Insert key to ignition, turn clockwise");
    }
    public static void shiftToDrive() {
        System.out.println("3. Press brake, pedal and shift to DRIVE");

    }
    public static void pressGasPedal() {
        System.out.println("4. Hold steering wheel with 2 hands and press gas");
    }

}
