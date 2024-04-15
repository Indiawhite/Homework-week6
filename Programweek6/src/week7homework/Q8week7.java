package week7homework;
//Write a java program to get numbers from users and print whether it is positive or negative.

import java.util.Scanner;

public class Q8week7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int num1 = scanner.nextInt();

         if (num1>0) {
             System.out.println("number is Positive" + num1);
         } else if (num1 <0) {
             System.out.println(" Number is Negative" + num1);
         } else {
             System.out.println("Number is Zero");

     }

    }

}
