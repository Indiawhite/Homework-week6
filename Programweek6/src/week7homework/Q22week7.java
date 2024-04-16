package week7homework;
//Write a Java program to calculate the average value of array elements.

public class Q22week7 {
    public static void main(String[] args) {
        int [] sum = {6, 8,3,5,9};
        int number = 0;

        for (int i = 0; i < sum.length; i++) {
            number+= sum[i];
        }
        double average = (double) number / sum.length;

        System.out.println("Average Values if array: " + average);

    }
}

