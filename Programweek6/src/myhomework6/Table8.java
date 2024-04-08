package myhomework6;
//Write a Java program that takes a number as input and prints its multiplication
//table upto 10.
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80

public class Table8 {
    public static void main(String[] args) {
        // Create a Table8 object to read input from the user

        int number = 8; // Replace with your desired number
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%d x %d = %d%n", number, i, result);
        }
    }


}

