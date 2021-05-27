package Mytyping;

import java.util.Arrays;

public class ArrayQ28 {
    public static void main(String[] args) {
        int [] arr = {1,3,12,5,24,7,9,10};
        boolean [] bArr = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                bArr[i] =true;
            }
        }
        System.out.println(Arrays.toString(bArr));
    }
}
