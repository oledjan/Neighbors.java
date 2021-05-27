package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i")); // true
        System.out.println(company.contains("ital")); // true
        System.out.println(company.contains("l o")); // true


        System.out.println(company.contains("J")); // false
        // if company contains space, print "company name with multiple words"
        // else "
        if (company.contains(" ")) {
            System.out.println("multiple words company name");
        }


        String etsyTitle = "Wooden spoon | Etsy";
        if (etsyTitle.contains(" | ")) {
            System.out.println("Pass  - title check passed");
        } else {
            System.out.println("Pass  - title check passed");


// other
            String firstName = "ahmed";
            // check
            if (firstName.contains("a") && firstName.contains("e")) {
                System.out.println("both a && e are present");
            } else {
                System.out.println("a || e not present");
            }

            // other ex
            firstName = "Nadir";
            if (firstName.contains("a") || firstName.contains("i")) {
            } else {
                System.out.println("");
            }

            // how to check email
            String email = "murodil@cybertekschool.com";

            if (email.contains("@") && email.endsWith(".com")) {
                System.out.println("Valid email");
            } else {
                System.out.println("Invalid email");
            }

            if (email.toLowerCase().contains("d")) {
                System.out.println("d is present");
            } else {
                System.out.println();
            }


        }



    }
}
