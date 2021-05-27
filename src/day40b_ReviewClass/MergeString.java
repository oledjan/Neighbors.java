package day40b_ReviewClass;

public class MergeString {
            public static void main(String[] args) {
            String one = "java";
            String two = "is";
            String output = "";
            int longerWord = 0;
            if (one.length() > two.length()) {
                longerWord = one.length();
            } else {
                longerWord = two.length();
            }
            for (int i = 0, j = 0; i < longerWord; i++, j++) {
                if (i != one.length() && i < one.length()) {
                    output += "" + one.charAt(i);
                }
                if (j != two.length() && j < two.length()) {
                    output += "" + two.charAt(j);
                }
            }
            System.out.println(output);
        }
    }

