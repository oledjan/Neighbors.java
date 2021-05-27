package day20_string_manipulation;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class StringIsEmpty {
    public static void main (String[] args) {
        String jobTitle = "";
        System.out.println (jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);

        if (jobTitle.isEmpty()) {
            System.out.println("JobTitle is missing, please resend");
        } else {
            System.out.println("Job title looks good");
        }
        if (jobTitle.length() == 0) {
            System.out.println("jobTitle is empty");
        } else {
            System.out.println("Job title is not empty");
        }

        System.out.println(jobTitle.equals(" "));

        if ("".equals(jobTitle)) {
            System.out.println("Job is empty");

        } else {
            System.out.println("job is not empty");
        }
        String word = " ";
        System.out.println(word.isEmpty()); // false
        System.out.println(word.length()); // 1. blank space is a character


        String veggie = "carrots";
        System.out.println(veggie.isEmpty()); // false
        // check if veggie is not empty. print we
        if (!veggie.isEmpty()) {
            System.out.println("we have " + veggie);
        }

       // String word2;

        // ERROR NO



    }
}
