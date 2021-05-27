package day41_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    // asList another method in Array class.
    // It will convert an array to arraylist
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);
        
        // nums.add(100);// UnsupportedOperationException
        // nums.remove(0);// UnsupportedOperationException
        // nums.clear();// UnsupportedOperationException
        
        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println("numsList = " + numsList);

        /**
         * List String drinksWithCaffeine -> coffee,
         * tea, monster,
         * red bull, coke,
         * pepsi, mdew, kambucha, celsius
         * int caffeineAmount = 0;
         * monster, red bull
         *
         */
        List<String> drinksWithCaffeine = new ArrayList<> (Arrays.asList("coffee",
                "tea", "monster", "red bull", "coke",
                "pepsi", "mdew", "kambucha", "celsius" ));
        System.out.println(drinksWithCaffeine);

        int caffeineAmount = 0;
        for (String drink : drinksWithCaffeine) {
            if (drink.equals("monster") || drink.equals("red bull") ||drink.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(drink + " --> " + caffeineAmount);
            }else if (drink.equals("coffee") || drink.equals("kambucha")) {
                caffeineAmount = 122;
                System.out.println(drink +" => " + caffeineAmount);
            } else if (drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("mdew")){
                caffeineAmount = 35;
                System.out.println(drink + " --> "+ caffeineAmount);
            }
        }

        // switch LOOP
        for (String drink : drinksWithCaffeine) {
            switch (drink) {
                case "monster" : case "red bull" : case "celsius" :
                    caffeineAmount = 150;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
                //case : "coffee"
            }
        }
    }
}
