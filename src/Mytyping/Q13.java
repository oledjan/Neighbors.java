package Mytyping;

public class Q13 {
    public static void main(String[] args) {
        int num = 5;
        while (num < 100){
            num += num;
            System.out.println(num); // result Infinite loop
        }
    }
}
