package day13_conditional__statements;

import java.sql.SQLOutput;

/*
add new class ATMPincodeProgram
main method
print "**** WELCOME TO TD BANK ATM ****"
secretPincode => ****
inputPincode => ****

if condition checks if secretPincode equals inputPincode
    true:
        "Welcome to your account."
        "You can withdraw, check balance, deposit"
    false:
        "Incorrect pincode! 1234"
        "Please try again."
print "Thank you for using TD Bank ATM!"
 */
public class AtmPinCodeProgram {
    public static void main(String[] args) {
        System.out.println();
        System.out.println (" ******** WELCOME TO THE TD BANK ATM *********");
        int secretPincode = 2233;
        int inputPincode = 2233;

        if (secretPincode > inputPincode) {
            System.out.println("Welocme to your account!");
            System.out.println("You can withdraw, check your balance, deposit");
        } else {
            System.out.println("Incorect pincode!" + inputPincode);
            System.out.println ("Please try again!");
        }

    }
}
