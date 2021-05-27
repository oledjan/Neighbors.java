package day35_methods_with_parameters;

public class VoidMethod {
    public static void main(String[] args) {

        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
        printAToZ();
        printAToZ();
        for (int i = 0; i < 10; i++) {
            printAToZ();
        }
    }
    public static void printAToZ() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
