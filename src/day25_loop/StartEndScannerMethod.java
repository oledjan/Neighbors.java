package day25_loop;

import java.util.*;
public class StartEndScannerMethod {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
                System.out.println("Enter start and end");

        int start = scan.nextInt();
        int end = scan.nextInt();
        if (start > end) {
            System.out.print("Reverse numbering is not supported");
        }
        for (int i = start; i <= end; i++) {
            System.out.print(i+ " ");
        }


    }
}
