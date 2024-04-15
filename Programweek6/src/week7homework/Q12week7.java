package week7homework;

import java.util.Scanner;

public class Q12week7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter characters between A to F :");
        String city = sc.nextLine();




        switch (city){
            case "A":
                System.out.println("Ajmer");
                break;
            case "B'":
                System.out.println("Baroda");
                break;
            case "C":
                System.out.println("Surat");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("England");
                break;
            case "F":
                System.out.println("France");
            default:
                System.out.println("INVALID DATA");
        }
    }

}
