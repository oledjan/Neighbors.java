package day25_loop;

public class PrintStars {
    public static void main(String[] args) {

        for (int stars = 1;
             stars <= 15;
             stars++) {
            System.out.print(" * ");
        }
        System.out.println();
        String myStars = "";
        // for LOOP: fill 5 stars to mystars variable
        for (int stars = 1; stars <= 5; stars++) {
            myStars += "* ";

        }
        System.out.println("My stars = " + myStars.trim()); // * * * * *

    }
}
