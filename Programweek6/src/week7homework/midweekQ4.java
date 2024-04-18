package week7homework;
//Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;

public class midweekQ4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of a rectangle");
        double length = scan .nextDouble();

        System.out.println("Enter length breadth");
        double breadth = scan.nextDouble();

        if (length == breadth){
            System.out.println(" It is square");
        } else {
            System.out.println("It is rectangle");

        }

    }
}
