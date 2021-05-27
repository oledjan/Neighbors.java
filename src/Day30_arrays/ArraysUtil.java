package Day30_arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int [] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        System.out.println(Arrays.toString(nums));


        // sort nums
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println(("min value: " + nums[0]));
        System.out.println("max value: " + nums[nums.length-1]);


        //Arrays.sort(nums, Collections.reverseOrder());
        String [] words = {"java", "C#", "C++", "KotLin", "Python", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words)); // print in one line
        System.out.println("["+String.join(", ", words)+"]");



        // sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        // sort words in reverse
        Arrays.sort(words, Collections.reverseOrder()); // for collection need import ----> import java.util.Collections;
        System.out.println(Arrays.toString(words));
    }
}
