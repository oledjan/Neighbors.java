package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers (10, 5);
        addNumbers(100, 200, 300);
        addNumbers(23,25,12,41,52,78,2,5,3,1,0,8,90,65,100,70,25);
        addNumbers();
    }
    // VAR-ARGS . . . a lot  used and works only inside method
    // int...myNumber = 10; ERROR
    public static void addNumbers(int... nums) {
        // inside the method, it is used as regular array
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
