package day28_loops;

import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtuvwxyz0123456789_!@#$%^&*";
        Random random = new Random(); // helps generate random number
        String password = "";

        for (int i =1; i <= 18; i++) {
            int index = random.nextInt(71); // random num 0 - 70
            System.out.print(source.charAt(index));

// add a char to password variable using +=
            // password = password + source.charAt(index));
            // System.out.println(random.nextInt(source.length()));
            password += source.charAt(index);
        }

        System.out.println("\nYour password = " + password);

    }
}
