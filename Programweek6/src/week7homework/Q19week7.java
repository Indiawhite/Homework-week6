package week7homework;
//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”

import java.util.Scanner;

public class Q19week7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number1 = scanner.nextInt();

        if (number1 > 0) {
            System.out.println("number is POSITIVE" + number1);
        } else if (number1 < 0) {
            System.out.println(" Number is NEGATIVE" + number1);
        } else {
            System.out.println("Number is ZERO");

        }
    }
}