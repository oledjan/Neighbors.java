package day35_methods_with_parameters;

public class MethodWithParams {
    public static void main(String[] args) {
        displayValue(1);
        displayValue(94);
        int count = 55;
        displayValue(count); // num = count;
        greetByName ("Saim");
        greetByName("Nadir");
        String name = "Suleyman";
        greetByName(name);
            }
        public static void displayValue(int num) {
            System.out.println("Value is " + num);
        }
        public static void greetByName(String name) {
            System.out.println("Hello "+name+", how are you today?");
        }
    }

