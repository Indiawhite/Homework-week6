package week7homework;
//String Method In Java

import java.net.Socket;

public class stringMethodWeek7 {
    public static void main(String[] args) {
        // string length
        String name = "Prem ";
        System.out.println("Length of name :" + name.length());

        // String charAt()
        System.out.println("char index number :" + name.charAt(2));

        // string concat
        String name2 = "Patel";
        System.out.println(" combines of this name:" + name.concat(name2));

        //String contains
        String surname ="Amin";
        System.out.println(surname.contains("mi"));//true
        System.out.println(surname.contains("e"));//false

        //String StartsWith
        System.out.println(surname.startsWith("n")); //false

        //String endWith
        System.out.println(surname.endsWith("n")); //true

        //String equals
        System.out.println(name.equals(name2)); // false

        // String indexOf
        String aboutMe = "I Am Software Tester ";
        System.out.println(aboutMe .indexOf("Am")); //2

        // String empty
        System.out.println(surname.isEmpty()); //false

        //String replace
        String city = "surat, bombay!";
        String replacedString = city.replace('u', 'a');
        System.out.println(replacedString);

        //string substring
        System.out.println(city.substring(0,1));

        //String toCharArray
        char[] myArray = name.toCharArray();
        System.out.println(myArray[2]); //ans-e

        //String toLowerCase
        System.out.println(surname.toLowerCase()); //amin

        //String toUppercase
        System.out.println(surname.toUpperCase()); //AMIN

        //String trim
        String Book = "   Geeta   ";
        System.out.println(Book);
        System.out.println(Book.trim());

    }

    }

