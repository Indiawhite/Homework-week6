package week7homework;
//Input any alphabet from "A" to "F" and print their city name accordingly (use if else) ifany
//other alphabet should be invalid entry.

import java.util.Scanner;

public class Q11week7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("alphabet from 'A' to 'F' ");
        String input = scn.nextLine();
        char alphabet = scn.next().charAt(0);

        String CityName;
        if ( alphabet == 'A'){
            System.out.println("City: Amsterdam");
        }
         else if ( alphabet == 'B'){
            System.out.println("City: Bombay");
        }
        else if (alphabet == 'C'){
            System.out.println("City: Chennai");
        }
        else if(alphabet== 'D'){
            System.out.println("City: Delhi");
        } else if (alphabet == 'E'){
            System.out.println("City: England");
        }
        else if (alphabet== 'F'){
            System.out.println("City: France");
        }
        else {
            System.out.println("Invalid Entry");
        }

    }

}
