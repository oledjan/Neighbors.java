package day24_loops;

import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secretPincode = 1234;
        int pinCode; // declare here so that visible for while condition! showing error!!!! what is the variable???

        do {
            System.out.println("Enter pin code: ");
            pinCode = scan.nextInt();
        } while (pinCode != secretPincode);

        System.out.println("****** welcome to your account *******");
    }
}
