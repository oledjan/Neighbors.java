package day41_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        // cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        // jeep, lada, toyota, mazda,ford, moscvich, tesla
        System.out.println(myCars.toString()); // print all cars
        String allCarsIn1St = myCars.toString(); // saves all cars in 1 string variable


        System.out.println("allCarsIn1St = " + allCarsIn1St);

        // change index 0 to Lamborghini
        myCars.set(0, "lamborghini");

        System.out.println("After SET result printed like this = "+ myCars.toString());

        // change 4 to Honda
        myCars.set(4, "Honda");
        System.out.println("After SET honda = "+ myCars.toString());



        // find index number of "ford"
        System.out.println("index ofg ford = " + myCars.indexOf("ford"));

        int moskvichIndex = myCars.indexOf("moskvich");
        System.out.println("moskvichIndex" + moskvichIndex);

        // change moskvich to jiguli
        myCars.set(moskvichIndex, "jiguli");

        System.out.println("after SET to jiguli = " + myCars);



        // replace ford with trabant using single statement:
        // indexOf("ford"), "trabant"
        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("after set to traban = " + myCars);

        // lada -> bugatti
        /*
        if myCars contains "lada"
        find index of lada and set value to bugatti
        else
        print "lada is not found"
         */
        if (myCars.contains("lada")) {
            myCars.set(myCars.indexOf("lada"), "bugatti");
        }else {
            System.out.println("Lada is not found");
        }
        System.out.println("AFTER SET bugatti = " + myCars.toString());

        /*
        lamborgini -> prius
        lada -> lexus
        traban -> audi
        let's use FOR LOOP

         */
        for (int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("lamborgini")) {
                myCars.set(i, "prius");
                // change to prius
            }else if (myCars.get(i).equals("toyota")) {
                myCars.set(i, "laxus");
            }else if (myCars.get(i).equals("trabant")) {
                myCars.set(i, "audi");

            }
        }





    }
}
