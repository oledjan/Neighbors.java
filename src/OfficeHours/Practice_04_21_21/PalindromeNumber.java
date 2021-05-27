package OfficeHours.Practice_04_21_21;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(112 % 1);
        System.out.println(112 % 10);
        System.out.println(112 % 100);
        System.out.println(112 % 2);
    }

    public static boolean isPalindrome(int number) {

        while (number != 0) {
            System.out.println("number % 10: " + number % 10);
            number /= 10; // num = num/10 it is same
            System.out.println("number / 10: " + number);
            System.out.println();
        }
        return false;
    }
}
