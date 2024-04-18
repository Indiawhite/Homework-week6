package week7homework;
//A student will not be allowed to sit in exam if his/her Attendence is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.

import java.util.Scanner;

public class midweekQ8Q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter totalClasses held");
        int totalClasses = scan.nextInt();

        System.out.println("Enter totalClasses attended");
        int attendedClasses = scan.nextInt();

        double attendedPercentage = (double) attendedClasses/totalClasses * 100;
        System.out.println("AttendedPercentage :" + attendedPercentage+ "%" );
         if (attendedPercentage >= 75){
             System.out.println("Student allow to sit in exam");
         } else
             System.out.println("Student not allow to sit in exam");

         // Q=9 allow student to sit if he/she has medical cause. Ask
        //user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

        if (attendedPercentage >=75){
            System.out.println("Student allow to sit in exam");
        } else
            System.out.println("Student have medical condition Y/N ?");
           char medicalCondition = scan.next().charAt(0);

           if (medicalCondition == 'Y' || medicalCondition == 'y'){
               System.out.println(" Student allow sit in exam with medicalCondition");
        } else
               System.out.println(" Student not allow sit in exam ");

    }
}
