package week7homework;
//Write a java program that tells us that Input number is odd or even? HINT: use ternary
//operator (? :)

import java.util.Scanner;


public class Q1week7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number1 = scan.nextInt();
        if (number1 %  2 == 0)
            System.out.println("number is even" + number1);
        else
            System.out.println("Number is odd" + number1);
    }

}
