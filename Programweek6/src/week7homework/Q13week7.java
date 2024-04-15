package week7homework;
//Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
//find addition, Subtraction, multiplication and division according to theirSymbol(using if else)

import java.util.Scanner;

public class Q13week7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scn.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scn.nextDouble();

        System.out.print("Enter the operation symbol (+, -, /, *): ");
        char operation = scn.next().charAt(0);

        double result;

        if (operation == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operation == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operation == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operation symbol.");
        }
    }

}
