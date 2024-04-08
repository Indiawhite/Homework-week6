package myhomework6;
//Write a Java program to print the result of the following operations.
        //Test Data: a. -5 + 8 * 6
        //b. (55+9) % 9
        //c. 20 + -3*5 / 8
        //d. 5 + 15 / 3 * 2 - 8 % 3

       // Expected Output : 43
       // 1
       // 19
       // 13

public class Mutlinumbers {
    public static void main(String[] args) {
        // a. -5 + 8 * 6
        int resultA = -5 + 8 * 6;

        // b. (55+9) % 9
        int resultB = (55 + 9) % 9;

        // c. 20 + -3*5 / 8
        int resultC = 20 + -3 * 5 / 8;

        // d. 5 + 15 / 3 * 2 - 8 % 3
        int resultD = 5 + 15 / 3 * 2 - 8 % 3;

        // Print the results
        System.out.println("Result of -5 + 8 * 6 is: " + resultA);
        System.out.println("Result of (55+9) % 9 is: " + resultB);
        System.out.println("Result of 20 + -3*5 / 8 is: " + resultC);
        System.out.println("Result of 5 + 15 / 3 * 2 - 8 % 3 is: " + resultD);
    }
}
