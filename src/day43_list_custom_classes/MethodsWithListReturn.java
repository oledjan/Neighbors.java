package day43_list_custom_classes;

import java.sql.SQLOutput;
import java.util.*;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        // 1 nanosec = 1_000_000_000 nanoseconds
        long start = System.nanoTime();
        System.out.println(System.nanoTime());
        List<Integer> mlnNums = getIntegerList();
        long end = System.nanoTime();
        System.out.println("ArrayList time = " + (end - start));

        long st = System.nanoTime();

        long en = System.nanoTime();
        double seconds = (en - st) / 1_000_000_000.0;
        System.out.println("Array time = " + (en - st));
        System.out.println("Array time seconds = "+ (en - st));

        //System.out.println("mlnNums = " + mlnNums);
        
    }

    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <=1_000_000; i++) {
            nums.add(i);
        }
        return nums;
    }
    /**
     * getIntegerArray
     * and add to int[] then return that same but we checking with way is faster
     *
     */
    public static int[] getIntegerArray() {
        // declare empty array with size - 1_000_001
        int[] nums = new int[1_000_001];
        // loop and assign numbers
        for (int i =0; i<=1_000_000_1; i++) {
            nums[i]= i;
        }
        return nums;
    }
}
