package week7homework;
//Write a Java program to sum values of an array.
public class Q21week7 {

    public static void main(String[] args) {
        int [] sum = {6, 8,3,5,9};
        int number = 0;

        for (int i = 0; i < sum.length; i++) {
             number+= sum[i];
        }
        System.out.println("Sum Values if array: " + number);

        }
}

