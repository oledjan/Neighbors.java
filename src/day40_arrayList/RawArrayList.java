package day40_arrayList;

import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
       // declare raw arrayList
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();

        // add values
        // raw type included all dataTYPE string, int, boolean
        list1.add("java");
        list1.add("apple");
        list1.add("coffee");
        list1.add(1234);
        list1.add(55.2);
        list1.add(true);
        list1.add("wooden spoon");

        System.out.println(list1);
        System.out.println("size = " + list1.size());




    }
}
