package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main (String [] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot  = " + cars);
        cars +=5; // increasing by 5 cars = cars + 5 same thing
        System.out.println("cars in parking lot = " + cars); // cars in parking lot = 17

        // 6 cars left parking lot
                cars -= 6; // same way cars = cars - 6; OPERATION comes 1st then =;

        System.out.println("cars in a parking lot after 6 left = " + cars);

        // cars =- 6; // like minus 6 (-6) regular number;
        System.out.println("cars in a parking lot after 6 left = " + cars);


        int electricCars = 13;
        //cars = cars + electricCars;
        cars+=electricCars;
        System.out.println ("Cars total together with electrical cars = " + cars); //Cars total together with electrical cars = 24


        String word = "Java";
        System.out.println ("word = " + word); // word = Java

        word = word + " programming";
        System.out.println("word = " + word);// word = Javaprogramming

        // add "is fun"
        word += " is fun";
        System.out.println("word = " + word);


        String selenium = " but \"selenium\" is more fun.";
        word += selenium;
        System.out.println ("word = " + word);

        word += 12345; // add 12345 to word
        System.out.println("word = " + word); // word = Java programming is fun but "selenium" is more fun.12345


        char letter ='A'; // when we are using ACII table with special symbols
        System.out.println("letter = " + letter); // letter = A
        letter += 3;
        System.out.println("letter = " + letter);// letter = D
        // add 'J' to letter
        letter += 'J';
        System.out.println("letter = " + letter);

        double parkingFee = 7.50; //normal parking fee = $7.5
        System.out.println("normal parking fee = $" + parkingFee);

        // early bird parking fee is 50 off
        //parkingFee = parkingFee / 2;
        parkingFee /= 2;
        System.out.println("early bird parking Fee = $" + parkingFee); // early bird parking Fee = $3.75

        //weekend parking is free
        parkingFee -= parkingFee; // parkingFee = parkingFee - parkingFee; weekend parking Fee = 0.0
        System.out.println("weekend parking Fee = " + parkingFee);


    }
}
