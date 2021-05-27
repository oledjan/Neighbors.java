package day08_casting_scanner;
/*
steps to use Scanner class:
1) type on top of class: we need import Scanner class into our class. "import java.util.Scanner;"
import java.util.Scanner;
2) Create Scanner Object using NEW keyword.
"
Scanner scan = new Scanner (System.in);"
3) Ask a questions:  System.out.println ("Please enter your name: ");
4) capture the typed


 */

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println ("Please enter your name: ");
        String firstName = scan.next(); // this is like at google search waiting for questions???
        System.out.println ("Nice to meet you, " + firstName);




    }
}
