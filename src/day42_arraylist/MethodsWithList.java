package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium");
        words.add("a"); words.add("input"); words.add("title");
        //pass the words
        printStrList(words);

        List<Integer> nums = Arrays.asList(23, 54,23,54554, 234, 11, 5, 2);
        int sum = sumIntegerList(nums);
        System.out.println("sum = "+sum);


        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));
    }

    public static void printStrList(List<String> stringList) { // "java", "apple etc
        for (String str : stringList) {



            System.out.print(str+" ");

        }
        System.out.println();


        }
    public static int sumIntegerList(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;




    }


}
