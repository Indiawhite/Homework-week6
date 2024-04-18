package week7homework;
//Take input of age of 3 people by user and determine oldest and youngest among
//them.

import java.util.Scanner;

public class midweekQ7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Person age");
        int age1 = scan.nextInt();

        System.out.println("Enter 2nd Person age");
        int age2 = scan.nextInt();

        System.out.println("Enter 3rd Person age");
        int age3 = scan.nextInt();

        if (age1 > age2 && age1 > age3){
            System.out.println("Person age1 is oldest");
        } else if ( age2 > age1 && age2 >age3){
            System.out.println(" person age2 is oldest");
        } else {
            System.out.println("person age3 is oldest");
        }
        if (age1 < age2 && age1 < age3){
            System.out.println("Person age1 is youngest");
        } else if ( age2 < age1 && age2  < age3){
            System.out.println(" person age2 is youngest");
        } else {
            System.out.println("person age3 is youngest");
        }
    }
}
