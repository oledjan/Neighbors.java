package day37_methods_overloading;

public class OverLoadMainMethod {
    public static void main(String[] args) {
        System.out.println("Hello frOM REAL MAIN Method");
        main(10);


    }
/**
 * overloading main method:
 * same name + different parameters
 * JDK doesn't look for this one to run
 */
    public static void main (int num) {
        System.out.println("num = " + num);
    }
}
