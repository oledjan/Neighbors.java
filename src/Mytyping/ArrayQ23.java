package Mytyping;

import java.util.Arrays;

public class ArrayQ23 {
    public static void main(String[] args) {
        int []nums = new int[5];
        int a = 5;
                nums[2]=a;
                nums[0]=a*2;
                nums[4] = nums[1]*1;
                nums[1]= nums[2];
                nums[3] = nums[a-3];
        System.out.println(Arrays.toString(nums));

    }
}
