package OfficeHours.Practice_03_31_2021;

public class CountJava2 {
    public static void main (String[] args) {

        String str = "java is fun. java class today, not javascript";
        int count = 0;

        for (int i=0; i < str.length()-3; i++) {

            // str.substring(0, 4)
            // str.substring(1, 5)
            // str.substring(2, 6)

            String eachFourLetter = str.substring(i, i+4);
            if (eachFourLetter.equals("java")) {
                count++;
                System.out.println(eachFourLetter);
            }
        }
        System.out.println(count);
    }

}