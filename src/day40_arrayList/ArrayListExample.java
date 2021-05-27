package day40_arrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        // nums.add("java"); //ERROR this is integer
        System.out.println("size = " + nums.size());

        // reading from ARRAY LIST
        System.out.println("index 0 = "+ nums.get(0));
        System.out.println("index 1 = "+ nums.get(1));
        System.out.println("index 2 = "+ nums.get(2));
        // System.out.println("index 3 = "+ nums.get(3)); // exception no 3 size

        // print all values is same line:
        System.out.println(nums); // Arrays.toString(numArray)

        nums.remove(1); // remove element at index 1
        System.out.println(nums);
    }
}
