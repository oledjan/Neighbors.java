package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        // Moscow or Tampa
        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering - " + city);
        }

        // OTHER EXAMPLE
        String teacher = "Nadir";
        // Saim, Murodil -> it is a java class
        // otherwise -> Soft skill class with Nadir
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("it is a java class " + teacher);
        } else {
            System.out.println("Soft skill class with - " + teacher);
        }

        // 1 -
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("Java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);

        } else {
            System.out.println("Some other class with " + teacher);
        }


        //======================================================
        // OTHER EXAMPLE / other REQUIREMENT
        // company - "Google" OR salary >= 100k -> accept offer
        String company = "Google";
        double salary = 85_000.0;
        if (company.equals("Google") || salary >=100_000.0) {
            System.out.println("Accepting offer from " + company);
        }else {
            System.out.println("Rejecting offer from " + company);
        }
    }


}
