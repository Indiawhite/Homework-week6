package week7homework;
//Take 10 integers from keyboard using loop and print their average value on the
//screen.

import java.util.Scanner;

public class midweekQ1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 0;

        System.out.println("Enter average value");
        for (int i = 0; i < 10 ;i++ ){
            System.out.println("Enter average value " + (i + 1) + ":" );

            int number = scan.nextInt();
            value +=number;

            double average = value/10;
            System.out.println("The average of the 10 integers is: " + average);




        }

    }
}
