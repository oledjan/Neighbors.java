package Day30_arrays;

import java.util.Arrays;

public class BinarySearch {
    // binarySearch used just when is arrays is SORTED ALREADY !!!!!
    public static void main(String[] args) {
        int [] nums = {23, 123, 654, 2344, 12345, 14421, 1};
        System.out.println(Arrays.binarySearch(nums, 23)); // will printed 0 index
        System.out.println(Arrays.binarySearch(nums, 2344)); // index 3
        System.out.println(Arrays.binarySearch(nums, 25)); // -2
        System.out.println(Arrays.binarySearch(nums, 700)); // -4
        System.out.println(Arrays.binarySearch(nums, -5));

        //check if number 12345 is among numbers in array
        if(Arrays.binarySearch(nums, 12345) >= 0) {
            System.out.println("12345 is present in array");
        } else {
            System.out.println("12345 is not present");
        }
    }
}
