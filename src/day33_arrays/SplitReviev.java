package day33_arrays;

import java.util.Arrays;

public class SplitReviev {
    public static void main(String[] args) {
        String word = "ajavajav";
        String[] array = word.split("a");
        System.out.println(array.length); // 2
        int countOfA = array.length -1;
        if (word.endsWith("a")) { // if ends with a, add one more
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);
        System.out.println(" ---Split With Empty String _____");
        String [] strArr = word.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);


// JAVA regular Expression Test
        // - \d - this is mean match any numbers
        // - [A, Z] - match any
        String word2 = "java1sql2ht4ml";
        String[] strArr2 = word2.split("\\d");
        System.out.println(Arrays.toString(strArr2));



        word2 = word2.replaceAll("\\d", "_");
        System.out.println("word2 = "+ word2);

        // check password if match and valid
        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) { // this copied from google
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
