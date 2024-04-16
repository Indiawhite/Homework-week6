package week7homework;
//Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Q15week7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value");
        char input = scan.next().charAt(0);

        if (input >='a' && input <='z') {
            System.out.println("Input is alphabet");
        }else if (input >='0' && input <='5'){
            System.out.println("Input is a number.");
        }else {
            System.out.println("Input is symbol");
        }




    }
}
