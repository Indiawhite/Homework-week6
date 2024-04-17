package week7homework;
//Write a java program to input student Name, roll No, and three subjects Math, Science and English
//marks (marks is between '0' to '100' and if it is out of range print error message InvalidInput, Marks
//should between '0' to '100') and find out total, percentage and result.
//If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format

import java.util.Scanner;

public class Q5week7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Name");
        String name = scan.nextLine();

        System.out.println("Enter Roll no");
        int Number = scan.nextInt();

        System.out.println("Enter Marks in Maths , Science, English");
        int Maths = scan.nextInt();
        int Science = scan.nextInt();
        int English = scan.nextInt();

        if (Maths < 0 || Maths >100 || Science <0 || Science >100 || English <0 || English >100 ){
            System.out.println("Invalid Input! Marks should be between 0 and 100.");
            return;
        }
        int totalMarks = Maths + Science + English;
        double percentage = (totalMarks / 300.0) * 100;

        String result = (percentage >= 35) ? "Pass" : "Fail";

        String grade;
        if (percentage >= 35) {
            result = "Pass";
            if (percentage >= 80)
                grade = "A+";
            else if (percentage >= 60)
                grade = "A";
            else if (percentage >= 50)
                grade = "B";
            else
                grade = "C";
        } else {
            result = "Fail";
            grade = "N/A";
        }
        System.out.println("|_________________________________________________ |");
        System.out.println("|                   Mark Sheet                     |");
        System.out.println("|_________________________________________________ |");
        System.out.println("|Name       : " + name +                          "|");
        System.out.println("|Roll No    : " + Number +                        "|");
        System.out.println("                                                    ");
        System.out.println("|                                                  |");
        System.out.println("|_________________________________________________ |");
        System.out.println("|Subject    :      Marks                           |");
        System.out.println("|Maths      :" + Maths +                          "|");
        System.out.println("|Science    :" + Science +                        "|");
        System.out.println("|English    :" + English +                        "|");
        System.out.println("                                                    ");
        System.out.println("|_________________________________________________ |");
        System.out.println("|Total      :" + totalMarks +                     "|");
        System.out.println("|_________________________________________________ |");
        System.out.printf(" |Percentage : %.2f%%\n", percentage                  );
        System.out.println("|Result     : " + result  +                       "|");
        System.out.println("|Grade      :"  + grade   +                       "|");
        System.out.println("|__________________________________________________|");


    }
}
