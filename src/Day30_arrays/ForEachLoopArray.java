package Day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {

        // for each data type we have indexes
        int [] data = {32, 532, 12, 5454, 22, 123, 543, 999, 321, 3};
        for (int eachNum : data) {
            System.out.println(eachNum);
        }
        for (int n : data) {
            System.out.print(n+ " ");
        }
        System.out.println("________________ FOR LOOP ___________");
        // repeat above with for loop
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        // 10 minus 1 = 9
        System.out.println("Last value: " +data[data.length - 1]);

        // print all numbers in same line
        for (int idx = data.length - 1; idx >= 0; idx--) {
            System.out.println(data[idx] + " ");
        }
    }
}
