package week7homework;
//Print multiplication table of 24, 50 and 29 using loop.

public class midweekQ2 {
    public static void main(String[] args) {
        System.out.println("multiplication table 24");
        int number = 24;
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(" 24 * " + number + i  + "=" + result);
        }
        System.out.println();
        System.out.println("multiplication table 50");
        int number2 = 50;
        for (int i = 1; i <= 10; i++) {
            int result = number2 * i;
            System.out.println(" 50 * " + number2 + i  + "=" + result);
        }
        System.out.println();
        System.out.println("multiplication table 29");
        int number3 = 29;
        for (int i = 1; i <= 10; i++) {
            int result = number3 * i;
            System.out.println(" 24 * " + number3 + i  + "=" + result);
        }




    }
}
