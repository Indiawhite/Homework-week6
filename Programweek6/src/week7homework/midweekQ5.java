package week7homework;
//Take two int values from user and print greatest among them.

import java.util.Scanner;

public class midweekQ5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first value");
        int number1 = scan.nextInt();
        System.out.println("Enter second  value");
        int number2 = scan.nextInt();

        if (number1 == number2) {
            System.out.println("both Number is equal");
        } else if (number1 > number2){
            System.out.println("Number1 is bigger then number 2");
        } else
            System.out.println("number2 is bigger then Number 1 ");

    }
}
