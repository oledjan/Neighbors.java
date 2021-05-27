package Day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        String [] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-543-1234";

        // 2nd way how you do array when you know all info
        String [] student2 = {"MK4421", "Mike", "Bloomberg", "B22", "703-432-1234"};

        System.out.println("student id = "+ student1[0]);
        System.out.println("student1 first Name = "+ student1[1]);
        System.out.println("student1 last Name = "+ student1 [2]);
        System.out.println("student1 Batch number = "+ student1[3]);
        System.out.println("student1 student mobile number = "+ student1 [4]);
        System.out.println("student data length: " + student1.length);

        // check if student1 data array contains 5 items.
        // true: pass: array has correct length
        // false: fail: has incorrect length

        if (student1.length == 5) {
            System.out.println("PASS: array has correct length");
        } else{
            System.out.println("FAIL: has incorrect length");
        }                   //"Adam" --> ADAM            space   Smith --> SMITH
        System.out.println((student1[1].toUpperCase() + " " + student1[2].toUpperCase()));


        // read mobile from array and store into variable
        String mobileNum = student1[4];
        System.out.println(mobileNum.startsWith("204")); // false we don't have number 204

    }
}
