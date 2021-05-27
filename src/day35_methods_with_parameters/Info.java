package day35_methods_with_parameters;


import java.util.*;
public class Info {

    public static void main(String[] args) {
        fullName();
        System.out.println("Full name = " + fullName());
        System.out.println("isMarried = " + isMarried());
        System.out.println("age = " + getAge());
        System.out.println("Birth year = " + getRandomYear()); // this one is dynamic, different year each time

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

    }
    public static String fullName() {
        System.out.println("inside fullName method");
        return "Mike Smith";
    }
    public static boolean isMarried () {
        return false;

    }
    public static int getAge () {
        int age = 35;
        return age;
    }
    public static int getRandomYear () {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;

    }
}
