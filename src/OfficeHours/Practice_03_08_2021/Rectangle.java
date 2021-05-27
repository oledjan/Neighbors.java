package OfficeHours.Practice_03_08_2021;
import java.util.Scanner;
// PIC: import
/*
- calculate properties of rectangle
- calculate the area 2*(w*l)
- Print properties
- Modify to accept Scanner inputs

 */
public class Rectangle {
    public static void main(String[] args) {

        // HARD CODED Values

      //  double length = 5;
        // double width = 3;
        // dinamic with SCANNER

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your length: ");

        double length = input.nextInt();
        System.out.println("Enter your width: ");
        double width = input.nextInt ();


        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}
