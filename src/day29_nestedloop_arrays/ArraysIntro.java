package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10; // single variable
        int [] nums = new int[3]; // array variable inside
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        System.out.println("value at index 0 = "+ nums[0]); // index 0
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);


        // how to find out
        System.out.println("numbers of elements = "+nums.length);
        // store length of array into length variable

        int len = nums.length;
        System.out.println("len = " +len);
        // change value at array
        nums[0] = 100; // we can reasign value
        nums[1] = 300;
        nums[2] = nums[1];
        System.out.println("nums[0] ="+ nums[0]);
        System.out.println("nums[1] ="+ nums[1]);
        System.out.println("nums[2] ="+ nums[2]);

    }

}
