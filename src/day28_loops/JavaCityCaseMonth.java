package day28_loops;

public class JavaCityCaseMonth {
    public static void main(String[] args) {

        int totalCases = 0;
        for (int day = 1; day <= 30; day++) {
            if (day % 7 == 0) { // sunday more cases
                totalCases += 500;
            } else {
                totalCases += 200; // every sunday more cases
                System.out.println("Day " + day + " | total cases : " + totalCases);
            }

        }
        System.out.println("March 2021 Total Cases: " + totalCases);
    }
}
