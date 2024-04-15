package week7homework;
//Write a java program to input any number and find out if it’s odd or even.

import java.util.Scanner;

public class Q7week7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number1 = scan.nextInt();
        if (number1 %  2 == 0)
            System.out.println("number is Even" + number1);
        else
            System.out.println("Number is Odd" + number1);
    }

}




