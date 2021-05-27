package day41_Arraylist;

import java.util.ArrayList;

public class Citieslist {
    public static void main(String[] args) {
        // declare arraylist
        ArrayList<String> cities = new ArrayList<>();
        // add cities to arraylist -> add method
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Viena");
        cities.add("Adana");
        cities.add("LA");
        // add ashgabat to first
        cities.add(0, "Ashgabat");// o to the beginner
        // print all value in same line
        System.out.println(cities);

        // print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));
        //
        System.out.println("last city = " + cities.get(cities.size()-1));
// print count of items in arraylist
        System.out.println("count of items = " + cities.size());
        int size = cities.size();
        System.out.println("there are" + size + "cities in the list");
        // for loop and print all values in same line
        for (int i = 0; i< cities.size()/2; i++) {
            System.out.println(cities.get(i)+" ");
        }
        System.out.println();

        // for each loop
        for (String city : cities) {
            System.out.println(city + " ");
        }

        // delete item from arraylist
        // remove using index. delete value at index 3
        cities.remove (3);
        // 2) remove using object/value
        cities.remove("New York");

        System.out.println("after remove = " + cities);

        // delete/remove all value from list

        cities.clear();
        // make sure it is clear
        // 1) print/spit it out
        System.out.println("cities = " + cities);

        //2) using isEmpty
        if (cities.isEmpty()) {
            System.out.println("list is empty");
            // 3) check size () ==0
            if (cities.size() ==0) {
                System.out.println("LIST is EMPTY");
            }


        }



    }
}
