package week7homework;
//6. A school has FollowingRules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.

import java.util.Scanner;

public class midweekQ6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Marks");
        int Marks = scan.nextInt();

        char grade ;
        if (Marks < 25) {
            grade = 'F';
        } else if ( Marks >= 25 && Marks <45){
            grade = 'E';
        } else if ( Marks >= 45 && Marks < 50){
            grade = 'D';
        } else if ( Marks >=50 && Marks <60 ){
            grade = 'C';
        } else if (Marks >= 60 && Marks < 80){
            grade = 'B';
        } else
            grade = 'A';
        System.out.println("The grade for marks " + Marks + " is: " + grade);


        }


    }

